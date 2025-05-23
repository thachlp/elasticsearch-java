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

package co.elastic.clients.elasticsearch.migration;

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
 * Client for the migration namespace.
 */
public class ElasticsearchMigrationAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchMigrationAsyncClient> {

	public ElasticsearchMigrationAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchMigrationAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchMigrationAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchMigrationAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: migration.deprecations

	/**
	 * Get deprecation information. Get information about different cluster, node,
	 * and index level settings that use deprecated features that will be removed or
	 * changed in the next major version.
	 * <p>
	 * TIP: This APIs is designed for indirect use by the Upgrade Assistant. You are
	 * strongly recommended to use the Upgrade Assistant.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-migration-deprecations">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeprecationsResponse> deprecations(DeprecationsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeprecationsRequest, DeprecationsResponse, ErrorResponse> endpoint = (JsonEndpoint<DeprecationsRequest, DeprecationsResponse, ErrorResponse>) DeprecationsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get deprecation information. Get information about different cluster, node,
	 * and index level settings that use deprecated features that will be removed or
	 * changed in the next major version.
	 * <p>
	 * TIP: This APIs is designed for indirect use by the Upgrade Assistant. You are
	 * strongly recommended to use the Upgrade Assistant.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeprecationsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-migration-deprecations">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeprecationsResponse> deprecations(
			Function<DeprecationsRequest.Builder, ObjectBuilder<DeprecationsRequest>> fn) {
		return deprecations(fn.apply(new DeprecationsRequest.Builder()).build());
	}

	/**
	 * Get deprecation information. Get information about different cluster, node,
	 * and index level settings that use deprecated features that will be removed or
	 * changed in the next major version.
	 * <p>
	 * TIP: This APIs is designed for indirect use by the Upgrade Assistant. You are
	 * strongly recommended to use the Upgrade Assistant.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-migration-deprecations">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeprecationsResponse> deprecations() {
		return this.transport.performRequestAsync(new DeprecationsRequest.Builder().build(),
				DeprecationsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: migration.get_feature_upgrade_status

	/**
	 * Get feature migration information. Version upgrades sometimes require changes
	 * to how features store configuration information and data in system indices.
	 * Check which features need to be migrated and the status of any migrations
	 * that are in progress.
	 * <p>
	 * TIP: This API is designed for indirect use by the Upgrade Assistant. You are
	 * strongly recommended to use the Upgrade Assistant.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-migration-get-feature-upgrade-status">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<GetFeatureUpgradeStatusResponse> getFeatureUpgradeStatus() {
		return this.transport.performRequestAsync(GetFeatureUpgradeStatusRequest._INSTANCE,
				GetFeatureUpgradeStatusRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: migration.post_feature_upgrade

	/**
	 * Start the feature migration. Version upgrades sometimes require changes to
	 * how features store configuration information and data in system indices. This
	 * API starts the automatic migration process.
	 * <p>
	 * Some functionality might be temporarily unavailable during the migration
	 * process.
	 * <p>
	 * TIP: The API is designed for indirect use by the Upgrade Assistant. We
	 * strongly recommend you use the Upgrade Assistant.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-migration-get-feature-upgrade-status">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<PostFeatureUpgradeResponse> postFeatureUpgrade() {
		return this.transport.performRequestAsync(PostFeatureUpgradeRequest._INSTANCE,
				PostFeatureUpgradeRequest._ENDPOINT, this.transportOptions);
	}

}
