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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Dictionary containing details of a single hotspot. 
 */
@ApiModel(description = "Dictionary containing details of a single hotspot. ")
@JsonPropertyOrder({
  Hotspot.JSON_PROPERTY_DELAY,
  Hotspot.JSON_PROPERTY_NAME,
  Hotspot.JSON_PROPERTY_TITLE,
  Hotspot.JSON_PROPERTY_DESCRIPTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T21:20:01.120158Z[Etc/UTC]")
public class Hotspot   {
  public static final String JSON_PROPERTY_DELAY = "delay";
  @JsonProperty(JSON_PROPERTY_DELAY)
  private BigDecimal delay;

  public static final String JSON_PROPERTY_NAME = "name";
  @JsonProperty(JSON_PROPERTY_NAME)
  private String name;

  public static final String JSON_PROPERTY_TITLE = "title";
  @JsonProperty(JSON_PROPERTY_TITLE)
  private String title;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  private String description;

  public Hotspot delay(BigDecimal delay) {
    this.delay = delay;
    return this;
  }

  /**
   * The delay after which the user should be shown the hotspot. 
   * @return delay
   **/
  @JsonProperty(value = "delay")
  @ApiModelProperty(value = "The delay after which the user should be shown the hotspot. ")
  @Valid 
  public BigDecimal getDelay() {
    return delay;
  }

  public void setDelay(BigDecimal delay) {
    this.delay = delay;
  }

  public Hotspot name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the hotspot. 
   * @return name
   **/
  @JsonProperty(value = "name")
  @ApiModelProperty(value = "The name of the hotspot. ")
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Hotspot title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the hotspot, as will be displayed to the user. 
   * @return title
   **/
  @JsonProperty(value = "title")
  @ApiModelProperty(value = "The title of the hotspot, as will be displayed to the user. ")
  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Hotspot description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the hotspot, as will be displayed to the user. 
   * @return description
   **/
  @JsonProperty(value = "description")
  @ApiModelProperty(value = "The description of the hotspot, as will be displayed to the user. ")
  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hotspot hotspot = (Hotspot) o;
    return Objects.equals(this.delay, hotspot.delay) &&
        Objects.equals(this.name, hotspot.name) &&
        Objects.equals(this.title, hotspot.title) &&
        Objects.equals(this.description, hotspot.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delay, name, title, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hotspot {\n");
    
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

