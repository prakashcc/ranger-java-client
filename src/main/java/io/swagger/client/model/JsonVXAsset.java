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
import io.swagger.client.model.JsonVXDataObject;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonVXAsset extends JsonVXDataObject {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("activeStatus")
  private Integer activeStatus = null;

  @SerializedName("assetType")
  private Integer assetType = null;

  @SerializedName("config")
  private String config = null;

  @SerializedName("supportNative")
  private Boolean supportNative = null;

  @SerializedName("myClassType")
  private Integer myClassType = null;

  public JsonVXAsset name(String name) {
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

  public JsonVXAsset description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;description&lt;/b&gt;
   * @return description
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>description</b>")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public JsonVXAsset activeStatus(Integer activeStatus) {
    this.activeStatus = activeStatus;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;activeStatus&lt;/b&gt;
   * @return activeStatus
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>activeStatus</b>")
  public Integer getActiveStatus() {
    return activeStatus;
  }

  public void setActiveStatus(Integer activeStatus) {
    this.activeStatus = activeStatus;
  }

  public JsonVXAsset assetType(Integer assetType) {
    this.assetType = assetType;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;assetType&lt;/b&gt;
   * @return assetType
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>assetType</b>")
  public Integer getAssetType() {
    return assetType;
  }

  public void setAssetType(Integer assetType) {
    this.assetType = assetType;
  }

  public JsonVXAsset config(String config) {
    this.config = config;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;config&lt;/b&gt;
   * @return config
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>config</b>")
  public String getConfig() {
    return config;
  }

  public void setConfig(String config) {
    this.config = config;
  }

  public JsonVXAsset supportNative(Boolean supportNative) {
    this.supportNative = supportNative;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;supportNative&lt;/b&gt;
   * @return supportNative
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>supportNative</b>")
  public Boolean isSupportNative() {
    return supportNative;
  }

  public void setSupportNative(Boolean supportNative) {
    this.supportNative = supportNative;
  }

  public JsonVXAsset myClassType(Integer myClassType) {
    this.myClassType = myClassType;
    return this;
  }

   /**
   * 
   * @return myClassType
  **/
  @ApiModelProperty(value = "")
  public Integer getMyClassType() {
    return myClassType;
  }

  public void setMyClassType(Integer myClassType) {
    this.myClassType = myClassType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonVXAsset jsonVXAsset = (JsonVXAsset) o;
    return Objects.equals(this.name, jsonVXAsset.name) &&
        Objects.equals(this.description, jsonVXAsset.description) &&
        Objects.equals(this.activeStatus, jsonVXAsset.activeStatus) &&
        Objects.equals(this.assetType, jsonVXAsset.assetType) &&
        Objects.equals(this.config, jsonVXAsset.config) &&
        Objects.equals(this.supportNative, jsonVXAsset.supportNative) &&
        Objects.equals(this.myClassType, jsonVXAsset.myClassType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, activeStatus, assetType, config, supportNative, myClassType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonVXAsset {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    activeStatus: ").append(toIndentedString(activeStatus)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    supportNative: ").append(toIndentedString(supportNative)).append("\n");
    sb.append("    myClassType: ").append(toIndentedString(myClassType)).append("\n");
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

