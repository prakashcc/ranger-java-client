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
import io.swagger.client.model.XmlNs0VXDataObject;
import java.io.IOException;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class XmlNs0VXAccessAudit extends XmlNs0VXDataObject {
  @SerializedName("accessResult")
  private Integer accessResult = null;

  @SerializedName("accessType")
  private String accessType = null;

  @SerializedName("aclEnforcer")
  private String aclEnforcer = null;

  @SerializedName("action")
  private String action = null;

  @SerializedName("agentHost")
  private String agentHost = null;

  @SerializedName("agentId")
  private String agentId = null;

  @SerializedName("auditType")
  private Integer auditType = null;

  @SerializedName("clientIP")
  private String clientIP = null;

  @SerializedName("clientType")
  private String clientType = null;

  @SerializedName("clusterName")
  private String clusterName = null;

  @SerializedName("eventCount")
  private Long eventCount = null;

  @SerializedName("eventDuration")
  private Long eventDuration = null;

  @SerializedName("eventId")
  private String eventId = null;

  @SerializedName("eventTime")
  private String eventTime = null;

  @SerializedName("policyId")
  private Long policyId = null;

  @SerializedName("policyVersion")
  private Long policyVersion = null;

  @SerializedName("repoDisplayName")
  private String repoDisplayName = null;

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

  @SerializedName("sequenceNumber")
  private Long sequenceNumber = null;

  @SerializedName("serviceType")
  private String serviceType = null;

  @SerializedName("serviceTypeDisplayName")
  private String serviceTypeDisplayName = null;

  @SerializedName("sessionId")
  private String sessionId = null;

  @SerializedName("tags")
  private String tags = null;

  @SerializedName("zoneName")
  private String zoneName = null;

  public XmlNs0VXAccessAudit accessResult(Integer accessResult) {
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

  public XmlNs0VXAccessAudit accessType(String accessType) {
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

  public XmlNs0VXAccessAudit aclEnforcer(String aclEnforcer) {
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

  public XmlNs0VXAccessAudit action(String action) {
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

  public XmlNs0VXAccessAudit agentHost(String agentHost) {
    this.agentHost = agentHost;
    return this;
  }

   /**
   * 
   * @return agentHost
  **/
  @ApiModelProperty(value = "")
  public String getAgentHost() {
    return agentHost;
  }

  public void setAgentHost(String agentHost) {
    this.agentHost = agentHost;
  }

  public XmlNs0VXAccessAudit agentId(String agentId) {
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

  public XmlNs0VXAccessAudit auditType(Integer auditType) {
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

  public XmlNs0VXAccessAudit clientIP(String clientIP) {
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

  public XmlNs0VXAccessAudit clientType(String clientType) {
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

  public XmlNs0VXAccessAudit clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

   /**
   * the clusterName
   * @return clusterName
  **/
  @ApiModelProperty(value = "the clusterName")
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public XmlNs0VXAccessAudit eventCount(Long eventCount) {
    this.eventCount = eventCount;
    return this;
  }

   /**
   * 
   * @return eventCount
  **/
  @ApiModelProperty(value = "")
  public Long getEventCount() {
    return eventCount;
  }

  public void setEventCount(Long eventCount) {
    this.eventCount = eventCount;
  }

  public XmlNs0VXAccessAudit eventDuration(Long eventDuration) {
    this.eventDuration = eventDuration;
    return this;
  }

   /**
   * 
   * @return eventDuration
  **/
  @ApiModelProperty(value = "")
  public Long getEventDuration() {
    return eventDuration;
  }

  public void setEventDuration(Long eventDuration) {
    this.eventDuration = eventDuration;
  }

  public XmlNs0VXAccessAudit eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * 
   * @return eventId
  **/
  @ApiModelProperty(value = "")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public XmlNs0VXAccessAudit eventTime(String eventTime) {
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

  public XmlNs0VXAccessAudit policyId(Long policyId) {
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

  public XmlNs0VXAccessAudit policyVersion(Long policyVersion) {
    this.policyVersion = policyVersion;
    return this;
  }

   /**
   * the policyVersion
   * @return policyVersion
  **/
  @ApiModelProperty(value = "the policyVersion")
  public Long getPolicyVersion() {
    return policyVersion;
  }

  public void setPolicyVersion(Long policyVersion) {
    this.policyVersion = policyVersion;
  }

  public XmlNs0VXAccessAudit repoDisplayName(String repoDisplayName) {
    this.repoDisplayName = repoDisplayName;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;repoDisplayName&lt;/b&gt;
   * @return repoDisplayName
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>repoDisplayName</b>")
  public String getRepoDisplayName() {
    return repoDisplayName;
  }

  public void setRepoDisplayName(String repoDisplayName) {
    this.repoDisplayName = repoDisplayName;
  }

  public XmlNs0VXAccessAudit repoName(String repoName) {
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

  public XmlNs0VXAccessAudit repoType(Integer repoType) {
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

  public XmlNs0VXAccessAudit requestData(String requestData) {
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

  public XmlNs0VXAccessAudit requestUser(String requestUser) {
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

  public XmlNs0VXAccessAudit resourcePath(String resourcePath) {
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

  public XmlNs0VXAccessAudit resourceType(String resourceType) {
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

  public XmlNs0VXAccessAudit resultReason(String resultReason) {
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

  public XmlNs0VXAccessAudit sequenceNumber(Long sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

   /**
   * 
   * @return sequenceNumber
  **/
  @ApiModelProperty(value = "")
  public Long getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(Long sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  public XmlNs0VXAccessAudit serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

   /**
   * the serviceType
   * @return serviceType
  **/
  @ApiModelProperty(value = "the serviceType")
  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public XmlNs0VXAccessAudit serviceTypeDisplayName(String serviceTypeDisplayName) {
    this.serviceTypeDisplayName = serviceTypeDisplayName;
    return this;
  }

   /**
   * the serviceTypeDisplayName
   * @return serviceTypeDisplayName
  **/
  @ApiModelProperty(value = "the serviceTypeDisplayName")
  public String getServiceTypeDisplayName() {
    return serviceTypeDisplayName;
  }

  public void setServiceTypeDisplayName(String serviceTypeDisplayName) {
    this.serviceTypeDisplayName = serviceTypeDisplayName;
  }

  public XmlNs0VXAccessAudit sessionId(String sessionId) {
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

  public XmlNs0VXAccessAudit tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * the tags
   * @return tags
  **/
  @ApiModelProperty(value = "the tags")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public XmlNs0VXAccessAudit zoneName(String zoneName) {
    this.zoneName = zoneName;
    return this;
  }

   /**
   * the zoneName
   * @return zoneName
  **/
  @ApiModelProperty(value = "the zoneName")
  public String getZoneName() {
    return zoneName;
  }

  public void setZoneName(String zoneName) {
    this.zoneName = zoneName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlNs0VXAccessAudit xmlNs0VXAccessAudit = (XmlNs0VXAccessAudit) o;
    return Objects.equals(this.accessResult, xmlNs0VXAccessAudit.accessResult) &&
        Objects.equals(this.accessType, xmlNs0VXAccessAudit.accessType) &&
        Objects.equals(this.aclEnforcer, xmlNs0VXAccessAudit.aclEnforcer) &&
        Objects.equals(this.action, xmlNs0VXAccessAudit.action) &&
        Objects.equals(this.agentHost, xmlNs0VXAccessAudit.agentHost) &&
        Objects.equals(this.agentId, xmlNs0VXAccessAudit.agentId) &&
        Objects.equals(this.auditType, xmlNs0VXAccessAudit.auditType) &&
        Objects.equals(this.clientIP, xmlNs0VXAccessAudit.clientIP) &&
        Objects.equals(this.clientType, xmlNs0VXAccessAudit.clientType) &&
        Objects.equals(this.clusterName, xmlNs0VXAccessAudit.clusterName) &&
        Objects.equals(this.eventCount, xmlNs0VXAccessAudit.eventCount) &&
        Objects.equals(this.eventDuration, xmlNs0VXAccessAudit.eventDuration) &&
        Objects.equals(this.eventId, xmlNs0VXAccessAudit.eventId) &&
        Objects.equals(this.eventTime, xmlNs0VXAccessAudit.eventTime) &&
        Objects.equals(this.policyId, xmlNs0VXAccessAudit.policyId) &&
        Objects.equals(this.policyVersion, xmlNs0VXAccessAudit.policyVersion) &&
        Objects.equals(this.repoDisplayName, xmlNs0VXAccessAudit.repoDisplayName) &&
        Objects.equals(this.repoName, xmlNs0VXAccessAudit.repoName) &&
        Objects.equals(this.repoType, xmlNs0VXAccessAudit.repoType) &&
        Objects.equals(this.requestData, xmlNs0VXAccessAudit.requestData) &&
        Objects.equals(this.requestUser, xmlNs0VXAccessAudit.requestUser) &&
        Objects.equals(this.resourcePath, xmlNs0VXAccessAudit.resourcePath) &&
        Objects.equals(this.resourceType, xmlNs0VXAccessAudit.resourceType) &&
        Objects.equals(this.resultReason, xmlNs0VXAccessAudit.resultReason) &&
        Objects.equals(this.sequenceNumber, xmlNs0VXAccessAudit.sequenceNumber) &&
        Objects.equals(this.serviceType, xmlNs0VXAccessAudit.serviceType) &&
        Objects.equals(this.serviceTypeDisplayName, xmlNs0VXAccessAudit.serviceTypeDisplayName) &&
        Objects.equals(this.sessionId, xmlNs0VXAccessAudit.sessionId) &&
        Objects.equals(this.tags, xmlNs0VXAccessAudit.tags) &&
        Objects.equals(this.zoneName, xmlNs0VXAccessAudit.zoneName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessResult, accessType, aclEnforcer, action, agentHost, agentId, auditType, clientIP, clientType, clusterName, eventCount, eventDuration, eventId, eventTime, policyId, policyVersion, repoDisplayName, repoName, repoType, requestData, requestUser, resourcePath, resourceType, resultReason, sequenceNumber, serviceType, serviceTypeDisplayName, sessionId, tags, zoneName, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0VXAccessAudit {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accessResult: ").append(toIndentedString(accessResult)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    aclEnforcer: ").append(toIndentedString(aclEnforcer)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    agentHost: ").append(toIndentedString(agentHost)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    auditType: ").append(toIndentedString(auditType)).append("\n");
    sb.append("    clientIP: ").append(toIndentedString(clientIP)).append("\n");
    sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
    sb.append("    eventDuration: ").append(toIndentedString(eventDuration)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    policyVersion: ").append(toIndentedString(policyVersion)).append("\n");
    sb.append("    repoDisplayName: ").append(toIndentedString(repoDisplayName)).append("\n");
    sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
    sb.append("    repoType: ").append(toIndentedString(repoType)).append("\n");
    sb.append("    requestData: ").append(toIndentedString(requestData)).append("\n");
    sb.append("    requestUser: ").append(toIndentedString(requestUser)).append("\n");
    sb.append("    resourcePath: ").append(toIndentedString(resourcePath)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resultReason: ").append(toIndentedString(resultReason)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    serviceTypeDisplayName: ").append(toIndentedString(serviceTypeDisplayName)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
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
