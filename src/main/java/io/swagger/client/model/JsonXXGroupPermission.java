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
public class JsonXXGroupPermission extends JsonXXDBBase {
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("groupId")
  private BigDecimal groupId = null;

  @SerializedName("moduleId")
  private BigDecimal moduleId = null;

  @SerializedName("isAllowed")
  private BigDecimal isAllowed = null;

  @SerializedName("myClassType")
  private Integer myClassType = null;

  public JsonXXGroupPermission id(BigDecimal id) {
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

  public JsonXXGroupPermission groupId(BigDecimal groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * 
   * @return groupId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getGroupId() {
    return groupId;
  }

  public void setGroupId(BigDecimal groupId) {
    this.groupId = groupId;
  }

  public JsonXXGroupPermission moduleId(BigDecimal moduleId) {
    this.moduleId = moduleId;
    return this;
  }

   /**
   * 
   * @return moduleId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getModuleId() {
    return moduleId;
  }

  public void setModuleId(BigDecimal moduleId) {
    this.moduleId = moduleId;
  }

  public JsonXXGroupPermission isAllowed(BigDecimal isAllowed) {
    this.isAllowed = isAllowed;
    return this;
  }

   /**
   * 
   * @return isAllowed
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getIsAllowed() {
    return isAllowed;
  }

  public void setIsAllowed(BigDecimal isAllowed) {
    this.isAllowed = isAllowed;
  }

  public JsonXXGroupPermission myClassType(Integer myClassType) {
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
    JsonXXGroupPermission jsonXXGroupPermission = (JsonXXGroupPermission) o;
    return Objects.equals(this.id, jsonXXGroupPermission.id) &&
        Objects.equals(this.groupId, jsonXXGroupPermission.groupId) &&
        Objects.equals(this.moduleId, jsonXXGroupPermission.moduleId) &&
        Objects.equals(this.isAllowed, jsonXXGroupPermission.isAllowed) &&
        Objects.equals(this.myClassType, jsonXXGroupPermission.myClassType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupId, moduleId, isAllowed, myClassType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonXXGroupPermission {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
    sb.append("    isAllowed: ").append(toIndentedString(isAllowed)).append("\n");
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

