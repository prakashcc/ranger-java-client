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
import io.swagger.client.model.JsonVXAuditRecord;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonVXAuditRecordList extends JsonVList {
  @SerializedName("vXAuditRecords")
  private List<JsonVXAuditRecord> vXAuditRecords = null;

  public JsonVXAuditRecordList vXAuditRecords(List<JsonVXAuditRecord> vXAuditRecords) {
    this.vXAuditRecords = vXAuditRecords;
    return this;
  }

  public JsonVXAuditRecordList addVXAuditRecordsItem(JsonVXAuditRecord vXAuditRecordsItem) {
    if (this.vXAuditRecords == null) {
      this.vXAuditRecords = new ArrayList<JsonVXAuditRecord>();
    }
    this.vXAuditRecords.add(vXAuditRecordsItem);
    return this;
  }

   /**
   * 
   * @return vXAuditRecords
  **/
  @ApiModelProperty(value = "")
  public List<JsonVXAuditRecord> getVXAuditRecords() {
    return vXAuditRecords;
  }

  public void setVXAuditRecords(List<JsonVXAuditRecord> vXAuditRecords) {
    this.vXAuditRecords = vXAuditRecords;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonVXAuditRecordList jsonVXAuditRecordList = (JsonVXAuditRecordList) o;
    return Objects.equals(this.vXAuditRecords, jsonVXAuditRecordList.vXAuditRecords) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vXAuditRecords, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonVXAuditRecordList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    vXAuditRecords: ").append(toIndentedString(vXAuditRecords)).append("\n");
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

