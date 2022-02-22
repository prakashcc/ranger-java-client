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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonRangerSecurityZoneService {
  @SerializedName("resources")
  private List<Map<String, List<Object>>> resources = null;

  public JsonRangerSecurityZoneService resources(List<Map<String, List<Object>>> resources) {
    this.resources = resources;
    return this;
  }

  public JsonRangerSecurityZoneService addResourcesItem(Map<String, List<Object>> resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<Map<String, List<Object>>>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * 
   * @return resources
  **/
  @ApiModelProperty(value = "")
  public List<Map<String, List<Object>>> getResources() {
    return resources;
  }

  public void setResources(List<Map<String, List<Object>>> resources) {
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
    JsonRangerSecurityZoneService jsonRangerSecurityZoneService = (JsonRangerSecurityZoneService) o;
    return Objects.equals(this.resources, jsonRangerSecurityZoneService.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonRangerSecurityZoneService {\n");
    
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
