package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.UserAllOf;
import org.openapitools.model.UserBase;

/**
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-08-09T21:33:26.116785Z[Etc/UTC]")
public class User   {
  @JsonProperty("email")
  private Object email = null;

  @JsonProperty("is_bot")
  private Object isBot = null;

  @JsonProperty("avatar_url")
  private Object avatarUrl = null;

  @JsonProperty("avatar_version")
  private Object avatarVersion = null;

  @JsonProperty("full_name")
  private Object fullName = null;

  @JsonProperty("is_admin")
  private Object isAdmin = null;

  @JsonProperty("is_owner")
  private Object isOwner = null;

  @JsonProperty("is_billing_admin")
  private Object isBillingAdmin = null;

  @JsonProperty("role")
  private Object role = null;

  @JsonProperty("bot_type")
  private Object botType = null;

  @JsonProperty("user_id")
  private Object userId = null;

  @JsonProperty("bot_owner_id")
  private Object botOwnerId = null;

  @JsonProperty("is_active")
  private Object isActive = null;

  @JsonProperty("is_guest")
  private Object isGuest = null;

  @JsonProperty("timezone")
  private Object timezone = null;

  @JsonProperty("date_joined")
  private Object dateJoined = null;

  @JsonProperty("delivery_email")
  private Object deliveryEmail = null;

  @JsonProperty("profile_data")
  private Object profileData = null;

  public User email(Object email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public Object getEmail() {
    return email;
  }

  public void setEmail(Object email) {
    this.email = email;
  }

  public User isBot(Object isBot) {
    this.isBot = isBot;
    return this;
  }

   /**
   * Get isBot
   * @return isBot
  **/
  @ApiModelProperty(value = "")
  public Object getIsBot() {
    return isBot;
  }

  public void setIsBot(Object isBot) {
    this.isBot = isBot;
  }

  public User avatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * Get avatarUrl
   * @return avatarUrl
  **/
  @ApiModelProperty(value = "")
  public Object getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public User avatarVersion(Object avatarVersion) {
    this.avatarVersion = avatarVersion;
    return this;
  }

   /**
   * Get avatarVersion
   * @return avatarVersion
  **/
  @ApiModelProperty(value = "")
  public Object getAvatarVersion() {
    return avatarVersion;
  }

  public void setAvatarVersion(Object avatarVersion) {
    this.avatarVersion = avatarVersion;
  }

  public User fullName(Object fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @ApiModelProperty(value = "")
  public Object getFullName() {
    return fullName;
  }

  public void setFullName(Object fullName) {
    this.fullName = fullName;
  }

  public User isAdmin(Object isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

   /**
   * Get isAdmin
   * @return isAdmin
  **/
  @ApiModelProperty(value = "")
  public Object getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Object isAdmin) {
    this.isAdmin = isAdmin;
  }

  public User isOwner(Object isOwner) {
    this.isOwner = isOwner;
    return this;
  }

   /**
   * Get isOwner
   * @return isOwner
  **/
  @ApiModelProperty(value = "")
  public Object getIsOwner() {
    return isOwner;
  }

  public void setIsOwner(Object isOwner) {
    this.isOwner = isOwner;
  }

  public User isBillingAdmin(Object isBillingAdmin) {
    this.isBillingAdmin = isBillingAdmin;
    return this;
  }

   /**
   * Get isBillingAdmin
   * @return isBillingAdmin
  **/
  @ApiModelProperty(value = "")
  public Object getIsBillingAdmin() {
    return isBillingAdmin;
  }

  public void setIsBillingAdmin(Object isBillingAdmin) {
    this.isBillingAdmin = isBillingAdmin;
  }

  public User role(Object role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")
  public Object getRole() {
    return role;
  }

  public void setRole(Object role) {
    this.role = role;
  }

  public User botType(Object botType) {
    this.botType = botType;
    return this;
  }

   /**
   * Get botType
   * @return botType
  **/
  @ApiModelProperty(value = "")
  public Object getBotType() {
    return botType;
  }

  public void setBotType(Object botType) {
    this.botType = botType;
  }

  public User userId(Object userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Object getUserId() {
    return userId;
  }

  public void setUserId(Object userId) {
    this.userId = userId;
  }

  public User botOwnerId(Object botOwnerId) {
    this.botOwnerId = botOwnerId;
    return this;
  }

   /**
   * Get botOwnerId
   * @return botOwnerId
  **/
  @ApiModelProperty(value = "")
  public Object getBotOwnerId() {
    return botOwnerId;
  }

  public void setBotOwnerId(Object botOwnerId) {
    this.botOwnerId = botOwnerId;
  }

  public User isActive(Object isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @ApiModelProperty(value = "")
  public Object getIsActive() {
    return isActive;
  }

  public void setIsActive(Object isActive) {
    this.isActive = isActive;
  }

  public User isGuest(Object isGuest) {
    this.isGuest = isGuest;
    return this;
  }

   /**
   * Get isGuest
   * @return isGuest
  **/
  @ApiModelProperty(value = "")
  public Object getIsGuest() {
    return isGuest;
  }

  public void setIsGuest(Object isGuest) {
    this.isGuest = isGuest;
  }

  public User timezone(Object timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @ApiModelProperty(value = "")
  public Object getTimezone() {
    return timezone;
  }

  public void setTimezone(Object timezone) {
    this.timezone = timezone;
  }

  public User dateJoined(Object dateJoined) {
    this.dateJoined = dateJoined;
    return this;
  }

   /**
   * Get dateJoined
   * @return dateJoined
  **/
  @ApiModelProperty(value = "")
  public Object getDateJoined() {
    return dateJoined;
  }

  public void setDateJoined(Object dateJoined) {
    this.dateJoined = dateJoined;
  }

  public User deliveryEmail(Object deliveryEmail) {
    this.deliveryEmail = deliveryEmail;
    return this;
  }

   /**
   * Get deliveryEmail
   * @return deliveryEmail
  **/
  @ApiModelProperty(value = "")
  public Object getDeliveryEmail() {
    return deliveryEmail;
  }

  public void setDeliveryEmail(Object deliveryEmail) {
    this.deliveryEmail = deliveryEmail;
  }

  public User profileData(Object profileData) {
    this.profileData = profileData;
    return this;
  }

   /**
   * Get profileData
   * @return profileData
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.email, user.email) &&
        Objects.equals(this.isBot, user.isBot) &&
        Objects.equals(this.avatarUrl, user.avatarUrl) &&
        Objects.equals(this.avatarVersion, user.avatarVersion) &&
        Objects.equals(this.fullName, user.fullName) &&
        Objects.equals(this.isAdmin, user.isAdmin) &&
        Objects.equals(this.isOwner, user.isOwner) &&
        Objects.equals(this.isBillingAdmin, user.isBillingAdmin) &&
        Objects.equals(this.role, user.role) &&
        Objects.equals(this.botType, user.botType) &&
        Objects.equals(this.userId, user.userId) &&
        Objects.equals(this.botOwnerId, user.botOwnerId) &&
        Objects.equals(this.isActive, user.isActive) &&
        Objects.equals(this.isGuest, user.isGuest) &&
        Objects.equals(this.timezone, user.timezone) &&
        Objects.equals(this.dateJoined, user.dateJoined) &&
        Objects.equals(this.deliveryEmail, user.deliveryEmail) &&
        Objects.equals(this.profileData, user.profileData);
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

