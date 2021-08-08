package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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


/**
 * A dictionary containing basic data on a given Zulip user. 
 */
@ApiModel(description="A dictionary containing basic data on a given Zulip user. ")

public class UserBase  {
  
 /**
  * The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. 
  */
  @ApiModelProperty(value = "The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. ")
  private String email;

 /**
  * A boolean specifying whether the user is a bot or full account. 
  */
  @ApiModelProperty(value = "A boolean specifying whether the user is a bot or full account. ")
  private Boolean isBot;

 /**
  * URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion. 
  */
  @ApiModelProperty(value = "URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion. ")
  private String avatarUrl;

 /**
  * Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`. 
  */
  @ApiModelProperty(value = "Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`. ")
  private Integer avatarVersion;

 /**
  * Full name of the user or bot, used for all display purposes. 
  */
  @ApiModelProperty(value = "Full name of the user or bot, used for all display purposes. ")
  private String fullName;

 /**
  * A boolean specifying whether the user is an organization administrator. 
  */
  @ApiModelProperty(value = "A boolean specifying whether the user is an organization administrator. ")
  private Boolean isAdmin;

 /**
  * A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). 
  */
  @ApiModelProperty(value = "A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). ")
  private Boolean isOwner;

 /**
  * A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). 
  */
  @ApiModelProperty(value = "A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). ")
  private Boolean isBillingAdmin;

@XmlType(name="RoleEnum")
@XmlEnum(Integer.class)
public enum RoleEnum {

    @XmlEnumValue("100") @JsonProperty("100") NUMBER_100(Integer.valueOf(100)), 
    @XmlEnumValue("200") @JsonProperty("200") NUMBER_200(Integer.valueOf(200)), 
    @XmlEnumValue("300") @JsonProperty("300") NUMBER_300(Integer.valueOf(300)), 
    @XmlEnumValue("400") @JsonProperty("400") NUMBER_400(Integer.valueOf(400)), 
    @XmlEnumValue("600") @JsonProperty("600") NUMBER_600(Integer.valueOf(600));

    private Integer value;

    RoleEnum (Integer v) {
        value = v;
    }

