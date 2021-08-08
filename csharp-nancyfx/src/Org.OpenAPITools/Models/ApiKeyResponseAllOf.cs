using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// ApiKeyResponseAllOf
    /// </summary>
    public sealed class ApiKeyResponseAllOf:  IEquatable<ApiKeyResponseAllOf>
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
        /// The API key that can be used to authenticate as the requested user. 
        /// </summary>
        public string ApiKey { get; private set; }

        /// <summary>
        /// The email address of the user who owns the API key 
        /// </summary>
        public string Email { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ApiKeyResponseAllOf.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ApiKeyResponseAllOf()
        {
        }

        private ApiKeyResponseAllOf(Object Result, Object Msg, string ApiKey, string Email)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
            this.ApiKey = ApiKey;
            
            this.Email = Email;
            
        }

        /// <summary>
        /// Returns builder of ApiKeyResponseAllOf.
        /// </summary>
        /// <returns>ApiKeyResponseAllOfBuilder</returns>
        public static ApiKeyResponseAllOfBuilder Builder()
        {
            return new ApiKeyResponseAllOfBuilder();
        }

        /// <summary>
        /// Returns ApiKeyResponseAllOfBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ApiKeyResponseAllOfBuilder</returns>
        public ApiKeyResponseAllOfBuilder With()
        {
            return Builder()
                .Result(Result)
                .Msg(Msg)
                .ApiKey(ApiKey)
                .Email(Email);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ApiKeyResponseAllOf other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ApiKeyResponseAllOf.
        /// </summary>
        /// <param name="left">Compared (ApiKeyResponseAllOf</param>
        /// <param name="right">Compared (ApiKeyResponseAllOf</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ApiKeyResponseAllOf left, ApiKeyResponseAllOf right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ApiKeyResponseAllOf.
        /// </summary>
        /// <param name="left">Compared (ApiKeyResponseAllOf</param>
        /// <param name="right">Compared (ApiKeyResponseAllOf</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ApiKeyResponseAllOf left, ApiKeyResponseAllOf right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ApiKeyResponseAllOf.
        /// </summary>
        public sealed class ApiKeyResponseAllOfBuilder
        {
            private Object _Result;
            private Object _Msg;
            private string _ApiKey;
            private string _Email;

            internal ApiKeyResponseAllOfBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ApiKeyResponseAllOf.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public ApiKeyResponseAllOfBuilder Result(Object value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for ApiKeyResponseAllOf.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public ApiKeyResponseAllOfBuilder Msg(Object value)
            {
                _Msg = value;
                return this;
            }

            /// <summary>
            /// Sets value for ApiKeyResponseAllOf.ApiKey property.
            /// </summary>
            /// <param name="value">The API key that can be used to authenticate as the requested user. </param>
            public ApiKeyResponseAllOfBuilder ApiKey(string value)
            {
                _ApiKey = value;
                return this;
            }

            /// <summary>
            /// Sets value for ApiKeyResponseAllOf.Email property.
            /// </summary>
            /// <param name="value">The email address of the user who owns the API key </param>
            public ApiKeyResponseAllOfBuilder Email(string value)
            {
                _Email = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ApiKeyResponseAllOf.
            /// </summary>
            /// <returns>ApiKeyResponseAllOf</returns>
            public ApiKeyResponseAllOf Build()
            {
                Validate();
                return new ApiKeyResponseAllOf(
                    Result: _Result,
                    Msg: _Msg,
                    ApiKey: _ApiKey,
                    Email: _Email
                );
            }

            private void Validate()
            { 
                if (_ApiKey == null)
                {
                    throw new ArgumentException("ApiKey is a required property for ApiKeyResponseAllOf and cannot be null");
                } 
                if (_Email == null)
                {
                    throw new ArgumentException("Email is a required property for ApiKeyResponseAllOf and cannot be null");
                } 
            }
        }

        
    }
}
