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

package co.elastic.clients.elasticsearch.core.bulk;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
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

// typedef: _global.bulk.WriteOperation

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_global.bulk.WriteOperation">API
 *      specification</a>
 */

public abstract class WriteOperation extends BulkOperationBase {
	private final Map<String, String> dynamicTemplates;

	@Nullable
	private final String pipeline;

	@Nullable
	private final Boolean requireAlias;

	// ---------------------------------------------------------------------------------------------

	protected WriteOperation(AbstractBuilder<?> builder) {
		super(builder);

		this.dynamicTemplates = ApiTypeHelper.unmodifiable(builder.dynamicTemplates);
		this.pipeline = builder.pipeline;
		this.requireAlias = builder.requireAlias;

	}

	/**
	 * A map from the full name of fields to the name of dynamic templates. It
	 * defaults to an empty map. If a name matches a dynamic template, that template
	 * will be applied regardless of other match predicates defined in the template.
	 * If a field is already defined in the mapping, then this parameter won't be
	 * used.
	 * <p>
	 * API name: {@code dynamic_templates}
	 */
	public final Map<String, String> dynamicTemplates() {
		return this.dynamicTemplates;
	}

	/**
	 * The ID of the pipeline to use to preprocess incoming documents. If the index
	 * has a default ingest pipeline specified, setting the value to
	 * <code>_none</code> turns off the default ingest pipeline for this request. If
	 * a final pipeline is configured, it will always run regardless of the value of
	 * this parameter.
	 * <p>
	 * API name: {@code pipeline}
	 */
	@Nullable
	public final String pipeline() {
		return this.pipeline;
	}

	/**
	 * If <code>true</code>, the request's actions must target an index alias.
	 * <p>
	 * API name: {@code require_alias}
	 */
	@Nullable
	public final Boolean requireAlias() {
		return this.requireAlias;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.dynamicTemplates)) {
			generator.writeKey("dynamic_templates");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.dynamicTemplates.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.pipeline != null) {
			generator.writeKey("pipeline");
			generator.write(this.pipeline);

		}
		if (this.requireAlias != null) {
			generator.writeKey("require_alias");
			generator.write(this.requireAlias);

		}

	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				BulkOperationBase.AbstractBuilder<BuilderT> {
		@Nullable
		private Map<String, String> dynamicTemplates;

		@Nullable
		private String pipeline;

		@Nullable
		private Boolean requireAlias;

		/**
		 * A map from the full name of fields to the name of dynamic templates. It
		 * defaults to an empty map. If a name matches a dynamic template, that template
		 * will be applied regardless of other match predicates defined in the template.
		 * If a field is already defined in the mapping, then this parameter won't be
		 * used.
		 * <p>
		 * API name: {@code dynamic_templates}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>dynamicTemplates</code>.
		 */
		public final BuilderT dynamicTemplates(Map<String, String> map) {
			this.dynamicTemplates = _mapPutAll(this.dynamicTemplates, map);
			return self();
		}

		/**
		 * A map from the full name of fields to the name of dynamic templates. It
		 * defaults to an empty map. If a name matches a dynamic template, that template
		 * will be applied regardless of other match predicates defined in the template.
		 * If a field is already defined in the mapping, then this parameter won't be
		 * used.
		 * <p>
		 * API name: {@code dynamic_templates}
		 * <p>
		 * Adds an entry to <code>dynamicTemplates</code>.
		 */
		public final BuilderT dynamicTemplates(String key, String value) {
			this.dynamicTemplates = _mapPut(this.dynamicTemplates, key, value);
			return self();
		}

		/**
		 * The ID of the pipeline to use to preprocess incoming documents. If the index
		 * has a default ingest pipeline specified, setting the value to
		 * <code>_none</code> turns off the default ingest pipeline for this request. If
		 * a final pipeline is configured, it will always run regardless of the value of
		 * this parameter.
		 * <p>
		 * API name: {@code pipeline}
		 */
		public final BuilderT pipeline(@Nullable String value) {
			this.pipeline = value;
			return self();
		}

		/**
		 * If <code>true</code>, the request's actions must target an index alias.
		 * <p>
		 * API name: {@code require_alias}
		 */
		public final BuilderT requireAlias(@Nullable Boolean value) {
			this.requireAlias = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupWriteOperationDeserializer(
			ObjectDeserializer<BuilderT> op) {
		BulkOperationBase.setupBulkOperationBaseDeserializer(op);
		op.add(AbstractBuilder::dynamicTemplates,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "dynamic_templates");
		op.add(AbstractBuilder::pipeline, JsonpDeserializer.stringDeserializer(), "pipeline");
		op.add(AbstractBuilder::requireAlias, JsonpDeserializer.booleanDeserializer(), "require_alias");

	}

}
