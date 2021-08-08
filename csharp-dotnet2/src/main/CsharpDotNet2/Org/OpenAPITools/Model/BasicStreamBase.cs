using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Object containing basic details about the stream. 
  /// </summary>
  [DataContract]
  public class BasicStreamBase {
    /// <summary>
    /// The unique ID of the stream. 
    /// </summary>
    /// <value>The unique ID of the stream. </value>
    [DataMember(Name="stream_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stream_id")]
    public int? StreamId { get; set; }

    /// <summary>
    /// The name of the stream. 
    /// </summary>
    /// <value>The name of the stream. </value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
    /// </summary>
    /// <value>The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. </value>
    [DataMember(Name="description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "description")]
    public string Description { get; set; }

    /// <summary>
    /// The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
    /// </summary>
    /// <value>The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). </value>
    [DataMember(Name="date_created", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "date_created")]
    public int? DateCreated { get; set; }

    /// <summary>
    /// Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
    /// </summary>
    /// <value>Specifies whether the stream is private or not. Only people who have been invited can access a private stream. </value>
    [DataMember(Name="invite_only", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "invite_only")]
    public bool? InviteOnly { get; set; }

    /// <summary>
    /// The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
    /// </summary>
    /// <value>The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. </value>
    [DataMember(Name="rendered_description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rendered_description")]
    public string RenderedDescription { get; set; }

    /// <summary>
    /// Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
    /// </summary>
    /// <value>Whether the stream has been configured to allow unauthenticated access to its message history from the web. </value>
    [DataMember(Name="is_web_public", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_web_public")]
    public bool? IsWebPublic { get; set; }

    /// <summary>
    /// Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
    /// </summary>
    /// <value>Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. </value>
    [DataMember(Name="stream_post_policy", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stream_post_policy")]
    public int? StreamPostPolicy { get; set; }

    /// <summary>
    /// Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
    /// </summary>
    /// <value>Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). </value>
    [DataMember(Name="message_retention_days", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "message_retention_days")]
    public int? MessageRetentionDays { get; set; }

    /// <summary>
    /// Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
    /// </summary>
    /// <value>Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. </value>
    [DataMember(Name="history_public_to_subscribers", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "history_public_to_subscribers")]
    public bool? HistoryPublicToSubscribers { get; set; }

    /// <summary>
    /// The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
    /// </summary>
    /// <value>The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. </value>
    [DataMember(Name="first_message_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "first_message_id")]
    public int? FirstMessageId { get; set; }

    /// <summary>
    /// Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
    /// </summary>
    /// <value>Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. </value>
    [DataMember(Name="is_announcement_only", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_announcement_only")]
    public bool? IsAnnouncementOnly { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class BasicStreamBase {\n");
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
