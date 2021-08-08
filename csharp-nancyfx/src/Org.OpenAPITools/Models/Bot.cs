using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// Bot
    /// </summary>
    public sealed class Bot:  IEquatable<Bot>
    { 
        /// <summary>
        /// UserId
        /// </summary>
        public Object UserId { get; private set; }

        /// <summary>
        /// FullName
        /// </summary>
        public Object FullName { get; private set; }

        /// <summary>
        /// ApiKey
        /// </summary>
        public Object ApiKey { get; private set; }

        /// <summary>
        /// DefaultSendingStream
        /// </summary>
        public Object DefaultSendingStream { get; private set; }

        /// <summary>
        /// DefaultEventsRegisterStream
        /// </summary>
        public Object DefaultEventsRegisterStream { get; private set; }

        /// <summary>
        /// DefaultAllPublicStreams
        /// </summary>
        public Object DefaultAllPublicStreams { get; private set; }

        /// <summary>
        /// AvatarUrl
        /// </summary>
        public Object AvatarUrl { get; private set; }

        /// <summary>
        /// OwnerId
        /// </summary>
        public Object OwnerId { get; private set; }

        /// <summary>
        /// Services
        /// </summary>
        public Object Services { get; private set; }

        /// <summary>
        /// The email of the bot. 
        /// </summary>
        public string Email { get; private set; }

        /// <summary>
        /// An integer describing the type of bot: * &#x60;1&#x60; for a &#x60;Generic&#x60; bot. * &#x60;2&#x60; for an &#x60;Incoming webhook&#x60; bot. * &#x60;3&#x60; for an &#x60;Outgoing webhook&#x60; bot. * &#x60;4&#x60; for an &#x60;Embedded&#x60; bot. 
        /// </summary>
        public int? BotType { get; private set; }

        /// <summary>
        /// A boolean describing whether the user account has been deactivated. 
        /// </summary>
        public bool? IsActive { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Bot.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Bot()
        {
        }

        private Bot(Object UserId, Object FullName, Object ApiKey, Object DefaultSendingStream, Object DefaultEventsRegisterStream, Object DefaultAllPublicStreams, Object AvatarUrl, Object OwnerId, Object Services, string Email, int? BotType, bool? IsActive)
        {
            
            this.UserId = UserId;
            
            this.FullName = FullName;
            
            this.ApiKey = ApiKey;
            
            this.DefaultSendingStream = DefaultSendingStream;
            
            this.DefaultEventsRegisterStream = DefaultEventsRegisterStream;
            
            this.DefaultAllPublicStreams = DefaultAllPublicStreams;
            
            this.AvatarUrl = AvatarUrl;
            
            this.OwnerId = OwnerId;
            
            this.Services = Services;
            
            this.Email = Email;
            
            this.BotType = BotType;
            
            this.IsActive = IsActive;
            
        }

        /// <summary>
        /// Returns builder of Bot.
        /// </summary>
        /// <returns>BotBuilder</returns>
        public static BotBuilder Builder()
        {
            return new BotBuilder();
        }

        /// <summary>
        /// Returns BotBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>BotBuilder</returns>
        public BotBuilder With()
        {
            return Builder()
                .UserId(UserId)
                .FullName(FullName)
                .ApiKey(ApiKey)
                .DefaultSendingStream(DefaultSendingStream)
                .DefaultEventsRegisterStream(DefaultEventsRegisterStream)
                .DefaultAllPublicStreams(DefaultAllPublicStreams)
                .AvatarUrl(AvatarUrl)
                .OwnerId(OwnerId)
                .Services(Services)
                .Email(Email)
                .BotType(BotType)
                .IsActive(IsActive);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Bot other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Bot.
        /// </summary>
        /// <param name="left">Compared (Bot</param>
        /// <param name="right">Compared (Bot</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Bot left, Bot right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Bot.
        /// </summary>
        /// <param name="left">Compared (Bot</param>
        /// <param name="right">Compared (Bot</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Bot left, Bot right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Bot.
        /// </summary>
        public sealed class BotBuilder
        {
            private Object _UserId;
            private Object _FullName;
            private Object _ApiKey;
            private Object _DefaultSendingStream;
            private Object _DefaultEventsRegisterStream;
            private Object _DefaultAllPublicStreams;
            private Object _AvatarUrl;
            private Object _OwnerId;
            private Object _Services;
            private string _Email;
            private int? _BotType;
            private bool? _IsActive;

            internal BotBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Bot.UserId property.
            /// </summary>
            /// <param name="value">UserId</param>
            public BotBuilder UserId(Object value)
            {
                _UserId = value;
                return this;
            }

            /// <summary>
            /// Sets value for Bot.FullName property.
            /// </summary>
            /// <param name="value">FullName</param>
            public BotBuilder FullName(Object value)
            {
                _FullName = value;
                return this;
            }

            /// <summary>
            /// Sets value for Bot.ApiKey property.
            /// </summary>
            /// <param name="value">ApiKey</param>
            public BotBuilder ApiKey(Object value)
            {
                _ApiKey = value;
                return this;
            }

            /// <summary>
            /// Sets value for Bot.DefaultSendingStream property.
            /// </summary>
            /// <param name="value">DefaultSendingStream</param>
            public BotBuilder DefaultSendingStream(Object value)
            {
                _DefaultSendingStream = value;
                return this;
            }

            /// <summary>
            /// Sets value for Bot.DefaultEventsRegisterStream property.
            /// </summary>
            /// <param name="value">DefaultEventsRegisterStream</param>
            public BotBuilder DefaultEventsRegisterStream(Object value)
            {
                _DefaultEventsRegisterStream = value;
                return this;
            }

            /// <summary>
            /// Sets value for Bot.DefaultAllPublicStreams property.
            /// </summary>
            /// <param name="value">DefaultAllPublicStreams</param>
            public BotBuilder DefaultAllPublicStreams(Object value)
            {
                _DefaultAllPublicStreams = value;
                return this;
            }

            /// <summary>
            /// Sets value for Bot.AvatarUrl property.
            /// </summary>
            /// <param name="value">AvatarUrl</param>
            public BotBuilder AvatarUrl(Object value)
            {
                _AvatarUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for Bot.OwnerId property.
            /// </summary>
            /// <param name="value">OwnerId</param>
            public BotBuilder OwnerId(Object value)
            {
                _OwnerId = value;
                return this;
            }

            /// <summary>
            /// Sets value for Bot.Services property.
            /// </summary>
            /// <param name="value">Services</param>
            public BotBuilder Services(Object value)
            {
                _Services = value;
                return this;
            }

            /// <summary>
            /// Sets value for Bot.Email property.
            /// </summary>
            /// <param name="value">The email of the bot. </param>
            public BotBuilder Email(string value)
            {
                _Email = value;
                return this;
            }

            /// <summary>
            /// Sets value for Bot.BotType property.
            /// </summary>
            /// <param name="value">An integer describing the type of bot: * &#x60;1&#x60; for a &#x60;Generic&#x60; bot. * &#x60;2&#x60; for an &#x60;Incoming webhook&#x60; bot. * &#x60;3&#x60; for an &#x60;Outgoing webhook&#x60; bot. * &#x60;4&#x60; for an &#x60;Embedded&#x60; bot. </param>
            public BotBuilder BotType(int? value)
            {
                _BotType = value;
                return this;
            }

            /// <summary>
            /// Sets value for Bot.IsActive property.
            /// </summary>
            /// <param name="value">A boolean describing whether the user account has been deactivated. </param>
            public BotBuilder IsActive(bool? value)
            {
                _IsActive = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Bot.
            /// </summary>
            /// <returns>Bot</returns>
            public Bot Build()
            {
                Validate();
                return new Bot(
                    UserId: _UserId,
                    FullName: _FullName,
                    ApiKey: _ApiKey,
                    DefaultSendingStream: _DefaultSendingStream,
                    DefaultEventsRegisterStream: _DefaultEventsRegisterStream,
                    DefaultAllPublicStreams: _DefaultAllPublicStreams,
                    AvatarUrl: _AvatarUrl,
                    OwnerId: _OwnerId,
                    Services: _Services,
                    Email: _Email,
                    BotType: _BotType,
                    IsActive: _IsActive
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
