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
import java.lang.String;
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

// typedef: indices.get.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices.get.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetIndexResponse implements JsonpSerializable {
	private final Map<String, IndexState> indices;

	// ---------------------------------------------------------------------------------------------

	private GetIndexResponse(Builder builder) {

		this.indices = ApiTypeHelper.unmodifiableRequired(builder.indices, this, "indices");

	}

	public static GetIndexResponse of(Function<Builder, ObjectBuilder<GetIndexResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 */
	public final Map<String, IndexState> indices() {
		return this.indices;
	}

	/**
	 * Get an element of {@code indices}.
	 */
	public final @Nullable IndexState get(String key) {
		return this.indices.get(key);
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		for (Map.Entry<String, IndexState> item0 : this.indices.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetIndexResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<GetIndexResponse> {
		private Map<String, IndexState> indices = new HashMap<>();

		/**
		 * Required - Response value.
		 * <p>
		 * Adds all entries of <code>map</code> to <code>indices</code>.
		 */
		public final Builder indices(Map<String, IndexState> map) {
			this.indices = _mapPutAll(this.indices, map);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds an entry to <code>indices</code>.
		 */
		public final Builder indices(String key, IndexState value) {
			this.indices = _mapPut(this.indices, key, value);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds an entry to <code>indices</code> using a builder lambda.
		 */
		public final Builder indices(String key, Function<IndexState.Builder, ObjectBuilder<IndexState>> fn) {
			return indices(key, fn.apply(new IndexState.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			Map<String, IndexState> value = (Map<String, IndexState>) JsonpDeserializer
					.stringMapDeserializer(IndexState._DESERIALIZER).deserialize(parser, mapper);
			return this.indices(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetIndexResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetIndexResponse build() {
			_checkSingleUse();

			return new GetIndexResponse(this);
		}
	}

	public static final JsonpDeserializer<GetIndexResponse> _DESERIALIZER = createGetIndexResponseDeserializer();
	protected static JsonpDeserializer<GetIndexResponse> createGetIndexResponseDeserializer() {

		JsonpDeserializer<Map<String, IndexState>> valueDeserializer = JsonpDeserializer
				.stringMapDeserializer(IndexState._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.indices(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
