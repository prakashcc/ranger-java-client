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
import io.swagger.client.model.XmlNs0RangerRole;
import io.swagger.client.model.XmlNs0VList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class XmlNs0RangerRoleList extends XmlNs0VList {
  @SerializedName("roles")
  private List<XmlNs0RangerRole> roles = null;

  public XmlNs0RangerRoleList roles(List<XmlNs0RangerRole> roles) {
    this.roles = roles;
    return this;
  }

  public XmlNs0RangerRoleList addRolesItem(XmlNs0RangerRole rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<XmlNs0RangerRole>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * 
   * @return roles
  **/
  @ApiModelProperty(value = "")
  public List<XmlNs0RangerRole> getRoles() {
    return roles;
  }

  public void setRoles(List<XmlNs0RangerRole> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlNs0RangerRoleList xmlNs0RangerRoleList = (XmlNs0RangerRoleList) o;
    return Objects.equals(this.roles, xmlNs0RangerRoleList.roles) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roles, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0RangerRoleList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

