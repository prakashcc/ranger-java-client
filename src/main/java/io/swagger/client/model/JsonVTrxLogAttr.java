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
import io.swagger.client.model.JsonViewBaseBean;
import java.io.IOException;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonVTrxLogAttr extends JsonViewBaseBean {
  @SerializedName("attribUserFriendlyName")
  private String attribUserFriendlyName = null;

  @SerializedName("enum")
  private Boolean _enum = null;

  @SerializedName("myClassType")
  private Integer myClassType = null;

  public JsonVTrxLogAttr attribUserFriendlyName(String attribUserFriendlyName) {
    this.attribUserFriendlyName = attribUserFriendlyName;
    return this;
  }

   /**
   * 
   * @return attribUserFriendlyName
  **/
  @ApiModelProperty(value = "")
  public String getAttribUserFriendlyName() {
    return attribUserFriendlyName;
  }

  public void setAttribUserFriendlyName(String attribUserFriendlyName) {
    this.attribUserFriendlyName = attribUserFriendlyName;
  }

  public JsonVTrxLogAttr _enum(Boolean _enum) {
    this._enum = _enum;
    return this;
  }

   /**
   * 
   * @return _enum
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnum() {
    return _enum;
  }

  public void setEnum(Boolean _enum) {
    this._enum = _enum;
  }

  public JsonVTrxLogAttr myClassType(Integer myClassType) {
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
    JsonVTrxLogAttr jsonVTrxLogAttr = (JsonVTrxLogAttr) o;
    return Objects.equals(this.attribUserFriendlyName, jsonVTrxLogAttr.attribUserFriendlyName) &&
        Objects.equals(this._enum, jsonVTrxLogAttr._enum) &&
        Objects.equals(this.myClassType, jsonVTrxLogAttr.myClassType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribUserFriendlyName, _enum, myClassType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonVTrxLogAttr {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    attribUserFriendlyName: ").append(toIndentedString(attribUserFriendlyName)).append("\n");
    sb.append("    _enum: ").append(toIndentedString(_enum)).append("\n");
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

