using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// BasicBotBase
    /// </summary>
    public sealed class BasicBotBase:  IEquatable<BasicBotBase>
    { 
        /// <summary>
        /// The user id of the bot. 
        /// </summary>
        public int? UserId { get; private set; }

        /// <summary>
        /// The full name of the bot. 
        /// </summary>
        public string FullName { get; private set; }

        /// <summary>
        /// The API key of the bot which it uses to make API requests. 
        /// </summary>
        public string ApiKey { get; private set; }

        /// <summary>
        /// The default sending stream of the bot. Null if the bot doesn&#39;t have a default sending stream. 
        /// </summary>
        public string DefaultSendingStream { get; private set; }

        /// <summary>
        /// The default stream for which the bot receives events/register data. Null if the bot doesn&#39;t have such a default stream. 
        /// </summary>
        public string DefaultEventsRegisterStream { get; private set; }

        /// <summary>
        /// Whether the bot can send messages to all streams by default. 
        /// </summary>
        public bool? DefaultAllPublicStreams { get; private set; }

        /// <summary>
        /// The URL of the bot&#39;s avatar. 
        /// </summary>
        public string AvatarUrl { get; private set; }

        /// <summary>
        /// The user id of the bot&#39;s owner.  Null if the bot has no owner. 
        /// </summary>
        public int? OwnerId { get; private set; }

        /// <summary>
        /// The \&quot;Services\&quot; array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
        /// </summary>
        public List<OneOfobjectobject> Services { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use BasicBotBase.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public BasicBotBase()
        {
        }

        private BasicBotBase(int? UserId, string FullName, string ApiKey, string DefaultSendingStream, string DefaultEventsRegisterStream, bool? DefaultAllPublicStreams, string AvatarUrl, int? OwnerId, List<OneOfobjectobject> Services)
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
        /// Returns builder of BasicBotBase.
        /// </summary>
        /// <returns>BasicBotBaseBuilder</returns>
        public static BasicBotBaseBuilder Builder()
        {
            return new BasicBotBaseBuilder();
        }

        /// <summary>
        /// Returns BasicBotBaseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>BasicBotBaseBuilder</returns>
        public BasicBotBaseBuilder With()
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

        public bool Equals(BasicBotBase other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (BasicBotBase.
        /// </summary>
        /// <param name="left">Compared (BasicBotBase</param>
        /// <param name="right">Compared (BasicBotBase</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (BasicBotBase left, BasicBotBase right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (BasicBotBase.
        /// </summary>
        /// <param name="left">Compared (BasicBotBase</param>
        /// <param name="right">Compared (BasicBotBase</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (BasicBotBase left, BasicBotBase right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of BasicBotBase.
        /// </summary>
        public sealed class BasicBotBaseBuilder
        {
            private int? _UserId;
            private string _FullName;
            private string _ApiKey;
            private string _DefaultSendingStream;
            private string _DefaultEventsRegisterStream;
            private bool? _DefaultAllPublicStreams;
            private string _AvatarUrl;
            private int? _OwnerId;
            private List<OneOfobjectobject> _Services;

            internal BasicBotBaseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for BasicBotBase.UserId property.
            /// </summary>
            /// <param name="value">The user id of the bot. </param>
            public BasicBotBaseBuilder UserId(int? value)
            {
                _UserId = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicBotBase.FullName property.
            /// </summary>
            /// <param name="value">The full name of the bot. </param>
            public BasicBotBaseBuilder FullName(string value)
            {
                _FullName = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicBotBase.ApiKey property.
            /// </summary>
            /// <param name="value">The API key of the bot which it uses to make API requests. </param>
            public BasicBotBaseBuilder ApiKey(string value)
            {
                _ApiKey = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicBotBase.DefaultSendingStream property.
            /// </summary>
            /// <param name="value">The default sending stream of the bot. Null if the bot doesn&#39;t have a default sending stream. </param>
            public BasicBotBaseBuilder DefaultSendingStream(string value)
            {
                _DefaultSendingStream = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicBotBase.DefaultEventsRegisterStream property.
            /// </summary>
            /// <param name="value">The default stream for which the bot receives events/register data. Null if the bot doesn&#39;t have such a default stream. </param>
            public BasicBotBaseBuilder DefaultEventsRegisterStream(string value)
            {
                _DefaultEventsRegisterStream = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicBotBase.DefaultAllPublicStreams property.
            /// </summary>
            /// <param name="value">Whether the bot can send messages to all streams by default. </param>
            public BasicBotBaseBuilder DefaultAllPublicStreams(bool? value)
            {
                _DefaultAllPublicStreams = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicBotBase.AvatarUrl property.
            /// </summary>
            /// <param name="value">The URL of the bot&#39;s avatar. </param>
            public BasicBotBaseBuilder AvatarUrl(string value)
            {
                _AvatarUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicBotBase.OwnerId property.
            /// </summary>
            /// <param name="value">The user id of the bot&#39;s owner.  Null if the bot has no owner. </param>
            public BasicBotBaseBuilder OwnerId(int? value)
            {
                _OwnerId = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicBotBase.Services property.
            /// </summary>
            /// <param name="value">The \&quot;Services\&quot; array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. </param>
            public BasicBotBaseBuilder Services(List<OneOfobjectobject> value)
            {
                _Services = value;
                return this;
            }


            /// <summary>
            /// Builds instance of BasicBotBase.
            /// </summary>
            /// <returns>BasicBotBase</returns>
            public BasicBotBase Build()
            {
                Validate();
                return new BasicBotBase(
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
