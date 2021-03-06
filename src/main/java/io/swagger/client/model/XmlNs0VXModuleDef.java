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
import io.swagger.client.model.XmlNs0VXGroupPermission;
import io.swagger.client.model.XmlNs0VXUserPermission;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class XmlNs0VXModuleDef extends XmlNs0VXDataObject {
  @SerializedName("addedById")
  private Long addedById = null;

  @SerializedName("createTime")
  private String createTime = null;

  @SerializedName("groupPermList")
  private List<XmlNs0VXGroupPermission> groupPermList = null;

  @SerializedName("module")
  private String module = null;

  @SerializedName("updateTime")
  private String updateTime = null;

  @SerializedName("updatedById")
  private Long updatedById = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("userPermList")
  private List<XmlNs0VXUserPermission> userPermList = null;

  public XmlNs0VXModuleDef addedById(Long addedById) {
    this.addedById = addedById;
    return this;
  }

   /**
   * the addedById
   * @return addedById
  **/
  @ApiModelProperty(value = "the addedById")
  public Long getAddedById() {
    return addedById;
  }

  public void setAddedById(Long addedById) {
    this.addedById = addedById;
  }

  public XmlNs0VXModuleDef createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * the createTime
   * @return createTime
  **/
  @ApiModelProperty(value = "the createTime")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public XmlNs0VXModuleDef groupPermList(List<XmlNs0VXGroupPermission> groupPermList) {
    this.groupPermList = groupPermList;
    return this;
  }

  public XmlNs0VXModuleDef addGroupPermListItem(XmlNs0VXGroupPermission groupPermListItem) {
    if (this.groupPermList == null) {
      this.groupPermList = new ArrayList<XmlNs0VXGroupPermission>();
    }
    this.groupPermList.add(groupPermListItem);
    return this;
  }

   /**
   * the groupPermList
   * @return groupPermList
  **/
  @ApiModelProperty(value = "the groupPermList")
  public List<XmlNs0VXGroupPermission> getGroupPermList() {
    return groupPermList;
  }

  public void setGroupPermList(List<XmlNs0VXGroupPermission> groupPermList) {
    this.groupPermList = groupPermList;
  }

  public XmlNs0VXModuleDef module(String module) {
    this.module = module;
    return this;
  }

   /**
   * the module
   * @return module
  **/
  @ApiModelProperty(value = "the module")
  public String getModule() {
    return module;
  }

  public void setModule(String module) {
    this.module = module;
  }

  public XmlNs0VXModuleDef updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * the updateTime
   * @return updateTime
  **/
  @ApiModelProperty(value = "the updateTime")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public XmlNs0VXModuleDef updatedById(Long updatedById) {
    this.updatedById = updatedById;
    return this;
  }

   /**
   * the updatedById
   * @return updatedById
  **/
  @ApiModelProperty(value = "the updatedById")
  public Long getUpdatedById() {
    return updatedById;
  }

  public void setUpdatedById(Long updatedById) {
    this.updatedById = updatedById;
  }

  public XmlNs0VXModuleDef url(String url) {
    this.url = url;
    return this;
  }

   /**
   * the url
   * @return url
  **/
  @ApiModelProperty(value = "the url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public XmlNs0VXModuleDef userPermList(List<XmlNs0VXUserPermission> userPermList) {
    this.userPermList = userPermList;
    return this;
  }

  public XmlNs0VXModuleDef addUserPermListItem(XmlNs0VXUserPermission userPermListItem) {
    if (this.userPermList == null) {
      this.userPermList = new ArrayList<XmlNs0VXUserPermission>();
    }
    this.userPermList.add(userPermListItem);
    return this;
  }

   /**
   * the userPermList
   * @return userPermList
  **/
  @ApiModelProperty(value = "the userPermList")
  public List<XmlNs0VXUserPermission> getUserPermList() {
    return userPermList;
  }

  public void setUserPermList(List<XmlNs0VXUserPermission> userPermList) {
    this.userPermList = userPermList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlNs0VXModuleDef xmlNs0VXModuleDef = (XmlNs0VXModuleDef) o;
    return Objects.equals(this.addedById, xmlNs0VXModuleDef.addedById) &&
        Objects.equals(this.createTime, xmlNs0VXModuleDef.createTime) &&
        Objects.equals(this.groupPermList, xmlNs0VXModuleDef.groupPermList) &&
        Objects.equals(this.module, xmlNs0VXModuleDef.module) &&
        Objects.equals(this.updateTime, xmlNs0VXModuleDef.updateTime) &&
        Objects.equals(this.updatedById, xmlNs0VXModuleDef.updatedById) &&
        Objects.equals(this.url, xmlNs0VXModuleDef.url) &&
        Objects.equals(this.userPermList, xmlNs0VXModuleDef.userPermList) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addedById, createTime, groupPermList, module, updateTime, updatedById, url, userPermList, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0VXModuleDef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    addedById: ").append(toIndentedString(addedById)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    groupPermList: ").append(toIndentedString(groupPermList)).append("\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    updatedById: ").append(toIndentedString(updatedById)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    userPermList: ").append(toIndentedString(userPermList)).append("\n");
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

