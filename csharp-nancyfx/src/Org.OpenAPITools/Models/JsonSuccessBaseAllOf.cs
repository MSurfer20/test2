using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// JsonSuccessBaseAllOf
    /// </summary>
    public sealed class JsonSuccessBaseAllOf:  IEquatable<JsonSuccessBaseAllOf>
    { 
        /// <summary>
        /// Result
        /// </summary>
        public ResultEnum? Result { get; private set; }

        /// <summary>
        /// Msg
        /// </summary>
        public string Msg { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use JsonSuccessBaseAllOf.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public JsonSuccessBaseAllOf()
        {
        }

        private JsonSuccessBaseAllOf(ResultEnum? Result, string Msg)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
        }

        /// <summary>
        /// Returns builder of JsonSuccessBaseAllOf.
        /// </summary>
        /// <returns>JsonSuccessBaseAllOfBuilder</returns>
        public static JsonSuccessBaseAllOfBuilder Builder()
        {
            return new JsonSuccessBaseAllOfBuilder();
        }

        /// <summary>
        /// Returns JsonSuccessBaseAllOfBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>JsonSuccessBaseAllOfBuilder</returns>
        public JsonSuccessBaseAllOfBuilder With()
        {
            return Builder()
                .Result(Result)
                .Msg(Msg);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(JsonSuccessBaseAllOf other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (JsonSuccessBaseAllOf.
        /// </summary>
        /// <param name="left">Compared (JsonSuccessBaseAllOf</param>
        /// <param name="right">Compared (JsonSuccessBaseAllOf</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (JsonSuccessBaseAllOf left, JsonSuccessBaseAllOf right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (JsonSuccessBaseAllOf.
        /// </summary>
        /// <param name="left">Compared (JsonSuccessBaseAllOf</param>
        /// <param name="right">Compared (JsonSuccessBaseAllOf</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (JsonSuccessBaseAllOf left, JsonSuccessBaseAllOf right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of JsonSuccessBaseAllOf.
        /// </summary>
        public sealed class JsonSuccessBaseAllOfBuilder
        {
            private ResultEnum? _Result;
            private string _Msg;

            internal JsonSuccessBaseAllOfBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for JsonSuccessBaseAllOf.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public JsonSuccessBaseAllOfBuilder Result(ResultEnum? value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for JsonSuccessBaseAllOf.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public JsonSuccessBaseAllOfBuilder Msg(string value)
            {
                _Msg = value;
                return this;
            }


            /// <summary>
            /// Builds instance of JsonSuccessBaseAllOf.
            /// </summary>
            /// <returns>JsonSuccessBaseAllOf</returns>
            public JsonSuccessBaseAllOf Build()
            {
                Validate();
                return new JsonSuccessBaseAllOf(
                    Result: _Result,
                    Msg: _Msg
                );
            }

            private void Validate()
            { 
                if (_Result == null)
                {
                    throw new ArgumentException("Result is a required property for JsonSuccessBaseAllOf and cannot be null");
                } 
                if (_Msg == null)
                {
                    throw new ArgumentException("Msg is a required property for JsonSuccessBaseAllOf and cannot be null");
                } 
            }
        }

        
        public enum ResultEnum { Success };
    }
}
