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
import io.swagger.client.model.JsonRangerEnumElementDef;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonRangerEnumDef {
  @SerializedName("name")
  private String name = null;

  @SerializedName("defaultIndex")
  private BigDecimal defaultIndex = null;

  @SerializedName("elements")
  private List<JsonRangerEnumElementDef> elements = null;

  @SerializedName("itemId")
  private BigDecimal itemId = null;

  public JsonRangerEnumDef name(String name) {
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

  public JsonRangerEnumDef defaultIndex(BigDecimal defaultIndex) {
    this.defaultIndex = defaultIndex;
    return this;
  }

   /**
   * 
   * @return defaultIndex
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDefaultIndex() {
    return defaultIndex;
  }

  public void setDefaultIndex(BigDecimal defaultIndex) {
    this.defaultIndex = defaultIndex;
  }

  public JsonRangerEnumDef elements(List<JsonRangerEnumElementDef> elements) {
    this.elements = elements;
    return this;
  }

  public JsonRangerEnumDef addElementsItem(JsonRangerEnumElementDef elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<JsonRangerEnumElementDef>();
    }
    this.elements.add(elementsItem);
    return this;
  }

   /**
   * 
   * @return elements
  **/
  @ApiModelProperty(value = "")
  public List<JsonRangerEnumElementDef> getElements() {
    return elements;
  }

  public void setElements(List<JsonRangerEnumElementDef> elements) {
    this.elements = elements;
  }

  public JsonRangerEnumDef itemId(BigDecimal itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * 
   * @return itemId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getItemId() {
    return itemId;
  }

  public void setItemId(BigDecimal itemId) {
    this.itemId = itemId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonRangerEnumDef jsonRangerEnumDef = (JsonRangerEnumDef) o;
    return Objects.equals(this.name, jsonRangerEnumDef.name) &&
        Objects.equals(this.defaultIndex, jsonRangerEnumDef.defaultIndex) &&
        Objects.equals(this.elements, jsonRangerEnumDef.elements) &&
        Objects.equals(this.itemId, jsonRangerEnumDef.itemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, defaultIndex, elements, itemId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonRangerEnumDef {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    defaultIndex: ").append(toIndentedString(defaultIndex)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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
