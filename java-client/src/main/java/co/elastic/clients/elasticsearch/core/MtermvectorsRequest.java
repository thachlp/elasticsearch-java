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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.VersionType;
import co.elastic.clients.elasticsearch.core.mtermvectors.MultiTermVectorsOperation;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
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

// typedef: _global.mtermvectors.Request

/**
 * Get multiple term vectors.
 * <p>
 * Get multiple term vectors with a single request. You can specify existing
 * documents by index and ID or provide artificial documents in the body of the
 * request. You can specify the index in the request body or request URI. The
 * response contains a <code>docs</code> array with all the fetched termvectors.
 * Each element has the structure provided by the termvectors API.
 * <p>
 * <strong>Artificial documents</strong>
 * <p>
 * You can also use <code>mtermvectors</code> to generate term vectors for
 * artificial documents provided in the body of the request. The mapping used is
 * determined by the specified <code>_index</code>.
 * 
 * @see <a href="../doc-files/api-spec.html#_global.mtermvectors.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class MtermvectorsRequest extends RequestBase implements JsonpSerializable {
	private final List<MultiTermVectorsOperation> docs;

	@Nullable
	private final Boolean fieldStatistics;

	private final List<String> fields;

	private final List<String> ids;

	@Nullable
	private final String index;

	@Nullable
	private final Boolean offsets;

	@Nullable
	private final Boolean payloads;

	@Nullable
	private final Boolean positions;

	@Nullable
	private final String preference;

	@Nullable
	private final Boolean realtime;

	@Nullable
	private final String routing;

	@Nullable
	private final Boolean termStatistics;

	@Nullable
	private final Long version;

	@Nullable
	private final VersionType versionType;

	// ---------------------------------------------------------------------------------------------

	private MtermvectorsRequest(Builder builder) {

		this.docs = ApiTypeHelper.unmodifiable(builder.docs);
		this.fieldStatistics = builder.fieldStatistics;
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);
		this.ids = ApiTypeHelper.unmodifiable(builder.ids);
		this.index = builder.index;
		this.offsets = builder.offsets;
		this.payloads = builder.payloads;
		this.positions = builder.positions;
		this.preference = builder.preference;
		this.realtime = builder.realtime;
		this.routing = builder.routing;
		this.termStatistics = builder.termStatistics;
		this.version = builder.version;
		this.versionType = builder.versionType;

	}

	public static MtermvectorsRequest of(Function<Builder, ObjectBuilder<MtermvectorsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * An array of existing or artificial documents.
	 * <p>
	 * API name: {@code docs}
	 */
	public final List<MultiTermVectorsOperation> docs() {
		return this.docs;
	}

	/**
	 * If <code>true</code>, the response includes the document count, sum of
	 * document frequencies, and sum of total term frequencies.
	 * <p>
	 * API name: {@code field_statistics}
	 */
	@Nullable
	public final Boolean fieldStatistics() {
		return this.fieldStatistics;
	}

	/**
	 * A comma-separated list or wildcard expressions of fields to include in the
	 * statistics. It is used as the default list unless a specific field list is
	 * provided in the <code>completion_fields</code> or
	 * <code>fielddata_fields</code> parameters.
	 * <p>
	 * API name: {@code fields}
	 */
	public final List<String> fields() {
		return this.fields;
	}

	/**
	 * A simplified syntax to specify documents by their ID if they're in the same
	 * index.
	 * <p>
	 * API name: {@code ids}
	 */
	public final List<String> ids() {
		return this.ids;
	}

	/**
	 * The name of the index that contains the documents.
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * If <code>true</code>, the response includes term offsets.
	 * <p>
	 * API name: {@code offsets}
	 */
	@Nullable
	public final Boolean offsets() {
		return this.offsets;
	}

	/**
	 * If <code>true</code>, the response includes term payloads.
	 * <p>
	 * API name: {@code payloads}
	 */
	@Nullable
	public final Boolean payloads() {
		return this.payloads;
	}

	/**
	 * If <code>true</code>, the response includes term positions.
	 * <p>
	 * API name: {@code positions}
	 */
	@Nullable
	public final Boolean positions() {
		return this.positions;
	}

	/**
	 * The node or shard the operation should be performed on. It is random by
	 * default.
	 * <p>
	 * API name: {@code preference}
	 */
	@Nullable
	public final String preference() {
		return this.preference;
	}

	/**
	 * If true, the request is real-time as opposed to near-real-time.
	 * <p>
	 * API name: {@code realtime}
	 */
	@Nullable
	public final Boolean realtime() {
		return this.realtime;
	}

	/**
	 * A custom value used to route operations to a specific shard.
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * If true, the response includes term frequency and document frequency.
	 * <p>
	 * API name: {@code term_statistics}
	 */
	@Nullable
	public final Boolean termStatistics() {
		return this.termStatistics;
	}

	/**
	 * If <code>true</code>, returns the document version as part of a hit.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
	}

	/**
	 * The version type.
	 * <p>
	 * API name: {@code version_type}
	 */
	@Nullable
	public final VersionType versionType() {
		return this.versionType;
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

		if (ApiTypeHelper.isDefined(this.docs)) {
			generator.writeKey("docs");
			generator.writeStartArray();
			for (MultiTermVectorsOperation item0 : this.docs) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.ids)) {
			generator.writeKey("ids");
			generator.writeStartArray();
			for (String item0 : this.ids) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MtermvectorsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MtermvectorsRequest> {
		@Nullable
		private List<MultiTermVectorsOperation> docs;

		@Nullable
		private Boolean fieldStatistics;

		@Nullable
		private List<String> fields;

		@Nullable
		private List<String> ids;

		@Nullable
		private String index;

		@Nullable
		private Boolean offsets;

		@Nullable
		private Boolean payloads;

		@Nullable
		private Boolean positions;

		@Nullable
		private String preference;

		@Nullable
		private Boolean realtime;

		@Nullable
		private String routing;

		@Nullable
		private Boolean termStatistics;

		@Nullable
		private Long version;

		@Nullable
		private VersionType versionType;

		/**
		 * An array of existing or artificial documents.
		 * <p>
		 * API name: {@code docs}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>docs</code>.
		 */
		public final Builder docs(List<MultiTermVectorsOperation> list) {
			this.docs = _listAddAll(this.docs, list);
			return this;
		}

		/**
		 * An array of existing or artificial documents.
		 * <p>
		 * API name: {@code docs}
		 * <p>
		 * Adds one or more values to <code>docs</code>.
		 */
		public final Builder docs(MultiTermVectorsOperation value, MultiTermVectorsOperation... values) {
			this.docs = _listAdd(this.docs, value, values);
			return this;
		}

		/**
		 * An array of existing or artificial documents.
		 * <p>
		 * API name: {@code docs}
		 * <p>
		 * Adds a value to <code>docs</code> using a builder lambda.
		 */
		public final Builder docs(
				Function<MultiTermVectorsOperation.Builder, ObjectBuilder<MultiTermVectorsOperation>> fn) {
			return docs(fn.apply(new MultiTermVectorsOperation.Builder()).build());
		}

		/**
		 * If <code>true</code>, the response includes the document count, sum of
		 * document frequencies, and sum of total term frequencies.
		 * <p>
		 * API name: {@code field_statistics}
		 */
		public final Builder fieldStatistics(@Nullable Boolean value) {
			this.fieldStatistics = value;
			return this;
		}

		/**
		 * A comma-separated list or wildcard expressions of fields to include in the
		 * statistics. It is used as the default list unless a specific field list is
		 * provided in the <code>completion_fields</code> or
		 * <code>fielddata_fields</code> parameters.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fields</code>.
		 */
		public final Builder fields(List<String> list) {
			this.fields = _listAddAll(this.fields, list);
			return this;
		}

		/**
		 * A comma-separated list or wildcard expressions of fields to include in the
		 * statistics. It is used as the default list unless a specific field list is
		 * provided in the <code>completion_fields</code> or
		 * <code>fielddata_fields</code> parameters.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds one or more values to <code>fields</code>.
		 */
		public final Builder fields(String value, String... values) {
			this.fields = _listAdd(this.fields, value, values);
			return this;
		}

		/**
		 * A simplified syntax to specify documents by their ID if they're in the same
		 * index.
		 * <p>
		 * API name: {@code ids}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>ids</code>.
		 */
		public final Builder ids(List<String> list) {
			this.ids = _listAddAll(this.ids, list);
			return this;
		}

		/**
		 * A simplified syntax to specify documents by their ID if they're in the same
		 * index.
		 * <p>
		 * API name: {@code ids}
		 * <p>
		 * Adds one or more values to <code>ids</code>.
		 */
		public final Builder ids(String value, String... values) {
			this.ids = _listAdd(this.ids, value, values);
			return this;
		}

		/**
		 * The name of the index that contains the documents.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * If <code>true</code>, the response includes term offsets.
		 * <p>
		 * API name: {@code offsets}
		 */
		public final Builder offsets(@Nullable Boolean value) {
			this.offsets = value;
			return this;
		}

		/**
		 * If <code>true</code>, the response includes term payloads.
		 * <p>
		 * API name: {@code payloads}
		 */
		public final Builder payloads(@Nullable Boolean value) {
			this.payloads = value;
			return this;
		}

		/**
		 * If <code>true</code>, the response includes term positions.
		 * <p>
		 * API name: {@code positions}
		 */
		public final Builder positions(@Nullable Boolean value) {
			this.positions = value;
			return this;
		}

		/**
		 * The node or shard the operation should be performed on. It is random by
		 * default.
		 * <p>
		 * API name: {@code preference}
		 */
		public final Builder preference(@Nullable String value) {
			this.preference = value;
			return this;
		}

		/**
		 * If true, the request is real-time as opposed to near-real-time.
		 * <p>
		 * API name: {@code realtime}
		 */
		public final Builder realtime(@Nullable Boolean value) {
			this.realtime = value;
			return this;
		}

		/**
		 * A custom value used to route operations to a specific shard.
		 * <p>
		 * API name: {@code routing}
		 */
		public final Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * If true, the response includes term frequency and document frequency.
		 * <p>
		 * API name: {@code term_statistics}
		 */
		public final Builder termStatistics(@Nullable Boolean value) {
			this.termStatistics = value;
			return this;
		}

		/**
		 * If <code>true</code>, returns the document version as part of a hit.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * The version type.
		 * <p>
		 * API name: {@code version_type}
		 */
		public final Builder versionType(@Nullable VersionType value) {
			this.versionType = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MtermvectorsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MtermvectorsRequest build() {
			_checkSingleUse();

			return new MtermvectorsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MtermvectorsRequest}
	 */
	public static final JsonpDeserializer<MtermvectorsRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MtermvectorsRequest::setupMtermvectorsRequestDeserializer);

	protected static void setupMtermvectorsRequestDeserializer(ObjectDeserializer<MtermvectorsRequest.Builder> op) {

		op.add(Builder::docs, JsonpDeserializer.arrayDeserializer(MultiTermVectorsOperation._DESERIALIZER), "docs");
		op.add(Builder::ids, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "ids");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code mtermvectors}".
	 */
	public static final Endpoint<MtermvectorsRequest, MtermvectorsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/mtermvectors",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_mtermvectors");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_mtermvectors");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == 0) {
				}
				if (propsSet == (_index)) {
					params.put("index", request.index);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.routing != null) {
					params.put("routing", request.routing);
				}
				if (request.realtime != null) {
					params.put("realtime", String.valueOf(request.realtime));
				}
				if (request.termStatistics != null) {
					params.put("term_statistics", String.valueOf(request.termStatistics));
				}
				if (request.offsets != null) {
					params.put("offsets", String.valueOf(request.offsets));
				}
				if (request.payloads != null) {
					params.put("payloads", String.valueOf(request.payloads));
				}
				if (request.versionType != null) {
					params.put("version_type", request.versionType.jsonValue());
				}
				if (request.preference != null) {
					params.put("preference", request.preference);
				}
				if (request.positions != null) {
					params.put("positions", String.valueOf(request.positions));
				}
				if (request.fieldStatistics != null) {
					params.put("field_statistics", String.valueOf(request.fieldStatistics));
				}
				if (ApiTypeHelper.isDefined(request.fields)) {
					params.put("fields", request.fields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.version != null) {
					params.put("version", String.valueOf(request.version));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, MtermvectorsResponse._DESERIALIZER);
}
