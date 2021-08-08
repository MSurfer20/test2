using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// NonExistingStreamErrorAllOf
    /// </summary>
    public sealed class NonExistingStreamErrorAllOf:  IEquatable<NonExistingStreamErrorAllOf>
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
        /// The name of the stream that could not be found. 
        /// </summary>
        public string Stream { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use NonExistingStreamErrorAllOf.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public NonExistingStreamErrorAllOf()
        {
        }

        private NonExistingStreamErrorAllOf(Object Result, Object Msg, Object Code, string Stream)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
            this.Code = Code;
            
            this.Stream = Stream;
            
        }

        /// <summary>
        /// Returns builder of NonExistingStreamErrorAllOf.
        /// </summary>
        /// <returns>NonExistingStreamErrorAllOfBuilder</returns>
        public static NonExistingStreamErrorAllOfBuilder Builder()
        {
            return new NonExistingStreamErrorAllOfBuilder();
        }

        /// <summary>
        /// Returns NonExistingStreamErrorAllOfBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>NonExistingStreamErrorAllOfBuilder</returns>
        public NonExistingStreamErrorAllOfBuilder With()
        {
            return Builder()
                .Result(Result)
                .Msg(Msg)
                .Code(Code)
                .Stream(Stream);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(NonExistingStreamErrorAllOf other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (NonExistingStreamErrorAllOf.
        /// </summary>
        /// <param name="left">Compared (NonExistingStreamErrorAllOf</param>
        /// <param name="right">Compared (NonExistingStreamErrorAllOf</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (NonExistingStreamErrorAllOf left, NonExistingStreamErrorAllOf right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (NonExistingStreamErrorAllOf.
        /// </summary>
        /// <param name="left">Compared (NonExistingStreamErrorAllOf</param>
        /// <param name="right">Compared (NonExistingStreamErrorAllOf</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (NonExistingStreamErrorAllOf left, NonExistingStreamErrorAllOf right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of NonExistingStreamErrorAllOf.
        /// </summary>
        public sealed class NonExistingStreamErrorAllOfBuilder
        {
            private Object _Result;
            private Object _Msg;
            private Object _Code;
            private string _Stream;

            internal NonExistingStreamErrorAllOfBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for NonExistingStreamErrorAllOf.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public NonExistingStreamErrorAllOfBuilder Result(Object value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for NonExistingStreamErrorAllOf.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public NonExistingStreamErrorAllOfBuilder Msg(Object value)
            {
                _Msg = value;
                return this;
            }

            /// <summary>
            /// Sets value for NonExistingStreamErrorAllOf.Code property.
            /// </summary>
            /// <param name="value">Code</param>
            public NonExistingStreamErrorAllOfBuilder Code(Object value)
            {
                _Code = value;
                return this;
            }

            /// <summary>
            /// Sets value for NonExistingStreamErrorAllOf.Stream property.
            /// </summary>
            /// <param name="value">The name of the stream that could not be found. </param>
            public NonExistingStreamErrorAllOfBuilder Stream(string value)
            {
                _Stream = value;
                return this;
            }


            /// <summary>
            /// Builds instance of NonExistingStreamErrorAllOf.
            /// </summary>
            /// <returns>NonExistingStreamErrorAllOf</returns>
            public NonExistingStreamErrorAllOf Build()
            {
                Validate();
                return new NonExistingStreamErrorAllOf(
                    Result: _Result,
                    Msg: _Msg,
                    Code: _Code,
                    Stream: _Stream
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
