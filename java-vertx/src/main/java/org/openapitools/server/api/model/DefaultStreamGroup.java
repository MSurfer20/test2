package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.BasicStream;

/**
 * Dictionary containing details of a default stream group. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DefaultStreamGroup   {
  
  private String name;
  private String description;
  private Integer id;
  private List<BasicStream> streams = new ArrayList<>();

  public DefaultStreamGroup () {

  }

  public DefaultStreamGroup (String name, String description, Integer id, List<BasicStream> streams) {
    this.name = name;
    this.description = description;
    this.id = id;
    this.streams = streams;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("streams")
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
