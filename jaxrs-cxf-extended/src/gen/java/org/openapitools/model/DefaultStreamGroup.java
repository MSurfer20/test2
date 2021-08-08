package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BasicStream;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Dictionary containing details of a default stream group. 
 */
@ApiModel(description="Dictionary containing details of a default stream group. ")

public class DefaultStreamGroup  {
  
 /**
  * Name of the default stream group. 
  */
  @ApiModelProperty(value = "Name of the default stream group. ")
  private String name;

 /**
  * Description of the default stream group. 
  */
  @ApiModelProperty(value = "Description of the default stream group. ")
  private String description;

 /**
  * id of the default stream group. 
  */
  @ApiModelProperty(value = "id of the default stream group. ")
  private Integer id;

 /**
  * Array containing details about the streams in the default stream group. 
  */
  @ApiModelProperty(value = "Array containing details about the streams in the default stream group. ")
  @Valid
  private List<BasicStream> streams = null;
 /**
  * Name of the default stream group. 
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public DefaultStreamGroup name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Description of the default stream group. 
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public DefaultStreamGroup description(String description) {
    this.description = description;
    return this;
  }

 /**
  * id of the default stream group. 
  * @return id
  */
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public DefaultStreamGroup id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * Array containing details about the streams in the default stream group. 
  * @return streams
  */
  @JsonProperty("streams")
  public List<BasicStream> getStreams() {
    return streams;
  }

  /**
   * Sets the <code>streams</code> property.
   */
  public void setStreams(List<BasicStream> streams) {
    this.streams = streams;
  }

  /**
   * Sets the <code>streams</code> property.
   */
  public DefaultStreamGroup streams(List<BasicStream> streams) {
    this.streams = streams;
    return this;
  }

  /**
   * Adds a new item to the <code>streams</code> list.
   */
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

