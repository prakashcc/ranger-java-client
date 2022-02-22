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
import io.swagger.client.model.XmlNs0RangerPolicy;
import io.swagger.client.model.XmlNs0VList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class XmlNs0RangerPolicyList extends XmlNs0VList {
  @SerializedName("policies")
  private List<XmlNs0RangerPolicy> policies = null;

  public XmlNs0RangerPolicyList policies(List<XmlNs0RangerPolicy> policies) {
    this.policies = policies;
    return this;
  }

  public XmlNs0RangerPolicyList addPoliciesItem(XmlNs0RangerPolicy policiesItem) {
    if (this.policies == null) {
      this.policies = new ArrayList<XmlNs0RangerPolicy>();
    }
    this.policies.add(policiesItem);
    return this;
  }

   /**
   * 
   * @return policies
  **/
  @ApiModelProperty(value = "")
  public List<XmlNs0RangerPolicy> getPolicies() {
    return policies;
  }

  public void setPolicies(List<XmlNs0RangerPolicy> policies) {
    this.policies = policies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlNs0RangerPolicyList xmlNs0RangerPolicyList = (XmlNs0RangerPolicyList) o;
    return Objects.equals(this.policies, xmlNs0RangerPolicyList.policies) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policies, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0RangerPolicyList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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

