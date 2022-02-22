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
public class JsonXXUser extends JsonXXDBBase {
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("myClassType")
  private Integer myClassType = null;

  @SerializedName("myDisplayValue")
  private String myDisplayValue = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("isVisible")
  private BigDecimal isVisible = null;

  @SerializedName("credStoreId")
  private BigDecimal credStoreId = null;

  @SerializedName("otherAttributes")
  private String otherAttributes = null;

  @SerializedName("syncSource")
  private String syncSource = null;

  public JsonXXUser id(BigDecimal id) {
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

  public JsonXXUser myClassType(Integer myClassType) {
    this.myClassType = myClassType;
    return this;
  }

   /**
   * 
   * @return myClassType
  **/
  @ApiModelProperty(value = "")
  public Integer getMyClassType() {
    return myClassType;
  }

  public void setMyClassType(Integer myClassType) {
    this.myClassType = myClassType;
  }

  public JsonXXUser myDisplayValue(String myDisplayValue) {
    this.myDisplayValue = myDisplayValue;
    return this;
  }

   /**
   * 
   * @return myDisplayValue
  **/
  @ApiModelProperty(value = "")
  public String getMyDisplayValue() {
    return myDisplayValue;
  }

  public void setMyDisplayValue(String myDisplayValue) {
    this.myDisplayValue = myDisplayValue;
  }

  public JsonXXUser name(String name) {
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

  public JsonXXUser description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;description&lt;/b&gt;
   * @return description
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>description</b>")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public JsonXXUser status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;status&lt;/b&gt;
   * @return status
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>status</b>")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public JsonXXUser isVisible(BigDecimal isVisible) {
    this.isVisible = isVisible;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;isVisible&lt;/b&gt;
   * @return isVisible
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>isVisible</b>")
  public BigDecimal getIsVisible() {
    return isVisible;
  }

  public void setIsVisible(BigDecimal isVisible) {
    this.isVisible = isVisible;
  }

  public JsonXXUser credStoreId(BigDecimal credStoreId) {
    this.credStoreId = credStoreId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;credStoreId&lt;/b&gt;
   * @return credStoreId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>credStoreId</b>")
  public BigDecimal getCredStoreId() {
    return credStoreId;
  }

  public void setCredStoreId(BigDecimal credStoreId) {
    this.credStoreId = credStoreId;
  }

  public JsonXXUser otherAttributes(String otherAttributes) {
    this.otherAttributes = otherAttributes;
    return this;
  }

   /**
   * 
   * @return otherAttributes
  **/
  @ApiModelProperty(value = "")
  public String getOtherAttributes() {
    return otherAttributes;
  }

  public void setOtherAttributes(String otherAttributes) {
    this.otherAttributes = otherAttributes;
  }

  public JsonXXUser syncSource(String syncSource) {
    this.syncSource = syncSource;
    return this;
  }

   /**
   * 
   * @return syncSource
  **/
  @ApiModelProperty(value = "")
  public String getSyncSource() {
    return syncSource;
  }

  public void setSyncSource(String syncSource) {
    this.syncSource = syncSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonXXUser jsonXXUser = (JsonXXUser) o;
    return Objects.equals(this.id, jsonXXUser.id) &&
        Objects.equals(this.myClassType, jsonXXUser.myClassType) &&
        Objects.equals(this.myDisplayValue, jsonXXUser.myDisplayValue) &&
        Objects.equals(this.name, jsonXXUser.name) &&
        Objects.equals(this.description, jsonXXUser.description) &&
        Objects.equals(this.status, jsonXXUser.status) &&
        Objects.equals(this.isVisible, jsonXXUser.isVisible) &&
        Objects.equals(this.credStoreId, jsonXXUser.credStoreId) &&
        Objects.equals(this.otherAttributes, jsonXXUser.otherAttributes) &&
        Objects.equals(this.syncSource, jsonXXUser.syncSource) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, myClassType, myDisplayValue, name, description, status, isVisible, credStoreId, otherAttributes, syncSource, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonXXUser {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    myClassType: ").append(toIndentedString(myClassType)).append("\n");
    sb.append("    myDisplayValue: ").append(toIndentedString(myDisplayValue)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
    sb.append("    credStoreId: ").append(toIndentedString(credStoreId)).append("\n");
    sb.append("    otherAttributes: ").append(toIndentedString(otherAttributes)).append("\n");
    sb.append("    syncSource: ").append(toIndentedString(syncSource)).append("\n");
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

