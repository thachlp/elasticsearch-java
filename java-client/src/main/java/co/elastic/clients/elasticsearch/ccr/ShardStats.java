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

package co.elastic.clients.elasticsearch.ccr;

import co.elastic.clients.elasticsearch._types.ErrorCause;
import co.elastic.clients.elasticsearch._types.Time;
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
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
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

// typedef: ccr._types.ShardStats

/**
 *
 * @see <a href="../doc-files/api-spec.html#ccr._types.ShardStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class ShardStats implements JsonpSerializable {
	private final long bytesRead;

	private final long failedReadRequests;

	private final long failedWriteRequests;

	@Nullable
	private final ErrorCause fatalException;

	private final long followerAliasesVersion;

	private final long followerGlobalCheckpoint;

	private final String followerIndex;

	private final long followerMappingVersion;

	private final long followerMaxSeqNo;

	private final long followerSettingsVersion;

	private final long lastRequestedSeqNo;

	private final long leaderGlobalCheckpoint;

	private final String leaderIndex;

	private final long leaderMaxSeqNo;

	private final long operationsRead;

	private final long operationsWritten;

	private final int outstandingReadRequests;

	private final int outstandingWriteRequests;

	private final List<ReadException> readExceptions;

	private final String remoteCluster;

	private final int shardId;

	private final long successfulReadRequests;

	private final long successfulWriteRequests;

	@Nullable
	private final Time timeSinceLastRead;

	private final long timeSinceLastReadMillis;

	@Nullable
	private final Time totalReadRemoteExecTime;

	private final long totalReadRemoteExecTimeMillis;

	@Nullable
	private final Time totalReadTime;

	private final long totalReadTimeMillis;

	@Nullable
	private final Time totalWriteTime;

	private final long totalWriteTimeMillis;

	private final long writeBufferOperationCount;

	private final String writeBufferSizeInBytes;

	// ---------------------------------------------------------------------------------------------

	private ShardStats(Builder builder) {

		this.bytesRead = ApiTypeHelper.requireNonNull(builder.bytesRead, this, "bytesRead", 0);
		this.failedReadRequests = ApiTypeHelper.requireNonNull(builder.failedReadRequests, this, "failedReadRequests",
				0);
		this.failedWriteRequests = ApiTypeHelper.requireNonNull(builder.failedWriteRequests, this,
				"failedWriteRequests", 0);
		this.fatalException = builder.fatalException;
		this.followerAliasesVersion = ApiTypeHelper.requireNonNull(builder.followerAliasesVersion, this,
				"followerAliasesVersion", 0);
		this.followerGlobalCheckpoint = ApiTypeHelper.requireNonNull(builder.followerGlobalCheckpoint, this,
				"followerGlobalCheckpoint", 0);
		this.followerIndex = ApiTypeHelper.requireNonNull(builder.followerIndex, this, "followerIndex");
		this.followerMappingVersion = ApiTypeHelper.requireNonNull(builder.followerMappingVersion, this,
				"followerMappingVersion", 0);
		this.followerMaxSeqNo = ApiTypeHelper.requireNonNull(builder.followerMaxSeqNo, this, "followerMaxSeqNo", 0);
		this.followerSettingsVersion = ApiTypeHelper.requireNonNull(builder.followerSettingsVersion, this,
				"followerSettingsVersion", 0);
		this.lastRequestedSeqNo = ApiTypeHelper.requireNonNull(builder.lastRequestedSeqNo, this, "lastRequestedSeqNo",
				0);
		this.leaderGlobalCheckpoint = ApiTypeHelper.requireNonNull(builder.leaderGlobalCheckpoint, this,
				"leaderGlobalCheckpoint", 0);
		this.leaderIndex = ApiTypeHelper.requireNonNull(builder.leaderIndex, this, "leaderIndex");
		this.leaderMaxSeqNo = ApiTypeHelper.requireNonNull(builder.leaderMaxSeqNo, this, "leaderMaxSeqNo", 0);
		this.operationsRead = ApiTypeHelper.requireNonNull(builder.operationsRead, this, "operationsRead", 0);
		this.operationsWritten = ApiTypeHelper.requireNonNull(builder.operationsWritten, this, "operationsWritten", 0);
		this.outstandingReadRequests = ApiTypeHelper.requireNonNull(builder.outstandingReadRequests, this,
				"outstandingReadRequests", 0);
		this.outstandingWriteRequests = ApiTypeHelper.requireNonNull(builder.outstandingWriteRequests, this,
				"outstandingWriteRequests", 0);
		this.readExceptions = ApiTypeHelper.unmodifiableRequired(builder.readExceptions, this, "readExceptions");
		this.remoteCluster = ApiTypeHelper.requireNonNull(builder.remoteCluster, this, "remoteCluster");
		this.shardId = ApiTypeHelper.requireNonNull(builder.shardId, this, "shardId", 0);
		this.successfulReadRequests = ApiTypeHelper.requireNonNull(builder.successfulReadRequests, this,
				"successfulReadRequests", 0);
		this.successfulWriteRequests = ApiTypeHelper.requireNonNull(builder.successfulWriteRequests, this,
				"successfulWriteRequests", 0);
		this.timeSinceLastRead = builder.timeSinceLastRead;
		this.timeSinceLastReadMillis = ApiTypeHelper.requireNonNull(builder.timeSinceLastReadMillis, this,
				"timeSinceLastReadMillis", 0);
		this.totalReadRemoteExecTime = builder.totalReadRemoteExecTime;
		this.totalReadRemoteExecTimeMillis = ApiTypeHelper.requireNonNull(builder.totalReadRemoteExecTimeMillis, this,
				"totalReadRemoteExecTimeMillis", 0);
		this.totalReadTime = builder.totalReadTime;
		this.totalReadTimeMillis = ApiTypeHelper.requireNonNull(builder.totalReadTimeMillis, this,
				"totalReadTimeMillis", 0);
		this.totalWriteTime = builder.totalWriteTime;
		this.totalWriteTimeMillis = ApiTypeHelper.requireNonNull(builder.totalWriteTimeMillis, this,
				"totalWriteTimeMillis", 0);
		this.writeBufferOperationCount = ApiTypeHelper.requireNonNull(builder.writeBufferOperationCount, this,
				"writeBufferOperationCount", 0);
		this.writeBufferSizeInBytes = ApiTypeHelper.requireNonNull(builder.writeBufferSizeInBytes, this,
				"writeBufferSizeInBytes");

	}

	public static ShardStats of(Function<Builder, ObjectBuilder<ShardStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The total of transferred bytes read from the leader. This is only
	 * an estimate and does not account for compression if enabled.
	 * <p>
	 * API name: {@code bytes_read}
	 */
	public final long bytesRead() {
		return this.bytesRead;
	}

	/**
	 * Required - The number of failed reads.
	 * <p>
	 * API name: {@code failed_read_requests}
	 */
	public final long failedReadRequests() {
		return this.failedReadRequests;
	}

	/**
	 * Required - The number of failed bulk write requests on the follower.
	 * <p>
	 * API name: {@code failed_write_requests}
	 */
	public final long failedWriteRequests() {
		return this.failedWriteRequests;
	}

	/**
	 * API name: {@code fatal_exception}
	 */
	@Nullable
	public final ErrorCause fatalException() {
		return this.fatalException;
	}

	/**
	 * Required - The index aliases version the follower is synced up to.
	 * <p>
	 * API name: {@code follower_aliases_version}
	 */
	public final long followerAliasesVersion() {
		return this.followerAliasesVersion;
	}

	/**
	 * Required - The current global checkpoint on the follower. The difference
	 * between the <code>leader_global_checkpoint</code> and the
	 * <code>follower_global_checkpoint</code> is an indication of how much the
	 * follower is lagging the leader.
	 * <p>
	 * API name: {@code follower_global_checkpoint}
	 */
	public final long followerGlobalCheckpoint() {
		return this.followerGlobalCheckpoint;
	}

	/**
	 * Required - The name of the follower index.
	 * <p>
	 * API name: {@code follower_index}
	 */
	public final String followerIndex() {
		return this.followerIndex;
	}

	/**
	 * Required - The mapping version the follower is synced up to.
	 * <p>
	 * API name: {@code follower_mapping_version}
	 */
	public final long followerMappingVersion() {
		return this.followerMappingVersion;
	}

	/**
	 * Required - The current maximum sequence number on the follower.
	 * <p>
	 * API name: {@code follower_max_seq_no}
	 */
	public final long followerMaxSeqNo() {
		return this.followerMaxSeqNo;
	}

	/**
	 * Required - The index settings version the follower is synced up to.
	 * <p>
	 * API name: {@code follower_settings_version}
	 */
	public final long followerSettingsVersion() {
		return this.followerSettingsVersion;
	}

	/**
	 * Required - The starting sequence number of the last batch of operations
	 * requested from the leader.
	 * <p>
	 * API name: {@code last_requested_seq_no}
	 */
	public final long lastRequestedSeqNo() {
		return this.lastRequestedSeqNo;
	}

	/**
	 * Required - The current global checkpoint on the leader known to the follower
	 * task.
	 * <p>
	 * API name: {@code leader_global_checkpoint}
	 */
	public final long leaderGlobalCheckpoint() {
		return this.leaderGlobalCheckpoint;
	}

	/**
	 * Required - The name of the index in the leader cluster being followed.
	 * <p>
	 * API name: {@code leader_index}
	 */
	public final String leaderIndex() {
		return this.leaderIndex;
	}

	/**
	 * Required - The current maximum sequence number on the leader known to the
	 * follower task.
	 * <p>
	 * API name: {@code leader_max_seq_no}
	 */
	public final long leaderMaxSeqNo() {
		return this.leaderMaxSeqNo;
	}

	/**
	 * Required - The total number of operations read from the leader.
	 * <p>
	 * API name: {@code operations_read}
	 */
	public final long operationsRead() {
		return this.operationsRead;
	}

	/**
	 * Required - The number of operations written on the follower.
	 * <p>
	 * API name: {@code operations_written}
	 */
	public final long operationsWritten() {
		return this.operationsWritten;
	}

	/**
	 * Required - The number of active read requests from the follower.
	 * <p>
	 * API name: {@code outstanding_read_requests}
	 */
	public final int outstandingReadRequests() {
		return this.outstandingReadRequests;
	}

	/**
	 * Required - The number of active bulk write requests on the follower.
	 * <p>
	 * API name: {@code outstanding_write_requests}
	 */
	public final int outstandingWriteRequests() {
		return this.outstandingWriteRequests;
	}

	/**
	 * Required - An array of objects representing failed reads.
	 * <p>
	 * API name: {@code read_exceptions}
	 */
	public final List<ReadException> readExceptions() {
		return this.readExceptions;
	}

	/**
	 * Required - The remote cluster containing the leader index.
	 * <p>
	 * API name: {@code remote_cluster}
	 */
	public final String remoteCluster() {
		return this.remoteCluster;
	}

	/**
	 * Required - The numerical shard ID, with values from 0 to one less than the
	 * number of replicas.
	 * <p>
	 * API name: {@code shard_id}
	 */
	public final int shardId() {
		return this.shardId;
	}

	/**
	 * Required - The number of successful fetches.
	 * <p>
	 * API name: {@code successful_read_requests}
	 */
	public final long successfulReadRequests() {
		return this.successfulReadRequests;
	}

	/**
	 * Required - The number of bulk write requests run on the follower.
	 * <p>
	 * API name: {@code successful_write_requests}
	 */
	public final long successfulWriteRequests() {
		return this.successfulWriteRequests;
	}

	/**
	 * API name: {@code time_since_last_read}
	 */
	@Nullable
	public final Time timeSinceLastRead() {
		return this.timeSinceLastRead;
	}

	/**
	 * Required - The number of milliseconds since a read request was sent to the
	 * leader. When the follower is caught up to the leader, this number will
	 * increase up to the configured <code>read_poll_timeout</code> at which point
	 * another read request will be sent to the leader.
	 * <p>
	 * API name: {@code time_since_last_read_millis}
	 */
	public final long timeSinceLastReadMillis() {
		return this.timeSinceLastReadMillis;
	}

	/**
	 * API name: {@code total_read_remote_exec_time}
	 */
	@Nullable
	public final Time totalReadRemoteExecTime() {
		return this.totalReadRemoteExecTime;
	}

	/**
	 * Required - The total time reads spent running on the remote cluster.
	 * <p>
	 * API name: {@code total_read_remote_exec_time_millis}
	 */
	public final long totalReadRemoteExecTimeMillis() {
		return this.totalReadRemoteExecTimeMillis;
	}

	/**
	 * API name: {@code total_read_time}
	 */
	@Nullable
	public final Time totalReadTime() {
		return this.totalReadTime;
	}

	/**
	 * Required - The total time reads were outstanding, measured from the time a
	 * read was sent to the leader to the time a reply was returned to the follower.
	 * <p>
	 * API name: {@code total_read_time_millis}
	 */
	public final long totalReadTimeMillis() {
		return this.totalReadTimeMillis;
	}

	/**
	 * API name: {@code total_write_time}
	 */
	@Nullable
	public final Time totalWriteTime() {
		return this.totalWriteTime;
	}

	/**
	 * Required - The total time spent writing on the follower.
	 * <p>
	 * API name: {@code total_write_time_millis}
	 */
	public final long totalWriteTimeMillis() {
		return this.totalWriteTimeMillis;
	}

	/**
	 * Required - The number of write operations queued on the follower.
	 * <p>
	 * API name: {@code write_buffer_operation_count}
	 */
	public final long writeBufferOperationCount() {
		return this.writeBufferOperationCount;
	}

	/**
	 * Required - The total number of bytes of operations currently queued for
	 * writing.
	 * <p>
	 * API name: {@code write_buffer_size_in_bytes}
	 */
	public final String writeBufferSizeInBytes() {
		return this.writeBufferSizeInBytes;
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

		generator.writeKey("bytes_read");
		generator.write(this.bytesRead);

		generator.writeKey("failed_read_requests");
		generator.write(this.failedReadRequests);

		generator.writeKey("failed_write_requests");
		generator.write(this.failedWriteRequests);

		if (this.fatalException != null) {
			generator.writeKey("fatal_exception");
			this.fatalException.serialize(generator, mapper);

		}
		generator.writeKey("follower_aliases_version");
		generator.write(this.followerAliasesVersion);

		generator.writeKey("follower_global_checkpoint");
		generator.write(this.followerGlobalCheckpoint);

		generator.writeKey("follower_index");
		generator.write(this.followerIndex);

		generator.writeKey("follower_mapping_version");
		generator.write(this.followerMappingVersion);

		generator.writeKey("follower_max_seq_no");
		generator.write(this.followerMaxSeqNo);

		generator.writeKey("follower_settings_version");
		generator.write(this.followerSettingsVersion);

		generator.writeKey("last_requested_seq_no");
		generator.write(this.lastRequestedSeqNo);

		generator.writeKey("leader_global_checkpoint");
		generator.write(this.leaderGlobalCheckpoint);

		generator.writeKey("leader_index");
		generator.write(this.leaderIndex);

		generator.writeKey("leader_max_seq_no");
		generator.write(this.leaderMaxSeqNo);

		generator.writeKey("operations_read");
		generator.write(this.operationsRead);

		generator.writeKey("operations_written");
		generator.write(this.operationsWritten);

		generator.writeKey("outstanding_read_requests");
		generator.write(this.outstandingReadRequests);

		generator.writeKey("outstanding_write_requests");
		generator.write(this.outstandingWriteRequests);

		if (ApiTypeHelper.isDefined(this.readExceptions)) {
			generator.writeKey("read_exceptions");
			generator.writeStartArray();
			for (ReadException item0 : this.readExceptions) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("remote_cluster");
		generator.write(this.remoteCluster);

		generator.writeKey("shard_id");
		generator.write(this.shardId);

		generator.writeKey("successful_read_requests");
		generator.write(this.successfulReadRequests);

		generator.writeKey("successful_write_requests");
		generator.write(this.successfulWriteRequests);

		if (this.timeSinceLastRead != null) {
			generator.writeKey("time_since_last_read");
			this.timeSinceLastRead.serialize(generator, mapper);

		}
		generator.writeKey("time_since_last_read_millis");
		generator.write(this.timeSinceLastReadMillis);

		if (this.totalReadRemoteExecTime != null) {
			generator.writeKey("total_read_remote_exec_time");
			this.totalReadRemoteExecTime.serialize(generator, mapper);

		}
		generator.writeKey("total_read_remote_exec_time_millis");
		generator.write(this.totalReadRemoteExecTimeMillis);

		if (this.totalReadTime != null) {
			generator.writeKey("total_read_time");
			this.totalReadTime.serialize(generator, mapper);

		}
		generator.writeKey("total_read_time_millis");
		generator.write(this.totalReadTimeMillis);

		if (this.totalWriteTime != null) {
			generator.writeKey("total_write_time");
			this.totalWriteTime.serialize(generator, mapper);

		}
		generator.writeKey("total_write_time_millis");
		generator.write(this.totalWriteTimeMillis);

		generator.writeKey("write_buffer_operation_count");
		generator.write(this.writeBufferOperationCount);

		generator.writeKey("write_buffer_size_in_bytes");
		generator.write(this.writeBufferSizeInBytes);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ShardStats> {
		private Long bytesRead;

		private Long failedReadRequests;

		private Long failedWriteRequests;

		@Nullable
		private ErrorCause fatalException;

		private Long followerAliasesVersion;

		private Long followerGlobalCheckpoint;

		private String followerIndex;

		private Long followerMappingVersion;

		private Long followerMaxSeqNo;

		private Long followerSettingsVersion;

		private Long lastRequestedSeqNo;

		private Long leaderGlobalCheckpoint;

		private String leaderIndex;

		private Long leaderMaxSeqNo;

		private Long operationsRead;

		private Long operationsWritten;

		private Integer outstandingReadRequests;

		private Integer outstandingWriteRequests;

		private List<ReadException> readExceptions;

		private String remoteCluster;

		private Integer shardId;

		private Long successfulReadRequests;

		private Long successfulWriteRequests;

		@Nullable
		private Time timeSinceLastRead;

		private Long timeSinceLastReadMillis;

		@Nullable
		private Time totalReadRemoteExecTime;

		private Long totalReadRemoteExecTimeMillis;

		@Nullable
		private Time totalReadTime;

		private Long totalReadTimeMillis;

		@Nullable
		private Time totalWriteTime;

		private Long totalWriteTimeMillis;

		private Long writeBufferOperationCount;

		private String writeBufferSizeInBytes;

		/**
		 * Required - The total of transferred bytes read from the leader. This is only
		 * an estimate and does not account for compression if enabled.
		 * <p>
		 * API name: {@code bytes_read}
		 */
		public final Builder bytesRead(long value) {
			this.bytesRead = value;
			return this;
		}

		/**
		 * Required - The number of failed reads.
		 * <p>
		 * API name: {@code failed_read_requests}
		 */
		public final Builder failedReadRequests(long value) {
			this.failedReadRequests = value;
			return this;
		}

		/**
		 * Required - The number of failed bulk write requests on the follower.
		 * <p>
		 * API name: {@code failed_write_requests}
		 */
		public final Builder failedWriteRequests(long value) {
			this.failedWriteRequests = value;
			return this;
		}

		/**
		 * API name: {@code fatal_exception}
		 */
		public final Builder fatalException(@Nullable ErrorCause value) {
			this.fatalException = value;
			return this;
		}

		/**
		 * API name: {@code fatal_exception}
		 */
		public final Builder fatalException(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.fatalException(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Required - The index aliases version the follower is synced up to.
		 * <p>
		 * API name: {@code follower_aliases_version}
		 */
		public final Builder followerAliasesVersion(long value) {
			this.followerAliasesVersion = value;
			return this;
		}

		/**
		 * Required - The current global checkpoint on the follower. The difference
		 * between the <code>leader_global_checkpoint</code> and the
		 * <code>follower_global_checkpoint</code> is an indication of how much the
		 * follower is lagging the leader.
		 * <p>
		 * API name: {@code follower_global_checkpoint}
		 */
		public final Builder followerGlobalCheckpoint(long value) {
			this.followerGlobalCheckpoint = value;
			return this;
		}

		/**
		 * Required - The name of the follower index.
		 * <p>
		 * API name: {@code follower_index}
		 */
		public final Builder followerIndex(String value) {
			this.followerIndex = value;
			return this;
		}

		/**
		 * Required - The mapping version the follower is synced up to.
		 * <p>
		 * API name: {@code follower_mapping_version}
		 */
		public final Builder followerMappingVersion(long value) {
			this.followerMappingVersion = value;
			return this;
		}

		/**
		 * Required - The current maximum sequence number on the follower.
		 * <p>
		 * API name: {@code follower_max_seq_no}
		 */
		public final Builder followerMaxSeqNo(long value) {
			this.followerMaxSeqNo = value;
			return this;
		}

		/**
		 * Required - The index settings version the follower is synced up to.
		 * <p>
		 * API name: {@code follower_settings_version}
		 */
		public final Builder followerSettingsVersion(long value) {
			this.followerSettingsVersion = value;
			return this;
		}

		/**
		 * Required - The starting sequence number of the last batch of operations
		 * requested from the leader.
		 * <p>
		 * API name: {@code last_requested_seq_no}
		 */
		public final Builder lastRequestedSeqNo(long value) {
			this.lastRequestedSeqNo = value;
			return this;
		}

		/**
		 * Required - The current global checkpoint on the leader known to the follower
		 * task.
		 * <p>
		 * API name: {@code leader_global_checkpoint}
		 */
		public final Builder leaderGlobalCheckpoint(long value) {
			this.leaderGlobalCheckpoint = value;
			return this;
		}

		/**
		 * Required - The name of the index in the leader cluster being followed.
		 * <p>
		 * API name: {@code leader_index}
		 */
		public final Builder leaderIndex(String value) {
			this.leaderIndex = value;
			return this;
		}

		/**
		 * Required - The current maximum sequence number on the leader known to the
		 * follower task.
		 * <p>
		 * API name: {@code leader_max_seq_no}
		 */
		public final Builder leaderMaxSeqNo(long value) {
			this.leaderMaxSeqNo = value;
			return this;
		}

		/**
		 * Required - The total number of operations read from the leader.
		 * <p>
		 * API name: {@code operations_read}
		 */
		public final Builder operationsRead(long value) {
			this.operationsRead = value;
			return this;
		}

		/**
		 * Required - The number of operations written on the follower.
		 * <p>
		 * API name: {@code operations_written}
		 */
		public final Builder operationsWritten(long value) {
			this.operationsWritten = value;
			return this;
		}

		/**
		 * Required - The number of active read requests from the follower.
		 * <p>
		 * API name: {@code outstanding_read_requests}
		 */
		public final Builder outstandingReadRequests(int value) {
			this.outstandingReadRequests = value;
			return this;
		}

		/**
		 * Required - The number of active bulk write requests on the follower.
		 * <p>
		 * API name: {@code outstanding_write_requests}
		 */
		public final Builder outstandingWriteRequests(int value) {
			this.outstandingWriteRequests = value;
			return this;
		}

		/**
		 * Required - An array of objects representing failed reads.
		 * <p>
		 * API name: {@code read_exceptions}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>readExceptions</code>.
		 */
		public final Builder readExceptions(List<ReadException> list) {
			this.readExceptions = _listAddAll(this.readExceptions, list);
			return this;
		}

		/**
		 * Required - An array of objects representing failed reads.
		 * <p>
		 * API name: {@code read_exceptions}
		 * <p>
		 * Adds one or more values to <code>readExceptions</code>.
		 */
		public final Builder readExceptions(ReadException value, ReadException... values) {
			this.readExceptions = _listAdd(this.readExceptions, value, values);
			return this;
		}

		/**
		 * Required - An array of objects representing failed reads.
		 * <p>
		 * API name: {@code read_exceptions}
		 * <p>
		 * Adds a value to <code>readExceptions</code> using a builder lambda.
		 */
		public final Builder readExceptions(Function<ReadException.Builder, ObjectBuilder<ReadException>> fn) {
			return readExceptions(fn.apply(new ReadException.Builder()).build());
		}

		/**
		 * Required - The remote cluster containing the leader index.
		 * <p>
		 * API name: {@code remote_cluster}
		 */
		public final Builder remoteCluster(String value) {
			this.remoteCluster = value;
			return this;
		}

		/**
		 * Required - The numerical shard ID, with values from 0 to one less than the
		 * number of replicas.
		 * <p>
		 * API name: {@code shard_id}
		 */
		public final Builder shardId(int value) {
			this.shardId = value;
			return this;
		}

		/**
		 * Required - The number of successful fetches.
		 * <p>
		 * API name: {@code successful_read_requests}
		 */
		public final Builder successfulReadRequests(long value) {
			this.successfulReadRequests = value;
			return this;
		}

		/**
		 * Required - The number of bulk write requests run on the follower.
		 * <p>
		 * API name: {@code successful_write_requests}
		 */
		public final Builder successfulWriteRequests(long value) {
			this.successfulWriteRequests = value;
			return this;
		}

		/**
		 * API name: {@code time_since_last_read}
		 */
		public final Builder timeSinceLastRead(@Nullable Time value) {
			this.timeSinceLastRead = value;
			return this;
		}

		/**
		 * API name: {@code time_since_last_read}
		 */
		public final Builder timeSinceLastRead(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeSinceLastRead(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The number of milliseconds since a read request was sent to the
		 * leader. When the follower is caught up to the leader, this number will
		 * increase up to the configured <code>read_poll_timeout</code> at which point
		 * another read request will be sent to the leader.
		 * <p>
		 * API name: {@code time_since_last_read_millis}
		 */
		public final Builder timeSinceLastReadMillis(long value) {
			this.timeSinceLastReadMillis = value;
			return this;
		}

		/**
		 * API name: {@code total_read_remote_exec_time}
		 */
		public final Builder totalReadRemoteExecTime(@Nullable Time value) {
			this.totalReadRemoteExecTime = value;
			return this;
		}

		/**
		 * API name: {@code total_read_remote_exec_time}
		 */
		public final Builder totalReadRemoteExecTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.totalReadRemoteExecTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The total time reads spent running on the remote cluster.
		 * <p>
		 * API name: {@code total_read_remote_exec_time_millis}
		 */
		public final Builder totalReadRemoteExecTimeMillis(long value) {
			this.totalReadRemoteExecTimeMillis = value;
			return this;
		}

		/**
		 * API name: {@code total_read_time}
		 */
		public final Builder totalReadTime(@Nullable Time value) {
			this.totalReadTime = value;
			return this;
		}

		/**
		 * API name: {@code total_read_time}
		 */
		public final Builder totalReadTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.totalReadTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The total time reads were outstanding, measured from the time a
		 * read was sent to the leader to the time a reply was returned to the follower.
		 * <p>
		 * API name: {@code total_read_time_millis}
		 */
		public final Builder totalReadTimeMillis(long value) {
			this.totalReadTimeMillis = value;
			return this;
		}

		/**
		 * API name: {@code total_write_time}
		 */
		public final Builder totalWriteTime(@Nullable Time value) {
			this.totalWriteTime = value;
			return this;
		}

		/**
		 * API name: {@code total_write_time}
		 */
		public final Builder totalWriteTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.totalWriteTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The total time spent writing on the follower.
		 * <p>
		 * API name: {@code total_write_time_millis}
		 */
		public final Builder totalWriteTimeMillis(long value) {
			this.totalWriteTimeMillis = value;
			return this;
		}

		/**
		 * Required - The number of write operations queued on the follower.
		 * <p>
		 * API name: {@code write_buffer_operation_count}
		 */
		public final Builder writeBufferOperationCount(long value) {
			this.writeBufferOperationCount = value;
			return this;
		}

		/**
		 * Required - The total number of bytes of operations currently queued for
		 * writing.
		 * <p>
		 * API name: {@code write_buffer_size_in_bytes}
		 */
		public final Builder writeBufferSizeInBytes(String value) {
			this.writeBufferSizeInBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShardStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardStats build() {
			_checkSingleUse();

			return new ShardStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardStats}
	 */
	public static final JsonpDeserializer<ShardStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShardStats::setupShardStatsDeserializer);

	protected static void setupShardStatsDeserializer(ObjectDeserializer<ShardStats.Builder> op) {

		op.add(Builder::bytesRead, JsonpDeserializer.longDeserializer(), "bytes_read");
		op.add(Builder::failedReadRequests, JsonpDeserializer.longDeserializer(), "failed_read_requests");
		op.add(Builder::failedWriteRequests, JsonpDeserializer.longDeserializer(), "failed_write_requests");
		op.add(Builder::fatalException, ErrorCause._DESERIALIZER, "fatal_exception");
		op.add(Builder::followerAliasesVersion, JsonpDeserializer.longDeserializer(), "follower_aliases_version");
		op.add(Builder::followerGlobalCheckpoint, JsonpDeserializer.longDeserializer(), "follower_global_checkpoint");
		op.add(Builder::followerIndex, JsonpDeserializer.stringDeserializer(), "follower_index");
		op.add(Builder::followerMappingVersion, JsonpDeserializer.longDeserializer(), "follower_mapping_version");
		op.add(Builder::followerMaxSeqNo, JsonpDeserializer.longDeserializer(), "follower_max_seq_no");
		op.add(Builder::followerSettingsVersion, JsonpDeserializer.longDeserializer(), "follower_settings_version");
		op.add(Builder::lastRequestedSeqNo, JsonpDeserializer.longDeserializer(), "last_requested_seq_no");
		op.add(Builder::leaderGlobalCheckpoint, JsonpDeserializer.longDeserializer(), "leader_global_checkpoint");
		op.add(Builder::leaderIndex, JsonpDeserializer.stringDeserializer(), "leader_index");
		op.add(Builder::leaderMaxSeqNo, JsonpDeserializer.longDeserializer(), "leader_max_seq_no");
		op.add(Builder::operationsRead, JsonpDeserializer.longDeserializer(), "operations_read");
		op.add(Builder::operationsWritten, JsonpDeserializer.longDeserializer(), "operations_written");
		op.add(Builder::outstandingReadRequests, JsonpDeserializer.integerDeserializer(), "outstanding_read_requests");
		op.add(Builder::outstandingWriteRequests, JsonpDeserializer.integerDeserializer(),
				"outstanding_write_requests");
		op.add(Builder::readExceptions, JsonpDeserializer.arrayDeserializer(ReadException._DESERIALIZER),
				"read_exceptions");
		op.add(Builder::remoteCluster, JsonpDeserializer.stringDeserializer(), "remote_cluster");
		op.add(Builder::shardId, JsonpDeserializer.integerDeserializer(), "shard_id");
		op.add(Builder::successfulReadRequests, JsonpDeserializer.longDeserializer(), "successful_read_requests");
		op.add(Builder::successfulWriteRequests, JsonpDeserializer.longDeserializer(), "successful_write_requests");
		op.add(Builder::timeSinceLastRead, Time._DESERIALIZER, "time_since_last_read");
		op.add(Builder::timeSinceLastReadMillis, JsonpDeserializer.longDeserializer(), "time_since_last_read_millis");
		op.add(Builder::totalReadRemoteExecTime, Time._DESERIALIZER, "total_read_remote_exec_time");
		op.add(Builder::totalReadRemoteExecTimeMillis, JsonpDeserializer.longDeserializer(),
				"total_read_remote_exec_time_millis");
		op.add(Builder::totalReadTime, Time._DESERIALIZER, "total_read_time");
		op.add(Builder::totalReadTimeMillis, JsonpDeserializer.longDeserializer(), "total_read_time_millis");
		op.add(Builder::totalWriteTime, Time._DESERIALIZER, "total_write_time");
		op.add(Builder::totalWriteTimeMillis, JsonpDeserializer.longDeserializer(), "total_write_time_millis");
		op.add(Builder::writeBufferOperationCount, JsonpDeserializer.longDeserializer(),
				"write_buffer_operation_count");
		op.add(Builder::writeBufferSizeInBytes, JsonpDeserializer.stringDeserializer(), "write_buffer_size_in_bytes");

	}

}
