using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// AddSubscriptionsResponse
    /// </summary>
    public sealed class AddSubscriptionsResponse:  IEquatable<AddSubscriptionsResponse>
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
        /// Use AddSubscriptionsResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AddSubscriptionsResponse()
        {
        }

        private AddSubscriptionsResponse(Object Result, Object Msg, Dictionary<string, List<string>> Subscribed, Dictionary<string, List<string>> AlreadySubscribed, List<string> Unauthorized)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
            this.Subscribed = Subscribed;
            
            this.AlreadySubscribed = AlreadySubscribed;
            
            this.Unauthorized = Unauthorized;
            
        }

        /// <summary>
        /// Returns builder of AddSubscriptionsResponse.
        /// </summary>
        /// <returns>AddSubscriptionsResponseBuilder</returns>
        public static AddSubscriptionsResponseBuilder Builder()
        {
            return new AddSubscriptionsResponseBuilder();
        }

        /// <summary>
        /// Returns AddSubscriptionsResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AddSubscriptionsResponseBuilder</returns>
        public AddSubscriptionsResponseBuilder With()
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

        public bool Equals(AddSubscriptionsResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AddSubscriptionsResponse.
        /// </summary>
        /// <param name="left">Compared (AddSubscriptionsResponse</param>
        /// <param name="right">Compared (AddSubscriptionsResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AddSubscriptionsResponse left, AddSubscriptionsResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AddSubscriptionsResponse.
        /// </summary>
        /// <param name="left">Compared (AddSubscriptionsResponse</param>
        /// <param name="right">Compared (AddSubscriptionsResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AddSubscriptionsResponse left, AddSubscriptionsResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AddSubscriptionsResponse.
        /// </summary>
        public sealed class AddSubscriptionsResponseBuilder
        {
            private Object _Result;
            private Object _Msg;
            private Dictionary<string, List<string>> _Subscribed;
            private Dictionary<string, List<string>> _AlreadySubscribed;
            private List<string> _Unauthorized;

            internal AddSubscriptionsResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AddSubscriptionsResponse.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public AddSubscriptionsResponseBuilder Result(Object value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for AddSubscriptionsResponse.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public AddSubscriptionsResponseBuilder Msg(Object value)
            {
                _Msg = value;
                return this;
            }

            /// <summary>
            /// Sets value for AddSubscriptionsResponse.Subscribed property.
            /// </summary>
            /// <param name="value">A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. </param>
            public AddSubscriptionsResponseBuilder Subscribed(Dictionary<string, List<string>> value)
            {
                _Subscribed = value;
                return this;
            }

            /// <summary>
            /// Sets value for AddSubscriptionsResponse.AlreadySubscribed property.
            /// </summary>
            /// <param name="value">A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. </param>
            public AddSubscriptionsResponseBuilder AlreadySubscribed(Dictionary<string, List<string>> value)
            {
                _AlreadySubscribed = value;
                return this;
            }

            /// <summary>
            /// Sets value for AddSubscriptionsResponse.Unauthorized property.
            /// </summary>
            /// <param name="value">A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if &#x60;authorization_errors_fatal&#x3D;false&#x60;. </param>
            public AddSubscriptionsResponseBuilder Unauthorized(List<string> value)
            {
                _Unauthorized = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AddSubscriptionsResponse.
            /// </summary>
            /// <returns>AddSubscriptionsResponse</returns>
            public AddSubscriptionsResponse Build()
            {
                Validate();
                return new AddSubscriptionsResponse(
                    Result: _Result,
                    Msg: _Msg,
                    Subscribed: _Subscribed,
                    AlreadySubscribed: _AlreadySubscribed,
                    Unauthorized: _Unauthorized
                );
            }

            private void Validate()
            { 
                if (_Result == null)
                {
                    throw new ArgumentException("Result is a required property for AddSubscriptionsResponse and cannot be null");
                } 
                if (_Msg == null)
                {
                    throw new ArgumentException("Msg is a required property for AddSubscriptionsResponse and cannot be null");
                } 
            }
        }

        
    }
}
