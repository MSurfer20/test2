package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Dictionary containing the details of a custom profile field configured for this organization. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomProfileField   {
  
  private Integer id;
  private Integer type;
  private Integer order;
  private String name;
  private String hint;
  private String fieldData;

  public CustomProfileField () {

  }

  public CustomProfileField (Integer id, Integer type, Integer order, String name, String hint, String fieldData) {
    this.id = id;
    this.type = type;
    this.order = order;
    this.name = name;
    this.hint = hint;
    this.fieldData = fieldData;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("type")
  public Integer getType() {
    return type;
  }
  public void setType(Integer type) {
    this.type = type;
  }

    
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("hint")
  public String getHint() {
    return hint;
  }
  public void setHint(String hint) {
    this.hint = hint;
  }

    
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
    return Objects.equals(id, customProfileField.id) &&
        Objects.equals(type, customProfileField.type) &&
        Objects.equals(order, customProfileField.order) &&
        Objects.equals(name, customProfileField.name) &&
        Objects.equals(hint, customProfileField.hint) &&
        Objects.equals(fieldData, customProfileField.fieldData);
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
