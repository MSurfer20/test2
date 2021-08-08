package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AttachmentsMessages;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Dictionary containing details of a file uploaded by a user. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2021-08-08T20:40:09.617193Z[Etc/UTC]")
public class Attachments   {
  

  private Integer id;

  private String name;

  private String pathId;

  private Integer size;

  private Integer createTime;

  private List<AttachmentsMessages> messages = new ArrayList<AttachmentsMessages>();

  /**
   * The unique ID for the attachment. 
   **/
  
  @ApiModelProperty(value = "The unique ID for the attachment. ")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Name of the uploaded file. 
   **/
  
  @ApiModelProperty(value = "Name of the uploaded file. ")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A representation of the path of the file within the repository of user-uploaded files.  If the &#x60;path_id&#x60; of a file is &#x60;{realm_id}/ab/cdef/temp_file.py&#x60;, its URL will be: &#x60;{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py&#x60;. 
   **/
  
  @ApiModelProperty(value = "A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`. ")
  @JsonProperty("path_id")
  public String getPathId() {
    return pathId;
  }
  public void setPathId(String pathId) {
    this.pathId = pathId;
  }

  /**
   * Size of the file in bytes. 
   **/
  
  @ApiModelProperty(value = "Size of the file in bytes. ")
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  /**
   * Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. 
   **/
  
  @ApiModelProperty(value = "Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. ")
  @JsonProperty("create_time")
  public Integer getCreateTime() {
    return createTime;
  }
  public void setCreateTime(Integer createTime) {
    this.createTime = createTime;
  }

  /**
   * Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 
   **/
  
  @ApiModelProperty(value = "Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. ")
  @JsonProperty("messages")
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
    return Objects.equals(id, attachments.id) &&
        Objects.equals(name, attachments.name) &&
        Objects.equals(pathId, attachments.pathId) &&
        Objects.equals(size, attachments.size) &&
        Objects.equals(createTime, attachments.createTime) &&
        Objects.equals(messages, attachments.messages);
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

