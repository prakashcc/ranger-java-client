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
public class XmlNs0XXPolicyRefAccessType extends XmlNs0XXDBBase {
  @SerializedName("accessDefId")
  private Long accessDefId = null;

  @SerializedName("accessTypeName")
  private String accessTypeName = null;

  @SerializedName("policyId")
  private Long policyId = null;

  public XmlNs0XXPolicyRefAccessType accessDefId(Long accessDefId) {
    this.accessDefId = accessDefId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;accessDefId&lt;/b&gt;
   * @return accessDefId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>accessDefId</b>")
  public Long getAccessDefId() {
    return accessDefId;
  }

  public void setAccessDefId(Long accessDefId) {
    this.accessDefId = accessDefId;
  }

  public XmlNs0XXPolicyRefAccessType accessTypeName(String accessTypeName) {
    this.accessTypeName = accessTypeName;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;accessTypeName&lt;/b&gt;
   * @return accessTypeName
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>accessTypeName</b>")
  public String getAccessTypeName() {
    return accessTypeName;
  }

  public void setAccessTypeName(String accessTypeName) {
    this.accessTypeName = accessTypeName;
  }

  public XmlNs0XXPolicyRefAccessType policyId(Long policyId) {
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
    XmlNs0XXPolicyRefAccessType xmlNs0XXPolicyRefAccessType = (XmlNs0XXPolicyRefAccessType) o;
    return Objects.equals(this.accessDefId, xmlNs0XXPolicyRefAccessType.accessDefId) &&
        Objects.equals(this.accessTypeName, xmlNs0XXPolicyRefAccessType.accessTypeName) &&
        Objects.equals(this.policyId, xmlNs0XXPolicyRefAccessType.policyId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessDefId, accessTypeName, policyId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0XXPolicyRefAccessType {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accessDefId: ").append(toIndentedString(accessDefId)).append("\n");
    sb.append("    accessTypeName: ").append(toIndentedString(accessTypeName)).append("\n");
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

