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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AttachmentsMessages;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Dictionary containing details of a file uploaded by a user. 
 */
@ApiModel(description = "Dictionary containing details of a file uploaded by a user. ")
@JsonPropertyOrder({
  Attachments.JSON_PROPERTY_ID,
  Attachments.JSON_PROPERTY_NAME,
  Attachments.JSON_PROPERTY_PATH_ID,
  Attachments.JSON_PROPERTY_SIZE,
  Attachments.JSON_PROPERTY_CREATE_TIME,
  Attachments.JSON_PROPERTY_MESSAGES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen")
public class Attachments   {
  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private Integer id;

  public static final String JSON_PROPERTY_NAME = "name";
  @JsonProperty(JSON_PROPERTY_NAME)
  private String name;

  public static final String JSON_PROPERTY_PATH_ID = "path_id";
  @JsonProperty(JSON_PROPERTY_PATH_ID)
  private String pathId;

  public static final String JSON_PROPERTY_SIZE = "size";
  @JsonProperty(JSON_PROPERTY_SIZE)
  private Integer size;

  public static final String JSON_PROPERTY_CREATE_TIME = "create_time";
  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  private Integer createTime;

  public static final String JSON_PROPERTY_MESSAGES = "messages";
  @JsonProperty(JSON_PROPERTY_MESSAGES)
  private List<AttachmentsMessages> messages = null;

  public Attachments id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The unique ID for the attachment. 
   * @return id
   **/
  @JsonProperty(value = "id")
  @ApiModelProperty(value = "The unique ID for the attachment. ")
  
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Attachments name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the uploaded file. 
   * @return name
   **/
  @JsonProperty(value = "name")
  @ApiModelProperty(value = "Name of the uploaded file. ")
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Attachments pathId(String pathId) {
    this.pathId = pathId;
    return this;
  }

  /**
   * A representation of the path of the file within the repository of user-uploaded files.  If the &#x60;path_id&#x60; of a file is &#x60;{realm_id}/ab/cdef/temp_file.py&#x60;, its URL will be: &#x60;{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py&#x60;. 
   * @return pathId
   **/
  @JsonProperty(value = "path_id")
  @ApiModelProperty(value = "A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`. ")
  
  public String getPathId() {
    return pathId;
  }

  public void setPathId(String pathId) {
    this.pathId = pathId;
  }

  public Attachments size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Size of the file in bytes. 
   * @return size
   **/
  @JsonProperty(value = "size")
  @ApiModelProperty(value = "Size of the file in bytes. ")
  
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public Attachments createTime(Integer createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. 
   * @return createTime
   **/
  @JsonProperty(value = "create_time")
  @ApiModelProperty(value = "Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. ")
  
  public Integer getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Integer createTime) {
    this.createTime = createTime;
  }

  public Attachments messages(List<AttachmentsMessages> messages) {
    this.messages = messages;
    return this;
  }

  public Attachments addMessagesItem(AttachmentsMessages messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<AttachmentsMessages>();
    }
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 
   * @return messages
   **/
  @JsonProperty(value = "messages")
  @ApiModelProperty(value = "Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. ")
  @Valid 
  public List<AttachmentsMessages> getMessages() {
    return messages;
  }

  public void setMessages(List<AttachmentsMessages> messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachments attachments = (Attachments) o;
    return Objects.equals(this.id, attachments.id) &&
        Objects.equals(this.name, attachments.name) &&
        Objects.equals(this.pathId, attachments.pathId) &&
        Objects.equals(this.size, attachments.size) &&
        Objects.equals(this.createTime, attachments.createTime) &&
        Objects.equals(this.messages, attachments.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, pathId, size, createTime, messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachments {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pathId: ").append(toIndentedString(pathId)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

