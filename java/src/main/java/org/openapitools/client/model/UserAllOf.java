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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UserAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserAllOf {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private Object email = null;

  public static final String SERIALIZED_NAME_IS_BOT = "is_bot";
  @SerializedName(SERIALIZED_NAME_IS_BOT)
  private Object isBot = null;

  public static final String SERIALIZED_NAME_AVATAR_URL = "avatar_url";
  @SerializedName(SERIALIZED_NAME_AVATAR_URL)
  private Object avatarUrl = null;

  public static final String SERIALIZED_NAME_AVATAR_VERSION = "avatar_version";
  @SerializedName(SERIALIZED_NAME_AVATAR_VERSION)
  private Object avatarVersion = null;

  public static final String SERIALIZED_NAME_FULL_NAME = "full_name";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private Object fullName = null;

  public static final String SERIALIZED_NAME_IS_ADMIN = "is_admin";
  @SerializedName(SERIALIZED_NAME_IS_ADMIN)
  private Object isAdmin = null;

  public static final String SERIALIZED_NAME_IS_OWNER = "is_owner";
  @SerializedName(SERIALIZED_NAME_IS_OWNER)
  private Object isOwner = null;

  public static final String SERIALIZED_NAME_IS_BILLING_ADMIN = "is_billing_admin";
  @SerializedName(SERIALIZED_NAME_IS_BILLING_ADMIN)
  private Object isBillingAdmin = null;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private Object role = null;

  public static final String SERIALIZED_NAME_BOT_TYPE = "bot_type";
  @SerializedName(SERIALIZED_NAME_BOT_TYPE)
  private Object botType = null;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Object userId = null;

  public static final String SERIALIZED_NAME_BOT_OWNER_ID = "bot_owner_id";
  @SerializedName(SERIALIZED_NAME_BOT_OWNER_ID)
  private Object botOwnerId = null;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Object isActive = null;

  public static final String SERIALIZED_NAME_IS_GUEST = "is_guest";
  @SerializedName(SERIALIZED_NAME_IS_GUEST)
  private Object isGuest = null;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private Object timezone = null;

  public static final String SERIALIZED_NAME_DATE_JOINED = "date_joined";
  @SerializedName(SERIALIZED_NAME_DATE_JOINED)
  private Object dateJoined = null;

  public static final String SERIALIZED_NAME_DELIVERY_EMAIL = "delivery_email";
  @SerializedName(SERIALIZED_NAME_DELIVERY_EMAIL)
  private Object deliveryEmail = null;

  public static final String SERIALIZED_NAME_PROFILE_DATA = "profile_data";
  @SerializedName(SERIALIZED_NAME_PROFILE_DATA)
  private Object profileData = null;


  public UserAllOf email(Object email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getEmail() {
    return email;
  }


  public void setEmail(Object email) {
    this.email = email;
  }


  public UserAllOf isBot(Object isBot) {
    
    this.isBot = isBot;
    return this;
  }

   /**
   * Get isBot
   * @return isBot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getIsBot() {
    return isBot;
  }


  public void setIsBot(Object isBot) {
    this.isBot = isBot;
  }


  public UserAllOf avatarUrl(Object avatarUrl) {
    
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * Get avatarUrl
   * @return avatarUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAvatarUrl() {
    return avatarUrl;
  }


  public void setAvatarUrl(Object avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  public UserAllOf avatarVersion(Object avatarVersion) {
    
    this.avatarVersion = avatarVersion;
    return this;
  }

   /**
   * Get avatarVersion
   * @return avatarVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAvatarVersion() {
    return avatarVersion;
  }


  public void setAvatarVersion(Object avatarVersion) {
    this.avatarVersion = avatarVersion;
  }


  public UserAllOf fullName(Object fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getFullName() {
    return fullName;
  }


  public void setFullName(Object fullName) {
    this.fullName = fullName;
  }


  public UserAllOf isAdmin(Object isAdmin) {
    
    this.isAdmin = isAdmin;
    return this;
  }

   /**
   * Get isAdmin
   * @return isAdmin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getIsAdmin() {
    return isAdmin;
  }


  public void setIsAdmin(Object isAdmin) {
    this.isAdmin = isAdmin;
  }


  public UserAllOf isOwner(Object isOwner) {
    
    this.isOwner = isOwner;
    return this;
  }

   /**
   * Get isOwner
   * @return isOwner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getIsOwner() {
    return isOwner;
  }


  public void setIsOwner(Object isOwner) {
    this.isOwner = isOwner;
  }


  public UserAllOf isBillingAdmin(Object isBillingAdmin) {
    
    this.isBillingAdmin = isBillingAdmin;
    return this;
  }

   /**
   * Get isBillingAdmin
   * @return isBillingAdmin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getIsBillingAdmin() {
    return isBillingAdmin;
  }


  public void setIsBillingAdmin(Object isBillingAdmin) {
    this.isBillingAdmin = isBillingAdmin;
  }


  public UserAllOf role(Object role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getRole() {
    return role;
  }


  public void setRole(Object role) {
    this.role = role;
  }


  public UserAllOf botType(Object botType) {
    
    this.botType = botType;
    return this;
  }

   /**
   * Get botType
   * @return botType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getBotType() {
    return botType;
  }


  public void setBotType(Object botType) {
    this.botType = botType;
  }


  public UserAllOf userId(Object userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getUserId() {
    return userId;
  }


  public void setUserId(Object userId) {
    this.userId = userId;
  }


  public UserAllOf botOwnerId(Object botOwnerId) {
    
    this.botOwnerId = botOwnerId;
    return this;
  }

   /**
   * Get botOwnerId
   * @return botOwnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getBotOwnerId() {
    return botOwnerId;
  }


  public void setBotOwnerId(Object botOwnerId) {
    this.botOwnerId = botOwnerId;
  }


  public UserAllOf isActive(Object isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getIsActive() {
    return isActive;
  }


  public void setIsActive(Object isActive) {
    this.isActive = isActive;
  }


  public UserAllOf isGuest(Object isGuest) {
    
    this.isGuest = isGuest;
    return this;
  }

   /**
   * Get isGuest
   * @return isGuest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getIsGuest() {
    return isGuest;
  }


  public void setIsGuest(Object isGuest) {
    this.isGuest = isGuest;
  }


  public UserAllOf timezone(Object timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getTimezone() {
    return timezone;
  }


  public void setTimezone(Object timezone) {
    this.timezone = timezone;
  }


  public UserAllOf dateJoined(Object dateJoined) {
    
    this.dateJoined = dateJoined;
    return this;
  }

   /**
   * Get dateJoined
   * @return dateJoined
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDateJoined() {
    return dateJoined;
  }


  public void setDateJoined(Object dateJoined) {
    this.dateJoined = dateJoined;
  }


  public UserAllOf deliveryEmail(Object deliveryEmail) {
    
    this.deliveryEmail = deliveryEmail;
    return this;
  }

   /**
   * Get deliveryEmail
   * @return deliveryEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDeliveryEmail() {
    return deliveryEmail;
  }


  public void setDeliveryEmail(Object deliveryEmail) {
    this.deliveryEmail = deliveryEmail;
  }


  public UserAllOf profileData(Object profileData) {
    
    this.profileData = profileData;
    return this;
  }

   /**
   * Get profileData
   * @return profileData
  **/
  @javax.annotation.Nullable
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
    UserAllOf userAllOf = (UserAllOf) o;
    return Objects.equals(this.email, userAllOf.email) &&
        Objects.equals(this.isBot, userAllOf.isBot) &&
        Objects.equals(this.avatarUrl, userAllOf.avatarUrl) &&
        Objects.equals(this.avatarVersion, userAllOf.avatarVersion) &&
        Objects.equals(this.fullName, userAllOf.fullName) &&
        Objects.equals(this.isAdmin, userAllOf.isAdmin) &&
        Objects.equals(this.isOwner, userAllOf.isOwner) &&
        Objects.equals(this.isBillingAdmin, userAllOf.isBillingAdmin) &&
        Objects.equals(this.role, userAllOf.role) &&
        Objects.equals(this.botType, userAllOf.botType) &&
        Objects.equals(this.userId, userAllOf.userId) &&
        Objects.equals(this.botOwnerId, userAllOf.botOwnerId) &&
        Objects.equals(this.isActive, userAllOf.isActive) &&
        Objects.equals(this.isGuest, userAllOf.isGuest) &&
        Objects.equals(this.timezone, userAllOf.timezone) &&
        Objects.equals(this.dateJoined, userAllOf.dateJoined) &&
        Objects.equals(this.deliveryEmail, userAllOf.deliveryEmail) &&
        Objects.equals(this.profileData, userAllOf.profileData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, isBot, avatarUrl, avatarVersion, fullName, isAdmin, isOwner, isBillingAdmin, role, botType, userId, botOwnerId, isActive, isGuest, timezone, dateJoined, deliveryEmail, profileData);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

