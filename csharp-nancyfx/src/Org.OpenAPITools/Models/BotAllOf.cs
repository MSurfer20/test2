using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// Object containing details of a bot. 
    /// </summary>
    public sealed class BotAllOf:  IEquatable<BotAllOf>
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
        /// Use BotAllOf.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public BotAllOf()
        {
        }

        private BotAllOf(Object UserId, Object FullName, Object ApiKey, Object DefaultSendingStream, Object DefaultEventsRegisterStream, Object DefaultAllPublicStreams, Object AvatarUrl, Object OwnerId, Object Services, string Email, int? BotType, bool? IsActive)
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
        /// Returns builder of BotAllOf.
        /// </summary>
        /// <returns>BotAllOfBuilder</returns>
        public static BotAllOfBuilder Builder()
        {
            return new BotAllOfBuilder();
        }

        /// <summary>
        /// Returns BotAllOfBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>BotAllOfBuilder</returns>
        public BotAllOfBuilder With()
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

        public bool Equals(BotAllOf other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (BotAllOf.
        /// </summary>
        /// <param name="left">Compared (BotAllOf</param>
        /// <param name="right">Compared (BotAllOf</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (BotAllOf left, BotAllOf right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (BotAllOf.
        /// </summary>
        /// <param name="left">Compared (BotAllOf</param>
        /// <param name="right">Compared (BotAllOf</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (BotAllOf left, BotAllOf right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of BotAllOf.
        /// </summary>
        public sealed class BotAllOfBuilder
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

            internal BotAllOfBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for BotAllOf.UserId property.
            /// </summary>
            /// <param name="value">UserId</param>
            public BotAllOfBuilder UserId(Object value)
            {
                _UserId = value;
                return this;
            }

            /// <summary>
            /// Sets value for BotAllOf.FullName property.
            /// </summary>
            /// <param name="value">FullName</param>
            public BotAllOfBuilder FullName(Object value)
            {
                _FullName = value;
                return this;
            }

            /// <summary>
            /// Sets value for BotAllOf.ApiKey property.
            /// </summary>
            /// <param name="value">ApiKey</param>
            public BotAllOfBuilder ApiKey(Object value)
            {
                _ApiKey = value;
                return this;
            }

            /// <summary>
            /// Sets value for BotAllOf.DefaultSendingStream property.
            /// </summary>
            /// <param name="value">DefaultSendingStream</param>
            public BotAllOfBuilder DefaultSendingStream(Object value)
            {
                _DefaultSendingStream = value;
                return this;
            }

            /// <summary>
            /// Sets value for BotAllOf.DefaultEventsRegisterStream property.
            /// </summary>
            /// <param name="value">DefaultEventsRegisterStream</param>
            public BotAllOfBuilder DefaultEventsRegisterStream(Object value)
            {
                _DefaultEventsRegisterStream = value;
                return this;
            }

            /// <summary>
            /// Sets value for BotAllOf.DefaultAllPublicStreams property.
            /// </summary>
            /// <param name="value">DefaultAllPublicStreams</param>
            public BotAllOfBuilder DefaultAllPublicStreams(Object value)
            {
                _DefaultAllPublicStreams = value;
                return this;
            }

            /// <summary>
            /// Sets value for BotAllOf.AvatarUrl property.
            /// </summary>
            /// <param name="value">AvatarUrl</param>
            public BotAllOfBuilder AvatarUrl(Object value)
            {
                _AvatarUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for BotAllOf.OwnerId property.
            /// </summary>
            /// <param name="value">OwnerId</param>
            public BotAllOfBuilder OwnerId(Object value)
            {
                _OwnerId = value;
                return this;
            }

            /// <summary>
            /// Sets value for BotAllOf.Services property.
            /// </summary>
            /// <param name="value">Services</param>
            public BotAllOfBuilder Services(Object value)
            {
                _Services = value;
                return this;
            }

            /// <summary>
            /// Sets value for BotAllOf.Email property.
            /// </summary>
            /// <param name="value">The email of the bot. </param>
            public BotAllOfBuilder Email(string value)
            {
                _Email = value;
                return this;
            }

            /// <summary>
            /// Sets value for BotAllOf.BotType property.
            /// </summary>
            /// <param name="value">An integer describing the type of bot: * &#x60;1&#x60; for a &#x60;Generic&#x60; bot. * &#x60;2&#x60; for an &#x60;Incoming webhook&#x60; bot. * &#x60;3&#x60; for an &#x60;Outgoing webhook&#x60; bot. * &#x60;4&#x60; for an &#x60;Embedded&#x60; bot. </param>
            public BotAllOfBuilder BotType(int? value)
            {
                _BotType = value;
                return this;
            }

            /// <summary>
            /// Sets value for BotAllOf.IsActive property.
            /// </summary>
            /// <param name="value">A boolean describing whether the user account has been deactivated. </param>
            public BotAllOfBuilder IsActive(bool? value)
            {
                _IsActive = value;
                return this;
            }


            /// <summary>
            /// Builds instance of BotAllOf.
            /// </summary>
            /// <returns>BotAllOf</returns>
            public BotAllOf Build()
            {
                Validate();
                return new BotAllOf(
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
