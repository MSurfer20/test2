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
  public class BasicBotBase {
    /// <summary>
    /// The user id of the bot. 
    /// </summary>
    /// <value>The user id of the bot. </value>
    [DataMember(Name="user_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "user_id")]
    public int? UserId { get; set; }

    /// <summary>
    /// The full name of the bot. 
    /// </summary>
    /// <value>The full name of the bot. </value>
    [DataMember(Name="full_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "full_name")]
    public string FullName { get; set; }

    /// <summary>
    /// The API key of the bot which it uses to make API requests. 
    /// </summary>
    /// <value>The API key of the bot which it uses to make API requests. </value>
    [DataMember(Name="api_key", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "api_key")]
    public string ApiKey { get; set; }

    /// <summary>
    /// The default sending stream of the bot. Null if the bot doesn't have a default sending stream. 
    /// </summary>
    /// <value>The default sending stream of the bot. Null if the bot doesn't have a default sending stream. </value>
    [DataMember(Name="default_sending_stream", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default_sending_stream")]
    public string DefaultSendingStream { get; set; }

    /// <summary>
    /// The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. 
    /// </summary>
    /// <value>The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. </value>
    [DataMember(Name="default_events_register_stream", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default_events_register_stream")]
    public string DefaultEventsRegisterStream { get; set; }

    /// <summary>
    /// Whether the bot can send messages to all streams by default. 
    /// </summary>
    /// <value>Whether the bot can send messages to all streams by default. </value>
    [DataMember(Name="default_all_public_streams", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default_all_public_streams")]
    public bool? DefaultAllPublicStreams { get; set; }

    /// <summary>
    /// The URL of the bot's avatar. 
    /// </summary>
    /// <value>The URL of the bot's avatar. </value>
    [DataMember(Name="avatar_url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "avatar_url")]
    public string AvatarUrl { get; set; }

    /// <summary>
    /// The user id of the bot's owner.  Null if the bot has no owner. 
    /// </summary>
    /// <value>The user id of the bot's owner.  Null if the bot has no owner. </value>
    [DataMember(Name="owner_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "owner_id")]
    public int? OwnerId { get; set; }

    /// <summary>
    /// The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
    /// </summary>
    /// <value>The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. </value>
    [DataMember(Name="services", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "services")]
    public List<OneOfobjectobject> Services { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class BasicBotBase {\n");
      sb.Append("  UserId: ").Append(UserId).Append("\n");
      sb.Append("  FullName: ").Append(FullName).Append("\n");
      sb.Append("  ApiKey: ").Append(ApiKey).Append("\n");
      sb.Append("  DefaultSendingStream: ").Append(DefaultSendingStream).Append("\n");
      sb.Append("  DefaultEventsRegisterStream: ").Append(DefaultEventsRegisterStream).Append("\n");
      sb.Append("  DefaultAllPublicStreams: ").Append(DefaultAllPublicStreams).Append("\n");
      sb.Append("  AvatarUrl: ").Append(AvatarUrl).Append("\n");
      sb.Append("  OwnerId: ").Append(OwnerId).Append("\n");
      sb.Append("  Services: ").Append(Services).Append("\n");
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
