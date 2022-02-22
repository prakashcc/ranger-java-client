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
public class JsonXXPolicyRefDataMaskType extends JsonXXDBBase {
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("policyId")
  private BigDecimal policyId = null;

  @SerializedName("dataMaskDefId")
  private BigDecimal dataMaskDefId = null;

  @SerializedName("dataMaskTypeName")
  private String dataMaskTypeName = null;

  public JsonXXPolicyRefDataMaskType id(BigDecimal id) {
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

  public JsonXXPolicyRefDataMaskType policyId(BigDecimal policyId) {
    this.policyId = policyId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;policyId&lt;/b&gt;
   * @return policyId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>policyId</b>")
  public BigDecimal getPolicyId() {
    return policyId;
  }

  public void setPolicyId(BigDecimal policyId) {
    this.policyId = policyId;
  }

  public JsonXXPolicyRefDataMaskType dataMaskDefId(BigDecimal dataMaskDefId) {
    this.dataMaskDefId = dataMaskDefId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;dataMaskDefId&lt;/b&gt;
   * @return dataMaskDefId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>dataMaskDefId</b>")
  public BigDecimal getDataMaskDefId() {
    return dataMaskDefId;
  }

  public void setDataMaskDefId(BigDecimal dataMaskDefId) {
    this.dataMaskDefId = dataMaskDefId;
  }

  public JsonXXPolicyRefDataMaskType dataMaskTypeName(String dataMaskTypeName) {
    this.dataMaskTypeName = dataMaskTypeName;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;dataMaskTypeName&lt;/b&gt;
   * @return dataMaskTypeName
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>dataMaskTypeName</b>")
  public String getDataMaskTypeName() {
    return dataMaskTypeName;
  }

  public void setDataMaskTypeName(String dataMaskTypeName) {
    this.dataMaskTypeName = dataMaskTypeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonXXPolicyRefDataMaskType jsonXXPolicyRefDataMaskType = (JsonXXPolicyRefDataMaskType) o;
    return Objects.equals(this.id, jsonXXPolicyRefDataMaskType.id) &&
        Objects.equals(this.policyId, jsonXXPolicyRefDataMaskType.policyId) &&
        Objects.equals(this.dataMaskDefId, jsonXXPolicyRefDataMaskType.dataMaskDefId) &&
        Objects.equals(this.dataMaskTypeName, jsonXXPolicyRefDataMaskType.dataMaskTypeName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, policyId, dataMaskDefId, dataMaskTypeName, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonXXPolicyRefDataMaskType {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    dataMaskDefId: ").append(toIndentedString(dataMaskDefId)).append("\n");
    sb.append("    dataMaskTypeName: ").append(toIndentedString(dataMaskTypeName)).append("\n");
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

