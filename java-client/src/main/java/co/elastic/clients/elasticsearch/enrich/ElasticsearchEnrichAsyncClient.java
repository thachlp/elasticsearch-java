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

package co.elastic.clients.elasticsearch.enrich;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.util.concurrent.CompletableFuture;
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
 * Client for the enrich namespace.
 */
public class ElasticsearchEnrichAsyncClient extends ApiClient<ElasticsearchTransport, ElasticsearchEnrichAsyncClient> {

	public ElasticsearchEnrichAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchEnrichAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchEnrichAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchEnrichAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: enrich.delete_policy

	/**
	 * Delete an enrich policy. Deletes an existing enrich policy and its enrich
	 * index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-enrich-delete-policy">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeletePolicyResponse> deletePolicy(DeletePolicyRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeletePolicyRequest, DeletePolicyResponse, ErrorResponse> endpoint = (JsonEndpoint<DeletePolicyRequest, DeletePolicyResponse, ErrorResponse>) DeletePolicyRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete an enrich policy. Deletes an existing enrich policy and its enrich
	 * index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeletePolicyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-enrich-delete-policy">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeletePolicyResponse> deletePolicy(
			Function<DeletePolicyRequest.Builder, ObjectBuilder<DeletePolicyRequest>> fn) {
		return deletePolicy(fn.apply(new DeletePolicyRequest.Builder()).build());
	}

	// ----- Endpoint: enrich.execute_policy

	/**
	 * Run an enrich policy. Create the enrich index for an existing enrich policy.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-enrich-execute-policy">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ExecutePolicyResponse> executePolicy(ExecutePolicyRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ExecutePolicyRequest, ExecutePolicyResponse, ErrorResponse> endpoint = (JsonEndpoint<ExecutePolicyRequest, ExecutePolicyResponse, ErrorResponse>) ExecutePolicyRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Run an enrich policy. Create the enrich index for an existing enrich policy.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExecutePolicyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-enrich-execute-policy">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ExecutePolicyResponse> executePolicy(
			Function<ExecutePolicyRequest.Builder, ObjectBuilder<ExecutePolicyRequest>> fn) {
		return executePolicy(fn.apply(new ExecutePolicyRequest.Builder()).build());
	}

	// ----- Endpoint: enrich.get_policy

	/**
	 * Get an enrich policy. Returns information about an enrich policy.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-enrich-get-policy">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetPolicyResponse> getPolicy(GetPolicyRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetPolicyRequest, GetPolicyResponse, ErrorResponse> endpoint = (JsonEndpoint<GetPolicyRequest, GetPolicyResponse, ErrorResponse>) GetPolicyRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get an enrich policy. Returns information about an enrich policy.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetPolicyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-enrich-get-policy">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetPolicyResponse> getPolicy(
			Function<GetPolicyRequest.Builder, ObjectBuilder<GetPolicyRequest>> fn) {
		return getPolicy(fn.apply(new GetPolicyRequest.Builder()).build());
	}

	/**
	 * Get an enrich policy. Returns information about an enrich policy.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-enrich-get-policy">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetPolicyResponse> getPolicy() {
		return this.transport.performRequestAsync(new GetPolicyRequest.Builder().build(), GetPolicyRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: enrich.put_policy

	/**
	 * Create an enrich policy. Creates an enrich policy.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-enrich-put-policy">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutPolicyResponse> putPolicy(PutPolicyRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutPolicyRequest, PutPolicyResponse, ErrorResponse> endpoint = (JsonEndpoint<PutPolicyRequest, PutPolicyResponse, ErrorResponse>) PutPolicyRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create an enrich policy. Creates an enrich policy.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutPolicyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-enrich-put-policy">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutPolicyResponse> putPolicy(
			Function<PutPolicyRequest.Builder, ObjectBuilder<PutPolicyRequest>> fn) {
		return putPolicy(fn.apply(new PutPolicyRequest.Builder()).build());
	}

	// ----- Endpoint: enrich.stats

	/**
	 * Get enrich stats. Returns enrich coordinator statistics and information about
	 * enrich policies that are currently executing.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-enrich-stats">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<EnrichStatsResponse> stats(EnrichStatsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<EnrichStatsRequest, EnrichStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<EnrichStatsRequest, EnrichStatsResponse, ErrorResponse>) EnrichStatsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get enrich stats. Returns enrich coordinator statistics and information about
	 * enrich policies that are currently executing.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link EnrichStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-enrich-stats">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<EnrichStatsResponse> stats(
			Function<EnrichStatsRequest.Builder, ObjectBuilder<EnrichStatsRequest>> fn) {
		return stats(fn.apply(new EnrichStatsRequest.Builder()).build());
	}

	/**
	 * Get enrich stats. Returns enrich coordinator statistics and information about
	 * enrich policies that are currently executing.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-enrich-stats">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<EnrichStatsResponse> stats() {
		return this.transport.performRequestAsync(new EnrichStatsRequest.Builder().build(),
				EnrichStatsRequest._ENDPOINT, this.transportOptions);
	}

}
