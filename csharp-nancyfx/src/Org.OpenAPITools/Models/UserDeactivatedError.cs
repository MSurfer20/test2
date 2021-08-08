using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// UserDeactivatedError
    /// </summary>
    public sealed class UserDeactivatedError:  IEquatable<UserDeactivatedError>
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
        /// Use UserDeactivatedError.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public UserDeactivatedError()
        {
        }

        private UserDeactivatedError(Object Result, Object Msg, Object Code)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
            this.Code = Code;
            
        }

        /// <summary>
        /// Returns builder of UserDeactivatedError.
        /// </summary>
        /// <returns>UserDeactivatedErrorBuilder</returns>
        public static UserDeactivatedErrorBuilder Builder()
        {
            return new UserDeactivatedErrorBuilder();
        }

        /// <summary>
        /// Returns UserDeactivatedErrorBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>UserDeactivatedErrorBuilder</returns>
        public UserDeactivatedErrorBuilder With()
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

        public bool Equals(UserDeactivatedError other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (UserDeactivatedError.
        /// </summary>
        /// <param name="left">Compared (UserDeactivatedError</param>
        /// <param name="right">Compared (UserDeactivatedError</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (UserDeactivatedError left, UserDeactivatedError right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (UserDeactivatedError.
        /// </summary>
        /// <param name="left">Compared (UserDeactivatedError</param>
        /// <param name="right">Compared (UserDeactivatedError</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (UserDeactivatedError left, UserDeactivatedError right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of UserDeactivatedError.
        /// </summary>
        public sealed class UserDeactivatedErrorBuilder
        {
            private Object _Result;
            private Object _Msg;
            private Object _Code;

            internal UserDeactivatedErrorBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for UserDeactivatedError.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public UserDeactivatedErrorBuilder Result(Object value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserDeactivatedError.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public UserDeactivatedErrorBuilder Msg(Object value)
            {
                _Msg = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserDeactivatedError.Code property.
            /// </summary>
            /// <param name="value">Code</param>
            public UserDeactivatedErrorBuilder Code(Object value)
            {
                _Code = value;
                return this;
            }


            /// <summary>
            /// Builds instance of UserDeactivatedError.
            /// </summary>
            /// <returns>UserDeactivatedError</returns>
            public UserDeactivatedError Build()
            {
                Validate();
                return new UserDeactivatedError(
                    Result: _Result,
                    Msg: _Msg,
                    Code: _Code
                );
            }

            private void Validate()
            { 
                if (_Result == null)
                {
                    throw new ArgumentException("Result is a required property for UserDeactivatedError and cannot be null");
                } 
                if (_Msg == null)
                {
                    throw new ArgumentException("Msg is a required property for UserDeactivatedError and cannot be null");
                } 
            }
        }

        
    }
}
