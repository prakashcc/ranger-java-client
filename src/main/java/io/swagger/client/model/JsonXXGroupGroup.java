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
public class JsonXXGroupGroup extends JsonXXDBBase {
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("myClassType")
  private Integer myClassType = null;

  @SerializedName("myDisplayValue")
  private String myDisplayValue = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("parentGroupId")
  private BigDecimal parentGroupId = null;

  @SerializedName("groupId")
  private BigDecimal groupId = null;

  public JsonXXGroupGroup id(BigDecimal id) {
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

  public JsonXXGroupGroup myClassType(Integer myClassType) {
    this.myClassType = myClassType;
    return this;
  }

   /**
   * 
   * @return myClassType
  **/
  @ApiModelProperty(value = "")
  public Integer getMyClassType() {
    return myClassType;
  }

  public void setMyClassType(Integer myClassType) {
    this.myClassType = myClassType;
  }

  public JsonXXGroupGroup myDisplayValue(String myDisplayValue) {
    this.myDisplayValue = myDisplayValue;
    return this;
  }

   /**
   * 
   * @return myDisplayValue
  **/
  @ApiModelProperty(value = "")
  public String getMyDisplayValue() {
    return myDisplayValue;
  }

  public void setMyDisplayValue(String myDisplayValue) {
    this.myDisplayValue = myDisplayValue;
  }

  public JsonXXGroupGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;name&lt;/b&gt;
   * @return name
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>name</b>")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JsonXXGroupGroup parentGroupId(BigDecimal parentGroupId) {
    this.parentGroupId = parentGroupId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;parentGroupId&lt;/b&gt;
   * @return parentGroupId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>parentGroupId</b>")
  public BigDecimal getParentGroupId() {
    return parentGroupId;
  }

  public void setParentGroupId(BigDecimal parentGroupId) {
    this.parentGroupId = parentGroupId;
  }

  public JsonXXGroupGroup groupId(BigDecimal groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;groupId&lt;/b&gt;
   * @return groupId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>groupId</b>")
  public BigDecimal getGroupId() {
    return groupId;
  }

  public void setGroupId(BigDecimal groupId) {
    this.groupId = groupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonXXGroupGroup jsonXXGroupGroup = (JsonXXGroupGroup) o;
    return Objects.equals(this.id, jsonXXGroupGroup.id) &&
        Objects.equals(this.myClassType, jsonXXGroupGroup.myClassType) &&
        Objects.equals(this.myDisplayValue, jsonXXGroupGroup.myDisplayValue) &&
        Objects.equals(this.name, jsonXXGroupGroup.name) &&
        Objects.equals(this.parentGroupId, jsonXXGroupGroup.parentGroupId) &&
        Objects.equals(this.groupId, jsonXXGroupGroup.groupId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, myClassType, myDisplayValue, name, parentGroupId, groupId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonXXGroupGroup {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    myClassType: ").append(toIndentedString(myClassType)).append("\n");
    sb.append("    myDisplayValue: ").append(toIndentedString(myDisplayValue)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
