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


public class UserAllOf  {
  
  @ApiModelProperty(value = "")
  private Object email = null;

  @ApiModelProperty(value = "")
  private Object isBot = null;

  @ApiModelProperty(value = "")
  private Object avatarUrl = null;

  @ApiModelProperty(value = "")
  private Object avatarVersion = null;

  @ApiModelProperty(value = "")
  private Object fullName = null;

  @ApiModelProperty(value = "")
  private Object isAdmin = null;

  @ApiModelProperty(value = "")
  private Object isOwner = null;

  @ApiModelProperty(value = "")
  private Object isBillingAdmin = null;

  @ApiModelProperty(value = "")
  private Object role = null;

  @ApiModelProperty(value = "")
  private Object botType = null;

  @ApiModelProperty(value = "")
  private Object userId = null;

  @ApiModelProperty(value = "")
  private Object botOwnerId = null;

  @ApiModelProperty(value = "")
  private Object isActive = null;

  @ApiModelProperty(value = "")
  private Object isGuest = null;

  @ApiModelProperty(value = "")
  private Object timezone = null;

  @ApiModelProperty(value = "")
  private Object dateJoined = null;

  @ApiModelProperty(value = "")
  private Object deliveryEmail = null;

  @ApiModelProperty(value = "")
  private Object profileData = null;
 /**
  * Get email
  * @return email
  */
  @JsonProperty("email")
  public Object getEmail() {
    return email;
  }

  /**
   * Sets the <code>email</code> property.
   */
  public void setEmail(Object email) {
    this.email = email;
  }

  /**
   * Sets the <code>email</code> property.
   */
  public UserAllOf email(Object email) {
    this.email = email;
    return this;
  }

 /**
  * Get isBot
  * @return isBot
  */
  @JsonProperty("is_bot")
  public Object getIsBot() {
    return isBot;
  }

  /**
   * Sets the <code>isBot</code> property.
   */
  public void setIsBot(Object isBot) {
    this.isBot = isBot;
  }

  /**
   * Sets the <code>isBot</code> property.
   */
  public UserAllOf isBot(Object isBot) {
    this.isBot = isBot;
    return this;
  }

 /**
  * Get avatarUrl
  * @return avatarUrl
  */
  @JsonProperty("avatar_url")
  public Object getAvatarUrl() {
    return avatarUrl;
  }

  /**
   * Sets the <code>avatarUrl</code> property.
   */
  public void setAvatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  /**
   * Sets the <code>avatarUrl</code> property.
   */
  public UserAllOf avatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

 /**
  * Get avatarVersion
  * @return avatarVersion
  */
  @JsonProperty("avatar_version")
  public Object getAvatarVersion() {
    return avatarVersion;
  }

  /**
   * Sets the <code>avatarVersion</code> property.
   */
  public void setAvatarVersion(Object avatarVersion) {
    this.avatarVersion = avatarVersion;
  }

  /**
   * Sets the <code>avatarVersion</code> property.
   */
  public UserAllOf avatarVersion(Object avatarVersion) {
    this.avatarVersion = avatarVersion;
    return this;
  }

 /**
  * Get fullName
  * @return fullName
  */
  @JsonProperty("full_name")
  public Object getFullName() {
    return fullName;
  }

  /**
   * Sets the <code>fullName</code> property.
   */
  public void setFullName(Object fullName) {
    this.fullName = fullName;
  }

  /**
   * Sets the <code>fullName</code> property.
   */
  public UserAllOf fullName(Object fullName) {
    this.fullName = fullName;
    return this;
  }

 /**
  * Get isAdmin
  * @return isAdmin
  */
  @JsonProperty("is_admin")
  public Object getIsAdmin() {
    return isAdmin;
  }

  /**
   * Sets the <code>isAdmin</code> property.
   */
  public void setIsAdmin(Object isAdmin) {
    this.isAdmin = isAdmin;
  }

