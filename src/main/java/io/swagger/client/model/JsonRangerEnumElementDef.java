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
import java.math.BigDecimal;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonRangerEnumElementDef {
  @SerializedName("itemId")
  private BigDecimal itemId = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("rbKeyLabel")
  private String rbKeyLabel = null;

  @SerializedName("name")
  private String name = null;

  public JsonRangerEnumElementDef itemId(BigDecimal itemId) {
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

  public JsonRangerEnumElementDef label(String label) {
    this.label = label;
    return this;
  }

   /**
   * 
   * @return label
  **/
  @ApiModelProperty(value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public JsonRangerEnumElementDef rbKeyLabel(String rbKeyLabel) {
    this.rbKeyLabel = rbKeyLabel;
    return this;
  }

   /**
   * 
   * @return rbKeyLabel
  **/
  @ApiModelProperty(value = "")
  public String getRbKeyLabel() {
    return rbKeyLabel;
  }

  public void setRbKeyLabel(String rbKeyLabel) {
    this.rbKeyLabel = rbKeyLabel;
  }

  public JsonRangerEnumElementDef name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonRangerEnumElementDef jsonRangerEnumElementDef = (JsonRangerEnumElementDef) o;
    return Objects.equals(this.itemId, jsonRangerEnumElementDef.itemId) &&
        Objects.equals(this.label, jsonRangerEnumElementDef.label) &&
        Objects.equals(this.rbKeyLabel, jsonRangerEnumElementDef.rbKeyLabel) &&
        Objects.equals(this.name, jsonRangerEnumElementDef.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, label, rbKeyLabel, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonRangerEnumElementDef {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    rbKeyLabel: ").append(toIndentedString(rbKeyLabel)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

