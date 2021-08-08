using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// Messages
    /// </summary>
    public sealed class Messages:  IEquatable<Messages>
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
        /// Empty constructor required by some serializers.
        /// Use Messages.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Messages()
        {
        }

        private Messages(Object AvatarUrl, Object Client, Object Content, Object ContentType, Object DisplayRecipient, Object Id, Object IsMeMessage, Object Reactions, Object RecipientId, Object SenderEmail, Object SenderFullName, Object SenderId, Object SenderRealmStr, Object StreamId, Object Subject, Object TopicLinks, Object Submessages, Object Timestamp, Object Type)
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
        /// Returns builder of Messages.
        /// </summary>
        /// <returns>MessagesBuilder</returns>
        public static MessagesBuilder Builder()
        {
            return new MessagesBuilder();
        }

        /// <summary>
        /// Returns MessagesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>MessagesBuilder</returns>
        public MessagesBuilder With()
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

        public bool Equals(Messages other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Messages.
        /// </summary>
        /// <param name="left">Compared (Messages</param>
        /// <param name="right">Compared (Messages</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Messages left, Messages right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Messages.
        /// </summary>
        /// <param name="left">Compared (Messages</param>
        /// <param name="right">Compared (Messages</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Messages left, Messages right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Messages.
        /// </summary>
        public sealed class MessagesBuilder
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

            internal MessagesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Messages.AvatarUrl property.
            /// </summary>
            /// <param name="value">AvatarUrl</param>
            public MessagesBuilder AvatarUrl(Object value)
            {
                _AvatarUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for Messages.Client property.
            /// </summary>
            /// <param name="value">Client</param>
            public MessagesBuilder Client(Object value)
            {
                _Client = value;
                return this;
            }

            /// <summary>
            /// Sets value for Messages.Content property.
            /// </summary>
            /// <param name="value">Content</param>
            public MessagesBuilder Content(Object value)
            {
                _Content = value;
                return this;
            }

            /// <summary>
            /// Sets value for Messages.ContentType property.
            /// </summary>
            /// <param name="value">ContentType</param>
            public MessagesBuilder ContentType(Object value)
            {
                _ContentType = value;
                return this;
            }

            /// <summary>
            /// Sets value for Messages.DisplayRecipient property.
            /// </summary>
            /// <param name="value">DisplayRecipient</param>
            public MessagesBuilder DisplayRecipient(Object value)
            {
                _DisplayRecipient = value;
                return this;
            }

            /// <summary>
            /// Sets value for Messages.Id property.
            /// </summary>
            /// <param name="value">Id</param>
            public MessagesBuilder Id(Object value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for Messages.IsMeMessage property.
            /// </summary>
            /// <param name="value">IsMeMessage</param>
            public MessagesBuilder IsMeMessage(Object value)
            {
                _IsMeMessage = value;
                return this;
            }

            /// <summary>
            /// Sets value for Messages.Reactions property.
            /// </summary>
            /// <param name="value">Reactions</param>
            public MessagesBuilder Reactions(Object value)
            {
                _Reactions = value;
                return this;
            }

            /// <summary>
            /// Sets value for Messages.RecipientId property.
            /// </summary>
            /// <param name="value">RecipientId</param>
            public MessagesBuilder RecipientId(Object value)
            {
                _RecipientId = value;
                return this;
            }

            /// <summary>
            /// Sets value for Messages.SenderEmail property.
            /// </summary>
            /// <param name="value">SenderEmail</param>
            public MessagesBuilder SenderEmail(Object value)
            {
                _SenderEmail = value;
                return this;
            }

            /// <summary>
            /// Sets value for Messages.SenderFullName property.
            /// </summary>
            /// <param name="value">SenderFullName</param>
            public MessagesBuilder SenderFullName(Object value)
            {
                _SenderFullName = value;
                return this;
            }

            /// <summary>
            /// Sets value for Messages.SenderId property.
            /// </summary>
            /// <param name="value">SenderId</param>
            public MessagesBuilder SenderId(Object value)
            {
                _SenderId = value;
                return this;
            }

            /// <summary>
            /// Sets value for Messages.SenderRealmStr property.
            /// </summary>
            /// <param name="value">SenderRealmStr</param>
            public MessagesBuilder SenderRealmStr(Object value)
            {
                _SenderRealmStr = value;
                return this;
            }

            /// <summary>
            /// Sets value for Messages.StreamId property.
            /// </summary>
            /// <param name="value">StreamId</param>
            public MessagesBuilder StreamId(Object value)
            {
                _StreamId = value;
                return this;
            }

            /// <summary>
            /// Sets value for Messages.Subject property.
            /// </summary>
            /// <param name="value">Subject</param>
            public MessagesBuilder Subject(Object value)
            {
                _Subject = value;
                return this;
            }

            /// <summary>
            /// Sets value for Messages.TopicLinks property.
            /// </summary>
            /// <param name="value">TopicLinks</param>
            public MessagesBuilder TopicLinks(Object value)
            {
                _TopicLinks = value;
                return this;
            }

            /// <summary>
            /// Sets value for Messages.Submessages property.
            /// </summary>
            /// <param name="value">Submessages</param>
            public MessagesBuilder Submessages(Object value)
            {
                _Submessages = value;
                return this;
            }

            /// <summary>
            /// Sets value for Messages.Timestamp property.
            /// </summary>
            /// <param name="value">Timestamp</param>
            public MessagesBuilder Timestamp(Object value)
            {
                _Timestamp = value;
                return this;
            }

            /// <summary>
            /// Sets value for Messages.Type property.
            /// </summary>
            /// <param name="value">Type</param>
            public MessagesBuilder Type(Object value)
            {
                _Type = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Messages.
            /// </summary>
            /// <returns>Messages</returns>
            public Messages Build()
            {
                Validate();
                return new Messages(
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
