package apimodels;

import apimodels.EmojiReactionAllOf;
import apimodels.EmojiReactionBase;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * EmojiReaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2021-08-08T20:39:36.686816Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EmojiReaction   {
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

  public EmojiReaction emojiCode(Object emojiCode) {
    this.emojiCode = emojiCode;
    return this;
  }

   /**
   * Get emojiCode
   * @return emojiCode
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
