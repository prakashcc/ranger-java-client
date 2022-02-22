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
import io.swagger.client.model.JsonVXDataObject;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonVXPermMap extends JsonVXDataObject {
  @SerializedName("permGroup")
  private String permGroup = null;

  @SerializedName("resourceId")
  private BigDecimal resourceId = null;

  @SerializedName("groupId")
  private BigDecimal groupId = null;

  @SerializedName("userId")
  private BigDecimal userId = null;

  @SerializedName("permFor")
  private Integer permFor = null;

  @SerializedName("permType")
  private Integer permType = null;

  @SerializedName("grantOrRevoke")
  private Boolean grantOrRevoke = null;

  @SerializedName("groupName")
  private String groupName = null;

  @SerializedName("userName")
  private String userName = null;

  @SerializedName("isRecursive")
  private Integer isRecursive = null;

  @SerializedName("isWildCard")
  private Boolean isWildCard = null;

  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("myClassType")
  private Integer myClassType = null;

  public JsonVXPermMap permGroup(String permGroup) {
    this.permGroup = permGroup;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;permGroup&lt;/b&gt;
   * @return permGroup
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>permGroup</b>")
  public String getPermGroup() {
    return permGroup;
  }

  public void setPermGroup(String permGroup) {
    this.permGroup = permGroup;
  }

  public JsonVXPermMap resourceId(BigDecimal resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;resourceId&lt;/b&gt;
   * @return resourceId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>resourceId</b>")
  public BigDecimal getResourceId() {
    return resourceId;
  }

  public void setResourceId(BigDecimal resourceId) {
    this.resourceId = resourceId;
  }

  public JsonVXPermMap groupId(BigDecimal groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;groupId&lt;/b&gt;
   * @return groupId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>groupId</b>")
  public BigDecimal getGroupId() {
    return groupId;
  }

  public void setGroupId(BigDecimal groupId) {
    this.groupId = groupId;
  }

  public JsonVXPermMap userId(BigDecimal userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;userId&lt;/b&gt;
   * @return userId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>userId</b>")
  public BigDecimal getUserId() {
    return userId;
  }

  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }

  public JsonVXPermMap permFor(Integer permFor) {
    this.permFor = permFor;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;permFor&lt;/b&gt;
   * @return permFor
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>permFor</b>")
  public Integer getPermFor() {
    return permFor;
  }

  public void setPermFor(Integer permFor) {
    this.permFor = permFor;
  }

  public JsonVXPermMap permType(Integer permType) {
    this.permType = permType;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;permType&lt;/b&gt;
   * @return permType
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>permType</b>")
  public Integer getPermType() {
    return permType;
  }

  public void setPermType(Integer permType) {
    this.permType = permType;
  }

  public JsonVXPermMap grantOrRevoke(Boolean grantOrRevoke) {
    this.grantOrRevoke = grantOrRevoke;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;grantOrRevoke&lt;/b&gt;
   * @return grantOrRevoke
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>grantOrRevoke</b>")
  public Boolean isGrantOrRevoke() {
    return grantOrRevoke;
  }

  public void setGrantOrRevoke(Boolean grantOrRevoke) {
    this.grantOrRevoke = grantOrRevoke;
  }

  public JsonVXPermMap groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;groupName&lt;/b&gt;
   * @return groupName
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>groupName</b>")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public JsonVXPermMap userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;userName&lt;/b&gt;
   * @return userName
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>userName</b>")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public JsonVXPermMap isRecursive(Integer isRecursive) {
    this.isRecursive = isRecursive;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;isRecursive&lt;/b&gt;
   * @return isRecursive
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>isRecursive</b>")
  public Integer getIsRecursive() {
    return isRecursive;
  }

  public void setIsRecursive(Integer isRecursive) {
    this.isRecursive = isRecursive;
  }

  public JsonVXPermMap isWildCard(Boolean isWildCard) {
    this.isWildCard = isWildCard;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;isWildCard&lt;/b&gt;
   * @return isWildCard
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>isWildCard</b>")
  public Boolean isIsWildCard() {
    return isWildCard;
  }

  public void setIsWildCard(Boolean isWildCard) {
    this.isWildCard = isWildCard;
  }

  public JsonVXPermMap ipAddress(String ipAddress) {
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

  public JsonVXPermMap myClassType(Integer myClassType) {
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
    JsonVXPermMap jsonVXPermMap = (JsonVXPermMap) o;
    return Objects.equals(this.permGroup, jsonVXPermMap.permGroup) &&
        Objects.equals(this.resourceId, jsonVXPermMap.resourceId) &&
        Objects.equals(this.groupId, jsonVXPermMap.groupId) &&
        Objects.equals(this.userId, jsonVXPermMap.userId) &&
        Objects.equals(this.permFor, jsonVXPermMap.permFor) &&
        Objects.equals(this.permType, jsonVXPermMap.permType) &&
        Objects.equals(this.grantOrRevoke, jsonVXPermMap.grantOrRevoke) &&
        Objects.equals(this.groupName, jsonVXPermMap.groupName) &&
        Objects.equals(this.userName, jsonVXPermMap.userName) &&
        Objects.equals(this.isRecursive, jsonVXPermMap.isRecursive) &&
        Objects.equals(this.isWildCard, jsonVXPermMap.isWildCard) &&
        Objects.equals(this.ipAddress, jsonVXPermMap.ipAddress) &&
        Objects.equals(this.myClassType, jsonVXPermMap.myClassType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permGroup, resourceId, groupId, userId, permFor, permType, grantOrRevoke, groupName, userName, isRecursive, isWildCard, ipAddress, myClassType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonVXPermMap {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    permGroup: ").append(toIndentedString(permGroup)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    permFor: ").append(toIndentedString(permFor)).append("\n");
    sb.append("    permType: ").append(toIndentedString(permType)).append("\n");
    sb.append("    grantOrRevoke: ").append(toIndentedString(grantOrRevoke)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    isRecursive: ").append(toIndentedString(isRecursive)).append("\n");
    sb.append("    isWildCard: ").append(toIndentedString(isWildCard)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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
