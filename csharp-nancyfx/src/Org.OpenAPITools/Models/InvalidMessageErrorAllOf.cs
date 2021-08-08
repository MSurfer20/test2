using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// InvalidMessageErrorAllOf
    /// </summary>
    public sealed class InvalidMessageErrorAllOf:  IEquatable<InvalidMessageErrorAllOf>
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
        /// Use InvalidMessageErrorAllOf.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InvalidMessageErrorAllOf()
        {
        }

        private InvalidMessageErrorAllOf(Object Result, Object Msg, string RawContent)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
            this.RawContent = RawContent;
            
        }

        /// <summary>
        /// Returns builder of InvalidMessageErrorAllOf.
        /// </summary>
        /// <returns>InvalidMessageErrorAllOfBuilder</returns>
        public static InvalidMessageErrorAllOfBuilder Builder()
        {
            return new InvalidMessageErrorAllOfBuilder();
        }

        /// <summary>
        /// Returns InvalidMessageErrorAllOfBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InvalidMessageErrorAllOfBuilder</returns>
        public InvalidMessageErrorAllOfBuilder With()
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

        public bool Equals(InvalidMessageErrorAllOf other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InvalidMessageErrorAllOf.
        /// </summary>
        /// <param name="left">Compared (InvalidMessageErrorAllOf</param>
        /// <param name="right">Compared (InvalidMessageErrorAllOf</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InvalidMessageErrorAllOf left, InvalidMessageErrorAllOf right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InvalidMessageErrorAllOf.
        /// </summary>
        /// <param name="left">Compared (InvalidMessageErrorAllOf</param>
        /// <param name="right">Compared (InvalidMessageErrorAllOf</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InvalidMessageErrorAllOf left, InvalidMessageErrorAllOf right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InvalidMessageErrorAllOf.
        /// </summary>
        public sealed class InvalidMessageErrorAllOfBuilder
        {
            private Object _Result;
            private Object _Msg;
            private string _RawContent;

            internal InvalidMessageErrorAllOfBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InvalidMessageErrorAllOf.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public InvalidMessageErrorAllOfBuilder Result(Object value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for InvalidMessageErrorAllOf.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public InvalidMessageErrorAllOfBuilder Msg(Object value)
            {
                _Msg = value;
                return this;
            }

            /// <summary>
            /// Sets value for InvalidMessageErrorAllOf.RawContent property.
            /// </summary>
            /// <param name="value">The raw content of the message. </param>
            public InvalidMessageErrorAllOfBuilder RawContent(string value)
            {
                _RawContent = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InvalidMessageErrorAllOf.
            /// </summary>
            /// <returns>InvalidMessageErrorAllOf</returns>
            public InvalidMessageErrorAllOf Build()
            {
                Validate();
                return new InvalidMessageErrorAllOf(
                    Result: _Result,
                    Msg: _Msg,
                    RawContent: _RawContent
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
