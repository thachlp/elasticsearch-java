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

import co.elastic.clients.elasticsearch.cat.thread_pool.ThreadPoolRecord;
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

// typedef: cat.thread_pool.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#cat.thread_pool.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class ThreadPoolResponse implements JsonpSerializable {
	private final List<ThreadPoolRecord> threadPools;

	// ---------------------------------------------------------------------------------------------

	private ThreadPoolResponse(Builder builder) {

		this.threadPools = ApiTypeHelper.unmodifiableRequired(builder.threadPools, this, "threadPools");

	}

	public static ThreadPoolResponse of(Function<Builder, ObjectBuilder<ThreadPoolResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 */
	public final List<ThreadPoolRecord> threadPools() {
		return this.threadPools;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (ThreadPoolRecord item0 : this.threadPools) {
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
	 * Builder for {@link ThreadPoolResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ThreadPoolResponse> {
		private List<ThreadPoolRecord> threadPools;

		/**
		 * Required - Response value.
		 * <p>
		 * Adds all elements of <code>list</code> to <code>threadPools</code>.
		 */
		public final Builder threadPools(List<ThreadPoolRecord> list) {
			this.threadPools = _listAddAll(this.threadPools, list);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds one or more values to <code>threadPools</code>.
		 */
		public final Builder threadPools(ThreadPoolRecord value, ThreadPoolRecord... values) {
			this.threadPools = _listAdd(this.threadPools, value, values);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds a value to <code>threadPools</code> using a builder lambda.
		 */
		public final Builder threadPools(Function<ThreadPoolRecord.Builder, ObjectBuilder<ThreadPoolRecord>> fn) {
			return threadPools(fn.apply(new ThreadPoolRecord.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			List<ThreadPoolRecord> value = (List<ThreadPoolRecord>) JsonpDeserializer
					.arrayDeserializer(ThreadPoolRecord._DESERIALIZER).deserialize(parser, mapper);
			return this.threadPools(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ThreadPoolResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ThreadPoolResponse build() {
			_checkSingleUse();

			return new ThreadPoolResponse(this);
		}
	}

	public static final JsonpDeserializer<ThreadPoolResponse> _DESERIALIZER = createThreadPoolResponseDeserializer();
	protected static JsonpDeserializer<ThreadPoolResponse> createThreadPoolResponseDeserializer() {

		JsonpDeserializer<List<ThreadPoolRecord>> valueDeserializer = JsonpDeserializer
				.arrayDeserializer(ThreadPoolRecord._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.threadPools(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
