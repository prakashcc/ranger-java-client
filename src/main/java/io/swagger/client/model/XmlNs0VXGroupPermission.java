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
import io.swagger.client.model.XmlNs0VXDataObject;
import java.io.IOException;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class XmlNs0VXGroupPermission extends XmlNs0VXDataObject {
  @SerializedName("groupId")
  private Long groupId = null;

  @SerializedName("groupName")
  private String groupName = null;

  @SerializedName("isAllowed")
  private Integer isAllowed = null;

  @SerializedName("moduleId")
  private Long moduleId = null;

  @SerializedName("moduleName")
  private String moduleName = null;

  public XmlNs0VXGroupPermission groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * the groupId
   * @return groupId
  **/
  @ApiModelProperty(value = "the groupId")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public XmlNs0VXGroupPermission groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * the groupName
   * @return groupName
  **/
  @ApiModelProperty(value = "the groupName")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public XmlNs0VXGroupPermission isAllowed(Integer isAllowed) {
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

  public XmlNs0VXGroupPermission moduleId(Long moduleId) {
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

  public XmlNs0VXGroupPermission moduleName(String moduleName) {
    this.moduleName = moduleName;
    return this;
  }

   /**
   * 
   * @return moduleName
  **/
  @ApiModelProperty(value = "")
  public String getModuleName() {
    return moduleName;
  }

  public void setModuleName(String moduleName) {
    this.moduleName = moduleName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlNs0VXGroupPermission xmlNs0VXGroupPermission = (XmlNs0VXGroupPermission) o;
    return Objects.equals(this.groupId, xmlNs0VXGroupPermission.groupId) &&
        Objects.equals(this.groupName, xmlNs0VXGroupPermission.groupName) &&
        Objects.equals(this.isAllowed, xmlNs0VXGroupPermission.isAllowed) &&
        Objects.equals(this.moduleId, xmlNs0VXGroupPermission.moduleId) &&
        Objects.equals(this.moduleName, xmlNs0VXGroupPermission.moduleName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, groupName, isAllowed, moduleId, moduleName, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0VXGroupPermission {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    isAllowed: ").append(toIndentedString(isAllowed)).append("\n");
    sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
    sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
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
