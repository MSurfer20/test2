package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.EmojiReactionAllOf;
import org.openapitools.model.EmojiReactionBase;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-08-10T11:44:49.803797Z[Etc/UTC]")
public class EmojiReaction   {
  
  private Object emojiCode = null;
  private Object emojiName = null;
  private Object reactionType = null;
  private Object userId = null;
  private Object user = null;

  /**
   **/
  
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
    return Objects.equals(emojiCode, emojiReaction.emojiCode) &&
        Objects.equals(emojiName, emojiReaction.emojiName) &&
        Objects.equals(reactionType, emojiReaction.reactionType) &&
        Objects.equals(userId, emojiReaction.userId) &&
        Objects.equals(user, emojiReaction.user);
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

