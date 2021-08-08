package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * A dictionary containing basic data on a given Zulip user. 
 **/

@ApiModel(description = "A dictionary containing basic data on a given Zulip user. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2021-08-08T21:11:32.310747Z[Etc/UTC]")
public class UserBase   {
  @JsonProperty("email")
  private String email;

  @JsonProperty("is_bot")
  private Boolean isBot;

  @JsonProperty("avatar_url")
  private String avatarUrl;

  @JsonProperty("avatar_version")
  private Integer avatarVersion;

  @JsonProperty("full_name")
  private String fullName;

  @JsonProperty("is_admin")
  private Boolean isAdmin;

  @JsonProperty("is_owner")
  private Boolean isOwner;

  @JsonProperty("is_billing_admin")
  private Boolean isBillingAdmin;

  /**
   * [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
   */
  public enum RoleEnum {
    NUMBER_100(100),
    
    NUMBER_200(200),
    
    NUMBER_300(300),
    
    NUMBER_400(400),
    
    NUMBER_600(600);

    private Integer value;

    RoleEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String text) {
      for (RoleEnum b : RoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("role")
  private RoleEnum role;

  @JsonProperty("bot_type")
  private Integer botType;

  @JsonProperty("user_id")
  private Integer userId;

  @JsonProperty("bot_owner_id")
  private Integer botOwnerId;

  @JsonProperty("is_active")
  private Boolean isActive;

  @JsonProperty("is_guest")
  private Boolean isGuest;

  @JsonProperty("timezone")
  private String timezone;

  @JsonProperty("date_joined")
  private String dateJoined;

  @JsonProperty("delivery_email")
  private String deliveryEmail;

  @JsonProperty("profile_data")
  private Map<String, Object> profileData = null;

  /**
   * The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. 
   **/
  public UserBase email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(value = "The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. ")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * A boolean specifying whether the user is a bot or full account. 
   **/
  public UserBase isBot(Boolean isBot) {
    this.isBot = isBot;
    return this;
  }

  
  @ApiModelProperty(value = "A boolean specifying whether the user is a bot or full account. ")
  @JsonProperty("is_bot")
  public Boolean getIsBot() {
    return isBot;
  }
  public void setIsBot(Boolean isBot) {
    this.isBot = isBot;
  }

  /**
   * URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion. 
   **/
  public UserBase avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

  
  @ApiModelProperty(value = "URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion. ")
  @JsonProperty("avatar_url")
  public String getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  /**
   * Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`. 
   **/
  public UserBase avatarVersion(Integer avatarVersion) {
    this.avatarVersion = avatarVersion;
    return this;
  }

  
  @ApiModelProperty(value = "Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`. ")
  @JsonProperty("avatar_version")
  public Integer getAvatarVersion() {
    return avatarVersion;
  }
  public void setAvatarVersion(Integer avatarVersion) {
    this.avatarVersion = avatarVersion;
  }

  /**
   * Full name of the user or bot, used for all display purposes. 
   **/
  public UserBase fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  
  @ApiModelProperty(value = "Full name of the user or bot, used for all display purposes. ")
  @JsonProperty("full_name")
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  /**
   * A boolean specifying whether the user is an organization administrator. 
   **/
  public UserBase isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

  
  @ApiModelProperty(value = "A boolean specifying whether the user is an organization administrator. ")
  @JsonProperty("is_admin")
  public Boolean getIsAdmin() {
    return isAdmin;
  }
  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  /**
   * A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). 
   **/
  public UserBase isOwner(Boolean isOwner) {
    this.isOwner = isOwner;
    return this;
  }

  
  @ApiModelProperty(value = "A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). ")
  @JsonProperty("is_owner")
  public Boolean getIsOwner() {
    return isOwner;
  }
  public void setIsOwner(Boolean isOwner) {
    this.isOwner = isOwner;
  }

  /**
   * A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). 
   **/
  public UserBase isBillingAdmin(Boolean isBillingAdmin) {
    this.isBillingAdmin = isBillingAdmin;
    return this;
  }

  
  @ApiModelProperty(value = "A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). ")
  @JsonProperty("is_billing_admin")
  public Boolean getIsBillingAdmin() {
    return isBillingAdmin;
  }
  public void setIsBillingAdmin(Boolean isBillingAdmin) {
    this.isBillingAdmin = isBillingAdmin;
  }

  /**
   * [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
   **/
  public UserBase role(RoleEnum role) {
    this.role = role;
    return this;
  }

  
  @ApiModelProperty(value = "[Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). ")
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   * An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
   **/
  public UserBase botType(Integer botType) {
    this.botType = botType;
    return this;
  }

  
  @ApiModelProperty(value = "An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. ")
  @JsonProperty("bot_type")
  public Integer getBotType() {
    return botType;
  }
  public void setBotType(Integer botType) {
    this.botType = botType;
  }

  /**
   * The unique ID of the user. 
   **/
  public UserBase userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  
  @ApiModelProperty(value = "The unique ID of the user. ")
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner. 
   **/
  public UserBase botOwnerId(Integer botOwnerId) {
    this.botOwnerId = botOwnerId;
    return this;
  }

  
  @ApiModelProperty(value = "If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner. ")
  @JsonProperty("bot_owner_id")
  public Integer getBotOwnerId() {
    return botOwnerId;
  }
  public void setBotOwnerId(Integer botOwnerId) {
    this.botOwnerId = botOwnerId;
  }

  /**
   * A boolean specifying whether the user account has been deactivated. 
   **/
  public UserBase isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  
  @ApiModelProperty(value = "A boolean specifying whether the user account has been deactivated. ")
  @JsonProperty("is_active")
  public Boolean getIsActive() {
    return isActive;
  }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  /**
   * A boolean specifying whether the user is a guest user. 
   **/
  public UserBase isGuest(Boolean isGuest) {
    this.isGuest = isGuest;
    return this;
  }

  
  @ApiModelProperty(value = "A boolean specifying whether the user is a guest user. ")
  @JsonProperty("is_guest")
  public Boolean getIsGuest() {
    return isGuest;
  }
  public void setIsGuest(Boolean isGuest) {
    this.isGuest = isGuest;
  }

  /**
   * The time zone of the user. 
   **/
  public UserBase timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  
  @ApiModelProperty(value = "The time zone of the user. ")
  @JsonProperty("timezone")
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  /**
   * The time the user account was created. 
   **/
  public UserBase dateJoined(String dateJoined) {
    this.dateJoined = dateJoined;
    return this;
  }

  
  @ApiModelProperty(value = "The time the user account was created. ")
  @JsonProperty("date_joined")
  public String getDateJoined() {
    return dateJoined;
  }
  public void setDateJoined(String dateJoined) {
    this.dateJoined = dateJoined;
  }

  /**
   * The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. 
   **/
  public UserBase deliveryEmail(String deliveryEmail) {
    this.deliveryEmail = deliveryEmail;
    return this;
  }

  
  @ApiModelProperty(value = "The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. ")
  @JsonProperty("delivery_email")
  public String getDeliveryEmail() {
    return deliveryEmail;
  }
  public void setDeliveryEmail(String deliveryEmail) {
    this.deliveryEmail = deliveryEmail;
  }

  /**
   * A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present. 
   **/
  public UserBase profileData(Map<String, Object> profileData) {
    this.profileData = profileData;
    return this;
  }

  
  @ApiModelProperty(value = "A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present. ")
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

