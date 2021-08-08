package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Dictionary containing the details of a custom profile field configured for this organization. 
 **/
@ApiModel(description = "Dictionary containing the details of a custom profile field configured for this organization. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-08T21:12:25.585041Z[Etc/UTC]")public class CustomProfileField   {
  
  private @Valid Integer id;
  private @Valid Integer type;
  private @Valid Integer order;
  private @Valid String name;
  private @Valid String hint;
  private @Valid String fieldData;

  /**
   * The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. 
   **/
  public CustomProfileField id(Integer id) {
    this.id = id;
    return this;
  }

  

  
  @ApiModelProperty(value = "The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. ")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

/**
   * An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
   **/
  public CustomProfileField type(Integer type) {
    this.type = type;
    return this;
  }

  

  
  @ApiModelProperty(value = "An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account ")
  @JsonProperty("type")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

/**
   * Custom profile fields are displayed in both settings UI and UI showing users&#39; profiles in increasing &#x60;order&#x60;. 
   **/
  public CustomProfileField order(Integer order) {
    this.order = order;
    return this;
  }

  

  
  @ApiModelProperty(value = "Custom profile fields are displayed in both settings UI and UI showing users' profiles in increasing `order`. ")
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

/**
   * The name of the custom profile field. 
   **/
  public CustomProfileField name(String name) {
    this.name = name;
    return this;
  }

  

  
  @ApiModelProperty(value = "The name of the custom profile field. ")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

/**
   * The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
   **/
  public CustomProfileField hint(String hint) {
    this.hint = hint;
    return this;
  }

  

  
  @ApiModelProperty(value = "The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. ")
  @JsonProperty("hint")
  public String getHint() {
    return hint;
  }

  public void setHint(String hint) {
    this.hint = hint;
  }

/**
   * Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
   **/
  public CustomProfileField fieldData(String fieldData) {
    this.fieldData = fieldData;
    return this;
  }

  

  
  @ApiModelProperty(value = "Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. ")
  @JsonProperty("field_data")
  public String getFieldData() {
    return fieldData;
  }

  public void setFieldData(String fieldData) {
    this.fieldData = fieldData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomProfileField customProfileField = (CustomProfileField) o;
    return Objects.equals(this.id, customProfileField.id) &&
        Objects.equals(this.type, customProfileField.type) &&
        Objects.equals(this.order, customProfileField.order) &&
        Objects.equals(this.name, customProfileField.name) &&
        Objects.equals(this.hint, customProfileField.hint) &&
        Objects.equals(this.fieldData, customProfileField.fieldData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, order, name, hint, fieldData);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

