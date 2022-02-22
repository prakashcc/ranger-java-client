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
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonRangerAccessTypeDef {
  @SerializedName("impliedGrants")
  private List<String> impliedGrants = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("itemId")
  private BigDecimal itemId = null;

  @SerializedName("rbKeyLabel")
  private String rbKeyLabel = null;

  public JsonRangerAccessTypeDef impliedGrants(List<String> impliedGrants) {
    this.impliedGrants = impliedGrants;
    return this;
  }

  public JsonRangerAccessTypeDef addImpliedGrantsItem(String impliedGrantsItem) {
    if (this.impliedGrants == null) {
      this.impliedGrants = new ArrayList<String>();
    }
    this.impliedGrants.add(impliedGrantsItem);
    return this;
  }

   /**
   * 
   * @return impliedGrants
  **/
  @ApiModelProperty(value = "")
  public List<String> getImpliedGrants() {
    return impliedGrants;
  }

  public void setImpliedGrants(List<String> impliedGrants) {
    this.impliedGrants = impliedGrants;
  }

  public JsonRangerAccessTypeDef name(String name) {
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

  public JsonRangerAccessTypeDef label(String label) {
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

  public JsonRangerAccessTypeDef itemId(BigDecimal itemId) {
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

  public JsonRangerAccessTypeDef rbKeyLabel(String rbKeyLabel) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonRangerAccessTypeDef jsonRangerAccessTypeDef = (JsonRangerAccessTypeDef) o;
    return Objects.equals(this.impliedGrants, jsonRangerAccessTypeDef.impliedGrants) &&
        Objects.equals(this.name, jsonRangerAccessTypeDef.name) &&
        Objects.equals(this.label, jsonRangerAccessTypeDef.label) &&
        Objects.equals(this.itemId, jsonRangerAccessTypeDef.itemId) &&
        Objects.equals(this.rbKeyLabel, jsonRangerAccessTypeDef.rbKeyLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impliedGrants, name, label, itemId, rbKeyLabel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonRangerAccessTypeDef {\n");
    
    sb.append("    impliedGrants: ").append(toIndentedString(impliedGrants)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    rbKeyLabel: ").append(toIndentedString(rbKeyLabel)).append("\n");
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
