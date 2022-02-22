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
import io.swagger.client.model.XmlNs0VXAuditMap;
import io.swagger.client.model.XmlNs0VXDataObject;
import io.swagger.client.model.XmlNs0VXPermMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class XmlNs0VXResource extends XmlNs0VXDataObject {
  @SerializedName("assetId")
  private Long assetId = null;

  @SerializedName("assetName")
  private String assetName = null;

  @SerializedName("assetType")
  private Integer assetType = null;

  @SerializedName("auditList")
  private List<XmlNs0VXAuditMap> auditList = null;

  @SerializedName("checkParentPermission")
  private Integer checkParentPermission = null;

  @SerializedName("columnFamilies")
  private String columnFamilies = null;

  @SerializedName("columnType")
  private Integer columnType = null;

  @SerializedName("columns")
  private String columns = null;

  @SerializedName("databases")
  private String databases = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("hiveServices")
  private String hiveServices = null;

  @SerializedName("isEncrypt")
  private Integer isEncrypt = null;

  @SerializedName("isRecursive")
  private Integer isRecursive = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("parentId")
  private Long parentId = null;

  @SerializedName("parentPath")
  private String parentPath = null;

  @SerializedName("permMapList")
  private List<XmlNs0VXPermMap> permMapList = null;

  @SerializedName("policyName")
  private String policyName = null;

  @SerializedName("resourceGroup")
  private String resourceGroup = null;

  @SerializedName("resourceStatus")
  private Integer resourceStatus = null;

  @SerializedName("resourceType")
  private Integer resourceType = null;

  @SerializedName("services")
  private String services = null;

  @SerializedName("tableType")
  private Integer tableType = null;

  @SerializedName("tables")
  private String tables = null;

  @SerializedName("topologies")
  private String topologies = null;

  @SerializedName("udfs")
  private String udfs = null;

  public XmlNs0VXResource assetId(Long assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;assetId&lt;/b&gt;
   * @return assetId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>assetId</b>")
  public Long getAssetId() {
    return assetId;
  }

  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }

  public XmlNs0VXResource assetName(String assetName) {
    this.assetName = assetName;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;assetName&lt;/b&gt;
   * @return assetName
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>assetName</b>")
  public String getAssetName() {
    return assetName;
  }

  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }

  public XmlNs0VXResource assetType(Integer assetType) {
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

  public XmlNs0VXResource auditList(List<XmlNs0VXAuditMap> auditList) {
    this.auditList = auditList;
    return this;
  }

  public XmlNs0VXResource addAuditListItem(XmlNs0VXAuditMap auditListItem) {
    if (this.auditList == null) {
      this.auditList = new ArrayList<XmlNs0VXAuditMap>();
    }
    this.auditList.add(auditListItem);
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;auditList&lt;/b&gt;
   * @return auditList
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>auditList</b>")
  public List<XmlNs0VXAuditMap> getAuditList() {
    return auditList;
  }

  public void setAuditList(List<XmlNs0VXAuditMap> auditList) {
    this.auditList = auditList;
  }

  public XmlNs0VXResource checkParentPermission(Integer checkParentPermission) {
    this.checkParentPermission = checkParentPermission;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;checkParentPermission&lt;/b&gt;
   * @return checkParentPermission
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>checkParentPermission</b>")
  public Integer getCheckParentPermission() {
    return checkParentPermission;
  }

  public void setCheckParentPermission(Integer checkParentPermission) {
    this.checkParentPermission = checkParentPermission;
  }

  public XmlNs0VXResource columnFamilies(String columnFamilies) {
    this.columnFamilies = columnFamilies;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;columnFamilies&lt;/b&gt;
   * @return columnFamilies
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>columnFamilies</b>")
  public String getColumnFamilies() {
    return columnFamilies;
  }

  public void setColumnFamilies(String columnFamilies) {
    this.columnFamilies = columnFamilies;
  }

  public XmlNs0VXResource columnType(Integer columnType) {
    this.columnType = columnType;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;columnType&lt;/b&gt;
   * @return columnType
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>columnType</b>")
  public Integer getColumnType() {
    return columnType;
  }

  public void setColumnType(Integer columnType) {
    this.columnType = columnType;
  }

  public XmlNs0VXResource columns(String columns) {
    this.columns = columns;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;columns&lt;/b&gt;
   * @return columns
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>columns</b>")
  public String getColumns() {
    return columns;
  }

  public void setColumns(String columns) {
    this.columns = columns;
  }

  public XmlNs0VXResource databases(String databases) {
    this.databases = databases;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;databases&lt;/b&gt;
   * @return databases
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>databases</b>")
  public String getDatabases() {
    return databases;
  }

  public void setDatabases(String databases) {
    this.databases = databases;
  }

  public XmlNs0VXResource description(String description) {
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

  public XmlNs0VXResource guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;guid&lt;/b&gt;
   * @return guid
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>guid</b>")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public XmlNs0VXResource hiveServices(String hiveServices) {
    this.hiveServices = hiveServices;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;hiveservices&lt;/b&gt;
   * @return hiveServices
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>hiveservices</b>")
  public String getHiveServices() {
    return hiveServices;
  }

  public void setHiveServices(String hiveServices) {
    this.hiveServices = hiveServices;
  }

  public XmlNs0VXResource isEncrypt(Integer isEncrypt) {
    this.isEncrypt = isEncrypt;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;isEncrypt&lt;/b&gt;
   * @return isEncrypt
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>isEncrypt</b>")
  public Integer getIsEncrypt() {
    return isEncrypt;
  }

  public void setIsEncrypt(Integer isEncrypt) {
    this.isEncrypt = isEncrypt;
  }

  public XmlNs0VXResource isRecursive(Integer isRecursive) {
    this.isRecursive = isRecursive;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;isRecursive&lt;/b&gt;
   * @return isRecursive
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>isRecursive</b>")
  public Integer getIsRecursive() {
    return isRecursive;
  }

  public void setIsRecursive(Integer isRecursive) {
    this.isRecursive = isRecursive;
  }

  public XmlNs0VXResource name(String name) {
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

  public XmlNs0VXResource parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;parentId&lt;/b&gt;
   * @return parentId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>parentId</b>")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public XmlNs0VXResource parentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;parentPath&lt;/b&gt;
   * @return parentPath
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>parentPath</b>")
  public String getParentPath() {
    return parentPath;
  }

  public void setParentPath(String parentPath) {
    this.parentPath = parentPath;
  }

  public XmlNs0VXResource permMapList(List<XmlNs0VXPermMap> permMapList) {
    this.permMapList = permMapList;
    return this;
  }

  public XmlNs0VXResource addPermMapListItem(XmlNs0VXPermMap permMapListItem) {
    if (this.permMapList == null) {
      this.permMapList = new ArrayList<XmlNs0VXPermMap>();
    }
    this.permMapList.add(permMapListItem);
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;permMapList&lt;/b&gt;
   * @return permMapList
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>permMapList</b>")
  public List<XmlNs0VXPermMap> getPermMapList() {
    return permMapList;
  }

  public void setPermMapList(List<XmlNs0VXPermMap> permMapList) {
    this.permMapList = permMapList;
  }

  public XmlNs0VXResource policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

   /**
   * 
   * @return policyName
  **/
  @ApiModelProperty(value = "")
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  public XmlNs0VXResource resourceGroup(String resourceGroup) {
    this.resourceGroup = resourceGroup;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;resourceGroup&lt;/b&gt;
   * @return resourceGroup
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>resourceGroup</b>")
  public String getResourceGroup() {
    return resourceGroup;
  }

  public void setResourceGroup(String resourceGroup) {
    this.resourceGroup = resourceGroup;
  }

  public XmlNs0VXResource resourceStatus(Integer resourceStatus) {
    this.resourceStatus = resourceStatus;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;resourceStatus&lt;/b&gt;
   * @return resourceStatus
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>resourceStatus</b>")
  public Integer getResourceStatus() {
    return resourceStatus;
  }

  public void setResourceStatus(Integer resourceStatus) {
    this.resourceStatus = resourceStatus;
  }

  public XmlNs0VXResource resourceType(Integer resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;resourceType&lt;/b&gt;
   * @return resourceType
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>resourceType</b>")
  public Integer getResourceType() {
    return resourceType;
  }

  public void setResourceType(Integer resourceType) {
    this.resourceType = resourceType;
  }

  public XmlNs0VXResource services(String services) {
    this.services = services;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;services&lt;/b&gt;
   * @return services
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>services</b>")
  public String getServices() {
    return services;
  }

  public void setServices(String services) {
    this.services = services;
  }

  public XmlNs0VXResource tableType(Integer tableType) {
    this.tableType = tableType;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;tableType&lt;/b&gt;
   * @return tableType
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>tableType</b>")
  public Integer getTableType() {
    return tableType;
  }

  public void setTableType(Integer tableType) {
    this.tableType = tableType;
  }

  public XmlNs0VXResource tables(String tables) {
    this.tables = tables;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;tables&lt;/b&gt;
   * @return tables
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>tables</b>")
  public String getTables() {
    return tables;
  }

  public void setTables(String tables) {
    this.tables = tables;
  }

  public XmlNs0VXResource topologies(String topologies) {
    this.topologies = topologies;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;topologies&lt;/b&gt;
   * @return topologies
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>topologies</b>")
  public String getTopologies() {
    return topologies;
  }

  public void setTopologies(String topologies) {
    this.topologies = topologies;
  }

  public XmlNs0VXResource udfs(String udfs) {
    this.udfs = udfs;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;udfs&lt;/b&gt;
   * @return udfs
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>udfs</b>")
  public String getUdfs() {
    return udfs;
  }

  public void setUdfs(String udfs) {
    this.udfs = udfs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlNs0VXResource xmlNs0VXResource = (XmlNs0VXResource) o;
    return Objects.equals(this.assetId, xmlNs0VXResource.assetId) &&
        Objects.equals(this.assetName, xmlNs0VXResource.assetName) &&
        Objects.equals(this.assetType, xmlNs0VXResource.assetType) &&
        Objects.equals(this.auditList, xmlNs0VXResource.auditList) &&
        Objects.equals(this.checkParentPermission, xmlNs0VXResource.checkParentPermission) &&
        Objects.equals(this.columnFamilies, xmlNs0VXResource.columnFamilies) &&
        Objects.equals(this.columnType, xmlNs0VXResource.columnType) &&
        Objects.equals(this.columns, xmlNs0VXResource.columns) &&
        Objects.equals(this.databases, xmlNs0VXResource.databases) &&
        Objects.equals(this.description, xmlNs0VXResource.description) &&
        Objects.equals(this.guid, xmlNs0VXResource.guid) &&
        Objects.equals(this.hiveServices, xmlNs0VXResource.hiveServices) &&
        Objects.equals(this.isEncrypt, xmlNs0VXResource.isEncrypt) &&
        Objects.equals(this.isRecursive, xmlNs0VXResource.isRecursive) &&
        Objects.equals(this.name, xmlNs0VXResource.name) &&
        Objects.equals(this.parentId, xmlNs0VXResource.parentId) &&
        Objects.equals(this.parentPath, xmlNs0VXResource.parentPath) &&
        Objects.equals(this.permMapList, xmlNs0VXResource.permMapList) &&
        Objects.equals(this.policyName, xmlNs0VXResource.policyName) &&
        Objects.equals(this.resourceGroup, xmlNs0VXResource.resourceGroup) &&
        Objects.equals(this.resourceStatus, xmlNs0VXResource.resourceStatus) &&
        Objects.equals(this.resourceType, xmlNs0VXResource.resourceType) &&
        Objects.equals(this.services, xmlNs0VXResource.services) &&
        Objects.equals(this.tableType, xmlNs0VXResource.tableType) &&
        Objects.equals(this.tables, xmlNs0VXResource.tables) &&
        Objects.equals(this.topologies, xmlNs0VXResource.topologies) &&
        Objects.equals(this.udfs, xmlNs0VXResource.udfs) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetName, assetType, auditList, checkParentPermission, columnFamilies, columnType, columns, databases, description, guid, hiveServices, isEncrypt, isRecursive, name, parentId, parentPath, permMapList, policyName, resourceGroup, resourceStatus, resourceType, services, tableType, tables, topologies, udfs, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0VXResource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    auditList: ").append(toIndentedString(auditList)).append("\n");
    sb.append("    checkParentPermission: ").append(toIndentedString(checkParentPermission)).append("\n");
    sb.append("    columnFamilies: ").append(toIndentedString(columnFamilies)).append("\n");
    sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    hiveServices: ").append(toIndentedString(hiveServices)).append("\n");
    sb.append("    isEncrypt: ").append(toIndentedString(isEncrypt)).append("\n");
    sb.append("    isRecursive: ").append(toIndentedString(isRecursive)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentPath: ").append(toIndentedString(parentPath)).append("\n");
    sb.append("    permMapList: ").append(toIndentedString(permMapList)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    resourceGroup: ").append(toIndentedString(resourceGroup)).append("\n");
    sb.append("    resourceStatus: ").append(toIndentedString(resourceStatus)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    tableType: ").append(toIndentedString(tableType)).append("\n");
    sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
    sb.append("    topologies: ").append(toIndentedString(topologies)).append("\n");
    sb.append("    udfs: ").append(toIndentedString(udfs)).append("\n");
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

