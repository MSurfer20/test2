package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.EmojiReactionAllOf;
import org.openapitools.vertxweb.server.model.EmojiReactionBase;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmojiReaction   {
  
  private Object emojiCode = null;
  private Object emojiName = null;
  private Object reactionType = null;
  private Object userId = null;
  private Object user = null;

  public EmojiReaction () {

  }

  public EmojiReaction (Object emojiCode, Object emojiName, Object reactionType, Object userId, Object user) {
    this.emojiCode = emojiCode;
    this.emojiName = emojiName;
    this.reactionType = reactionType;
    this.userId = userId;
    this.user = user;
  }

    
  @JsonProperty("emoji_code")
  public Object getEmojiCode() {
    return emojiCode;
  }
  public void setEmojiCode(Object emojiCode) {
    this.emojiCode = emojiCode;
  }

    
  @JsonProperty("emoji_name")
  public Object getEmojiName() {
    return emojiName;
  }
  public void setEmojiName(Object emojiName) {
    this.emojiName = emojiName;
  }

    
  @JsonProperty("reaction_type")
  public Object getReactionType() {
    return reactionType;
  }
  public void setReactionType(Object reactionType) {
    this.reactionType = reactionType;
  }

    
  @JsonProperty("user_id")
  public Object getUserId() {
    return userId;
  }
  public void setUserId(Object userId) {
    this.userId = userId;
  }

    
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
