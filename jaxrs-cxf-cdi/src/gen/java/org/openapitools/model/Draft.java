package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * A dictionary for representing a message draft. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "A dictionary for representing a message draft. ")
public class Draft   {
  
  private Integer id;


@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

    @XmlEnumValue("") EMPTY(String.valueOf("")), @XmlEnumValue("stream") STREAM(String.valueOf("stream")), @XmlEnumValue("private") PRIVATE(String.valueOf("private"));


    private String value;

    TypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private TypeEnum type;

  private List<Integer> to = new ArrayList<Integer>();

  private String topic;

  private String content;

  private BigDecimal timestamp;


  /**
   * The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. 
   **/
  public Draft id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. ")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  /**
   * The type of the draft. Either unaddressed (empty string), \&quot;stream\&quot;, or \&quot;private\&quot; (for PMs and private group messages). 
   **/
  public Draft type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). ")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * An array of the tentative target audience IDs. For \&quot;stream\&quot; messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. 
   **/
  public Draft to(List<Integer> to) {
    this.to = to;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. ")
  @JsonProperty("to")
  @NotNull
  public List<Integer> getTo() {
    return to;
  }
  public void setTo(List<Integer> to) {
    this.to = to;
  }

  public Draft addToItem(Integer toItem) {
    this.to.add(toItem);
    return this;
  }


  /**
   * For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. 
   **/
  public Draft topic(String topic) {
    this.topic = topic;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. ")
  @JsonProperty("topic")
  @NotNull
  public String getTopic() {
    return topic;
  }
  public void setTopic(String topic) {
    this.topic = topic;
  }


  /**
   * The body of the draft. Should not contain null bytes. 
   **/
  public Draft content(String content) {
    this.content = content;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The body of the draft. Should not contain null bytes. ")
  @JsonProperty("content")
  @NotNull
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }


  /**
   * A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. 
   **/
  public Draft timestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  
  @ApiModelProperty(example = "1595479019", value = "A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. ")
  @JsonProperty("timestamp")
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
    return Objects.equals(id, draft.id) &&
        Objects.equals(type, draft.type) &&
        Objects.equals(to, draft.to) &&
        Objects.equals(topic, draft.topic) &&
        Objects.equals(content, draft.content) &&
        Objects.equals(timestamp, draft.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, to, topic, content, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Draft {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

