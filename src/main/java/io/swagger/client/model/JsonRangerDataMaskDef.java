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
import io.swagger.client.model.JsonRangerAccessTypeDef;
import io.swagger.client.model.JsonRangerDataMaskTypeDef;
import io.swagger.client.model.JsonRangerResourceDef;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonRangerDataMaskDef {
  @SerializedName("maskTypes")
  private List<JsonRangerDataMaskTypeDef> maskTypes = null;

  @SerializedName("accessTypes")
  private List<JsonRangerAccessTypeDef> accessTypes = null;

  @SerializedName("resources")
  private List<JsonRangerResourceDef> resources = null;

  public JsonRangerDataMaskDef maskTypes(List<JsonRangerDataMaskTypeDef> maskTypes) {
    this.maskTypes = maskTypes;
    return this;
  }

  public JsonRangerDataMaskDef addMaskTypesItem(JsonRangerDataMaskTypeDef maskTypesItem) {
    if (this.maskTypes == null) {
      this.maskTypes = new ArrayList<JsonRangerDataMaskTypeDef>();
    }
    this.maskTypes.add(maskTypesItem);
    return this;
  }

   /**
   * 
   * @return maskTypes
  **/
  @ApiModelProperty(value = "")
  public List<JsonRangerDataMaskTypeDef> getMaskTypes() {
    return maskTypes;
  }

  public void setMaskTypes(List<JsonRangerDataMaskTypeDef> maskTypes) {
    this.maskTypes = maskTypes;
  }

  public JsonRangerDataMaskDef accessTypes(List<JsonRangerAccessTypeDef> accessTypes) {
    this.accessTypes = accessTypes;
    return this;
  }

  public JsonRangerDataMaskDef addAccessTypesItem(JsonRangerAccessTypeDef accessTypesItem) {
    if (this.accessTypes == null) {
      this.accessTypes = new ArrayList<JsonRangerAccessTypeDef>();
    }
    this.accessTypes.add(accessTypesItem);
    return this;
  }

   /**
   * 
   * @return accessTypes
  **/
  @ApiModelProperty(value = "")
  public List<JsonRangerAccessTypeDef> getAccessTypes() {
    return accessTypes;
  }

  public void setAccessTypes(List<JsonRangerAccessTypeDef> accessTypes) {
    this.accessTypes = accessTypes;
  }

  public JsonRangerDataMaskDef resources(List<JsonRangerResourceDef> resources) {
    this.resources = resources;
    return this;
  }

  public JsonRangerDataMaskDef addResourcesItem(JsonRangerResourceDef resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<JsonRangerResourceDef>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * 
   * @return resources
  **/
  @ApiModelProperty(value = "")
  public List<JsonRangerResourceDef> getResources() {
    return resources;
  }

  public void setResources(List<JsonRangerResourceDef> resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonRangerDataMaskDef jsonRangerDataMaskDef = (JsonRangerDataMaskDef) o;
    return Objects.equals(this.maskTypes, jsonRangerDataMaskDef.maskTypes) &&
        Objects.equals(this.accessTypes, jsonRangerDataMaskDef.accessTypes) &&
        Objects.equals(this.resources, jsonRangerDataMaskDef.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maskTypes, accessTypes, resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonRangerDataMaskDef {\n");
    
    sb.append("    maskTypes: ").append(toIndentedString(maskTypes)).append("\n");
    sb.append("    accessTypes: ").append(toIndentedString(accessTypes)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

