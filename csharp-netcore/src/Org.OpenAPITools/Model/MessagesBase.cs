/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Object containing details of the message. 
    /// </summary>
    [DataContract(Name = "MessagesBase")]
    public partial class MessagesBase : IEquatable<MessagesBase>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MessagesBase" /> class.
        /// </summary>
        /// <param name="avatarUrl">The URL of the user&#39;s avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user&#39;s email address itself for this user. .</param>
        /// <param name="_client">A Zulip \&quot;client\&quot; string, describing what Zulip client sent the message. .</param>
        /// <param name="content">The content/body of the message. .</param>
        /// <param name="contentType">The HTTP &#x60;content_type&#x60; for the message content.  This will be &#x60;text/html&#x60; or &#x60;text/x-markdown&#x60;, depending on whether &#x60;apply_markdown&#x60; was set. .</param>
        /// <param name="displayRecipient">Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. .</param>
        /// <param name="id">The unique message ID.  Messages should always be displayed sorted by ID. .</param>
        /// <param name="isMeMessage">Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages .</param>
        /// <param name="reactions">Data on any reactions to the message. .</param>
        /// <param name="recipientId">A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. .</param>
        /// <param name="senderEmail">The Zulip display email address of the message&#39;s sender. .</param>
        /// <param name="senderFullName">The full name of the message&#39;s sender. .</param>
        /// <param name="senderId">The user ID of the message&#39;s sender. .</param>
        /// <param name="senderRealmStr">A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on &#x60;example.zulip.com&#x60;, this will be &#x60;example&#x60;. .</param>
        /// <param name="streamId">Only present for stream messages; the ID of the stream. .</param>
        /// <param name="subject">The &#x60;topic&#x60; of the message.  Currently always &#x60;\&quot;\&quot;&#x60; for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \&quot;subjects\&quot; and will eventually change. .</param>
        /// <param name="topicLinks">Data on any links to be included in the &#x60;topic&#x60; line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message&#39;s topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called &#x60;subject_links&#x60;; clients are recommended to rename &#x60;subject_links&#x60; to &#x60;topic_links&#x60; if present for compatibility with older Zulip servers. .</param>
        /// <param name="submessages">Data used for certain experimental Zulip integrations. .</param>
        /// <param name="timestamp">The UNIX timestamp for when the message was sent, in UTC seconds. .</param>
        /// <param name="type">The type of the message: &#x60;stream&#x60; or &#x60;private&#x60;. .</param>
        public MessagesBase(string avatarUrl = default(string), string _client = default(string), string content = default(string), string contentType = default(string), OneOfstringarray displayRecipient = default(OneOfstringarray), int id = default(int), bool isMeMessage = default(bool), List<EmojiReaction> reactions = default(List<EmojiReaction>), int recipientId = default(int), string senderEmail = default(string), string senderFullName = default(string), int senderId = default(int), string senderRealmStr = default(string), int streamId = default(int), string subject = default(string), List<MessagesBaseTopicLinks> topicLinks = default(List<MessagesBaseTopicLinks>), List<string> submessages = default(List<string>), int timestamp = default(int), string type = default(string))
        {
            this.AvatarUrl = avatarUrl;
            this._Client = _client;
            this.Content = content;
            this.ContentType = contentType;
            this.DisplayRecipient = displayRecipient;
            this.Id = id;
            this.IsMeMessage = isMeMessage;
            this.Reactions = reactions;
            this.RecipientId = recipientId;
            this.SenderEmail = senderEmail;
            this.SenderFullName = senderFullName;
            this.SenderId = senderId;
            this.SenderRealmStr = senderRealmStr;
            this.StreamId = streamId;
            this.Subject = subject;
            this.TopicLinks = topicLinks;
            this.Submessages = submessages;
            this.Timestamp = timestamp;
            this.Type = type;
        }

        /// <summary>
        /// The URL of the user&#39;s avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user&#39;s email address itself for this user. 
        /// </summary>
        /// <value>The URL of the user&#39;s avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user&#39;s email address itself for this user. </value>
        [DataMember(Name = "avatar_url", EmitDefaultValue = true)]
        public string AvatarUrl { get; set; }

        /// <summary>
        /// A Zulip \&quot;client\&quot; string, describing what Zulip client sent the message. 
        /// </summary>
        /// <value>A Zulip \&quot;client\&quot; string, describing what Zulip client sent the message. </value>
        [DataMember(Name = "client", EmitDefaultValue = false)]
        public string _Client { get; set; }

        /// <summary>
        /// The content/body of the message. 
        /// </summary>
        /// <value>The content/body of the message. </value>
        [DataMember(Name = "content", EmitDefaultValue = false)]
        public string Content { get; set; }

        /// <summary>
        /// The HTTP &#x60;content_type&#x60; for the message content.  This will be &#x60;text/html&#x60; or &#x60;text/x-markdown&#x60;, depending on whether &#x60;apply_markdown&#x60; was set. 
        /// </summary>
        /// <value>The HTTP &#x60;content_type&#x60; for the message content.  This will be &#x60;text/html&#x60; or &#x60;text/x-markdown&#x60;, depending on whether &#x60;apply_markdown&#x60; was set. </value>
        [DataMember(Name = "content_type", EmitDefaultValue = false)]
        public string ContentType { get; set; }

        /// <summary>
        /// Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
        /// </summary>
        /// <value>Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. </value>
        [DataMember(Name = "display_recipient", EmitDefaultValue = false)]
        public OneOfstringarray DisplayRecipient { get; set; }

        /// <summary>
        /// The unique message ID.  Messages should always be displayed sorted by ID. 
        /// </summary>
        /// <value>The unique message ID.  Messages should always be displayed sorted by ID. </value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
        /// </summary>
        /// <value>Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages </value>
        [DataMember(Name = "is_me_message", EmitDefaultValue = true)]
        public bool IsMeMessage { get; set; }

        /// <summary>
        /// Data on any reactions to the message. 
        /// </summary>
        /// <value>Data on any reactions to the message. </value>
        [DataMember(Name = "reactions", EmitDefaultValue = false)]
        public List<EmojiReaction> Reactions { get; set; }

        /// <summary>
        /// A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
        /// </summary>
        /// <value>A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. </value>
        [DataMember(Name = "recipient_id", EmitDefaultValue = false)]
        public int RecipientId { get; set; }

        /// <summary>
        /// The Zulip display email address of the message&#39;s sender. 
        /// </summary>
        /// <value>The Zulip display email address of the message&#39;s sender. </value>
        [DataMember(Name = "sender_email", EmitDefaultValue = false)]
        public string SenderEmail { get; set; }

        /// <summary>
        /// The full name of the message&#39;s sender. 
        /// </summary>
        /// <value>The full name of the message&#39;s sender. </value>
        [DataMember(Name = "sender_full_name", EmitDefaultValue = false)]
        public string SenderFullName { get; set; }

        /// <summary>
        /// The user ID of the message&#39;s sender. 
        /// </summary>
        /// <value>The user ID of the message&#39;s sender. </value>
        [DataMember(Name = "sender_id", EmitDefaultValue = false)]
        public int SenderId { get; set; }

        /// <summary>
        /// A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on &#x60;example.zulip.com&#x60;, this will be &#x60;example&#x60;. 
        /// </summary>
        /// <value>A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on &#x60;example.zulip.com&#x60;, this will be &#x60;example&#x60;. </value>
        [DataMember(Name = "sender_realm_str", EmitDefaultValue = false)]
        public string SenderRealmStr { get; set; }

        /// <summary>
        /// Only present for stream messages; the ID of the stream. 
        /// </summary>
        /// <value>Only present for stream messages; the ID of the stream. </value>
        [DataMember(Name = "stream_id", EmitDefaultValue = false)]
        public int StreamId { get; set; }

        /// <summary>
        /// The &#x60;topic&#x60; of the message.  Currently always &#x60;\&quot;\&quot;&#x60; for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \&quot;subjects\&quot; and will eventually change. 
        /// </summary>
        /// <value>The &#x60;topic&#x60; of the message.  Currently always &#x60;\&quot;\&quot;&#x60; for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \&quot;subjects\&quot; and will eventually change. </value>
        [DataMember(Name = "subject", EmitDefaultValue = false)]
        public string Subject { get; set; }

        /// <summary>
        /// Data on any links to be included in the &#x60;topic&#x60; line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message&#39;s topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called &#x60;subject_links&#x60;; clients are recommended to rename &#x60;subject_links&#x60; to &#x60;topic_links&#x60; if present for compatibility with older Zulip servers. 
        /// </summary>
        /// <value>Data on any links to be included in the &#x60;topic&#x60; line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message&#39;s topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called &#x60;subject_links&#x60;; clients are recommended to rename &#x60;subject_links&#x60; to &#x60;topic_links&#x60; if present for compatibility with older Zulip servers. </value>
        [DataMember(Name = "topic_links", EmitDefaultValue = false)]
        public List<MessagesBaseTopicLinks> TopicLinks { get; set; }

        /// <summary>
        /// Data used for certain experimental Zulip integrations. 
        /// </summary>
        /// <value>Data used for certain experimental Zulip integrations. </value>
        [DataMember(Name = "submessages", EmitDefaultValue = false)]
        public List<string> Submessages { get; set; }

        /// <summary>
        /// The UNIX timestamp for when the message was sent, in UTC seconds. 
        /// </summary>
        /// <value>The UNIX timestamp for when the message was sent, in UTC seconds. </value>
        [DataMember(Name = "timestamp", EmitDefaultValue = false)]
        public int Timestamp { get; set; }

        /// <summary>
        /// The type of the message: &#x60;stream&#x60; or &#x60;private&#x60;. 
        /// </summary>
        /// <value>The type of the message: &#x60;stream&#x60; or &#x60;private&#x60;. </value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public string Type { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
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
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as MessagesBase);
        }

        /// <summary>
        /// Returns true if MessagesBase instances are equal
        /// </summary>
        /// <param name="input">Instance of MessagesBase to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MessagesBase input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AvatarUrl == input.AvatarUrl ||
                    (this.AvatarUrl != null &&
                    this.AvatarUrl.Equals(input.AvatarUrl))
                ) && 
                (
                    this._Client == input._Client ||
                    (this._Client != null &&
                    this._Client.Equals(input._Client))
                ) && 
                (
                    this.Content == input.Content ||
                    (this.Content != null &&
                    this.Content.Equals(input.Content))
                ) && 
                (
                    this.ContentType == input.ContentType ||
                    (this.ContentType != null &&
                    this.ContentType.Equals(input.ContentType))
                ) && 
                (
                    this.DisplayRecipient == input.DisplayRecipient ||
                    (this.DisplayRecipient != null &&
                    this.DisplayRecipient.Equals(input.DisplayRecipient))
                ) && 
                (
                    this.Id == input.Id ||
                    this.Id.Equals(input.Id)
                ) && 
                (
                    this.IsMeMessage == input.IsMeMessage ||
                    this.IsMeMessage.Equals(input.IsMeMessage)
                ) && 
                (
                    this.Reactions == input.Reactions ||
                    this.Reactions != null &&
                    input.Reactions != null &&
                    this.Reactions.SequenceEqual(input.Reactions)
                ) && 
                (
                    this.RecipientId == input.RecipientId ||
                    this.RecipientId.Equals(input.RecipientId)
                ) && 
                (
                    this.SenderEmail == input.SenderEmail ||
                    (this.SenderEmail != null &&
                    this.SenderEmail.Equals(input.SenderEmail))
                ) && 
                (
                    this.SenderFullName == input.SenderFullName ||
                    (this.SenderFullName != null &&
                    this.SenderFullName.Equals(input.SenderFullName))
                ) && 
                (
                    this.SenderId == input.SenderId ||
                    this.SenderId.Equals(input.SenderId)
                ) && 
                (
                    this.SenderRealmStr == input.SenderRealmStr ||
                    (this.SenderRealmStr != null &&
                    this.SenderRealmStr.Equals(input.SenderRealmStr))
                ) && 
                (
                    this.StreamId == input.StreamId ||
                    this.StreamId.Equals(input.StreamId)
                ) && 
                (
                    this.Subject == input.Subject ||
                    (this.Subject != null &&
                    this.Subject.Equals(input.Subject))
                ) && 
                (
                    this.TopicLinks == input.TopicLinks ||
                    this.TopicLinks != null &&
                    input.TopicLinks != null &&
                    this.TopicLinks.SequenceEqual(input.TopicLinks)
                ) && 
                (
                    this.Submessages == input.Submessages ||
                    this.Submessages != null &&
                    input.Submessages != null &&
                    this.Submessages.SequenceEqual(input.Submessages)
                ) && 
                (
                    this.Timestamp == input.Timestamp ||
                    this.Timestamp.Equals(input.Timestamp)
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.AvatarUrl != null)
                    hashCode = hashCode * 59 + this.AvatarUrl.GetHashCode();
                if (this._Client != null)
                    hashCode = hashCode * 59 + this._Client.GetHashCode();
                if (this.Content != null)
                    hashCode = hashCode * 59 + this.Content.GetHashCode();
                if (this.ContentType != null)
                    hashCode = hashCode * 59 + this.ContentType.GetHashCode();
                if (this.DisplayRecipient != null)
                    hashCode = hashCode * 59 + this.DisplayRecipient.GetHashCode();
                hashCode = hashCode * 59 + this.Id.GetHashCode();
                hashCode = hashCode * 59 + this.IsMeMessage.GetHashCode();
                if (this.Reactions != null)
                    hashCode = hashCode * 59 + this.Reactions.GetHashCode();
                hashCode = hashCode * 59 + this.RecipientId.GetHashCode();
                if (this.SenderEmail != null)
                    hashCode = hashCode * 59 + this.SenderEmail.GetHashCode();
                if (this.SenderFullName != null)
                    hashCode = hashCode * 59 + this.SenderFullName.GetHashCode();
                hashCode = hashCode * 59 + this.SenderId.GetHashCode();
                if (this.SenderRealmStr != null)
                    hashCode = hashCode * 59 + this.SenderRealmStr.GetHashCode();
                hashCode = hashCode * 59 + this.StreamId.GetHashCode();
                if (this.Subject != null)
                    hashCode = hashCode * 59 + this.Subject.GetHashCode();
                if (this.TopicLinks != null)
                    hashCode = hashCode * 59 + this.TopicLinks.GetHashCode();
                if (this.Submessages != null)
                    hashCode = hashCode * 59 + this.Submessages.GetHashCode();
                hashCode = hashCode * 59 + this.Timestamp.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
