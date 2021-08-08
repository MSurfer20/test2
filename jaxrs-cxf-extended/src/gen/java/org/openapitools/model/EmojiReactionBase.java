package org.openapitools.model;

import org.openapitools.model.EmojiReactionBaseUser;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EmojiReactionBase  {
  
 /**
  * A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint. 
  */
  @ApiModelProperty(value = "A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint. ")
  private String emojiCode;

 /**
  * Name of the emoji. 
  */
  @ApiModelProperty(value = "Name of the emoji. ")
  private String emojiName;

 /**
  * One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
  */
  @ApiModelProperty(value = "One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. ")
  private String reactionType;

 /**
  * The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
  */
  @ApiModelProperty(value = "The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. ")
  private Integer userId;

  @ApiModelProperty(value = "")
  @Valid
  private EmojiReactionBaseUser user;
 /**
  * A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint. 
  * @return emojiCode
  */
  @JsonProperty("emoji_code")
  public String getEmojiCode() {
    return emojiCode;
  }

  /**
   * Sets the <code>emojiCode</code> property.
   */
  public void setEmojiCode(String emojiCode) {
    this.emojiCode = emojiCode;
  }

  /**
   * Sets the <code>emojiCode</code> property.
   */
  public EmojiReactionBase emojiCode(String emojiCode) {
    this.emojiCode = emojiCode;
    return this;
  }

 /**
  * Name of the emoji. 
  * @return emojiName
  */
  @JsonProperty("emoji_name")
  public String getEmojiName() {
    return emojiName;
  }

  /**
   * Sets the <code>emojiName</code> property.
   */
  public void setEmojiName(String emojiName) {
    this.emojiName = emojiName;
  }

  /**
   * Sets the <code>emojiName</code> property.
   */
  public EmojiReactionBase emojiName(String emojiName) {
    this.emojiName = emojiName;
    return this;
  }

 /**
  * One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji. 
  * @return reactionType
  */
  @JsonProperty("reaction_type")
  public String getReactionType() {
    return reactionType;
  }

  /**
   * Sets the <code>reactionType</code> property.
   */
  public void setReactionType(String reactionType) {
    this.reactionType = reactionType;
  }

  /**
   * Sets the <code>reactionType</code> property.
   */
  public EmojiReactionBase reactionType(String reactionType) {
    this.reactionType = reactionType;
    return this;
  }

 /**
  * The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The &#x60;user&#x60; object is deprecated and will be removed in the future. 
  * @return userId
  */
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }

  /**
   * Sets the <code>userId</code> property.
   */
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * Sets the <code>userId</code> property.
   */
  public EmojiReactionBase userId(Integer userId) {
    this.userId = userId;
    return this;
  }

 /**
  * Get user
  * @return user
  */
  @JsonProperty("user")
  public EmojiReactionBaseUser getUser() {
    return user;
  }

  /**
   * Sets the <code>user</code> property.
   */
  public void setUser(EmojiReactionBaseUser user) {
    this.user = user;
  }

  /**
   * Sets the <code>user</code> property.
   */
  public EmojiReactionBase user(EmojiReactionBaseUser user) {
    this.user = user;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

