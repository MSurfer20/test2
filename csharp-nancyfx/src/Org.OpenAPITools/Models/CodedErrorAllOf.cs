using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// CodedErrorAllOf
    /// </summary>
    public sealed class CodedErrorAllOf:  IEquatable<CodedErrorAllOf>
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
        /// Use CodedErrorAllOf.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public CodedErrorAllOf()
        {
        }

        private CodedErrorAllOf(Object Result, Object Msg, Object Code)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
            this.Code = Code;
            
        }

        /// <summary>
        /// Returns builder of CodedErrorAllOf.
        /// </summary>
        /// <returns>CodedErrorAllOfBuilder</returns>
        public static CodedErrorAllOfBuilder Builder()
        {
            return new CodedErrorAllOfBuilder();
        }

        /// <summary>
        /// Returns CodedErrorAllOfBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>CodedErrorAllOfBuilder</returns>
        public CodedErrorAllOfBuilder With()
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

        public bool Equals(CodedErrorAllOf other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (CodedErrorAllOf.
        /// </summary>
        /// <param name="left">Compared (CodedErrorAllOf</param>
        /// <param name="right">Compared (CodedErrorAllOf</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (CodedErrorAllOf left, CodedErrorAllOf right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (CodedErrorAllOf.
        /// </summary>
        /// <param name="left">Compared (CodedErrorAllOf</param>
        /// <param name="right">Compared (CodedErrorAllOf</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (CodedErrorAllOf left, CodedErrorAllOf right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of CodedErrorAllOf.
        /// </summary>
        public sealed class CodedErrorAllOfBuilder
        {
            private Object _Result;
            private Object _Msg;
            private Object _Code;

            internal CodedErrorAllOfBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for CodedErrorAllOf.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public CodedErrorAllOfBuilder Result(Object value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for CodedErrorAllOf.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public CodedErrorAllOfBuilder Msg(Object value)
            {
                _Msg = value;
                return this;
            }

            /// <summary>
            /// Sets value for CodedErrorAllOf.Code property.
            /// </summary>
            /// <param name="value">Code</param>
            public CodedErrorAllOfBuilder Code(Object value)
            {
                _Code = value;
                return this;
            }


            /// <summary>
            /// Builds instance of CodedErrorAllOf.
            /// </summary>
            /// <returns>CodedErrorAllOf</returns>
            public CodedErrorAllOf Build()
            {
                Validate();
                return new CodedErrorAllOf(
                    Result: _Result,
                    Msg: _Msg,
                    Code: _Code
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
