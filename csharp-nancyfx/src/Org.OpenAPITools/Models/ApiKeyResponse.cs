using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// ApiKeyResponse
    /// </summary>
    public sealed class ApiKeyResponse:  IEquatable<ApiKeyResponse>
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
        /// Use ApiKeyResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ApiKeyResponse()
        {
        }

        private ApiKeyResponse(Object Result, Object Msg, string ApiKey, string Email)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
            this.ApiKey = ApiKey;
            
            this.Email = Email;
            
        }

        /// <summary>
        /// Returns builder of ApiKeyResponse.
        /// </summary>
        /// <returns>ApiKeyResponseBuilder</returns>
        public static ApiKeyResponseBuilder Builder()
        {
            return new ApiKeyResponseBuilder();
        }

        /// <summary>
        /// Returns ApiKeyResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ApiKeyResponseBuilder</returns>
        public ApiKeyResponseBuilder With()
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

        public bool Equals(ApiKeyResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ApiKeyResponse.
        /// </summary>
        /// <param name="left">Compared (ApiKeyResponse</param>
        /// <param name="right">Compared (ApiKeyResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ApiKeyResponse left, ApiKeyResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ApiKeyResponse.
        /// </summary>
        /// <param name="left">Compared (ApiKeyResponse</param>
        /// <param name="right">Compared (ApiKeyResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ApiKeyResponse left, ApiKeyResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ApiKeyResponse.
        /// </summary>
        public sealed class ApiKeyResponseBuilder
        {
            private Object _Result;
            private Object _Msg;
            private string _ApiKey;
            private string _Email;

            internal ApiKeyResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ApiKeyResponse.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public ApiKeyResponseBuilder Result(Object value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for ApiKeyResponse.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public ApiKeyResponseBuilder Msg(Object value)
            {
                _Msg = value;
                return this;
            }

            /// <summary>
            /// Sets value for ApiKeyResponse.ApiKey property.
            /// </summary>
            /// <param name="value">The API key that can be used to authenticate as the requested user. </param>
            public ApiKeyResponseBuilder ApiKey(string value)
            {
                _ApiKey = value;
                return this;
            }

            /// <summary>
            /// Sets value for ApiKeyResponse.Email property.
            /// </summary>
            /// <param name="value">The email address of the user who owns the API key </param>
            public ApiKeyResponseBuilder Email(string value)
            {
                _Email = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ApiKeyResponse.
            /// </summary>
            /// <returns>ApiKeyResponse</returns>
            public ApiKeyResponse Build()
            {
                Validate();
                return new ApiKeyResponse(
                    Result: _Result,
                    Msg: _Msg,
                    ApiKey: _ApiKey,
                    Email: _Email
                );
            }

            private void Validate()
            { 
                if (_Result == null)
                {
                    throw new ArgumentException("Result is a required property for ApiKeyResponse and cannot be null");
                } 
                if (_Msg == null)
                {
                    throw new ArgumentException("Msg is a required property for ApiKeyResponse and cannot be null");
                } 
                if (_ApiKey == null)
                {
                    throw new ArgumentException("ApiKey is a required property for ApiKeyResponse and cannot be null");
                } 
                if (_Email == null)
                {
                    throw new ArgumentException("Email is a required property for ApiKeyResponse and cannot be null");
                } 
            }
        }

        
    }
}
