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
public class JsonXXAccessTypeDef extends JsonXXDBBase {
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("defid")
  private BigDecimal defid = null;

  @SerializedName("itemId")
  private BigDecimal itemId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("rbkeylabel")
  private String rbkeylabel = null;

  @SerializedName("order")
  private BigDecimal order = null;

  @SerializedName("dataMaskOptions")
  private String dataMaskOptions = null;

  @SerializedName("rowFilterOptions")
  private String rowFilterOptions = null;

  public JsonXXAccessTypeDef id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;id&lt;/b&gt;
   * @return id
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>id</b>")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public JsonXXAccessTypeDef defid(BigDecimal defid) {
    this.defid = defid;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;defId&lt;/b&gt;
   * @return defid
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>defId</b>")
  public BigDecimal getDefid() {
    return defid;
  }

  public void setDefid(BigDecimal defid) {
    this.defid = defid;
  }

  public JsonXXAccessTypeDef itemId(BigDecimal itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;itemId&lt;/b&gt;
   * @return itemId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>itemId</b>")
  public BigDecimal getItemId() {
    return itemId;
  }

  public void setItemId(BigDecimal itemId) {
    this.itemId = itemId;
  }

  public JsonXXAccessTypeDef name(String name) {
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

  public JsonXXAccessTypeDef label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;label&lt;/b&gt;
   * @return label
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>label</b>")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public JsonXXAccessTypeDef rbkeylabel(String rbkeylabel) {
    this.rbkeylabel = rbkeylabel;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;rbKeyLabel&lt;/b&gt;
   * @return rbkeylabel
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>rbKeyLabel</b>")
  public String getRbkeylabel() {
    return rbkeylabel;
  }

  public void setRbkeylabel(String rbkeylabel) {
    this.rbkeylabel = rbkeylabel;
  }

  public JsonXXAccessTypeDef order(BigDecimal order) {
    this.order = order;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;order&lt;/b&gt;
   * @return order
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>order</b>")
  public BigDecimal getOrder() {
    return order;
  }

  public void setOrder(BigDecimal order) {
    this.order = order;
  }

  public JsonXXAccessTypeDef dataMaskOptions(String dataMaskOptions) {
    this.dataMaskOptions = dataMaskOptions;
    return this;
  }

   /**
   * 
   * @return dataMaskOptions
  **/
  @ApiModelProperty(value = "")
  public String getDataMaskOptions() {
    return dataMaskOptions;
  }

  public void setDataMaskOptions(String dataMaskOptions) {
    this.dataMaskOptions = dataMaskOptions;
  }

  public JsonXXAccessTypeDef rowFilterOptions(String rowFilterOptions) {
    this.rowFilterOptions = rowFilterOptions;
    return this;
  }

   /**
   * 
   * @return rowFilterOptions
  **/
  @ApiModelProperty(value = "")
  public String getRowFilterOptions() {
    return rowFilterOptions;
  }

  public void setRowFilterOptions(String rowFilterOptions) {
    this.rowFilterOptions = rowFilterOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonXXAccessTypeDef jsonXXAccessTypeDef = (JsonXXAccessTypeDef) o;
    return Objects.equals(this.id, jsonXXAccessTypeDef.id) &&
        Objects.equals(this.defid, jsonXXAccessTypeDef.defid) &&
        Objects.equals(this.itemId, jsonXXAccessTypeDef.itemId) &&
        Objects.equals(this.name, jsonXXAccessTypeDef.name) &&
        Objects.equals(this.label, jsonXXAccessTypeDef.label) &&
        Objects.equals(this.rbkeylabel, jsonXXAccessTypeDef.rbkeylabel) &&
        Objects.equals(this.order, jsonXXAccessTypeDef.order) &&
        Objects.equals(this.dataMaskOptions, jsonXXAccessTypeDef.dataMaskOptions) &&
        Objects.equals(this.rowFilterOptions, jsonXXAccessTypeDef.rowFilterOptions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, defid, itemId, name, label, rbkeylabel, order, dataMaskOptions, rowFilterOptions, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonXXAccessTypeDef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    defid: ").append(toIndentedString(defid)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    rbkeylabel: ").append(toIndentedString(rbkeylabel)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    dataMaskOptions: ").append(toIndentedString(dataMaskOptions)).append("\n");
    sb.append("    rowFilterOptions: ").append(toIndentedString(rowFilterOptions)).append("\n");
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

