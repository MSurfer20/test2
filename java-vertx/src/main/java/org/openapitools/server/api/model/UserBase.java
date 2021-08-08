package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A dictionary containing basic data on a given Zulip user. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserBase   {
  
  private String email;
  private Boolean isBot;
  private String avatarUrl;
  private Integer avatarVersion;
  private String fullName;
  private Boolean isAdmin;
  private Boolean isOwner;
  private Boolean isBillingAdmin;


  public enum RoleEnum {
    NUMBER_100(100),
    NUMBER_200(200),
    NUMBER_300(300),
    NUMBER_400(400),
    NUMBER_600(600);

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private RoleEnum role;
  private Integer botType;
  private Integer userId;
  private Integer botOwnerId;
  private Boolean isActive;
  private Boolean isGuest;
  private String timezone;
  private String dateJoined;
  private String deliveryEmail;
  private Map<String, Object> profileData = new HashMap<>();

  public UserBase () {

  }

  public UserBase (String email, Boolean isBot, String avatarUrl, Integer avatarVersion, String fullName, Boolean isAdmin, Boolean isOwner, Boolean isBillingAdmin, RoleEnum role, Integer botType, Integer userId, Integer botOwnerId, Boolean isActive, Boolean isGuest, String timezone, String dateJoined, String deliveryEmail, Map<String, Object> profileData) {
    this.email = email;
    this.isBot = isBot;
    this.avatarUrl = avatarUrl;
    this.avatarVersion = avatarVersion;
    this.fullName = fullName;
    this.isAdmin = isAdmin;
    this.isOwner = isOwner;
    this.isBillingAdmin = isBillingAdmin;
    this.role = role;
    this.botType = botType;
    this.userId = userId;
    this.botOwnerId = botOwnerId;
    this.isActive = isActive;
    this.isGuest = isGuest;
    this.timezone = timezone;
    this.dateJoined = dateJoined;
    this.deliveryEmail = deliveryEmail;
    this.profileData = profileData;
  }

    
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

    
  @JsonProperty("is_bot")
  public Boolean getIsBot() {
    return isBot;
  }
  public void setIsBot(Boolean isBot) {
    this.isBot = isBot;
  }

    
  @JsonProperty("avatar_url")
  public String getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

    
  @JsonProperty("avatar_version")
  public Integer getAvatarVersion() {
    return avatarVersion;
  }
  public void setAvatarVersion(Integer avatarVersion) {
    this.avatarVersion = avatarVersion;
  }

    
  @JsonProperty("full_name")
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

    
  @JsonProperty("is_admin")
  public Boolean getIsAdmin() {
    return isAdmin;
  }
  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

    
  @JsonProperty("is_owner")
  public Boolean getIsOwner() {
    return isOwner;
  }
  public void setIsOwner(Boolean isOwner) {
    this.isOwner = isOwner;
  }

    
  @JsonProperty("is_billing_admin")
  public Boolean getIsBillingAdmin() {
    return isBillingAdmin;
  }
  public void setIsBillingAdmin(Boolean isBillingAdmin) {
    this.isBillingAdmin = isBillingAdmin;
  }

    
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

    
  @JsonProperty("bot_type")
  public Integer getBotType() {
    return botType;
  }
  public void setBotType(Integer botType) {
    this.botType = botType;
  }

    
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

    
  @JsonProperty("bot_owner_id")
  public Integer getBotOwnerId() {
    return botOwnerId;
  }
  public void setBotOwnerId(Integer botOwnerId) {
    this.botOwnerId = botOwnerId;
  }

    
  @JsonProperty("is_active")
  public Boolean getIsActive() {
    return isActive;
  }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

    
  @JsonProperty("is_guest")
  public Boolean getIsGuest() {
    return isGuest;
  }
  public void setIsGuest(Boolean isGuest) {
    this.isGuest = isGuest;
  }

    
  @JsonProperty("timezone")
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

    
  @JsonProperty("date_joined")
  public String getDateJoined() {
    return dateJoined;
  }
  public void setDateJoined(String dateJoined) {
    this.dateJoined = dateJoined;
  }

    
  @JsonProperty("delivery_email")
  public String getDeliveryEmail() {
    return deliveryEmail;
  }
  public void setDeliveryEmail(String deliveryEmail) {
    this.deliveryEmail = deliveryEmail;
  }

    
  @JsonProperty("profile_data")
  public Map<String, Object> getProfileData() {
    return profileData;
  }
  public void setProfileData(Map<String, Object> profileData) {
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
    UserBase userBase = (UserBase) o;
    return Objects.equals(email, userBase.email) &&
        Objects.equals(isBot, userBase.isBot) &&
        Objects.equals(avatarUrl, userBase.avatarUrl) &&
        Objects.equals(avatarVersion, userBase.avatarVersion) &&
        Objects.equals(fullName, userBase.fullName) &&
        Objects.equals(isAdmin, userBase.isAdmin) &&
        Objects.equals(isOwner, userBase.isOwner) &&
        Objects.equals(isBillingAdmin, userBase.isBillingAdmin) &&
        Objects.equals(role, userBase.role) &&
        Objects.equals(botType, userBase.botType) &&
        Objects.equals(userId, userBase.userId) &&
        Objects.equals(botOwnerId, userBase.botOwnerId) &&
        Objects.equals(isActive, userBase.isActive) &&
        Objects.equals(isGuest, userBase.isGuest) &&
        Objects.equals(timezone, userBase.timezone) &&
        Objects.equals(dateJoined, userBase.dateJoined) &&
        Objects.equals(deliveryEmail, userBase.deliveryEmail) &&
        Objects.equals(profileData, userBase.profileData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, isBot, avatarUrl, avatarVersion, fullName, isAdmin, isOwner, isBillingAdmin, role, botType, userId, botOwnerId, isActive, isGuest, timezone, dateJoined, deliveryEmail, profileData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBase {\n");
    
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
