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
 * The persistent class for the x_role_ref_user database table.
 */
@ApiModel(description = "The persistent class for the x_role_ref_user database table.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class XmlNs0XXRoleRefUser extends XmlNs0XXDBBase {
  @SerializedName("roleId")
  private Long roleId = null;

  @SerializedName("userId")
  private Long userId = null;

  @SerializedName("userName")
  private String userName = null;

  @SerializedName("userType")
  private Integer userType = null;

  public XmlNs0XXRoleRefUser roleId(Long roleId) {
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

  public XmlNs0XXRoleRefUser userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;userId&lt;/b&gt;
   * @return userId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>userId</b>")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public XmlNs0XXRoleRefUser userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;userName&lt;/b&gt;
   * @return userName
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>userName</b>")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public XmlNs0XXRoleRefUser userType(Integer userType) {
    this.userType = userType;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;userType&lt;/b&gt;
   * @return userType
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>userType</b>")
  public Integer getUserType() {
    return userType;
  }

  public void setUserType(Integer userType) {
    this.userType = userType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlNs0XXRoleRefUser xmlNs0XXRoleRefUser = (XmlNs0XXRoleRefUser) o;
    return Objects.equals(this.roleId, xmlNs0XXRoleRefUser.roleId) &&
        Objects.equals(this.userId, xmlNs0XXRoleRefUser.userId) &&
        Objects.equals(this.userName, xmlNs0XXRoleRefUser.userName) &&
        Objects.equals(this.userType, xmlNs0XXRoleRefUser.userType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleId, userId, userName, userType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0XXRoleRefUser {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
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

