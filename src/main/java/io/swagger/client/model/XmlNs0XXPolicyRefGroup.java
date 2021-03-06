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
 * The persistent class for the x_policy_ref_group database table.
 */
@ApiModel(description = "The persistent class for the x_policy_ref_group database table.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class XmlNs0XXPolicyRefGroup extends XmlNs0XXDBBase {
  @SerializedName("groupId")
  private Long groupId = null;

  @SerializedName("groupName")
  private String groupName = null;

  @SerializedName("policyId")
  private Long policyId = null;

  public XmlNs0XXPolicyRefGroup groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;groupId&lt;/b&gt;
   * @return groupId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>groupId</b>")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public XmlNs0XXPolicyRefGroup groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;groupName&lt;/b&gt;
   * @return groupName
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>groupName</b>")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public XmlNs0XXPolicyRefGroup policyId(Long policyId) {
    this.policyId = policyId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;policyId&lt;/b&gt;
   * @return policyId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>policyId</b>")
  public Long getPolicyId() {
    return policyId;
  }

  public void setPolicyId(Long policyId) {
    this.policyId = policyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlNs0XXPolicyRefGroup xmlNs0XXPolicyRefGroup = (XmlNs0XXPolicyRefGroup) o;
    return Objects.equals(this.groupId, xmlNs0XXPolicyRefGroup.groupId) &&
        Objects.equals(this.groupName, xmlNs0XXPolicyRefGroup.groupName) &&
        Objects.equals(this.policyId, xmlNs0XXPolicyRefGroup.policyId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, groupName, policyId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0XXPolicyRefGroup {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
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

