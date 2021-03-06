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
import io.swagger.client.model.XmlNs0ViewBaseBean;
import java.io.IOException;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class XmlNs0VXMessage extends XmlNs0ViewBaseBean {
  @SerializedName("fieldName")
  private String fieldName = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("objectId")
  private Long objectId = null;

  @SerializedName("rbKey")
  private String rbKey = null;

  public XmlNs0VXMessage fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;fieldName&lt;/b&gt;
   * @return fieldName
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>fieldName</b>")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public XmlNs0VXMessage message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;message&lt;/b&gt;
   * @return message
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>message</b>")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public XmlNs0VXMessage name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;name&lt;/b&gt;
   * @return name
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>name</b>")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public XmlNs0VXMessage objectId(Long objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;objectId&lt;/b&gt;
   * @return objectId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>objectId</b>")
  public Long getObjectId() {
    return objectId;
  }

  public void setObjectId(Long objectId) {
    this.objectId = objectId;
  }

  public XmlNs0VXMessage rbKey(String rbKey) {
    this.rbKey = rbKey;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;rbKey&lt;/b&gt;
   * @return rbKey
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>rbKey</b>")
  public String getRbKey() {
    return rbKey;
  }

  public void setRbKey(String rbKey) {
    this.rbKey = rbKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlNs0VXMessage xmlNs0VXMessage = (XmlNs0VXMessage) o;
    return Objects.equals(this.fieldName, xmlNs0VXMessage.fieldName) &&
        Objects.equals(this.message, xmlNs0VXMessage.message) &&
        Objects.equals(this.name, xmlNs0VXMessage.name) &&
        Objects.equals(this.objectId, xmlNs0VXMessage.objectId) &&
        Objects.equals(this.rbKey, xmlNs0VXMessage.rbKey) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, message, name, objectId, rbKey, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0VXMessage {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    rbKey: ").append(toIndentedString(rbKey)).append("\n");
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

