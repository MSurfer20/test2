using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// RateLimitedError
    /// </summary>
    public sealed class RateLimitedError:  IEquatable<RateLimitedError>
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
        /// Code
        /// </summary>
        public Object Code { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use RateLimitedError.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public RateLimitedError()
        {
        }

        private RateLimitedError(Object Result, Object Msg, Object Code)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
            this.Code = Code;
            
        }

        /// <summary>
        /// Returns builder of RateLimitedError.
        /// </summary>
        /// <returns>RateLimitedErrorBuilder</returns>
        public static RateLimitedErrorBuilder Builder()
        {
            return new RateLimitedErrorBuilder();
        }

        /// <summary>
        /// Returns RateLimitedErrorBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>RateLimitedErrorBuilder</returns>
        public RateLimitedErrorBuilder With()
        {
            return Builder()
                .Result(Result)
                .Msg(Msg)
                .Code(Code);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(RateLimitedError other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (RateLimitedError.
        /// </summary>
        /// <param name="left">Compared (RateLimitedError</param>
        /// <param name="right">Compared (RateLimitedError</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (RateLimitedError left, RateLimitedError right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (RateLimitedError.
        /// </summary>
        /// <param name="left">Compared (RateLimitedError</param>
        /// <param name="right">Compared (RateLimitedError</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (RateLimitedError left, RateLimitedError right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of RateLimitedError.
        /// </summary>
        public sealed class RateLimitedErrorBuilder
        {
            private Object _Result;
            private Object _Msg;
            private Object _Code;

            internal RateLimitedErrorBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for RateLimitedError.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public RateLimitedErrorBuilder Result(Object value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for RateLimitedError.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public RateLimitedErrorBuilder Msg(Object value)
            {
                _Msg = value;
                return this;
            }

            /// <summary>
            /// Sets value for RateLimitedError.Code property.
            /// </summary>
            /// <param name="value">Code</param>
            public RateLimitedErrorBuilder Code(Object value)
            {
                _Code = value;
                return this;
            }


            /// <summary>
            /// Builds instance of RateLimitedError.
            /// </summary>
            /// <returns>RateLimitedError</returns>
            public RateLimitedError Build()
            {
                Validate();
                return new RateLimitedError(
                    Result: _Result,
                    Msg: _Msg,
                    Code: _Code
                );
            }

            private void Validate()
            { 
                if (_Result == null)
                {
                    throw new ArgumentException("Result is a required property for RateLimitedError and cannot be null");
                } 
                if (_Msg == null)
                {
                    throw new ArgumentException("Msg is a required property for RateLimitedError and cannot be null");
                } 
            }
        }

        
    }
}
