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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
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
import java.util.Collections;
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

// typedef: indices.cancel_migrate_reindex.Request

/**
 * Cancel a migration reindex operation.
 * <p>
 * Cancel a migration reindex attempt for a data stream or index.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#indices.cancel_migrate_reindex.Request">API
 *      specification</a>
 */

public class CancelMigrateReindexRequest extends RequestBase {
	private final List<String> index;

	// ---------------------------------------------------------------------------------------------

	private CancelMigrateReindexRequest(Builder builder) {

		this.index = ApiTypeHelper.unmodifiableRequired(builder.index, this, "index");

	}

	public static CancelMigrateReindexRequest of(Function<Builder, ObjectBuilder<CancelMigrateReindexRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The index or data stream name
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CancelMigrateReindexRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CancelMigrateReindexRequest> {
		private List<String> index;

		/**
		 * Required - The index or data stream name
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>index</code>.
		 */
		public final Builder index(List<String> list) {
			this.index = _listAddAll(this.index, list);
			return this;
		}

		/**
		 * Required - The index or data stream name
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds one or more values to <code>index</code>.
		 */
		public final Builder index(String value, String... values) {
			this.index = _listAdd(this.index, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CancelMigrateReindexRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CancelMigrateReindexRequest build() {
			_checkSingleUse();

			return new CancelMigrateReindexRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.cancel_migrate_reindex}".
	 */
	public static final Endpoint<CancelMigrateReindexRequest, CancelMigrateReindexResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.cancel_migrate_reindex",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_migration");
					buf.append("/reindex");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_cancel");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					params.put("index", request.index.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, CancelMigrateReindexResponse._DESERIALIZER);
}
