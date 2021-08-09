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
import org.openapitools.client.model.EmojiBase;
import org.openapitools.client.model.EmojiReactionBaseAllOf;
import org.openapitools.client.model.EmojiReactionBaseAllOfUser;

/**
 * EmojiReactionBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-09T21:33:13.791847Z[Etc/UTC]")
public class EmojiReactionBase {
  public static final String SERIALIZED_NAME_EMOJI_CODE = "emoji_code";
  @SerializedName(SERIALIZED_NAME_EMOJI_CODE)
  private String emojiCode;

  public static final String SERIALIZED_NAME_EMOJI_NAME = "emoji_name";
  @SerializedName(SERIALIZED_NAME_EMOJI_NAME)
  private String emojiName;

  public static final String SERIALIZED_NAME_REACTION_TYPE = "reaction_type";
  @SerializedName(SERIALIZED_NAME_REACTION_TYPE)
  private String reactionType;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Integer userId;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private EmojiReactionBaseAllOfUser user;


  public EmojiReactionBase emojiCode(String emojiCode) {
    
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


  public EmojiReactionBase emojiName(String emojiName) {
    
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


  public EmojiReactionBase reactionType(String reactionType) {
    
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


  public EmojiReactionBase userId(Integer userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The &#x60;user&#x60; object is deprecated and will be removed in the future. 
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. ")

  public Integer getUserId() {
    return userId;
  }


  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public EmojiReactionBase user(EmojiReactionBaseAllOfUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmojiReactionBaseAllOfUser getUser() {
    return user;
  }


  public void setUser(EmojiReactionBaseAllOfUser user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmojiReactionBase emojiReactionBase = (EmojiReactionBase) o;
    return Objects.equals(this.emojiCode, emojiReactionBase.emojiCode) &&
        Objects.equals(this.emojiName, emojiReactionBase.emojiName) &&
        Objects.equals(this.reactionType, emojiReactionBase.reactionType) &&
        Objects.equals(this.userId, emojiReactionBase.userId) &&
        Objects.equals(this.user, emojiReactionBase.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emojiCode, emojiName, reactionType, userId, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmojiReactionBase {\n");
    sb.append("    emojiCode: ").append(toIndentedString(emojiCode)).append("\n");
    sb.append("    emojiName: ").append(toIndentedString(emojiName)).append("\n");
    sb.append("    reactionType: ").append(toIndentedString(reactionType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

