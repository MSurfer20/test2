package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.EmojiBase;
import com.prokarma.pkmst.model.EmojiReactionBaseAllOf;
import com.prokarma.pkmst.model.EmojiReactionBaseAllOfUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * EmojiReactionBase
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2021-08-10T11:44:18.948405Z[Etc/UTC]")
public class EmojiReactionBase   {
  @JsonProperty("emoji_code")
  private String emojiCode;

  @JsonProperty("emoji_name")
  private String emojiName;

  @JsonProperty("reaction_type")
  private String reactionType;

  @JsonProperty("user_id")
  private Integer userId;

  @JsonProperty("user")
  private EmojiReactionBaseAllOfUser user;

  public EmojiReactionBase emojiCode(String emojiCode) {
    this.emojiCode = emojiCode;
    return this;
  }

   /**
   * A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
   * @return emojiCode
  **/
  @ApiModelProperty(value = "A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. ")
  public String getEmojiCode() {
    return emojiCode;
  }

  public void setEmojiCode(String emojiCode) {
    this.emojiCode = emojiCode;
  }

  public EmojiReactionBase emojiName(String emojiName) {
    this.emojiName = emojiName;
    return this;
  }

   /**
   * Name of the emoji. 
   * @return emojiName
  **/
  @ApiModelProperty(value = "Name of the emoji. ")
  public String getEmojiName() {
    return emojiName;
  }

  public void setEmojiName(String emojiName) {
    this.emojiName = emojiName;
  }

  public EmojiReactionBase reactionType(String reactionType) {
    this.reactionType = reactionType;
    return this;
  }

   /**
   * One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
   * @return reactionType
  **/
  @ApiModelProperty(value = "One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. ")
  public String getReactionType() {
    return reactionType;
  }

  public void setReactionType(String reactionType) {
    this.reactionType = reactionType;
  }

  public EmojiReactionBase userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
   * @return userId
  **/
  @ApiModelProperty(value = "The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. ")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public EmojiReactionBase user(EmojiReactionBaseAllOfUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
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
    EmojiReactionBase emojiReactionBase = (EmojiReactionBase) o;
    return Objects.equals(this.emojiCode, emojiReactionBase.emojiCode) &&
        Objects.equals(this.emojiName, emojiReactionBase.emojiName) &&
        Objects.equals(this.reactionType, emojiReactionBase.reactionType) &&
        Objects.equals(this.userId, emojiReactionBase.userId) &&
        Objects.equals(this.user, emojiReactionBase.user);
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

