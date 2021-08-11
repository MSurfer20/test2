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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EmojiBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EmojiBase {
  public static final String SERIALIZED_NAME_EMOJI_CODE = "emoji_code";
  @SerializedName(SERIALIZED_NAME_EMOJI_CODE)
  private String emojiCode;

  public static final String SERIALIZED_NAME_EMOJI_NAME = "emoji_name";
  @SerializedName(SERIALIZED_NAME_EMOJI_NAME)
  private String emojiName;

  public static final String SERIALIZED_NAME_REACTION_TYPE = "reaction_type";
  @SerializedName(SERIALIZED_NAME_REACTION_TYPE)
  private String reactionType;


  public EmojiBase emojiCode(String emojiCode) {
    
    this.emojiCode = emojiCode;
    return this;
  }

   /**
   * A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji. 
   * @return emojiCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. ")

  public String getEmojiCode() {
    return emojiCode;
  }


  public void setEmojiCode(String emojiCode) {
    this.emojiCode = emojiCode;
  }


  public EmojiBase emojiName(String emojiName) {
    
    this.emojiName = emojiName;
    return this;
  }

   /**
   * Name of the emoji. 
   * @return emojiName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the emoji. ")

  public String getEmojiName() {
    return emojiName;
  }


  public void setEmojiName(String emojiName) {
    this.emojiName = emojiName;
  }


  public EmojiBase reactionType(String reactionType) {
    
    this.reactionType = reactionType;
    return this;
  }

   /**
   * One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji. 
   * @return reactionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. ")

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
    return Objects.equals(this.emojiCode, emojiBase.emojiCode) &&
        Objects.equals(this.emojiName, emojiBase.emojiName) &&
        Objects.equals(this.reactionType, emojiBase.reactionType);
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

