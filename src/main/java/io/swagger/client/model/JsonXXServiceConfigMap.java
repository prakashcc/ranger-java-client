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
public class JsonXXServiceConfigMap extends JsonXXDBBase {
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("serviceId")
  private BigDecimal serviceId = null;

  @SerializedName("configkey")
  private String configkey = null;

  @SerializedName("configvalue")
  private String configvalue = null;

  public JsonXXServiceConfigMap id(BigDecimal id) {
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

  public JsonXXServiceConfigMap serviceId(BigDecimal serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;service&lt;/b&gt;
   * @return serviceId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>service</b>")
  public BigDecimal getServiceId() {
    return serviceId;
  }

  public void setServiceId(BigDecimal serviceId) {
    this.serviceId = serviceId;
  }

  public JsonXXServiceConfigMap configkey(String configkey) {
    this.configkey = configkey;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;configKey&lt;/b&gt;
   * @return configkey
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>configKey</b>")
  public String getConfigkey() {
    return configkey;
  }

  public void setConfigkey(String configkey) {
    this.configkey = configkey;
  }

  public JsonXXServiceConfigMap configvalue(String configvalue) {
    this.configvalue = configvalue;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;configValue&lt;/b&gt;
   * @return configvalue
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>configValue</b>")
  public String getConfigvalue() {
    return configvalue;
  }

  public void setConfigvalue(String configvalue) {
    this.configvalue = configvalue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonXXServiceConfigMap jsonXXServiceConfigMap = (JsonXXServiceConfigMap) o;
    return Objects.equals(this.id, jsonXXServiceConfigMap.id) &&
        Objects.equals(this.serviceId, jsonXXServiceConfigMap.serviceId) &&
        Objects.equals(this.configkey, jsonXXServiceConfigMap.configkey) &&
        Objects.equals(this.configvalue, jsonXXServiceConfigMap.configvalue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, serviceId, configkey, configvalue, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonXXServiceConfigMap {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    configkey: ").append(toIndentedString(configkey)).append("\n");
    sb.append("    configvalue: ").append(toIndentedString(configvalue)).append("\n");
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

