using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// GetMessagesAllOf
    /// </summary>
    public sealed class GetMessagesAllOf:  IEquatable<GetMessagesAllOf>
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
        /// Use GetMessagesAllOf.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public GetMessagesAllOf()
        {
        }

        private GetMessagesAllOf(Object AvatarUrl, Object Client, Object Content, Object ContentType, Object DisplayRecipient, Object Id, Object IsMeMessage, Object Reactions, Object RecipientId, Object SenderEmail, Object SenderFullName, Object SenderId, Object SenderRealmStr, Object StreamId, Object Subject, Object TopicLinks, Object Submessages, Object Timestamp, Object Type, List<string> Flags, int? LastEditTimestamp, string MatchContent, string MatchSubject)
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
        /// Returns builder of GetMessagesAllOf.
        /// </summary>
        /// <returns>GetMessagesAllOfBuilder</returns>
        public static GetMessagesAllOfBuilder Builder()
        {
            return new GetMessagesAllOfBuilder();
        }

        /// <summary>
        /// Returns GetMessagesAllOfBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>GetMessagesAllOfBuilder</returns>
        public GetMessagesAllOfBuilder With()
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

        public bool Equals(GetMessagesAllOf other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (GetMessagesAllOf.
        /// </summary>
        /// <param name="left">Compared (GetMessagesAllOf</param>
        /// <param name="right">Compared (GetMessagesAllOf</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (GetMessagesAllOf left, GetMessagesAllOf right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (GetMessagesAllOf.
        /// </summary>
        /// <param name="left">Compared (GetMessagesAllOf</param>
        /// <param name="right">Compared (GetMessagesAllOf</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (GetMessagesAllOf left, GetMessagesAllOf right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of GetMessagesAllOf.
        /// </summary>
        public sealed class GetMessagesAllOfBuilder
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

            internal GetMessagesAllOfBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for GetMessagesAllOf.AvatarUrl property.
            /// </summary>
            /// <param name="value">AvatarUrl</param>
            public GetMessagesAllOfBuilder AvatarUrl(Object value)
            {
                _AvatarUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessagesAllOf.Client property.
            /// </summary>
            /// <param name="value">Client</param>
            public GetMessagesAllOfBuilder Client(Object value)
            {
                _Client = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessagesAllOf.Content property.
            /// </summary>
            /// <param name="value">Content</param>
            public GetMessagesAllOfBuilder Content(Object value)
            {
                _Content = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessagesAllOf.ContentType property.
            /// </summary>
            /// <param name="value">ContentType</param>
            public GetMessagesAllOfBuilder ContentType(Object value)
            {
                _ContentType = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessagesAllOf.DisplayRecipient property.
            /// </summary>
            /// <param name="value">DisplayRecipient</param>
            public GetMessagesAllOfBuilder DisplayRecipient(Object value)
            {
                _DisplayRecipient = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessagesAllOf.Id property.
            /// </summary>
            /// <param name="value">Id</param>
            public GetMessagesAllOfBuilder Id(Object value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessagesAllOf.IsMeMessage property.
            /// </summary>
            /// <param name="value">IsMeMessage</param>
            public GetMessagesAllOfBuilder IsMeMessage(Object value)
            {
                _IsMeMessage = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessagesAllOf.Reactions property.
            /// </summary>
            /// <param name="value">Reactions</param>
            public GetMessagesAllOfBuilder Reactions(Object value)
            {
                _Reactions = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessagesAllOf.RecipientId property.
            /// </summary>
            /// <param name="value">RecipientId</param>
            public GetMessagesAllOfBuilder RecipientId(Object value)
            {
                _RecipientId = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessagesAllOf.SenderEmail property.
            /// </summary>
            /// <param name="value">SenderEmail</param>
            public GetMessagesAllOfBuilder SenderEmail(Object value)
            {
                _SenderEmail = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessagesAllOf.SenderFullName property.
            /// </summary>
            /// <param name="value">SenderFullName</param>
            public GetMessagesAllOfBuilder SenderFullName(Object value)
            {
                _SenderFullName = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessagesAllOf.SenderId property.
            /// </summary>
            /// <param name="value">SenderId</param>
            public GetMessagesAllOfBuilder SenderId(Object value)
            {
                _SenderId = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessagesAllOf.SenderRealmStr property.
            /// </summary>
            /// <param name="value">SenderRealmStr</param>
            public GetMessagesAllOfBuilder SenderRealmStr(Object value)
            {
                _SenderRealmStr = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessagesAllOf.StreamId property.
            /// </summary>
            /// <param name="value">StreamId</param>
            public GetMessagesAllOfBuilder StreamId(Object value)
            {
                _StreamId = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessagesAllOf.Subject property.
            /// </summary>
            /// <param name="value">Subject</param>
            public GetMessagesAllOfBuilder Subject(Object value)
            {
                _Subject = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessagesAllOf.TopicLinks property.
            /// </summary>
            /// <param name="value">TopicLinks</param>
            public GetMessagesAllOfBuilder TopicLinks(Object value)
            {
                _TopicLinks = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessagesAllOf.Submessages property.
            /// </summary>
            /// <param name="value">Submessages</param>
            public GetMessagesAllOfBuilder Submessages(Object value)
            {
                _Submessages = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessagesAllOf.Timestamp property.
            /// </summary>
            /// <param name="value">Timestamp</param>
            public GetMessagesAllOfBuilder Timestamp(Object value)
            {
                _Timestamp = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessagesAllOf.Type property.
            /// </summary>
            /// <param name="value">Type</param>
            public GetMessagesAllOfBuilder Type(Object value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessagesAllOf.Flags property.
            /// </summary>
            /// <param name="value">The user&#39;s [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags </param>
            public GetMessagesAllOfBuilder Flags(List<string> value)
            {
                _Flags = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessagesAllOf.LastEditTimestamp property.
            /// </summary>
            /// <param name="value">The UNIX timestamp for when the message was last edited, in UTC seconds. </param>
            public GetMessagesAllOfBuilder LastEditTimestamp(int? value)
            {
                _LastEditTimestamp = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessagesAllOf.MatchContent property.
            /// </summary>
            /// <param name="value">Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords. </param>
            public GetMessagesAllOfBuilder MatchContent(string value)
            {
                _MatchContent = value;
                return this;
            }

            /// <summary>
            /// Sets value for GetMessagesAllOf.MatchSubject property.
            /// </summary>
            /// <param name="value">Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords. </param>
            public GetMessagesAllOfBuilder MatchSubject(string value)
            {
                _MatchSubject = value;
                return this;
            }


            /// <summary>
            /// Builds instance of GetMessagesAllOf.
            /// </summary>
            /// <returns>GetMessagesAllOf</returns>
            public GetMessagesAllOf Build()
            {
                Validate();
                return new GetMessagesAllOf(
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
