package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Dictionary containing the details of a custom profile field configured for this organization. 
 */
@ApiModel(description="Dictionary containing the details of a custom profile field configured for this organization. ")

public class CustomProfileField  {
  
 /**
  * The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. 
  */
  @ApiModelProperty(value = "The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. ")
  private Integer id;

 /**
  * An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
  */
  @ApiModelProperty(value = "An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account ")
  private Integer type;

 /**
  * Custom profile fields are displayed in both settings UI and UI showing users' profiles in increasing `order`. 
  */
  @ApiModelProperty(value = "Custom profile fields are displayed in both settings UI and UI showing users' profiles in increasing `order`. ")
  private Integer order;

 /**
  * The name of the custom profile field. 
  */
  @ApiModelProperty(value = "The name of the custom profile field. ")
  private String name;

 /**
  * The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
  */
  @ApiModelProperty(value = "The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. ")
  private String hint;

 /**
  * Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
  */
  @ApiModelProperty(value = "Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. ")
  private String fieldData;
 /**
  * The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. 
  * @return id
  */
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public CustomProfileField id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
  * @return type
  */
  @JsonProperty("type")
  public Integer getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public void setType(Integer type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public CustomProfileField type(Integer type) {
    this.type = type;
    return this;
  }

 /**
  * Custom profile fields are displayed in both settings UI and UI showing users&#39; profiles in increasing &#x60;order&#x60;. 
  * @return order
  */
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }

  /**
   * Sets the <code>order</code> property.
   */
  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   * Sets the <code>order</code> property.
   */
  public CustomProfileField order(Integer order) {
    this.order = order;
    return this;
  }

 /**
  * The name of the custom profile field. 
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public CustomProfileField name(String name) {
    this.name = name;
    return this;
  }

 /**
  * The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
  * @return hint
  */
  @JsonProperty("hint")
  public String getHint() {
    return hint;
  }

  /**
   * Sets the <code>hint</code> property.
   */
  public void setHint(String hint) {
    this.hint = hint;
  }

  /**
   * Sets the <code>hint</code> property.
   */
  public CustomProfileField hint(String hint) {
    this.hint = hint;
    return this;
  }

 /**
  * Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
  * @return fieldData
  */
  @JsonProperty("field_data")
  public String getFieldData() {
    return fieldData;
  }

  /**
   * Sets the <code>fieldData</code> property.
   */
  public void setFieldData(String fieldData) {
    this.fieldData = fieldData;
  }

  /**
   * Sets the <code>fieldData</code> property.
   */
  public CustomProfileField fieldData(String fieldData) {
    this.fieldData = fieldData;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomProfileField {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
    sb.append("    fieldData: ").append(toIndentedString(fieldData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

