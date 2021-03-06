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
public class JsonXXResourceDef extends JsonXXDBBase {
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("itemId")
  private BigDecimal itemId = null;

  @SerializedName("defid")
  private BigDecimal defid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("level")
  private BigDecimal level = null;

  @SerializedName("parent")
  private BigDecimal parent = null;

  @SerializedName("mandatory")
  private Boolean mandatory = null;

  @SerializedName("lookupsupported")
  private Boolean lookupsupported = null;

  @SerializedName("recursivesupported")
  private Boolean recursivesupported = null;

  @SerializedName("excludessupported")
  private Boolean excludessupported = null;

  @SerializedName("matcher")
  private String matcher = null;

  @SerializedName("matcheroptions")
  private String matcheroptions = null;

  @SerializedName("validationRegEx")
  private String validationRegEx = null;

  @SerializedName("validationMessage")
  private String validationMessage = null;

  @SerializedName("uiHint")
  private String uiHint = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("rbkeylabel")
  private String rbkeylabel = null;

  @SerializedName("rbkeydescription")
  private String rbkeydescription = null;

  @SerializedName("rbKeyValidationMessage")
  private String rbKeyValidationMessage = null;

  @SerializedName("order")
  private BigDecimal order = null;

  @SerializedName("dataMaskOptions")
  private String dataMaskOptions = null;

  @SerializedName("rowFilterOptions")
  private String rowFilterOptions = null;

