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

package co.elastic.clients.elasticsearch.inference;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
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

// typedef: inference._types.ElasticsearchTaskSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.ElasticsearchTaskSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class ElasticsearchTaskSettings implements JsonpSerializable {
	@Nullable
	private final Boolean returnDocuments;

	// ---------------------------------------------------------------------------------------------

	private ElasticsearchTaskSettings(Builder builder) {

		this.returnDocuments = builder.returnDocuments;

	}

	public static ElasticsearchTaskSettings of(Function<Builder, ObjectBuilder<ElasticsearchTaskSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * For a <code>rerank</code> task, return the document instead of only the
	 * index.
	 * <p>
	 * API name: {@code return_documents}
	 */
	@Nullable
	public final Boolean returnDocuments() {
		return this.returnDocuments;
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

		if (this.returnDocuments != null) {
			generator.writeKey("return_documents");
			generator.write(this.returnDocuments);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ElasticsearchTaskSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ElasticsearchTaskSettings> {
		@Nullable
		private Boolean returnDocuments;

		/**
		 * For a <code>rerank</code> task, return the document instead of only the
		 * index.
		 * <p>
		 * API name: {@code return_documents}
		 */
		public final Builder returnDocuments(@Nullable Boolean value) {
			this.returnDocuments = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ElasticsearchTaskSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ElasticsearchTaskSettings build() {
			_checkSingleUse();

			return new ElasticsearchTaskSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ElasticsearchTaskSettings}
	 */
	public static final JsonpDeserializer<ElasticsearchTaskSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ElasticsearchTaskSettings::setupElasticsearchTaskSettingsDeserializer);

	protected static void setupElasticsearchTaskSettingsDeserializer(
			ObjectDeserializer<ElasticsearchTaskSettings.Builder> op) {

		op.add(Builder::returnDocuments, JsonpDeserializer.booleanDeserializer(), "return_documents");

	}

}
