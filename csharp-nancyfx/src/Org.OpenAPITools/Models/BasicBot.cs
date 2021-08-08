using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// BasicBot
    /// </summary>
    public sealed class BasicBot:  IEquatable<BasicBot>
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
        /// Empty constructor required by some serializers.
        /// Use BasicBot.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public BasicBot()
        {
        }

        private BasicBot(Object UserId, Object FullName, Object ApiKey, Object DefaultSendingStream, Object DefaultEventsRegisterStream, Object DefaultAllPublicStreams, Object AvatarUrl, Object OwnerId, Object Services)
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
            
        }

        /// <summary>
        /// Returns builder of BasicBot.
        /// </summary>
        /// <returns>BasicBotBuilder</returns>
        public static BasicBotBuilder Builder()
        {
            return new BasicBotBuilder();
        }

        /// <summary>
        /// Returns BasicBotBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>BasicBotBuilder</returns>
        public BasicBotBuilder With()
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
                .Services(Services);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(BasicBot other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (BasicBot.
        /// </summary>
        /// <param name="left">Compared (BasicBot</param>
        /// <param name="right">Compared (BasicBot</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (BasicBot left, BasicBot right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (BasicBot.
        /// </summary>
        /// <param name="left">Compared (BasicBot</param>
        /// <param name="right">Compared (BasicBot</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (BasicBot left, BasicBot right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of BasicBot.
        /// </summary>
        public sealed class BasicBotBuilder
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

            internal BasicBotBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for BasicBot.UserId property.
            /// </summary>
            /// <param name="value">UserId</param>
            public BasicBotBuilder UserId(Object value)
            {
                _UserId = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicBot.FullName property.
            /// </summary>
            /// <param name="value">FullName</param>
            public BasicBotBuilder FullName(Object value)
            {
                _FullName = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicBot.ApiKey property.
            /// </summary>
            /// <param name="value">ApiKey</param>
            public BasicBotBuilder ApiKey(Object value)
            {
                _ApiKey = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicBot.DefaultSendingStream property.
            /// </summary>
            /// <param name="value">DefaultSendingStream</param>
            public BasicBotBuilder DefaultSendingStream(Object value)
            {
                _DefaultSendingStream = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicBot.DefaultEventsRegisterStream property.
            /// </summary>
            /// <param name="value">DefaultEventsRegisterStream</param>
            public BasicBotBuilder DefaultEventsRegisterStream(Object value)
            {
                _DefaultEventsRegisterStream = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicBot.DefaultAllPublicStreams property.
            /// </summary>
            /// <param name="value">DefaultAllPublicStreams</param>
            public BasicBotBuilder DefaultAllPublicStreams(Object value)
            {
                _DefaultAllPublicStreams = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicBot.AvatarUrl property.
            /// </summary>
            /// <param name="value">AvatarUrl</param>
            public BasicBotBuilder AvatarUrl(Object value)
            {
                _AvatarUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicBot.OwnerId property.
            /// </summary>
            /// <param name="value">OwnerId</param>
            public BasicBotBuilder OwnerId(Object value)
            {
                _OwnerId = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicBot.Services property.
            /// </summary>
            /// <param name="value">Services</param>
            public BasicBotBuilder Services(Object value)
            {
                _Services = value;
                return this;
            }


            /// <summary>
            /// Builds instance of BasicBot.
            /// </summary>
            /// <returns>BasicBot</returns>
            public BasicBot Build()
            {
                Validate();
                return new BasicBot(
                    UserId: _UserId,
                    FullName: _FullName,
                    ApiKey: _ApiKey,
                    DefaultSendingStream: _DefaultSendingStream,
                    DefaultEventsRegisterStream: _DefaultEventsRegisterStream,
                    DefaultAllPublicStreams: _DefaultAllPublicStreams,
                    AvatarUrl: _AvatarUrl,
                    OwnerId: _OwnerId,
                    Services: _Services
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
