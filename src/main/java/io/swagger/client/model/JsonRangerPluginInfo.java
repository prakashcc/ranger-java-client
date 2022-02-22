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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonRangerPluginInfo {
  @SerializedName("info")
  private Map<String, String> info = null;

  @SerializedName("serviceDisplayName")
  private String serviceDisplayName = null;

  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("serviceTypeDisplayName")
  private String serviceTypeDisplayName = null;

  @SerializedName("appType")
  private String appType = null;

  @SerializedName("hostName")
  private String hostName = null;

  @SerializedName("updateTime")
  private BigDecimal updateTime = null;

  @SerializedName("serviceName")
  private String serviceName = null;

  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("serviceType")
  private String serviceType = null;

  @SerializedName("createTime")
  private BigDecimal createTime = null;

  public JsonRangerPluginInfo info(Map<String, String> info) {
    this.info = info;
    return this;
  }

  public JsonRangerPluginInfo putInfoItem(String key, String infoItem) {
    if (this.info == null) {
      this.info = new HashMap<String, String>();
    }
    this.info.put(key, infoItem);
    return this;
  }

   /**
   * 
   * @return info
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getInfo() {
    return info;
  }

  public void setInfo(Map<String, String> info) {
    this.info = info;
  }

  public JsonRangerPluginInfo serviceDisplayName(String serviceDisplayName) {
    this.serviceDisplayName = serviceDisplayName;
    return this;
  }

   /**
   * 
   * @return serviceDisplayName
  **/
  @ApiModelProperty(value = "")
  public String getServiceDisplayName() {
    return serviceDisplayName;
  }

  public void setServiceDisplayName(String serviceDisplayName) {
    this.serviceDisplayName = serviceDisplayName;
  }

  public JsonRangerPluginInfo id(BigDecimal id) {
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

  public JsonRangerPluginInfo serviceTypeDisplayName(String serviceTypeDisplayName) {
    this.serviceTypeDisplayName = serviceTypeDisplayName;
    return this;
  }

   /**
   * 
   * @return serviceTypeDisplayName
  **/
  @ApiModelProperty(value = "")
  public String getServiceTypeDisplayName() {
    return serviceTypeDisplayName;
  }

  public void setServiceTypeDisplayName(String serviceTypeDisplayName) {
    this.serviceTypeDisplayName = serviceTypeDisplayName;
  }

  public JsonRangerPluginInfo appType(String appType) {
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

  public JsonRangerPluginInfo hostName(String hostName) {
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

  public JsonRangerPluginInfo updateTime(BigDecimal updateTime) {
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

  public JsonRangerPluginInfo serviceName(String serviceName) {
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

  public JsonRangerPluginInfo ipAddress(String ipAddress) {
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

  public JsonRangerPluginInfo serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

   /**
   * 
   * @return serviceType
  **/
  @ApiModelProperty(value = "")
  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public JsonRangerPluginInfo createTime(BigDecimal createTime) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonRangerPluginInfo jsonRangerPluginInfo = (JsonRangerPluginInfo) o;
    return Objects.equals(this.info, jsonRangerPluginInfo.info) &&
        Objects.equals(this.serviceDisplayName, jsonRangerPluginInfo.serviceDisplayName) &&
        Objects.equals(this.id, jsonRangerPluginInfo.id) &&
        Objects.equals(this.serviceTypeDisplayName, jsonRangerPluginInfo.serviceTypeDisplayName) &&
        Objects.equals(this.appType, jsonRangerPluginInfo.appType) &&
        Objects.equals(this.hostName, jsonRangerPluginInfo.hostName) &&
        Objects.equals(this.updateTime, jsonRangerPluginInfo.updateTime) &&
        Objects.equals(this.serviceName, jsonRangerPluginInfo.serviceName) &&
        Objects.equals(this.ipAddress, jsonRangerPluginInfo.ipAddress) &&
        Objects.equals(this.serviceType, jsonRangerPluginInfo.serviceType) &&
        Objects.equals(this.createTime, jsonRangerPluginInfo.createTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(info, serviceDisplayName, id, serviceTypeDisplayName, appType, hostName, updateTime, serviceName, ipAddress, serviceType, createTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonRangerPluginInfo {\n");
    
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    serviceDisplayName: ").append(toIndentedString(serviceDisplayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serviceTypeDisplayName: ").append(toIndentedString(serviceTypeDisplayName)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

