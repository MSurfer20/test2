package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/**
 * Dictionary containing details of a single hotspot. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Hotspot   {
  
  private BigDecimal delay;
  private String name;
  private String title;
  private String description;

  public Hotspot () {

  }

  public Hotspot (BigDecimal delay, String name, String title, String description) {
    this.delay = delay;
    this.name = name;
    this.title = title;
    this.description = description;
  }

    
  @JsonProperty("delay")
  public BigDecimal getDelay() {
    return delay;
  }
  public void setDelay(BigDecimal delay) {
    this.delay = delay;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

    
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
    return Objects.equals(delay, hotspot.delay) &&
        Objects.equals(name, hotspot.name) &&
        Objects.equals(title, hotspot.title) &&
        Objects.equals(description, hotspot.description);
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