    public Integer value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RoleEnum fromValue(Integer value) {
        for (RoleEnum b : RoleEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
  */
  @ApiModelProperty(value = "[Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). ")
  private RoleEnum role;

 /**
  * An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
  */
  @ApiModelProperty(value = "An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. ")
  private Integer botType;

 /**
  * The unique ID of the user. 
  */
  @ApiModelProperty(value = "The unique ID of the user. ")
  private Integer userId;

 /**
  * If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner. 
  */
  @ApiModelProperty(value = "If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner. ")
  private Integer botOwnerId;

 /**
  * A boolean specifying whether the user account has been deactivated. 
  */
  @ApiModelProperty(value = "A boolean specifying whether the user account has been deactivated. ")
  private Boolean isActive;

 /**
  * A boolean specifying whether the user is a guest user. 
  */
  @ApiModelProperty(value = "A boolean specifying whether the user is a guest user. ")
  private Boolean isGuest;

 /**
  * The time zone of the user. 
  */
  @ApiModelProperty(value = "The time zone of the user. ")
  private String timezone;

 /**
  * The time the user account was created. 
  */
  @ApiModelProperty(value = "The time the user account was created. ")
  private String dateJoined;

 /**
  * The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. 
  */
  @ApiModelProperty(value = "The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. ")
  private String deliveryEmail;

 /**
  * A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present. 
  */
  @ApiModelProperty(value = "A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present. ")
  private Map<String, Object> profileData = null;
 /**
  * The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. 
  * @return email
  */
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  /**
   * Sets the <code>email</code> property.
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Sets the <code>email</code> property.
   */
  public UserBase email(String email) {
    this.email = email;
    return this;
  }

 /**
  * A boolean specifying whether the user is a bot or full account. 
  * @return isBot
  */
  @JsonProperty("is_bot")
  public Boolean getIsBot() {
    return isBot;
  }

  /**
   * Sets the <code>isBot</code> property.
   */
  public void setIsBot(Boolean isBot) {
    this.isBot = isBot;
  }

  /**
   * Sets the <code>isBot</code> property.
   */
  public UserBase isBot(Boolean isBot) {
    this.isBot = isBot;
    return this;
  }

 /**
  * URL for the user&#39;s avatar.  Will be &#x60;null&#x60; if the &#x60;client_gravatar&#x60; query parameter was set to &#x60;True&#x60; and the user&#39;s avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the &#x60;user_avatar_url_field_optional&#x60; capability, this will be missing at the server&#39;s sole discretion. 
  * @return avatarUrl
  */
  @JsonProperty("avatar_url")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  /**
   * Sets the <code>avatarUrl</code> property.
   */
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  /**
   * Sets the <code>avatarUrl</code> property.
   */
  public UserBase avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

 /**
  * Version for the user&#39;s avatar.  Used for cache-busting requests for the user&#39;s avatar.  Clients generally shouldn&#39;t need to use this; most avatar URLs sent by Zulip will already end with &#x60;?v&#x3D;{avatar_version}&#x60;. 
  * @return avatarVersion
  */
  @JsonProperty("avatar_version")
  public Integer getAvatarVersion() {
    return avatarVersion;
  }

  /**
   * Sets the <code>avatarVersion</code> property.
   */
  public void setAvatarVersion(Integer avatarVersion) {
    this.avatarVersion = avatarVersion;
  }

  /**
   * Sets the <code>avatarVersion</code> property.
   */
  public UserBase avatarVersion(Integer avatarVersion) {
    this.avatarVersion = avatarVersion;
    return this;
  }

 /**
  * Full name of the user or bot, used for all display purposes. 
  * @return fullName
  */
  @JsonProperty("full_name")
  public String getFullName() {
    return fullName;
  }

  /**
   * Sets the <code>fullName</code> property.
   */
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  /**
   * Sets the <code>fullName</code> property.
   */
  public UserBase fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

 /**
  * A boolean specifying whether the user is an organization administrator. 
  * @return isAdmin
  */
  @JsonProperty("is_admin")
  public Boolean getIsAdmin() {
    return isAdmin;
  }

  /**
   * Sets the <code>isAdmin</code> property.
   */
  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  /**
   * Sets the <code>isAdmin</code> property.
   */
  public UserBase isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

 /**
  * A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). 
  * @return isOwner
  */
  @JsonProperty("is_owner")
  public Boolean getIsOwner() {
    return isOwner;
  }

  /**
   * Sets the <code>isOwner</code> property.
   */
  public void setIsOwner(Boolean isOwner) {
    this.isOwner = isOwner;
  }

  /**
   * Sets the <code>isOwner</code> property.
   */
  public UserBase isOwner(Boolean isOwner) {
    this.isOwner = isOwner;
    return this;
  }

 /**
  * A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). 
  * @return isBillingAdmin
  */
  @JsonProperty("is_billing_admin")
  public Boolean getIsBillingAdmin() {
    return isBillingAdmin;
  }

  /**
   * Sets the <code>isBillingAdmin</code> property.
   */
  public void setIsBillingAdmin(Boolean isBillingAdmin) {
    this.isBillingAdmin = isBillingAdmin;
  }

  /**
   * Sets the <code>isBillingAdmin</code> property.
   */
  public UserBase isBillingAdmin(Boolean isBillingAdmin) {
    this.isBillingAdmin = isBillingAdmin;
    return this;
  }

 /**
  * [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner &#x3D;&gt; 100 * Organization administrator &#x3D;&gt; 200 * Organization moderator &#x3D;&gt; 300 * Member &#x3D;&gt; 400 * Guest &#x3D;&gt; 600  **Changes**: New in Zulip 4.0 (feature level 59). 
  * @return role
  */
  @JsonProperty("role")
  public Integer getRole() {
    return role == null ? null : role.value();
  }

  /**
   * Sets the <code>role</code> property.
   */
  public void setRole(RoleEnum role) {
    this.role = role;
  }

  /**
   * Sets the <code>role</code> property.
   */
  public UserBase role(RoleEnum role) {
    this.role = role;
    return this;
  }

 /**
  * An integer describing the type of bot: * &#x60;null&#x60; if the user isn&#39;t a bot. * &#x60;1&#x60; for a &#x60;Generic&#x60; bot. * &#x60;2&#x60; for an &#x60;Incoming webhook&#x60; bot. * &#x60;3&#x60; for an &#x60;Outgoing webhook&#x60; bot. * &#x60;4&#x60; for an &#x60;Embedded&#x60; bot. 
  * @return botType
  */
  @JsonProperty("bot_type")
  public Integer getBotType() {
    return botType;
  }

  /**
   * Sets the <code>botType</code> property.
   */
  public void setBotType(Integer botType) {
    this.botType = botType;
  }

  /**
   * Sets the <code>botType</code> property.
   */
  public UserBase botType(Integer botType) {
    this.botType = botType;
    return this;
  }

 /**
  * The unique ID of the user. 
  * @return userId
  */
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }

  /**
   * Sets the <code>userId</code> property.
   */
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * Sets the <code>userId</code> property.
   */
  public UserBase userId(Integer userId) {
    this.userId = userId;
    return this;
  }

 /**
  * If the user is a bot (i.e. &#x60;is_bot&#x60; is &#x60;True&#x60;), &#x60;bot_owner&#x60; is the user ID of the bot&#39;s owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a &#x60;bot_owner&#x60; field containing the email address of the bot&#39;s owner. 
  * @return botOwnerId
  */
  @JsonProperty("bot_owner_id")
  public Integer getBotOwnerId() {
    return botOwnerId;
  }

  /**
   * Sets the <code>botOwnerId</code> property.
   */
  public void setBotOwnerId(Integer botOwnerId) {
    this.botOwnerId = botOwnerId;
  }

  /**
   * Sets the <code>botOwnerId</code> property.
   */
  public UserBase botOwnerId(Integer botOwnerId) {
    this.botOwnerId = botOwnerId;
    return this;
  }

 /**
  * A boolean specifying whether the user account has been deactivated. 
  * @return isActive
  */
  @JsonProperty("is_active")
  public Boolean getIsActive() {
    return isActive;
  }

  /**
   * Sets the <code>isActive</code> property.
   */
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  /**
   * Sets the <code>isActive</code> property.
   */
  public UserBase isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

 /**
  * A boolean specifying whether the user is a guest user. 
  * @return isGuest
  */
  @JsonProperty("is_guest")
  public Boolean getIsGuest() {
    return isGuest;
  }

  /**
   * Sets the <code>isGuest</code> property.
   */
  public void setIsGuest(Boolean isGuest) {
    this.isGuest = isGuest;
  }

  /**
   * Sets the <code>isGuest</code> property.
   */
  public UserBase isGuest(Boolean isGuest) {
    this.isGuest = isGuest;
    return this;
  }

 /**
  * The time zone of the user. 
  * @return timezone
  */
  @JsonProperty("timezone")
  public String getTimezone() {
    return timezone;
  }

  /**
   * Sets the <code>timezone</code> property.
   */
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  /**
   * Sets the <code>timezone</code> property.
   */
  public UserBase timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

 /**
  * The time the user account was created. 
  * @return dateJoined
  */
  @JsonProperty("date_joined")
  public String getDateJoined() {
    return dateJoined;
  }

  /**
   * Sets the <code>dateJoined</code> property.
   */
  public void setDateJoined(String dateJoined) {
    this.dateJoined = dateJoined;
  }

  /**
   * Sets the <code>dateJoined</code> property.
   */
  public UserBase dateJoined(String dateJoined) {
    this.dateJoined = dateJoined;
    return this;
  }

 /**
  * The user&#39;s real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. 
  * @return deliveryEmail
  */
  @JsonProperty("delivery_email")
  public String getDeliveryEmail() {
    return deliveryEmail;
  }

  /**
   * Sets the <code>deliveryEmail</code> property.
   */
  public void setDeliveryEmail(String deliveryEmail) {
    this.deliveryEmail = deliveryEmail;
  }

  /**
   * Sets the <code>deliveryEmail</code> property.
   */
  public UserBase deliveryEmail(String deliveryEmail) {
    this.deliveryEmail = deliveryEmail;
    return this;
  }

 /**
  * A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user&#39;s data for that field.  Generally the data includes just a single &#x60;value&#x60; key; for those custom profile fields supporting Markdown, a &#x60;rendered_value&#x60; key will also be present. 
  * @return profileData
  */
  @JsonProperty("profile_data")
  public Map<String, Object> getProfileData() {
    return profileData;
  }

  /**
   * Sets the <code>profileData</code> property.
   */
  public void setProfileData(Map<String, Object> profileData) {
    this.profileData = profileData;
  }

  /**
   * Sets the <code>profileData</code> property.
   */
  public UserBase profileData(Map<String, Object> profileData) {
    this.profileData = profileData;
    return this;
  }

  /**
   * Puts a new item into the <code>profileData</code> map.
   */
  public UserBase putProfileDataItem(String key, Object profileDataItem) {
    this.profileData.put(key, profileDataItem);
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

