using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
    /// </summary>
    public sealed class MissingArgumentErrorAllOf:  IEquatable<MissingArgumentErrorAllOf>
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
        /// Use MissingArgumentErrorAllOf.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public MissingArgumentErrorAllOf()
        {
        }

        private MissingArgumentErrorAllOf(Object Result, Object Msg, Object Code, string VarName)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
            this.Code = Code;
            
            this.VarName = VarName;
            
        }

        /// <summary>
        /// Returns builder of MissingArgumentErrorAllOf.
        /// </summary>
        /// <returns>MissingArgumentErrorAllOfBuilder</returns>
        public static MissingArgumentErrorAllOfBuilder Builder()
        {
            return new MissingArgumentErrorAllOfBuilder();
        }

        /// <summary>
        /// Returns MissingArgumentErrorAllOfBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>MissingArgumentErrorAllOfBuilder</returns>
        public MissingArgumentErrorAllOfBuilder With()
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

        public bool Equals(MissingArgumentErrorAllOf other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (MissingArgumentErrorAllOf.
        /// </summary>
        /// <param name="left">Compared (MissingArgumentErrorAllOf</param>
        /// <param name="right">Compared (MissingArgumentErrorAllOf</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (MissingArgumentErrorAllOf left, MissingArgumentErrorAllOf right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (MissingArgumentErrorAllOf.
        /// </summary>
        /// <param name="left">Compared (MissingArgumentErrorAllOf</param>
        /// <param name="right">Compared (MissingArgumentErrorAllOf</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (MissingArgumentErrorAllOf left, MissingArgumentErrorAllOf right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of MissingArgumentErrorAllOf.
        /// </summary>
        public sealed class MissingArgumentErrorAllOfBuilder
        {
            private Object _Result;
            private Object _Msg;
            private Object _Code;
            private string _VarName;

            internal MissingArgumentErrorAllOfBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for MissingArgumentErrorAllOf.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public MissingArgumentErrorAllOfBuilder Result(Object value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for MissingArgumentErrorAllOf.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public MissingArgumentErrorAllOfBuilder Msg(Object value)
            {
                _Msg = value;
                return this;
            }

            /// <summary>
            /// Sets value for MissingArgumentErrorAllOf.Code property.
            /// </summary>
            /// <param name="value">Code</param>
            public MissingArgumentErrorAllOfBuilder Code(Object value)
            {
                _Code = value;
                return this;
            }

            /// <summary>
            /// Sets value for MissingArgumentErrorAllOf.VarName property.
            /// </summary>
            /// <param name="value">It contains the information about the missing parameter. </param>
            public MissingArgumentErrorAllOfBuilder VarName(string value)
            {
                _VarName = value;
                return this;
            }


            /// <summary>
            /// Builds instance of MissingArgumentErrorAllOf.
            /// </summary>
            /// <returns>MissingArgumentErrorAllOf</returns>
            public MissingArgumentErrorAllOf Build()
            {
                Validate();
                return new MissingArgumentErrorAllOf(
                    Result: _Result,
                    Msg: _Msg,
                    Code: _Code,
                    VarName: _VarName
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
