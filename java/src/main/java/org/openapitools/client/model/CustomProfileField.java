/*
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
 * Dictionary containing the details of a custom profile field configured for this organization. 
 */
@ApiModel(description = "Dictionary containing the details of a custom profile field configured for this organization. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-08T20:41:30.598125Z[Etc/UTC]")
public class CustomProfileField {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Integer type;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_HINT = "hint";
  @SerializedName(SERIALIZED_NAME_HINT)
  private String hint;

  public static final String SERIALIZED_NAME_FIELD_DATA = "field_data";
  @SerializedName(SERIALIZED_NAME_FIELD_DATA)
  private String fieldData;


  public CustomProfileField id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. 
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. ")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public CustomProfileField type(Integer type) {
    
    this.type = type;
    return this;
  }

   /**
   * An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account ")

  public Integer getType() {
    return type;
  }


  public void setType(Integer type) {
    this.type = type;
  }


  public CustomProfileField order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * Custom profile fields are displayed in both settings UI and UI showing users&#39; profiles in increasing &#x60;order&#x60;. 
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom profile fields are displayed in both settings UI and UI showing users' profiles in increasing `order`. ")

  public Integer getOrder() {
    return order;
  }


  public void setOrder(Integer order) {
    this.order = order;
  }


  public CustomProfileField name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the custom profile field. 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the custom profile field. ")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CustomProfileField hint(String hint) {
    
    this.hint = hint;
    return this;
  }

   /**
   * The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
   * @return hint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. ")

  public String getHint() {
    return hint;
  }


  public void setHint(String hint) {
    this.hint = hint;
  }


  public CustomProfileField fieldData(String fieldData) {
    
    this.fieldData = fieldData;
    return this;
  }

   /**
   * Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
   * @return fieldData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. ")

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

