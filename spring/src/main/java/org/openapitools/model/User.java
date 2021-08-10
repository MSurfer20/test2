package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.UserAllOf;
import org.openapitools.model.UserBase;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-10T11:47:39.922565Z[Etc/UTC]")
public class User   {
  @JsonProperty("email")
  private JsonNullable<Object> email = JsonNullable.undefined();

  @JsonProperty("is_bot")
  private JsonNullable<Object> isBot = JsonNullable.undefined();

  @JsonProperty("avatar_url")
  private JsonNullable<Object> avatarUrl = JsonNullable.undefined();

  @JsonProperty("avatar_version")
  private JsonNullable<Object> avatarVersion = JsonNullable.undefined();

  @JsonProperty("full_name")
  private JsonNullable<Object> fullName = JsonNullable.undefined();

  @JsonProperty("is_admin")
  private JsonNullable<Object> isAdmin = JsonNullable.undefined();

  @JsonProperty("is_owner")
  private JsonNullable<Object> isOwner = JsonNullable.undefined();

  @JsonProperty("is_billing_admin")
  private JsonNullable<Object> isBillingAdmin = JsonNullable.undefined();

  @JsonProperty("role")
  private JsonNullable<Object> role = JsonNullable.undefined();

  @JsonProperty("bot_type")
  private JsonNullable<Object> botType = JsonNullable.undefined();

  @JsonProperty("user_id")
  private JsonNullable<Object> userId = JsonNullable.undefined();

  @JsonProperty("bot_owner_id")
  private JsonNullable<Object> botOwnerId = JsonNullable.undefined();

  @JsonProperty("is_active")
  private JsonNullable<Object> isActive = JsonNullable.undefined();

  @JsonProperty("is_guest")
  private JsonNullable<Object> isGuest = JsonNullable.undefined();

  @JsonProperty("timezone")
  private JsonNullable<Object> timezone = JsonNullable.undefined();

  @JsonProperty("date_joined")
  private JsonNullable<Object> dateJoined = JsonNullable.undefined();

  @JsonProperty("delivery_email")
  private JsonNullable<Object> deliveryEmail = JsonNullable.undefined();

  @JsonProperty("profile_data")
  private JsonNullable<Object> profileData = JsonNullable.undefined();

