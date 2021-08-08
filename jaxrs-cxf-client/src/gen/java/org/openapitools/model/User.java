package org.openapitools.model;

import org.openapitools.model.UserAllOf;
import org.openapitools.model.UserBase;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User  {
  
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
  **/
  @JsonProperty("email")
  public Object getEmail() {
    return email;
  }

  public void setEmail(Object email) {
    this.email = email;
  }

  public User email(Object email) {
    this.email = email;
    return this;
  }

 /**
   * Get isBot
   * @return isBot
  **/
  @JsonProperty("is_bot")
  public Object getIsBot() {
    return isBot;
  }

  public void setIsBot(Object isBot) {
    this.isBot = isBot;
  }

  public User isBot(Object isBot) {
    this.isBot = isBot;
    return this;
  }

 /**
   * Get avatarUrl
   * @return avatarUrl
  **/
  @JsonProperty("avatar_url")
  public Object getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public User avatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

 /**
   * Get avatarVersion
   * @return avatarVersion
  **/
  @JsonProperty("avatar_version")
  public Object getAvatarVersion() {
    return avatarVersion;
  }

  public void setAvatarVersion(Object avatarVersion) {
    this.avatarVersion = avatarVersion;
  }

  public User avatarVersion(Object avatarVersion) {
    this.avatarVersion = avatarVersion;
    return this;
  }

 /**
   * Get fullName
   * @return fullName
  **/
  @JsonProperty("full_name")
  public Object getFullName() {
    return fullName;
  }

  public void setFullName(Object fullName) {
    this.fullName = fullName;
  }

  public User fullName(Object fullName) {
    this.fullName = fullName;
    return this;
  }

 /**
   * Get isAdmin
   * @return isAdmin
  **/
  @JsonProperty("is_admin")
  public Object getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Object isAdmin) {
    this.isAdmin = isAdmin;
  }

  public User isAdmin(Object isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

 /**
   * Get isOwner
   * @return isOwner
  **/
  @JsonProperty("is_owner")
  public Object getIsOwner() {
    return isOwner;
  }

  public void setIsOwner(Object isOwner) {
    this.isOwner = isOwner;
  }

  public User isOwner(Object isOwner) {
    this.isOwner = isOwner;
    return this;
  }

 /**
   * Get isBillingAdmin
   * @return isBillingAdmin
  **/
  @JsonProperty("is_billing_admin")
  public Object getIsBillingAdmin() {
    return isBillingAdmin;
  }

  public void setIsBillingAdmin(Object isBillingAdmin) {
    this.isBillingAdmin = isBillingAdmin;
  }

  public User isBillingAdmin(Object isBillingAdmin) {
    this.isBillingAdmin = isBillingAdmin;
    return this;
  }

 /**
   * Get role
   * @return role
  **/
  @JsonProperty("role")
  public Object getRole() {
    return role;
  }

  public void setRole(Object role) {
    this.role = role;
  }

  public User role(Object role) {
    this.role = role;
    return this;
  }

 /**
   * Get botType
   * @return botType
  **/
  @JsonProperty("bot_type")
  public Object getBotType() {
    return botType;
  }

  public void setBotType(Object botType) {
    this.botType = botType;
  }

  public User botType(Object botType) {
    this.botType = botType;
    return this;
  }

 /**
   * Get userId
   * @return userId
  **/
  @JsonProperty("user_id")
  public Object getUserId() {
    return userId;
  }

  public void setUserId(Object userId) {
    this.userId = userId;
  }

  public User userId(Object userId) {
    this.userId = userId;
    return this;
  }

 /**
   * Get botOwnerId
   * @return botOwnerId
  **/
  @JsonProperty("bot_owner_id")
  public Object getBotOwnerId() {
    return botOwnerId;
  }

  public void setBotOwnerId(Object botOwnerId) {
    this.botOwnerId = botOwnerId;
  }

  public User botOwnerId(Object botOwnerId) {
    this.botOwnerId = botOwnerId;
    return this;
  }

 /**
   * Get isActive
   * @return isActive
  **/
  @JsonProperty("is_active")
  public Object getIsActive() {
    return isActive;
  }

  public void setIsActive(Object isActive) {
    this.isActive = isActive;
  }

  public User isActive(Object isActive) {
    this.isActive = isActive;
    return this;
  }

 /**
   * Get isGuest
   * @return isGuest
  **/
  @JsonProperty("is_guest")
  public Object getIsGuest() {
    return isGuest;
  }

  public void setIsGuest(Object isGuest) {
    this.isGuest = isGuest;
  }

  public User isGuest(Object isGuest) {
    this.isGuest = isGuest;
    return this;
  }

 /**
   * Get timezone
   * @return timezone
  **/
  @JsonProperty("timezone")
  public Object getTimezone() {
    return timezone;
  }

  public void setTimezone(Object timezone) {
    this.timezone = timezone;
  }

  public User timezone(Object timezone) {
    this.timezone = timezone;
    return this;
  }

 /**
   * Get dateJoined
   * @return dateJoined
  **/
  @JsonProperty("date_joined")
  public Object getDateJoined() {
    return dateJoined;
  }

  public void setDateJoined(Object dateJoined) {
    this.dateJoined = dateJoined;
  }

  public User dateJoined(Object dateJoined) {
    this.dateJoined = dateJoined;
    return this;
  }

 /**
   * Get deliveryEmail
   * @return deliveryEmail
  **/
  @JsonProperty("delivery_email")
  public Object getDeliveryEmail() {
    return deliveryEmail;
  }

  public void setDeliveryEmail(Object deliveryEmail) {
    this.deliveryEmail = deliveryEmail;
  }

  public User deliveryEmail(Object deliveryEmail) {
    this.deliveryEmail = deliveryEmail;
    return this;
  }

 /**
   * Get profileData
   * @return profileData
  **/
  @JsonProperty("profile_data")
  public Object getProfileData() {
    return profileData;
  }

  public void setProfileData(Object profileData) {
    this.profileData = profileData;
  }

  public User profileData(Object profileData) {
    this.profileData = profileData;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

