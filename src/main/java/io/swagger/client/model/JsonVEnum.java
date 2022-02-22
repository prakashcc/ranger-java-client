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
import io.swagger.client.model.JsonVEnumElement;
import io.swagger.client.model.JsonViewBaseBean;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonVEnum extends JsonViewBaseBean {
  @SerializedName("enumName")
  private String enumName = null;

  @SerializedName("elementList")
  private List<JsonVEnumElement> elementList = null;

  @SerializedName("myClassType")
  private Integer myClassType = null;

  public JsonVEnum enumName(String enumName) {
    this.enumName = enumName;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;enumName&lt;/b&gt;
   * @return enumName
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>enumName</b>")
  public String getEnumName() {
    return enumName;
  }

  public void setEnumName(String enumName) {
    this.enumName = enumName;
  }

  public JsonVEnum elementList(List<JsonVEnumElement> elementList) {
    this.elementList = elementList;
    return this;
  }

  public JsonVEnum addElementListItem(JsonVEnumElement elementListItem) {
    if (this.elementList == null) {
      this.elementList = new ArrayList<JsonVEnumElement>();
    }
    this.elementList.add(elementListItem);
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;elementList&lt;/b&gt;
   * @return elementList
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>elementList</b>")
  public List<JsonVEnumElement> getElementList() {
    return elementList;
  }

  public void setElementList(List<JsonVEnumElement> elementList) {
    this.elementList = elementList;
  }

  public JsonVEnum myClassType(Integer myClassType) {
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
    JsonVEnum jsonVEnum = (JsonVEnum) o;
    return Objects.equals(this.enumName, jsonVEnum.enumName) &&
        Objects.equals(this.elementList, jsonVEnum.elementList) &&
        Objects.equals(this.myClassType, jsonVEnum.myClassType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enumName, elementList, myClassType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonVEnum {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    enumName: ").append(toIndentedString(enumName)).append("\n");
    sb.append("    elementList: ").append(toIndentedString(elementList)).append("\n");
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

