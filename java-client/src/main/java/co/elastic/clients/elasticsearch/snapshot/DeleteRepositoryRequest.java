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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
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

// typedef: snapshot.delete_repository.Request

/**
 * Delete snapshot repositories. When a repository is unregistered,
 * Elasticsearch removes only the reference to the location where the repository
 * is storing the snapshots. The snapshots themselves are left untouched and in
 * place.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#snapshot.delete_repository.Request">API
 *      specification</a>
 */

public class DeleteRepositoryRequest extends RequestBase {
	@Nullable
	private final Time masterTimeout;

	private final List<String> name;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private DeleteRepositoryRequest(Builder builder) {

		this.masterTimeout = builder.masterTimeout;
		this.name = ApiTypeHelper.unmodifiableRequired(builder.name, this, "name");
		this.timeout = builder.timeout;

	}

	public static DeleteRepositoryRequest of(Function<Builder, ObjectBuilder<DeleteRepositoryRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The period to wait for the master node. If the master node is not available
	 * before the timeout expires, the request fails and returns an error. To
	 * indicate that the request should never timeout, set it to <code>-1</code>.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Required - The ame of the snapshot repositories to unregister. Wildcard
	 * (<code>*</code>) patterns are supported.
	 * <p>
	 * API name: {@code repository}
	 */
	public final List<String> name() {
		return this.name;
	}

	/**
	 * The period to wait for a response from all relevant nodes in the cluster
	 * after updating the cluster metadata. If no response is received before the
	 * timeout expires, the cluster metadata update still applies but the response
	 * will indicate that it was not completely acknowledged. To indicate that the
	 * request should never timeout, set it to <code>-1</code>.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteRepositoryRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteRepositoryRequest> {
		@Nullable
		private Time masterTimeout;

		private List<String> name;

		@Nullable
		private Time timeout;

		/**
		 * The period to wait for the master node. If the master node is not available
		 * before the timeout expires, the request fails and returns an error. To
		 * indicate that the request should never timeout, set it to <code>-1</code>.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * The period to wait for the master node. If the master node is not available
		 * before the timeout expires, the request fails and returns an error. To
		 * indicate that the request should never timeout, set it to <code>-1</code>.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The ame of the snapshot repositories to unregister. Wildcard
		 * (<code>*</code>) patterns are supported.
		 * <p>
		 * API name: {@code repository}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>name</code>.
		 */
		public final Builder name(List<String> list) {
			this.name = _listAddAll(this.name, list);
			return this;
		}

		/**
		 * Required - The ame of the snapshot repositories to unregister. Wildcard
		 * (<code>*</code>) patterns are supported.
		 * <p>
		 * API name: {@code repository}
		 * <p>
		 * Adds one or more values to <code>name</code>.
		 */
		public final Builder name(String value, String... values) {
			this.name = _listAdd(this.name, value, values);
			return this;
		}

		/**
		 * The period to wait for a response from all relevant nodes in the cluster
		 * after updating the cluster metadata. If no response is received before the
		 * timeout expires, the cluster metadata update still applies but the response
		 * will indicate that it was not completely acknowledged. To indicate that the
		 * request should never timeout, set it to <code>-1</code>.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The period to wait for a response from all relevant nodes in the cluster
		 * after updating the cluster metadata. If no response is received before the
		 * timeout expires, the cluster metadata update still applies but the response
		 * will indicate that it was not completely acknowledged. To indicate that the
		 * request should never timeout, set it to <code>-1</code>.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteRepositoryRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteRepositoryRequest build() {
			_checkSingleUse();

			return new DeleteRepositoryRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code snapshot.delete_repository}".
	 */
	public static final Endpoint<DeleteRepositoryRequest, DeleteRepositoryResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/snapshot.delete_repository",

			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_snapshot");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					params.put("name", request.name.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, DeleteRepositoryResponse._DESERIALIZER);
}
