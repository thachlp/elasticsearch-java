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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
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

// typedef: security.create_cross_cluster_api_key.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security.create_cross_cluster_api_key.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class CreateCrossClusterApiKeyResponse implements JsonpSerializable {
	private final String apiKey;

	@Nullable
	private final Long expiration;

	private final String id;

	private final String name;

	private final String encoded;

	// ---------------------------------------------------------------------------------------------

	private CreateCrossClusterApiKeyResponse(Builder builder) {

		this.apiKey = ApiTypeHelper.requireNonNull(builder.apiKey, this, "apiKey");
		this.expiration = builder.expiration;
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.encoded = ApiTypeHelper.requireNonNull(builder.encoded, this, "encoded");

	}

	public static CreateCrossClusterApiKeyResponse of(
			Function<Builder, ObjectBuilder<CreateCrossClusterApiKeyResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Generated API key.
	 * <p>
	 * API name: {@code api_key}
	 */
	public final String apiKey() {
		return this.apiKey;
	}

	/**
	 * Expiration in milliseconds for the API key.
	 * <p>
	 * API name: {@code expiration}
	 */
	@Nullable
	public final Long expiration() {
		return this.expiration;
	}

	/**
	 * Required - Unique ID for this API key.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - Specifies the name for this API key.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API key credentials which is the base64-encoding of the UTF-8
	 * representation of <code>id</code> and <code>api_key</code> joined by a colon
	 * (<code>:</code>).
	 * <p>
	 * API name: {@code encoded}
	 */
	public final String encoded() {
		return this.encoded;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("api_key");
		generator.write(this.apiKey);

		if (this.expiration != null) {
			generator.writeKey("expiration");
			generator.write(this.expiration);

		}
		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("encoded");
		generator.write(this.encoded);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateCrossClusterApiKeyResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<CreateCrossClusterApiKeyResponse> {
		private String apiKey;

		@Nullable
		private Long expiration;

		private String id;

		private String name;

		private String encoded;

		/**
		 * Required - Generated API key.
		 * <p>
		 * API name: {@code api_key}
		 */
		public final Builder apiKey(String value) {
			this.apiKey = value;
			return this;
		}

		/**
		 * Expiration in milliseconds for the API key.
		 * <p>
		 * API name: {@code expiration}
		 */
		public final Builder expiration(@Nullable Long value) {
			this.expiration = value;
			return this;
		}

		/**
		 * Required - Unique ID for this API key.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - Specifies the name for this API key.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API key credentials which is the base64-encoding of the UTF-8
		 * representation of <code>id</code> and <code>api_key</code> joined by a colon
		 * (<code>:</code>).
		 * <p>
		 * API name: {@code encoded}
		 */
		public final Builder encoded(String value) {
			this.encoded = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CreateCrossClusterApiKeyResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateCrossClusterApiKeyResponse build() {
			_checkSingleUse();

			return new CreateCrossClusterApiKeyResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CreateCrossClusterApiKeyResponse}
	 */
	public static final JsonpDeserializer<CreateCrossClusterApiKeyResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CreateCrossClusterApiKeyResponse::setupCreateCrossClusterApiKeyResponseDeserializer);

	protected static void setupCreateCrossClusterApiKeyResponseDeserializer(
			ObjectDeserializer<CreateCrossClusterApiKeyResponse.Builder> op) {

		op.add(Builder::apiKey, JsonpDeserializer.stringDeserializer(), "api_key");
		op.add(Builder::expiration, JsonpDeserializer.longDeserializer(), "expiration");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::encoded, JsonpDeserializer.stringDeserializer(), "encoded");

	}

}