  /**
   * Sets the <code>isAdmin</code> property.
   */
  public UserAllOf isAdmin(Object isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

 /**
  * Get isOwner
  * @return isOwner
  */
  @JsonProperty("is_owner")
  public Object getIsOwner() {
    return isOwner;
  }

  /**
   * Sets the <code>isOwner</code> property.
   */
  public void setIsOwner(Object isOwner) {
    this.isOwner = isOwner;
  }

  /**
   * Sets the <code>isOwner</code> property.
   */
  public UserAllOf isOwner(Object isOwner) {
    this.isOwner = isOwner;
    return this;
  }

 /**
  * Get isBillingAdmin
  * @return isBillingAdmin
  */
  @JsonProperty("is_billing_admin")
  public Object getIsBillingAdmin() {
    return isBillingAdmin;
  }

  /**
   * Sets the <code>isBillingAdmin</code> property.
   */
  public void setIsBillingAdmin(Object isBillingAdmin) {
    this.isBillingAdmin = isBillingAdmin;
  }

  /**
   * Sets the <code>isBillingAdmin</code> property.
   */
  public UserAllOf isBillingAdmin(Object isBillingAdmin) {
    this.isBillingAdmin = isBillingAdmin;
    return this;
  }

 /**
  * Get role
  * @return role
  */
  @JsonProperty("role")
  public Object getRole() {
    return role;
  }

  /**
   * Sets the <code>role</code> property.
   */
  public void setRole(Object role) {
    this.role = role;
  }

  /**
   * Sets the <code>role</code> property.
   */
  public UserAllOf role(Object role) {
    this.role = role;
    return this;
  }

 /**
  * Get botType
  * @return botType
  */
  @JsonProperty("bot_type")
  public Object getBotType() {
    return botType;
  }

  /**
   * Sets the <code>botType</code> property.
   */
  public void setBotType(Object botType) {
    this.botType = botType;
  }

  /**
   * Sets the <code>botType</code> property.
   */
  public UserAllOf botType(Object botType) {
    this.botType = botType;
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
  public UserAllOf userId(Object userId) {
    this.userId = userId;
    return this;
  }

 /**
  * Get botOwnerId
  * @return botOwnerId
  */
  @JsonProperty("bot_owner_id")
  public Object getBotOwnerId() {
    return botOwnerId;
  }

  /**
   * Sets the <code>botOwnerId</code> property.
   */
  public void setBotOwnerId(Object botOwnerId) {
    this.botOwnerId = botOwnerId;
  }

  /**
   * Sets the <code>botOwnerId</code> property.
   */
  public UserAllOf botOwnerId(Object botOwnerId) {
    this.botOwnerId = botOwnerId;
    return this;
  }

 /**
  * Get isActive
  * @return isActive
  */
  @JsonProperty("is_active")
  public Object getIsActive() {
    return isActive;
  }

  /**
   * Sets the <code>isActive</code> property.
   */
  public void setIsActive(Object isActive) {
    this.isActive = isActive;
  }

  /**
   * Sets the <code>isActive</code> property.
   */
  public UserAllOf isActive(Object isActive) {
    this.isActive = isActive;
    return this;
  }

 /**
  * Get isGuest
  * @return isGuest
  */
  @JsonProperty("is_guest")
  public Object getIsGuest() {
    return isGuest;
  }

  /**
   * Sets the <code>isGuest</code> property.
   */
  public void setIsGuest(Object isGuest) {
    this.isGuest = isGuest;
  }

  /**
   * Sets the <code>isGuest</code> property.
   */
  public UserAllOf isGuest(Object isGuest) {
    this.isGuest = isGuest;
    return this;
  }

 /**
  * Get timezone
  * @return timezone
  */
  @JsonProperty("timezone")
  public Object getTimezone() {
    return timezone;
  }

  /**
   * Sets the <code>timezone</code> property.
   */
  public void setTimezone(Object timezone) {
    this.timezone = timezone;
  }

  /**
   * Sets the <code>timezone</code> property.
   */
  public UserAllOf timezone(Object timezone) {
    this.timezone = timezone;
    return this;
  }

 /**
  * Get dateJoined
  * @return dateJoined
  */
  @JsonProperty("date_joined")
  public Object getDateJoined() {
    return dateJoined;
  }

  /**
   * Sets the <code>dateJoined</code> property.
   */
  public void setDateJoined(Object dateJoined) {
    this.dateJoined = dateJoined;
  }

  /**
   * Sets the <code>dateJoined</code> property.
   */
  public UserAllOf dateJoined(Object dateJoined) {
    this.dateJoined = dateJoined;
    return this;
  }

 /**
  * Get deliveryEmail
  * @return deliveryEmail
  */
  @JsonProperty("delivery_email")
  public Object getDeliveryEmail() {
    return deliveryEmail;
  }

  /**
   * Sets the <code>deliveryEmail</code> property.
   */
  public void setDeliveryEmail(Object deliveryEmail) {
    this.deliveryEmail = deliveryEmail;
  }

  /**
   * Sets the <code>deliveryEmail</code> property.
   */
  public UserAllOf deliveryEmail(Object deliveryEmail) {
    this.deliveryEmail = deliveryEmail;
    return this;
  }

 /**
  * Get profileData
  * @return profileData
  */
  @JsonProperty("profile_data")
  public Object getProfileData() {
    return profileData;
  }

  /**
   * Sets the <code>profileData</code> property.
   */
  public void setProfileData(Object profileData) {
    this.profileData = profileData;
  }

  /**
   * Sets the <code>profileData</code> property.
   */
  public UserAllOf profileData(Object profileData) {
    this.profileData = profileData;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAllOf {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

