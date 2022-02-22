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
import io.swagger.client.model.XmlNs0VList;
import io.swagger.client.model.XmlNs0VXGroupGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class XmlNs0VXGroupGroupList extends XmlNs0VList {
  @SerializedName("vXGroupGroups")
  private List<XmlNs0VXGroupGroup> vXGroupGroups = null;

  public XmlNs0VXGroupGroupList vXGroupGroups(List<XmlNs0VXGroupGroup> vXGroupGroups) {
    this.vXGroupGroups = vXGroupGroups;
    return this;
  }

  public XmlNs0VXGroupGroupList addVXGroupGroupsItem(XmlNs0VXGroupGroup vXGroupGroupsItem) {
    if (this.vXGroupGroups == null) {
      this.vXGroupGroups = new ArrayList<XmlNs0VXGroupGroup>();
    }
    this.vXGroupGroups.add(vXGroupGroupsItem);
    return this;
  }

   /**
   * 
   * @return vXGroupGroups
  **/
  @ApiModelProperty(value = "")
  public List<XmlNs0VXGroupGroup> getVXGroupGroups() {
    return vXGroupGroups;
  }

  public void setVXGroupGroups(List<XmlNs0VXGroupGroup> vXGroupGroups) {
    this.vXGroupGroups = vXGroupGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlNs0VXGroupGroupList xmlNs0VXGroupGroupList = (XmlNs0VXGroupGroupList) o;
    return Objects.equals(this.vXGroupGroups, xmlNs0VXGroupGroupList.vXGroupGroups) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vXGroupGroups, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0VXGroupGroupList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    vXGroupGroups: ").append(toIndentedString(vXGroupGroups)).append("\n");
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
