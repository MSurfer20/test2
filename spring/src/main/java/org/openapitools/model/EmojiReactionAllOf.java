package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EmojiReactionAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-08T21:23:21.107359Z[Etc/UTC]")
public class EmojiReactionAllOf   {
  @JsonProperty("emoji_code")
  private JsonNullable<Object> emojiCode = JsonNullable.undefined();

  @JsonProperty("emoji_name")
  private JsonNullable<Object> emojiName = JsonNullable.undefined();

  @JsonProperty("reaction_type")
  private JsonNullable<Object> reactionType = JsonNullable.undefined();

  @JsonProperty("user_id")
  private JsonNullable<Object> userId = JsonNullable.undefined();

  @JsonProperty("user")
  private JsonNullable<Object> user = JsonNullable.undefined();

  public EmojiReactionAllOf emojiCode(Object emojiCode) {
    this.emojiCode = JsonNullable.of(emojiCode);
    return this;
  }

  /**
   * Get emojiCode
   * @return emojiCode
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getEmojiCode() {
    return emojiCode;
  }

  public void setEmojiCode(JsonNullable<Object> emojiCode) {
    this.emojiCode = emojiCode;
  }

  public EmojiReactionAllOf emojiName(Object emojiName) {
    this.emojiName = JsonNullable.of(emojiName);
    return this;
  }

  /**
   * Get emojiName
   * @return emojiName
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getEmojiName() {
    return emojiName;
  }

  public void setEmojiName(JsonNullable<Object> emojiName) {
    this.emojiName = emojiName;
  }

  public EmojiReactionAllOf reactionType(Object reactionType) {
    this.reactionType = JsonNullable.of(reactionType);
    return this;
  }

  /**
   * Get reactionType
   * @return reactionType
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getReactionType() {
    return reactionType;
  }

  public void setReactionType(JsonNullable<Object> reactionType) {
    this.reactionType = reactionType;
  }

  public EmojiReactionAllOf userId(Object userId) {
    this.userId = JsonNullable.of(userId);
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getUserId() {
    return userId;
  }

  public void setUserId(JsonNullable<Object> userId) {
    this.userId = userId;
  }

  public EmojiReactionAllOf user(Object user) {
    this.user = JsonNullable.of(user);
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getUser() {
    return user;
  }

  public void setUser(JsonNullable<Object> user) {
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

