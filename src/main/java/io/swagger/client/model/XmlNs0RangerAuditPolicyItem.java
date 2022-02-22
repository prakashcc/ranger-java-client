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
import io.swagger.client.model.XmlNs0RangerPolicyItem;
import io.swagger.client.model.XmlNs0RangerPolicyItemAccess;
import io.swagger.client.model.XmlNs0RangerPolicyItemCondition;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class XmlNs0RangerAuditPolicyItem extends XmlNs0RangerPolicyItem {
  @SerializedName("accessResult")
  private Object accessResult = null;

  @SerializedName("accessTypes")
  private List<String> accessTypes = null;

  @SerializedName("actions")
  private List<String> actions = null;

  @SerializedName("isAudited")
  private Boolean isAudited = null;

  public XmlNs0RangerAuditPolicyItem accessResult(Object accessResult) {
    this.accessResult = accessResult;
    return this;
  }

   /**
   * 
   * @return accessResult
  **/
  @ApiModelProperty(value = "")
  public Object getAccessResult() {
    return accessResult;
  }

  public void setAccessResult(Object accessResult) {
    this.accessResult = accessResult;
  }

  public XmlNs0RangerAuditPolicyItem accessTypes(List<String> accessTypes) {
    this.accessTypes = accessTypes;
    return this;
  }

  public XmlNs0RangerAuditPolicyItem addAccessTypesItem(String accessTypesItem) {
    if (this.accessTypes == null) {
      this.accessTypes = new ArrayList<String>();
    }
    this.accessTypes.add(accessTypesItem);
    return this;
  }

   /**
   * 
   * @return accessTypes
  **/
  @ApiModelProperty(value = "")
  public List<String> getAccessTypes() {
    return accessTypes;
  }

  public void setAccessTypes(List<String> accessTypes) {
    this.accessTypes = accessTypes;
  }

  public XmlNs0RangerAuditPolicyItem actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public XmlNs0RangerAuditPolicyItem addActionsItem(String actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<String>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * 
   * @return actions
  **/
  @ApiModelProperty(value = "")
  public List<String> getActions() {
    return actions;
  }

  public void setActions(List<String> actions) {
    this.actions = actions;
  }

  public XmlNs0RangerAuditPolicyItem isAudited(Boolean isAudited) {
    this.isAudited = isAudited;
    return this;
  }

   /**
   * 
   * @return isAudited
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsAudited() {
    return isAudited;
  }

  public void setIsAudited(Boolean isAudited) {
    this.isAudited = isAudited;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlNs0RangerAuditPolicyItem xmlNs0RangerAuditPolicyItem = (XmlNs0RangerAuditPolicyItem) o;
    return Objects.equals(this.accessResult, xmlNs0RangerAuditPolicyItem.accessResult) &&
        Objects.equals(this.accessTypes, xmlNs0RangerAuditPolicyItem.accessTypes) &&
        Objects.equals(this.actions, xmlNs0RangerAuditPolicyItem.actions) &&
        Objects.equals(this.isAudited, xmlNs0RangerAuditPolicyItem.isAudited) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessResult, accessTypes, actions, isAudited, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0RangerAuditPolicyItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accessResult: ").append(toIndentedString(accessResult)).append("\n");
    sb.append("    accessTypes: ").append(toIndentedString(accessTypes)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    isAudited: ").append(toIndentedString(isAudited)).append("\n");
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

