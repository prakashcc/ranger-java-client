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
import io.swagger.client.model.XmlNs0ViewBaseBean;
import java.io.IOException;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class XmlNs0VList extends XmlNs0ViewBaseBean {
  @SerializedName("pageSize")
  private Integer pageSize = null;

  @SerializedName("resultSize")
  private Integer resultSize = null;

  @SerializedName("sortBy")
  private String sortBy = null;

  @SerializedName("sortType")
  private String sortType = null;

  @SerializedName("startIndex")
  private Integer startIndex = null;

  @SerializedName("totalCount")
  private Long totalCount = null;

  public XmlNs0VList pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 
   * @return pageSize
  **/
  @ApiModelProperty(value = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public XmlNs0VList resultSize(Integer resultSize) {
    this.resultSize = resultSize;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;resultSize&lt;/b&gt;
   * @return resultSize
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>resultSize</b>")
  public Integer getResultSize() {
    return resultSize;
  }

  public void setResultSize(Integer resultSize) {
    this.resultSize = resultSize;
  }

  public XmlNs0VList sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }

   /**
   * 
   * @return sortBy
  **/
  @ApiModelProperty(value = "")
  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }

  public XmlNs0VList sortType(String sortType) {
    this.sortType = sortType;
    return this;
  }

   /**
   * 
   * @return sortType
  **/
  @ApiModelProperty(value = "")
  public String getSortType() {
    return sortType;
  }

  public void setSortType(String sortType) {
    this.sortType = sortType;
  }

  public XmlNs0VList startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

   /**
   * 
   * @return startIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public XmlNs0VList totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * 
   * @return totalCount
  **/
  @ApiModelProperty(value = "")
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlNs0VList xmlNs0VList = (XmlNs0VList) o;
    return Objects.equals(this.pageSize, xmlNs0VList.pageSize) &&
        Objects.equals(this.resultSize, xmlNs0VList.resultSize) &&
        Objects.equals(this.sortBy, xmlNs0VList.sortBy) &&
        Objects.equals(this.sortType, xmlNs0VList.sortType) &&
        Objects.equals(this.startIndex, xmlNs0VList.startIndex) &&
        Objects.equals(this.totalCount, xmlNs0VList.totalCount) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, resultSize, sortBy, sortType, startIndex, totalCount, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0VList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    resultSize: ").append(toIndentedString(resultSize)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

