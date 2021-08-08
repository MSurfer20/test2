package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Dictionary containing details of a single hotspot. 
 **/
@ApiModel(description="Dictionary containing details of a single hotspot. ")
public class Hotspot  {
  
  @ApiModelProperty(value = "The delay after which the user should be shown the hotspot. ")
 /**
   * The delay after which the user should be shown the hotspot. 
  **/
  private BigDecimal delay;

  @ApiModelProperty(value = "The name of the hotspot. ")
 /**
   * The name of the hotspot. 
  **/
  private String name;

  @ApiModelProperty(value = "The title of the hotspot, as will be displayed to the user. ")
 /**
   * The title of the hotspot, as will be displayed to the user. 
  **/
  private String title;

  @ApiModelProperty(value = "The description of the hotspot, as will be displayed to the user. ")
 /**
   * The description of the hotspot, as will be displayed to the user. 
  **/
  private String description;
 /**
   * The delay after which the user should be shown the hotspot. 
   * @return delay
  **/
  @JsonProperty("delay")
  public BigDecimal getDelay() {
    return delay;
  }

  public void setDelay(BigDecimal delay) {
    this.delay = delay;
  }

  public Hotspot delay(BigDecimal delay) {
    this.delay = delay;
    return this;
  }

 /**
   * The name of the hotspot. 
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Hotspot name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The title of the hotspot, as will be displayed to the user. 
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Hotspot title(String title) {
    this.title = title;
    return this;
  }

 /**
   * The description of the hotspot, as will be displayed to the user. 
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Hotspot description(String description) {
    this.description = description;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

