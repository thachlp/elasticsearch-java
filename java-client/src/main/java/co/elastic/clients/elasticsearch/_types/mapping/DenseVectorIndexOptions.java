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
import java.lang.Float;
import java.lang.Integer;
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

// typedef: _types.mapping.DenseVectorIndexOptions

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.DenseVectorIndexOptions">API
 *      specification</a>
 */
@JsonpDeserializable
public class DenseVectorIndexOptions implements JsonpSerializable {
	@Nullable
	private final Float confidenceInterval;

	@Nullable
	private final Integer efConstruction;

	@Nullable
	private final Integer m;

	private final DenseVectorIndexOptionsType type;

	@Nullable
	private final DenseVectorIndexOptionsRescoreVector rescoreVector;

	// ---------------------------------------------------------------------------------------------

	private DenseVectorIndexOptions(Builder builder) {

		this.confidenceInterval = builder.confidenceInterval;
		this.efConstruction = builder.efConstruction;
		this.m = builder.m;
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.rescoreVector = builder.rescoreVector;

	}

	public static DenseVectorIndexOptions of(Function<Builder, ObjectBuilder<DenseVectorIndexOptions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The confidence interval to use when quantizing the vectors. Can be any value
	 * between and including <code>0.90</code> and <code>1.0</code> or exactly
	 * <code>0</code>. When the value is <code>0</code>, this indicates that dynamic
	 * quantiles should be calculated for optimized quantization. When between
	 * <code>0.90</code> and <code>1.0</code>, this value restricts the values used
	 * when calculating the quantization thresholds.
	 * <p>
	 * For example, a value of <code>0.95</code> will only use the middle
	 * <code>95%</code> of the values when calculating the quantization thresholds
	 * (e.g. the highest and lowest <code>2.5%</code> of values will be ignored).
	 * <p>
	 * Defaults to <code>1/(dims + 1)</code> for <code>int8</code> quantized vectors
	 * and <code>0</code> for <code>int4</code> for dynamic quantile calculation.
	 * <p>
	 * Only applicable to <code>int8_hnsw</code>, <code>int4_hnsw</code>,
	 * <code>int8_flat</code>, and <code>int4_flat</code> index types.
	 * <p>
	 * API name: {@code confidence_interval}
	 */
	@Nullable
	public final Float confidenceInterval() {
		return this.confidenceInterval;
	}

	/**
	 * The number of candidates to track while assembling the list of nearest
	 * neighbors for each new node.
	 * <p>
	 * Only applicable to <code>hnsw</code>, <code>int8_hnsw</code>,
	 * <code>bbq_hnsw</code>, and <code>int4_hnsw</code> index types.
	 * <p>
	 * API name: {@code ef_construction}
	 */
	@Nullable
	public final Integer efConstruction() {
		return this.efConstruction;
	}

	/**
	 * The number of neighbors each node will be connected to in the HNSW graph.
	 * <p>
	 * Only applicable to <code>hnsw</code>, <code>int8_hnsw</code>,
	 * <code>bbq_hnsw</code>, and <code>int4_hnsw</code> index types.
	 * <p>
	 * API name: {@code m}
	 */
	@Nullable
	public final Integer m() {
		return this.m;
	}

	/**
	 * Required - The type of kNN algorithm to use.
	 * <p>
	 * API name: {@code type}
	 */
	public final DenseVectorIndexOptionsType type() {
		return this.type;
	}

	/**
	 * The rescore vector options. This is only applicable to <code>bbq_hnsw</code>,
	 * <code>int4_hnsw</code>, <code>int8_hnsw</code>, <code>bbq_flat</code>,
	 * <code>int4_flat</code>, and <code>int8_flat</code> index types.
	 * <p>
	 * API name: {@code rescore_vector}
	 */
	@Nullable
	public final DenseVectorIndexOptionsRescoreVector rescoreVector() {
		return this.rescoreVector;
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

		if (this.confidenceInterval != null) {
			generator.writeKey("confidence_interval");
			generator.write(this.confidenceInterval);

		}
		if (this.efConstruction != null) {
			generator.writeKey("ef_construction");
			generator.write(this.efConstruction);

		}
		if (this.m != null) {
			generator.writeKey("m");
			generator.write(this.m);

		}
		generator.writeKey("type");
		this.type.serialize(generator, mapper);
		if (this.rescoreVector != null) {
			generator.writeKey("rescore_vector");
			this.rescoreVector.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DenseVectorIndexOptions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DenseVectorIndexOptions> {
		@Nullable
		private Float confidenceInterval;

		@Nullable
		private Integer efConstruction;

		@Nullable
		private Integer m;

		private DenseVectorIndexOptionsType type;

		@Nullable
		private DenseVectorIndexOptionsRescoreVector rescoreVector;

		/**
		 * The confidence interval to use when quantizing the vectors. Can be any value
		 * between and including <code>0.90</code> and <code>1.0</code> or exactly
		 * <code>0</code>. When the value is <code>0</code>, this indicates that dynamic
		 * quantiles should be calculated for optimized quantization. When between
		 * <code>0.90</code> and <code>1.0</code>, this value restricts the values used
		 * when calculating the quantization thresholds.
		 * <p>
		 * For example, a value of <code>0.95</code> will only use the middle
		 * <code>95%</code> of the values when calculating the quantization thresholds
		 * (e.g. the highest and lowest <code>2.5%</code> of values will be ignored).
		 * <p>
		 * Defaults to <code>1/(dims + 1)</code> for <code>int8</code> quantized vectors
		 * and <code>0</code> for <code>int4</code> for dynamic quantile calculation.
		 * <p>
		 * Only applicable to <code>int8_hnsw</code>, <code>int4_hnsw</code>,
		 * <code>int8_flat</code>, and <code>int4_flat</code> index types.
		 * <p>
		 * API name: {@code confidence_interval}
		 */
		public final Builder confidenceInterval(@Nullable Float value) {
			this.confidenceInterval = value;
			return this;
		}

		/**
		 * The number of candidates to track while assembling the list of nearest
		 * neighbors for each new node.
		 * <p>
		 * Only applicable to <code>hnsw</code>, <code>int8_hnsw</code>,
		 * <code>bbq_hnsw</code>, and <code>int4_hnsw</code> index types.
		 * <p>
		 * API name: {@code ef_construction}
		 */
		public final Builder efConstruction(@Nullable Integer value) {
			this.efConstruction = value;
			return this;
		}

		/**
		 * The number of neighbors each node will be connected to in the HNSW graph.
		 * <p>
		 * Only applicable to <code>hnsw</code>, <code>int8_hnsw</code>,
		 * <code>bbq_hnsw</code>, and <code>int4_hnsw</code> index types.
		 * <p>
		 * API name: {@code m}
		 */
		public final Builder m(@Nullable Integer value) {
			this.m = value;
			return this;
		}

		/**
		 * Required - The type of kNN algorithm to use.
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(DenseVectorIndexOptionsType value) {
			this.type = value;
			return this;
		}

		/**
		 * The rescore vector options. This is only applicable to <code>bbq_hnsw</code>,
		 * <code>int4_hnsw</code>, <code>int8_hnsw</code>, <code>bbq_flat</code>,
		 * <code>int4_flat</code>, and <code>int8_flat</code> index types.
		 * <p>
		 * API name: {@code rescore_vector}
		 */
		public final Builder rescoreVector(@Nullable DenseVectorIndexOptionsRescoreVector value) {
			this.rescoreVector = value;
			return this;
		}

		/**
		 * The rescore vector options. This is only applicable to <code>bbq_hnsw</code>,
		 * <code>int4_hnsw</code>, <code>int8_hnsw</code>, <code>bbq_flat</code>,
		 * <code>int4_flat</code>, and <code>int8_flat</code> index types.
		 * <p>
		 * API name: {@code rescore_vector}
		 */
		public final Builder rescoreVector(
				Function<DenseVectorIndexOptionsRescoreVector.Builder, ObjectBuilder<DenseVectorIndexOptionsRescoreVector>> fn) {
			return this.rescoreVector(fn.apply(new DenseVectorIndexOptionsRescoreVector.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DenseVectorIndexOptions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DenseVectorIndexOptions build() {
			_checkSingleUse();

			return new DenseVectorIndexOptions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DenseVectorIndexOptions}
	 */
	public static final JsonpDeserializer<DenseVectorIndexOptions> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DenseVectorIndexOptions::setupDenseVectorIndexOptionsDeserializer);

	protected static void setupDenseVectorIndexOptionsDeserializer(
			ObjectDeserializer<DenseVectorIndexOptions.Builder> op) {

		op.add(Builder::confidenceInterval, JsonpDeserializer.floatDeserializer(), "confidence_interval");
		op.add(Builder::efConstruction, JsonpDeserializer.integerDeserializer(), "ef_construction");
		op.add(Builder::m, JsonpDeserializer.integerDeserializer(), "m");
		op.add(Builder::type, DenseVectorIndexOptionsType._DESERIALIZER, "type");
		op.add(Builder::rescoreVector, DenseVectorIndexOptionsRescoreVector._DESERIALIZER, "rescore_vector");

	}

}
