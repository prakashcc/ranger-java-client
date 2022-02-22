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
public class JsonXXPolicyItemAccess extends JsonXXDBBase {
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("GUID")
  private String GUID = null;

  @SerializedName("policyitemid")
  private BigDecimal policyitemid = null;

  @SerializedName("type")
  private BigDecimal type = null;

  @SerializedName("isallowed")
  private Boolean isallowed = null;

  @SerializedName("order")
  private BigDecimal order = null;

  public JsonXXPolicyItemAccess id(BigDecimal id) {
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

  public JsonXXPolicyItemAccess GUID(String GUID) {
    this.GUID = GUID;
    return this;
  }

   /**
   * 
   * @return GUID
  **/
  @ApiModelProperty(value = "")
  public String getGUID() {
    return GUID;
  }

  public void setGUID(String GUID) {
    this.GUID = GUID;
  }

  public JsonXXPolicyItemAccess policyitemid(BigDecimal policyitemid) {
    this.policyitemid = policyitemid;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;policyItemId&lt;/b&gt;
   * @return policyitemid
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>policyItemId</b>")
  public BigDecimal getPolicyitemid() {
    return policyitemid;
  }

  public void setPolicyitemid(BigDecimal policyitemid) {
    this.policyitemid = policyitemid;
  }

  public JsonXXPolicyItemAccess type(BigDecimal type) {
    this.type = type;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;type&lt;/b&gt;
   * @return type
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>type</b>")
  public BigDecimal getType() {
    return type;
  }

  public void setType(BigDecimal type) {
    this.type = type;
  }

  public JsonXXPolicyItemAccess isallowed(Boolean isallowed) {
    this.isallowed = isallowed;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;isAllowed&lt;/b&gt;
   * @return isallowed
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>isAllowed</b>")
  public Boolean isIsallowed() {
    return isallowed;
  }

  public void setIsallowed(Boolean isallowed) {
    this.isallowed = isallowed;
  }

  public JsonXXPolicyItemAccess order(BigDecimal order) {
    this.order = order;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;order&lt;/b&gt;
   * @return order
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>order</b>")
  public BigDecimal getOrder() {
    return order;
  }

  public void setOrder(BigDecimal order) {
    this.order = order;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonXXPolicyItemAccess jsonXXPolicyItemAccess = (JsonXXPolicyItemAccess) o;
    return Objects.equals(this.id, jsonXXPolicyItemAccess.id) &&
        Objects.equals(this.GUID, jsonXXPolicyItemAccess.GUID) &&
        Objects.equals(this.policyitemid, jsonXXPolicyItemAccess.policyitemid) &&
        Objects.equals(this.type, jsonXXPolicyItemAccess.type) &&
        Objects.equals(this.isallowed, jsonXXPolicyItemAccess.isallowed) &&
        Objects.equals(this.order, jsonXXPolicyItemAccess.order) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, GUID, policyitemid, type, isallowed, order, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonXXPolicyItemAccess {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    GUID: ").append(toIndentedString(GUID)).append("\n");
    sb.append("    policyitemid: ").append(toIndentedString(policyitemid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isallowed: ").append(toIndentedString(isallowed)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
