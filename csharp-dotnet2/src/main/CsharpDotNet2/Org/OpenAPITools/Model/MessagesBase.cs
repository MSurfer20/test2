using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Object containing details of the message. 
  /// </summary>
  [DataContract]
  public class MessagesBase {
    /// <summary>
    /// The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. 
    /// </summary>
    /// <value>The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. </value>
    [DataMember(Name="avatar_url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "avatar_url")]
    public string AvatarUrl { get; set; }

    /// <summary>
    /// A Zulip \"client\" string, describing what Zulip client sent the message. 
    /// </summary>
    /// <value>A Zulip \"client\" string, describing what Zulip client sent the message. </value>
    [DataMember(Name="client", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "client")]
    public string _Client { get; set; }

    /// <summary>
    /// The content/body of the message. 
    /// </summary>
    /// <value>The content/body of the message. </value>
    [DataMember(Name="content", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "content")]
    public string Content { get; set; }

    /// <summary>
    /// The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. 
    /// </summary>
    /// <value>The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. </value>
    [DataMember(Name="content_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "content_type")]
    public string ContentType { get; set; }

    /// <summary>
    /// Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
    /// </summary>
    /// <value>Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. </value>
    [DataMember(Name="display_recipient", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "display_recipient")]
    public OneOfstringarray DisplayRecipient { get; set; }

    /// <summary>
    /// The unique message ID.  Messages should always be displayed sorted by ID. 
    /// </summary>
    /// <value>The unique message ID.  Messages should always be displayed sorted by ID. </value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public int? Id { get; set; }

    /// <summary>
    /// Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
    /// </summary>
    /// <value>Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages </value>
    [DataMember(Name="is_me_message", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "is_me_message")]
    public bool? IsMeMessage { get; set; }

    /// <summary>
    /// Data on any reactions to the message. 
    /// </summary>
    /// <value>Data on any reactions to the message. </value>
    [DataMember(Name="reactions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "reactions")]
    public List<EmojiReaction> Reactions { get; set; }

    /// <summary>
    /// A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
    /// </summary>
    /// <value>A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. </value>
    [DataMember(Name="recipient_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "recipient_id")]
    public int? RecipientId { get; set; }

    /// <summary>
    /// The Zulip display email address of the message's sender. 
    /// </summary>
    /// <value>The Zulip display email address of the message's sender. </value>
    [DataMember(Name="sender_email", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sender_email")]
    public string SenderEmail { get; set; }

    /// <summary>
    /// The full name of the message's sender. 
    /// </summary>
    /// <value>The full name of the message's sender. </value>
    [DataMember(Name="sender_full_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sender_full_name")]
    public string SenderFullName { get; set; }

    /// <summary>
    /// The user ID of the message's sender. 
    /// </summary>
    /// <value>The user ID of the message's sender. </value>
    [DataMember(Name="sender_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sender_id")]
    public int? SenderId { get; set; }

    /// <summary>
    /// A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. 
    /// </summary>
    /// <value>A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. </value>
    [DataMember(Name="sender_realm_str", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sender_realm_str")]
    public string SenderRealmStr { get; set; }

    /// <summary>
    /// Only present for stream messages; the ID of the stream. 
    /// </summary>
    /// <value>Only present for stream messages; the ID of the stream. </value>
    [DataMember(Name="stream_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stream_id")]
    public int? StreamId { get; set; }

    /// <summary>
    /// The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change. 
    /// </summary>
    /// <value>The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change. </value>
    [DataMember(Name="subject", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "subject")]
    public string Subject { get; set; }

    /// <summary>
    /// Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. 
    /// </summary>
    /// <value>Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. </value>
    [DataMember(Name="topic_links", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "topic_links")]
    public List<MessagesBaseTopicLinks> TopicLinks { get; set; }

    /// <summary>
    /// Data used for certain experimental Zulip integrations. 
    /// </summary>
    /// <value>Data used for certain experimental Zulip integrations. </value>
    [DataMember(Name="submessages", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "submessages")]
    public List<string> Submessages { get; set; }

    /// <summary>
    /// The UNIX timestamp for when the message was sent, in UTC seconds. 
    /// </summary>
    /// <value>The UNIX timestamp for when the message was sent, in UTC seconds. </value>
    [DataMember(Name="timestamp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "timestamp")]
    public int? Timestamp { get; set; }

    /// <summary>
    /// The type of the message: `stream` or `private`. 
    /// </summary>
    /// <value>The type of the message: `stream` or `private`. </value>
    [DataMember(Name="type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type")]
    public string Type { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class MessagesBase {\n");
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
