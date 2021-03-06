using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// Object containing details of the message. 
    /// </summary>
    public sealed class MessagesBase:  IEquatable<MessagesBase>
    { 
        /// <summary>
        /// The URL of the user&#39;s avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user&#39;s email address itself for this user. 
        /// </summary>
        public string AvatarUrl { get; private set; }

        /// <summary>
        /// A Zulip \&quot;client\&quot; string, describing what Zulip client sent the message. 
        /// </summary>
        public string Client { get; private set; }

        /// <summary>
        /// The content/body of the message. 
        /// </summary>
        public string Content { get; private set; }

        /// <summary>
        /// The HTTP &#x60;content_type&#x60; for the message content.  This will be &#x60;text/html&#x60; or &#x60;text/x-markdown&#x60;, depending on whether &#x60;apply_markdown&#x60; was set. 
        /// </summary>
        public string ContentType { get; private set; }

        /// <summary>
        /// Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
        /// </summary>
        public OneOfstringarray DisplayRecipient { get; private set; }

        /// <summary>
        /// The unique message ID.  Messages should always be displayed sorted by ID. 
        /// </summary>
        public int? Id { get; private set; }

        /// <summary>
        /// Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
        /// </summary>
        public bool? IsMeMessage { get; private set; }

        /// <summary>
        /// Data on any reactions to the message. 
        /// </summary>
        public List<EmojiReaction> Reactions { get; private set; }

        /// <summary>
        /// A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
        /// </summary>
        public int? RecipientId { get; private set; }

        /// <summary>
        /// The Zulip display email address of the message&#39;s sender. 
        /// </summary>
        public string SenderEmail { get; private set; }

        /// <summary>
        /// The full name of the message&#39;s sender. 
        /// </summary>
        public string SenderFullName { get; private set; }

        /// <summary>
        /// The user ID of the message&#39;s sender. 
        /// </summary>
        public int? SenderId { get; private set; }

        /// <summary>
        /// A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on &#x60;example.zulip.com&#x60;, this will be &#x60;example&#x60;. 
        /// </summary>
        public string SenderRealmStr { get; private set; }

        /// <summary>
        /// Only present for stream messages; the ID of the stream. 
        /// </summary>
        public int? StreamId { get; private set; }

        /// <summary>
        /// The &#x60;topic&#x60; of the message.  Currently always &#x60;\&quot;\&quot;&#x60; for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \&quot;subjects\&quot; and will eventually change. 
        /// </summary>
        public string Subject { get; private set; }

        /// <summary>
        /// Data on any links to be included in the &#x60;topic&#x60; line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message&#39;s topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called &#x60;subject_links&#x60;; clients are recommended to rename &#x60;subject_links&#x60; to &#x60;topic_links&#x60; if present for compatibility with older Zulip servers. 
        /// </summary>
        public List<MessagesBaseTopicLinks> TopicLinks { get; private set; }

        /// <summary>
        /// Data used for certain experimental Zulip integrations. 
        /// </summary>
        public List<string> Submessages { get; private set; }

        /// <summary>
        /// The UNIX timestamp for when the message was sent, in UTC seconds. 
        /// </summary>
        public int? Timestamp { get; private set; }

        /// <summary>
        /// The type of the message: &#x60;stream&#x60; or &#x60;private&#x60;. 
        /// </summary>
        public string Type { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use MessagesBase.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public MessagesBase()
        {
        }

        private MessagesBase(string AvatarUrl, string Client, string Content, string ContentType, OneOfstringarray DisplayRecipient, int? Id, bool? IsMeMessage, List<EmojiReaction> Reactions, int? RecipientId, string SenderEmail, string SenderFullName, int? SenderId, string SenderRealmStr, int? StreamId, string Subject, List<MessagesBaseTopicLinks> TopicLinks, List<string> Submessages, int? Timestamp, string Type)
        {
            
            this.AvatarUrl = AvatarUrl;
            
            this.Client = Client;
            
            this.Content = Content;
            
            this.ContentType = ContentType;
            
            this.DisplayRecipient = DisplayRecipient;
            
            this.Id = Id;
            
            this.IsMeMessage = IsMeMessage;
            
            this.Reactions = Reactions;
            
            this.RecipientId = RecipientId;
            
            this.SenderEmail = SenderEmail;
            
            this.SenderFullName = SenderFullName;
            
            this.SenderId = SenderId;
            
            this.SenderRealmStr = SenderRealmStr;
            
            this.StreamId = StreamId;
            
            this.Subject = Subject;
            
            this.TopicLinks = TopicLinks;
            
            this.Submessages = Submessages;
            
            this.Timestamp = Timestamp;
            
            this.Type = Type;
            
        }

        /// <summary>
        /// Returns builder of MessagesBase.
        /// </summary>
        /// <returns>MessagesBaseBuilder</returns>
        public static MessagesBaseBuilder Builder()
        {
            return new MessagesBaseBuilder();
        }

        /// <summary>
        /// Returns MessagesBaseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>MessagesBaseBuilder</returns>
        public MessagesBaseBuilder With()
        {
            return Builder()
                .AvatarUrl(AvatarUrl)
                .Client(Client)
                .Content(Content)
                .ContentType(ContentType)
                .DisplayRecipient(DisplayRecipient)
                .Id(Id)
                .IsMeMessage(IsMeMessage)
                .Reactions(Reactions)
                .RecipientId(RecipientId)
                .SenderEmail(SenderEmail)
                .SenderFullName(SenderFullName)
                .SenderId(SenderId)
                .SenderRealmStr(SenderRealmStr)
                .StreamId(StreamId)
                .Subject(Subject)
                .TopicLinks(TopicLinks)
                .Submessages(Submessages)
                .Timestamp(Timestamp)
                .Type(Type);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(MessagesBase other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (MessagesBase.
        /// </summary>
        /// <param name="left">Compared (MessagesBase</param>
        /// <param name="right">Compared (MessagesBase</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (MessagesBase left, MessagesBase right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (MessagesBase.
        /// </summary>
        /// <param name="left">Compared (MessagesBase</param>
        /// <param name="right">Compared (MessagesBase</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (MessagesBase left, MessagesBase right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of MessagesBase.
        /// </summary>
        public sealed class MessagesBaseBuilder
        {
            private string _AvatarUrl;
            private string _Client;
            private string _Content;
            private string _ContentType;
            private OneOfstringarray _DisplayRecipient;
            private int? _Id;
            private bool? _IsMeMessage;
            private List<EmojiReaction> _Reactions;
            private int? _RecipientId;
            private string _SenderEmail;
            private string _SenderFullName;
            private int? _SenderId;
            private string _SenderRealmStr;
            private int? _StreamId;
            private string _Subject;
            private List<MessagesBaseTopicLinks> _TopicLinks;
            private List<string> _Submessages;
            private int? _Timestamp;
            private string _Type;

            internal MessagesBaseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for MessagesBase.AvatarUrl property.
            /// </summary>
            /// <param name="value">The URL of the user&#39;s avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user&#39;s email address itself for this user. </param>
            public MessagesBaseBuilder AvatarUrl(string value)
            {
                _AvatarUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for MessagesBase.Client property.
            /// </summary>
            /// <param name="value">A Zulip \&quot;client\&quot; string, describing what Zulip client sent the message. </param>
            public MessagesBaseBuilder Client(string value)
            {
                _Client = value;
                return this;
            }

            /// <summary>
            /// Sets value for MessagesBase.Content property.
            /// </summary>
            /// <param name="value">The content/body of the message. </param>
            public MessagesBaseBuilder Content(string value)
            {
                _Content = value;
                return this;
            }

            /// <summary>
            /// Sets value for MessagesBase.ContentType property.
            /// </summary>
            /// <param name="value">The HTTP &#x60;content_type&#x60; for the message content.  This will be &#x60;text/html&#x60; or &#x60;text/x-markdown&#x60;, depending on whether &#x60;apply_markdown&#x60; was set. </param>
            public MessagesBaseBuilder ContentType(string value)
            {
                _ContentType = value;
                return this;
            }

            /// <summary>
            /// Sets value for MessagesBase.DisplayRecipient property.
            /// </summary>
            /// <param name="value">Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. </param>
            public MessagesBaseBuilder DisplayRecipient(OneOfstringarray value)
            {
                _DisplayRecipient = value;
                return this;
            }

            /// <summary>
            /// Sets value for MessagesBase.Id property.
            /// </summary>
            /// <param name="value">The unique message ID.  Messages should always be displayed sorted by ID. </param>
            public MessagesBaseBuilder Id(int? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for MessagesBase.IsMeMessage property.
            /// </summary>
            /// <param name="value">Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages </param>
            public MessagesBaseBuilder IsMeMessage(bool? value)
            {
                _IsMeMessage = value;
                return this;
            }

            /// <summary>
            /// Sets value for MessagesBase.Reactions property.
            /// </summary>
            /// <param name="value">Data on any reactions to the message. </param>
            public MessagesBaseBuilder Reactions(List<EmojiReaction> value)
            {
                _Reactions = value;
                return this;
            }

            /// <summary>
            /// Sets value for MessagesBase.RecipientId property.
            /// </summary>
            /// <param name="value">A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. </param>
            public MessagesBaseBuilder RecipientId(int? value)
            {
                _RecipientId = value;
                return this;
            }

            /// <summary>
            /// Sets value for MessagesBase.SenderEmail property.
            /// </summary>
            /// <param name="value">The Zulip display email address of the message&#39;s sender. </param>
            public MessagesBaseBuilder SenderEmail(string value)
            {
                _SenderEmail = value;
                return this;
            }

            /// <summary>
            /// Sets value for MessagesBase.SenderFullName property.
            /// </summary>
            /// <param name="value">The full name of the message&#39;s sender. </param>
            public MessagesBaseBuilder SenderFullName(string value)
            {
                _SenderFullName = value;
                return this;
            }

            /// <summary>
            /// Sets value for MessagesBase.SenderId property.
            /// </summary>
            /// <param name="value">The user ID of the message&#39;s sender. </param>
            public MessagesBaseBuilder SenderId(int? value)
            {
                _SenderId = value;
                return this;
            }

            /// <summary>
            /// Sets value for MessagesBase.SenderRealmStr property.
            /// </summary>
            /// <param name="value">A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on &#x60;example.zulip.com&#x60;, this will be &#x60;example&#x60;. </param>
            public MessagesBaseBuilder SenderRealmStr(string value)
            {
                _SenderRealmStr = value;
                return this;
            }

            /// <summary>
            /// Sets value for MessagesBase.StreamId property.
            /// </summary>
            /// <param name="value">Only present for stream messages; the ID of the stream. </param>
            public MessagesBaseBuilder StreamId(int? value)
            {
                _StreamId = value;
                return this;
            }

            /// <summary>
            /// Sets value for MessagesBase.Subject property.
            /// </summary>
            /// <param name="value">The &#x60;topic&#x60; of the message.  Currently always &#x60;\&quot;\&quot;&#x60; for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \&quot;subjects\&quot; and will eventually change. </param>
            public MessagesBaseBuilder Subject(string value)
            {
                _Subject = value;
                return this;
            }

            /// <summary>
            /// Sets value for MessagesBase.TopicLinks property.
            /// </summary>
            /// <param name="value">Data on any links to be included in the &#x60;topic&#x60; line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message&#39;s topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called &#x60;subject_links&#x60;; clients are recommended to rename &#x60;subject_links&#x60; to &#x60;topic_links&#x60; if present for compatibility with older Zulip servers. </param>
            public MessagesBaseBuilder TopicLinks(List<MessagesBaseTopicLinks> value)
            {
                _TopicLinks = value;
                return this;
            }

            /// <summary>
            /// Sets value for MessagesBase.Submessages property.
            /// </summary>
            /// <param name="value">Data used for certain experimental Zulip integrations. </param>
            public MessagesBaseBuilder Submessages(List<string> value)
            {
                _Submessages = value;
                return this;
            }

            /// <summary>
            /// Sets value for MessagesBase.Timestamp property.
            /// </summary>
            /// <param name="value">The UNIX timestamp for when the message was sent, in UTC seconds. </param>
            public MessagesBaseBuilder Timestamp(int? value)
            {
                _Timestamp = value;
                return this;
            }

            /// <summary>
            /// Sets value for MessagesBase.Type property.
            /// </summary>
            /// <param name="value">The type of the message: &#x60;stream&#x60; or &#x60;private&#x60;. </param>
            public MessagesBaseBuilder Type(string value)
            {
                _Type = value;
                return this;
            }


            /// <summary>
            /// Builds instance of MessagesBase.
            /// </summary>
            /// <returns>MessagesBase</returns>
            public MessagesBase Build()
            {
                Validate();
                return new MessagesBase(
                    AvatarUrl: _AvatarUrl,
                    Client: _Client,
                    Content: _Content,
                    ContentType: _ContentType,
                    DisplayRecipient: _DisplayRecipient,
                    Id: _Id,
                    IsMeMessage: _IsMeMessage,
                    Reactions: _Reactions,
                    RecipientId: _RecipientId,
                    SenderEmail: _SenderEmail,
                    SenderFullName: _SenderFullName,
                    SenderId: _SenderId,
                    SenderRealmStr: _SenderRealmStr,
                    StreamId: _StreamId,
                    Subject: _Subject,
                    TopicLinks: _TopicLinks,
                    Submessages: _Submessages,
                    Timestamp: _Timestamp,
                    Type: _Type
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
