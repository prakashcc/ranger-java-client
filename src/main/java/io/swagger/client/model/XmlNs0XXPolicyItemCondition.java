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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class XmlNs0XXPolicyItemCondition extends XmlNs0XXDBBase {
  @SerializedName("GUID")
  private String GUID = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("type")
  private Long type = null;

  @SerializedName("value")
  private String value = null;

  public XmlNs0XXPolicyItemCondition GUID(String GUID) {
    this.GUID = GUID;
    return this;
  }

   /**
   * the gUID
   * @return GUID
  **/
  @ApiModelProperty(value = "the gUID")
  public String getGUID() {
    return GUID;
  }

  public void setGUID(String GUID) {
    this.GUID = GUID;
  }

  public XmlNs0XXPolicyItemCondition order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;order&lt;/b&gt;
   * @return order
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>order</b>")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public XmlNs0XXPolicyItemCondition type(Long type) {
    this.type = type;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;type&lt;/b&gt;
   * @return type
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>type</b>")
  public Long getType() {
    return type;
  }

  public void setType(Long type) {
    this.type = type;
  }

  public XmlNs0XXPolicyItemCondition value(String value) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlNs0XXPolicyItemCondition xmlNs0XXPolicyItemCondition = (XmlNs0XXPolicyItemCondition) o;
    return Objects.equals(this.GUID, xmlNs0XXPolicyItemCondition.GUID) &&
        Objects.equals(this.order, xmlNs0XXPolicyItemCondition.order) &&
        Objects.equals(this.type, xmlNs0XXPolicyItemCondition.type) &&
        Objects.equals(this.value, xmlNs0XXPolicyItemCondition.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(GUID, order, type, value, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0XXPolicyItemCondition {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    GUID: ").append(toIndentedString(GUID)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

