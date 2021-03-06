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
import io.swagger.client.model.JsonRangerBaseModelObject;
import io.swagger.client.model.JsonRangerTagAttributeDef;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonRangerTagDef extends JsonRangerBaseModelObject {
  @SerializedName("name")
  private String name = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("attributeDefs")
  private List<JsonRangerTagAttributeDef> attributeDefs = null;

  public JsonRangerTagDef name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JsonRangerTagDef source(String source) {
    this.source = source;
    return this;
  }

   /**
   * 
   * @return source
  **/
  @ApiModelProperty(value = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public JsonRangerTagDef attributeDefs(List<JsonRangerTagAttributeDef> attributeDefs) {
    this.attributeDefs = attributeDefs;
    return this;
  }

  public JsonRangerTagDef addAttributeDefsItem(JsonRangerTagAttributeDef attributeDefsItem) {
    if (this.attributeDefs == null) {
      this.attributeDefs = new ArrayList<JsonRangerTagAttributeDef>();
    }
    this.attributeDefs.add(attributeDefsItem);
    return this;
  }

   /**
   * 
   * @return attributeDefs
  **/
  @ApiModelProperty(value = "")
  public List<JsonRangerTagAttributeDef> getAttributeDefs() {
    return attributeDefs;
  }

  public void setAttributeDefs(List<JsonRangerTagAttributeDef> attributeDefs) {
    this.attributeDefs = attributeDefs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonRangerTagDef jsonRangerTagDef = (JsonRangerTagDef) o;
    return Objects.equals(this.name, jsonRangerTagDef.name) &&
        Objects.equals(this.source, jsonRangerTagDef.source) &&
        Objects.equals(this.attributeDefs, jsonRangerTagDef.attributeDefs) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, source, attributeDefs, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonRangerTagDef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    attributeDefs: ").append(toIndentedString(attributeDefs)).append("\n");
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

