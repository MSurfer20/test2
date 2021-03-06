/**
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

import java.math.BigDecimal;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A dictionary for representing a message draft. 
 **/
@ApiModel(description = "A dictionary for representing a message draft. ")
public class Draft {
  
  @SerializedName("id")
  private Integer id = null;
  public enum TypeEnum {
     ,  stream,  private, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("to")
  private List<Integer> to = null;
  @SerializedName("topic")
  private String topic = null;
  @SerializedName("content")
  private String content = null;
  @SerializedName("timestamp")
  private BigDecimal timestamp = null;

  /**
   * The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. 
   **/
  @ApiModelProperty(value = "The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. ")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
   **/
  @ApiModelProperty(required = true, value = "The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). ")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. 
   **/
  @ApiModelProperty(required = true, value = "An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. ")
  public List<Integer> getTo() {
    return to;
  }
  public void setTo(List<Integer> to) {
    this.to = to;
  }

  /**
   * For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. 
   **/
  @ApiModelProperty(required = true, value = "For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. ")
  public String getTopic() {
    return topic;
  }
  public void setTopic(String topic) {
    this.topic = topic;
  }

  /**
   * The body of the draft. Should not contain null bytes. 
   **/
  @ApiModelProperty(required = true, value = "The body of the draft. Should not contain null bytes. ")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  /**
   * A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. 
   **/
  @ApiModelProperty(value = "A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. ")
  public BigDecimal getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Draft draft = (Draft) o;
    return (this.id == null ? draft.id == null : this.id.equals(draft.id)) &&
        (this.type == null ? draft.type == null : this.type.equals(draft.type)) &&
        (this.to == null ? draft.to == null : this.to.equals(draft.to)) &&
        (this.topic == null ? draft.topic == null : this.topic.equals(draft.topic)) &&
        (this.content == null ? draft.content == null : this.content.equals(draft.content)) &&
        (this.timestamp == null ? draft.timestamp == null : this.timestamp.equals(draft.timestamp));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.to == null ? 0: this.to.hashCode());
    result = 31 * result + (this.topic == null ? 0: this.topic.hashCode());
    result = 31 * result + (this.content == null ? 0: this.content.hashCode());
    result = 31 * result + (this.timestamp == null ? 0: this.timestamp.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Draft {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  to: ").append(to).append("\n");
    sb.append("  topic: ").append(topic).append("\n");
    sb.append("  content: ").append(content).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
