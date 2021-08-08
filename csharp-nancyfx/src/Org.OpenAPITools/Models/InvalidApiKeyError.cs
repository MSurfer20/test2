using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// InvalidApiKeyError
    /// </summary>
    public sealed class InvalidApiKeyError:  IEquatable<InvalidApiKeyError>
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
        /// Empty constructor required by some serializers.
        /// Use InvalidApiKeyError.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InvalidApiKeyError()
        {
        }

        private InvalidApiKeyError(Object Result, Object Msg)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
        }

        /// <summary>
        /// Returns builder of InvalidApiKeyError.
        /// </summary>
        /// <returns>InvalidApiKeyErrorBuilder</returns>
        public static InvalidApiKeyErrorBuilder Builder()
        {
            return new InvalidApiKeyErrorBuilder();
        }

        /// <summary>
        /// Returns InvalidApiKeyErrorBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InvalidApiKeyErrorBuilder</returns>
        public InvalidApiKeyErrorBuilder With()
        {
            return Builder()
                .Result(Result)
                .Msg(Msg);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InvalidApiKeyError other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InvalidApiKeyError.
        /// </summary>
        /// <param name="left">Compared (InvalidApiKeyError</param>
        /// <param name="right">Compared (InvalidApiKeyError</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InvalidApiKeyError left, InvalidApiKeyError right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InvalidApiKeyError.
        /// </summary>
        /// <param name="left">Compared (InvalidApiKeyError</param>
        /// <param name="right">Compared (InvalidApiKeyError</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InvalidApiKeyError left, InvalidApiKeyError right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InvalidApiKeyError.
        /// </summary>
        public sealed class InvalidApiKeyErrorBuilder
        {
            private Object _Result;
            private Object _Msg;

            internal InvalidApiKeyErrorBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InvalidApiKeyError.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public InvalidApiKeyErrorBuilder Result(Object value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for InvalidApiKeyError.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public InvalidApiKeyErrorBuilder Msg(Object value)
            {
                _Msg = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InvalidApiKeyError.
            /// </summary>
            /// <returns>InvalidApiKeyError</returns>
            public InvalidApiKeyError Build()
            {
                Validate();
                return new InvalidApiKeyError(
                    Result: _Result,
                    Msg: _Msg
                );
            }

            private void Validate()
            { 
                if (_Result == null)
                {
                    throw new ArgumentException("Result is a required property for InvalidApiKeyError and cannot be null");
                } 
                if (_Msg == null)
                {
                    throw new ArgumentException("Msg is a required property for InvalidApiKeyError and cannot be null");
                } 
            }
        }

        
    }
}
