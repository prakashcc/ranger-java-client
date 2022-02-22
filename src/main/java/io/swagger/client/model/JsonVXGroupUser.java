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
import io.swagger.client.model.JsonVXDataObject;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonVXGroupUser extends JsonVXDataObject {
  @SerializedName("name")
  private String name = null;

  @SerializedName("parentGroupId")
  private BigDecimal parentGroupId = null;

  @SerializedName("userId")
  private BigDecimal userId = null;

  @SerializedName("myClassType")
  private Integer myClassType = null;

  public JsonVXGroupUser name(String name) {
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

  public JsonVXGroupUser parentGroupId(BigDecimal parentGroupId) {
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

  public JsonVXGroupUser userId(BigDecimal userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;userId&lt;/b&gt;
   * @return userId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>userId</b>")
  public BigDecimal getUserId() {
    return userId;
  }

  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }

  public JsonVXGroupUser myClassType(Integer myClassType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonVXGroupUser jsonVXGroupUser = (JsonVXGroupUser) o;
    return Objects.equals(this.name, jsonVXGroupUser.name) &&
        Objects.equals(this.parentGroupId, jsonVXGroupUser.parentGroupId) &&
        Objects.equals(this.userId, jsonVXGroupUser.userId) &&
        Objects.equals(this.myClassType, jsonVXGroupUser.myClassType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, parentGroupId, userId, myClassType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonVXGroupUser {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    myClassType: ").append(toIndentedString(myClassType)).append("\n");
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

