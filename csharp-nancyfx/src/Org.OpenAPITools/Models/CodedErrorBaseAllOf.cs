using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// CodedErrorBaseAllOf
    /// </summary>
    public sealed class CodedErrorBaseAllOf:  IEquatable<CodedErrorBaseAllOf>
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
        /// A string that identifies the error. 
        /// </summary>
        public string Code { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use CodedErrorBaseAllOf.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public CodedErrorBaseAllOf()
        {
        }

        private CodedErrorBaseAllOf(Object Result, Object Msg, string Code)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
            this.Code = Code;
            
        }

        /// <summary>
        /// Returns builder of CodedErrorBaseAllOf.
        /// </summary>
        /// <returns>CodedErrorBaseAllOfBuilder</returns>
        public static CodedErrorBaseAllOfBuilder Builder()
        {
            return new CodedErrorBaseAllOfBuilder();
        }

        /// <summary>
        /// Returns CodedErrorBaseAllOfBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>CodedErrorBaseAllOfBuilder</returns>
        public CodedErrorBaseAllOfBuilder With()
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

        public bool Equals(CodedErrorBaseAllOf other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (CodedErrorBaseAllOf.
        /// </summary>
        /// <param name="left">Compared (CodedErrorBaseAllOf</param>
        /// <param name="right">Compared (CodedErrorBaseAllOf</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (CodedErrorBaseAllOf left, CodedErrorBaseAllOf right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (CodedErrorBaseAllOf.
        /// </summary>
        /// <param name="left">Compared (CodedErrorBaseAllOf</param>
        /// <param name="right">Compared (CodedErrorBaseAllOf</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (CodedErrorBaseAllOf left, CodedErrorBaseAllOf right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of CodedErrorBaseAllOf.
        /// </summary>
        public sealed class CodedErrorBaseAllOfBuilder
        {
            private Object _Result;
            private Object _Msg;
            private string _Code;

            internal CodedErrorBaseAllOfBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for CodedErrorBaseAllOf.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public CodedErrorBaseAllOfBuilder Result(Object value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for CodedErrorBaseAllOf.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public CodedErrorBaseAllOfBuilder Msg(Object value)
            {
                _Msg = value;
                return this;
            }

            /// <summary>
            /// Sets value for CodedErrorBaseAllOf.Code property.
            /// </summary>
            /// <param name="value">A string that identifies the error. </param>
            public CodedErrorBaseAllOfBuilder Code(string value)
            {
                _Code = value;
                return this;
            }


            /// <summary>
            /// Builds instance of CodedErrorBaseAllOf.
            /// </summary>
            /// <returns>CodedErrorBaseAllOf</returns>
            public CodedErrorBaseAllOf Build()
            {
                Validate();
                return new CodedErrorBaseAllOf(
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
