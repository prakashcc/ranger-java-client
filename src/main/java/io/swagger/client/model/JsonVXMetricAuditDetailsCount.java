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
import io.swagger.client.model.JsonVXMetricServiceCount;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonVXMetricAuditDetailsCount {
  @SerializedName("solrIndexCountTwoDays")
  private BigDecimal solrIndexCountTwoDays = null;

  @SerializedName("accessEventsCountTwoDays")
  private JsonVXMetricServiceCount accessEventsCountTwoDays = null;

  @SerializedName("denialEventsCountTwoDays")
  private JsonVXMetricServiceCount denialEventsCountTwoDays = null;

  @SerializedName("solrIndexCountWeek")
  private BigDecimal solrIndexCountWeek = null;

  @SerializedName("accessEventsCountWeek")
  private JsonVXMetricServiceCount accessEventsCountWeek = null;

  @SerializedName("denialEventsCountWeek")
  private JsonVXMetricServiceCount denialEventsCountWeek = null;

  public JsonVXMetricAuditDetailsCount solrIndexCountTwoDays(BigDecimal solrIndexCountTwoDays) {
    this.solrIndexCountTwoDays = solrIndexCountTwoDays;
    return this;
  }

   /**
   * 
   * @return solrIndexCountTwoDays
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getSolrIndexCountTwoDays() {
    return solrIndexCountTwoDays;
  }

  public void setSolrIndexCountTwoDays(BigDecimal solrIndexCountTwoDays) {
    this.solrIndexCountTwoDays = solrIndexCountTwoDays;
  }

  public JsonVXMetricAuditDetailsCount accessEventsCountTwoDays(JsonVXMetricServiceCount accessEventsCountTwoDays) {
    this.accessEventsCountTwoDays = accessEventsCountTwoDays;
    return this;
  }

   /**
   * Get accessEventsCountTwoDays
   * @return accessEventsCountTwoDays
  **/
  @ApiModelProperty(value = "")
  public JsonVXMetricServiceCount getAccessEventsCountTwoDays() {
    return accessEventsCountTwoDays;
  }

  public void setAccessEventsCountTwoDays(JsonVXMetricServiceCount accessEventsCountTwoDays) {
    this.accessEventsCountTwoDays = accessEventsCountTwoDays;
  }

  public JsonVXMetricAuditDetailsCount denialEventsCountTwoDays(JsonVXMetricServiceCount denialEventsCountTwoDays) {
    this.denialEventsCountTwoDays = denialEventsCountTwoDays;
    return this;
  }

   /**
   * Get denialEventsCountTwoDays
   * @return denialEventsCountTwoDays
  **/
  @ApiModelProperty(value = "")
  public JsonVXMetricServiceCount getDenialEventsCountTwoDays() {
    return denialEventsCountTwoDays;
  }

  public void setDenialEventsCountTwoDays(JsonVXMetricServiceCount denialEventsCountTwoDays) {
    this.denialEventsCountTwoDays = denialEventsCountTwoDays;
  }

  public JsonVXMetricAuditDetailsCount solrIndexCountWeek(BigDecimal solrIndexCountWeek) {
    this.solrIndexCountWeek = solrIndexCountWeek;
    return this;
  }

   /**
   * 
   * @return solrIndexCountWeek
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getSolrIndexCountWeek() {
    return solrIndexCountWeek;
  }

  public void setSolrIndexCountWeek(BigDecimal solrIndexCountWeek) {
    this.solrIndexCountWeek = solrIndexCountWeek;
  }

  public JsonVXMetricAuditDetailsCount accessEventsCountWeek(JsonVXMetricServiceCount accessEventsCountWeek) {
    this.accessEventsCountWeek = accessEventsCountWeek;
    return this;
  }

   /**
   * Get accessEventsCountWeek
   * @return accessEventsCountWeek
  **/
  @ApiModelProperty(value = "")
  public JsonVXMetricServiceCount getAccessEventsCountWeek() {
    return accessEventsCountWeek;
  }

  public void setAccessEventsCountWeek(JsonVXMetricServiceCount accessEventsCountWeek) {
    this.accessEventsCountWeek = accessEventsCountWeek;
  }

  public JsonVXMetricAuditDetailsCount denialEventsCountWeek(JsonVXMetricServiceCount denialEventsCountWeek) {
    this.denialEventsCountWeek = denialEventsCountWeek;
    return this;
  }

   /**
   * Get denialEventsCountWeek
   * @return denialEventsCountWeek
  **/
  @ApiModelProperty(value = "")
  public JsonVXMetricServiceCount getDenialEventsCountWeek() {
    return denialEventsCountWeek;
  }

  public void setDenialEventsCountWeek(JsonVXMetricServiceCount denialEventsCountWeek) {
    this.denialEventsCountWeek = denialEventsCountWeek;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonVXMetricAuditDetailsCount jsonVXMetricAuditDetailsCount = (JsonVXMetricAuditDetailsCount) o;
    return Objects.equals(this.solrIndexCountTwoDays, jsonVXMetricAuditDetailsCount.solrIndexCountTwoDays) &&
        Objects.equals(this.accessEventsCountTwoDays, jsonVXMetricAuditDetailsCount.accessEventsCountTwoDays) &&
        Objects.equals(this.denialEventsCountTwoDays, jsonVXMetricAuditDetailsCount.denialEventsCountTwoDays) &&
        Objects.equals(this.solrIndexCountWeek, jsonVXMetricAuditDetailsCount.solrIndexCountWeek) &&
        Objects.equals(this.accessEventsCountWeek, jsonVXMetricAuditDetailsCount.accessEventsCountWeek) &&
        Objects.equals(this.denialEventsCountWeek, jsonVXMetricAuditDetailsCount.denialEventsCountWeek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solrIndexCountTwoDays, accessEventsCountTwoDays, denialEventsCountTwoDays, solrIndexCountWeek, accessEventsCountWeek, denialEventsCountWeek);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonVXMetricAuditDetailsCount {\n");
    
    sb.append("    solrIndexCountTwoDays: ").append(toIndentedString(solrIndexCountTwoDays)).append("\n");
    sb.append("    accessEventsCountTwoDays: ").append(toIndentedString(accessEventsCountTwoDays)).append("\n");
    sb.append("    denialEventsCountTwoDays: ").append(toIndentedString(denialEventsCountTwoDays)).append("\n");
    sb.append("    solrIndexCountWeek: ").append(toIndentedString(solrIndexCountWeek)).append("\n");
    sb.append("    accessEventsCountWeek: ").append(toIndentedString(accessEventsCountWeek)).append("\n");
    sb.append("    denialEventsCountWeek: ").append(toIndentedString(denialEventsCountWeek)).append("\n");
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

