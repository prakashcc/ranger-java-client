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
public class JsonXXPolicyChangeLog {
  @SerializedName("myClassType")
  private Integer myClassType = null;

  @SerializedName("myDisplayValue")
  private String myDisplayValue = null;

  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("createTime")
  private BigDecimal createTime = null;

  @SerializedName("serviceId")
  private BigDecimal serviceId = null;

  @SerializedName("policyVersion")
  private BigDecimal policyVersion = null;

  @SerializedName("changeType")
  private BigDecimal changeType = null;

  @SerializedName("serviceType")
  private String serviceType = null;

  @SerializedName("policyType")
  private BigDecimal policyType = null;

  @SerializedName("zoneName")
  private String zoneName = null;

  @SerializedName("policyId")
  private BigDecimal policyId = null;

  @SerializedName("policyGuid")
  private String policyGuid = null;

  public JsonXXPolicyChangeLog myClassType(Integer myClassType) {
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

  public JsonXXPolicyChangeLog myDisplayValue(String myDisplayValue) {
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

  public JsonXXPolicyChangeLog id(BigDecimal id) {
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

  public JsonXXPolicyChangeLog createTime(BigDecimal createTime) {
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

  public JsonXXPolicyChangeLog serviceId(BigDecimal serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * 
   * @return serviceId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getServiceId() {
    return serviceId;
  }

  public void setServiceId(BigDecimal serviceId) {
    this.serviceId = serviceId;
  }

  public JsonXXPolicyChangeLog policyVersion(BigDecimal policyVersion) {
    this.policyVersion = policyVersion;
    return this;
  }

   /**
   * 
   * @return policyVersion
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPolicyVersion() {
    return policyVersion;
  }

  public void setPolicyVersion(BigDecimal policyVersion) {
    this.policyVersion = policyVersion;
  }

  public JsonXXPolicyChangeLog changeType(BigDecimal changeType) {
    this.changeType = changeType;
    return this;
  }

   /**
   * 
   * @return changeType
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getChangeType() {
    return changeType;
  }

  public void setChangeType(BigDecimal changeType) {
    this.changeType = changeType;
  }

  public JsonXXPolicyChangeLog serviceType(String serviceType) {
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

  public JsonXXPolicyChangeLog policyType(BigDecimal policyType) {
    this.policyType = policyType;
    return this;
  }

   /**
   * 
   * @return policyType
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPolicyType() {
    return policyType;
  }

  public void setPolicyType(BigDecimal policyType) {
    this.policyType = policyType;
  }

  public JsonXXPolicyChangeLog zoneName(String zoneName) {
    this.zoneName = zoneName;
    return this;
  }

   /**
   * 
   * @return zoneName
  **/
  @ApiModelProperty(value = "")
  public String getZoneName() {
    return zoneName;
  }

  public void setZoneName(String zoneName) {
    this.zoneName = zoneName;
  }

  public JsonXXPolicyChangeLog policyId(BigDecimal policyId) {
    this.policyId = policyId;
    return this;
  }

   /**
   * 
   * @return policyId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPolicyId() {
    return policyId;
  }

  public void setPolicyId(BigDecimal policyId) {
    this.policyId = policyId;
  }

  public JsonXXPolicyChangeLog policyGuid(String policyGuid) {
    this.policyGuid = policyGuid;
    return this;
  }

   /**
   * 
   * @return policyGuid
  **/
  @ApiModelProperty(value = "")
  public String getPolicyGuid() {
    return policyGuid;
  }

  public void setPolicyGuid(String policyGuid) {
    this.policyGuid = policyGuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonXXPolicyChangeLog jsonXXPolicyChangeLog = (JsonXXPolicyChangeLog) o;
    return Objects.equals(this.myClassType, jsonXXPolicyChangeLog.myClassType) &&
        Objects.equals(this.myDisplayValue, jsonXXPolicyChangeLog.myDisplayValue) &&
        Objects.equals(this.id, jsonXXPolicyChangeLog.id) &&
        Objects.equals(this.createTime, jsonXXPolicyChangeLog.createTime) &&
        Objects.equals(this.serviceId, jsonXXPolicyChangeLog.serviceId) &&
        Objects.equals(this.policyVersion, jsonXXPolicyChangeLog.policyVersion) &&
        Objects.equals(this.changeType, jsonXXPolicyChangeLog.changeType) &&
        Objects.equals(this.serviceType, jsonXXPolicyChangeLog.serviceType) &&
        Objects.equals(this.policyType, jsonXXPolicyChangeLog.policyType) &&
        Objects.equals(this.zoneName, jsonXXPolicyChangeLog.zoneName) &&
        Objects.equals(this.policyId, jsonXXPolicyChangeLog.policyId) &&
        Objects.equals(this.policyGuid, jsonXXPolicyChangeLog.policyGuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myClassType, myDisplayValue, id, createTime, serviceId, policyVersion, changeType, serviceType, policyType, zoneName, policyId, policyGuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonXXPolicyChangeLog {\n");
    
    sb.append("    myClassType: ").append(toIndentedString(myClassType)).append("\n");
    sb.append("    myDisplayValue: ").append(toIndentedString(myDisplayValue)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    policyVersion: ").append(toIndentedString(policyVersion)).append("\n");
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
    sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    policyGuid: ").append(toIndentedString(policyGuid)).append("\n");
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
