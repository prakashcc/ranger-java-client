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
import io.swagger.client.model.XmlNs0VXRepository;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class XmlNs0VXRepositoryList extends XmlNs0VList {
  @SerializedName("vXRepositories")
  private List<XmlNs0VXRepository> vXRepositories = null;

  public XmlNs0VXRepositoryList vXRepositories(List<XmlNs0VXRepository> vXRepositories) {
    this.vXRepositories = vXRepositories;
    return this;
  }

  public XmlNs0VXRepositoryList addVXRepositoriesItem(XmlNs0VXRepository vXRepositoriesItem) {
    if (this.vXRepositories == null) {
      this.vXRepositories = new ArrayList<XmlNs0VXRepository>();
    }
    this.vXRepositories.add(vXRepositoriesItem);
    return this;
  }

   /**
   * 
   * @return vXRepositories
  **/
  @ApiModelProperty(value = "")
  public List<XmlNs0VXRepository> getVXRepositories() {
    return vXRepositories;
  }

  public void setVXRepositories(List<XmlNs0VXRepository> vXRepositories) {
    this.vXRepositories = vXRepositories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlNs0VXRepositoryList xmlNs0VXRepositoryList = (XmlNs0VXRepositoryList) o;
    return Objects.equals(this.vXRepositories, xmlNs0VXRepositoryList.vXRepositories) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vXRepositories, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0VXRepositoryList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    vXRepositories: ").append(toIndentedString(vXRepositories)).append("\n");
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
