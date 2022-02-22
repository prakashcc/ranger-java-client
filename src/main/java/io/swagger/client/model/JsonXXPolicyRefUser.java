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
import io.swagger.client.model.JsonXXDBBase;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonXXPolicyRefUser extends JsonXXDBBase {
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("policyId")
  private BigDecimal policyId = null;

  @SerializedName("userId")
  private BigDecimal userId = null;

  @SerializedName("userName")
  private String userName = null;

  public JsonXXPolicyRefUser id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;id&lt;/b&gt;
   * @return id
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>id</b>")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public JsonXXPolicyRefUser policyId(BigDecimal policyId) {
    this.policyId = policyId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;policyId&lt;/b&gt;
   * @return policyId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>policyId</b>")
  public BigDecimal getPolicyId() {
    return policyId;
  }

  public void setPolicyId(BigDecimal policyId) {
    this.policyId = policyId;
  }

  public JsonXXPolicyRefUser userId(BigDecimal userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;userId&lt;/b&gt;
   * @return userId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>userId</b>")
  public BigDecimal getUserId() {
    return userId;
  }

  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }

  public JsonXXPolicyRefUser userName(String userName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonXXPolicyRefUser jsonXXPolicyRefUser = (JsonXXPolicyRefUser) o;
    return Objects.equals(this.id, jsonXXPolicyRefUser.id) &&
        Objects.equals(this.policyId, jsonXXPolicyRefUser.policyId) &&
        Objects.equals(this.userId, jsonXXPolicyRefUser.userId) &&
        Objects.equals(this.userName, jsonXXPolicyRefUser.userName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, policyId, userId, userName, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonXXPolicyRefUser {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

