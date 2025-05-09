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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
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

// typedef: _types.mapping.DateNanosProperty

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.DateNanosProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class DateNanosProperty extends DocValuesPropertyBase implements PropertyVariant {
	@Nullable
	private final Double boost;

	@Nullable
	private final String format;

	@Nullable
	private final Boolean ignoreMalformed;

	@Nullable
	private final Boolean index;

	@Nullable
	private final Script script;

	@Nullable
	private final OnScriptError onScriptError;

	@Nullable
	private final DateTime nullValue;

	@Nullable
	private final Integer precisionStep;

	// ---------------------------------------------------------------------------------------------

	private DateNanosProperty(Builder builder) {
		super(builder);

		this.boost = builder.boost;
		this.format = builder.format;
		this.ignoreMalformed = builder.ignoreMalformed;
		this.index = builder.index;
		this.script = builder.script;
		this.onScriptError = builder.onScriptError;
		this.nullValue = builder.nullValue;
		this.precisionStep = builder.precisionStep;

	}

	public static DateNanosProperty of(Function<Builder, ObjectBuilder<DateNanosProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.DateNanos;
	}

	/**
	 * API name: {@code boost}
	 */
	@Nullable
	public final Double boost() {
		return this.boost;
	}

	/**
	 * API name: {@code format}
	 */
	@Nullable
	public final String format() {
		return this.format;
	}

	/**
	 * API name: {@code ignore_malformed}
	 */
	@Nullable
	public final Boolean ignoreMalformed() {
		return this.ignoreMalformed;
	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public final Boolean index() {
		return this.index;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public final Script script() {
		return this.script;
	}

	/**
	 * API name: {@code on_script_error}
	 */
	@Nullable
	public final OnScriptError onScriptError() {
		return this.onScriptError;
	}

	/**
	 * API name: {@code null_value}
	 */
	@Nullable
	public final DateTime nullValue() {
		return this.nullValue;
	}

	/**
	 * API name: {@code precision_step}
	 */
	@Nullable
	public final Integer precisionStep() {
		return this.precisionStep;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "date_nanos");
		super.serializeInternal(generator, mapper);
		if (this.boost != null) {
			generator.writeKey("boost");
			generator.write(this.boost);

		}
		if (this.format != null) {
			generator.writeKey("format");
			generator.write(this.format);

		}
		if (this.ignoreMalformed != null) {
			generator.writeKey("ignore_malformed");
			generator.write(this.ignoreMalformed);

		}
		if (this.index != null) {
			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.script != null) {
			generator.writeKey("script");
			this.script.serialize(generator, mapper);

		}
		if (this.onScriptError != null) {
			generator.writeKey("on_script_error");
			this.onScriptError.serialize(generator, mapper);
		}
		if (this.nullValue != null) {
			generator.writeKey("null_value");
			this.nullValue.serialize(generator, mapper);
		}
		if (this.precisionStep != null) {
			generator.writeKey("precision_step");
			generator.write(this.precisionStep);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DateNanosProperty}.
	 */

	public static class Builder extends DocValuesPropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DateNanosProperty> {
		@Nullable
		private Double boost;

		@Nullable
		private String format;

		@Nullable
		private Boolean ignoreMalformed;

		@Nullable
		private Boolean index;

		@Nullable
		private Script script;

		@Nullable
		private OnScriptError onScriptError;

		@Nullable
		private DateTime nullValue;

		@Nullable
		private Integer precisionStep;

		/**
		 * API name: {@code boost}
		 */
		public final Builder boost(@Nullable Double value) {
			this.boost = value;
			return this;
		}

		/**
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		/**
		 * API name: {@code ignore_malformed}
		 */
		public final Builder ignoreMalformed(@Nullable Boolean value) {
			this.ignoreMalformed = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable Boolean value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(@Nullable Script value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.script(fn.apply(new Script.Builder()).build());
		}

		/**
		 * API name: {@code on_script_error}
		 */
		public final Builder onScriptError(@Nullable OnScriptError value) {
			this.onScriptError = value;
			return this;
		}

		/**
		 * API name: {@code null_value}
		 */
		public final Builder nullValue(@Nullable DateTime value) {
			this.nullValue = value;
			return this;
		}

		/**
		 * API name: {@code precision_step}
		 */
		public final Builder precisionStep(@Nullable Integer value) {
			this.precisionStep = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DateNanosProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DateNanosProperty build() {
			_checkSingleUse();

			return new DateNanosProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DateNanosProperty}
	 */
	public static final JsonpDeserializer<DateNanosProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DateNanosProperty::setupDateNanosPropertyDeserializer);

	protected static void setupDateNanosPropertyDeserializer(ObjectDeserializer<DateNanosProperty.Builder> op) {
		DocValuesPropertyBase.setupDocValuesPropertyBaseDeserializer(op);
		op.add(Builder::boost, JsonpDeserializer.doubleDeserializer(), "boost");
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::ignoreMalformed, JsonpDeserializer.booleanDeserializer(), "ignore_malformed");
		op.add(Builder::index, JsonpDeserializer.booleanDeserializer(), "index");
		op.add(Builder::script, Script._DESERIALIZER, "script");
		op.add(Builder::onScriptError, OnScriptError._DESERIALIZER, "on_script_error");
		op.add(Builder::nullValue, DateTime._DESERIALIZER, "null_value");
		op.add(Builder::precisionStep, JsonpDeserializer.integerDeserializer(), "precision_step");

		op.ignore("type");
	}

}
