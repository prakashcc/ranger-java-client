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
import io.swagger.client.model.JsonRangerAccessResource;
import io.swagger.client.model.JsonRangerServiceDef;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonRangerAccessResource {
  @SerializedName("asMap")
  private Map<String, Object> asMap = null;

  @SerializedName("cacheKey")
  private String cacheKey = null;

  @SerializedName("asString")
  private String asString = null;

  @SerializedName("readOnlyCopy")
  private JsonRangerAccessResource readOnlyCopy = null;

  @SerializedName("serviceDef")
  private JsonRangerServiceDef serviceDef = null;

  @SerializedName("leafName")
  private String leafName = null;

  @SerializedName("keys")
  private List<String> keys = null;

  @SerializedName("ownerUser")
  private String ownerUser = null;

  public JsonRangerAccessResource asMap(Map<String, Object> asMap) {
    this.asMap = asMap;
    return this;
  }

  public JsonRangerAccessResource putAsMapItem(String key, Object asMapItem) {
    if (this.asMap == null) {
      this.asMap = new HashMap<String, Object>();
    }
    this.asMap.put(key, asMapItem);
    return this;
  }

   /**
   * 
   * @return asMap
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getAsMap() {
    return asMap;
  }

  public void setAsMap(Map<String, Object> asMap) {
    this.asMap = asMap;
  }

  public JsonRangerAccessResource cacheKey(String cacheKey) {
    this.cacheKey = cacheKey;
    return this;
  }

   /**
   * 
   * @return cacheKey
  **/
  @ApiModelProperty(value = "")
  public String getCacheKey() {
    return cacheKey;
  }

  public void setCacheKey(String cacheKey) {
    this.cacheKey = cacheKey;
  }

  public JsonRangerAccessResource asString(String asString) {
    this.asString = asString;
    return this;
  }

   /**
   * 
   * @return asString
  **/
  @ApiModelProperty(value = "")
  public String getAsString() {
    return asString;
  }

  public void setAsString(String asString) {
    this.asString = asString;
  }

  public JsonRangerAccessResource readOnlyCopy(JsonRangerAccessResource readOnlyCopy) {
    this.readOnlyCopy = readOnlyCopy;
    return this;
  }

   /**
   * Get readOnlyCopy
   * @return readOnlyCopy
  **/
  @ApiModelProperty(value = "")
  public JsonRangerAccessResource getReadOnlyCopy() {
    return readOnlyCopy;
  }

  public void setReadOnlyCopy(JsonRangerAccessResource readOnlyCopy) {
    this.readOnlyCopy = readOnlyCopy;
  }

  public JsonRangerAccessResource serviceDef(JsonRangerServiceDef serviceDef) {
    this.serviceDef = serviceDef;
    return this;
  }

   /**
   * Get serviceDef
   * @return serviceDef
  **/
  @ApiModelProperty(value = "")
  public JsonRangerServiceDef getServiceDef() {
    return serviceDef;
  }

  public void setServiceDef(JsonRangerServiceDef serviceDef) {
    this.serviceDef = serviceDef;
  }

  public JsonRangerAccessResource leafName(String leafName) {
    this.leafName = leafName;
    return this;
  }

   /**
   * 
   * @return leafName
  **/
  @ApiModelProperty(value = "")
  public String getLeafName() {
    return leafName;
  }

  public void setLeafName(String leafName) {
    this.leafName = leafName;
  }

  public JsonRangerAccessResource keys(List<String> keys) {
    this.keys = keys;
    return this;
  }

  public JsonRangerAccessResource addKeysItem(String keysItem) {
    if (this.keys == null) {
      this.keys = new ArrayList<String>();
    }
    this.keys.add(keysItem);
    return this;
  }

   /**
   * 
   * @return keys
  **/
  @ApiModelProperty(value = "")
  public List<String> getKeys() {
    return keys;
  }

  public void setKeys(List<String> keys) {
    this.keys = keys;
  }

  public JsonRangerAccessResource ownerUser(String ownerUser) {
    this.ownerUser = ownerUser;
    return this;
  }

   /**
   * 
   * @return ownerUser
  **/
  @ApiModelProperty(value = "")
  public String getOwnerUser() {
    return ownerUser;
  }

  public void setOwnerUser(String ownerUser) {
    this.ownerUser = ownerUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonRangerAccessResource jsonRangerAccessResource = (JsonRangerAccessResource) o;
    return Objects.equals(this.asMap, jsonRangerAccessResource.asMap) &&
        Objects.equals(this.cacheKey, jsonRangerAccessResource.cacheKey) &&
        Objects.equals(this.asString, jsonRangerAccessResource.asString) &&
        Objects.equals(this.readOnlyCopy, jsonRangerAccessResource.readOnlyCopy) &&
        Objects.equals(this.serviceDef, jsonRangerAccessResource.serviceDef) &&
        Objects.equals(this.leafName, jsonRangerAccessResource.leafName) &&
        Objects.equals(this.keys, jsonRangerAccessResource.keys) &&
        Objects.equals(this.ownerUser, jsonRangerAccessResource.ownerUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asMap, cacheKey, asString, readOnlyCopy, serviceDef, leafName, keys, ownerUser);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonRangerAccessResource {\n");
    
    sb.append("    asMap: ").append(toIndentedString(asMap)).append("\n");
    sb.append("    cacheKey: ").append(toIndentedString(cacheKey)).append("\n");
    sb.append("    asString: ").append(toIndentedString(asString)).append("\n");
    sb.append("    readOnlyCopy: ").append(toIndentedString(readOnlyCopy)).append("\n");
    sb.append("    serviceDef: ").append(toIndentedString(serviceDef)).append("\n");
    sb.append("    leafName: ").append(toIndentedString(leafName)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    ownerUser: ").append(toIndentedString(ownerUser)).append("\n");
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

