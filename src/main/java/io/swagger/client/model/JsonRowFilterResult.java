/*
 * Ranger REST API
 * Apache Ranger is a framework to enable, monitor and manage comprehensive data security across the Hadoop platform. Apache Ranger currently provides a centralized security adminstration, fine grain access control and detailed auditing for user access within Apache Hadoop, Apache Hive, Apache HBase and other Apache components
 *
 * OpenAPI spec version: 2.2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.JsonRangerPolicyItemRowFilterInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonRowFilterResult {
  @SerializedName("isConditional")
  private Boolean isConditional = null;

  @SerializedName("filterInfo")
  private JsonRangerPolicyItemRowFilterInfo filterInfo = null;

  @SerializedName("groups")
  private List<String> groups = null;

  @SerializedName("roles")
  private List<String> roles = null;

  @SerializedName("accessTypes")
  private List<String> accessTypes = null;

  @SerializedName("users")
  private List<String> users = null;

  public JsonRowFilterResult isConditional(Boolean isConditional) {
    this.isConditional = isConditional;
    return this;
  }

   /**
   * 
   * @return isConditional
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsConditional() {
    return isConditional;
  }

  public void setIsConditional(Boolean isConditional) {
    this.isConditional = isConditional;
  }

  public JsonRowFilterResult filterInfo(JsonRangerPolicyItemRowFilterInfo filterInfo) {
    this.filterInfo = filterInfo;
    return this;
  }

   /**
   * Get filterInfo
   * @return filterInfo
  **/
  @ApiModelProperty(value = "")
  public JsonRangerPolicyItemRowFilterInfo getFilterInfo() {
    return filterInfo;
  }

  public void setFilterInfo(JsonRangerPolicyItemRowFilterInfo filterInfo) {
    this.filterInfo = filterInfo;
  }

  public JsonRowFilterResult groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public JsonRowFilterResult addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<String>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * 
   * @return groups
  **/
  @ApiModelProperty(value = "")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public JsonRowFilterResult roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public JsonRowFilterResult addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * 
   * @return roles
  **/
  @ApiModelProperty(value = "")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public JsonRowFilterResult accessTypes(List<String> accessTypes) {
    this.accessTypes = accessTypes;
    return this;
  }

  public JsonRowFilterResult addAccessTypesItem(String accessTypesItem) {
    if (this.accessTypes == null) {
      this.accessTypes = new ArrayList<String>();
    }
    this.accessTypes.add(accessTypesItem);
    return this;
  }

   /**
   * 
   * @return accessTypes
  **/
  @ApiModelProperty(value = "")
  public List<String> getAccessTypes() {
    return accessTypes;
  }

  public void setAccessTypes(List<String> accessTypes) {
    this.accessTypes = accessTypes;
  }

  public JsonRowFilterResult users(List<String> users) {
    this.users = users;
    return this;
  }

  public JsonRowFilterResult addUsersItem(String usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<String>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * 
   * @return users
  **/
  @ApiModelProperty(value = "")
  public List<String> getUsers() {
    return users;
  }

  public void setUsers(List<String> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonRowFilterResult jsonRowFilterResult = (JsonRowFilterResult) o;
    return Objects.equals(this.isConditional, jsonRowFilterResult.isConditional) &&
        Objects.equals(this.filterInfo, jsonRowFilterResult.filterInfo) &&
        Objects.equals(this.groups, jsonRowFilterResult.groups) &&
        Objects.equals(this.roles, jsonRowFilterResult.roles) &&
        Objects.equals(this.accessTypes, jsonRowFilterResult.accessTypes) &&
        Objects.equals(this.users, jsonRowFilterResult.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isConditional, filterInfo, groups, roles, accessTypes, users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonRowFilterResult {\n");
    
    sb.append("    isConditional: ").append(toIndentedString(isConditional)).append("\n");
    sb.append("    filterInfo: ").append(toIndentedString(filterInfo)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    accessTypes: ").append(toIndentedString(accessTypes)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

