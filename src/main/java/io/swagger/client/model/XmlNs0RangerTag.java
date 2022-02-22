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
import io.swagger.client.model.XmlNs0RangerBaseModelObject;
import io.swagger.client.model.XmlNs0RangerValiditySchedule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class XmlNs0RangerTag extends XmlNs0RangerBaseModelObject {
  @SerializedName("attributes")
  private Object attributes = null;

  @SerializedName("options")
  private Object options = null;

  @SerializedName("owner")
  private Integer owner = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("validityPeriods")
  private List<XmlNs0RangerValiditySchedule> validityPeriods = null;

  public XmlNs0RangerTag attributes(Object attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * 
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public Object getAttributes() {
    return attributes;
  }

  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }

  public XmlNs0RangerTag options(Object options) {
    this.options = options;
    return this;
  }

   /**
   * 
   * @return options
  **/
  @ApiModelProperty(value = "")
  public Object getOptions() {
    return options;
  }

  public void setOptions(Object options) {
    this.options = options;
  }

  public XmlNs0RangerTag owner(Integer owner) {
    this.owner = owner;
    return this;
  }

   /**
   * 
   * @return owner
  **/
  @ApiModelProperty(value = "")
  public Integer getOwner() {
    return owner;
  }

  public void setOwner(Integer owner) {
    this.owner = owner;
  }

  public XmlNs0RangerTag type(String type) {
    this.type = type;
    return this;
  }

   /**
   * 
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public XmlNs0RangerTag validityPeriods(List<XmlNs0RangerValiditySchedule> validityPeriods) {
    this.validityPeriods = validityPeriods;
    return this;
  }

  public XmlNs0RangerTag addValidityPeriodsItem(XmlNs0RangerValiditySchedule validityPeriodsItem) {
    if (this.validityPeriods == null) {
      this.validityPeriods = new ArrayList<XmlNs0RangerValiditySchedule>();
    }
    this.validityPeriods.add(validityPeriodsItem);
    return this;
  }

   /**
   * 
   * @return validityPeriods
  **/
  @ApiModelProperty(value = "")
  public List<XmlNs0RangerValiditySchedule> getValidityPeriods() {
    return validityPeriods;
  }

  public void setValidityPeriods(List<XmlNs0RangerValiditySchedule> validityPeriods) {
    this.validityPeriods = validityPeriods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlNs0RangerTag xmlNs0RangerTag = (XmlNs0RangerTag) o;
    return Objects.equals(this.attributes, xmlNs0RangerTag.attributes) &&
        Objects.equals(this.options, xmlNs0RangerTag.options) &&
        Objects.equals(this.owner, xmlNs0RangerTag.owner) &&
        Objects.equals(this.type, xmlNs0RangerTag.type) &&
        Objects.equals(this.validityPeriods, xmlNs0RangerTag.validityPeriods) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, options, owner, type, validityPeriods, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0RangerTag {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validityPeriods: ").append(toIndentedString(validityPeriods)).append("\n");
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

