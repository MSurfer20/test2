using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// A dictionary containing basic data on a given Zulip user. 
  /// </summary>
  [DataContract]
  public class UserBase {
    /// <summary>
    /// The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. 
    /// </summary>
    /// <value>The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. </value>
    [DataMember(Name="email", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "email")]
    public string Email { get; set; }

    /// <summary>
    /// A boolean specifying whether the user is a bot or full account. 
    /// </summary>
    /// <value>A boolean specifying whether the user is a bot or full account. </value>
    [DataMember(Name="is_bot", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_bot")]
    public bool? IsBot { get; set; }

    /// <summary>
    /// URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion. 
    /// </summary>
    /// <value>URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion. </value>
    [DataMember(Name="avatar_url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "avatar_url")]
    public string AvatarUrl { get; set; }

    /// <summary>
    /// Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`. 
    /// </summary>
    /// <value>Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`. </value>
    [DataMember(Name="avatar_version", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "avatar_version")]
    public int? AvatarVersion { get; set; }

    /// <summary>
    /// Full name of the user or bot, used for all display purposes. 
    /// </summary>
    /// <value>Full name of the user or bot, used for all display purposes. </value>
    [DataMember(Name="full_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "full_name")]
    public string FullName { get; set; }

    /// <summary>
    /// A boolean specifying whether the user is an organization administrator. 
    /// </summary>
    /// <value>A boolean specifying whether the user is an organization administrator. </value>
    [DataMember(Name="is_admin", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_admin")]
    public bool? IsAdmin { get; set; }

    /// <summary>
    /// A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). 
    /// </summary>
    /// <value>A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). </value>
    [DataMember(Name="is_owner", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_owner")]
    public bool? IsOwner { get; set; }

    /// <summary>
    /// A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). 
    /// </summary>
    /// <value>A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). </value>
    [DataMember(Name="is_billing_admin", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_billing_admin")]
    public bool? IsBillingAdmin { get; set; }

    /// <summary>
    /// [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
    /// </summary>
    /// <value>[Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). </value>
    [DataMember(Name="role", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "role")]
    public int? Role { get; set; }

    /// <summary>
    /// An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
    /// </summary>
    /// <value>An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. </value>
    [DataMember(Name="bot_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "bot_type")]
    public int? BotType { get; set; }

    /// <summary>
    /// The unique ID of the user. 
    /// </summary>
    /// <value>The unique ID of the user. </value>
    [DataMember(Name="user_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "user_id")]
    public int? UserId { get; set; }

    /// <summary>
    /// If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner. 
    /// </summary>
    /// <value>If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner. </value>
    [DataMember(Name="bot_owner_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "bot_owner_id")]
    public int? BotOwnerId { get; set; }

    /// <summary>
    /// A boolean specifying whether the user account has been deactivated. 
    /// </summary>
    /// <value>A boolean specifying whether the user account has been deactivated. </value>
    [DataMember(Name="is_active", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_active")]
    public bool? IsActive { get; set; }

    /// <summary>
    /// A boolean specifying whether the user is a guest user. 
    /// </summary>
    /// <value>A boolean specifying whether the user is a guest user. </value>
    [DataMember(Name="is_guest", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_guest")]
    public bool? IsGuest { get; set; }

    /// <summary>
    /// The time zone of the user. 
    /// </summary>
    /// <value>The time zone of the user. </value>
    [DataMember(Name="timezone", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "timezone")]
    public string Timezone { get; set; }

    /// <summary>
    /// The time the user account was created. 
    /// </summary>
    /// <value>The time the user account was created. </value>
    [DataMember(Name="date_joined", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "date_joined")]
    public string DateJoined { get; set; }

    /// <summary>
    /// The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. 
    /// </summary>
    /// <value>The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. </value>
    [DataMember(Name="delivery_email", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "delivery_email")]
    public string DeliveryEmail { get; set; }

    /// <summary>
    /// A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present. 
    /// </summary>
    /// <value>A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present. </value>
    [DataMember(Name="profile_data", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "profile_data")]
    public Dictionary<string, Object> ProfileData { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class UserBase {\n");
      sb.Append("  Email: ").Append(Email).Append("\n");
      sb.Append("  IsBot: ").Append(IsBot).Append("\n");
      sb.Append("  AvatarUrl: ").Append(AvatarUrl).Append("\n");
      sb.Append("  AvatarVersion: ").Append(AvatarVersion).Append("\n");
      sb.Append("  FullName: ").Append(FullName).Append("\n");
      sb.Append("  IsAdmin: ").Append(IsAdmin).Append("\n");
      sb.Append("  IsOwner: ").Append(IsOwner).Append("\n");
      sb.Append("  IsBillingAdmin: ").Append(IsBillingAdmin).Append("\n");
      sb.Append("  Role: ").Append(Role).Append("\n");
      sb.Append("  BotType: ").Append(BotType).Append("\n");
      sb.Append("  UserId: ").Append(UserId).Append("\n");
      sb.Append("  BotOwnerId: ").Append(BotOwnerId).Append("\n");
      sb.Append("  IsActive: ").Append(IsActive).Append("\n");
      sb.Append("  IsGuest: ").Append(IsGuest).Append("\n");
      sb.Append("  Timezone: ").Append(Timezone).Append("\n");
      sb.Append("  DateJoined: ").Append(DateJoined).Append("\n");
      sb.Append("  DeliveryEmail: ").Append(DeliveryEmail).Append("\n");
      sb.Append("  ProfileData: ").Append(ProfileData).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
    }

}
}
