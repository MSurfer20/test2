package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen")
public class EmojiReactionAllOf   {
  @JsonProperty("emoji_code")
  private Object emojiCode = null;

  @JsonProperty("emoji_name")
  private Object emojiName = null;

  @JsonProperty("reaction_type")
  private Object reactionType = null;

  @JsonProperty("user_id")
  private Object userId = null;

  @JsonProperty("user")
  private Object user = null;

  /**
   **/
  public EmojiReactionAllOf emojiCode(Object emojiCode) {
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
  public EmojiReactionAllOf emojiName(Object emojiName) {
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
  public EmojiReactionAllOf reactionType(Object reactionType) {
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
  public EmojiReactionAllOf userId(Object userId) {
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
  public EmojiReactionAllOf user(Object user) {
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
    EmojiReactionAllOf emojiReactionAllOf = (EmojiReactionAllOf) o;
    return Objects.equals(emojiCode, emojiReactionAllOf.emojiCode) &&
        Objects.equals(emojiName, emojiReactionAllOf.emojiName) &&
        Objects.equals(reactionType, emojiReactionAllOf.reactionType) &&
        Objects.equals(userId, emojiReactionAllOf.userId) &&
        Objects.equals(user, emojiReactionAllOf.user);
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

