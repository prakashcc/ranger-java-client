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
public class JsonXXRMSMappingProvider {
  @SerializedName("changeTimestamp")
  private BigDecimal changeTimestamp = null;

  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("lastKnownVersion")
  private BigDecimal lastKnownVersion = null;

  @SerializedName("myClassType")
  private Integer myClassType = null;

  public JsonXXRMSMappingProvider changeTimestamp(BigDecimal changeTimestamp) {
    this.changeTimestamp = changeTimestamp;
    return this;
  }

   /**
   * 
   * @return changeTimestamp
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getChangeTimestamp() {
    return changeTimestamp;
  }

  public void setChangeTimestamp(BigDecimal changeTimestamp) {
    this.changeTimestamp = changeTimestamp;
  }

  public JsonXXRMSMappingProvider id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public JsonXXRMSMappingProvider name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JsonXXRMSMappingProvider lastKnownVersion(BigDecimal lastKnownVersion) {
    this.lastKnownVersion = lastKnownVersion;
    return this;
  }

   /**
   * 
   * @return lastKnownVersion
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getLastKnownVersion() {
    return lastKnownVersion;
  }

  public void setLastKnownVersion(BigDecimal lastKnownVersion) {
    this.lastKnownVersion = lastKnownVersion;
  }

  public JsonXXRMSMappingProvider myClassType(Integer myClassType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonXXRMSMappingProvider jsonXXRMSMappingProvider = (JsonXXRMSMappingProvider) o;
    return Objects.equals(this.changeTimestamp, jsonXXRMSMappingProvider.changeTimestamp) &&
        Objects.equals(this.id, jsonXXRMSMappingProvider.id) &&
        Objects.equals(this.name, jsonXXRMSMappingProvider.name) &&
        Objects.equals(this.lastKnownVersion, jsonXXRMSMappingProvider.lastKnownVersion) &&
        Objects.equals(this.myClassType, jsonXXRMSMappingProvider.myClassType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeTimestamp, id, name, lastKnownVersion, myClassType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonXXRMSMappingProvider {\n");
    
    sb.append("    changeTimestamp: ").append(toIndentedString(changeTimestamp)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastKnownVersion: ").append(toIndentedString(lastKnownVersion)).append("\n");
    sb.append("    myClassType: ").append(toIndentedString(myClassType)).append("\n");
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

