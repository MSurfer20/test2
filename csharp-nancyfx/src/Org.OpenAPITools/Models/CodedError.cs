using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// CodedError
    /// </summary>
    public sealed class CodedError:  IEquatable<CodedError>
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
        /// Use CodedError.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public CodedError()
        {
        }

        private CodedError(Object Result, Object Msg, Object Code)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
            this.Code = Code;
            
        }

        /// <summary>
        /// Returns builder of CodedError.
        /// </summary>
        /// <returns>CodedErrorBuilder</returns>
        public static CodedErrorBuilder Builder()
        {
            return new CodedErrorBuilder();
        }

        /// <summary>
        /// Returns CodedErrorBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>CodedErrorBuilder</returns>
        public CodedErrorBuilder With()
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

        public bool Equals(CodedError other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (CodedError.
        /// </summary>
        /// <param name="left">Compared (CodedError</param>
        /// <param name="right">Compared (CodedError</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (CodedError left, CodedError right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (CodedError.
        /// </summary>
        /// <param name="left">Compared (CodedError</param>
        /// <param name="right">Compared (CodedError</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (CodedError left, CodedError right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of CodedError.
        /// </summary>
        public sealed class CodedErrorBuilder
        {
            private Object _Result;
            private Object _Msg;
            private Object _Code;

            internal CodedErrorBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for CodedError.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public CodedErrorBuilder Result(Object value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for CodedError.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public CodedErrorBuilder Msg(Object value)
            {
                _Msg = value;
                return this;
            }

            /// <summary>
            /// Sets value for CodedError.Code property.
            /// </summary>
            /// <param name="value">Code</param>
            public CodedErrorBuilder Code(Object value)
            {
                _Code = value;
                return this;
            }


            /// <summary>
            /// Builds instance of CodedError.
            /// </summary>
            /// <returns>CodedError</returns>
            public CodedError Build()
            {
                Validate();
                return new CodedError(
                    Result: _Result,
                    Msg: _Msg,
                    Code: _Code
                );
            }

            private void Validate()
            { 
                if (_Result == null)
                {
                    throw new ArgumentException("Result is a required property for CodedError and cannot be null");
                } 
                if (_Msg == null)
                {
                    throw new ArgumentException("Msg is a required property for CodedError and cannot be null");
                } 
            }
        }

        
    }
}
