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

package co.elastic.clients.elasticsearch.connector;

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

// typedef: connector.sync_job_check_in.Request

/**
 * Check in a connector sync job. Check in a connector sync job and set the
 * <code>last_seen</code> field to the current time before updating it in the
 * internal index.
 * <p>
 * To sync data using self-managed connectors, you need to deploy the Elastic
 * connector service on your own infrastructure. This service runs automatically
 * on Elastic Cloud for Elastic managed connectors.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#connector.sync_job_check_in.Request">API
 *      specification</a>
 */

public class SyncJobCheckInRequest extends RequestBase {
	private final String connectorSyncJobId;

	// ---------------------------------------------------------------------------------------------

	private SyncJobCheckInRequest(Builder builder) {

		this.connectorSyncJobId = ApiTypeHelper.requireNonNull(builder.connectorSyncJobId, this, "connectorSyncJobId");

	}

	public static SyncJobCheckInRequest of(Function<Builder, ObjectBuilder<SyncJobCheckInRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The unique identifier of the connector sync job to be checked in.
	 * <p>
	 * API name: {@code connector_sync_job_id}
	 */
	public final String connectorSyncJobId() {
		return this.connectorSyncJobId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SyncJobCheckInRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SyncJobCheckInRequest> {
		private String connectorSyncJobId;

		/**
		 * Required - The unique identifier of the connector sync job to be checked in.
		 * <p>
		 * API name: {@code connector_sync_job_id}
		 */
		public final Builder connectorSyncJobId(String value) {
			this.connectorSyncJobId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SyncJobCheckInRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SyncJobCheckInRequest build() {
			_checkSingleUse();

			return new SyncJobCheckInRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code connector.sync_job_check_in}".
	 */
	public static final Endpoint<SyncJobCheckInRequest, SyncJobCheckInResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/connector.sync_job_check_in",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _connectorSyncJobId = 1 << 0;

				int propsSet = 0;

				propsSet |= _connectorSyncJobId;

				if (propsSet == (_connectorSyncJobId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_connector");
					buf.append("/_sync_job");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.connectorSyncJobId, buf);
					buf.append("/_check_in");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _connectorSyncJobId = 1 << 0;

				int propsSet = 0;

				propsSet |= _connectorSyncJobId;

				if (propsSet == (_connectorSyncJobId)) {
					params.put("connectorSyncJobId", request.connectorSyncJobId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, SyncJobCheckInResponse._DESERIALIZER);
}
