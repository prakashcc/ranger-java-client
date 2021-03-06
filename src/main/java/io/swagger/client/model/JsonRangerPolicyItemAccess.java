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

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonRangerPolicyItemAccess {
  @SerializedName("type")
  private String type = null;

  @SerializedName("isAllowed")
  private Boolean isAllowed = null;

  public JsonRangerPolicyItemAccess type(String type) {
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

  public JsonRangerPolicyItemAccess isAllowed(Boolean isAllowed) {
    this.isAllowed = isAllowed;
    return this;
  }

   /**
   * 
   * @return isAllowed
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsAllowed() {
    return isAllowed;
  }

  public void setIsAllowed(Boolean isAllowed) {
    this.isAllowed = isAllowed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonRangerPolicyItemAccess jsonRangerPolicyItemAccess = (JsonRangerPolicyItemAccess) o;
    return Objects.equals(this.type, jsonRangerPolicyItemAccess.type) &&
        Objects.equals(this.isAllowed, jsonRangerPolicyItemAccess.isAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, isAllowed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonRangerPolicyItemAccess {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isAllowed: ").append(toIndentedString(isAllowed)).append("\n");
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

