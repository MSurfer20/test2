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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * EmojiReactionAllOf
 */
@JsonPropertyOrder({
  EmojiReactionAllOf.JSON_PROPERTY_EMOJI_CODE,
  EmojiReactionAllOf.JSON_PROPERTY_EMOJI_NAME,
  EmojiReactionAllOf.JSON_PROPERTY_REACTION_TYPE,
  EmojiReactionAllOf.JSON_PROPERTY_USER_ID,
  EmojiReactionAllOf.JSON_PROPERTY_USER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen")
public class EmojiReactionAllOf   {
  public static final String JSON_PROPERTY_EMOJI_CODE = "emoji_code";
  @JsonProperty(JSON_PROPERTY_EMOJI_CODE)
  private Object emojiCode = null;

  public static final String JSON_PROPERTY_EMOJI_NAME = "emoji_name";
  @JsonProperty(JSON_PROPERTY_EMOJI_NAME)
  private Object emojiName = null;

  public static final String JSON_PROPERTY_REACTION_TYPE = "reaction_type";
  @JsonProperty(JSON_PROPERTY_REACTION_TYPE)
  private Object reactionType = null;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  @JsonProperty(JSON_PROPERTY_USER_ID)
  private Object userId = null;

  public static final String JSON_PROPERTY_USER = "user";
  @JsonProperty(JSON_PROPERTY_USER)
  private Object user = null;

  public EmojiReactionAllOf emojiCode(Object emojiCode) {
    this.emojiCode = emojiCode;
    return this;
  }

  /**
   * Get emojiCode
   * @return emojiCode
   **/
  @JsonProperty(value = "emoji_code")
  @ApiModelProperty(value = "")
  
  public Object getEmojiCode() {
    return emojiCode;
  }

  public void setEmojiCode(Object emojiCode) {
    this.emojiCode = emojiCode;
  }

  public EmojiReactionAllOf emojiName(Object emojiName) {
    this.emojiName = emojiName;
    return this;
  }

  /**
   * Get emojiName
   * @return emojiName
   **/
  @JsonProperty(value = "emoji_name")
  @ApiModelProperty(value = "")
  
  public Object getEmojiName() {
    return emojiName;
  }

  public void setEmojiName(Object emojiName) {
    this.emojiName = emojiName;
  }

  public EmojiReactionAllOf reactionType(Object reactionType) {
    this.reactionType = reactionType;
    return this;
  }

  /**
   * Get reactionType
   * @return reactionType
   **/
  @JsonProperty(value = "reaction_type")
  @ApiModelProperty(value = "")
  
  public Object getReactionType() {
    return reactionType;
  }

  public void setReactionType(Object reactionType) {
    this.reactionType = reactionType;
  }

  public EmojiReactionAllOf userId(Object userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   **/
  @JsonProperty(value = "user_id")
  @ApiModelProperty(value = "")
  
  public Object getUserId() {
    return userId;
  }

  public void setUserId(Object userId) {
    this.userId = userId;
  }

  public EmojiReactionAllOf user(Object user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   **/
  @JsonProperty(value = "user")
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
    EmojiReactionAllOf emojiReactionAllOf = (EmojiReactionAllOf) o;
    return Objects.equals(this.emojiCode, emojiReactionAllOf.emojiCode) &&
        Objects.equals(this.emojiName, emojiReactionAllOf.emojiName) &&
        Objects.equals(this.reactionType, emojiReactionAllOf.reactionType) &&
        Objects.equals(this.userId, emojiReactionAllOf.userId) &&
        Objects.equals(this.user, emojiReactionAllOf.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emojiCode, emojiName, reactionType, userId, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmojiReactionAllOf {\n");
    
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

