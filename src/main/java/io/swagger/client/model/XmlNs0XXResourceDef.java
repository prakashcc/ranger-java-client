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
import io.swagger.client.model.XmlNs0XXDBBase;
import java.io.IOException;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T15:05:51.243Z")
public class XmlNs0XXResourceDef extends XmlNs0XXDBBase {
  @SerializedName("dataMaskOptions")
  private String dataMaskOptions = null;

  @SerializedName("defid")
  private Long defid = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("excludessupported")
  private Boolean excludessupported = null;

  @SerializedName("itemId")
  private Long itemId = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("level")
  private Integer level = null;

  @SerializedName("lookupsupported")
  private Boolean lookupsupported = null;

  @SerializedName("mandatory")
  private Boolean mandatory = null;

  @SerializedName("matcher")
  private String matcher = null;

  @SerializedName("matcheroptions")
  private String matcheroptions = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("parent")
  private Long parent = null;

  @SerializedName("rbKeyValidationMessage")
  private String rbKeyValidationMessage = null;

  @SerializedName("rbkeydescription")
  private String rbkeydescription = null;

  @SerializedName("rbkeylabel")
  private String rbkeylabel = null;

  @SerializedName("recursivesupported")
  private Boolean recursivesupported = null;

  @SerializedName("rowFilterOptions")
  private String rowFilterOptions = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("uiHint")
  private String uiHint = null;

  @SerializedName("validationMessage")
  private String validationMessage = null;

  @SerializedName("validationRegEx")
  private String validationRegEx = null;

