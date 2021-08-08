package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.EmojiReactionAllOf;
import org.openapitools.model.EmojiReactionBase;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-08T21:20:13.432792Z[Etc/UTC]")public class EmojiReaction   {
  
  private @Valid Object emojiCode = null;
  private @Valid Object emojiName = null;
  private @Valid Object reactionType = null;
  private @Valid Object userId = null;
  private @Valid Object user = null;

  /**
   **/
  public EmojiReaction emojiCode(Object emojiCode) {
    this.emojiCode = emojiCode;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("emoji_code")
  public Object getEmojiCode() {
    return emojiCode;
  }

  public void setEmojiCode(Object emojiCode) {
    this.emojiCode = emojiCode;
  }

/**
   **/
  public EmojiReaction emojiName(Object emojiName) {
    this.emojiName = emojiName;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("emoji_name")
  public Object getEmojiName() {
    return emojiName;
  }

  public void setEmojiName(Object emojiName) {
    this.emojiName = emojiName;
  }

/**
   **/
  public EmojiReaction reactionType(Object reactionType) {
    this.reactionType = reactionType;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("reaction_type")
  public Object getReactionType() {
    return reactionType;
  }

  public void setReactionType(Object reactionType) {
    this.reactionType = reactionType;
  }

/**
   **/
  public EmojiReaction userId(Object userId) {
    this.userId = userId;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("user_id")
  public Object getUserId() {
    return userId;
  }

  public void setUserId(Object userId) {
    this.userId = userId;
  }

/**
   **/
  public EmojiReaction user(Object user) {
    this.user = user;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("user")
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

