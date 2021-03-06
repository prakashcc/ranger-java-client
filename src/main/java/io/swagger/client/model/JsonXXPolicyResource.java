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
public class JsonXXPolicyResource extends JsonXXDBBase {
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("policyid")
  private BigDecimal policyid = null;

  @SerializedName("resdefid")
  private BigDecimal resdefid = null;

  @SerializedName("isexcludes")
  private Boolean isexcludes = null;

  @SerializedName("isrecursive")
  private Boolean isrecursive = null;

  public JsonXXPolicyResource id(BigDecimal id) {
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

  public JsonXXPolicyResource policyid(BigDecimal policyid) {
    this.policyid = policyid;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;policyId&lt;/b&gt;
   * @return policyid
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>policyId</b>")
  public BigDecimal getPolicyid() {
    return policyid;
  }

  public void setPolicyid(BigDecimal policyid) {
    this.policyid = policyid;
  }

  public JsonXXPolicyResource resdefid(BigDecimal resdefid) {
    this.resdefid = resdefid;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;resDefId&lt;/b&gt;
   * @return resdefid
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>resDefId</b>")
  public BigDecimal getResdefid() {
    return resdefid;
  }

  public void setResdefid(BigDecimal resdefid) {
    this.resdefid = resdefid;
  }

  public JsonXXPolicyResource isexcludes(Boolean isexcludes) {
    this.isexcludes = isexcludes;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;isExcludes&lt;/b&gt;
   * @return isexcludes
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>isExcludes</b>")
  public Boolean isIsexcludes() {
    return isexcludes;
  }

  public void setIsexcludes(Boolean isexcludes) {
    this.isexcludes = isexcludes;
  }

  public JsonXXPolicyResource isrecursive(Boolean isrecursive) {
    this.isrecursive = isrecursive;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;isRecursive&lt;/b&gt;
   * @return isrecursive
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>isRecursive</b>")
  public Boolean isIsrecursive() {
    return isrecursive;
  }

  public void setIsrecursive(Boolean isrecursive) {
    this.isrecursive = isrecursive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonXXPolicyResource jsonXXPolicyResource = (JsonXXPolicyResource) o;
    return Objects.equals(this.id, jsonXXPolicyResource.id) &&
        Objects.equals(this.policyid, jsonXXPolicyResource.policyid) &&
        Objects.equals(this.resdefid, jsonXXPolicyResource.resdefid) &&
        Objects.equals(this.isexcludes, jsonXXPolicyResource.isexcludes) &&
        Objects.equals(this.isrecursive, jsonXXPolicyResource.isrecursive) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, policyid, resdefid, isexcludes, isrecursive, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonXXPolicyResource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
    sb.append("    resdefid: ").append(toIndentedString(resdefid)).append("\n");
    sb.append("    isexcludes: ").append(toIndentedString(isexcludes)).append("\n");
    sb.append("    isrecursive: ").append(toIndentedString(isrecursive)).append("\n");
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

