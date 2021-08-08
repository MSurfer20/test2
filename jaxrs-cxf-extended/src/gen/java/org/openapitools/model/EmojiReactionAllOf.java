package org.openapitools.model;

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


public class EmojiReactionAllOf  {
  
  @ApiModelProperty(value = "")
  private Object emojiCode = null;

  @ApiModelProperty(value = "")
  private Object emojiName = null;

  @ApiModelProperty(value = "")
  private Object reactionType = null;

  @ApiModelProperty(value = "")
  private Object userId = null;

  @ApiModelProperty(value = "")
  private Object user = null;
 /**
  * Get emojiCode
  * @return emojiCode
  */
  @JsonProperty("emoji_code")
  public Object getEmojiCode() {
    return emojiCode;
  }

  /**
   * Sets the <code>emojiCode</code> property.
   */
  public void setEmojiCode(Object emojiCode) {
    this.emojiCode = emojiCode;
  }

  /**
   * Sets the <code>emojiCode</code> property.
   */
  public EmojiReactionAllOf emojiCode(Object emojiCode) {
    this.emojiCode = emojiCode;
    return this;
  }

 /**
  * Get emojiName
  * @return emojiName
  */
  @JsonProperty("emoji_name")
  public Object getEmojiName() {
    return emojiName;
  }

  /**
   * Sets the <code>emojiName</code> property.
   */
  public void setEmojiName(Object emojiName) {
    this.emojiName = emojiName;
  }

  /**
   * Sets the <code>emojiName</code> property.
   */
  public EmojiReactionAllOf emojiName(Object emojiName) {
    this.emojiName = emojiName;
    return this;
  }

 /**
  * Get reactionType
  * @return reactionType
  */
  @JsonProperty("reaction_type")
  public Object getReactionType() {
    return reactionType;
  }

  /**
   * Sets the <code>reactionType</code> property.
   */
  public void setReactionType(Object reactionType) {
    this.reactionType = reactionType;
  }

  /**
   * Sets the <code>reactionType</code> property.
   */
  public EmojiReactionAllOf reactionType(Object reactionType) {
    this.reactionType = reactionType;
    return this;
  }

 /**
  * Get userId
  * @return userId
  */
  @JsonProperty("user_id")
  public Object getUserId() {
    return userId;
  }

  /**
   * Sets the <code>userId</code> property.
   */
  public void setUserId(Object userId) {
    this.userId = userId;
  }

  /**
   * Sets the <code>userId</code> property.
   */
  public EmojiReactionAllOf userId(Object userId) {
    this.userId = userId;
    return this;
  }

 /**
  * Get user
  * @return user
  */
  @JsonProperty("user")
  public Object getUser() {
    return user;
  }

  /**
   * Sets the <code>user</code> property.
   */
  public void setUser(Object user) {
    this.user = user;
  }

  /**
   * Sets the <code>user</code> property.
   */
  public EmojiReactionAllOf user(Object user) {
    this.user = user;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

