using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class User {
    /// <summary>
    /// Gets or Sets Email
    /// </summary>
    [DataMember(Name="email", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "email")]
    public Object Email { get; set; }

    /// <summary>
    /// Gets or Sets IsBot
    /// </summary>
    [DataMember(Name="is_bot", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_bot")]
    public Object IsBot { get; set; }

    /// <summary>
    /// Gets or Sets AvatarUrl
    /// </summary>
    [DataMember(Name="avatar_url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "avatar_url")]
    public Object AvatarUrl { get; set; }

    /// <summary>
    /// Gets or Sets AvatarVersion
    /// </summary>
    [DataMember(Name="avatar_version", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "avatar_version")]
    public Object AvatarVersion { get; set; }

    /// <summary>
    /// Gets or Sets FullName
    /// </summary>
    [DataMember(Name="full_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "full_name")]
    public Object FullName { get; set; }

    /// <summary>
    /// Gets or Sets IsAdmin
    /// </summary>
    [DataMember(Name="is_admin", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_admin")]
    public Object IsAdmin { get; set; }

    /// <summary>
    /// Gets or Sets IsOwner
    /// </summary>
    [DataMember(Name="is_owner", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_owner")]
    public Object IsOwner { get; set; }

    /// <summary>
    /// Gets or Sets IsBillingAdmin
    /// </summary>
    [DataMember(Name="is_billing_admin", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_billing_admin")]
    public Object IsBillingAdmin { get; set; }

    /// <summary>
    /// Gets or Sets Role
    /// </summary>
    [DataMember(Name="role", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "role")]
    public Object Role { get; set; }

    /// <summary>
    /// Gets or Sets BotType
    /// </summary>
    [DataMember(Name="bot_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "bot_type")]
    public Object BotType { get; set; }

    /// <summary>
    /// Gets or Sets UserId
    /// </summary>
    [DataMember(Name="user_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "user_id")]
    public Object UserId { get; set; }

    /// <summary>
    /// Gets or Sets BotOwnerId
    /// </summary>
    [DataMember(Name="bot_owner_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "bot_owner_id")]
    public Object BotOwnerId { get; set; }

    /// <summary>
    /// Gets or Sets IsActive
    /// </summary>
    [DataMember(Name="is_active", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_active")]
    public Object IsActive { get; set; }

    /// <summary>
    /// Gets or Sets IsGuest
    /// </summary>
    [DataMember(Name="is_guest", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_guest")]
    public Object IsGuest { get; set; }

    /// <summary>
    /// Gets or Sets Timezone
    /// </summary>
    [DataMember(Name="timezone", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "timezone")]
    public Object Timezone { get; set; }

    /// <summary>
    /// Gets or Sets DateJoined
    /// </summary>
    [DataMember(Name="date_joined", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "date_joined")]
    public Object DateJoined { get; set; }

    /// <summary>
    /// Gets or Sets DeliveryEmail
    /// </summary>
    [DataMember(Name="delivery_email", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "delivery_email")]
    public Object DeliveryEmail { get; set; }

    /// <summary>
    /// Gets or Sets ProfileData
    /// </summary>
    [DataMember(Name="profile_data", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "profile_data")]
    public Object ProfileData { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class User {\n");
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
