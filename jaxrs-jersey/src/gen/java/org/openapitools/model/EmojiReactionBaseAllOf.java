/*
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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.EmojiReactionBaseAllOfUser;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * EmojiReactionBaseAllOf
 */
@JsonPropertyOrder({
  EmojiReactionBaseAllOf.JSON_PROPERTY_USER_ID,
  EmojiReactionBaseAllOf.JSON_PROPERTY_USER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen")
public class EmojiReactionBaseAllOf   {
  public static final String JSON_PROPERTY_USER_ID = "user_id";
  @JsonProperty(JSON_PROPERTY_USER_ID)
  private Integer userId;

  public static final String JSON_PROPERTY_USER = "user";
  @JsonProperty(JSON_PROPERTY_USER)
  private EmojiReactionBaseAllOfUser user;

  public EmojiReactionBaseAllOf userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The &#x60;user&#x60; object is deprecated and will be removed in the future. 
   * @return userId
   **/
  @JsonProperty(value = "user_id")
  @ApiModelProperty(value = "The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. ")
  
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public EmojiReactionBaseAllOf user(EmojiReactionBaseAllOfUser user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   **/
  @JsonProperty(value = "user")
  @ApiModelProperty(value = "")
  @Valid 
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
    return Objects.equals(this.userId, emojiReactionBaseAllOf.userId) &&
        Objects.equals(this.user, emojiReactionBaseAllOf.user);
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

