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
import io.swagger.client.model.JsonRangerPolicy;
import io.swagger.client.model.JsonRangerPolicyList;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonRangerExportPolicyList extends JsonRangerPolicyList {
  @SerializedName("metaDataInfo")
  private Map<String, Object> metaDataInfo = null;

  public JsonRangerExportPolicyList metaDataInfo(Map<String, Object> metaDataInfo) {
    this.metaDataInfo = metaDataInfo;
    return this;
  }

  public JsonRangerExportPolicyList putMetaDataInfoItem(String key, Object metaDataInfoItem) {
    if (this.metaDataInfo == null) {
      this.metaDataInfo = new HashMap<String, Object>();
    }
    this.metaDataInfo.put(key, metaDataInfoItem);
    return this;
  }

   /**
   * 
   * @return metaDataInfo
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getMetaDataInfo() {
    return metaDataInfo;
  }

  public void setMetaDataInfo(Map<String, Object> metaDataInfo) {
    this.metaDataInfo = metaDataInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonRangerExportPolicyList jsonRangerExportPolicyList = (JsonRangerExportPolicyList) o;
    return Objects.equals(this.metaDataInfo, jsonRangerExportPolicyList.metaDataInfo) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaDataInfo, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonRangerExportPolicyList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    metaDataInfo: ").append(toIndentedString(metaDataInfo)).append("\n");
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

