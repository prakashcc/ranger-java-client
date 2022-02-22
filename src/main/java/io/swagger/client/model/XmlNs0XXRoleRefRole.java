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
import io.swagger.client.model.XmlNs0XXDBBase;
import java.io.IOException;

/**
 * The persistent class for the x_role_ref_role database table.
 */
@ApiModel(description = "The persistent class for the x_role_ref_role database table.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class XmlNs0XXRoleRefRole extends XmlNs0XXDBBase {
  @SerializedName("roleId")
  private Long roleId = null;

  @SerializedName("subRoleId")
  private Long subRoleId = null;

  @SerializedName("subRoleName")
  private String subRoleName = null;

  @SerializedName("subRoleType")
  private Integer subRoleType = null;

  public XmlNs0XXRoleRefRole roleId(Long roleId) {
    this.roleId = roleId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;roleId&lt;/b&gt;
   * @return roleId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>roleId</b>")
  public Long getRoleId() {
    return roleId;
  }

  public void setRoleId(Long roleId) {
    this.roleId = roleId;
  }

  public XmlNs0XXRoleRefRole subRoleId(Long subRoleId) {
    this.subRoleId = subRoleId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;subRoleId&lt;/b&gt;
   * @return subRoleId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>subRoleId</b>")
  public Long getSubRoleId() {
    return subRoleId;
  }

  public void setSubRoleId(Long subRoleId) {
    this.subRoleId = subRoleId;
  }

  public XmlNs0XXRoleRefRole subRoleName(String subRoleName) {
    this.subRoleName = subRoleName;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;subRoleName&lt;/b&gt;
   * @return subRoleName
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>subRoleName</b>")
  public String getSubRoleName() {
    return subRoleName;
  }

  public void setSubRoleName(String subRoleName) {
    this.subRoleName = subRoleName;
  }

  public XmlNs0XXRoleRefRole subRoleType(Integer subRoleType) {
    this.subRoleType = subRoleType;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;subRoleType&lt;/b&gt;
   * @return subRoleType
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>subRoleType</b>")
  public Integer getSubRoleType() {
    return subRoleType;
  }

  public void setSubRoleType(Integer subRoleType) {
    this.subRoleType = subRoleType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlNs0XXRoleRefRole xmlNs0XXRoleRefRole = (XmlNs0XXRoleRefRole) o;
    return Objects.equals(this.roleId, xmlNs0XXRoleRefRole.roleId) &&
        Objects.equals(this.subRoleId, xmlNs0XXRoleRefRole.subRoleId) &&
        Objects.equals(this.subRoleName, xmlNs0XXRoleRefRole.subRoleName) &&
        Objects.equals(this.subRoleType, xmlNs0XXRoleRefRole.subRoleType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleId, subRoleId, subRoleName, subRoleType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0XXRoleRefRole {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    subRoleId: ").append(toIndentedString(subRoleId)).append("\n");
    sb.append("    subRoleName: ").append(toIndentedString(subRoleName)).append("\n");
    sb.append("    subRoleType: ").append(toIndentedString(subRoleType)).append("\n");
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

