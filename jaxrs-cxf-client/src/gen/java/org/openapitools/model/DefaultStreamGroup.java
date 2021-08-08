package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BasicStream;

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
  * Dictionary containing details of a default stream group. 
 **/
@ApiModel(description="Dictionary containing details of a default stream group. ")
public class DefaultStreamGroup  {
  
  @ApiModelProperty(value = "Name of the default stream group. ")
 /**
   * Name of the default stream group. 
  **/
  private String name;

  @ApiModelProperty(value = "Description of the default stream group. ")
 /**
   * Description of the default stream group. 
  **/
  private String description;

  @ApiModelProperty(value = "id of the default stream group. ")
 /**
   * id of the default stream group. 
  **/
  private Integer id;

  @ApiModelProperty(value = "Array containing details about the streams in the default stream group. ")
 /**
   * Array containing details about the streams in the default stream group. 
  **/
  private List<BasicStream> streams = null;
 /**
   * Name of the default stream group. 
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DefaultStreamGroup name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Description of the default stream group. 
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DefaultStreamGroup description(String description) {
    this.description = description;
    return this;
  }

 /**
   * id of the default stream group. 
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public DefaultStreamGroup id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Array containing details about the streams in the default stream group. 
   * @return streams
  **/
  @JsonProperty("streams")
  public List<BasicStream> getStreams() {
    return streams;
  }

  public void setStreams(List<BasicStream> streams) {
    this.streams = streams;
  }

  public DefaultStreamGroup streams(List<BasicStream> streams) {
    this.streams = streams;
    return this;
  }

  public DefaultStreamGroup addStreamsItem(BasicStream streamsItem) {
    this.streams.add(streamsItem);
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

