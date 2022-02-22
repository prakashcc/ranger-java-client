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
@JsonAdapter(XmlNs0TagsChangeExtent.Adapter.class)
public enum XmlNs0TagsChangeExtent {
  
  NONE("NONE"),
  
  TAGS("TAGS"),
  
  SERVICE_RESOURCE("SERVICE_RESOURCE"),
  
  ALL("ALL");

  private String value;

  XmlNs0TagsChangeExtent(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static XmlNs0TagsChangeExtent fromValue(String text) {
    for (XmlNs0TagsChangeExtent b : XmlNs0TagsChangeExtent.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<XmlNs0TagsChangeExtent> {
    @Override
    public void write(final JsonWriter jsonWriter, final XmlNs0TagsChangeExtent enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public XmlNs0TagsChangeExtent read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return XmlNs0TagsChangeExtent.fromValue(String.valueOf(value));
    }
  }
}

