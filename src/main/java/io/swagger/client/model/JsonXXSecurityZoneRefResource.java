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
public class JsonXXSecurityZoneRefResource extends JsonXXDBBase {
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("zoneId")
  private BigDecimal zoneId = null;

  @SerializedName("resourceDefId")
  private BigDecimal resourceDefId = null;

  @SerializedName("resourceName")
  private String resourceName = null;

  public JsonXXSecurityZoneRefResource id(BigDecimal id) {
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

  public JsonXXSecurityZoneRefResource zoneId(BigDecimal zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;zoneId&lt;/b&gt;
   * @return zoneId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>zoneId</b>")
  public BigDecimal getZoneId() {
    return zoneId;
  }

  public void setZoneId(BigDecimal zoneId) {
    this.zoneId = zoneId;
  }

  public JsonXXSecurityZoneRefResource resourceDefId(BigDecimal resourceDefId) {
    this.resourceDefId = resourceDefId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;resourceDefId&lt;/b&gt;
   * @return resourceDefId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>resourceDefId</b>")
  public BigDecimal getResourceDefId() {
    return resourceDefId;
  }

  public void setResourceDefId(BigDecimal resourceDefId) {
    this.resourceDefId = resourceDefId;
  }

  public JsonXXSecurityZoneRefResource resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;resourceName&lt;/b&gt;
   * @return resourceName
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>resourceName</b>")
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonXXSecurityZoneRefResource jsonXXSecurityZoneRefResource = (JsonXXSecurityZoneRefResource) o;
    return Objects.equals(this.id, jsonXXSecurityZoneRefResource.id) &&
        Objects.equals(this.zoneId, jsonXXSecurityZoneRefResource.zoneId) &&
        Objects.equals(this.resourceDefId, jsonXXSecurityZoneRefResource.resourceDefId) &&
        Objects.equals(this.resourceName, jsonXXSecurityZoneRefResource.resourceName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, zoneId, resourceDefId, resourceName, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonXXSecurityZoneRefResource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    resourceDefId: ").append(toIndentedString(resourceDefId)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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

