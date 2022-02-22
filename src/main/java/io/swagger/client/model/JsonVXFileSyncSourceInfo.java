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
import java.io.IOException;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonVXFileSyncSourceInfo {
  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("syncTime")
  private String syncTime = null;

  @SerializedName("lastModified")
  private String lastModified = null;

  @SerializedName("totalUsersSynced")
  private Long totalUsersSynced = null;

  @SerializedName("totalGroupsSynced")
  private Long totalGroupsSynced = null;

  @SerializedName("totalUsersDeleted")
  private Long totalUsersDeleted = null;

  @SerializedName("totalGroupsDeleted")
  private Long totalGroupsDeleted = null;

  public JsonVXFileSyncSourceInfo fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * 
   * @return fileName
  **/
  @ApiModelProperty(value = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public JsonVXFileSyncSourceInfo syncTime(String syncTime) {
    this.syncTime = syncTime;
    return this;
  }

   /**
   * 
   * @return syncTime
  **/
  @ApiModelProperty(value = "")
  public String getSyncTime() {
    return syncTime;
  }

  public void setSyncTime(String syncTime) {
    this.syncTime = syncTime;
  }

  public JsonVXFileSyncSourceInfo lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * 
   * @return lastModified
  **/
  @ApiModelProperty(value = "")
  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  public JsonVXFileSyncSourceInfo totalUsersSynced(Long totalUsersSynced) {
    this.totalUsersSynced = totalUsersSynced;
    return this;
  }

   /**
   * 
   * @return totalUsersSynced
  **/
  @ApiModelProperty(value = "")
  public Long getTotalUsersSynced() {
    return totalUsersSynced;
  }

  public void setTotalUsersSynced(Long totalUsersSynced) {
    this.totalUsersSynced = totalUsersSynced;
  }

  public JsonVXFileSyncSourceInfo totalGroupsSynced(Long totalGroupsSynced) {
    this.totalGroupsSynced = totalGroupsSynced;
    return this;
  }

   /**
   * 
   * @return totalGroupsSynced
  **/
  @ApiModelProperty(value = "")
  public Long getTotalGroupsSynced() {
    return totalGroupsSynced;
  }

  public void setTotalGroupsSynced(Long totalGroupsSynced) {
    this.totalGroupsSynced = totalGroupsSynced;
  }

  public JsonVXFileSyncSourceInfo totalUsersDeleted(Long totalUsersDeleted) {
    this.totalUsersDeleted = totalUsersDeleted;
    return this;
  }

   /**
   * 
   * @return totalUsersDeleted
  **/
  @ApiModelProperty(value = "")
  public Long getTotalUsersDeleted() {
    return totalUsersDeleted;
  }

  public void setTotalUsersDeleted(Long totalUsersDeleted) {
    this.totalUsersDeleted = totalUsersDeleted;
  }

  public JsonVXFileSyncSourceInfo totalGroupsDeleted(Long totalGroupsDeleted) {
    this.totalGroupsDeleted = totalGroupsDeleted;
    return this;
  }

   /**
   * 
   * @return totalGroupsDeleted
  **/
  @ApiModelProperty(value = "")
  public Long getTotalGroupsDeleted() {
    return totalGroupsDeleted;
  }

  public void setTotalGroupsDeleted(Long totalGroupsDeleted) {
    this.totalGroupsDeleted = totalGroupsDeleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonVXFileSyncSourceInfo jsonVXFileSyncSourceInfo = (JsonVXFileSyncSourceInfo) o;
    return Objects.equals(this.fileName, jsonVXFileSyncSourceInfo.fileName) &&
        Objects.equals(this.syncTime, jsonVXFileSyncSourceInfo.syncTime) &&
        Objects.equals(this.lastModified, jsonVXFileSyncSourceInfo.lastModified) &&
        Objects.equals(this.totalUsersSynced, jsonVXFileSyncSourceInfo.totalUsersSynced) &&
        Objects.equals(this.totalGroupsSynced, jsonVXFileSyncSourceInfo.totalGroupsSynced) &&
        Objects.equals(this.totalUsersDeleted, jsonVXFileSyncSourceInfo.totalUsersDeleted) &&
        Objects.equals(this.totalGroupsDeleted, jsonVXFileSyncSourceInfo.totalGroupsDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, syncTime, lastModified, totalUsersSynced, totalGroupsSynced, totalUsersDeleted, totalGroupsDeleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonVXFileSyncSourceInfo {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    syncTime: ").append(toIndentedString(syncTime)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    totalUsersSynced: ").append(toIndentedString(totalUsersSynced)).append("\n");
    sb.append("    totalGroupsSynced: ").append(toIndentedString(totalGroupsSynced)).append("\n");
    sb.append("    totalUsersDeleted: ").append(toIndentedString(totalUsersDeleted)).append("\n");
    sb.append("    totalGroupsDeleted: ").append(toIndentedString(totalGroupsDeleted)).append("\n");
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
