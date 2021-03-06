/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * OpenAPI document version: 1.0.0
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.UserAllOf;
import org.openapitools.model.UserBase;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen")
public class User   {
  
  private Object email = null;
  private Object isBot = null;
  private Object avatarUrl = null;
  private Object avatarVersion = null;
  private Object fullName = null;
  private Object isAdmin = null;
  private Object isOwner = null;
  private Object isBillingAdmin = null;
  private Object role = null;
  private Object botType = null;
  private Object userId = null;
  private Object botOwnerId = null;
  private Object isActive = null;
  private Object isGuest = null;
  private Object timezone = null;
  private Object dateJoined = null;
  private Object deliveryEmail = null;
  private Object profileData = null;

  /**
   */
  public User email(Object email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("email")
  public Object getEmail() {
    return email;
  }
  public void setEmail(Object email) {
    this.email = email;
  }

  /**
   */
  public User isBot(Object isBot) {
    this.isBot = isBot;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("is_bot")
  public Object getIsBot() {
    return isBot;
  }
  public void setIsBot(Object isBot) {
    this.isBot = isBot;
  }

  /**
   */
  public User avatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("avatar_url")
  public Object getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  /**
   */
  public User avatarVersion(Object avatarVersion) {
    this.avatarVersion = avatarVersion;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("avatar_version")
  public Object getAvatarVersion() {
    return avatarVersion;
  }
  public void setAvatarVersion(Object avatarVersion) {
    this.avatarVersion = avatarVersion;
  }

  /**
   */
  public User fullName(Object fullName) {
    this.fullName = fullName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("full_name")
  public Object getFullName() {
    return fullName;
  }
  public void setFullName(Object fullName) {
    this.fullName = fullName;
  }

  /**
   */
  public User isAdmin(Object isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("is_admin")
  public Object getIsAdmin() {
    return isAdmin;
  }
  public void setIsAdmin(Object isAdmin) {
    this.isAdmin = isAdmin;
  }

  /**
   */
  public User isOwner(Object isOwner) {
    this.isOwner = isOwner;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("is_owner")
  public Object getIsOwner() {
    return isOwner;
  }
  public void setIsOwner(Object isOwner) {
    this.isOwner = isOwner;
  }

  /**
   */
  public User isBillingAdmin(Object isBillingAdmin) {
    this.isBillingAdmin = isBillingAdmin;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("is_billing_admin")
  public Object getIsBillingAdmin() {
    return isBillingAdmin;
  }
  public void setIsBillingAdmin(Object isBillingAdmin) {
    this.isBillingAdmin = isBillingAdmin;
  }

  /**
   */
  public User role(Object role) {
    this.role = role;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("role")
  public Object getRole() {
    return role;
  }
  public void setRole(Object role) {
    this.role = role;
  }

  /**
   */
  public User botType(Object botType) {
    this.botType = botType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("bot_type")
  public Object getBotType() {
    return botType;
  }
  public void setBotType(Object botType) {
    this.botType = botType;
  }

  /**
   */
  public User userId(Object userId) {
    this.userId = userId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user_id")
  public Object getUserId() {
    return userId;
  }
  public void setUserId(Object userId) {
    this.userId = userId;
  }

  /**
   */
  public User botOwnerId(Object botOwnerId) {
    this.botOwnerId = botOwnerId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("bot_owner_id")
  public Object getBotOwnerId() {
    return botOwnerId;
  }
  public void setBotOwnerId(Object botOwnerId) {
    this.botOwnerId = botOwnerId;
  }

  /**
   */
  public User isActive(Object isActive) {
    this.isActive = isActive;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("is_active")
  public Object getIsActive() {
    return isActive;
  }
  public void setIsActive(Object isActive) {
    this.isActive = isActive;
  }

  /**
   */
  public User isGuest(Object isGuest) {
    this.isGuest = isGuest;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("is_guest")
  public Object getIsGuest() {
    return isGuest;
  }
  public void setIsGuest(Object isGuest) {
    this.isGuest = isGuest;
  }

  /**
   */
  public User timezone(Object timezone) {
    this.timezone = timezone;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("timezone")
  public Object getTimezone() {
    return timezone;
  }
  public void setTimezone(Object timezone) {
    this.timezone = timezone;
  }

  /**
   */
  public User dateJoined(Object dateJoined) {
    this.dateJoined = dateJoined;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("date_joined")
  public Object getDateJoined() {
    return dateJoined;
  }
  public void setDateJoined(Object dateJoined) {
    this.dateJoined = dateJoined;
  }

  /**
   */
  public User deliveryEmail(Object deliveryEmail) {
    this.deliveryEmail = deliveryEmail;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("delivery_email")
  public Object getDeliveryEmail() {
    return deliveryEmail;
  }
  public void setDeliveryEmail(Object deliveryEmail) {
    this.deliveryEmail = deliveryEmail;
  }

  /**
   */
  public User profileData(Object profileData) {
    this.profileData = profileData;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("profile_data")
  public Object getProfileData() {
    return profileData;
  }
  public void setProfileData(Object profileData) {
    this.profileData = profileData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(email, user.email) &&
        Objects.equals(isBot, user.isBot) &&
        Objects.equals(avatarUrl, user.avatarUrl) &&
        Objects.equals(avatarVersion, user.avatarVersion) &&
        Objects.equals(fullName, user.fullName) &&
        Objects.equals(isAdmin, user.isAdmin) &&
        Objects.equals(isOwner, user.isOwner) &&
        Objects.equals(isBillingAdmin, user.isBillingAdmin) &&
        Objects.equals(role, user.role) &&
        Objects.equals(botType, user.botType) &&
        Objects.equals(userId, user.userId) &&
        Objects.equals(botOwnerId, user.botOwnerId) &&
        Objects.equals(isActive, user.isActive) &&
        Objects.equals(isGuest, user.isGuest) &&
        Objects.equals(timezone, user.timezone) &&
        Objects.equals(dateJoined, user.dateJoined) &&
        Objects.equals(deliveryEmail, user.deliveryEmail) &&
        Objects.equals(profileData, user.profileData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, isBot, avatarUrl, avatarVersion, fullName, isAdmin, isOwner, isBillingAdmin, role, botType, userId, botOwnerId, isActive, isGuest, timezone, dateJoined, deliveryEmail, profileData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    isBot: ").append(toIndentedString(isBot)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    avatarVersion: ").append(toIndentedString(avatarVersion)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    isOwner: ").append(toIndentedString(isOwner)).append("\n");
    sb.append("    isBillingAdmin: ").append(toIndentedString(isBillingAdmin)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    botType: ").append(toIndentedString(botType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    botOwnerId: ").append(toIndentedString(botOwnerId)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isGuest: ").append(toIndentedString(isGuest)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    dateJoined: ").append(toIndentedString(dateJoined)).append("\n");
    sb.append("    deliveryEmail: ").append(toIndentedString(deliveryEmail)).append("\n");
    sb.append("    profileData: ").append(toIndentedString(profileData)).append("\n");
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

