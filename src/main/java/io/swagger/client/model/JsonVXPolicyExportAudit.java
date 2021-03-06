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
public class JsonVXPolicyExportAudit extends JsonVXDataObject {
  @SerializedName("clientIP")
  private String clientIP = null;

  @SerializedName("agentId")
  private String agentId = null;

  @SerializedName("requestedEpoch")
  private BigDecimal requestedEpoch = null;

  @SerializedName("lastUpdated")
  private BigDecimal lastUpdated = null;

  @SerializedName("repositoryName")
  private String repositoryName = null;

  @SerializedName("repositoryDisplayName")
  private String repositoryDisplayName = null;

  @SerializedName("exportedJson")
  private String exportedJson = null;

  @SerializedName("httpRetCode")
  private Integer httpRetCode = null;

  @SerializedName("syncStatus")
  private String syncStatus = null;

  @SerializedName("clusterName")
  private String clusterName = null;

  @SerializedName("zoneName")
  private String zoneName = null;

  @SerializedName("policyVersion")
  private BigDecimal policyVersion = null;

  @SerializedName("myClassType")
  private Integer myClassType = null;

  public JsonVXPolicyExportAudit clientIP(String clientIP) {
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

  public JsonVXPolicyExportAudit agentId(String agentId) {
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

  public JsonVXPolicyExportAudit requestedEpoch(BigDecimal requestedEpoch) {
    this.requestedEpoch = requestedEpoch;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;requestedEpoch&lt;/b&gt;
   * @return requestedEpoch
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>requestedEpoch</b>")
  public BigDecimal getRequestedEpoch() {
    return requestedEpoch;
  }

  public void setRequestedEpoch(BigDecimal requestedEpoch) {
    this.requestedEpoch = requestedEpoch;
  }

  public JsonVXPolicyExportAudit lastUpdated(BigDecimal lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;lastUpdated&lt;/b&gt;
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>lastUpdated</b>")
  public BigDecimal getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(BigDecimal lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public JsonVXPolicyExportAudit repositoryName(String repositoryName) {
    this.repositoryName = repositoryName;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;repositoryName&lt;/b&gt;
   * @return repositoryName
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>repositoryName</b>")
  public String getRepositoryName() {
    return repositoryName;
  }

  public void setRepositoryName(String repositoryName) {
    this.repositoryName = repositoryName;
  }

  public JsonVXPolicyExportAudit repositoryDisplayName(String repositoryDisplayName) {
    this.repositoryDisplayName = repositoryDisplayName;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;repositoryDisplayName&lt;/b&gt;
   * @return repositoryDisplayName
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>repositoryDisplayName</b>")
  public String getRepositoryDisplayName() {
    return repositoryDisplayName;
  }

  public void setRepositoryDisplayName(String repositoryDisplayName) {
    this.repositoryDisplayName = repositoryDisplayName;
  }

  public JsonVXPolicyExportAudit exportedJson(String exportedJson) {
    this.exportedJson = exportedJson;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;exportedJson&lt;/b&gt;
   * @return exportedJson
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>exportedJson</b>")
  public String getExportedJson() {
    return exportedJson;
  }

  public void setExportedJson(String exportedJson) {
    this.exportedJson = exportedJson;
  }

  public JsonVXPolicyExportAudit httpRetCode(Integer httpRetCode) {
    this.httpRetCode = httpRetCode;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;httpRetCode&lt;/b&gt;
   * @return httpRetCode
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>httpRetCode</b>")
  public Integer getHttpRetCode() {
    return httpRetCode;
  }

  public void setHttpRetCode(Integer httpRetCode) {
    this.httpRetCode = httpRetCode;
  }

  public JsonVXPolicyExportAudit syncStatus(String syncStatus) {
    this.syncStatus = syncStatus;
    return this;
  }

   /**
   * 
   * @return syncStatus
  **/
  @ApiModelProperty(value = "")
  public String getSyncStatus() {
    return syncStatus;
  }

  public void setSyncStatus(String syncStatus) {
    this.syncStatus = syncStatus;
  }

  public JsonVXPolicyExportAudit clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

   /**
   * 
   * @return clusterName
  **/
  @ApiModelProperty(value = "")
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public JsonVXPolicyExportAudit zoneName(String zoneName) {
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

  public JsonVXPolicyExportAudit policyVersion(BigDecimal policyVersion) {
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

  public JsonVXPolicyExportAudit myClassType(Integer myClassType) {
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
    JsonVXPolicyExportAudit jsonVXPolicyExportAudit = (JsonVXPolicyExportAudit) o;
    return Objects.equals(this.clientIP, jsonVXPolicyExportAudit.clientIP) &&
        Objects.equals(this.agentId, jsonVXPolicyExportAudit.agentId) &&
        Objects.equals(this.requestedEpoch, jsonVXPolicyExportAudit.requestedEpoch) &&
        Objects.equals(this.lastUpdated, jsonVXPolicyExportAudit.lastUpdated) &&
        Objects.equals(this.repositoryName, jsonVXPolicyExportAudit.repositoryName) &&
        Objects.equals(this.repositoryDisplayName, jsonVXPolicyExportAudit.repositoryDisplayName) &&
        Objects.equals(this.exportedJson, jsonVXPolicyExportAudit.exportedJson) &&
        Objects.equals(this.httpRetCode, jsonVXPolicyExportAudit.httpRetCode) &&
        Objects.equals(this.syncStatus, jsonVXPolicyExportAudit.syncStatus) &&
        Objects.equals(this.clusterName, jsonVXPolicyExportAudit.clusterName) &&
        Objects.equals(this.zoneName, jsonVXPolicyExportAudit.zoneName) &&
        Objects.equals(this.policyVersion, jsonVXPolicyExportAudit.policyVersion) &&
        Objects.equals(this.myClassType, jsonVXPolicyExportAudit.myClassType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientIP, agentId, requestedEpoch, lastUpdated, repositoryName, repositoryDisplayName, exportedJson, httpRetCode, syncStatus, clusterName, zoneName, policyVersion, myClassType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonVXPolicyExportAudit {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    clientIP: ").append(toIndentedString(clientIP)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    requestedEpoch: ").append(toIndentedString(requestedEpoch)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    repositoryName: ").append(toIndentedString(repositoryName)).append("\n");
    sb.append("    repositoryDisplayName: ").append(toIndentedString(repositoryDisplayName)).append("\n");
    sb.append("    exportedJson: ").append(toIndentedString(exportedJson)).append("\n");
    sb.append("    httpRetCode: ").append(toIndentedString(httpRetCode)).append("\n");
    sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
    sb.append("    policyVersion: ").append(toIndentedString(policyVersion)).append("\n");
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

