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
public class JsonXXPolicyResourceMap extends JsonXXDBBase {
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("resourceid")
  private BigDecimal resourceid = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("order")
  private BigDecimal order = null;

  public JsonXXPolicyResourceMap id(BigDecimal id) {
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

  public JsonXXPolicyResourceMap resourceid(BigDecimal resourceid) {
    this.resourceid = resourceid;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;resourceId&lt;/b&gt;
   * @return resourceid
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>resourceId</b>")
  public BigDecimal getResourceid() {
    return resourceid;
  }

  public void setResourceid(BigDecimal resourceid) {
    this.resourceid = resourceid;
  }

  public JsonXXPolicyResourceMap value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;value&lt;/b&gt;
   * @return value
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>value</b>")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public JsonXXPolicyResourceMap order(BigDecimal order) {
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
    JsonXXPolicyResourceMap jsonXXPolicyResourceMap = (JsonXXPolicyResourceMap) o;
    return Objects.equals(this.id, jsonXXPolicyResourceMap.id) &&
        Objects.equals(this.resourceid, jsonXXPolicyResourceMap.resourceid) &&
        Objects.equals(this.value, jsonXXPolicyResourceMap.value) &&
        Objects.equals(this.order, jsonXXPolicyResourceMap.order) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, resourceid, value, order, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonXXPolicyResourceMap {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    resourceid: ").append(toIndentedString(resourceid)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

