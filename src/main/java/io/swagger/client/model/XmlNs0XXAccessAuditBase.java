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
import io.swagger.client.model.XmlNs0XXDBBase;
import java.io.IOException;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class XmlNs0XXAccessAuditBase extends XmlNs0XXDBBase {
  @SerializedName("accessResult")
  private Integer accessResult = null;

  @SerializedName("accessType")
  private String accessType = null;

  @SerializedName("aclEnforcer")
  private String aclEnforcer = null;

  @SerializedName("action")
  private String action = null;

  @SerializedName("agentId")
  private String agentId = null;

  @SerializedName("auditType")
  private Integer auditType = null;

  @SerializedName("clientIP")
  private String clientIP = null;

  @SerializedName("clientType")
  private String clientType = null;

  @SerializedName("eventTime")
  private String eventTime = null;

  @SerializedName("policyId")
  private Long policyId = null;

  @SerializedName("repoName")
  private String repoName = null;

  @SerializedName("repoType")
  private Integer repoType = null;

  @SerializedName("requestData")
  private String requestData = null;

  @SerializedName("requestUser")
  private String requestUser = null;

  @SerializedName("resourcePath")
  private String resourcePath = null;

  @SerializedName("resourceType")
  private String resourceType = null;

  @SerializedName("resultReason")
  private String resultReason = null;

  @SerializedName("sessionId")
  private String sessionId = null;

  public XmlNs0XXAccessAuditBase accessResult(Integer accessResult) {
    this.accessResult = accessResult;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;accessResult&lt;/b&gt;
   * @return accessResult
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>accessResult</b>")
  public Integer getAccessResult() {
    return accessResult;
  }

  public void setAccessResult(Integer accessResult) {
    this.accessResult = accessResult;
  }

  public XmlNs0XXAccessAuditBase accessType(String accessType) {
    this.accessType = accessType;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;accessType&lt;/b&gt;
   * @return accessType
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>accessType</b>")
  public String getAccessType() {
    return accessType;
  }

  public void setAccessType(String accessType) {
    this.accessType = accessType;
  }

  public XmlNs0XXAccessAuditBase aclEnforcer(String aclEnforcer) {
    this.aclEnforcer = aclEnforcer;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;aclEnforcer&lt;/b&gt;
   * @return aclEnforcer
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>aclEnforcer</b>")
  public String getAclEnforcer() {
    return aclEnforcer;
  }

  public void setAclEnforcer(String aclEnforcer) {
    this.aclEnforcer = aclEnforcer;
  }

  public XmlNs0XXAccessAuditBase action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;action&lt;/b&gt;
   * @return action
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>action</b>")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public XmlNs0XXAccessAuditBase agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;agentId&lt;/b&gt;
   * @return agentId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>agentId</b>")
  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  public XmlNs0XXAccessAuditBase auditType(Integer auditType) {
    this.auditType = auditType;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;auditType&lt;/b&gt;
   * @return auditType
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>auditType</b>")
  public Integer getAuditType() {
    return auditType;
  }

  public void setAuditType(Integer auditType) {
    this.auditType = auditType;
  }

  public XmlNs0XXAccessAuditBase clientIP(String clientIP) {
    this.clientIP = clientIP;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;clientIP&lt;/b&gt;
   * @return clientIP
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>clientIP</b>")
  public String getClientIP() {
    return clientIP;
  }

  public void setClientIP(String clientIP) {
    this.clientIP = clientIP;
  }

  public XmlNs0XXAccessAuditBase clientType(String clientType) {
    this.clientType = clientType;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;clientType&lt;/b&gt;
   * @return clientType
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>clientType</b>")
  public String getClientType() {
    return clientType;
  }

  public void setClientType(String clientType) {
    this.clientType = clientType;
  }

  public XmlNs0XXAccessAuditBase eventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;eventTime&lt;/b&gt;
   * @return eventTime
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>eventTime</b>")
  public String getEventTime() {
    return eventTime;
  }

  public void setEventTime(String eventTime) {
    this.eventTime = eventTime;
  }

  public XmlNs0XXAccessAuditBase policyId(Long policyId) {
    this.policyId = policyId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;policyId&lt;/b&gt;
   * @return policyId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>policyId</b>")
  public Long getPolicyId() {
    return policyId;
  }

  public void setPolicyId(Long policyId) {
    this.policyId = policyId;
  }

  public XmlNs0XXAccessAuditBase repoName(String repoName) {
    this.repoName = repoName;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;repoName&lt;/b&gt;
   * @return repoName
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>repoName</b>")
  public String getRepoName() {
    return repoName;
  }

  public void setRepoName(String repoName) {
    this.repoName = repoName;
  }

  public XmlNs0XXAccessAuditBase repoType(Integer repoType) {
    this.repoType = repoType;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;repoType&lt;/b&gt;
   * @return repoType
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>repoType</b>")
  public Integer getRepoType() {
    return repoType;
  }

  public void setRepoType(Integer repoType) {
    this.repoType = repoType;
  }

  public XmlNs0XXAccessAuditBase requestData(String requestData) {
    this.requestData = requestData;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;requestData&lt;/b&gt;
   * @return requestData
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>requestData</b>")
  public String getRequestData() {
    return requestData;
  }

  public void setRequestData(String requestData) {
    this.requestData = requestData;
  }

  public XmlNs0XXAccessAuditBase requestUser(String requestUser) {
    this.requestUser = requestUser;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;requestUser&lt;/b&gt;
   * @return requestUser
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>requestUser</b>")
  public String getRequestUser() {
    return requestUser;
  }

  public void setRequestUser(String requestUser) {
    this.requestUser = requestUser;
  }

  public XmlNs0XXAccessAuditBase resourcePath(String resourcePath) {
    this.resourcePath = resourcePath;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;resourcePath&lt;/b&gt;
   * @return resourcePath
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>resourcePath</b>")
  public String getResourcePath() {
    return resourcePath;
  }

  public void setResourcePath(String resourcePath) {
    this.resourcePath = resourcePath;
  }

  public XmlNs0XXAccessAuditBase resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;resourceType&lt;/b&gt;
   * @return resourceType
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>resourceType</b>")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public XmlNs0XXAccessAuditBase resultReason(String resultReason) {
    this.resultReason = resultReason;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;resultReason&lt;/b&gt;
   * @return resultReason
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>resultReason</b>")
  public String getResultReason() {
    return resultReason;
  }

  public void setResultReason(String resultReason) {
    this.resultReason = resultReason;
  }

  public XmlNs0XXAccessAuditBase sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;sessionId&lt;/b&gt;
   * @return sessionId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>sessionId</b>")
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlNs0XXAccessAuditBase xmlNs0XXAccessAuditBase = (XmlNs0XXAccessAuditBase) o;
    return Objects.equals(this.accessResult, xmlNs0XXAccessAuditBase.accessResult) &&
        Objects.equals(this.accessType, xmlNs0XXAccessAuditBase.accessType) &&
        Objects.equals(this.aclEnforcer, xmlNs0XXAccessAuditBase.aclEnforcer) &&
        Objects.equals(this.action, xmlNs0XXAccessAuditBase.action) &&
        Objects.equals(this.agentId, xmlNs0XXAccessAuditBase.agentId) &&
        Objects.equals(this.auditType, xmlNs0XXAccessAuditBase.auditType) &&
        Objects.equals(this.clientIP, xmlNs0XXAccessAuditBase.clientIP) &&
        Objects.equals(this.clientType, xmlNs0XXAccessAuditBase.clientType) &&
        Objects.equals(this.eventTime, xmlNs0XXAccessAuditBase.eventTime) &&
        Objects.equals(this.policyId, xmlNs0XXAccessAuditBase.policyId) &&
        Objects.equals(this.repoName, xmlNs0XXAccessAuditBase.repoName) &&
        Objects.equals(this.repoType, xmlNs0XXAccessAuditBase.repoType) &&
        Objects.equals(this.requestData, xmlNs0XXAccessAuditBase.requestData) &&
        Objects.equals(this.requestUser, xmlNs0XXAccessAuditBase.requestUser) &&
        Objects.equals(this.resourcePath, xmlNs0XXAccessAuditBase.resourcePath) &&
        Objects.equals(this.resourceType, xmlNs0XXAccessAuditBase.resourceType) &&
        Objects.equals(this.resultReason, xmlNs0XXAccessAuditBase.resultReason) &&
        Objects.equals(this.sessionId, xmlNs0XXAccessAuditBase.sessionId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessResult, accessType, aclEnforcer, action, agentId, auditType, clientIP, clientType, eventTime, policyId, repoName, repoType, requestData, requestUser, resourcePath, resourceType, resultReason, sessionId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0XXAccessAuditBase {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accessResult: ").append(toIndentedString(accessResult)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    aclEnforcer: ").append(toIndentedString(aclEnforcer)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    auditType: ").append(toIndentedString(auditType)).append("\n");
    sb.append("    clientIP: ").append(toIndentedString(clientIP)).append("\n");
    sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
    sb.append("    repoType: ").append(toIndentedString(repoType)).append("\n");
    sb.append("    requestData: ").append(toIndentedString(requestData)).append("\n");
    sb.append("    requestUser: ").append(toIndentedString(requestUser)).append("\n");
    sb.append("    resourcePath: ").append(toIndentedString(resourcePath)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resultReason: ").append(toIndentedString(resultReason)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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
