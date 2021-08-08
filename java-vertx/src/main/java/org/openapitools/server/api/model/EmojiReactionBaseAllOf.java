package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.EmojiReactionBaseAllOfUser;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmojiReactionBaseAllOf   {
  
  private Integer userId;
  private EmojiReactionBaseAllOfUser user;

  public EmojiReactionBaseAllOf () {

  }

  public EmojiReactionBaseAllOf (Integer userId, EmojiReactionBaseAllOfUser user) {
    this.userId = userId;
    this.user = user;
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
    EmojiReactionBaseAllOf emojiReactionBaseAllOf = (EmojiReactionBaseAllOf) o;
    return Objects.equals(userId, emojiReactionBaseAllOf.userId) &&
        Objects.equals(user, emojiReactionBaseAllOf.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmojiReactionBaseAllOf {\n");
    
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
