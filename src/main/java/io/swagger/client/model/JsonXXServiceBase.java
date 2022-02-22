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
import io.swagger.client.model.JsonXXDBBase;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonXXServiceBase extends JsonXXDBBase {
  @SerializedName("guid")
  private String guid = null;

  @SerializedName("version")
  private BigDecimal version = null;

  @SerializedName("type")
  private BigDecimal type = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("tagService")
  private BigDecimal tagService = null;

  @SerializedName("policyVersion")
  private BigDecimal policyVersion = null;

  @SerializedName("policyUpdateTime")
  private BigDecimal policyUpdateTime = null;

  @SerializedName("tagVersion")
  private BigDecimal tagVersion = null;

  @SerializedName("tagUpdateTime")
  private BigDecimal tagUpdateTime = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("isenabled")
  private Boolean isenabled = null;

  public JsonXXServiceBase guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * 
   * @return guid
  **/
  @ApiModelProperty(value = "")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public JsonXXServiceBase version(BigDecimal version) {
    this.version = version;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;version&lt;/b&gt;
   * @return version
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>version</b>")
  public BigDecimal getVersion() {
    return version;
  }

  public void setVersion(BigDecimal version) {
    this.version = version;
  }

  public JsonXXServiceBase type(BigDecimal type) {
    this.type = type;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;type&lt;/b&gt;
   * @return type
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>type</b>")
  public BigDecimal getType() {
    return type;
  }

  public void setType(BigDecimal type) {
    this.type = type;
  }

  public JsonXXServiceBase name(String name) {
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

  public JsonXXServiceBase displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * 
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public JsonXXServiceBase tagService(BigDecimal tagService) {
    this.tagService = tagService;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;tagService&lt;/b&gt;
   * @return tagService
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>tagService</b>")
  public BigDecimal getTagService() {
    return tagService;
  }

  public void setTagService(BigDecimal tagService) {
    this.tagService = tagService;
  }

  public JsonXXServiceBase policyVersion(BigDecimal policyVersion) {
    this.policyVersion = policyVersion;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;policyVersion&lt;/b&gt;
   * @return policyVersion
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>policyVersion</b>")
  public BigDecimal getPolicyVersion() {
    return policyVersion;
  }

  public void setPolicyVersion(BigDecimal policyVersion) {
    this.policyVersion = policyVersion;
  }

  public JsonXXServiceBase policyUpdateTime(BigDecimal policyUpdateTime) {
    this.policyUpdateTime = policyUpdateTime;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;policyUpdateTime&lt;/b&gt;
   * @return policyUpdateTime
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>policyUpdateTime</b>")
  public BigDecimal getPolicyUpdateTime() {
    return policyUpdateTime;
  }

  public void setPolicyUpdateTime(BigDecimal policyUpdateTime) {
    this.policyUpdateTime = policyUpdateTime;
  }

  public JsonXXServiceBase tagVersion(BigDecimal tagVersion) {
    this.tagVersion = tagVersion;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;tagVersion&lt;/b&gt;
   * @return tagVersion
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>tagVersion</b>")
  public BigDecimal getTagVersion() {
    return tagVersion;
  }

  public void setTagVersion(BigDecimal tagVersion) {
    this.tagVersion = tagVersion;
  }

  public JsonXXServiceBase tagUpdateTime(BigDecimal tagUpdateTime) {
    this.tagUpdateTime = tagUpdateTime;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;tagUpdateTime&lt;/b&gt;
   * @return tagUpdateTime
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>tagUpdateTime</b>")
  public BigDecimal getTagUpdateTime() {
    return tagUpdateTime;
  }

  public void setTagUpdateTime(BigDecimal tagUpdateTime) {
    this.tagUpdateTime = tagUpdateTime;
  }

  public JsonXXServiceBase description(String description) {
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

  public JsonXXServiceBase isenabled(Boolean isenabled) {
    this.isenabled = isenabled;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;isEnabled&lt;/b&gt;
   * @return isenabled
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>isEnabled</b>")
  public Boolean isIsenabled() {
    return isenabled;
  }

  public void setIsenabled(Boolean isenabled) {
    this.isenabled = isenabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonXXServiceBase jsonXXServiceBase = (JsonXXServiceBase) o;
    return Objects.equals(this.guid, jsonXXServiceBase.guid) &&
        Objects.equals(this.version, jsonXXServiceBase.version) &&
        Objects.equals(this.type, jsonXXServiceBase.type) &&
        Objects.equals(this.name, jsonXXServiceBase.name) &&
        Objects.equals(this.displayName, jsonXXServiceBase.displayName) &&
        Objects.equals(this.tagService, jsonXXServiceBase.tagService) &&
        Objects.equals(this.policyVersion, jsonXXServiceBase.policyVersion) &&
        Objects.equals(this.policyUpdateTime, jsonXXServiceBase.policyUpdateTime) &&
        Objects.equals(this.tagVersion, jsonXXServiceBase.tagVersion) &&
        Objects.equals(this.tagUpdateTime, jsonXXServiceBase.tagUpdateTime) &&
        Objects.equals(this.description, jsonXXServiceBase.description) &&
        Objects.equals(this.isenabled, jsonXXServiceBase.isenabled) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guid, version, type, name, displayName, tagService, policyVersion, policyUpdateTime, tagVersion, tagUpdateTime, description, isenabled, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonXXServiceBase {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    tagService: ").append(toIndentedString(tagService)).append("\n");
    sb.append("    policyVersion: ").append(toIndentedString(policyVersion)).append("\n");
    sb.append("    policyUpdateTime: ").append(toIndentedString(policyUpdateTime)).append("\n");
    sb.append("    tagVersion: ").append(toIndentedString(tagVersion)).append("\n");
    sb.append("    tagUpdateTime: ").append(toIndentedString(tagUpdateTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isenabled: ").append(toIndentedString(isenabled)).append("\n");
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

