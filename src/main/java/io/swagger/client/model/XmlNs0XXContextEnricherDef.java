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
import io.swagger.client.model.XmlNs0XXDBBase;
import java.io.IOException;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class XmlNs0XXContextEnricherDef extends XmlNs0XXDBBase {
  @SerializedName("defid")
  private Long defid = null;

  @SerializedName("enricher")
  private String enricher = null;

  @SerializedName("enricherOptions")
  private String enricherOptions = null;

  @SerializedName("itemId")
  private Long itemId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("order")
  private Integer order = null;

  public XmlNs0XXContextEnricherDef defid(Long defid) {
    this.defid = defid;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;defId&lt;/b&gt;
   * @return defid
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>defId</b>")
  public Long getDefid() {
    return defid;
  }

  public void setDefid(Long defid) {
    this.defid = defid;
  }

  public XmlNs0XXContextEnricherDef enricher(String enricher) {
    this.enricher = enricher;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;enricher&lt;/b&gt;
   * @return enricher
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>enricher</b>")
  public String getEnricher() {
    return enricher;
  }

  public void setEnricher(String enricher) {
    this.enricher = enricher;
  }

  public XmlNs0XXContextEnricherDef enricherOptions(String enricherOptions) {
    this.enricherOptions = enricherOptions;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;evaluatorOptions&lt;/b&gt;
   * @return enricherOptions
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>evaluatorOptions</b>")
  public String getEnricherOptions() {
    return enricherOptions;
  }

  public void setEnricherOptions(String enricherOptions) {
    this.enricherOptions = enricherOptions;
  }

  public XmlNs0XXContextEnricherDef itemId(Long itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;itemId&lt;/b&gt;
   * @return itemId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>itemId</b>")
  public Long getItemId() {
    return itemId;
  }

  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }

  public XmlNs0XXContextEnricherDef name(String name) {
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

  public XmlNs0XXContextEnricherDef order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;order&lt;/b&gt;
   * @return order
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>order</b>")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlNs0XXContextEnricherDef xmlNs0XXContextEnricherDef = (XmlNs0XXContextEnricherDef) o;
    return Objects.equals(this.defid, xmlNs0XXContextEnricherDef.defid) &&
        Objects.equals(this.enricher, xmlNs0XXContextEnricherDef.enricher) &&
        Objects.equals(this.enricherOptions, xmlNs0XXContextEnricherDef.enricherOptions) &&
        Objects.equals(this.itemId, xmlNs0XXContextEnricherDef.itemId) &&
        Objects.equals(this.name, xmlNs0XXContextEnricherDef.name) &&
        Objects.equals(this.order, xmlNs0XXContextEnricherDef.order) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defid, enricher, enricherOptions, itemId, name, order, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0XXContextEnricherDef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    defid: ").append(toIndentedString(defid)).append("\n");
    sb.append("    enricher: ").append(toIndentedString(enricher)).append("\n");
    sb.append("    enricherOptions: ").append(toIndentedString(enricherOptions)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

