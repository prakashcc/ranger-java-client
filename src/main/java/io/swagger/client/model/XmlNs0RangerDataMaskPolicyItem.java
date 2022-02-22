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
import io.swagger.client.model.XmlNs0RangerPolicyItemDataMaskInfo;
import java.io.IOException;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class XmlNs0RangerDataMaskPolicyItem extends XmlNs0RangerPolicyItem {
  @SerializedName("dataMaskInfo")
  private XmlNs0RangerPolicyItemDataMaskInfo dataMaskInfo = null;

  public XmlNs0RangerDataMaskPolicyItem dataMaskInfo(XmlNs0RangerPolicyItemDataMaskInfo dataMaskInfo) {
    this.dataMaskInfo = dataMaskInfo;
    return this;
  }

   /**
   * Get dataMaskInfo
   * @return dataMaskInfo
  **/
  @ApiModelProperty(value = "")
  public XmlNs0RangerPolicyItemDataMaskInfo getDataMaskInfo() {
    return dataMaskInfo;
  }

  public void setDataMaskInfo(XmlNs0RangerPolicyItemDataMaskInfo dataMaskInfo) {
    this.dataMaskInfo = dataMaskInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlNs0RangerDataMaskPolicyItem xmlNs0RangerDataMaskPolicyItem = (XmlNs0RangerDataMaskPolicyItem) o;
    return Objects.equals(this.dataMaskInfo, xmlNs0RangerDataMaskPolicyItem.dataMaskInfo) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataMaskInfo, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0RangerDataMaskPolicyItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dataMaskInfo: ").append(toIndentedString(dataMaskInfo)).append("\n");
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
