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
public class JsonXXRMSNotification {
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("hmsName")
  private String hmsName = null;

  @SerializedName("notificationId")
  private BigDecimal notificationId = null;

  @SerializedName("changeTimestamp")
  private BigDecimal changeTimestamp = null;

  @SerializedName("changeType")
  private String changeType = null;

  @SerializedName("hlResourceId")
  private BigDecimal hlResourceId = null;

  @SerializedName("hlServiceId")
  private BigDecimal hlServiceId = null;

  @SerializedName("llResourceId")
  private BigDecimal llResourceId = null;

  @SerializedName("llServiceId")
  private BigDecimal llServiceId = null;

  @SerializedName("myClassType")
  private Integer myClassType = null;

  public JsonXXRMSNotification id(BigDecimal id) {
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

  public JsonXXRMSNotification hmsName(String hmsName) {
    this.hmsName = hmsName;
    return this;
  }

   /**
   * 
   * @return hmsName
  **/
  @ApiModelProperty(value = "")
  public String getHmsName() {
    return hmsName;
  }

  public void setHmsName(String hmsName) {
    this.hmsName = hmsName;
  }

  public JsonXXRMSNotification notificationId(BigDecimal notificationId) {
    this.notificationId = notificationId;
    return this;
  }

   /**
   * 
   * @return notificationId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getNotificationId() {
    return notificationId;
  }

  public void setNotificationId(BigDecimal notificationId) {
    this.notificationId = notificationId;
  }

  public JsonXXRMSNotification changeTimestamp(BigDecimal changeTimestamp) {
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

  public JsonXXRMSNotification changeType(String changeType) {
    this.changeType = changeType;
    return this;
  }

   /**
   * 
   * @return changeType
  **/
  @ApiModelProperty(value = "")
  public String getChangeType() {
    return changeType;
  }

  public void setChangeType(String changeType) {
    this.changeType = changeType;
  }

  public JsonXXRMSNotification hlResourceId(BigDecimal hlResourceId) {
    this.hlResourceId = hlResourceId;
    return this;
  }

   /**
   * 
   * @return hlResourceId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getHlResourceId() {
    return hlResourceId;
  }

  public void setHlResourceId(BigDecimal hlResourceId) {
    this.hlResourceId = hlResourceId;
  }

  public JsonXXRMSNotification hlServiceId(BigDecimal hlServiceId) {
    this.hlServiceId = hlServiceId;
    return this;
  }

   /**
   * 
   * @return hlServiceId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getHlServiceId() {
    return hlServiceId;
  }

  public void setHlServiceId(BigDecimal hlServiceId) {
    this.hlServiceId = hlServiceId;
  }

  public JsonXXRMSNotification llResourceId(BigDecimal llResourceId) {
    this.llResourceId = llResourceId;
    return this;
  }

   /**
   * 
   * @return llResourceId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getLlResourceId() {
    return llResourceId;
  }

  public void setLlResourceId(BigDecimal llResourceId) {
    this.llResourceId = llResourceId;
  }

  public JsonXXRMSNotification llServiceId(BigDecimal llServiceId) {
    this.llServiceId = llServiceId;
    return this;
  }

   /**
   * 
   * @return llServiceId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getLlServiceId() {
    return llServiceId;
  }

  public void setLlServiceId(BigDecimal llServiceId) {
    this.llServiceId = llServiceId;
  }

  public JsonXXRMSNotification myClassType(Integer myClassType) {
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
    JsonXXRMSNotification jsonXXRMSNotification = (JsonXXRMSNotification) o;
    return Objects.equals(this.id, jsonXXRMSNotification.id) &&
        Objects.equals(this.hmsName, jsonXXRMSNotification.hmsName) &&
        Objects.equals(this.notificationId, jsonXXRMSNotification.notificationId) &&
        Objects.equals(this.changeTimestamp, jsonXXRMSNotification.changeTimestamp) &&
        Objects.equals(this.changeType, jsonXXRMSNotification.changeType) &&
        Objects.equals(this.hlResourceId, jsonXXRMSNotification.hlResourceId) &&
        Objects.equals(this.hlServiceId, jsonXXRMSNotification.hlServiceId) &&
        Objects.equals(this.llResourceId, jsonXXRMSNotification.llResourceId) &&
        Objects.equals(this.llServiceId, jsonXXRMSNotification.llServiceId) &&
        Objects.equals(this.myClassType, jsonXXRMSNotification.myClassType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hmsName, notificationId, changeTimestamp, changeType, hlResourceId, hlServiceId, llResourceId, llServiceId, myClassType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonXXRMSNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    hmsName: ").append(toIndentedString(hmsName)).append("\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    changeTimestamp: ").append(toIndentedString(changeTimestamp)).append("\n");
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    hlResourceId: ").append(toIndentedString(hlResourceId)).append("\n");
    sb.append("    hlServiceId: ").append(toIndentedString(hlServiceId)).append("\n");
    sb.append("    llResourceId: ").append(toIndentedString(llResourceId)).append("\n");
    sb.append("    llServiceId: ").append(toIndentedString(llServiceId)).append("\n");
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
