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
import io.swagger.client.model.JsonVList;
import io.swagger.client.model.JsonVXPolicyExportAudit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonVXPolicyExportAuditList extends JsonVList {
  @SerializedName("vXPolicyExportAudits")
  private List<JsonVXPolicyExportAudit> vXPolicyExportAudits = null;

  public JsonVXPolicyExportAuditList vXPolicyExportAudits(List<JsonVXPolicyExportAudit> vXPolicyExportAudits) {
    this.vXPolicyExportAudits = vXPolicyExportAudits;
    return this;
  }

  public JsonVXPolicyExportAuditList addVXPolicyExportAuditsItem(JsonVXPolicyExportAudit vXPolicyExportAuditsItem) {
    if (this.vXPolicyExportAudits == null) {
      this.vXPolicyExportAudits = new ArrayList<JsonVXPolicyExportAudit>();
    }
    this.vXPolicyExportAudits.add(vXPolicyExportAuditsItem);
    return this;
  }

   /**
   * 
   * @return vXPolicyExportAudits
  **/
  @ApiModelProperty(value = "")
  public List<JsonVXPolicyExportAudit> getVXPolicyExportAudits() {
    return vXPolicyExportAudits;
  }

  public void setVXPolicyExportAudits(List<JsonVXPolicyExportAudit> vXPolicyExportAudits) {
    this.vXPolicyExportAudits = vXPolicyExportAudits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonVXPolicyExportAuditList jsonVXPolicyExportAuditList = (JsonVXPolicyExportAuditList) o;
    return Objects.equals(this.vXPolicyExportAudits, jsonVXPolicyExportAuditList.vXPolicyExportAudits) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vXPolicyExportAudits, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonVXPolicyExportAuditList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    vXPolicyExportAudits: ").append(toIndentedString(vXPolicyExportAudits)).append("\n");
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

