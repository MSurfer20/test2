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
  public class BasicStreamAllOf {
    /// <summary>
    /// Gets or Sets StreamId
    /// </summary>
    [DataMember(Name="stream_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stream_id")]
    public Object StreamId { get; set; }

    /// <summary>
    /// Gets or Sets Name
    /// </summary>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public Object Name { get; set; }

    /// <summary>
    /// Gets or Sets Description
    /// </summary>
    [DataMember(Name="description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "description")]
    public Object Description { get; set; }

    /// <summary>
    /// Gets or Sets DateCreated
    /// </summary>
    [DataMember(Name="date_created", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "date_created")]
    public Object DateCreated { get; set; }

    /// <summary>
    /// Gets or Sets InviteOnly
    /// </summary>
    [DataMember(Name="invite_only", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "invite_only")]
    public Object InviteOnly { get; set; }

    /// <summary>
    /// Gets or Sets RenderedDescription
    /// </summary>
    [DataMember(Name="rendered_description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rendered_description")]
    public Object RenderedDescription { get; set; }

    /// <summary>
    /// Gets or Sets IsWebPublic
    /// </summary>
    [DataMember(Name="is_web_public", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_web_public")]
    public Object IsWebPublic { get; set; }

    /// <summary>
    /// Gets or Sets StreamPostPolicy
    /// </summary>
    [DataMember(Name="stream_post_policy", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stream_post_policy")]
    public Object StreamPostPolicy { get; set; }

    /// <summary>
    /// Gets or Sets MessageRetentionDays
    /// </summary>
    [DataMember(Name="message_retention_days", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "message_retention_days")]
    public Object MessageRetentionDays { get; set; }

    /// <summary>
    /// Gets or Sets HistoryPublicToSubscribers
    /// </summary>
    [DataMember(Name="history_public_to_subscribers", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "history_public_to_subscribers")]
    public Object HistoryPublicToSubscribers { get; set; }

    /// <summary>
    /// Gets or Sets FirstMessageId
    /// </summary>
    [DataMember(Name="first_message_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "first_message_id")]
    public Object FirstMessageId { get; set; }

    /// <summary>
    /// Gets or Sets IsAnnouncementOnly
    /// </summary>
    [DataMember(Name="is_announcement_only", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_announcement_only")]
    public Object IsAnnouncementOnly { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class BasicStreamAllOf {\n");
      sb.Append("  StreamId: ").Append(StreamId).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Description: ").Append(Description).Append("\n");
      sb.Append("  DateCreated: ").Append(DateCreated).Append("\n");
      sb.Append("  InviteOnly: ").Append(InviteOnly).Append("\n");
      sb.Append("  RenderedDescription: ").Append(RenderedDescription).Append("\n");
      sb.Append("  IsWebPublic: ").Append(IsWebPublic).Append("\n");
      sb.Append("  StreamPostPolicy: ").Append(StreamPostPolicy).Append("\n");
      sb.Append("  MessageRetentionDays: ").Append(MessageRetentionDays).Append("\n");
      sb.Append("  HistoryPublicToSubscribers: ").Append(HistoryPublicToSubscribers).Append("\n");
      sb.Append("  FirstMessageId: ").Append(FirstMessageId).Append("\n");
      sb.Append("  IsAnnouncementOnly: ").Append(IsAnnouncementOnly).Append("\n");
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
