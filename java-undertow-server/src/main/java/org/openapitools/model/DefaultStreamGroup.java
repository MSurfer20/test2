/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * OpenAPI document version: 1.0.0
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BasicStream;



/**
 * Dictionary containing details of a default stream group. 
 */

@ApiModel(description = "Dictionary containing details of a default stream group. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2021-08-08T21:19:37.133192Z[Etc/UTC]")
public class DefaultStreamGroup   {
  
  private String name;
  private String description;
  private Integer id;
  private List<BasicStream> streams = new ArrayList<BasicStream>();

  /**
   * Name of the default stream group. 
   */
  public DefaultStreamGroup name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the default stream group. ")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Description of the default stream group. 
   */
  public DefaultStreamGroup description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Description of the default stream group. ")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * id of the default stream group. 
   */
  public DefaultStreamGroup id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "id of the default stream group. ")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Array containing details about the streams in the default stream group. 
   */
  public DefaultStreamGroup streams(List<BasicStream> streams) {
    this.streams = streams;
    return this;
  }

  
  @ApiModelProperty(value = "Array containing details about the streams in the default stream group. ")
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

