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
import io.swagger.client.model.JsonRangerAccessTypeDef;
import io.swagger.client.model.JsonRangerBaseModelObject;
import io.swagger.client.model.JsonRangerContextEnricherDef;
import io.swagger.client.model.JsonRangerDataMaskDef;
import io.swagger.client.model.JsonRangerEnumDef;
import io.swagger.client.model.JsonRangerPolicyConditionDef;
import io.swagger.client.model.JsonRangerResourceDef;
import io.swagger.client.model.JsonRangerRowFilterDef;
import io.swagger.client.model.JsonRangerServiceConfigDef;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class JsonRangerServiceDef extends JsonRangerBaseModelObject {
  @SerializedName("accessTypes")
  private List<JsonRangerAccessTypeDef> accessTypes = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("rbKeyLabel")
  private String rbKeyLabel = null;

  @SerializedName("dataMaskDef")
  private JsonRangerDataMaskDef dataMaskDef = null;

  @SerializedName("resources")
  private List<JsonRangerResourceDef> resources = null;

  @SerializedName("options")
  private Map<String, String> options = null;

  @SerializedName("rowFilterDef")
  private JsonRangerRowFilterDef rowFilterDef = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("policyConditions")
  private List<JsonRangerPolicyConditionDef> policyConditions = null;

  @SerializedName("implClass")
  private String implClass = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("contextEnrichers")
  private List<JsonRangerContextEnricherDef> contextEnrichers = null;

  @SerializedName("enums")
  private List<JsonRangerEnumDef> enums = null;

  @SerializedName("rbKeyDescription")
  private String rbKeyDescription = null;

  @SerializedName("configs")
  private List<JsonRangerServiceConfigDef> configs = null;

  public JsonRangerServiceDef accessTypes(List<JsonRangerAccessTypeDef> accessTypes) {
    this.accessTypes = accessTypes;
    return this;
  }

  public JsonRangerServiceDef addAccessTypesItem(JsonRangerAccessTypeDef accessTypesItem) {
    if (this.accessTypes == null) {
      this.accessTypes = new ArrayList<JsonRangerAccessTypeDef>();
    }
    this.accessTypes.add(accessTypesItem);
    return this;
  }

   /**
   * 
   * @return accessTypes
  **/
  @ApiModelProperty(value = "")
  public List<JsonRangerAccessTypeDef> getAccessTypes() {
    return accessTypes;
  }

  public void setAccessTypes(List<JsonRangerAccessTypeDef> accessTypes) {
    this.accessTypes = accessTypes;
  }

  public JsonRangerServiceDef label(String label) {
    this.label = label;
    return this;
  }

   /**
   * 
   * @return label
  **/
  @ApiModelProperty(value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public JsonRangerServiceDef rbKeyLabel(String rbKeyLabel) {
    this.rbKeyLabel = rbKeyLabel;
    return this;
  }

   /**
   * 
   * @return rbKeyLabel
  **/
  @ApiModelProperty(value = "")
  public String getRbKeyLabel() {
    return rbKeyLabel;
  }

  public void setRbKeyLabel(String rbKeyLabel) {
    this.rbKeyLabel = rbKeyLabel;
  }

  public JsonRangerServiceDef dataMaskDef(JsonRangerDataMaskDef dataMaskDef) {
    this.dataMaskDef = dataMaskDef;
    return this;
  }

   /**
   * Get dataMaskDef
   * @return dataMaskDef
  **/
  @ApiModelProperty(value = "")
  public JsonRangerDataMaskDef getDataMaskDef() {
    return dataMaskDef;
  }

  public void setDataMaskDef(JsonRangerDataMaskDef dataMaskDef) {
    this.dataMaskDef = dataMaskDef;
  }

  public JsonRangerServiceDef resources(List<JsonRangerResourceDef> resources) {
    this.resources = resources;
    return this;
  }

  public JsonRangerServiceDef addResourcesItem(JsonRangerResourceDef resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<JsonRangerResourceDef>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * 
   * @return resources
  **/
  @ApiModelProperty(value = "")
  public List<JsonRangerResourceDef> getResources() {
    return resources;
  }

  public void setResources(List<JsonRangerResourceDef> resources) {
    this.resources = resources;
  }

  public JsonRangerServiceDef options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public JsonRangerServiceDef putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<String, String>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

   /**
   * 
   * @return options
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(Map<String, String> options) {
    this.options = options;
  }

  public JsonRangerServiceDef rowFilterDef(JsonRangerRowFilterDef rowFilterDef) {
    this.rowFilterDef = rowFilterDef;
    return this;
  }

   /**
   * Get rowFilterDef
   * @return rowFilterDef
  **/
  @ApiModelProperty(value = "")
  public JsonRangerRowFilterDef getRowFilterDef() {
    return rowFilterDef;
  }

  public void setRowFilterDef(JsonRangerRowFilterDef rowFilterDef) {
    this.rowFilterDef = rowFilterDef;
  }

  public JsonRangerServiceDef description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public JsonRangerServiceDef policyConditions(List<JsonRangerPolicyConditionDef> policyConditions) {
    this.policyConditions = policyConditions;
    return this;
  }

  public JsonRangerServiceDef addPolicyConditionsItem(JsonRangerPolicyConditionDef policyConditionsItem) {
    if (this.policyConditions == null) {
      this.policyConditions = new ArrayList<JsonRangerPolicyConditionDef>();
    }
    this.policyConditions.add(policyConditionsItem);
    return this;
  }

   /**
   * 
   * @return policyConditions
  **/
  @ApiModelProperty(value = "")
  public List<JsonRangerPolicyConditionDef> getPolicyConditions() {
    return policyConditions;
  }

  public void setPolicyConditions(List<JsonRangerPolicyConditionDef> policyConditions) {
    this.policyConditions = policyConditions;
  }

  public JsonRangerServiceDef implClass(String implClass) {
    this.implClass = implClass;
    return this;
  }

   /**
   * 
   * @return implClass
  **/
  @ApiModelProperty(value = "")
  public String getImplClass() {
    return implClass;
  }

  public void setImplClass(String implClass) {
    this.implClass = implClass;
  }

  public JsonRangerServiceDef displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * 
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public JsonRangerServiceDef name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JsonRangerServiceDef contextEnrichers(List<JsonRangerContextEnricherDef> contextEnrichers) {
    this.contextEnrichers = contextEnrichers;
    return this;
  }

  public JsonRangerServiceDef addContextEnrichersItem(JsonRangerContextEnricherDef contextEnrichersItem) {
    if (this.contextEnrichers == null) {
      this.contextEnrichers = new ArrayList<JsonRangerContextEnricherDef>();
    }
    this.contextEnrichers.add(contextEnrichersItem);
    return this;
  }

   /**
   * 
   * @return contextEnrichers
  **/
  @ApiModelProperty(value = "")
  public List<JsonRangerContextEnricherDef> getContextEnrichers() {
    return contextEnrichers;
  }

  public void setContextEnrichers(List<JsonRangerContextEnricherDef> contextEnrichers) {
    this.contextEnrichers = contextEnrichers;
  }

  public JsonRangerServiceDef enums(List<JsonRangerEnumDef> enums) {
    this.enums = enums;
    return this;
  }

  public JsonRangerServiceDef addEnumsItem(JsonRangerEnumDef enumsItem) {
    if (this.enums == null) {
      this.enums = new ArrayList<JsonRangerEnumDef>();
    }
    this.enums.add(enumsItem);
    return this;
  }

   /**
   * 
   * @return enums
  **/
  @ApiModelProperty(value = "")
  public List<JsonRangerEnumDef> getEnums() {
    return enums;
  }

  public void setEnums(List<JsonRangerEnumDef> enums) {
    this.enums = enums;
  }

  public JsonRangerServiceDef rbKeyDescription(String rbKeyDescription) {
    this.rbKeyDescription = rbKeyDescription;
    return this;
  }

   /**
   * 
   * @return rbKeyDescription
  **/
  @ApiModelProperty(value = "")
  public String getRbKeyDescription() {
    return rbKeyDescription;
  }

  public void setRbKeyDescription(String rbKeyDescription) {
    this.rbKeyDescription = rbKeyDescription;
  }

  public JsonRangerServiceDef configs(List<JsonRangerServiceConfigDef> configs) {
    this.configs = configs;
    return this;
  }

  public JsonRangerServiceDef addConfigsItem(JsonRangerServiceConfigDef configsItem) {
    if (this.configs == null) {
      this.configs = new ArrayList<JsonRangerServiceConfigDef>();
    }
    this.configs.add(configsItem);
    return this;
  }

   /**
   * 
   * @return configs
  **/
  @ApiModelProperty(value = "")
  public List<JsonRangerServiceConfigDef> getConfigs() {
    return configs;
  }

  public void setConfigs(List<JsonRangerServiceConfigDef> configs) {
    this.configs = configs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonRangerServiceDef jsonRangerServiceDef = (JsonRangerServiceDef) o;
    return Objects.equals(this.accessTypes, jsonRangerServiceDef.accessTypes) &&
        Objects.equals(this.label, jsonRangerServiceDef.label) &&
        Objects.equals(this.rbKeyLabel, jsonRangerServiceDef.rbKeyLabel) &&
        Objects.equals(this.dataMaskDef, jsonRangerServiceDef.dataMaskDef) &&
        Objects.equals(this.resources, jsonRangerServiceDef.resources) &&
        Objects.equals(this.options, jsonRangerServiceDef.options) &&
        Objects.equals(this.rowFilterDef, jsonRangerServiceDef.rowFilterDef) &&
        Objects.equals(this.description, jsonRangerServiceDef.description) &&
        Objects.equals(this.policyConditions, jsonRangerServiceDef.policyConditions) &&
        Objects.equals(this.implClass, jsonRangerServiceDef.implClass) &&
        Objects.equals(this.displayName, jsonRangerServiceDef.displayName) &&
        Objects.equals(this.name, jsonRangerServiceDef.name) &&
        Objects.equals(this.contextEnrichers, jsonRangerServiceDef.contextEnrichers) &&
        Objects.equals(this.enums, jsonRangerServiceDef.enums) &&
        Objects.equals(this.rbKeyDescription, jsonRangerServiceDef.rbKeyDescription) &&
        Objects.equals(this.configs, jsonRangerServiceDef.configs) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessTypes, label, rbKeyLabel, dataMaskDef, resources, options, rowFilterDef, description, policyConditions, implClass, displayName, name, contextEnrichers, enums, rbKeyDescription, configs, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonRangerServiceDef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accessTypes: ").append(toIndentedString(accessTypes)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    rbKeyLabel: ").append(toIndentedString(rbKeyLabel)).append("\n");
    sb.append("    dataMaskDef: ").append(toIndentedString(dataMaskDef)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    rowFilterDef: ").append(toIndentedString(rowFilterDef)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    policyConditions: ").append(toIndentedString(policyConditions)).append("\n");
    sb.append("    implClass: ").append(toIndentedString(implClass)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contextEnrichers: ").append(toIndentedString(contextEnrichers)).append("\n");
    sb.append("    enums: ").append(toIndentedString(enums)).append("\n");
    sb.append("    rbKeyDescription: ").append(toIndentedString(rbKeyDescription)).append("\n");
    sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
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

