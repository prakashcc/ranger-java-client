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
import io.swagger.client.model.JsonVXGroupPermission;
import io.swagger.client.model.JsonVXUserPermission;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonVXPortalUser extends JsonVXDataObject {
  @SerializedName("loginId")
  private String loginId = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("emailAddress")
  private String emailAddress = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("publicScreenName")
  private String publicScreenName = null;

  @SerializedName("userSource")
  private Integer userSource = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("userRoleList")
  private List<String> userRoleList = null;

  @SerializedName("myClassType")
  private Integer myClassType = null;

  @SerializedName("groupIdList")
  private List<BigDecimal> groupIdList = null;

  @SerializedName("userPermList")
  private List<JsonVXUserPermission> userPermList = null;

  @SerializedName("groupPermissions")
  private List<JsonVXGroupPermission> groupPermissions = null;

  @SerializedName("otherAttributes")
  private String otherAttributes = null;

  @SerializedName("configProperties")
  private Map<String, String> configProperties = null;

  @SerializedName("syncSource")
  private String syncSource = null;

  public JsonVXPortalUser loginId(String loginId) {
    this.loginId = loginId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;loginId&lt;/b&gt;
   * @return loginId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>loginId</b>")
  public String getLoginId() {
    return loginId;
  }

  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }

  public JsonVXPortalUser password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;password&lt;/b&gt;
   * @return password
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>password</b>")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public JsonVXPortalUser status(Integer status) {
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

  public JsonVXPortalUser emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;emailAddress&lt;/b&gt;
   * @return emailAddress
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>emailAddress</b>")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public JsonVXPortalUser firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;firstName&lt;/b&gt;
   * @return firstName
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>firstName</b>")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public JsonVXPortalUser lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;lastName&lt;/b&gt;
   * @return lastName
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>lastName</b>")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public JsonVXPortalUser publicScreenName(String publicScreenName) {
    this.publicScreenName = publicScreenName;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;publicScreenName&lt;/b&gt;
   * @return publicScreenName
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>publicScreenName</b>")
  public String getPublicScreenName() {
    return publicScreenName;
  }

  public void setPublicScreenName(String publicScreenName) {
    this.publicScreenName = publicScreenName;
  }

  public JsonVXPortalUser userSource(Integer userSource) {
    this.userSource = userSource;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;userSource&lt;/b&gt;
   * @return userSource
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>userSource</b>")
  public Integer getUserSource() {
    return userSource;
  }

  public void setUserSource(Integer userSource) {
    this.userSource = userSource;
  }

  public JsonVXPortalUser notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;notes&lt;/b&gt;
   * @return notes
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>notes</b>")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public JsonVXPortalUser userRoleList(List<String> userRoleList) {
    this.userRoleList = userRoleList;
    return this;
  }

  public JsonVXPortalUser addUserRoleListItem(String userRoleListItem) {
    if (this.userRoleList == null) {
      this.userRoleList = new ArrayList<String>();
    }
    this.userRoleList.add(userRoleListItem);
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;userRoleList&lt;/b&gt;
   * @return userRoleList
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>userRoleList</b>")
  public List<String> getUserRoleList() {
    return userRoleList;
  }

  public void setUserRoleList(List<String> userRoleList) {
    this.userRoleList = userRoleList;
  }

  public JsonVXPortalUser myClassType(Integer myClassType) {
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

  public JsonVXPortalUser groupIdList(List<BigDecimal> groupIdList) {
    this.groupIdList = groupIdList;
    return this;
  }

  public JsonVXPortalUser addGroupIdListItem(BigDecimal groupIdListItem) {
    if (this.groupIdList == null) {
      this.groupIdList = new ArrayList<BigDecimal>();
    }
    this.groupIdList.add(groupIdListItem);
    return this;
  }

   /**
   * 
   * @return groupIdList
  **/
  @ApiModelProperty(value = "")
  public List<BigDecimal> getGroupIdList() {
    return groupIdList;
  }

  public void setGroupIdList(List<BigDecimal> groupIdList) {
    this.groupIdList = groupIdList;
  }

  public JsonVXPortalUser userPermList(List<JsonVXUserPermission> userPermList) {
    this.userPermList = userPermList;
    return this;
  }

  public JsonVXPortalUser addUserPermListItem(JsonVXUserPermission userPermListItem) {
    if (this.userPermList == null) {
      this.userPermList = new ArrayList<JsonVXUserPermission>();
    }
    this.userPermList.add(userPermListItem);
    return this;
  }

   /**
   * 
   * @return userPermList
  **/
  @ApiModelProperty(value = "")
  public List<JsonVXUserPermission> getUserPermList() {
    return userPermList;
  }

  public void setUserPermList(List<JsonVXUserPermission> userPermList) {
    this.userPermList = userPermList;
  }

  public JsonVXPortalUser groupPermissions(List<JsonVXGroupPermission> groupPermissions) {
    this.groupPermissions = groupPermissions;
    return this;
  }

  public JsonVXPortalUser addGroupPermissionsItem(JsonVXGroupPermission groupPermissionsItem) {
    if (this.groupPermissions == null) {
      this.groupPermissions = new ArrayList<JsonVXGroupPermission>();
    }
    this.groupPermissions.add(groupPermissionsItem);
    return this;
  }

   /**
   * 
   * @return groupPermissions
  **/
  @ApiModelProperty(value = "")
  public List<JsonVXGroupPermission> getGroupPermissions() {
    return groupPermissions;
  }

  public void setGroupPermissions(List<JsonVXGroupPermission> groupPermissions) {
    this.groupPermissions = groupPermissions;
  }

  public JsonVXPortalUser otherAttributes(String otherAttributes) {
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

  public JsonVXPortalUser configProperties(Map<String, String> configProperties) {
    this.configProperties = configProperties;
    return this;
  }

  public JsonVXPortalUser putConfigPropertiesItem(String key, String configPropertiesItem) {
    if (this.configProperties == null) {
      this.configProperties = new HashMap<String, String>();
    }
    this.configProperties.put(key, configPropertiesItem);
    return this;
  }

   /**
   * 
   * @return configProperties
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getConfigProperties() {
    return configProperties;
  }

  public void setConfigProperties(Map<String, String> configProperties) {
    this.configProperties = configProperties;
  }

  public JsonVXPortalUser syncSource(String syncSource) {
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
    JsonVXPortalUser jsonVXPortalUser = (JsonVXPortalUser) o;
    return Objects.equals(this.loginId, jsonVXPortalUser.loginId) &&
        Objects.equals(this.password, jsonVXPortalUser.password) &&
        Objects.equals(this.status, jsonVXPortalUser.status) &&
        Objects.equals(this.emailAddress, jsonVXPortalUser.emailAddress) &&
        Objects.equals(this.firstName, jsonVXPortalUser.firstName) &&
        Objects.equals(this.lastName, jsonVXPortalUser.lastName) &&
        Objects.equals(this.publicScreenName, jsonVXPortalUser.publicScreenName) &&
        Objects.equals(this.userSource, jsonVXPortalUser.userSource) &&
        Objects.equals(this.notes, jsonVXPortalUser.notes) &&
        Objects.equals(this.userRoleList, jsonVXPortalUser.userRoleList) &&
        Objects.equals(this.myClassType, jsonVXPortalUser.myClassType) &&
        Objects.equals(this.groupIdList, jsonVXPortalUser.groupIdList) &&
        Objects.equals(this.userPermList, jsonVXPortalUser.userPermList) &&
        Objects.equals(this.groupPermissions, jsonVXPortalUser.groupPermissions) &&
        Objects.equals(this.otherAttributes, jsonVXPortalUser.otherAttributes) &&
        Objects.equals(this.configProperties, jsonVXPortalUser.configProperties) &&
        Objects.equals(this.syncSource, jsonVXPortalUser.syncSource) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginId, password, status, emailAddress, firstName, lastName, publicScreenName, userSource, notes, userRoleList, myClassType, groupIdList, userPermList, groupPermissions, otherAttributes, configProperties, syncSource, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonVXPortalUser {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    publicScreenName: ").append(toIndentedString(publicScreenName)).append("\n");
    sb.append("    userSource: ").append(toIndentedString(userSource)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    userRoleList: ").append(toIndentedString(userRoleList)).append("\n");
    sb.append("    myClassType: ").append(toIndentedString(myClassType)).append("\n");
    sb.append("    groupIdList: ").append(toIndentedString(groupIdList)).append("\n");
    sb.append("    userPermList: ").append(toIndentedString(userPermList)).append("\n");
    sb.append("    groupPermissions: ").append(toIndentedString(groupPermissions)).append("\n");
    sb.append("    otherAttributes: ").append(toIndentedString(otherAttributes)).append("\n");
    sb.append("    configProperties: ").append(toIndentedString(configProperties)).append("\n");
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
