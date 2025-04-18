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

package co.elastic.clients.elasticsearch.nodes;

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
import java.lang.Long;
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

// typedef: nodes._types.ClusterStateUpdate

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.ClusterStateUpdate">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterStateUpdate implements JsonpSerializable {
	private final long count;

	@Nullable
	private final Time computationTime;

	@Nullable
	private final Long computationTimeMillis;

	@Nullable
	private final Time publicationTime;

	@Nullable
	private final Long publicationTimeMillis;

	@Nullable
	private final Time contextConstructionTime;

	@Nullable
	private final Long contextConstructionTimeMillis;

	@Nullable
	private final Time commitTime;

	@Nullable
	private final Long commitTimeMillis;

	@Nullable
	private final Time completionTime;

	@Nullable
	private final Long completionTimeMillis;

	@Nullable
	private final Time masterApplyTime;

	@Nullable
	private final Long masterApplyTimeMillis;

	@Nullable
	private final Time notificationTime;

	@Nullable
	private final Long notificationTimeMillis;

	// ---------------------------------------------------------------------------------------------

	private ClusterStateUpdate(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count", 0);
		this.computationTime = builder.computationTime;
		this.computationTimeMillis = builder.computationTimeMillis;
		this.publicationTime = builder.publicationTime;
		this.publicationTimeMillis = builder.publicationTimeMillis;
		this.contextConstructionTime = builder.contextConstructionTime;
		this.contextConstructionTimeMillis = builder.contextConstructionTimeMillis;
		this.commitTime = builder.commitTime;
		this.commitTimeMillis = builder.commitTimeMillis;
		this.completionTime = builder.completionTime;
		this.completionTimeMillis = builder.completionTimeMillis;
		this.masterApplyTime = builder.masterApplyTime;
		this.masterApplyTimeMillis = builder.masterApplyTimeMillis;
		this.notificationTime = builder.notificationTime;
		this.notificationTimeMillis = builder.notificationTimeMillis;

	}

	public static ClusterStateUpdate of(Function<Builder, ObjectBuilder<ClusterStateUpdate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The number of cluster state update attempts that did not change
	 * the cluster state since the node started.
	 * <p>
	 * API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * The cumulative amount of time spent computing no-op cluster state updates
	 * since the node started.
	 * <p>
	 * API name: {@code computation_time}
	 */
	@Nullable
	public final Time computationTime() {
		return this.computationTime;
	}

	/**
	 * The cumulative amount of time, in milliseconds, spent computing no-op cluster
	 * state updates since the node started.
	 * <p>
	 * API name: {@code computation_time_millis}
	 */
	@Nullable
	public final Long computationTimeMillis() {
		return this.computationTimeMillis;
	}

	/**
	 * The cumulative amount of time spent publishing cluster state updates which
	 * ultimately succeeded, which includes everything from the start of the
	 * publication (just after the computation of the new cluster state) until the
	 * publication has finished and the master node is ready to start processing the
	 * next state update. This includes the time measured by
	 * <code>context_construction_time</code>, <code>commit_time</code>,
	 * <code>completion_time</code> and <code>master_apply_time</code>.
	 * <p>
	 * API name: {@code publication_time}
	 */
	@Nullable
	public final Time publicationTime() {
		return this.publicationTime;
	}

	/**
	 * The cumulative amount of time, in milliseconds, spent publishing cluster
	 * state updates which ultimately succeeded, which includes everything from the
	 * start of the publication (just after the computation of the new cluster
	 * state) until the publication has finished and the master node is ready to
	 * start processing the next state update. This includes the time measured by
	 * <code>context_construction_time</code>, <code>commit_time</code>,
	 * <code>completion_time</code> and <code>master_apply_time</code>.
	 * <p>
	 * API name: {@code publication_time_millis}
	 */
	@Nullable
	public final Long publicationTimeMillis() {
		return this.publicationTimeMillis;
	}

	/**
	 * The cumulative amount of time spent constructing a publication context since
	 * the node started for publications that ultimately succeeded. This statistic
	 * includes the time spent computing the difference between the current and new
	 * cluster state preparing a serialized representation of this difference.
	 * <p>
	 * API name: {@code context_construction_time}
	 */
	@Nullable
	public final Time contextConstructionTime() {
		return this.contextConstructionTime;
	}

	/**
	 * The cumulative amount of time, in milliseconds, spent constructing a
	 * publication context since the node started for publications that ultimately
	 * succeeded. This statistic includes the time spent computing the difference
	 * between the current and new cluster state preparing a serialized
	 * representation of this difference.
	 * <p>
	 * API name: {@code context_construction_time_millis}
	 */
	@Nullable
	public final Long contextConstructionTimeMillis() {
		return this.contextConstructionTimeMillis;
	}

	/**
	 * The cumulative amount of time spent waiting for a successful cluster state
	 * update to commit, which measures the time from the start of each publication
	 * until a majority of the master-eligible nodes have written the state to disk
	 * and confirmed the write to the elected master.
	 * <p>
	 * API name: {@code commit_time}
	 */
	@Nullable
	public final Time commitTime() {
		return this.commitTime;
	}

	/**
	 * The cumulative amount of time, in milliseconds, spent waiting for a
	 * successful cluster state update to commit, which measures the time from the
	 * start of each publication until a majority of the master-eligible nodes have
	 * written the state to disk and confirmed the write to the elected master.
	 * <p>
	 * API name: {@code commit_time_millis}
	 */
	@Nullable
	public final Long commitTimeMillis() {
		return this.commitTimeMillis;
	}

	/**
	 * The cumulative amount of time spent waiting for a successful cluster state
	 * update to complete, which measures the time from the start of each
	 * publication until all the other nodes have notified the elected master that
	 * they have applied the cluster state.
	 * <p>
	 * API name: {@code completion_time}
	 */
	@Nullable
	public final Time completionTime() {
		return this.completionTime;
	}

	/**
	 * The cumulative amount of time, in milliseconds, spent waiting for a
	 * successful cluster state update to complete, which measures the time from the
	 * start of each publication until all the other nodes have notified the elected
	 * master that they have applied the cluster state.
	 * <p>
	 * API name: {@code completion_time_millis}
	 */
	@Nullable
	public final Long completionTimeMillis() {
		return this.completionTimeMillis;
	}

	/**
	 * The cumulative amount of time spent successfully applying cluster state
	 * updates on the elected master since the node started.
	 * <p>
	 * API name: {@code master_apply_time}
	 */
	@Nullable
	public final Time masterApplyTime() {
		return this.masterApplyTime;
	}

	/**
	 * The cumulative amount of time, in milliseconds, spent successfully applying
	 * cluster state updates on the elected master since the node started.
	 * <p>
	 * API name: {@code master_apply_time_millis}
	 */
	@Nullable
	public final Long masterApplyTimeMillis() {
		return this.masterApplyTimeMillis;
	}

	/**
	 * The cumulative amount of time spent notifying listeners of a no-op cluster
	 * state update since the node started.
	 * <p>
	 * API name: {@code notification_time}
	 */
	@Nullable
	public final Time notificationTime() {
		return this.notificationTime;
	}

	/**
	 * The cumulative amount of time, in milliseconds, spent notifying listeners of
	 * a no-op cluster state update since the node started.
	 * <p>
	 * API name: {@code notification_time_millis}
	 */
	@Nullable
	public final Long notificationTimeMillis() {
		return this.notificationTimeMillis;
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

		generator.writeKey("count");
		generator.write(this.count);

		if (this.computationTime != null) {
			generator.writeKey("computation_time");
			this.computationTime.serialize(generator, mapper);

		}
		if (this.computationTimeMillis != null) {
			generator.writeKey("computation_time_millis");
			generator.write(this.computationTimeMillis);

		}
		if (this.publicationTime != null) {
			generator.writeKey("publication_time");
			this.publicationTime.serialize(generator, mapper);

		}
		if (this.publicationTimeMillis != null) {
			generator.writeKey("publication_time_millis");
			generator.write(this.publicationTimeMillis);

		}
		if (this.contextConstructionTime != null) {
			generator.writeKey("context_construction_time");
			this.contextConstructionTime.serialize(generator, mapper);

		}
		if (this.contextConstructionTimeMillis != null) {
			generator.writeKey("context_construction_time_millis");
			generator.write(this.contextConstructionTimeMillis);

		}
		if (this.commitTime != null) {
			generator.writeKey("commit_time");
			this.commitTime.serialize(generator, mapper);

		}
		if (this.commitTimeMillis != null) {
			generator.writeKey("commit_time_millis");
			generator.write(this.commitTimeMillis);

		}
		if (this.completionTime != null) {
			generator.writeKey("completion_time");
			this.completionTime.serialize(generator, mapper);

		}
		if (this.completionTimeMillis != null) {
			generator.writeKey("completion_time_millis");
			generator.write(this.completionTimeMillis);

		}
		if (this.masterApplyTime != null) {
			generator.writeKey("master_apply_time");
			this.masterApplyTime.serialize(generator, mapper);

		}
		if (this.masterApplyTimeMillis != null) {
			generator.writeKey("master_apply_time_millis");
			generator.write(this.masterApplyTimeMillis);

		}
		if (this.notificationTime != null) {
			generator.writeKey("notification_time");
			this.notificationTime.serialize(generator, mapper);

		}
		if (this.notificationTimeMillis != null) {
			generator.writeKey("notification_time_millis");
			generator.write(this.notificationTimeMillis);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterStateUpdate}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ClusterStateUpdate> {
		private Long count;

		@Nullable
		private Time computationTime;

		@Nullable
		private Long computationTimeMillis;

		@Nullable
		private Time publicationTime;

		@Nullable
		private Long publicationTimeMillis;

		@Nullable
		private Time contextConstructionTime;

		@Nullable
		private Long contextConstructionTimeMillis;

		@Nullable
		private Time commitTime;

		@Nullable
		private Long commitTimeMillis;

		@Nullable
		private Time completionTime;

		@Nullable
		private Long completionTimeMillis;

		@Nullable
		private Time masterApplyTime;

		@Nullable
		private Long masterApplyTimeMillis;

		@Nullable
		private Time notificationTime;

		@Nullable
		private Long notificationTimeMillis;

		/**
		 * Required - The number of cluster state update attempts that did not change
		 * the cluster state since the node started.
		 * <p>
		 * API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * The cumulative amount of time spent computing no-op cluster state updates
		 * since the node started.
		 * <p>
		 * API name: {@code computation_time}
		 */
		public final Builder computationTime(@Nullable Time value) {
			this.computationTime = value;
			return this;
		}

		/**
		 * The cumulative amount of time spent computing no-op cluster state updates
		 * since the node started.
		 * <p>
		 * API name: {@code computation_time}
		 */
		public final Builder computationTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.computationTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The cumulative amount of time, in milliseconds, spent computing no-op cluster
		 * state updates since the node started.
		 * <p>
		 * API name: {@code computation_time_millis}
		 */
		public final Builder computationTimeMillis(@Nullable Long value) {
			this.computationTimeMillis = value;
			return this;
		}

		/**
		 * The cumulative amount of time spent publishing cluster state updates which
		 * ultimately succeeded, which includes everything from the start of the
		 * publication (just after the computation of the new cluster state) until the
		 * publication has finished and the master node is ready to start processing the
		 * next state update. This includes the time measured by
		 * <code>context_construction_time</code>, <code>commit_time</code>,
		 * <code>completion_time</code> and <code>master_apply_time</code>.
		 * <p>
		 * API name: {@code publication_time}
		 */
		public final Builder publicationTime(@Nullable Time value) {
			this.publicationTime = value;
			return this;
		}

		/**
		 * The cumulative amount of time spent publishing cluster state updates which
		 * ultimately succeeded, which includes everything from the start of the
		 * publication (just after the computation of the new cluster state) until the
		 * publication has finished and the master node is ready to start processing the
		 * next state update. This includes the time measured by
		 * <code>context_construction_time</code>, <code>commit_time</code>,
		 * <code>completion_time</code> and <code>master_apply_time</code>.
		 * <p>
		 * API name: {@code publication_time}
		 */
		public final Builder publicationTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.publicationTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The cumulative amount of time, in milliseconds, spent publishing cluster
		 * state updates which ultimately succeeded, which includes everything from the
		 * start of the publication (just after the computation of the new cluster
		 * state) until the publication has finished and the master node is ready to
		 * start processing the next state update. This includes the time measured by
		 * <code>context_construction_time</code>, <code>commit_time</code>,
		 * <code>completion_time</code> and <code>master_apply_time</code>.
		 * <p>
		 * API name: {@code publication_time_millis}
		 */
		public final Builder publicationTimeMillis(@Nullable Long value) {
			this.publicationTimeMillis = value;
			return this;
		}

		/**
		 * The cumulative amount of time spent constructing a publication context since
		 * the node started for publications that ultimately succeeded. This statistic
		 * includes the time spent computing the difference between the current and new
		 * cluster state preparing a serialized representation of this difference.
		 * <p>
		 * API name: {@code context_construction_time}
		 */
		public final Builder contextConstructionTime(@Nullable Time value) {
			this.contextConstructionTime = value;
			return this;
		}

		/**
		 * The cumulative amount of time spent constructing a publication context since
		 * the node started for publications that ultimately succeeded. This statistic
		 * includes the time spent computing the difference between the current and new
		 * cluster state preparing a serialized representation of this difference.
		 * <p>
		 * API name: {@code context_construction_time}
		 */
		public final Builder contextConstructionTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.contextConstructionTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The cumulative amount of time, in milliseconds, spent constructing a
		 * publication context since the node started for publications that ultimately
		 * succeeded. This statistic includes the time spent computing the difference
		 * between the current and new cluster state preparing a serialized
		 * representation of this difference.
		 * <p>
		 * API name: {@code context_construction_time_millis}
		 */
		public final Builder contextConstructionTimeMillis(@Nullable Long value) {
			this.contextConstructionTimeMillis = value;
			return this;
		}

		/**
		 * The cumulative amount of time spent waiting for a successful cluster state
		 * update to commit, which measures the time from the start of each publication
		 * until a majority of the master-eligible nodes have written the state to disk
		 * and confirmed the write to the elected master.
		 * <p>
		 * API name: {@code commit_time}
		 */
		public final Builder commitTime(@Nullable Time value) {
			this.commitTime = value;
			return this;
		}

		/**
		 * The cumulative amount of time spent waiting for a successful cluster state
		 * update to commit, which measures the time from the start of each publication
		 * until a majority of the master-eligible nodes have written the state to disk
		 * and confirmed the write to the elected master.
		 * <p>
		 * API name: {@code commit_time}
		 */
		public final Builder commitTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.commitTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The cumulative amount of time, in milliseconds, spent waiting for a
		 * successful cluster state update to commit, which measures the time from the
		 * start of each publication until a majority of the master-eligible nodes have
		 * written the state to disk and confirmed the write to the elected master.
		 * <p>
		 * API name: {@code commit_time_millis}
		 */
		public final Builder commitTimeMillis(@Nullable Long value) {
			this.commitTimeMillis = value;
			return this;
		}

		/**
		 * The cumulative amount of time spent waiting for a successful cluster state
		 * update to complete, which measures the time from the start of each
		 * publication until all the other nodes have notified the elected master that
		 * they have applied the cluster state.
		 * <p>
		 * API name: {@code completion_time}
		 */
		public final Builder completionTime(@Nullable Time value) {
			this.completionTime = value;
			return this;
		}

		/**
		 * The cumulative amount of time spent waiting for a successful cluster state
		 * update to complete, which measures the time from the start of each
		 * publication until all the other nodes have notified the elected master that
		 * they have applied the cluster state.
		 * <p>
		 * API name: {@code completion_time}
		 */
		public final Builder completionTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.completionTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The cumulative amount of time, in milliseconds, spent waiting for a
		 * successful cluster state update to complete, which measures the time from the
		 * start of each publication until all the other nodes have notified the elected
		 * master that they have applied the cluster state.
		 * <p>
		 * API name: {@code completion_time_millis}
		 */
		public final Builder completionTimeMillis(@Nullable Long value) {
			this.completionTimeMillis = value;
			return this;
		}

		/**
		 * The cumulative amount of time spent successfully applying cluster state
		 * updates on the elected master since the node started.
		 * <p>
		 * API name: {@code master_apply_time}
		 */
		public final Builder masterApplyTime(@Nullable Time value) {
			this.masterApplyTime = value;
			return this;
		}

		/**
		 * The cumulative amount of time spent successfully applying cluster state
		 * updates on the elected master since the node started.
		 * <p>
		 * API name: {@code master_apply_time}
		 */
		public final Builder masterApplyTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterApplyTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The cumulative amount of time, in milliseconds, spent successfully applying
		 * cluster state updates on the elected master since the node started.
		 * <p>
		 * API name: {@code master_apply_time_millis}
		 */
		public final Builder masterApplyTimeMillis(@Nullable Long value) {
			this.masterApplyTimeMillis = value;
			return this;
		}

		/**
		 * The cumulative amount of time spent notifying listeners of a no-op cluster
		 * state update since the node started.
		 * <p>
		 * API name: {@code notification_time}
		 */
		public final Builder notificationTime(@Nullable Time value) {
			this.notificationTime = value;
			return this;
		}

		/**
		 * The cumulative amount of time spent notifying listeners of a no-op cluster
		 * state update since the node started.
		 * <p>
		 * API name: {@code notification_time}
		 */
		public final Builder notificationTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.notificationTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The cumulative amount of time, in milliseconds, spent notifying listeners of
		 * a no-op cluster state update since the node started.
		 * <p>
		 * API name: {@code notification_time_millis}
		 */
		public final Builder notificationTimeMillis(@Nullable Long value) {
			this.notificationTimeMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClusterStateUpdate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterStateUpdate build() {
			_checkSingleUse();

			return new ClusterStateUpdate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterStateUpdate}
	 */
	public static final JsonpDeserializer<ClusterStateUpdate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterStateUpdate::setupClusterStateUpdateDeserializer);

	protected static void setupClusterStateUpdateDeserializer(ObjectDeserializer<ClusterStateUpdate.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::computationTime, Time._DESERIALIZER, "computation_time");
		op.add(Builder::computationTimeMillis, JsonpDeserializer.longDeserializer(), "computation_time_millis");
		op.add(Builder::publicationTime, Time._DESERIALIZER, "publication_time");
		op.add(Builder::publicationTimeMillis, JsonpDeserializer.longDeserializer(), "publication_time_millis");
		op.add(Builder::contextConstructionTime, Time._DESERIALIZER, "context_construction_time");
		op.add(Builder::contextConstructionTimeMillis, JsonpDeserializer.longDeserializer(),
				"context_construction_time_millis");
		op.add(Builder::commitTime, Time._DESERIALIZER, "commit_time");
		op.add(Builder::commitTimeMillis, JsonpDeserializer.longDeserializer(), "commit_time_millis");
		op.add(Builder::completionTime, Time._DESERIALIZER, "completion_time");
		op.add(Builder::completionTimeMillis, JsonpDeserializer.longDeserializer(), "completion_time_millis");
		op.add(Builder::masterApplyTime, Time._DESERIALIZER, "master_apply_time");
		op.add(Builder::masterApplyTimeMillis, JsonpDeserializer.longDeserializer(), "master_apply_time_millis");
		op.add(Builder::notificationTime, Time._DESERIALIZER, "notification_time");
		op.add(Builder::notificationTimeMillis, JsonpDeserializer.longDeserializer(), "notification_time_millis");

	}

}
