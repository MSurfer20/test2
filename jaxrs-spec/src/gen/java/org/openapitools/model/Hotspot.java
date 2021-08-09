package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Dictionary containing details of a single hotspot. 
 **/
@ApiModel(description = "Dictionary containing details of a single hotspot. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-09T21:34:15.269802Z[Etc/UTC]")public class Hotspot   {
  
  private @Valid BigDecimal delay;
  private @Valid String name;
  private @Valid String title;
  private @Valid String description;

  /**
   * The delay after which the user should be shown the hotspot. 
   **/
  public Hotspot delay(BigDecimal delay) {
    this.delay = delay;
    return this;
  }

  

  
  @ApiModelProperty(value = "The delay after which the user should be shown the hotspot. ")
  @JsonProperty("delay")
  public BigDecimal getDelay() {
    return delay;
  }

  public void setDelay(BigDecimal delay) {
    this.delay = delay;
  }

/**
   * The name of the hotspot. 
   **/
  public Hotspot name(String name) {
    this.name = name;
    return this;
  }

  

  
  @ApiModelProperty(value = "The name of the hotspot. ")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

/**
   * The title of the hotspot, as will be displayed to the user. 
   **/
  public Hotspot title(String title) {
    this.title = title;
    return this;
  }

  

  
  @ApiModelProperty(value = "The title of the hotspot, as will be displayed to the user. ")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

/**
   * The description of the hotspot, as will be displayed to the user. 
   **/
  public Hotspot description(String description) {
    this.description = description;
    return this;
  }

  

  
  @ApiModelProperty(value = "The description of the hotspot, as will be displayed to the user. ")
  @JsonProperty("description")
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

