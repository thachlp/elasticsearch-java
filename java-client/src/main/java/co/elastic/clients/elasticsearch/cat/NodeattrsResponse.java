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

import co.elastic.clients.elasticsearch.cat.nodeattrs.NodeAttributesRecord;
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

// typedef: cat.nodeattrs.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#cat.nodeattrs.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeattrsResponse implements JsonpSerializable {
	private final List<NodeAttributesRecord> nodeAttributes;

	// ---------------------------------------------------------------------------------------------

	private NodeattrsResponse(Builder builder) {

		this.nodeAttributes = ApiTypeHelper.unmodifiableRequired(builder.nodeAttributes, this, "nodeAttributes");

	}

	public static NodeattrsResponse of(Function<Builder, ObjectBuilder<NodeattrsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 */
	public final List<NodeAttributesRecord> nodeAttributes() {
		return this.nodeAttributes;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (NodeAttributesRecord item0 : this.nodeAttributes) {
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
	 * Builder for {@link NodeattrsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<NodeattrsResponse> {
		private List<NodeAttributesRecord> nodeAttributes;

		/**
		 * Required - Response value.
		 * <p>
		 * Adds all elements of <code>list</code> to <code>nodeAttributes</code>.
		 */
		public final Builder nodeAttributes(List<NodeAttributesRecord> list) {
			this.nodeAttributes = _listAddAll(this.nodeAttributes, list);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds one or more values to <code>nodeAttributes</code>.
		 */
		public final Builder nodeAttributes(NodeAttributesRecord value, NodeAttributesRecord... values) {
			this.nodeAttributes = _listAdd(this.nodeAttributes, value, values);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds a value to <code>nodeAttributes</code> using a builder lambda.
		 */
		public final Builder nodeAttributes(
				Function<NodeAttributesRecord.Builder, ObjectBuilder<NodeAttributesRecord>> fn) {
			return nodeAttributes(fn.apply(new NodeAttributesRecord.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			List<NodeAttributesRecord> value = (List<NodeAttributesRecord>) JsonpDeserializer
					.arrayDeserializer(NodeAttributesRecord._DESERIALIZER).deserialize(parser, mapper);
			return this.nodeAttributes(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodeattrsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeattrsResponse build() {
			_checkSingleUse();

			return new NodeattrsResponse(this);
		}
	}

	public static final JsonpDeserializer<NodeattrsResponse> _DESERIALIZER = createNodeattrsResponseDeserializer();
	protected static JsonpDeserializer<NodeattrsResponse> createNodeattrsResponseDeserializer() {

		JsonpDeserializer<List<NodeAttributesRecord>> valueDeserializer = JsonpDeserializer
				.arrayDeserializer(NodeAttributesRecord._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.nodeAttributes(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
