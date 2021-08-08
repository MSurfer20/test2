using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// UserNotAuthorizedError
    /// </summary>
    public sealed class UserNotAuthorizedError:  IEquatable<UserNotAuthorizedError>
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
        /// Use UserNotAuthorizedError.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public UserNotAuthorizedError()
        {
        }

        private UserNotAuthorizedError(Object Result, Object Msg, Object Code)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
            this.Code = Code;
            
        }

        /// <summary>
        /// Returns builder of UserNotAuthorizedError.
        /// </summary>
        /// <returns>UserNotAuthorizedErrorBuilder</returns>
        public static UserNotAuthorizedErrorBuilder Builder()
        {
            return new UserNotAuthorizedErrorBuilder();
        }

        /// <summary>
        /// Returns UserNotAuthorizedErrorBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>UserNotAuthorizedErrorBuilder</returns>
        public UserNotAuthorizedErrorBuilder With()
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

        public bool Equals(UserNotAuthorizedError other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (UserNotAuthorizedError.
        /// </summary>
        /// <param name="left">Compared (UserNotAuthorizedError</param>
        /// <param name="right">Compared (UserNotAuthorizedError</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (UserNotAuthorizedError left, UserNotAuthorizedError right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (UserNotAuthorizedError.
        /// </summary>
        /// <param name="left">Compared (UserNotAuthorizedError</param>
        /// <param name="right">Compared (UserNotAuthorizedError</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (UserNotAuthorizedError left, UserNotAuthorizedError right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of UserNotAuthorizedError.
        /// </summary>
        public sealed class UserNotAuthorizedErrorBuilder
        {
            private Object _Result;
            private Object _Msg;
            private Object _Code;

            internal UserNotAuthorizedErrorBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for UserNotAuthorizedError.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public UserNotAuthorizedErrorBuilder Result(Object value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserNotAuthorizedError.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public UserNotAuthorizedErrorBuilder Msg(Object value)
            {
                _Msg = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserNotAuthorizedError.Code property.
            /// </summary>
            /// <param name="value">Code</param>
            public UserNotAuthorizedErrorBuilder Code(Object value)
            {
                _Code = value;
                return this;
            }


            /// <summary>
            /// Builds instance of UserNotAuthorizedError.
            /// </summary>
            /// <returns>UserNotAuthorizedError</returns>
            public UserNotAuthorizedError Build()
            {
                Validate();
                return new UserNotAuthorizedError(
                    Result: _Result,
                    Msg: _Msg,
                    Code: _Code
                );
            }

            private void Validate()
            { 
                if (_Result == null)
                {
                    throw new ArgumentException("Result is a required property for UserNotAuthorizedError and cannot be null");
                } 
                if (_Msg == null)
                {
                    throw new ArgumentException("Msg is a required property for UserNotAuthorizedError and cannot be null");
                } 
            }
        }

        
    }
}
