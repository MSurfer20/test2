package apimodels;

import apimodels.AttachmentsMessages;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Dictionary containing details of a file uploaded by a user. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-08T20:41:53.018098Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Attachments   {
  @JsonProperty("id")
  
  private Integer id;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("path_id")
  
  private String pathId;

  @JsonProperty("size")
  
  private Integer size;

  @JsonProperty("create_time")
  
  private Integer createTime;

  @JsonProperty("messages")
  @Valid

  private List<AttachmentsMessages> messages = null;

  public Attachments id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ID for the attachment. 
   * @return id
  **/
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
   * A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`. 
   * @return pathId
  **/
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
    if (messages == null) {
      messages = new ArrayList<>();
    }
    messages.add(messagesItem);
    return this;
  }

   /**
   * Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 
   * @return messages
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

