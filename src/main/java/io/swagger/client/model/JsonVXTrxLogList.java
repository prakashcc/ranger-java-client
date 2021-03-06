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
import io.swagger.client.model.JsonVXTrxLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonVXTrxLogList extends JsonVList {
  @SerializedName("vXTrxLogs")
  private List<JsonVXTrxLog> vXTrxLogs = null;

  public JsonVXTrxLogList vXTrxLogs(List<JsonVXTrxLog> vXTrxLogs) {
    this.vXTrxLogs = vXTrxLogs;
    return this;
  }

  public JsonVXTrxLogList addVXTrxLogsItem(JsonVXTrxLog vXTrxLogsItem) {
    if (this.vXTrxLogs == null) {
      this.vXTrxLogs = new ArrayList<JsonVXTrxLog>();
    }
    this.vXTrxLogs.add(vXTrxLogsItem);
    return this;
  }

   /**
   * 
   * @return vXTrxLogs
  **/
  @ApiModelProperty(value = "")
  public List<JsonVXTrxLog> getVXTrxLogs() {
    return vXTrxLogs;
  }

  public void setVXTrxLogs(List<JsonVXTrxLog> vXTrxLogs) {
    this.vXTrxLogs = vXTrxLogs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonVXTrxLogList jsonVXTrxLogList = (JsonVXTrxLogList) o;
    return Objects.equals(this.vXTrxLogs, jsonVXTrxLogList.vXTrxLogs) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vXTrxLogs, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonVXTrxLogList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    vXTrxLogs: ").append(toIndentedString(vXTrxLogs)).append("\n");
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