  public XmlNs0XXResourceDef dataMaskOptions(String dataMaskOptions) {
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

  public XmlNs0XXResourceDef defid(Long defid) {
    this.defid = defid;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;defId&lt;/b&gt;
   * @return defid
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>defId</b>")
  public Long getDefid() {
    return defid;
  }

  public void setDefid(Long defid) {
    this.defid = defid;
  }

  public XmlNs0XXResourceDef description(String description) {
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

  public XmlNs0XXResourceDef excludessupported(Boolean excludessupported) {
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

  public XmlNs0XXResourceDef itemId(Long itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;itemId&lt;/b&gt;
   * @return itemId
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>itemId</b>")
  public Long getItemId() {
    return itemId;
  }

  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }

  public XmlNs0XXResourceDef label(String label) {
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

  public XmlNs0XXResourceDef level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;level&lt;/b&gt;
   * @return level
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>level</b>")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public XmlNs0XXResourceDef lookupsupported(Boolean lookupsupported) {
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

  public XmlNs0XXResourceDef mandatory(Boolean mandatory) {
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

  public XmlNs0XXResourceDef matcher(String matcher) {
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

  public XmlNs0XXResourceDef matcheroptions(String matcheroptions) {
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

  public XmlNs0XXResourceDef name(String name) {
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

  public XmlNs0XXResourceDef order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;order&lt;/b&gt;
   * @return order
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>order</b>")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public XmlNs0XXResourceDef parent(Long parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Returns the value for the member attribute &lt;b&gt;parent&lt;/b&gt;
   * @return parent
  **/
  @ApiModelProperty(value = "Returns the value for the member attribute <b>parent</b>")
  public Long getParent() {
    return parent;
  }

  public void setParent(Long parent) {
    this.parent = parent;
  }

  public XmlNs0XXResourceDef rbKeyValidationMessage(String rbKeyValidationMessage) {
    this.rbKeyValidationMessage = rbKeyValidationMessage;
    return this;
  }

   /**
   * the rbKeyValidationMessage
   * @return rbKeyValidationMessage
  **/
  @ApiModelProperty(value = "the rbKeyValidationMessage")
  public String getRbKeyValidationMessage() {
    return rbKeyValidationMessage;
  }

  public void setRbKeyValidationMessage(String rbKeyValidationMessage) {
    this.rbKeyValidationMessage = rbKeyValidationMessage;
  }

  public XmlNs0XXResourceDef rbkeydescription(String rbkeydescription) {
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

  public XmlNs0XXResourceDef rbkeylabel(String rbkeylabel) {
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

  public XmlNs0XXResourceDef recursivesupported(Boolean recursivesupported) {
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

  public XmlNs0XXResourceDef rowFilterOptions(String rowFilterOptions) {
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

  public XmlNs0XXResourceDef type(String type) {
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

  public XmlNs0XXResourceDef uiHint(String uiHint) {
    this.uiHint = uiHint;
    return this;
  }

   /**
   * the uiHint
   * @return uiHint
  **/
  @ApiModelProperty(value = "the uiHint")
  public String getUiHint() {
    return uiHint;
  }

  public void setUiHint(String uiHint) {
    this.uiHint = uiHint;
  }

  public XmlNs0XXResourceDef validationMessage(String validationMessage) {
    this.validationMessage = validationMessage;
    return this;
  }

   /**
   * the validationMessage
   * @return validationMessage
  **/
  @ApiModelProperty(value = "the validationMessage")
  public String getValidationMessage() {
    return validationMessage;
  }

  public void setValidationMessage(String validationMessage) {
    this.validationMessage = validationMessage;
  }

  public XmlNs0XXResourceDef validationRegEx(String validationRegEx) {
    this.validationRegEx = validationRegEx;
    return this;
  }

   /**
   * the validationRegEx
   * @return validationRegEx
  **/
  @ApiModelProperty(value = "the validationRegEx")
  public String getValidationRegEx() {
    return validationRegEx;
  }

  public void setValidationRegEx(String validationRegEx) {
    this.validationRegEx = validationRegEx;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlNs0XXResourceDef xmlNs0XXResourceDef = (XmlNs0XXResourceDef) o;
    return Objects.equals(this.dataMaskOptions, xmlNs0XXResourceDef.dataMaskOptions) &&
        Objects.equals(this.defid, xmlNs0XXResourceDef.defid) &&
        Objects.equals(this.description, xmlNs0XXResourceDef.description) &&
        Objects.equals(this.excludessupported, xmlNs0XXResourceDef.excludessupported) &&
        Objects.equals(this.itemId, xmlNs0XXResourceDef.itemId) &&
        Objects.equals(this.label, xmlNs0XXResourceDef.label) &&
        Objects.equals(this.level, xmlNs0XXResourceDef.level) &&
        Objects.equals(this.lookupsupported, xmlNs0XXResourceDef.lookupsupported) &&
        Objects.equals(this.mandatory, xmlNs0XXResourceDef.mandatory) &&
        Objects.equals(this.matcher, xmlNs0XXResourceDef.matcher) &&
        Objects.equals(this.matcheroptions, xmlNs0XXResourceDef.matcheroptions) &&
        Objects.equals(this.name, xmlNs0XXResourceDef.name) &&
        Objects.equals(this.order, xmlNs0XXResourceDef.order) &&
        Objects.equals(this.parent, xmlNs0XXResourceDef.parent) &&
        Objects.equals(this.rbKeyValidationMessage, xmlNs0XXResourceDef.rbKeyValidationMessage) &&
        Objects.equals(this.rbkeydescription, xmlNs0XXResourceDef.rbkeydescription) &&
        Objects.equals(this.rbkeylabel, xmlNs0XXResourceDef.rbkeylabel) &&
        Objects.equals(this.recursivesupported, xmlNs0XXResourceDef.recursivesupported) &&
        Objects.equals(this.rowFilterOptions, xmlNs0XXResourceDef.rowFilterOptions) &&
        Objects.equals(this.type, xmlNs0XXResourceDef.type) &&
        Objects.equals(this.uiHint, xmlNs0XXResourceDef.uiHint) &&
        Objects.equals(this.validationMessage, xmlNs0XXResourceDef.validationMessage) &&
        Objects.equals(this.validationRegEx, xmlNs0XXResourceDef.validationRegEx) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataMaskOptions, defid, description, excludessupported, itemId, label, level, lookupsupported, mandatory, matcher, matcheroptions, name, order, parent, rbKeyValidationMessage, rbkeydescription, rbkeylabel, recursivesupported, rowFilterOptions, type, uiHint, validationMessage, validationRegEx, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0XXResourceDef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dataMaskOptions: ").append(toIndentedString(dataMaskOptions)).append("\n");
    sb.append("    defid: ").append(toIndentedString(defid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    excludessupported: ").append(toIndentedString(excludessupported)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    lookupsupported: ").append(toIndentedString(lookupsupported)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    matcher: ").append(toIndentedString(matcher)).append("\n");
    sb.append("    matcheroptions: ").append(toIndentedString(matcheroptions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    rbKeyValidationMessage: ").append(toIndentedString(rbKeyValidationMessage)).append("\n");
    sb.append("    rbkeydescription: ").append(toIndentedString(rbkeydescription)).append("\n");
    sb.append("    rbkeylabel: ").append(toIndentedString(rbkeylabel)).append("\n");
    sb.append("    recursivesupported: ").append(toIndentedString(recursivesupported)).append("\n");
    sb.append("    rowFilterOptions: ").append(toIndentedString(rowFilterOptions)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uiHint: ").append(toIndentedString(uiHint)).append("\n");
    sb.append("    validationMessage: ").append(toIndentedString(validationMessage)).append("\n");
    sb.append("    validationRegEx: ").append(toIndentedString(validationRegEx)).append("\n");
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
