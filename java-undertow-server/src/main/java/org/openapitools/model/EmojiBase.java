/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * OpenAPI document version: 1.0.0
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2021-08-09T21:33:38.242195Z[Etc/UTC]")
public class EmojiBase   {
  
  private String emojiCode;
  private String emojiName;
  private String reactionType;

  /**
   * A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
   */
  public EmojiBase emojiCode(String emojiCode) {
    this.emojiCode = emojiCode;
    return this;
  }

  
  @ApiModelProperty(value = "A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. ")
  @JsonProperty("emoji_code")
  public String getEmojiCode() {
    return emojiCode;
  }
  public void setEmojiCode(String emojiCode) {
    this.emojiCode = emojiCode;
  }

  /**
   * Name of the emoji. 
   */
  public EmojiBase emojiName(String emojiName) {
    this.emojiName = emojiName;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the emoji. ")
  @JsonProperty("emoji_name")
  public String getEmojiName() {
    return emojiName;
  }
  public void setEmojiName(String emojiName) {
    this.emojiName = emojiName;
  }

  /**
   * One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
   */
  public EmojiBase reactionType(String reactionType) {
    this.reactionType = reactionType;
    return this;
  }

  
  @ApiModelProperty(value = "One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. ")
  @JsonProperty("reaction_type")
  public String getReactionType() {
    return reactionType;
  }
  public void setReactionType(String reactionType) {
    this.reactionType = reactionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmojiBase emojiBase = (EmojiBase) o;
    return Objects.equals(emojiCode, emojiBase.emojiCode) &&
        Objects.equals(emojiName, emojiBase.emojiName) &&
        Objects.equals(reactionType, emojiBase.reactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emojiCode, emojiName, reactionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmojiBase {\n");
    
    sb.append("    emojiCode: ").append(toIndentedString(emojiCode)).append("\n");
    sb.append("    emojiName: ").append(toIndentedString(emojiName)).append("\n");
    sb.append("    reactionType: ").append(toIndentedString(reactionType)).append("\n");
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

