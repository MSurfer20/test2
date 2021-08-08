using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// &#x60;{client_name}&#x60;: Object containing the details of the user&#39;s presence on a particular platform with the client&#39;s platform name being the object key. 
    /// </summary>
    public sealed class Presence:  IEquatable<Presence>
    { 
        /// <summary>
        /// The client&#39;s platform name. 
        /// </summary>
        public string Client { get; private set; }

        /// <summary>
        /// The status of the user on this client. It is either &#x60;idle&#x60; or &#x60;active&#x60;. 
        /// </summary>
        public StatusEnum? Status { get; private set; }

        /// <summary>
        /// The UNIX timestamp of when this client sent the user&#39;s presence to the server with the precision of a second. 
        /// </summary>
        public int? Timestamp { get; private set; }

        /// <summary>
        /// Whether the client is capable of showing mobile/push notifications to the user. 
        /// </summary>
        public bool? Pushable { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Presence.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Presence()
        {
        }

        private Presence(string Client, StatusEnum? Status, int? Timestamp, bool? Pushable)
        {
            
            this.Client = Client;
            
            this.Status = Status;
            
            this.Timestamp = Timestamp;
            
            this.Pushable = Pushable;
            
        }

        /// <summary>
        /// Returns builder of Presence.
        /// </summary>
        /// <returns>PresenceBuilder</returns>
        public static PresenceBuilder Builder()
        {
            return new PresenceBuilder();
        }

        /// <summary>
        /// Returns PresenceBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>PresenceBuilder</returns>
        public PresenceBuilder With()
        {
            return Builder()
                .Client(Client)
                .Status(Status)
                .Timestamp(Timestamp)
                .Pushable(Pushable);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Presence other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Presence.
        /// </summary>
        /// <param name="left">Compared (Presence</param>
        /// <param name="right">Compared (Presence</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Presence left, Presence right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Presence.
        /// </summary>
        /// <param name="left">Compared (Presence</param>
        /// <param name="right">Compared (Presence</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Presence left, Presence right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Presence.
        /// </summary>
        public sealed class PresenceBuilder
        {
            private string _Client;
            private StatusEnum? _Status;
            private int? _Timestamp;
            private bool? _Pushable;

            internal PresenceBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Presence.Client property.
            /// </summary>
            /// <param name="value">The client&#39;s platform name. </param>
            public PresenceBuilder Client(string value)
            {
                _Client = value;
                return this;
            }

            /// <summary>
            /// Sets value for Presence.Status property.
            /// </summary>
            /// <param name="value">The status of the user on this client. It is either &#x60;idle&#x60; or &#x60;active&#x60;. </param>
            public PresenceBuilder Status(StatusEnum? value)
            {
                _Status = value;
                return this;
            }

            /// <summary>
            /// Sets value for Presence.Timestamp property.
            /// </summary>
            /// <param name="value">The UNIX timestamp of when this client sent the user&#39;s presence to the server with the precision of a second. </param>
            public PresenceBuilder Timestamp(int? value)
            {
                _Timestamp = value;
                return this;
            }

            /// <summary>
            /// Sets value for Presence.Pushable property.
            /// </summary>
            /// <param name="value">Whether the client is capable of showing mobile/push notifications to the user. </param>
            public PresenceBuilder Pushable(bool? value)
            {
                _Pushable = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Presence.
            /// </summary>
            /// <returns>Presence</returns>
            public Presence Build()
            {
                Validate();
                return new Presence(
                    Client: _Client,
                    Status: _Status,
                    Timestamp: _Timestamp,
                    Pushable: _Pushable
                );
            }

            private void Validate()
            { 
            }
        }

        
        public enum StatusEnum { Idle, Active };
    }
}
