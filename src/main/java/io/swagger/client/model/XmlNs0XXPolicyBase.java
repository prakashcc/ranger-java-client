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
public class XmlNs0XXPolicyBase extends XmlNs0XXDBBase {
  @SerializedName("description")
  private String description = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("isAuditEnabled")
  private Boolean isAuditEnabled = null;

  @SerializedName("isEnabled")
  private Boolean isEnabled = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("options")
  private String options = null;

  @SerializedName("policyPriority")
  private Integer policyPriority = null;

  @SerializedName("policyText")
  private String policyText = null;

  @SerializedName("policyType")
  private Integer policyType = null;

  @SerializedName("resourceSignature")
  private String resourceSignature = null;

  @SerializedName("service")
  private Long service = null;

  @SerializedName("version")
  private Long version = null;

  @SerializedName("zoneId")
  private Long zoneId = null;

  public XmlNs0XXPolicyBase description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;description&lt;/b&gt;
   * @return description
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>description</b>")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public XmlNs0XXPolicyBase guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * the gUID
   * @return guid
  **/
  @ApiModelProperty(value = "the gUID")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public XmlNs0XXPolicyBase isAuditEnabled(Boolean isAuditEnabled) {
    this.isAuditEnabled = isAuditEnabled;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;isAuditEnabled&lt;/b&gt;
   * @return isAuditEnabled
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>isAuditEnabled</b>")
  public Boolean isIsAuditEnabled() {
    return isAuditEnabled;
  }

  public void setIsAuditEnabled(Boolean isAuditEnabled) {
    this.isAuditEnabled = isAuditEnabled;
  }

  public XmlNs0XXPolicyBase isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;isEnabled&lt;/b&gt;
   * @return isEnabled
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>isEnabled</b>")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public XmlNs0XXPolicyBase name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;name&lt;/b&gt;
   * @return name
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>name</b>")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public XmlNs0XXPolicyBase options(String options) {
    this.options = options;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;options&lt;/b&gt;
   * @return options
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>options</b>")
  public String getOptions() {
    return options;
  }

  public void setOptions(String options) {
    this.options = options;
  }

  public XmlNs0XXPolicyBase policyPriority(Integer policyPriority) {
    this.policyPriority = policyPriority;
    return this;
  }

   /**
   * 
   * @return policyPriority
  **/
  @ApiModelProperty(value = "")
  public Integer getPolicyPriority() {
    return policyPriority;
  }

  public void setPolicyPriority(Integer policyPriority) {
    this.policyPriority = policyPriority;
  }

  public XmlNs0XXPolicyBase policyText(String policyText) {
    this.policyText = policyText;
    return this;
  }

   /**
   * 
   * @return policyText
  **/
  @ApiModelProperty(value = "")
  public String getPolicyText() {
    return policyText;
  }

  public void setPolicyText(String policyText) {
    this.policyText = policyText;
  }

  public XmlNs0XXPolicyBase policyType(Integer policyType) {
    this.policyType = policyType;
    return this;
  }

   /**
   * 
   * @return policyType
  **/
  @ApiModelProperty(value = "")
  public Integer getPolicyType() {
    return policyType;
  }

  public void setPolicyType(Integer policyType) {
    this.policyType = policyType;
  }

  public XmlNs0XXPolicyBase resourceSignature(String resourceSignature) {
    this.resourceSignature = resourceSignature;
    return this;
  }

   /**
   * the resourceSignature
   * @return resourceSignature
  **/
  @ApiModelProperty(value = "the resourceSignature")
  public String getResourceSignature() {
    return resourceSignature;
  }

  public void setResourceSignature(String resourceSignature) {
    this.resourceSignature = resourceSignature;
  }

  public XmlNs0XXPolicyBase service(Long service) {
    this.service = service;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;service&lt;/b&gt;
   * @return service
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>service</b>")
  public Long getService() {
    return service;
  }

  public void setService(Long service) {
    this.service = service;
  }

  public XmlNs0XXPolicyBase version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;version&lt;/b&gt;
   * @return version
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>version</b>")
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public XmlNs0XXPolicyBase zoneId(Long zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * 
   * @return zoneId
  **/
  @ApiModelProperty(value = "")
  public Long getZoneId() {
    return zoneId;
  }

  public void setZoneId(Long zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlNs0XXPolicyBase xmlNs0XXPolicyBase = (XmlNs0XXPolicyBase) o;
    return Objects.equals(this.description, xmlNs0XXPolicyBase.description) &&
        Objects.equals(this.guid, xmlNs0XXPolicyBase.guid) &&
        Objects.equals(this.isAuditEnabled, xmlNs0XXPolicyBase.isAuditEnabled) &&
        Objects.equals(this.isEnabled, xmlNs0XXPolicyBase.isEnabled) &&
        Objects.equals(this.name, xmlNs0XXPolicyBase.name) &&
        Objects.equals(this.options, xmlNs0XXPolicyBase.options) &&
        Objects.equals(this.policyPriority, xmlNs0XXPolicyBase.policyPriority) &&
        Objects.equals(this.policyText, xmlNs0XXPolicyBase.policyText) &&
        Objects.equals(this.policyType, xmlNs0XXPolicyBase.policyType) &&
        Objects.equals(this.resourceSignature, xmlNs0XXPolicyBase.resourceSignature) &&
        Objects.equals(this.service, xmlNs0XXPolicyBase.service) &&
        Objects.equals(this.version, xmlNs0XXPolicyBase.version) &&
        Objects.equals(this.zoneId, xmlNs0XXPolicyBase.zoneId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, guid, isAuditEnabled, isEnabled, name, options, policyPriority, policyText, policyType, resourceSignature, service, version, zoneId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0XXPolicyBase {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    isAuditEnabled: ").append(toIndentedString(isAuditEnabled)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    policyPriority: ").append(toIndentedString(policyPriority)).append("\n");
    sb.append("    policyText: ").append(toIndentedString(policyText)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
    sb.append("    resourceSignature: ").append(toIndentedString(resourceSignature)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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

