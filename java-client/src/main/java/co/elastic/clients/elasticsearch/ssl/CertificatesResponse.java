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

package co.elastic.clients.elasticsearch.ssl;

import co.elastic.clients.elasticsearch.ssl.certificates.CertificateInformation;
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
import jakarta.json.stream.JsonParser;
import java.util.List;
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

// typedef: ssl.certificates.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ssl.certificates.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class CertificatesResponse implements JsonpSerializable {
	private final List<CertificateInformation> certificates;

	// ---------------------------------------------------------------------------------------------

	private CertificatesResponse(Builder builder) {

		this.certificates = ApiTypeHelper.unmodifiableRequired(builder.certificates, this, "certificates");

	}

	public static CertificatesResponse of(Function<Builder, ObjectBuilder<CertificatesResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 */
	public final List<CertificateInformation> certificates() {
		return this.certificates;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (CertificateInformation item0 : this.certificates) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CertificatesResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<CertificatesResponse> {
		private List<CertificateInformation> certificates;

		/**
		 * Required - Response value.
		 * <p>
		 * Adds all elements of <code>list</code> to <code>certificates</code>.
		 */
		public final Builder certificates(List<CertificateInformation> list) {
			this.certificates = _listAddAll(this.certificates, list);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds one or more values to <code>certificates</code>.
		 */
		public final Builder certificates(CertificateInformation value, CertificateInformation... values) {
			this.certificates = _listAdd(this.certificates, value, values);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds a value to <code>certificates</code> using a builder lambda.
		 */
		public final Builder certificates(
				Function<CertificateInformation.Builder, ObjectBuilder<CertificateInformation>> fn) {
			return certificates(fn.apply(new CertificateInformation.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			List<CertificateInformation> value = (List<CertificateInformation>) JsonpDeserializer
					.arrayDeserializer(CertificateInformation._DESERIALIZER).deserialize(parser, mapper);
			return this.certificates(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CertificatesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CertificatesResponse build() {
			_checkSingleUse();

			return new CertificatesResponse(this);
		}
	}

	public static final JsonpDeserializer<CertificatesResponse> _DESERIALIZER = createCertificatesResponseDeserializer();
	protected static JsonpDeserializer<CertificatesResponse> createCertificatesResponseDeserializer() {

		JsonpDeserializer<List<CertificateInformation>> valueDeserializer = JsonpDeserializer
				.arrayDeserializer(CertificateInformation._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.certificates(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
