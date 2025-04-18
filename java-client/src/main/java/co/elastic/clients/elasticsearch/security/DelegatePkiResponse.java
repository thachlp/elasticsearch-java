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

import co.elastic.clients.elasticsearch.security.delegate_pki.Authentication;
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

// typedef: security.delegate_pki.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#security.delegate_pki.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class DelegatePkiResponse implements JsonpSerializable {
	private final String accessToken;

	private final long expiresIn;

	private final String type;

	@Nullable
	private final Authentication authentication;

	// ---------------------------------------------------------------------------------------------

	private DelegatePkiResponse(Builder builder) {

		this.accessToken = ApiTypeHelper.requireNonNull(builder.accessToken, this, "accessToken");
		this.expiresIn = ApiTypeHelper.requireNonNull(builder.expiresIn, this, "expiresIn", 0);
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.authentication = builder.authentication;

	}

	public static DelegatePkiResponse of(Function<Builder, ObjectBuilder<DelegatePkiResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - An access token associated with the subject distinguished name of
	 * the client's certificate.
	 * <p>
	 * API name: {@code access_token}
	 */
	public final String accessToken() {
		return this.accessToken;
	}

	/**
	 * Required - The amount of time (in seconds) before the token expires.
	 * <p>
	 * API name: {@code expires_in}
	 */
	public final long expiresIn() {
		return this.expiresIn;
	}

	/**
	 * Required - The type of token.
	 * <p>
	 * API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * API name: {@code authentication}
	 */
	@Nullable
	public final Authentication authentication() {
		return this.authentication;
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

		generator.writeKey("access_token");
		generator.write(this.accessToken);

		generator.writeKey("expires_in");
		generator.write(this.expiresIn);

		generator.writeKey("type");
		generator.write(this.type);

		if (this.authentication != null) {
			generator.writeKey("authentication");
			this.authentication.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DelegatePkiResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DelegatePkiResponse> {
		private String accessToken;

		private Long expiresIn;

		private String type;

		@Nullable
		private Authentication authentication;

		/**
		 * Required - An access token associated with the subject distinguished name of
		 * the client's certificate.
		 * <p>
		 * API name: {@code access_token}
		 */
		public final Builder accessToken(String value) {
			this.accessToken = value;
			return this;
		}

		/**
		 * Required - The amount of time (in seconds) before the token expires.
		 * <p>
		 * API name: {@code expires_in}
		 */
		public final Builder expiresIn(long value) {
			this.expiresIn = value;
			return this;
		}

		/**
		 * Required - The type of token.
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code authentication}
		 */
		public final Builder authentication(@Nullable Authentication value) {
			this.authentication = value;
			return this;
		}

		/**
		 * API name: {@code authentication}
		 */
		public final Builder authentication(Function<Authentication.Builder, ObjectBuilder<Authentication>> fn) {
			return this.authentication(fn.apply(new Authentication.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DelegatePkiResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DelegatePkiResponse build() {
			_checkSingleUse();

			return new DelegatePkiResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DelegatePkiResponse}
	 */
	public static final JsonpDeserializer<DelegatePkiResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DelegatePkiResponse::setupDelegatePkiResponseDeserializer);

	protected static void setupDelegatePkiResponseDeserializer(ObjectDeserializer<DelegatePkiResponse.Builder> op) {

		op.add(Builder::accessToken, JsonpDeserializer.stringDeserializer(), "access_token");
		op.add(Builder::expiresIn, JsonpDeserializer.longDeserializer(), "expires_in");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::authentication, Authentication._DESERIALIZER, "authentication");

	}

}
