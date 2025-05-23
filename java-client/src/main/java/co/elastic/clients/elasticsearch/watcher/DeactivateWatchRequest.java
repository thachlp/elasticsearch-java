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

package co.elastic.clients.elasticsearch.watcher;

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
import java.util.Map;
import java.util.Objects;
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

// typedef: watcher.deactivate_watch.Request

/**
 * Deactivate a watch. A watch can be either active or inactive.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher.deactivate_watch.Request">API
 *      specification</a>
 */

public class DeactivateWatchRequest extends RequestBase {
	private final String watchId;

	// ---------------------------------------------------------------------------------------------

	private DeactivateWatchRequest(Builder builder) {

		this.watchId = ApiTypeHelper.requireNonNull(builder.watchId, this, "watchId");

	}

	public static DeactivateWatchRequest of(Function<Builder, ObjectBuilder<DeactivateWatchRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The watch identifier.
	 * <p>
	 * API name: {@code watch_id}
	 */
	public final String watchId() {
		return this.watchId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeactivateWatchRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeactivateWatchRequest> {
		private String watchId;

		/**
		 * Required - The watch identifier.
		 * <p>
		 * API name: {@code watch_id}
		 */
		public final Builder watchId(String value) {
			this.watchId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeactivateWatchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeactivateWatchRequest build() {
			_checkSingleUse();

			return new DeactivateWatchRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code watcher.deactivate_watch}".
	 */
	public static final Endpoint<DeactivateWatchRequest, DeactivateWatchResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/watcher.deactivate_watch",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _watchId = 1 << 0;

				int propsSet = 0;

				propsSet |= _watchId;

				if (propsSet == (_watchId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_watcher");
					buf.append("/watch");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.watchId, buf);
					buf.append("/_deactivate");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _watchId = 1 << 0;

				int propsSet = 0;

				propsSet |= _watchId;

				if (propsSet == (_watchId)) {
					params.put("watchId", request.watchId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, DeactivateWatchResponse._DESERIALIZER);
}
