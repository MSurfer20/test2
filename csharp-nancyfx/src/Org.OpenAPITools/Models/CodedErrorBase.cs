using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// CodedErrorBase
    /// </summary>
    public sealed class CodedErrorBase:  IEquatable<CodedErrorBase>
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
        /// Use CodedErrorBase.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public CodedErrorBase()
        {
        }

        private CodedErrorBase(Object Result, Object Msg, string Code)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
            this.Code = Code;
            
        }

        /// <summary>
        /// Returns builder of CodedErrorBase.
        /// </summary>
        /// <returns>CodedErrorBaseBuilder</returns>
        public static CodedErrorBaseBuilder Builder()
        {
            return new CodedErrorBaseBuilder();
        }

        /// <summary>
        /// Returns CodedErrorBaseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>CodedErrorBaseBuilder</returns>
        public CodedErrorBaseBuilder With()
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

        public bool Equals(CodedErrorBase other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (CodedErrorBase.
        /// </summary>
        /// <param name="left">Compared (CodedErrorBase</param>
        /// <param name="right">Compared (CodedErrorBase</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (CodedErrorBase left, CodedErrorBase right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (CodedErrorBase.
        /// </summary>
        /// <param name="left">Compared (CodedErrorBase</param>
        /// <param name="right">Compared (CodedErrorBase</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (CodedErrorBase left, CodedErrorBase right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of CodedErrorBase.
        /// </summary>
        public sealed class CodedErrorBaseBuilder
        {
            private Object _Result;
            private Object _Msg;
            private string _Code;

            internal CodedErrorBaseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for CodedErrorBase.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public CodedErrorBaseBuilder Result(Object value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for CodedErrorBase.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public CodedErrorBaseBuilder Msg(Object value)
            {
                _Msg = value;
                return this;
            }

            /// <summary>
            /// Sets value for CodedErrorBase.Code property.
            /// </summary>
            /// <param name="value">A string that identifies the error. </param>
            public CodedErrorBaseBuilder Code(string value)
            {
                _Code = value;
                return this;
            }


            /// <summary>
            /// Builds instance of CodedErrorBase.
            /// </summary>
            /// <returns>CodedErrorBase</returns>
            public CodedErrorBase Build()
            {
                Validate();
                return new CodedErrorBase(
                    Result: _Result,
                    Msg: _Msg,
                    Code: _Code
                );
            }

            private void Validate()
            { 
                if (_Result == null)
                {
                    throw new ArgumentException("Result is a required property for CodedErrorBase and cannot be null");
                } 
                if (_Msg == null)
                {
                    throw new ArgumentException("Msg is a required property for CodedErrorBase and cannot be null");
                } 
            }
        }

        
    }
}
