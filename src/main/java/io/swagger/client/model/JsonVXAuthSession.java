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
public class JsonVXAuthSession extends JsonVXDataObject {
  @SerializedName("loginId")
  private String loginId = null;

  @SerializedName("userId")
  private BigDecimal userId = null;

  @SerializedName("emailAddress")
  private String emailAddress = null;

  @SerializedName("isTestUser")
  private Boolean isTestUser = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("publicScreenName")
  private String publicScreenName = null;

  @SerializedName("familyScreenName")
  private String familyScreenName = null;

  @SerializedName("authTime")
  private BigDecimal authTime = null;

  @SerializedName("authStatus")
  private Integer authStatus = null;

  @SerializedName("authType")
  private Integer authType = null;

  @SerializedName("authProvider")
  private Integer authProvider = null;

  @SerializedName("deviceType")
  private Integer deviceType = null;

  @SerializedName("requestIP")
  private String requestIP = null;

  @SerializedName("cityName")
  private String cityName = null;

  @SerializedName("stateName")
  private String stateName = null;

  @SerializedName("countryName")
  private String countryName = null;

  @SerializedName("requestUserAgent")
  private String requestUserAgent = null;

  @SerializedName("myClassType")
  private Integer myClassType = null;

  public JsonVXAuthSession loginId(String loginId) {
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

  public JsonVXAuthSession userId(BigDecimal userId) {
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

  public JsonVXAuthSession emailAddress(String emailAddress) {
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

  public JsonVXAuthSession isTestUser(Boolean isTestUser) {
    this.isTestUser = isTestUser;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;isTestUser&lt;/b&gt;
   * @return isTestUser
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>isTestUser</b>")
  public Boolean isIsTestUser() {
    return isTestUser;
  }

  public void setIsTestUser(Boolean isTestUser) {
    this.isTestUser = isTestUser;
  }

  public JsonVXAuthSession firstName(String firstName) {
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

  public JsonVXAuthSession lastName(String lastName) {
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

  public JsonVXAuthSession publicScreenName(String publicScreenName) {
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

  public JsonVXAuthSession familyScreenName(String familyScreenName) {
    this.familyScreenName = familyScreenName;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;familyScreenName&lt;/b&gt;
   * @return familyScreenName
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>familyScreenName</b>")
  public String getFamilyScreenName() {
    return familyScreenName;
  }

  public void setFamilyScreenName(String familyScreenName) {
    this.familyScreenName = familyScreenName;
  }

  public JsonVXAuthSession authTime(BigDecimal authTime) {
    this.authTime = authTime;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;authTime&lt;/b&gt;
   * @return authTime
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>authTime</b>")
  public BigDecimal getAuthTime() {
    return authTime;
  }

  public void setAuthTime(BigDecimal authTime) {
    this.authTime = authTime;
  }

  public JsonVXAuthSession authStatus(Integer authStatus) {
    this.authStatus = authStatus;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;authStatus&lt;/b&gt;
   * @return authStatus
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>authStatus</b>")
  public Integer getAuthStatus() {
    return authStatus;
  }

  public void setAuthStatus(Integer authStatus) {
    this.authStatus = authStatus;
  }

  public JsonVXAuthSession authType(Integer authType) {
    this.authType = authType;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;authType&lt;/b&gt;
   * @return authType
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>authType</b>")
  public Integer getAuthType() {
    return authType;
  }

  public void setAuthType(Integer authType) {
    this.authType = authType;
  }

  public JsonVXAuthSession authProvider(Integer authProvider) {
    this.authProvider = authProvider;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;authProvider&lt;/b&gt;
   * @return authProvider
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>authProvider</b>")
  public Integer getAuthProvider() {
    return authProvider;
  }

  public void setAuthProvider(Integer authProvider) {
    this.authProvider = authProvider;
  }

  public JsonVXAuthSession deviceType(Integer deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;deviceType&lt;/b&gt;
   * @return deviceType
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>deviceType</b>")
  public Integer getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(Integer deviceType) {
    this.deviceType = deviceType;
  }

  public JsonVXAuthSession requestIP(String requestIP) {
    this.requestIP = requestIP;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;requestIP&lt;/b&gt;
   * @return requestIP
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>requestIP</b>")
  public String getRequestIP() {
    return requestIP;
  }

  public void setRequestIP(String requestIP) {
    this.requestIP = requestIP;
  }

  public JsonVXAuthSession cityName(String cityName) {
    this.cityName = cityName;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;cityName&lt;/b&gt;
   * @return cityName
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>cityName</b>")
  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public JsonVXAuthSession stateName(String stateName) {
    this.stateName = stateName;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;stateName&lt;/b&gt;
   * @return stateName
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>stateName</b>")
  public String getStateName() {
    return stateName;
  }

  public void setStateName(String stateName) {
    this.stateName = stateName;
  }

  public JsonVXAuthSession countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;countryName&lt;/b&gt;
   * @return countryName
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>countryName</b>")
  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public JsonVXAuthSession requestUserAgent(String requestUserAgent) {
    this.requestUserAgent = requestUserAgent;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;requestUserAgent&lt;/b&gt;
   * @return requestUserAgent
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>requestUserAgent</b>")
  public String getRequestUserAgent() {
    return requestUserAgent;
  }

  public void setRequestUserAgent(String requestUserAgent) {
    this.requestUserAgent = requestUserAgent;
  }

  public JsonVXAuthSession myClassType(Integer myClassType) {
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
    JsonVXAuthSession jsonVXAuthSession = (JsonVXAuthSession) o;
    return Objects.equals(this.loginId, jsonVXAuthSession.loginId) &&
        Objects.equals(this.userId, jsonVXAuthSession.userId) &&
        Objects.equals(this.emailAddress, jsonVXAuthSession.emailAddress) &&
        Objects.equals(this.isTestUser, jsonVXAuthSession.isTestUser) &&
        Objects.equals(this.firstName, jsonVXAuthSession.firstName) &&
        Objects.equals(this.lastName, jsonVXAuthSession.lastName) &&
        Objects.equals(this.publicScreenName, jsonVXAuthSession.publicScreenName) &&
        Objects.equals(this.familyScreenName, jsonVXAuthSession.familyScreenName) &&
        Objects.equals(this.authTime, jsonVXAuthSession.authTime) &&
        Objects.equals(this.authStatus, jsonVXAuthSession.authStatus) &&
        Objects.equals(this.authType, jsonVXAuthSession.authType) &&
        Objects.equals(this.authProvider, jsonVXAuthSession.authProvider) &&
        Objects.equals(this.deviceType, jsonVXAuthSession.deviceType) &&
        Objects.equals(this.requestIP, jsonVXAuthSession.requestIP) &&
        Objects.equals(this.cityName, jsonVXAuthSession.cityName) &&
        Objects.equals(this.stateName, jsonVXAuthSession.stateName) &&
        Objects.equals(this.countryName, jsonVXAuthSession.countryName) &&
        Objects.equals(this.requestUserAgent, jsonVXAuthSession.requestUserAgent) &&
        Objects.equals(this.myClassType, jsonVXAuthSession.myClassType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginId, userId, emailAddress, isTestUser, firstName, lastName, publicScreenName, familyScreenName, authTime, authStatus, authType, authProvider, deviceType, requestIP, cityName, stateName, countryName, requestUserAgent, myClassType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonVXAuthSession {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    isTestUser: ").append(toIndentedString(isTestUser)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    publicScreenName: ").append(toIndentedString(publicScreenName)).append("\n");
    sb.append("    familyScreenName: ").append(toIndentedString(familyScreenName)).append("\n");
    sb.append("    authTime: ").append(toIndentedString(authTime)).append("\n");
    sb.append("    authStatus: ").append(toIndentedString(authStatus)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    authProvider: ").append(toIndentedString(authProvider)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    requestIP: ").append(toIndentedString(requestIP)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    stateName: ").append(toIndentedString(stateName)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    requestUserAgent: ").append(toIndentedString(requestUserAgent)).append("\n");
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

