package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.vertxweb.server.model.AttachmentsMessages;

/**
 * Dictionary containing details of a file uploaded by a user. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Attachments   {
  
  private Integer id;
  private String name;
  private String pathId;
  private Integer size;
  private Integer createTime;
  private List<AttachmentsMessages> messages = new ArrayList<>();

  public Attachments () {

  }

  public Attachments (Integer id, String name, String pathId, Integer size, Integer createTime, List<AttachmentsMessages> messages) {
    this.id = id;
    this.name = name;
    this.pathId = pathId;
    this.size = size;
    this.createTime = createTime;
    this.messages = messages;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("path_id")
  public String getPathId() {
    return pathId;
  }
  public void setPathId(String pathId) {
    this.pathId = pathId;
  }

    
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

    
  @JsonProperty("create_time")
  public Integer getCreateTime() {
    return createTime;
  }
  public void setCreateTime(Integer createTime) {
    this.createTime = createTime;
  }

    
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
