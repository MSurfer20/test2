package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.EmojiBase;
import org.openapitools.server.api.model.EmojiReactionBaseAllOf;
import org.openapitools.server.api.model.EmojiReactionBaseAllOfUser;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmojiReactionBase   {
  
  private String emojiCode;
  private String emojiName;
  private String reactionType;
  private Integer userId;
  private EmojiReactionBaseAllOfUser user;

  public EmojiReactionBase () {

  }

  public EmojiReactionBase (String emojiCode, String emojiName, String reactionType, Integer userId, EmojiReactionBaseAllOfUser user) {
    this.emojiCode = emojiCode;
    this.emojiName = emojiName;
    this.reactionType = reactionType;
    this.userId = userId;
    this.user = user;
  }

    
  @JsonProperty("emoji_code")
  public String getEmojiCode() {
    return emojiCode;
  }
  public void setEmojiCode(String emojiCode) {
    this.emojiCode = emojiCode;
  }

    
  @JsonProperty("emoji_name")
  public String getEmojiName() {
    return emojiName;
  }
  public void setEmojiName(String emojiName) {
    this.emojiName = emojiName;
  }

    
  @JsonProperty("reaction_type")
  public String getReactionType() {
    return reactionType;
  }
  public void setReactionType(String reactionType) {
    this.reactionType = reactionType;
  }

    
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

    
  @JsonProperty("user")
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
    return Objects.equals(emojiCode, emojiReactionBase.emojiCode) &&
        Objects.equals(emojiName, emojiReactionBase.emojiName) &&
        Objects.equals(reactionType, emojiReactionBase.reactionType) &&
        Objects.equals(userId, emojiReactionBase.userId) &&
        Objects.equals(user, emojiReactionBase.user);
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
