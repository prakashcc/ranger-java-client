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
public class JsonXXPluginInfo {
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

  @SerializedName("serviceName")
  private String serviceName = null;

  @SerializedName("appType")
  private String appType = null;

  @SerializedName("hostName")
  private String hostName = null;

  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("info")
  private String info = null;

  public JsonXXPluginInfo myClassType(Integer myClassType) {
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

  public JsonXXPluginInfo myDisplayValue(String myDisplayValue) {
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

  public JsonXXPluginInfo id(BigDecimal id) {
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

  public JsonXXPluginInfo createTime(BigDecimal createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCreateTime() {
    return createTime;
  }

  public void setCreateTime(BigDecimal createTime) {
    this.createTime = createTime;
  }

  public JsonXXPluginInfo updateTime(BigDecimal updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * 
   * @return updateTime
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(BigDecimal updateTime) {
    this.updateTime = updateTime;
  }

  public JsonXXPluginInfo serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * 
   * @return serviceName
  **/
  @ApiModelProperty(value = "")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public JsonXXPluginInfo appType(String appType) {
    this.appType = appType;
    return this;
  }

   /**
   * 
   * @return appType
  **/
  @ApiModelProperty(value = "")
  public String getAppType() {
    return appType;
  }

  public void setAppType(String appType) {
    this.appType = appType;
  }

  public JsonXXPluginInfo hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * 
   * @return hostName
  **/
  @ApiModelProperty(value = "")
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public JsonXXPluginInfo ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * 
   * @return ipAddress
  **/
  @ApiModelProperty(value = "")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public JsonXXPluginInfo info(String info) {
    this.info = info;
    return this;
  }

   /**
   * 
   * @return info
  **/
  @ApiModelProperty(value = "")
  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonXXPluginInfo jsonXXPluginInfo = (JsonXXPluginInfo) o;
    return Objects.equals(this.myClassType, jsonXXPluginInfo.myClassType) &&
        Objects.equals(this.myDisplayValue, jsonXXPluginInfo.myDisplayValue) &&
        Objects.equals(this.id, jsonXXPluginInfo.id) &&
        Objects.equals(this.createTime, jsonXXPluginInfo.createTime) &&
        Objects.equals(this.updateTime, jsonXXPluginInfo.updateTime) &&
        Objects.equals(this.serviceName, jsonXXPluginInfo.serviceName) &&
        Objects.equals(this.appType, jsonXXPluginInfo.appType) &&
        Objects.equals(this.hostName, jsonXXPluginInfo.hostName) &&
        Objects.equals(this.ipAddress, jsonXXPluginInfo.ipAddress) &&
        Objects.equals(this.info, jsonXXPluginInfo.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myClassType, myDisplayValue, id, createTime, updateTime, serviceName, appType, hostName, ipAddress, info);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonXXPluginInfo {\n");
    
    sb.append("    myClassType: ").append(toIndentedString(myClassType)).append("\n");
    sb.append("    myDisplayValue: ").append(toIndentedString(myDisplayValue)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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

