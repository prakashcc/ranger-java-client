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
import java.io.IOException;
import java.math.BigDecimal;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonXXDBBase {
  @SerializedName("myClassType")
  private Integer myClassType = null;

  @SerializedName("myDisplayValue")
  private String myDisplayValue = null;

  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("createTime")
  private BigDecimal createTime = null;

  @SerializedName("updateTime")
  private BigDecimal updateTime = null;

  @SerializedName("addedByUserId")
  private BigDecimal addedByUserId = null;

  @SerializedName("updatedByUserId")
  private BigDecimal updatedByUserId = null;

  public JsonXXDBBase myClassType(Integer myClassType) {
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

  public JsonXXDBBase myDisplayValue(String myDisplayValue) {
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

  public JsonXXDBBase id(BigDecimal id) {
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

  public JsonXXDBBase createTime(BigDecimal createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;createTime&lt;/b&gt;
   * @return createTime
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>createTime</b>")
  public BigDecimal getCreateTime() {
    return createTime;
  }

  public void setCreateTime(BigDecimal createTime) {
    this.createTime = createTime;
  }

  public JsonXXDBBase updateTime(BigDecimal updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;updateTime&lt;/b&gt;
   * @return updateTime
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>updateTime</b>")
  public BigDecimal getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(BigDecimal updateTime) {
    this.updateTime = updateTime;
  }

  public JsonXXDBBase addedByUserId(BigDecimal addedByUserId) {
    this.addedByUserId = addedByUserId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;addedByUserId&lt;/b&gt;
   * @return addedByUserId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>addedByUserId</b>")
  public BigDecimal getAddedByUserId() {
    return addedByUserId;
  }

  public void setAddedByUserId(BigDecimal addedByUserId) {
    this.addedByUserId = addedByUserId;
  }

  public JsonXXDBBase updatedByUserId(BigDecimal updatedByUserId) {
    this.updatedByUserId = updatedByUserId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;updatedByUserId&lt;/b&gt;
   * @return updatedByUserId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>updatedByUserId</b>")
  public BigDecimal getUpdatedByUserId() {
    return updatedByUserId;
  }

  public void setUpdatedByUserId(BigDecimal updatedByUserId) {
    this.updatedByUserId = updatedByUserId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonXXDBBase jsonXXDBBase = (JsonXXDBBase) o;
    return Objects.equals(this.myClassType, jsonXXDBBase.myClassType) &&
        Objects.equals(this.myDisplayValue, jsonXXDBBase.myDisplayValue) &&
        Objects.equals(this.id, jsonXXDBBase.id) &&
        Objects.equals(this.createTime, jsonXXDBBase.createTime) &&
        Objects.equals(this.updateTime, jsonXXDBBase.updateTime) &&
        Objects.equals(this.addedByUserId, jsonXXDBBase.addedByUserId) &&
        Objects.equals(this.updatedByUserId, jsonXXDBBase.updatedByUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myClassType, myDisplayValue, id, createTime, updateTime, addedByUserId, updatedByUserId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonXXDBBase {\n");
    
    sb.append("    myClassType: ").append(toIndentedString(myClassType)).append("\n");
    sb.append("    myDisplayValue: ").append(toIndentedString(myDisplayValue)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    addedByUserId: ").append(toIndentedString(addedByUserId)).append("\n");
    sb.append("    updatedByUserId: ").append(toIndentedString(updatedByUserId)).append("\n");
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