  public User email(Object email) {
    this.email = JsonNullable.of(email);
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getEmail() {
    return email;
  }

  public void setEmail(JsonNullable<Object> email) {
    this.email = email;
  }

  public User isBot(Object isBot) {
    this.isBot = JsonNullable.of(isBot);
    return this;
  }

  /**
   * Get isBot
   * @return isBot
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getIsBot() {
    return isBot;
  }

  public void setIsBot(JsonNullable<Object> isBot) {
    this.isBot = isBot;
  }

  public User avatarUrl(Object avatarUrl) {
    this.avatarUrl = JsonNullable.of(avatarUrl);
    return this;
  }

  /**
   * Get avatarUrl
   * @return avatarUrl
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(JsonNullable<Object> avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public User avatarVersion(Object avatarVersion) {
    this.avatarVersion = JsonNullable.of(avatarVersion);
    return this;
  }

  /**
   * Get avatarVersion
   * @return avatarVersion
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getAvatarVersion() {
    return avatarVersion;
  }

  public void setAvatarVersion(JsonNullable<Object> avatarVersion) {
    this.avatarVersion = avatarVersion;
  }

  public User fullName(Object fullName) {
    this.fullName = JsonNullable.of(fullName);
    return this;
  }

  /**
   * Get fullName
   * @return fullName
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getFullName() {
    return fullName;
  }

  public void setFullName(JsonNullable<Object> fullName) {
    this.fullName = fullName;
  }

  public User isAdmin(Object isAdmin) {
    this.isAdmin = JsonNullable.of(isAdmin);
    return this;
  }

  /**
   * Get isAdmin
   * @return isAdmin
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(JsonNullable<Object> isAdmin) {
    this.isAdmin = isAdmin;
  }

  public User isOwner(Object isOwner) {
    this.isOwner = JsonNullable.of(isOwner);
    return this;
  }

  /**
   * Get isOwner
   * @return isOwner
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getIsOwner() {
    return isOwner;
  }

  public void setIsOwner(JsonNullable<Object> isOwner) {
    this.isOwner = isOwner;
  }

  public User isBillingAdmin(Object isBillingAdmin) {
    this.isBillingAdmin = JsonNullable.of(isBillingAdmin);
    return this;
  }

  /**
   * Get isBillingAdmin
   * @return isBillingAdmin
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getIsBillingAdmin() {
    return isBillingAdmin;
  }

  public void setIsBillingAdmin(JsonNullable<Object> isBillingAdmin) {
    this.isBillingAdmin = isBillingAdmin;
  }

  public User role(Object role) {
    this.role = JsonNullable.of(role);
    return this;
  }

  /**
   * Get role
   * @return role
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getRole() {
    return role;
  }

  public void setRole(JsonNullable<Object> role) {
    this.role = role;
  }

  public User botType(Object botType) {
    this.botType = JsonNullable.of(botType);
    return this;
  }

  /**
   * Get botType
   * @return botType
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getBotType() {
    return botType;
  }

  public void setBotType(JsonNullable<Object> botType) {
    this.botType = botType;
  }

  public User userId(Object userId) {
    this.userId = JsonNullable.of(userId);
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getUserId() {
    return userId;
  }

  public void setUserId(JsonNullable<Object> userId) {
    this.userId = userId;
  }

  public User botOwnerId(Object botOwnerId) {
    this.botOwnerId = JsonNullable.of(botOwnerId);
    return this;
  }

  /**
   * Get botOwnerId
   * @return botOwnerId
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getBotOwnerId() {
    return botOwnerId;
  }

  public void setBotOwnerId(JsonNullable<Object> botOwnerId) {
    this.botOwnerId = botOwnerId;
  }

  public User isActive(Object isActive) {
    this.isActive = JsonNullable.of(isActive);
    return this;
  }

  /**
   * Get isActive
   * @return isActive
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getIsActive() {
    return isActive;
  }

  public void setIsActive(JsonNullable<Object> isActive) {
    this.isActive = isActive;
  }

  public User isGuest(Object isGuest) {
    this.isGuest = JsonNullable.of(isGuest);
    return this;
  }

  /**
   * Get isGuest
   * @return isGuest
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getIsGuest() {
    return isGuest;
  }

  public void setIsGuest(JsonNullable<Object> isGuest) {
    this.isGuest = isGuest;
  }

  public User timezone(Object timezone) {
    this.timezone = JsonNullable.of(timezone);
    return this;
  }

  /**
   * Get timezone
   * @return timezone
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getTimezone() {
    return timezone;
  }

  public void setTimezone(JsonNullable<Object> timezone) {
    this.timezone = timezone;
  }

  public User dateJoined(Object dateJoined) {
    this.dateJoined = JsonNullable.of(dateJoined);
    return this;
  }

  /**
   * Get dateJoined
   * @return dateJoined
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getDateJoined() {
    return dateJoined;
  }

  public void setDateJoined(JsonNullable<Object> dateJoined) {
    this.dateJoined = dateJoined;
  }

  public User deliveryEmail(Object deliveryEmail) {
    this.deliveryEmail = JsonNullable.of(deliveryEmail);
    return this;
  }

  /**
   * Get deliveryEmail
   * @return deliveryEmail
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getDeliveryEmail() {
    return deliveryEmail;
  }

  public void setDeliveryEmail(JsonNullable<Object> deliveryEmail) {
    this.deliveryEmail = deliveryEmail;
  }

  public User profileData(Object profileData) {
    this.profileData = JsonNullable.of(profileData);
    return this;
  }

  /**
   * Get profileData
   * @return profileData
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Object> getProfileData() {
    return profileData;
  }

  public void setProfileData(JsonNullable<Object> profileData) {
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

