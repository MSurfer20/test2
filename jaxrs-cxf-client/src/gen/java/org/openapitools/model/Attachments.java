package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AttachmentsMessages;

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
  * Dictionary containing details of a file uploaded by a user. 
 **/
@ApiModel(description="Dictionary containing details of a file uploaded by a user. ")
public class Attachments  {
  
  @ApiModelProperty(value = "The unique ID for the attachment. ")
 /**
   * The unique ID for the attachment. 
  **/
  private Integer id;

  @ApiModelProperty(value = "Name of the uploaded file. ")
 /**
   * Name of the uploaded file. 
  **/
  private String name;

  @ApiModelProperty(value = "A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`. ")
 /**
   * A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`. 
  **/
  private String pathId;

  @ApiModelProperty(value = "Size of the file in bytes. ")
 /**
   * Size of the file in bytes. 
  **/
  private Integer size;

  @ApiModelProperty(value = "Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. ")
 /**
   * Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. 
  **/
  private Integer createTime;

  @ApiModelProperty(value = "Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. ")
 /**
   * Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 
  **/
  private List<AttachmentsMessages> messages = null;
 /**
   * The unique ID for the attachment. 
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Attachments id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Name of the uploaded file. 
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Attachments name(String name) {
    this.name = name;
    return this;
  }

 /**
   * A representation of the path of the file within the repository of user-uploaded files.  If the &#x60;path_id&#x60; of a file is &#x60;{realm_id}/ab/cdef/temp_file.py&#x60;, its URL will be: &#x60;{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py&#x60;. 
   * @return pathId
  **/
  @JsonProperty("path_id")
  public String getPathId() {
    return pathId;
  }

  public void setPathId(String pathId) {
    this.pathId = pathId;
  }

  public Attachments pathId(String pathId) {
    this.pathId = pathId;
    return this;
  }

 /**
   * Size of the file in bytes. 
   * @return size
  **/
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public Attachments size(Integer size) {
    this.size = size;
    return this;
  }

 /**
   * Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. 
   * @return createTime
  **/
  @JsonProperty("create_time")
  public Integer getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Integer createTime) {
    this.createTime = createTime;
  }

  public Attachments createTime(Integer createTime) {
    this.createTime = createTime;
    return this;
  }

 /**
   * Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 
   * @return messages
  **/
  @JsonProperty("messages")
  public List<AttachmentsMessages> getMessages() {
    return messages;
  }

  public void setMessages(List<AttachmentsMessages> messages) {
    this.messages = messages;
  }

  public Attachments messages(List<AttachmentsMessages> messages) {
    this.messages = messages;
    return this;
  }

  public Attachments addMessagesItem(AttachmentsMessages messagesItem) {
    this.messages.add(messagesItem);
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

