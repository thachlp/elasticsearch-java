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

package co.elastic.clients.elasticsearch.core.rank_eval;

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
import java.lang.Double;
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

// typedef: _global.rank_eval.RankEvalHitItem

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.rank_eval.RankEvalHitItem">API
 *      specification</a>
 */
@JsonpDeserializable
public class RankEvalHitItem implements JsonpSerializable {
	private final RankEvalHit hit;

	@Nullable
	private final Double rating;

	// ---------------------------------------------------------------------------------------------

	private RankEvalHitItem(Builder builder) {

		this.hit = ApiTypeHelper.requireNonNull(builder.hit, this, "hit");
		this.rating = builder.rating;

	}

	public static RankEvalHitItem of(Function<Builder, ObjectBuilder<RankEvalHitItem>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code hit}
	 */
	public final RankEvalHit hit() {
		return this.hit;
	}

	/**
	 * API name: {@code rating}
	 */
	@Nullable
	public final Double rating() {
		return this.rating;
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

		generator.writeKey("hit");
		this.hit.serialize(generator, mapper);

		if (this.rating != null) {
			generator.writeKey("rating");
			generator.write(this.rating);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankEvalHitItem}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RankEvalHitItem> {
		private RankEvalHit hit;

		@Nullable
		private Double rating;

		/**
		 * Required - API name: {@code hit}
		 */
		public final Builder hit(RankEvalHit value) {
			this.hit = value;
			return this;
		}

		/**
		 * Required - API name: {@code hit}
		 */
		public final Builder hit(Function<RankEvalHit.Builder, ObjectBuilder<RankEvalHit>> fn) {
			return this.hit(fn.apply(new RankEvalHit.Builder()).build());
		}

		/**
		 * API name: {@code rating}
		 */
		public final Builder rating(@Nullable Double value) {
			this.rating = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RankEvalHitItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankEvalHitItem build() {
			_checkSingleUse();

			return new RankEvalHitItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RankEvalHitItem}
	 */
	public static final JsonpDeserializer<RankEvalHitItem> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RankEvalHitItem::setupRankEvalHitItemDeserializer);

	protected static void setupRankEvalHitItemDeserializer(ObjectDeserializer<RankEvalHitItem.Builder> op) {

		op.add(Builder::hit, RankEvalHit._DESERIALIZER, "hit");
		op.add(Builder::rating, JsonpDeserializer.doubleDeserializer(), "rating");

	}

}
