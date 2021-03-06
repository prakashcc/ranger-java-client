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
import io.swagger.client.model.XmlNs0RangerBaseModelObject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class XmlNs0RangerSecurityZone extends XmlNs0RangerBaseModelObject {
  @SerializedName("adminUserGroups")
  private List<String> adminUserGroups = null;

  @SerializedName("adminUsers")
  private List<String> adminUsers = null;

  @SerializedName("auditUserGroups")
  private List<String> auditUserGroups = null;

  @SerializedName("auditUsers")
  private List<String> auditUsers = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("services")
  private Object services = null;

  @SerializedName("tagServices")
  private List<String> tagServices = null;

  public XmlNs0RangerSecurityZone adminUserGroups(List<String> adminUserGroups) {
    this.adminUserGroups = adminUserGroups;
    return this;
  }

  public XmlNs0RangerSecurityZone addAdminUserGroupsItem(String adminUserGroupsItem) {
    if (this.adminUserGroups == null) {
      this.adminUserGroups = new ArrayList<String>();
    }
    this.adminUserGroups.add(adminUserGroupsItem);
    return this;
  }

   /**
   * 
   * @return adminUserGroups
  **/
  @ApiModelProperty(value = "")
  public List<String> getAdminUserGroups() {
    return adminUserGroups;
  }

  public void setAdminUserGroups(List<String> adminUserGroups) {
    this.adminUserGroups = adminUserGroups;
  }

  public XmlNs0RangerSecurityZone adminUsers(List<String> adminUsers) {
    this.adminUsers = adminUsers;
    return this;
  }

  public XmlNs0RangerSecurityZone addAdminUsersItem(String adminUsersItem) {
    if (this.adminUsers == null) {
      this.adminUsers = new ArrayList<String>();
    }
    this.adminUsers.add(adminUsersItem);
    return this;
  }

   /**
   * 
   * @return adminUsers
  **/
  @ApiModelProperty(value = "")
  public List<String> getAdminUsers() {
    return adminUsers;
  }

  public void setAdminUsers(List<String> adminUsers) {
    this.adminUsers = adminUsers;
  }

  public XmlNs0RangerSecurityZone auditUserGroups(List<String> auditUserGroups) {
    this.auditUserGroups = auditUserGroups;
    return this;
  }

  public XmlNs0RangerSecurityZone addAuditUserGroupsItem(String auditUserGroupsItem) {
    if (this.auditUserGroups == null) {
      this.auditUserGroups = new ArrayList<String>();
    }
    this.auditUserGroups.add(auditUserGroupsItem);
    return this;
  }

   /**
   * 
   * @return auditUserGroups
  **/
  @ApiModelProperty(value = "")
  public List<String> getAuditUserGroups() {
    return auditUserGroups;
  }

  public void setAuditUserGroups(List<String> auditUserGroups) {
    this.auditUserGroups = auditUserGroups;
  }

  public XmlNs0RangerSecurityZone auditUsers(List<String> auditUsers) {
    this.auditUsers = auditUsers;
    return this;
  }

  public XmlNs0RangerSecurityZone addAuditUsersItem(String auditUsersItem) {
    if (this.auditUsers == null) {
      this.auditUsers = new ArrayList<String>();
    }
    this.auditUsers.add(auditUsersItem);
    return this;
  }

   /**
   * 
   * @return auditUsers
  **/
  @ApiModelProperty(value = "")
  public List<String> getAuditUsers() {
    return auditUsers;
  }

  public void setAuditUsers(List<String> auditUsers) {
    this.auditUsers = auditUsers;
  }

  public XmlNs0RangerSecurityZone description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public XmlNs0RangerSecurityZone name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public XmlNs0RangerSecurityZone services(Object services) {
    this.services = services;
    return this;
  }

   /**
   * 
   * @return services
  **/
  @ApiModelProperty(value = "")
  public Object getServices() {
    return services;
  }

  public void setServices(Object services) {
    this.services = services;
  }

  public XmlNs0RangerSecurityZone tagServices(List<String> tagServices) {
    this.tagServices = tagServices;
    return this;
  }

  public XmlNs0RangerSecurityZone addTagServicesItem(String tagServicesItem) {
    if (this.tagServices == null) {
      this.tagServices = new ArrayList<String>();
    }
    this.tagServices.add(tagServicesItem);
    return this;
  }

   /**
   * 
   * @return tagServices
  **/
  @ApiModelProperty(value = "")
  public List<String> getTagServices() {
    return tagServices;
  }

  public void setTagServices(List<String> tagServices) {
    this.tagServices = tagServices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlNs0RangerSecurityZone xmlNs0RangerSecurityZone = (XmlNs0RangerSecurityZone) o;
    return Objects.equals(this.adminUserGroups, xmlNs0RangerSecurityZone.adminUserGroups) &&
        Objects.equals(this.adminUsers, xmlNs0RangerSecurityZone.adminUsers) &&
        Objects.equals(this.auditUserGroups, xmlNs0RangerSecurityZone.auditUserGroups) &&
        Objects.equals(this.auditUsers, xmlNs0RangerSecurityZone.auditUsers) &&
        Objects.equals(this.description, xmlNs0RangerSecurityZone.description) &&
        Objects.equals(this.name, xmlNs0RangerSecurityZone.name) &&
        Objects.equals(this.services, xmlNs0RangerSecurityZone.services) &&
        Objects.equals(this.tagServices, xmlNs0RangerSecurityZone.tagServices) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminUserGroups, adminUsers, auditUserGroups, auditUsers, description, name, services, tagServices, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0RangerSecurityZone {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    adminUserGroups: ").append(toIndentedString(adminUserGroups)).append("\n");
    sb.append("    adminUsers: ").append(toIndentedString(adminUsers)).append("\n");
    sb.append("    auditUserGroups: ").append(toIndentedString(auditUserGroups)).append("\n");
    sb.append("    auditUsers: ").append(toIndentedString(auditUsers)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    tagServices: ").append(toIndentedString(tagServices)).append("\n");
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

