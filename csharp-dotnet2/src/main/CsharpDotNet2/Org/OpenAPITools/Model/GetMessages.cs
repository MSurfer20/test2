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
  public class GetMessages {
    /// <summary>
    /// Gets or Sets AvatarUrl
    /// </summary>
    [DataMember(Name="avatar_url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "avatar_url")]
    public Object AvatarUrl { get; set; }

    /// <summary>
    /// Gets or Sets _Client
    /// </summary>
    [DataMember(Name="client", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "client")]
    public Object _Client { get; set; }

    /// <summary>
    /// Gets or Sets Content
    /// </summary>
    [DataMember(Name="content", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "content")]
    public Object Content { get; set; }

    /// <summary>
    /// Gets or Sets ContentType
    /// </summary>
    [DataMember(Name="content_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "content_type")]
    public Object ContentType { get; set; }

    /// <summary>
    /// Gets or Sets DisplayRecipient
    /// </summary>
    [DataMember(Name="display_recipient", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "display_recipient")]
    public Object DisplayRecipient { get; set; }

    /// <summary>
    /// Gets or Sets Id
    /// </summary>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public Object Id { get; set; }

    /// <summary>
    /// Gets or Sets IsMeMessage
    /// </summary>
    [DataMember(Name="is_me_message", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_me_message")]
    public Object IsMeMessage { get; set; }

    /// <summary>
    /// Gets or Sets Reactions
    /// </summary>
    [DataMember(Name="reactions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "reactions")]
    public Object Reactions { get; set; }

    /// <summary>
    /// Gets or Sets RecipientId
    /// </summary>
    [DataMember(Name="recipient_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "recipient_id")]
    public Object RecipientId { get; set; }

    /// <summary>
    /// Gets or Sets SenderEmail
    /// </summary>
    [DataMember(Name="sender_email", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sender_email")]
    public Object SenderEmail { get; set; }

    /// <summary>
    /// Gets or Sets SenderFullName
    /// </summary>
    [DataMember(Name="sender_full_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sender_full_name")]
    public Object SenderFullName { get; set; }

    /// <summary>
    /// Gets or Sets SenderId
    /// </summary>
    [DataMember(Name="sender_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sender_id")]
    public Object SenderId { get; set; }

    /// <summary>
    /// Gets or Sets SenderRealmStr
    /// </summary>
    [DataMember(Name="sender_realm_str", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sender_realm_str")]
    public Object SenderRealmStr { get; set; }

    /// <summary>
    /// Gets or Sets StreamId
    /// </summary>
    [DataMember(Name="stream_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stream_id")]
    public Object StreamId { get; set; }

    /// <summary>
    /// Gets or Sets Subject
    /// </summary>
    [DataMember(Name="subject", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "subject")]
    public Object Subject { get; set; }

    /// <summary>
    /// Gets or Sets TopicLinks
    /// </summary>
    [DataMember(Name="topic_links", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "topic_links")]
    public Object TopicLinks { get; set; }

    /// <summary>
    /// Gets or Sets Submessages
    /// </summary>
    [DataMember(Name="submessages", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "submessages")]
    public Object Submessages { get; set; }

    /// <summary>
    /// Gets or Sets Timestamp
    /// </summary>
    [DataMember(Name="timestamp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "timestamp")]
    public Object Timestamp { get; set; }

    /// <summary>
    /// Gets or Sets Type
    /// </summary>
    [DataMember(Name="type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type")]
    public Object Type { get; set; }

    /// <summary>
    /// The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 
    /// </summary>
    /// <value>The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags </value>
    [DataMember(Name="flags", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "flags")]
    public List<string> Flags { get; set; }

    /// <summary>
    /// The UNIX timestamp for when the message was last edited, in UTC seconds. 
    /// </summary>
    /// <value>The UNIX timestamp for when the message was last edited, in UTC seconds. </value>
    [DataMember(Name="last_edit_timestamp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "last_edit_timestamp")]
    public int? LastEditTimestamp { get; set; }

    /// <summary>
    /// Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
    /// </summary>
    /// <value>Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. </value>
    [DataMember(Name="match_content", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "match_content")]
    public string MatchContent { get; set; }

    /// <summary>
    /// Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
    /// </summary>
    /// <value>Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. </value>
    [DataMember(Name="match_subject", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "match_subject")]
    public string MatchSubject { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class GetMessages {\n");
      sb.Append("  AvatarUrl: ").Append(AvatarUrl).Append("\n");
      sb.Append("  _Client: ").Append(_Client).Append("\n");
      sb.Append("  Content: ").Append(Content).Append("\n");
      sb.Append("  ContentType: ").Append(ContentType).Append("\n");
      sb.Append("  DisplayRecipient: ").Append(DisplayRecipient).Append("\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  IsMeMessage: ").Append(IsMeMessage).Append("\n");
      sb.Append("  Reactions: ").Append(Reactions).Append("\n");
      sb.Append("  RecipientId: ").Append(RecipientId).Append("\n");
      sb.Append("  SenderEmail: ").Append(SenderEmail).Append("\n");
      sb.Append("  SenderFullName: ").Append(SenderFullName).Append("\n");
      sb.Append("  SenderId: ").Append(SenderId).Append("\n");
      sb.Append("  SenderRealmStr: ").Append(SenderRealmStr).Append("\n");
      sb.Append("  StreamId: ").Append(StreamId).Append("\n");
      sb.Append("  Subject: ").Append(Subject).Append("\n");
      sb.Append("  TopicLinks: ").Append(TopicLinks).Append("\n");
      sb.Append("  Submessages: ").Append(Submessages).Append("\n");
      sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
      sb.Append("  Flags: ").Append(Flags).Append("\n");
      sb.Append("  LastEditTimestamp: ").Append(LastEditTimestamp).Append("\n");
      sb.Append("  MatchContent: ").Append(MatchContent).Append("\n");
      sb.Append("  MatchSubject: ").Append(MatchSubject).Append("\n");
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
