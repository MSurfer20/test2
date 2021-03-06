/**
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

import org.openapitools.client.model.EmojiReactionBaseAllOfUser;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EmojiReactionBaseAllOf {
  
  @SerializedName("user_id")
  private Integer userId = null;
  @SerializedName("user")
  private EmojiReactionBaseAllOfUser user = null;

  /**
   * The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
   **/
  @ApiModelProperty(value = "The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. ")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    return (this.userId == null ? emojiReactionBaseAllOf.userId == null : this.userId.equals(emojiReactionBaseAllOf.userId)) &&
        (this.user == null ? emojiReactionBaseAllOf.user == null : this.user.equals(emojiReactionBaseAllOf.user));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.user == null ? 0: this.user.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmojiReactionBaseAllOf {\n");
    
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
