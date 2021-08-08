using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// GetMessages
    /// </summary>
    public sealed class GetMessages:  IEquatable<GetMessages>
    { 
        /// <summary>
        /// AvatarUrl
        /// </summary>
        public Object AvatarUrl { get; private set; }

        /// <summary>
        /// Client
        /// </summary>
        public Object Client { get; private set; }

        /// <summary>
        /// Content
        /// </summary>
        public Object Content { get; private set; }

        /// <summary>
        /// ContentType
        /// </summary>
        public Object ContentType { get; private set; }

        /// <summary>
        /// DisplayRecipient
        /// </summary>
        public Object DisplayRecipient { get; private set; }

        /// <summary>
        /// Id
        /// </summary>
        public Object Id { get; private set; }

        /// <summary>
        /// IsMeMessage
        /// </summary>
        public Object IsMeMessage { get; private set; }

        /// <summary>
        /// Reactions
        /// </summary>
        public Object Reactions { get; private set; }

        /// <summary>
        /// RecipientId
        /// </summary>
        public Object RecipientId { get; private set; }

        /// <summary>
        /// SenderEmail
        /// </summary>
        public Object SenderEmail { get; private set; }

        /// <summary>
        /// SenderFullName
        /// </summary>
        public Object SenderFullName { get; private set; }

        /// <summary>
        /// SenderId
        /// </summary>
        public Object SenderId { get; private set; }

        /// <summary>
        /// SenderRealmStr
        /// </summary>
        public Object SenderRealmStr { get; private set; }

        /// <summary>
        /// StreamId
        /// </summary>
        public Object StreamId { get; private set; }

        /// <summary>
        /// Subject
        /// </summary>
        public Object Subject { get; private set; }

        /// <summary>
        /// TopicLinks
        /// </summary>
        public Object TopicLinks { get; private set; }

        /// <summary>
        /// Submessages
        /// </summary>
        public Object Submessages { get; private set; }

        /// <summary>
        /// Timestamp
        /// </summary>
        public Object Timestamp { get; private set; }

        /// <summary>
        /// Type
        /// </summary>
        public Object Type { get; private set; }

        /// <summary>
        /// The user&#39;s [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 
        /// </summary>
        public List<string> Flags { get; private set; }

        /// <summary>
        /// The UNIX timestamp for when the message was last edited, in UTC seconds. 
        /// </summary>
        public int? LastEditTimestamp { get; private set; }

        /// <summary>
        /// Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords. 
        /// </summary>
        public string MatchContent { get; private set; }

        /// <summary>
        /// Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords. 
        /// </summary>
        public string MatchSubject { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use GetMessages.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public GetMessages()
        {
        }

        private GetMessages(Object AvatarUrl, Object Client, Object Content, Object ContentType, Object DisplayRecipient, Object Id, Object IsMeMessage, Object Reactions, Object RecipientId, Object SenderEmail, Object SenderFullName, Object SenderId, Object SenderRealmStr, Object StreamId, Object Subject, Object TopicLinks, Object Submessages, Object Timestamp, Object Type, List<string> Flags, int? LastEditTimestamp, string MatchContent, string MatchSubject)
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
            
            this.Flags = Flags;
            
            this.LastEditTimestamp = LastEditTimestamp;
            
            this.MatchContent = MatchContent;
            
            this.MatchSubject = MatchSubject;
            
        }

        /// <summary>
        /// Returns builder of GetMessages.
        /// </summary>
        /// <returns>GetMessagesBuilder</returns>
        public static GetMessagesBuilder Builder()
        {
            return new GetMessagesBuilder();
        }

        /// <summary>
        /// Returns GetMessagesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>GetMessagesBuilder</returns>
        public GetMessagesBuilder With()
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
                .Type(Type)
                .Flags(Flags)
                .LastEditTimestamp(LastEditTimestamp)
                .MatchContent(MatchContent)
                .MatchSubject(MatchSubject);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(GetMessages other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (GetMessages.
        /// </summary>
        /// <param name="left">Compared (GetMessages</param>
        /// <param name="right">Compared (GetMessages</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (GetMessages left, GetMessages right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (GetMessages.
        /// </summary>
        /// <param name="left">Compared (GetMessages</param>
        /// <param name="right">Compared (GetMessages</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (GetMessages left, GetMessages right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of GetMessages.
        /// </summary>
        public sealed class GetMessagesBuilder
        {
            private Object _AvatarUrl;
            private Object _Client;
            private Object _Content;
            private Object _ContentType;
            private Object _DisplayRecipient;
            private Object _Id;
            private Object _IsMeMessage;
            private Object _Reactions;
            private Object _RecipientId;
            private Object _SenderEmail;
            private Object _SenderFullName;
            private Object _SenderId;
            private Object _SenderRealmStr;
            private Object _StreamId;
            private Object _Subject;
            private Object _TopicLinks;
            private Object _Submessages;
            private Object _Timestamp;
            private Object _Type;
            private List<string> _Flags;
            private int? _LastEditTimestamp;
            private string _MatchContent;
            private string _MatchSubject;

            internal GetMessagesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for GetMessages.AvatarUrl property.
            /// </summary>
            /// <param name="value">AvatarUrl</param>
            public GetMessagesBuilder AvatarUrl(Object value)
            {
                _AvatarUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessages.Client property.
            /// </summary>
            /// <param name="value">Client</param>
            public GetMessagesBuilder Client(Object value)
            {
                _Client = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessages.Content property.
            /// </summary>
            /// <param name="value">Content</param>
            public GetMessagesBuilder Content(Object value)
            {
                _Content = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessages.ContentType property.
            /// </summary>
            /// <param name="value">ContentType</param>
            public GetMessagesBuilder ContentType(Object value)
            {
                _ContentType = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessages.DisplayRecipient property.
            /// </summary>
            /// <param name="value">DisplayRecipient</param>
            public GetMessagesBuilder DisplayRecipient(Object value)
            {
                _DisplayRecipient = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessages.Id property.
            /// </summary>
            /// <param name="value">Id</param>
            public GetMessagesBuilder Id(Object value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessages.IsMeMessage property.
            /// </summary>
            /// <param name="value">IsMeMessage</param>
            public GetMessagesBuilder IsMeMessage(Object value)
            {
                _IsMeMessage = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessages.Reactions property.
            /// </summary>
            /// <param name="value">Reactions</param>
            public GetMessagesBuilder Reactions(Object value)
            {
                _Reactions = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessages.RecipientId property.
            /// </summary>
            /// <param name="value">RecipientId</param>
            public GetMessagesBuilder RecipientId(Object value)
            {
                _RecipientId = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessages.SenderEmail property.
            /// </summary>
            /// <param name="value">SenderEmail</param>
            public GetMessagesBuilder SenderEmail(Object value)
            {
                _SenderEmail = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessages.SenderFullName property.
            /// </summary>
            /// <param name="value">SenderFullName</param>
            public GetMessagesBuilder SenderFullName(Object value)
            {
                _SenderFullName = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessages.SenderId property.
            /// </summary>
            /// <param name="value">SenderId</param>
            public GetMessagesBuilder SenderId(Object value)
            {
                _SenderId = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessages.SenderRealmStr property.
            /// </summary>
            /// <param name="value">SenderRealmStr</param>
            public GetMessagesBuilder SenderRealmStr(Object value)
            {
                _SenderRealmStr = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessages.StreamId property.
            /// </summary>
            /// <param name="value">StreamId</param>
            public GetMessagesBuilder StreamId(Object value)
            {
                _StreamId = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessages.Subject property.
            /// </summary>
            /// <param name="value">Subject</param>
            public GetMessagesBuilder Subject(Object value)
            {
                _Subject = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessages.TopicLinks property.
            /// </summary>
            /// <param name="value">TopicLinks</param>
            public GetMessagesBuilder TopicLinks(Object value)
            {
                _TopicLinks = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessages.Submessages property.
            /// </summary>
            /// <param name="value">Submessages</param>
            public GetMessagesBuilder Submessages(Object value)
            {
                _Submessages = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessages.Timestamp property.
            /// </summary>
            /// <param name="value">Timestamp</param>
            public GetMessagesBuilder Timestamp(Object value)
            {
                _Timestamp = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessages.Type property.
            /// </summary>
            /// <param name="value">Type</param>
            public GetMessagesBuilder Type(Object value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessages.Flags property.
            /// </summary>
            /// <param name="value">The user&#39;s [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags </param>
            public GetMessagesBuilder Flags(List<string> value)
            {
                _Flags = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessages.LastEditTimestamp property.
            /// </summary>
            /// <param name="value">The UNIX timestamp for when the message was last edited, in UTC seconds. </param>
            public GetMessagesBuilder LastEditTimestamp(int? value)
            {
                _LastEditTimestamp = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessages.MatchContent property.
            /// </summary>
            /// <param name="value">Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords. </param>
            public GetMessagesBuilder MatchContent(string value)
            {
                _MatchContent = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessages.MatchSubject property.
            /// </summary>
            /// <param name="value">Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords. </param>
            public GetMessagesBuilder MatchSubject(string value)
            {
                _MatchSubject = value;
                return this;
            }


            /// <summary>
            /// Builds instance of GetMessages.
            /// </summary>
            /// <returns>GetMessages</returns>
            public GetMessages Build()
            {
                Validate();
                return new GetMessages(
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
                    Type: _Type,
                    Flags: _Flags,
                    LastEditTimestamp: _LastEditTimestamp,
                    MatchContent: _MatchContent,
                    MatchSubject: _MatchSubject
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
