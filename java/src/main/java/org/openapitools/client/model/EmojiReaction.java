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
import org.openapitools.client.model.EmojiReactionAllOf;
import org.openapitools.client.model.EmojiReactionBase;

/**
 * EmojiReaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-09T21:33:13.791847Z[Etc/UTC]")
public class EmojiReaction {
  public static final String SERIALIZED_NAME_EMOJI_CODE = "emoji_code";
  @SerializedName(SERIALIZED_NAME_EMOJI_CODE)
  private Object emojiCode = null;

  public static final String SERIALIZED_NAME_EMOJI_NAME = "emoji_name";
  @SerializedName(SERIALIZED_NAME_EMOJI_NAME)
  private Object emojiName = null;

  public static final String SERIALIZED_NAME_REACTION_TYPE = "reaction_type";
  @SerializedName(SERIALIZED_NAME_REACTION_TYPE)
  private Object reactionType = null;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Object userId = null;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private Object user = null;


  public EmojiReaction emojiCode(Object emojiCode) {
    
    this.emojiCode = emojiCode;
    return this;
  }

   /**
   * Get emojiCode
   * @return emojiCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getEmojiCode() {
    return emojiCode;
  }


  public void setEmojiCode(Object emojiCode) {
    this.emojiCode = emojiCode;
  }


  public EmojiReaction emojiName(Object emojiName) {
    
    this.emojiName = emojiName;
    return this;
  }

   /**
   * Get emojiName
   * @return emojiName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getEmojiName() {
    return emojiName;
  }


  public void setEmojiName(Object emojiName) {
    this.emojiName = emojiName;
  }


  public EmojiReaction reactionType(Object reactionType) {
    
    this.reactionType = reactionType;
    return this;
  }

   /**
   * Get reactionType
   * @return reactionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getReactionType() {
    return reactionType;
  }


  public void setReactionType(Object reactionType) {
    this.reactionType = reactionType;
  }


  public EmojiReaction userId(Object userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getUserId() {
    return userId;
  }


  public void setUserId(Object userId) {
    this.userId = userId;
  }


  public EmojiReaction user(Object user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getUser() {
    return user;
  }


  public void setUser(Object user) {
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
    EmojiReaction emojiReaction = (EmojiReaction) o;
    return Objects.equals(this.emojiCode, emojiReaction.emojiCode) &&
        Objects.equals(this.emojiName, emojiReaction.emojiName) &&
        Objects.equals(this.reactionType, emojiReaction.reactionType) &&
        Objects.equals(this.userId, emojiReaction.userId) &&
        Objects.equals(this.user, emojiReaction.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emojiCode, emojiName, reactionType, userId, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmojiReaction {\n");
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

