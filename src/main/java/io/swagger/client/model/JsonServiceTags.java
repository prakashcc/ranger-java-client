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
import io.swagger.client.model.JsonRangerServiceResource;
import io.swagger.client.model.JsonRangerTag;
import io.swagger.client.model.JsonRangerTagDef;
import io.swagger.client.model.JsonTagsChangeExtent;
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
public class JsonServiceTags {
  @SerializedName("serviceName")
  private String serviceName = null;

  @SerializedName("tagUpdateTime")
  private BigDecimal tagUpdateTime = null;

  @SerializedName("resourceToTagIds")
  private Map<String, List<BigDecimal>> resourceToTagIds = null;

  @SerializedName("tagDefinitions")
  private Map<String, JsonRangerTagDef> tagDefinitions = null;

  @SerializedName("isDelta")
  private Boolean isDelta = null;

  @SerializedName("tags")
  private Map<String, JsonRangerTag> tags = null;

  @SerializedName("tagsChangeExtent")
  private JsonTagsChangeExtent tagsChangeExtent = null;

  @SerializedName("serviceResources")
  private List<JsonRangerServiceResource> serviceResources = null;

  @SerializedName("op")
  private String op = null;

  @SerializedName("tagVersion")
  private BigDecimal tagVersion = null;

  public JsonServiceTags serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * 
   * @return serviceName
  **/
  @ApiModelProperty(value = "")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public JsonServiceTags tagUpdateTime(BigDecimal tagUpdateTime) {
    this.tagUpdateTime = tagUpdateTime;
    return this;
  }

   /**
   * 
   * @return tagUpdateTime
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTagUpdateTime() {
    return tagUpdateTime;
  }

  public void setTagUpdateTime(BigDecimal tagUpdateTime) {
    this.tagUpdateTime = tagUpdateTime;
  }

  public JsonServiceTags resourceToTagIds(Map<String, List<BigDecimal>> resourceToTagIds) {
    this.resourceToTagIds = resourceToTagIds;
    return this;
  }

  public JsonServiceTags putResourceToTagIdsItem(String key, List<BigDecimal> resourceToTagIdsItem) {
    if (this.resourceToTagIds == null) {
      this.resourceToTagIds = new HashMap<String, List<BigDecimal>>();
    }
    this.resourceToTagIds.put(key, resourceToTagIdsItem);
    return this;
  }

   /**
   * 
   * @return resourceToTagIds
  **/
  @ApiModelProperty(value = "")
  public Map<String, List<BigDecimal>> getResourceToTagIds() {
    return resourceToTagIds;
  }

  public void setResourceToTagIds(Map<String, List<BigDecimal>> resourceToTagIds) {
    this.resourceToTagIds = resourceToTagIds;
  }

  public JsonServiceTags tagDefinitions(Map<String, JsonRangerTagDef> tagDefinitions) {
    this.tagDefinitions = tagDefinitions;
    return this;
  }

  public JsonServiceTags putTagDefinitionsItem(String key, JsonRangerTagDef tagDefinitionsItem) {
    if (this.tagDefinitions == null) {
      this.tagDefinitions = new HashMap<String, JsonRangerTagDef>();
    }
    this.tagDefinitions.put(key, tagDefinitionsItem);
    return this;
  }

   /**
   * 
   * @return tagDefinitions
  **/
  @ApiModelProperty(value = "")
  public Map<String, JsonRangerTagDef> getTagDefinitions() {
    return tagDefinitions;
  }

  public void setTagDefinitions(Map<String, JsonRangerTagDef> tagDefinitions) {
    this.tagDefinitions = tagDefinitions;
  }

  public JsonServiceTags isDelta(Boolean isDelta) {
    this.isDelta = isDelta;
    return this;
  }

