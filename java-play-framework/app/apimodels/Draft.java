package apimodels;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * A dictionary for representing a message draft. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-08T21:19:33.131185Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Draft   {
  @JsonProperty("id")
  
  private Integer id;

  /**
   * The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
   */
  public enum TypeEnum {
    EMPTY(""),
    
    STREAM("stream"),
    
    PRIVATE("private");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
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

  @JsonProperty("type")
  @NotNull

  private TypeEnum type;

  @JsonProperty("to")
  @NotNull

  private List<Integer> to = new ArrayList<>();

  @JsonProperty("topic")
  @NotNull

  private String topic;

  @JsonProperty("content")
  @NotNull

  private String content;

  @JsonProperty("timestamp")
  @Valid

  private BigDecimal timestamp;

  public Draft id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. 
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Draft type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Draft to(List<Integer> to) {
    this.to = to;
    return this;
  }

  public Draft addToItem(Integer toItem) {
    to.add(toItem);
    return this;
  }

   /**
   * An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. 
   * @return to
  **/
  public List<Integer> getTo() {
    return to;
  }

  public void setTo(List<Integer> to) {
    this.to = to;
  }

  public Draft topic(String topic) {
    this.topic = topic;
    return this;
  }

   /**
   * For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. 
   * @return topic
  **/
  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public Draft content(String content) {
    this.content = content;
    return this;
  }

   /**
   * The body of the draft. Should not contain null bytes. 
   * @return content
  **/
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Draft timestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. 
   * @return timestamp
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

