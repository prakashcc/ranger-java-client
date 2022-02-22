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
public class XmlNs0XXUserPermission extends XmlNs0XXDBBase {
  @SerializedName("isAllowed")
  private Integer isAllowed = null;

  @SerializedName("moduleId")
  private Long moduleId = null;

  @SerializedName("userId")
  private Long userId = null;

  public XmlNs0XXUserPermission isAllowed(Integer isAllowed) {
    this.isAllowed = isAllowed;
    return this;
  }

   /**
   * the isAllowed
   * @return isAllowed
  **/
  @ApiModelProperty(value = "the isAllowed")
  public Integer getIsAllowed() {
    return isAllowed;
  }

  public void setIsAllowed(Integer isAllowed) {
    this.isAllowed = isAllowed;
  }

  public XmlNs0XXUserPermission moduleId(Long moduleId) {
    this.moduleId = moduleId;
    return this;
  }

   /**
   * the moduleId
   * @return moduleId
  **/
  @ApiModelProperty(value = "the moduleId")
  public Long getModuleId() {
    return moduleId;
  }

  public void setModuleId(Long moduleId) {
    this.moduleId = moduleId;
  }

  public XmlNs0XXUserPermission userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * the userId
   * @return userId
  **/
  @ApiModelProperty(value = "the userId")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlNs0XXUserPermission xmlNs0XXUserPermission = (XmlNs0XXUserPermission) o;
    return Objects.equals(this.isAllowed, xmlNs0XXUserPermission.isAllowed) &&
        Objects.equals(this.moduleId, xmlNs0XXUserPermission.moduleId) &&
        Objects.equals(this.userId, xmlNs0XXUserPermission.userId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isAllowed, moduleId, userId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0XXUserPermission {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    isAllowed: ").append(toIndentedString(isAllowed)).append("\n");
    sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

