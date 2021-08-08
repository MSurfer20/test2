using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// MissingArgumentError
    /// </summary>
    public sealed class MissingArgumentError:  IEquatable<MissingArgumentError>
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
        /// It contains the information about the missing parameter. 
        /// </summary>
        public string VarName { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use MissingArgumentError.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public MissingArgumentError()
        {
        }

        private MissingArgumentError(Object Result, Object Msg, Object Code, string VarName)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
            this.Code = Code;
            
            this.VarName = VarName;
            
        }

        /// <summary>
        /// Returns builder of MissingArgumentError.
        /// </summary>
        /// <returns>MissingArgumentErrorBuilder</returns>
        public static MissingArgumentErrorBuilder Builder()
        {
            return new MissingArgumentErrorBuilder();
        }

        /// <summary>
        /// Returns MissingArgumentErrorBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>MissingArgumentErrorBuilder</returns>
        public MissingArgumentErrorBuilder With()
        {
            return Builder()
                .Result(Result)
                .Msg(Msg)
                .Code(Code)
                .VarName(VarName);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(MissingArgumentError other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (MissingArgumentError.
        /// </summary>
        /// <param name="left">Compared (MissingArgumentError</param>
        /// <param name="right">Compared (MissingArgumentError</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (MissingArgumentError left, MissingArgumentError right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (MissingArgumentError.
        /// </summary>
        /// <param name="left">Compared (MissingArgumentError</param>
        /// <param name="right">Compared (MissingArgumentError</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (MissingArgumentError left, MissingArgumentError right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of MissingArgumentError.
        /// </summary>
        public sealed class MissingArgumentErrorBuilder
        {
            private Object _Result;
            private Object _Msg;
            private Object _Code;
            private string _VarName;

            internal MissingArgumentErrorBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for MissingArgumentError.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public MissingArgumentErrorBuilder Result(Object value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for MissingArgumentError.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public MissingArgumentErrorBuilder Msg(Object value)
            {
                _Msg = value;
                return this;
            }

            /// <summary>
            /// Sets value for MissingArgumentError.Code property.
            /// </summary>
            /// <param name="value">Code</param>
            public MissingArgumentErrorBuilder Code(Object value)
            {
                _Code = value;
                return this;
            }

            /// <summary>
            /// Sets value for MissingArgumentError.VarName property.
            /// </summary>
            /// <param name="value">It contains the information about the missing parameter. </param>
            public MissingArgumentErrorBuilder VarName(string value)
            {
                _VarName = value;
                return this;
            }


            /// <summary>
            /// Builds instance of MissingArgumentError.
            /// </summary>
            /// <returns>MissingArgumentError</returns>
            public MissingArgumentError Build()
            {
                Validate();
                return new MissingArgumentError(
                    Result: _Result,
                    Msg: _Msg,
                    Code: _Code,
                    VarName: _VarName
                );
            }

            private void Validate()
            { 
                if (_Result == null)
                {
                    throw new ArgumentException("Result is a required property for MissingArgumentError and cannot be null");
                } 
                if (_Msg == null)
                {
                    throw new ArgumentException("Msg is a required property for MissingArgumentError and cannot be null");
                } 
            }
        }

        
    }
}
