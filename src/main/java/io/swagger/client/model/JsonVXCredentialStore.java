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
public class JsonVXCredentialStore extends JsonVXDataObject {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("myClassType")
  private Integer myClassType = null;

  public JsonVXCredentialStore name(String name) {
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

  public JsonVXCredentialStore description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;description&lt;/b&gt;
   * @return description
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>description</b>")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public JsonVXCredentialStore myClassType(Integer myClassType) {
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
    JsonVXCredentialStore jsonVXCredentialStore = (JsonVXCredentialStore) o;
    return Objects.equals(this.name, jsonVXCredentialStore.name) &&
        Objects.equals(this.description, jsonVXCredentialStore.description) &&
        Objects.equals(this.myClassType, jsonVXCredentialStore.myClassType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, myClassType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonVXCredentialStore {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

