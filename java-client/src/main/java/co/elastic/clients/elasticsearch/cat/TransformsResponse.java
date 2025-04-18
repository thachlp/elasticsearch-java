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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch.cat.transforms.TransformsRecord;
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

// typedef: cat.transforms.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#cat.transforms.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class TransformsResponse implements JsonpSerializable {
	private final List<TransformsRecord> transforms;

	// ---------------------------------------------------------------------------------------------

	private TransformsResponse(Builder builder) {

		this.transforms = ApiTypeHelper.unmodifiableRequired(builder.transforms, this, "transforms");

	}

	public static TransformsResponse of(Function<Builder, ObjectBuilder<TransformsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 */
	public final List<TransformsRecord> transforms() {
		return this.transforms;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (TransformsRecord item0 : this.transforms) {
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
	 * Builder for {@link TransformsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TransformsResponse> {
		private List<TransformsRecord> transforms;

		/**
		 * Required - Response value.
		 * <p>
		 * Adds all elements of <code>list</code> to <code>transforms</code>.
		 */
		public final Builder transforms(List<TransformsRecord> list) {
			this.transforms = _listAddAll(this.transforms, list);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds one or more values to <code>transforms</code>.
		 */
		public final Builder transforms(TransformsRecord value, TransformsRecord... values) {
			this.transforms = _listAdd(this.transforms, value, values);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds a value to <code>transforms</code> using a builder lambda.
		 */
		public final Builder transforms(Function<TransformsRecord.Builder, ObjectBuilder<TransformsRecord>> fn) {
			return transforms(fn.apply(new TransformsRecord.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			List<TransformsRecord> value = (List<TransformsRecord>) JsonpDeserializer
					.arrayDeserializer(TransformsRecord._DESERIALIZER).deserialize(parser, mapper);
			return this.transforms(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TransformsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TransformsResponse build() {
			_checkSingleUse();

			return new TransformsResponse(this);
		}
	}

	public static final JsonpDeserializer<TransformsResponse> _DESERIALIZER = createTransformsResponseDeserializer();
	protected static JsonpDeserializer<TransformsResponse> createTransformsResponseDeserializer() {

		JsonpDeserializer<List<TransformsRecord>> valueDeserializer = JsonpDeserializer
				.arrayDeserializer(TransformsRecord._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.transforms(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
