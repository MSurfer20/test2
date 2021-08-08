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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.BasicStream;

/**
 * Dictionary containing details of a default stream group. 
 */
@ApiModel(description = "Dictionary containing details of a default stream group. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-08T20:39:18.495644Z[Etc/UTC]")
public class DefaultStreamGroup {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_STREAMS = "streams";
  @SerializedName(SERIALIZED_NAME_STREAMS)
  private List<BasicStream> streams = null;


  public DefaultStreamGroup name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the default stream group. 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the default stream group. ")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the default stream group. ")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "id of the default stream group. ")

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
    if (this.streams == null) {
      this.streams = new ArrayList<BasicStream>();
    }
    this.streams.add(streamsItem);
    return this;
  }

   /**
   * Array containing details about the streams in the default stream group. 
   * @return streams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array containing details about the streams in the default stream group. ")

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
    return Objects.equals(this.name, defaultStreamGroup.name) &&
        Objects.equals(this.description, defaultStreamGroup.description) &&
        Objects.equals(this.id, defaultStreamGroup.id) &&
        Objects.equals(this.streams, defaultStreamGroup.streams);
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
