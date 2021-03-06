/**
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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Dictionary containing the details of a custom profile field configured for this organization. 
 **/
@ApiModel(description = "Dictionary containing the details of a custom profile field configured for this organization. ")
public class CustomProfileField {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("type")
  private Integer type = null;
  @SerializedName("order")
  private Integer order = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("hint")
  private String hint = null;
  @SerializedName("field_data")
  private String fieldData = null;

  /**
   * The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. 
   **/
  @ApiModelProperty(value = "The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. ")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
   **/
  @ApiModelProperty(value = "An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account ")
  public Integer getType() {
    return type;
  }
  public void setType(Integer type) {
    this.type = type;
  }

  /**
   * Custom profile fields are displayed in both settings UI and UI showing users' profiles in increasing `order`. 
   **/
  @ApiModelProperty(value = "Custom profile fields are displayed in both settings UI and UI showing users' profiles in increasing `order`. ")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   * The name of the custom profile field. 
   **/
  @ApiModelProperty(value = "The name of the custom profile field. ")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
   **/
  @ApiModelProperty(value = "The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. ")
  public String getHint() {
    return hint;
  }
  public void setHint(String hint) {
    this.hint = hint;
  }

  /**
   * Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
   **/
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
    return (this.id == null ? customProfileField.id == null : this.id.equals(customProfileField.id)) &&
        (this.type == null ? customProfileField.type == null : this.type.equals(customProfileField.type)) &&
        (this.order == null ? customProfileField.order == null : this.order.equals(customProfileField.order)) &&
        (this.name == null ? customProfileField.name == null : this.name.equals(customProfileField.name)) &&
        (this.hint == null ? customProfileField.hint == null : this.hint.equals(customProfileField.hint)) &&
        (this.fieldData == null ? customProfileField.fieldData == null : this.fieldData.equals(customProfileField.fieldData));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.order == null ? 0: this.order.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.hint == null ? 0: this.hint.hashCode());
    result = 31 * result + (this.fieldData == null ? 0: this.fieldData.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomProfileField {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  order: ").append(order).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  hint: ").append(hint).append("\n");
    sb.append("  fieldData: ").append(fieldData).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
