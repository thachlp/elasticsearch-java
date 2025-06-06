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

import co.elastic.clients.elasticsearch.cat.ml_jobs.JobsRecord;
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

// typedef: cat.ml_jobs.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#cat.ml_jobs.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class MlJobsResponse implements JsonpSerializable {
	private final List<JobsRecord> jobs;

	// ---------------------------------------------------------------------------------------------

	private MlJobsResponse(Builder builder) {

		this.jobs = ApiTypeHelper.unmodifiableRequired(builder.jobs, this, "jobs");

	}

	public static MlJobsResponse of(Function<Builder, ObjectBuilder<MlJobsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 */
	public final List<JobsRecord> jobs() {
		return this.jobs;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (JobsRecord item0 : this.jobs) {
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
	 * Builder for {@link MlJobsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<MlJobsResponse> {
		private List<JobsRecord> jobs;

		/**
		 * Required - Response value.
		 * <p>
		 * Adds all elements of <code>list</code> to <code>jobs</code>.
		 */
		public final Builder jobs(List<JobsRecord> list) {
			this.jobs = _listAddAll(this.jobs, list);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds one or more values to <code>jobs</code>.
		 */
		public final Builder jobs(JobsRecord value, JobsRecord... values) {
			this.jobs = _listAdd(this.jobs, value, values);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds a value to <code>jobs</code> using a builder lambda.
		 */
		public final Builder jobs(Function<JobsRecord.Builder, ObjectBuilder<JobsRecord>> fn) {
			return jobs(fn.apply(new JobsRecord.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			List<JobsRecord> value = (List<JobsRecord>) JsonpDeserializer.arrayDeserializer(JobsRecord._DESERIALIZER)
					.deserialize(parser, mapper);
			return this.jobs(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MlJobsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlJobsResponse build() {
			_checkSingleUse();

			return new MlJobsResponse(this);
		}
	}

	public static final JsonpDeserializer<MlJobsResponse> _DESERIALIZER = createMlJobsResponseDeserializer();
	protected static JsonpDeserializer<MlJobsResponse> createMlJobsResponseDeserializer() {

		JsonpDeserializer<List<JobsRecord>> valueDeserializer = JsonpDeserializer
				.arrayDeserializer(JobsRecord._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.jobs(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
