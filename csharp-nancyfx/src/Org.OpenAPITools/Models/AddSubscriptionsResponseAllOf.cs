using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// AddSubscriptionsResponseAllOf
    /// </summary>
    public sealed class AddSubscriptionsResponseAllOf:  IEquatable<AddSubscriptionsResponseAllOf>
    { 
        /// <summary>
        /// Result
        /// </summary>
        public Object Result { get; private set; }

        /// <summary>
        /// Msg
        /// </summary>
        public Object Msg { get; private set; }

        /// <summary>
        /// A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
        /// </summary>
        public Dictionary<string, List<string>> Subscribed { get; private set; }

        /// <summary>
        /// A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
        /// </summary>
        public Dictionary<string, List<string>> AlreadySubscribed { get; private set; }

        /// <summary>
        /// A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if &#x60;authorization_errors_fatal&#x3D;false&#x60;. 
        /// </summary>
        public List<string> Unauthorized { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AddSubscriptionsResponseAllOf.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AddSubscriptionsResponseAllOf()
        {
        }

        private AddSubscriptionsResponseAllOf(Object Result, Object Msg, Dictionary<string, List<string>> Subscribed, Dictionary<string, List<string>> AlreadySubscribed, List<string> Unauthorized)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
            this.Subscribed = Subscribed;
            
            this.AlreadySubscribed = AlreadySubscribed;
            
            this.Unauthorized = Unauthorized;
            
        }

        /// <summary>
        /// Returns builder of AddSubscriptionsResponseAllOf.
        /// </summary>
        /// <returns>AddSubscriptionsResponseAllOfBuilder</returns>
        public static AddSubscriptionsResponseAllOfBuilder Builder()
        {
            return new AddSubscriptionsResponseAllOfBuilder();
        }

        /// <summary>
        /// Returns AddSubscriptionsResponseAllOfBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AddSubscriptionsResponseAllOfBuilder</returns>
        public AddSubscriptionsResponseAllOfBuilder With()
        {
            return Builder()
                .Result(Result)
                .Msg(Msg)
                .Subscribed(Subscribed)
                .AlreadySubscribed(AlreadySubscribed)
                .Unauthorized(Unauthorized);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(AddSubscriptionsResponseAllOf other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AddSubscriptionsResponseAllOf.
        /// </summary>
        /// <param name="left">Compared (AddSubscriptionsResponseAllOf</param>
        /// <param name="right">Compared (AddSubscriptionsResponseAllOf</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AddSubscriptionsResponseAllOf left, AddSubscriptionsResponseAllOf right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AddSubscriptionsResponseAllOf.
        /// </summary>
        /// <param name="left">Compared (AddSubscriptionsResponseAllOf</param>
        /// <param name="right">Compared (AddSubscriptionsResponseAllOf</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AddSubscriptionsResponseAllOf left, AddSubscriptionsResponseAllOf right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AddSubscriptionsResponseAllOf.
        /// </summary>
        public sealed class AddSubscriptionsResponseAllOfBuilder
        {
            private Object _Result;
            private Object _Msg;
            private Dictionary<string, List<string>> _Subscribed;
            private Dictionary<string, List<string>> _AlreadySubscribed;
            private List<string> _Unauthorized;

            internal AddSubscriptionsResponseAllOfBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AddSubscriptionsResponseAllOf.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public AddSubscriptionsResponseAllOfBuilder Result(Object value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for AddSubscriptionsResponseAllOf.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public AddSubscriptionsResponseAllOfBuilder Msg(Object value)
            {
                _Msg = value;
                return this;
            }

            /// <summary>
            /// Sets value for AddSubscriptionsResponseAllOf.Subscribed property.
            /// </summary>
            /// <param name="value">A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. </param>
            public AddSubscriptionsResponseAllOfBuilder Subscribed(Dictionary<string, List<string>> value)
            {
                _Subscribed = value;
                return this;
            }

            /// <summary>
            /// Sets value for AddSubscriptionsResponseAllOf.AlreadySubscribed property.
            /// </summary>
            /// <param name="value">A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. </param>
            public AddSubscriptionsResponseAllOfBuilder AlreadySubscribed(Dictionary<string, List<string>> value)
            {
                _AlreadySubscribed = value;
                return this;
            }

            /// <summary>
            /// Sets value for AddSubscriptionsResponseAllOf.Unauthorized property.
            /// </summary>
            /// <param name="value">A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if &#x60;authorization_errors_fatal&#x3D;false&#x60;. </param>
            public AddSubscriptionsResponseAllOfBuilder Unauthorized(List<string> value)
            {
                _Unauthorized = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AddSubscriptionsResponseAllOf.
            /// </summary>
            /// <returns>AddSubscriptionsResponseAllOf</returns>
            public AddSubscriptionsResponseAllOf Build()
            {
                Validate();
                return new AddSubscriptionsResponseAllOf(
                    Result: _Result,
                    Msg: _Msg,
                    Subscribed: _Subscribed,
                    AlreadySubscribed: _AlreadySubscribed,
                    Unauthorized: _Unauthorized
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
