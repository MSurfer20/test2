package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * A dictionary for representing a message draft. 
 **/
@ApiModel(description="A dictionary for representing a message draft. ")
public class Draft  {
  
  @ApiModelProperty(value = "The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. ")
 /**
   * The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. 
  **/
  private Integer id;

@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

@XmlEnumValue("") EMPTY(String.valueOf("")), @XmlEnumValue("stream") STREAM(String.valueOf("stream")), @XmlEnumValue("private") PRIVATE(String.valueOf("private"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). ")
 /**
   * The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
  **/
  private TypeEnum type;

  @ApiModelProperty(required = true, value = "An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. ")
 /**
   * An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. 
  **/
  private List<Integer> to = new ArrayList<Integer>();

  @ApiModelProperty(required = true, value = "For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. ")
 /**
   * For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. 
  **/
  private String topic;

  @ApiModelProperty(required = true, value = "The body of the draft. Should not contain null bytes. ")
 /**
   * The body of the draft. Should not contain null bytes. 
  **/
  private String content;

  @ApiModelProperty(example = "1595479019", value = "A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. ")
  @Valid
 /**
   * A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. 
  **/
  private BigDecimal timestamp;
 /**
   * The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. 
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Draft id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * The type of the draft. Either unaddressed (empty string), \&quot;stream\&quot;, or \&quot;private\&quot; (for PMs and private group messages). 
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Draft type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * An array of the tentative target audience IDs. For \&quot;stream\&quot; messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. 
   * @return to
  **/
  @JsonProperty("to")
  @NotNull
  public List<Integer> getTo() {
    return to;
  }

  public void setTo(List<Integer> to) {
    this.to = to;
  }

  public Draft to(List<Integer> to) {
    this.to = to;
    return this;
  }

  public Draft addToItem(Integer toItem) {
    this.to.add(toItem);
    return this;
  }

 /**
   * For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. 
   * @return topic
  **/
  @JsonProperty("topic")
  @NotNull
  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public Draft topic(String topic) {
    this.topic = topic;
    return this;
  }

 /**
   * The body of the draft. Should not contain null bytes. 
   * @return content
  **/
  @JsonProperty("content")
  @NotNull
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Draft content(String content) {
    this.content = content;
    return this;
  }

 /**
   * A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. 
   * @return timestamp
  **/
  @JsonProperty("timestamp")
  public BigDecimal getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
  }

  public Draft timestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

