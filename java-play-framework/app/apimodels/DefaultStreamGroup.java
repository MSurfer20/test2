package apimodels;

import apimodels.BasicStream;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Dictionary containing details of a default stream group. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-09T21:33:34.002001Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DefaultStreamGroup   {
  @JsonProperty("name")
  
  private String name;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("id")
  
  private Integer id;

  @JsonProperty("streams")
  @Valid

  private List<BasicStream> streams = null;

  public DefaultStreamGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the default stream group. 
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DefaultStreamGroup description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the default stream group. 
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DefaultStreamGroup id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * id of the default stream group. 
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public DefaultStreamGroup streams(List<BasicStream> streams) {
    this.streams = streams;
    return this;
  }

  public DefaultStreamGroup addStreamsItem(BasicStream streamsItem) {
    if (streams == null) {
      streams = new ArrayList<>();
    }
    streams.add(streamsItem);
    return this;
  }

   /**
   * Array containing details about the streams in the default stream group. 
   * @return streams
  **/
  public List<BasicStream> getStreams() {
    return streams;
  }

  public void setStreams(List<BasicStream> streams) {
    this.streams = streams;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultStreamGroup defaultStreamGroup = (DefaultStreamGroup) o;
    return Objects.equals(name, defaultStreamGroup.name) &&
        Objects.equals(description, defaultStreamGroup.description) &&
        Objects.equals(id, defaultStreamGroup.id) &&
        Objects.equals(streams, defaultStreamGroup.streams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, id, streams);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultStreamGroup {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    streams: ").append(toIndentedString(streams)).append("\n");
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

