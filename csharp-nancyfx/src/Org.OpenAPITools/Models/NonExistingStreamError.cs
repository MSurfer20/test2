using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// NonExistingStreamError
    /// </summary>
    public sealed class NonExistingStreamError:  IEquatable<NonExistingStreamError>
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
        /// Use NonExistingStreamError.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public NonExistingStreamError()
        {
        }

        private NonExistingStreamError(Object Result, Object Msg, Object Code, string Stream)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
            this.Code = Code;
            
            this.Stream = Stream;
            
        }

        /// <summary>
        /// Returns builder of NonExistingStreamError.
        /// </summary>
        /// <returns>NonExistingStreamErrorBuilder</returns>
        public static NonExistingStreamErrorBuilder Builder()
        {
            return new NonExistingStreamErrorBuilder();
        }

        /// <summary>
        /// Returns NonExistingStreamErrorBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>NonExistingStreamErrorBuilder</returns>
        public NonExistingStreamErrorBuilder With()
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

        public bool Equals(NonExistingStreamError other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (NonExistingStreamError.
        /// </summary>
        /// <param name="left">Compared (NonExistingStreamError</param>
        /// <param name="right">Compared (NonExistingStreamError</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (NonExistingStreamError left, NonExistingStreamError right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (NonExistingStreamError.
        /// </summary>
        /// <param name="left">Compared (NonExistingStreamError</param>
        /// <param name="right">Compared (NonExistingStreamError</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (NonExistingStreamError left, NonExistingStreamError right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of NonExistingStreamError.
        /// </summary>
        public sealed class NonExistingStreamErrorBuilder
        {
            private Object _Result;
            private Object _Msg;
            private Object _Code;
            private string _Stream;

            internal NonExistingStreamErrorBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for NonExistingStreamError.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public NonExistingStreamErrorBuilder Result(Object value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for NonExistingStreamError.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public NonExistingStreamErrorBuilder Msg(Object value)
            {
                _Msg = value;
                return this;
            }

            /// <summary>
            /// Sets value for NonExistingStreamError.Code property.
            /// </summary>
            /// <param name="value">Code</param>
            public NonExistingStreamErrorBuilder Code(Object value)
            {
                _Code = value;
                return this;
            }

            /// <summary>
            /// Sets value for NonExistingStreamError.Stream property.
            /// </summary>
            /// <param name="value">The name of the stream that could not be found. </param>
            public NonExistingStreamErrorBuilder Stream(string value)
            {
                _Stream = value;
                return this;
            }


            /// <summary>
            /// Builds instance of NonExistingStreamError.
            /// </summary>
            /// <returns>NonExistingStreamError</returns>
            public NonExistingStreamError Build()
            {
                Validate();
                return new NonExistingStreamError(
                    Result: _Result,
                    Msg: _Msg,
                    Code: _Code,
                    Stream: _Stream
                );
            }

            private void Validate()
            { 
                if (_Result == null)
                {
                    throw new ArgumentException("Result is a required property for NonExistingStreamError and cannot be null");
                } 
                if (_Msg == null)
                {
                    throw new ArgumentException("Msg is a required property for NonExistingStreamError and cannot be null");
                } 
            }
        }

        
    }
}