  public JsonXXResourceDef id(BigDecimal id) {
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

  public JsonXXResourceDef itemId(BigDecimal itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;itemId&lt;/b&gt;
   * @return itemId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>itemId</b>")
  public BigDecimal getItemId() {
    return itemId;
  }

  public void setItemId(BigDecimal itemId) {
    this.itemId = itemId;
  }

  public JsonXXResourceDef defid(BigDecimal defid) {
    this.defid = defid;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;defId&lt;/b&gt;
   * @return defid
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>defId</b>")
  public BigDecimal getDefid() {
    return defid;
  }

  public void setDefid(BigDecimal defid) {
    this.defid = defid;
  }

  public JsonXXResourceDef name(String name) {
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

  public JsonXXResourceDef type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;type&lt;/b&gt;
   * @return type
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>type</b>")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public JsonXXResourceDef level(BigDecimal level) {
    this.level = level;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;level&lt;/b&gt;
   * @return level
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>level</b>")
  public BigDecimal getLevel() {
    return level;
  }

  public void setLevel(BigDecimal level) {
    this.level = level;
  }

  public JsonXXResourceDef parent(BigDecimal parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;parent&lt;/b&gt;
   * @return parent
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>parent</b>")
  public BigDecimal getParent() {
    return parent;
  }

  public void setParent(BigDecimal parent) {
    this.parent = parent;
  }

  public JsonXXResourceDef mandatory(Boolean mandatory) {
    this.mandatory = mandatory;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;mandatory&lt;/b&gt;
   * @return mandatory
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>mandatory</b>")
  public Boolean isMandatory() {
    return mandatory;
  }

  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }

  public JsonXXResourceDef lookupsupported(Boolean lookupsupported) {
    this.lookupsupported = lookupsupported;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;lookUpSupported&lt;/b&gt;
   * @return lookupsupported
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>lookUpSupported</b>")
  public Boolean isLookupsupported() {
    return lookupsupported;
  }

  public void setLookupsupported(Boolean lookupsupported) {
    this.lookupsupported = lookupsupported;
  }

  public JsonXXResourceDef recursivesupported(Boolean recursivesupported) {
    this.recursivesupported = recursivesupported;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;recursiveSupported&lt;/b&gt;
   * @return recursivesupported
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>recursiveSupported</b>")
  public Boolean isRecursivesupported() {
    return recursivesupported;
  }

  public void setRecursivesupported(Boolean recursivesupported) {
    this.recursivesupported = recursivesupported;
  }

  public JsonXXResourceDef excludessupported(Boolean excludessupported) {
    this.excludessupported = excludessupported;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;excludesSupported&lt;/b&gt;
   * @return excludessupported
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>excludesSupported</b>")
  public Boolean isExcludessupported() {
    return excludessupported;
  }

  public void setExcludessupported(Boolean excludessupported) {
    this.excludessupported = excludessupported;
  }

  public JsonXXResourceDef matcher(String matcher) {
    this.matcher = matcher;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;matcher&lt;/b&gt;
   * @return matcher
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>matcher</b>")
  public String getMatcher() {
    return matcher;
  }

  public void setMatcher(String matcher) {
    this.matcher = matcher;
  }

  public JsonXXResourceDef matcheroptions(String matcheroptions) {
    this.matcheroptions = matcheroptions;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;matcherOptions&lt;/b&gt;
   * @return matcheroptions
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>matcherOptions</b>")
  public String getMatcheroptions() {
    return matcheroptions;
  }

  public void setMatcheroptions(String matcheroptions) {
    this.matcheroptions = matcheroptions;
  }

  public JsonXXResourceDef validationRegEx(String validationRegEx) {
    this.validationRegEx = validationRegEx;
    return this;
  }

   /**
   * 
   * @return validationRegEx
  **/
  @ApiModelProperty(value = "")
  public String getValidationRegEx() {
    return validationRegEx;
  }

  public void setValidationRegEx(String validationRegEx) {
    this.validationRegEx = validationRegEx;
  }

  public JsonXXResourceDef validationMessage(String validationMessage) {
    this.validationMessage = validationMessage;
    return this;
  }

   /**
   * 
   * @return validationMessage
  **/
  @ApiModelProperty(value = "")
  public String getValidationMessage() {
    return validationMessage;
  }

  public void setValidationMessage(String validationMessage) {
    this.validationMessage = validationMessage;
  }

  public JsonXXResourceDef uiHint(String uiHint) {
    this.uiHint = uiHint;
    return this;
  }

   /**
   * 
   * @return uiHint
  **/
  @ApiModelProperty(value = "")
  public String getUiHint() {
    return uiHint;
  }

  public void setUiHint(String uiHint) {
    this.uiHint = uiHint;
  }

  public JsonXXResourceDef label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;label&lt;/b&gt;
   * @return label
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>label</b>")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public JsonXXResourceDef description(String description) {
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

  public JsonXXResourceDef rbkeylabel(String rbkeylabel) {
    this.rbkeylabel = rbkeylabel;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;rbKeyLabel&lt;/b&gt;
   * @return rbkeylabel
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>rbKeyLabel</b>")
  public String getRbkeylabel() {
    return rbkeylabel;
  }

  public void setRbkeylabel(String rbkeylabel) {
    this.rbkeylabel = rbkeylabel;
  }

  public JsonXXResourceDef rbkeydescription(String rbkeydescription) {
    this.rbkeydescription = rbkeydescription;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;rbKeyDescription&lt;/b&gt;
   * @return rbkeydescription
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>rbKeyDescription</b>")
  public String getRbkeydescription() {
    return rbkeydescription;
  }

  public void setRbkeydescription(String rbkeydescription) {
    this.rbkeydescription = rbkeydescription;
  }

  public JsonXXResourceDef rbKeyValidationMessage(String rbKeyValidationMessage) {
    this.rbKeyValidationMessage = rbKeyValidationMessage;
    return this;
  }

   /**
   * 
   * @return rbKeyValidationMessage
  **/
  @ApiModelProperty(value = "")
  public String getRbKeyValidationMessage() {
    return rbKeyValidationMessage;
  }

  public void setRbKeyValidationMessage(String rbKeyValidationMessage) {
    this.rbKeyValidationMessage = rbKeyValidationMessage;
  }

  public JsonXXResourceDef order(BigDecimal order) {
    this.order = order;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;order&lt;/b&gt;
   * @return order
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>order</b>")
  public BigDecimal getOrder() {
    return order;
  }

  public void setOrder(BigDecimal order) {
    this.order = order;
  }

  public JsonXXResourceDef dataMaskOptions(String dataMaskOptions) {
    this.dataMaskOptions = dataMaskOptions;
    return this;
  }

   /**
   * 
   * @return dataMaskOptions
  **/
  @ApiModelProperty(value = "")
  public String getDataMaskOptions() {
    return dataMaskOptions;
  }

  public void setDataMaskOptions(String dataMaskOptions) {
    this.dataMaskOptions = dataMaskOptions;
  }

  public JsonXXResourceDef rowFilterOptions(String rowFilterOptions) {
    this.rowFilterOptions = rowFilterOptions;
    return this;
  }

   /**
   * 
   * @return rowFilterOptions
  **/
  @ApiModelProperty(value = "")
  public String getRowFilterOptions() {
    return rowFilterOptions;
  }

  public void setRowFilterOptions(String rowFilterOptions) {
    this.rowFilterOptions = rowFilterOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonXXResourceDef jsonXXResourceDef = (JsonXXResourceDef) o;
    return Objects.equals(this.id, jsonXXResourceDef.id) &&
        Objects.equals(this.itemId, jsonXXResourceDef.itemId) &&
        Objects.equals(this.defid, jsonXXResourceDef.defid) &&
        Objects.equals(this.name, jsonXXResourceDef.name) &&
        Objects.equals(this.type, jsonXXResourceDef.type) &&
        Objects.equals(this.level, jsonXXResourceDef.level) &&
        Objects.equals(this.parent, jsonXXResourceDef.parent) &&
        Objects.equals(this.mandatory, jsonXXResourceDef.mandatory) &&
        Objects.equals(this.lookupsupported, jsonXXResourceDef.lookupsupported) &&
        Objects.equals(this.recursivesupported, jsonXXResourceDef.recursivesupported) &&
        Objects.equals(this.excludessupported, jsonXXResourceDef.excludessupported) &&
        Objects.equals(this.matcher, jsonXXResourceDef.matcher) &&
        Objects.equals(this.matcheroptions, jsonXXResourceDef.matcheroptions) &&
        Objects.equals(this.validationRegEx, jsonXXResourceDef.validationRegEx) &&
        Objects.equals(this.validationMessage, jsonXXResourceDef.validationMessage) &&
        Objects.equals(this.uiHint, jsonXXResourceDef.uiHint) &&
        Objects.equals(this.label, jsonXXResourceDef.label) &&
        Objects.equals(this.description, jsonXXResourceDef.description) &&
        Objects.equals(this.rbkeylabel, jsonXXResourceDef.rbkeylabel) &&
        Objects.equals(this.rbkeydescription, jsonXXResourceDef.rbkeydescription) &&
        Objects.equals(this.rbKeyValidationMessage, jsonXXResourceDef.rbKeyValidationMessage) &&
        Objects.equals(this.order, jsonXXResourceDef.order) &&
        Objects.equals(this.dataMaskOptions, jsonXXResourceDef.dataMaskOptions) &&
        Objects.equals(this.rowFilterOptions, jsonXXResourceDef.rowFilterOptions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, itemId, defid, name, type, level, parent, mandatory, lookupsupported, recursivesupported, excludessupported, matcher, matcheroptions, validationRegEx, validationMessage, uiHint, label, description, rbkeylabel, rbkeydescription, rbKeyValidationMessage, order, dataMaskOptions, rowFilterOptions, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonXXResourceDef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    defid: ").append(toIndentedString(defid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    lookupsupported: ").append(toIndentedString(lookupsupported)).append("\n");
    sb.append("    recursivesupported: ").append(toIndentedString(recursivesupported)).append("\n");
    sb.append("    excludessupported: ").append(toIndentedString(excludessupported)).append("\n");
    sb.append("    matcher: ").append(toIndentedString(matcher)).append("\n");
    sb.append("    matcheroptions: ").append(toIndentedString(matcheroptions)).append("\n");
    sb.append("    validationRegEx: ").append(toIndentedString(validationRegEx)).append("\n");
    sb.append("    validationMessage: ").append(toIndentedString(validationMessage)).append("\n");
    sb.append("    uiHint: ").append(toIndentedString(uiHint)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rbkeylabel: ").append(toIndentedString(rbkeylabel)).append("\n");
    sb.append("    rbkeydescription: ").append(toIndentedString(rbkeydescription)).append("\n");
    sb.append("    rbKeyValidationMessage: ").append(toIndentedString(rbKeyValidationMessage)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    dataMaskOptions: ").append(toIndentedString(dataMaskOptions)).append("\n");
    sb.append("    rowFilterOptions: ").append(toIndentedString(rowFilterOptions)).append("\n");
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

