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

package co.elastic.clients.elasticsearch.esql;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._helpers.esql.EsqlAdapter;
import co.elastic.clients.elasticsearch._helpers.esql.EsqlHelper;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.endpoints.BinaryResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

/**
 * Client for the esql namespace.
 */
public class ElasticsearchEsqlClient extends ApiClient<ElasticsearchTransport, ElasticsearchEsqlClient> {

	public ElasticsearchEsqlClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchEsqlClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchEsqlClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchEsqlClient(this.transport, transportOptions);
	}

	// ----- Endpoint: esql.query

	/**
	 * Run an ES|QL query. Get search results for an ES|QL (Elasticsearch query
	 * language) query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/explore-analyze/query-filter/languages/esql-rest">Documentation
	 *      on elastic.co</a>
	 */

	public BinaryResponse query(QueryRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<QueryRequest, BinaryResponse, ErrorResponse> endpoint = (Endpoint<QueryRequest, BinaryResponse, ErrorResponse>) QueryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Run an ES|QL query. Get search results for an ES|QL (Elasticsearch query
	 * language) query.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link QueryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/explore-analyze/query-filter/languages/esql-rest">Documentation
	 *      on elastic.co</a>
	 */

	public final BinaryResponse query(Function<QueryRequest.Builder, ObjectBuilder<QueryRequest>> fn)
			throws IOException, ElasticsearchException {
		return query(fn.apply(new QueryRequest.Builder()).build());
	}

	/**
	 * Executes an ES|QL request and adapts its result to a target type.
	 *
	 * @param adapter
	 *            the ES|QL response adapter
	 * @param query
	 *            the ES|QL query
	 * @param parameters
	 *            values for query parameters, if any
	 */
	public final <T> T query(EsqlAdapter<T> adapter, String query, Object... parameters)
			throws IOException, ElasticsearchException {
		return EsqlHelper.query(this, adapter, query, parameters);
	}

	/**
	 * Executes an ES|QL request and adapts its result to a target type.
	 *
	 * @param adapter
	 *            the ES|QL response adapter
	 * @param request
	 *            the ES|QL request
	 */
	public final <T> T query(EsqlAdapter<T> adapter, QueryRequest request) throws IOException, ElasticsearchException {
		return EsqlHelper.query(this, adapter, request);
	}

	/**
	 * Executes an ES|QL request and adapts its result to a target type.
	 *
	 * @param adapter
	 *            the ES|QL response adapter
	 * @param fn
	 *            the ES|QL request builder
	 */
	public final <T> T query(EsqlAdapter<T> adapter, Function<QueryRequest.Builder, ObjectBuilder<QueryRequest>> fn)
			throws IOException, ElasticsearchException {
		return query(adapter, fn.apply(new QueryRequest.Builder()).build());
	}

}
