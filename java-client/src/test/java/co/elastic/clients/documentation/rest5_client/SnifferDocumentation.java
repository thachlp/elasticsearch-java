/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.documentation.rest5_client;

import org.apache.hc.core5.http.HttpHost;
import co.elastic.clients.transport.rest5_client.low_level.Node;
import co.elastic.clients.transport.rest5_client.low_level.Rest5Client;
import co.elastic.clients.transport.rest5_client.low_level.sniffer.ElasticsearchNodesSniffer;
import co.elastic.clients.transport.rest5_client.low_level.sniffer.NodesSniffer;
import co.elastic.clients.transport.rest5_client.low_level.sniffer.SniffOnFailureListener;
import co.elastic.clients.transport.rest5_client.low_level.sniffer.Sniffer;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * This class is used to generate the Java low-level REST client documentation.
 * You need to wrap your code between two tags like:
 * // tag::example[]
 * // end::example[]
 *
 * Where example is your tag name.
 *
 * Then in the documentation, you can extract what is between tag and end tags with
 * ["source","java",subs="attributes,callouts,macros"]
 * --------------------------------------------------
 * include-tagged::{doc-tests}/SnifferDocumentation.java[example]
 * --------------------------------------------------
 *
 * Note that this is not a test class as we are only interested in testing that docs snippets compile. We don't want
 * to send requests to a node and we don't even have the tools to do it.
 */
@SuppressWarnings("unused")
public class SnifferDocumentation {

    @SuppressWarnings("unused")
    public void usage() throws IOException, URISyntaxException {
        {
            //tag::sniffer-init
            Rest5Client restClient = Rest5Client
                .builder(HttpHost.create("http://localhost:9200"))
                .build();

            Sniffer sniffer = Sniffer.builder(restClient).build();
            //end::sniffer-init

            //tag::sniffer-close
            sniffer.close();
            restClient.close();
            //end::sniffer-close
        }
        {
            //tag::sniffer-interval
            Rest5Client restClient = Rest5Client
                .builder(new HttpHost("localhost", 9200))
                .build();

            Sniffer sniffer = Sniffer.builder(restClient)
                .setSniffIntervalMillis(60000).build();
            //end::sniffer-interval
        }
        {
            //tag::sniff-on-failure
            SniffOnFailureListener sniffOnFailureListener =
                new SniffOnFailureListener();

            Rest5Client restClient = Rest5Client
                .builder(new HttpHost("localhost", 9200))
                .setFailureListener(sniffOnFailureListener) // <1>
                .build();

            Sniffer sniffer = Sniffer.builder(restClient)
                .setSniffAfterFailureDelayMillis(30000) // <2>
                .build();

            sniffOnFailureListener.setSniffer(sniffer); // <3>
            //end::sniff-on-failure
        }
        {
            //tag::sniffer-https
            Rest5Client restClient = Rest5Client.builder(
                    new HttpHost("localhost", 9200))
                    .build();

            NodesSniffer nodesSniffer = new ElasticsearchNodesSniffer(
                    restClient,
                    ElasticsearchNodesSniffer.DEFAULT_SNIFF_REQUEST_TIMEOUT,
                    ElasticsearchNodesSniffer.Scheme.HTTPS
            );

            Sniffer sniffer = Sniffer.builder(restClient)
                    .setNodesSniffer(nodesSniffer).build();
            //end::sniffer-https
        }
        {
            //tag::sniff-request-timeout
            Rest5Client restClient = Rest5Client.builder(
                new HttpHost("localhost", 9200))
                .build();

            NodesSniffer nodesSniffer = new ElasticsearchNodesSniffer(
                restClient,
                TimeUnit.SECONDS.toMillis(5),
                ElasticsearchNodesSniffer.Scheme.HTTP
            );

            Sniffer sniffer = Sniffer.builder(restClient)
                .setNodesSniffer(nodesSniffer).build();
            //end::sniff-request-timeout
        }
        {
            //tag::custom-nodes-sniffer
            Rest5Client restClient = Rest5Client
                .builder(URI.create("http://localhost:9200"))
                .build();

            NodesSniffer nodesSniffer = new NodesSniffer() {
                @Override
                public List<Node> sniff() throws IOException {
                    return null; // <1>
                }
            };

            Sniffer sniffer = Sniffer.builder(restClient)
                .setNodesSniffer(nodesSniffer).build();
            //end::custom-nodes-sniffer
        }
    }
}
