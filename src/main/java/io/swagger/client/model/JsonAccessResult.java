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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(JsonAccessResult.Adapter.class)
public enum JsonAccessResult {
  
  DENIED("DENIED"),
  
  ALLOWED("ALLOWED"),
  
  NOT_DETERMINED("NOT_DETERMINED");

  private String value;

  JsonAccessResult(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static JsonAccessResult fromValue(String text) {
    for (JsonAccessResult b : JsonAccessResult.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<JsonAccessResult> {
    @Override
    public void write(final JsonWriter jsonWriter, final JsonAccessResult enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public JsonAccessResult read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return JsonAccessResult.fromValue(String.valueOf(value));
    }
  }
}
