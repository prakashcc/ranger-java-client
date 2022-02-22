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
import io.swagger.client.model.JsonVXMessage;
import io.swagger.client.model.JsonViewBaseBean;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonVXResponse extends JsonViewBaseBean {
  @SerializedName("statusCode")
  private Integer statusCode = null;

  @SerializedName("msgDesc")
  private String msgDesc = null;

  @SerializedName("messageList")
  private List<JsonVXMessage> messageList = null;

  @SerializedName("myClassType")
  private Integer myClassType = null;

  public JsonVXResponse statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;statusCode&lt;/b&gt;
   * @return statusCode
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>statusCode</b>")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public JsonVXResponse msgDesc(String msgDesc) {
    this.msgDesc = msgDesc;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;msgDesc&lt;/b&gt;
   * @return msgDesc
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>msgDesc</b>")
  public String getMsgDesc() {
    return msgDesc;
  }

  public void setMsgDesc(String msgDesc) {
    this.msgDesc = msgDesc;
  }

  public JsonVXResponse messageList(List<JsonVXMessage> messageList) {
    this.messageList = messageList;
    return this;
  }

  public JsonVXResponse addMessageListItem(JsonVXMessage messageListItem) {
    if (this.messageList == null) {
      this.messageList = new ArrayList<JsonVXMessage>();
    }
    this.messageList.add(messageListItem);
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;messageList&lt;/b&gt;
   * @return messageList
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>messageList</b>")
  public List<JsonVXMessage> getMessageList() {
    return messageList;
  }

  public void setMessageList(List<JsonVXMessage> messageList) {
    this.messageList = messageList;
  }

  public JsonVXResponse myClassType(Integer myClassType) {
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
    JsonVXResponse jsonVXResponse = (JsonVXResponse) o;
    return Objects.equals(this.statusCode, jsonVXResponse.statusCode) &&
        Objects.equals(this.msgDesc, jsonVXResponse.msgDesc) &&
        Objects.equals(this.messageList, jsonVXResponse.messageList) &&
        Objects.equals(this.myClassType, jsonVXResponse.myClassType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, msgDesc, messageList, myClassType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonVXResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    msgDesc: ").append(toIndentedString(msgDesc)).append("\n");
    sb.append("    messageList: ").append(toIndentedString(messageList)).append("\n");
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

