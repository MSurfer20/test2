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
  public class BasicBot {
    /// <summary>
    /// Gets or Sets UserId
    /// </summary>
    [DataMember(Name="user_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "user_id")]
    public Object UserId { get; set; }

    /// <summary>
    /// Gets or Sets FullName
    /// </summary>
    [DataMember(Name="full_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "full_name")]
    public Object FullName { get; set; }

    /// <summary>
    /// Gets or Sets ApiKey
    /// </summary>
    [DataMember(Name="api_key", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "api_key")]
    public Object ApiKey { get; set; }

    /// <summary>
    /// Gets or Sets DefaultSendingStream
    /// </summary>
    [DataMember(Name="default_sending_stream", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default_sending_stream")]
    public Object DefaultSendingStream { get; set; }

    /// <summary>
    /// Gets or Sets DefaultEventsRegisterStream
    /// </summary>
    [DataMember(Name="default_events_register_stream", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default_events_register_stream")]
    public Object DefaultEventsRegisterStream { get; set; }

    /// <summary>
    /// Gets or Sets DefaultAllPublicStreams
    /// </summary>
    [DataMember(Name="default_all_public_streams", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default_all_public_streams")]
    public Object DefaultAllPublicStreams { get; set; }

    /// <summary>
    /// Gets or Sets AvatarUrl
    /// </summary>
    [DataMember(Name="avatar_url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "avatar_url")]
    public Object AvatarUrl { get; set; }

    /// <summary>
    /// Gets or Sets OwnerId
    /// </summary>
    [DataMember(Name="owner_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "owner_id")]
    public Object OwnerId { get; set; }

    /// <summary>
    /// Gets or Sets Services
    /// </summary>
    [DataMember(Name="services", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "services")]
    public Object Services { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class BasicBot {\n");
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
