package apimodels;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Dictionary containing details of a single hotspot. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-09T21:33:34.002001Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Hotspot   {
  @JsonProperty("delay")
  @Valid

  private BigDecimal delay;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("description")
  
  private String description;

  public Hotspot delay(BigDecimal delay) {
    this.delay = delay;
    return this;
  }

   /**
   * The delay after which the user should be shown the hotspot. 
   * @return delay
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

