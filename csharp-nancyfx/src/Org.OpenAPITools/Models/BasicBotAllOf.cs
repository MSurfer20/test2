using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// BasicBotAllOf
    /// </summary>
    public sealed class BasicBotAllOf:  IEquatable<BasicBotAllOf>
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
        /// Use BasicBotAllOf.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public BasicBotAllOf()
        {
        }

        private BasicBotAllOf(Object UserId, Object FullName, Object ApiKey, Object DefaultSendingStream, Object DefaultEventsRegisterStream, Object DefaultAllPublicStreams, Object AvatarUrl, Object OwnerId, Object Services)
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
        /// Returns builder of BasicBotAllOf.
        /// </summary>
        /// <returns>BasicBotAllOfBuilder</returns>
        public static BasicBotAllOfBuilder Builder()
        {
            return new BasicBotAllOfBuilder();
        }

        /// <summary>
        /// Returns BasicBotAllOfBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>BasicBotAllOfBuilder</returns>
        public BasicBotAllOfBuilder With()
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

        public bool Equals(BasicBotAllOf other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (BasicBotAllOf.
        /// </summary>
        /// <param name="left">Compared (BasicBotAllOf</param>
        /// <param name="right">Compared (BasicBotAllOf</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (BasicBotAllOf left, BasicBotAllOf right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (BasicBotAllOf.
        /// </summary>
        /// <param name="left">Compared (BasicBotAllOf</param>
        /// <param name="right">Compared (BasicBotAllOf</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (BasicBotAllOf left, BasicBotAllOf right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of BasicBotAllOf.
        /// </summary>
        public sealed class BasicBotAllOfBuilder
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

            internal BasicBotAllOfBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for BasicBotAllOf.UserId property.
            /// </summary>
            /// <param name="value">UserId</param>
            public BasicBotAllOfBuilder UserId(Object value)
            {
                _UserId = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicBotAllOf.FullName property.
            /// </summary>
            /// <param name="value">FullName</param>
            public BasicBotAllOfBuilder FullName(Object value)
            {
                _FullName = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicBotAllOf.ApiKey property.
            /// </summary>
            /// <param name="value">ApiKey</param>
            public BasicBotAllOfBuilder ApiKey(Object value)
            {
                _ApiKey = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicBotAllOf.DefaultSendingStream property.
            /// </summary>
            /// <param name="value">DefaultSendingStream</param>
            public BasicBotAllOfBuilder DefaultSendingStream(Object value)
            {
                _DefaultSendingStream = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicBotAllOf.DefaultEventsRegisterStream property.
            /// </summary>
            /// <param name="value">DefaultEventsRegisterStream</param>
            public BasicBotAllOfBuilder DefaultEventsRegisterStream(Object value)
            {
                _DefaultEventsRegisterStream = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicBotAllOf.DefaultAllPublicStreams property.
            /// </summary>
            /// <param name="value">DefaultAllPublicStreams</param>
            public BasicBotAllOfBuilder DefaultAllPublicStreams(Object value)
            {
                _DefaultAllPublicStreams = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicBotAllOf.AvatarUrl property.
            /// </summary>
            /// <param name="value">AvatarUrl</param>
            public BasicBotAllOfBuilder AvatarUrl(Object value)
            {
                _AvatarUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicBotAllOf.OwnerId property.
            /// </summary>
            /// <param name="value">OwnerId</param>
            public BasicBotAllOfBuilder OwnerId(Object value)
            {
                _OwnerId = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicBotAllOf.Services property.
            /// </summary>
            /// <param name="value">Services</param>
            public BasicBotAllOfBuilder Services(Object value)
            {
                _Services = value;
                return this;
            }


            /// <summary>
            /// Builds instance of BasicBotAllOf.
            /// </summary>
            /// <returns>BasicBotAllOf</returns>
            public BasicBotAllOf Build()
            {
                Validate();
                return new BasicBotAllOf(
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