   /**
   * 
   * @return isDelta
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsDelta() {
    return isDelta;
  }

  public void setIsDelta(Boolean isDelta) {
    this.isDelta = isDelta;
  }

  public JsonServiceTags tags(Map<String, JsonRangerTag> tags) {
    this.tags = tags;
    return this;
  }

  public JsonServiceTags putTagsItem(String key, JsonRangerTag tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<String, JsonRangerTag>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * 
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public Map<String, JsonRangerTag> getTags() {
    return tags;
  }

  public void setTags(Map<String, JsonRangerTag> tags) {
    this.tags = tags;
  }

  public JsonServiceTags tagsChangeExtent(JsonTagsChangeExtent tagsChangeExtent) {
    this.tagsChangeExtent = tagsChangeExtent;
    return this;
  }

   /**
   * Get tagsChangeExtent
   * @return tagsChangeExtent
  **/
  @ApiModelProperty(value = "")
  public JsonTagsChangeExtent getTagsChangeExtent() {
    return tagsChangeExtent;
  }

  public void setTagsChangeExtent(JsonTagsChangeExtent tagsChangeExtent) {
    this.tagsChangeExtent = tagsChangeExtent;
  }

  public JsonServiceTags serviceResources(List<JsonRangerServiceResource> serviceResources) {
    this.serviceResources = serviceResources;
    return this;
  }

  public JsonServiceTags addServiceResourcesItem(JsonRangerServiceResource serviceResourcesItem) {
    if (this.serviceResources == null) {
      this.serviceResources = new ArrayList<JsonRangerServiceResource>();
    }
    this.serviceResources.add(serviceResourcesItem);
    return this;
  }

   /**
   * 
   * @return serviceResources
  **/
  @ApiModelProperty(value = "")
  public List<JsonRangerServiceResource> getServiceResources() {
    return serviceResources;
  }

  public void setServiceResources(List<JsonRangerServiceResource> serviceResources) {
    this.serviceResources = serviceResources;
  }

  public JsonServiceTags op(String op) {
    this.op = op;
    return this;
  }

   /**
   * 
   * @return op
  **/
  @ApiModelProperty(value = "")
  public String getOp() {
    return op;
  }

  public void setOp(String op) {
    this.op = op;
  }

  public JsonServiceTags tagVersion(BigDecimal tagVersion) {
    this.tagVersion = tagVersion;
    return this;
  }

   /**
   * 
   * @return tagVersion
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTagVersion() {
    return tagVersion;
  }

  public void setTagVersion(BigDecimal tagVersion) {
    this.tagVersion = tagVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonServiceTags jsonServiceTags = (JsonServiceTags) o;
    return Objects.equals(this.serviceName, jsonServiceTags.serviceName) &&
        Objects.equals(this.tagUpdateTime, jsonServiceTags.tagUpdateTime) &&
        Objects.equals(this.resourceToTagIds, jsonServiceTags.resourceToTagIds) &&
        Objects.equals(this.tagDefinitions, jsonServiceTags.tagDefinitions) &&
        Objects.equals(this.isDelta, jsonServiceTags.isDelta) &&
        Objects.equals(this.tags, jsonServiceTags.tags) &&
        Objects.equals(this.tagsChangeExtent, jsonServiceTags.tagsChangeExtent) &&
        Objects.equals(this.serviceResources, jsonServiceTags.serviceResources) &&
        Objects.equals(this.op, jsonServiceTags.op) &&
        Objects.equals(this.tagVersion, jsonServiceTags.tagVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceName, tagUpdateTime, resourceToTagIds, tagDefinitions, isDelta, tags, tagsChangeExtent, serviceResources, op, tagVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonServiceTags {\n");
    
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    tagUpdateTime: ").append(toIndentedString(tagUpdateTime)).append("\n");
    sb.append("    resourceToTagIds: ").append(toIndentedString(resourceToTagIds)).append("\n");
    sb.append("    tagDefinitions: ").append(toIndentedString(tagDefinitions)).append("\n");
    sb.append("    isDelta: ").append(toIndentedString(isDelta)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    tagsChangeExtent: ").append(toIndentedString(tagsChangeExtent)).append("\n");
    sb.append("    serviceResources: ").append(toIndentedString(serviceResources)).append("\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    tagVersion: ").append(toIndentedString(tagVersion)).append("\n");
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

