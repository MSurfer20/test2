using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// InvalidMessageError
    /// </summary>
    public sealed class InvalidMessageError:  IEquatable<InvalidMessageError>
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
        /// The raw content of the message. 
        /// </summary>
        public string RawContent { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InvalidMessageError.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InvalidMessageError()
        {
        }

        private InvalidMessageError(Object Result, Object Msg, string RawContent)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
            this.RawContent = RawContent;
            
        }

        /// <summary>
        /// Returns builder of InvalidMessageError.
        /// </summary>
        /// <returns>InvalidMessageErrorBuilder</returns>
        public static InvalidMessageErrorBuilder Builder()
        {
            return new InvalidMessageErrorBuilder();
        }

        /// <summary>
        /// Returns InvalidMessageErrorBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InvalidMessageErrorBuilder</returns>
        public InvalidMessageErrorBuilder With()
        {
            return Builder()
                .Result(Result)
                .Msg(Msg)
                .RawContent(RawContent);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InvalidMessageError other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InvalidMessageError.
        /// </summary>
        /// <param name="left">Compared (InvalidMessageError</param>
        /// <param name="right">Compared (InvalidMessageError</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InvalidMessageError left, InvalidMessageError right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InvalidMessageError.
        /// </summary>
        /// <param name="left">Compared (InvalidMessageError</param>
        /// <param name="right">Compared (InvalidMessageError</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InvalidMessageError left, InvalidMessageError right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InvalidMessageError.
        /// </summary>
        public sealed class InvalidMessageErrorBuilder
        {
            private Object _Result;
            private Object _Msg;
            private string _RawContent;

            internal InvalidMessageErrorBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InvalidMessageError.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public InvalidMessageErrorBuilder Result(Object value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for InvalidMessageError.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public InvalidMessageErrorBuilder Msg(Object value)
            {
                _Msg = value;
                return this;
            }

            /// <summary>
            /// Sets value for InvalidMessageError.RawContent property.
            /// </summary>
            /// <param name="value">The raw content of the message. </param>
            public InvalidMessageErrorBuilder RawContent(string value)
            {
                _RawContent = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InvalidMessageError.
            /// </summary>
            /// <returns>InvalidMessageError</returns>
            public InvalidMessageError Build()
            {
                Validate();
                return new InvalidMessageError(
                    Result: _Result,
                    Msg: _Msg,
                    RawContent: _RawContent
                );
            }

            private void Validate()
            { 
                if (_Result == null)
                {
                    throw new ArgumentException("Result is a required property for InvalidMessageError and cannot be null");
                } 
                if (_Msg == null)
                {
                    throw new ArgumentException("Msg is a required property for InvalidMessageError and cannot be null");
                } 
            }
        }

        
    }
}
