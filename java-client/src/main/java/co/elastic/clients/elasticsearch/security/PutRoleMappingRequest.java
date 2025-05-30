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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.Refresh;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonData;
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
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

// typedef: security.put_role_mapping.Request

/**
 * Create or update role mappings.
 * <p>
 * Role mappings define which roles are assigned to each user. Each mapping has
 * rules that identify users and a list of roles that are granted to those
 * users. The role mapping APIs are generally the preferred way to manage role
 * mappings rather than using role mapping files. The create or update role
 * mappings API cannot update role mappings that are defined in role mapping
 * files.
 * <p>
 * NOTE: This API does not create roles. Rather, it maps users to existing
 * roles. Roles can be created by using the create or update roles API or roles
 * files.
 * <p>
 * <strong>Role templates</strong>
 * <p>
 * The most common use for role mappings is to create a mapping from a known
 * value on the user to a fixed role name. For example, all users in the
 * <code>cn=admin,dc=example,dc=com</code> LDAP group should be given the
 * superuser role in Elasticsearch. The <code>roles</code> field is used for
 * this purpose.
 * <p>
 * For more complex needs, it is possible to use Mustache templates to
 * dynamically determine the names of the roles that should be granted to the
 * user. The <code>role_templates</code> field is used for this purpose.
 * <p>
 * NOTE: To use role templates successfully, the relevant scripting feature must
 * be enabled. Otherwise, all attempts to create a role mapping with role
 * templates fail.
 * <p>
 * All of the user fields that are available in the role mapping rules are also
 * available in the role templates. Thus it is possible to assign a user to a
 * role that reflects their username, their groups, or the name of the realm to
 * which they authenticated.
 * <p>
 * By default a template is evaluated to produce a single string that is the
 * name of the role which should be assigned to the user. If the format of the
 * template is set to &quot;json&quot; then the template is expected to produce
 * a JSON string or an array of JSON strings for the role names.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.put_role_mapping.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutRoleMappingRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean enabled;

	private final Map<String, JsonData> metadata;

	private final String name;

	@Nullable
	private final Refresh refresh;

	private final List<RoleTemplate> roleTemplates;

	private final List<String> roles;

	@Nullable
	private final RoleMappingRule rules;

	private final List<String> runAs;

	// ---------------------------------------------------------------------------------------------

	private PutRoleMappingRequest(Builder builder) {

		this.enabled = builder.enabled;
		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.refresh = builder.refresh;
		this.roleTemplates = ApiTypeHelper.unmodifiable(builder.roleTemplates);
		this.roles = ApiTypeHelper.unmodifiable(builder.roles);
		this.rules = builder.rules;
		this.runAs = ApiTypeHelper.unmodifiable(builder.runAs);

	}

	public static PutRoleMappingRequest of(Function<Builder, ObjectBuilder<PutRoleMappingRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Mappings that have <code>enabled</code> set to <code>false</code> are ignored
	 * when role mapping is performed.
	 * <p>
	 * API name: {@code enabled}
	 */
	@Nullable
	public final Boolean enabled() {
		return this.enabled;
	}

	/**
	 * Additional metadata that helps define which roles are assigned to each user.
	 * Within the metadata object, keys beginning with <code>_</code> are reserved
	 * for system usage.
	 * <p>
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * Required - The distinct name that identifies the role mapping. The name is
	 * used solely as an identifier to facilitate interaction via the API; it does
	 * not affect the behavior of the mapping in any way.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * If <code>true</code> (the default) then refresh the affected shards to make
	 * this operation visible to search, if <code>wait_for</code> then wait for a
	 * refresh to make this operation visible to search, if <code>false</code> then
	 * do nothing with refreshes.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public final Refresh refresh() {
		return this.refresh;
	}

	/**
	 * A list of Mustache templates that will be evaluated to determine the roles
	 * names that should granted to the users that match the role mapping rules.
	 * Exactly one of <code>roles</code> or <code>role_templates</code> must be
	 * specified.
	 * <p>
	 * API name: {@code role_templates}
	 */
	public final List<RoleTemplate> roleTemplates() {
		return this.roleTemplates;
	}

	/**
	 * A list of role names that are granted to the users that match the role
	 * mapping rules. Exactly one of <code>roles</code> or
	 * <code>role_templates</code> must be specified.
	 * <p>
	 * API name: {@code roles}
	 */
	public final List<String> roles() {
		return this.roles;
	}

	/**
	 * The rules that determine which users should be matched by the mapping. A rule
	 * is a logical condition that is expressed by using a JSON DSL.
	 * <p>
	 * API name: {@code rules}
	 */
	@Nullable
	public final RoleMappingRule rules() {
		return this.rules;
	}

	/**
	 * API name: {@code run_as}
	 */
	public final List<String> runAs() {
		return this.runAs;
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

		if (this.enabled != null) {
			generator.writeKey("enabled");
			generator.write(this.enabled);

		}
		if (ApiTypeHelper.isDefined(this.metadata)) {
			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.roleTemplates)) {
			generator.writeKey("role_templates");
			generator.writeStartArray();
			for (RoleTemplate item0 : this.roleTemplates) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.roles)) {
			generator.writeKey("roles");
			generator.writeStartArray();
			for (String item0 : this.roles) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.rules != null) {
			generator.writeKey("rules");
			this.rules.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.runAs)) {
			generator.writeKey("run_as");
			generator.writeStartArray();
			for (String item0 : this.runAs) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutRoleMappingRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutRoleMappingRequest> {
		@Nullable
		private Boolean enabled;

		@Nullable
		private Map<String, JsonData> metadata;

		private String name;

		@Nullable
		private Refresh refresh;

		@Nullable
		private List<RoleTemplate> roleTemplates;

		@Nullable
		private List<String> roles;

		@Nullable
		private RoleMappingRule rules;

		@Nullable
		private List<String> runAs;

		/**
		 * Mappings that have <code>enabled</code> set to <code>false</code> are ignored
		 * when role mapping is performed.
		 * <p>
		 * API name: {@code enabled}
		 */
		public final Builder enabled(@Nullable Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * Additional metadata that helps define which roles are assigned to each user.
		 * Within the metadata object, keys beginning with <code>_</code> are reserved
		 * for system usage.
		 * <p>
		 * API name: {@code metadata}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>metadata</code>.
		 */
		public final Builder metadata(Map<String, JsonData> map) {
			this.metadata = _mapPutAll(this.metadata, map);
			return this;
		}

		/**
		 * Additional metadata that helps define which roles are assigned to each user.
		 * Within the metadata object, keys beginning with <code>_</code> are reserved
		 * for system usage.
		 * <p>
		 * API name: {@code metadata}
		 * <p>
		 * Adds an entry to <code>metadata</code>.
		 */
		public final Builder metadata(String key, JsonData value) {
			this.metadata = _mapPut(this.metadata, key, value);
			return this;
		}

		/**
		 * Required - The distinct name that identifies the role mapping. The name is
		 * used solely as an identifier to facilitate interaction via the API; it does
		 * not affect the behavior of the mapping in any way.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * If <code>true</code> (the default) then refresh the affected shards to make
		 * this operation visible to search, if <code>wait_for</code> then wait for a
		 * refresh to make this operation visible to search, if <code>false</code> then
		 * do nothing with refreshes.
		 * <p>
		 * API name: {@code refresh}
		 */
		public final Builder refresh(@Nullable Refresh value) {
			this.refresh = value;
			return this;
		}

		/**
		 * A list of Mustache templates that will be evaluated to determine the roles
		 * names that should granted to the users that match the role mapping rules.
		 * Exactly one of <code>roles</code> or <code>role_templates</code> must be
		 * specified.
		 * <p>
		 * API name: {@code role_templates}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>roleTemplates</code>.
		 */
		public final Builder roleTemplates(List<RoleTemplate> list) {
			this.roleTemplates = _listAddAll(this.roleTemplates, list);
			return this;
		}

		/**
		 * A list of Mustache templates that will be evaluated to determine the roles
		 * names that should granted to the users that match the role mapping rules.
		 * Exactly one of <code>roles</code> or <code>role_templates</code> must be
		 * specified.
		 * <p>
		 * API name: {@code role_templates}
		 * <p>
		 * Adds one or more values to <code>roleTemplates</code>.
		 */
		public final Builder roleTemplates(RoleTemplate value, RoleTemplate... values) {
			this.roleTemplates = _listAdd(this.roleTemplates, value, values);
			return this;
		}

		/**
		 * A list of Mustache templates that will be evaluated to determine the roles
		 * names that should granted to the users that match the role mapping rules.
		 * Exactly one of <code>roles</code> or <code>role_templates</code> must be
		 * specified.
		 * <p>
		 * API name: {@code role_templates}
		 * <p>
		 * Adds a value to <code>roleTemplates</code> using a builder lambda.
		 */
		public final Builder roleTemplates(Function<RoleTemplate.Builder, ObjectBuilder<RoleTemplate>> fn) {
			return roleTemplates(fn.apply(new RoleTemplate.Builder()).build());
		}

		/**
		 * A list of role names that are granted to the users that match the role
		 * mapping rules. Exactly one of <code>roles</code> or
		 * <code>role_templates</code> must be specified.
		 * <p>
		 * API name: {@code roles}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>roles</code>.
		 */
		public final Builder roles(List<String> list) {
			this.roles = _listAddAll(this.roles, list);
			return this;
		}

		/**
		 * A list of role names that are granted to the users that match the role
		 * mapping rules. Exactly one of <code>roles</code> or
		 * <code>role_templates</code> must be specified.
		 * <p>
		 * API name: {@code roles}
		 * <p>
		 * Adds one or more values to <code>roles</code>.
		 */
		public final Builder roles(String value, String... values) {
			this.roles = _listAdd(this.roles, value, values);
			return this;
		}

		/**
		 * The rules that determine which users should be matched by the mapping. A rule
		 * is a logical condition that is expressed by using a JSON DSL.
		 * <p>
		 * API name: {@code rules}
		 */
		public final Builder rules(@Nullable RoleMappingRule value) {
			this.rules = value;
			return this;
		}

		/**
		 * The rules that determine which users should be matched by the mapping. A rule
		 * is a logical condition that is expressed by using a JSON DSL.
		 * <p>
		 * API name: {@code rules}
		 */
		public final Builder rules(Function<RoleMappingRule.Builder, ObjectBuilder<RoleMappingRule>> fn) {
			return this.rules(fn.apply(new RoleMappingRule.Builder()).build());
		}

		/**
		 * The rules that determine which users should be matched by the mapping. A rule
		 * is a logical condition that is expressed by using a JSON DSL.
		 * <p>
		 * API name: {@code rules}
		 */
		public final Builder rules(RoleMappingRuleVariant value) {
			this.rules = value._toRoleMappingRule();
			return this;
		}

		/**
		 * API name: {@code run_as}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>runAs</code>.
		 */
		public final Builder runAs(List<String> list) {
			this.runAs = _listAddAll(this.runAs, list);
			return this;
		}

		/**
		 * API name: {@code run_as}
		 * <p>
		 * Adds one or more values to <code>runAs</code>.
		 */
		public final Builder runAs(String value, String... values) {
			this.runAs = _listAdd(this.runAs, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutRoleMappingRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutRoleMappingRequest build() {
			_checkSingleUse();

			return new PutRoleMappingRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutRoleMappingRequest}
	 */
	public static final JsonpDeserializer<PutRoleMappingRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutRoleMappingRequest::setupPutRoleMappingRequestDeserializer);

	protected static void setupPutRoleMappingRequestDeserializer(ObjectDeserializer<PutRoleMappingRequest.Builder> op) {

		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::roleTemplates, JsonpDeserializer.arrayDeserializer(RoleTemplate._DESERIALIZER),
				"role_templates");
		op.add(Builder::roles, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "roles");
		op.add(Builder::rules, RoleMappingRule._DESERIALIZER, "rules");
		op.add(Builder::runAs, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "run_as");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.put_role_mapping}".
	 */
	public static final Endpoint<PutRoleMappingRequest, PutRoleMappingResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.put_role_mapping",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/role_mapping");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					params.put("name", request.name);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.refresh != null) {
					params.put("refresh", request.refresh.jsonValue());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutRoleMappingResponse._DESERIALIZER);
}
