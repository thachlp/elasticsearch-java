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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
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

// typedef: _types.query_dsl.SpanWithinQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.SpanWithinQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class SpanWithinQuery extends QueryBase implements SpanQueryVariant, QueryVariant {
	private final SpanQuery big;

	private final SpanQuery little;

	// ---------------------------------------------------------------------------------------------

	private SpanWithinQuery(Builder builder) {
		super(builder);

		this.big = ApiTypeHelper.requireNonNull(builder.big, this, "big");
		this.little = ApiTypeHelper.requireNonNull(builder.little, this, "little");

	}

	public static SpanWithinQuery of(Function<Builder, ObjectBuilder<SpanWithinQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * SpanQuery variant kind.
	 */
	@Override
	public SpanQuery.Kind _spanQueryKind() {
		return SpanQuery.Kind.SpanWithin;
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.SpanWithin;
	}

	/**
	 * Required - Can be any span query. Matching spans from <code>little</code>
	 * that are enclosed within <code>big</code> are returned.
	 * <p>
	 * API name: {@code big}
	 */
	public final SpanQuery big() {
		return this.big;
	}

	/**
	 * Required - Can be any span query. Matching spans from <code>little</code>
	 * that are enclosed within <code>big</code> are returned.
	 * <p>
	 * API name: {@code little}
	 */
	public final SpanQuery little() {
		return this.little;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("big");
		this.big.serialize(generator, mapper);

		generator.writeKey("little");
		this.little.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SpanWithinQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<SpanWithinQuery> {
		private SpanQuery big;

		private SpanQuery little;

		/**
		 * Required - Can be any span query. Matching spans from <code>little</code>
		 * that are enclosed within <code>big</code> are returned.
		 * <p>
		 * API name: {@code big}
		 */
		public final Builder big(SpanQuery value) {
			this.big = value;
			return this;
		}

		/**
		 * Required - Can be any span query. Matching spans from <code>little</code>
		 * that are enclosed within <code>big</code> are returned.
		 * <p>
		 * API name: {@code big}
		 */
		public final Builder big(Function<SpanQuery.Builder, ObjectBuilder<SpanQuery>> fn) {
			return this.big(fn.apply(new SpanQuery.Builder()).build());
		}

		/**
		 * Required - Can be any span query. Matching spans from <code>little</code>
		 * that are enclosed within <code>big</code> are returned.
		 * <p>
		 * API name: {@code big}
		 */
		public final Builder big(SpanQueryVariant value) {
			this.big = value._toSpanQuery();
			return this;
		}

		/**
		 * Required - Can be any span query. Matching spans from <code>little</code>
		 * that are enclosed within <code>big</code> are returned.
		 * <p>
		 * API name: {@code little}
		 */
		public final Builder little(SpanQuery value) {
			this.little = value;
			return this;
		}

		/**
		 * Required - Can be any span query. Matching spans from <code>little</code>
		 * that are enclosed within <code>big</code> are returned.
		 * <p>
		 * API name: {@code little}
		 */
		public final Builder little(Function<SpanQuery.Builder, ObjectBuilder<SpanQuery>> fn) {
			return this.little(fn.apply(new SpanQuery.Builder()).build());
		}

		/**
		 * Required - Can be any span query. Matching spans from <code>little</code>
		 * that are enclosed within <code>big</code> are returned.
		 * <p>
		 * API name: {@code little}
		 */
		public final Builder little(SpanQueryVariant value) {
			this.little = value._toSpanQuery();
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SpanWithinQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SpanWithinQuery build() {
			_checkSingleUse();

			return new SpanWithinQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SpanWithinQuery}
	 */
	public static final JsonpDeserializer<SpanWithinQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SpanWithinQuery::setupSpanWithinQueryDeserializer);

	protected static void setupSpanWithinQueryDeserializer(ObjectDeserializer<SpanWithinQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::big, SpanQuery._DESERIALIZER, "big");
		op.add(Builder::little, SpanQuery._DESERIALIZER, "little");

	}

}
