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

import co.elastic.clients.elasticsearch.cat.ml_data_frame_analytics.DataFrameAnalyticsRecord;
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

// typedef: cat.ml_data_frame_analytics.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#cat.ml_data_frame_analytics.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class MlDataFrameAnalyticsResponse implements JsonpSerializable {
	private final List<DataFrameAnalyticsRecord> dataFrameAnalytics;

	// ---------------------------------------------------------------------------------------------

	private MlDataFrameAnalyticsResponse(Builder builder) {

		this.dataFrameAnalytics = ApiTypeHelper.unmodifiableRequired(builder.dataFrameAnalytics, this,
				"dataFrameAnalytics");

	}

	public static MlDataFrameAnalyticsResponse of(Function<Builder, ObjectBuilder<MlDataFrameAnalyticsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 */
	public final List<DataFrameAnalyticsRecord> dataFrameAnalytics() {
		return this.dataFrameAnalytics;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (DataFrameAnalyticsRecord item0 : this.dataFrameAnalytics) {
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
	 * Builder for {@link MlDataFrameAnalyticsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<MlDataFrameAnalyticsResponse> {
		private List<DataFrameAnalyticsRecord> dataFrameAnalytics;

		/**
		 * Required - Response value.
		 * <p>
		 * Adds all elements of <code>list</code> to <code>dataFrameAnalytics</code>.
		 */
		public final Builder dataFrameAnalytics(List<DataFrameAnalyticsRecord> list) {
			this.dataFrameAnalytics = _listAddAll(this.dataFrameAnalytics, list);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds one or more values to <code>dataFrameAnalytics</code>.
		 */
		public final Builder dataFrameAnalytics(DataFrameAnalyticsRecord value, DataFrameAnalyticsRecord... values) {
			this.dataFrameAnalytics = _listAdd(this.dataFrameAnalytics, value, values);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds a value to <code>dataFrameAnalytics</code> using a builder lambda.
		 */
		public final Builder dataFrameAnalytics(
				Function<DataFrameAnalyticsRecord.Builder, ObjectBuilder<DataFrameAnalyticsRecord>> fn) {
			return dataFrameAnalytics(fn.apply(new DataFrameAnalyticsRecord.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			List<DataFrameAnalyticsRecord> value = (List<DataFrameAnalyticsRecord>) JsonpDeserializer
					.arrayDeserializer(DataFrameAnalyticsRecord._DESERIALIZER).deserialize(parser, mapper);
			return this.dataFrameAnalytics(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MlDataFrameAnalyticsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlDataFrameAnalyticsResponse build() {
			_checkSingleUse();

			return new MlDataFrameAnalyticsResponse(this);
		}
	}

	public static final JsonpDeserializer<MlDataFrameAnalyticsResponse> _DESERIALIZER = createMlDataFrameAnalyticsResponseDeserializer();
	protected static JsonpDeserializer<MlDataFrameAnalyticsResponse> createMlDataFrameAnalyticsResponseDeserializer() {

		JsonpDeserializer<List<DataFrameAnalyticsRecord>> valueDeserializer = JsonpDeserializer
				.arrayDeserializer(DataFrameAnalyticsRecord._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.dataFrameAnalytics(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
