using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// JsonErrorBaseAllOf
    /// </summary>
    public sealed class JsonErrorBaseAllOf:  IEquatable<JsonErrorBaseAllOf>
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
        /// Use JsonErrorBaseAllOf.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public JsonErrorBaseAllOf()
        {
        }

        private JsonErrorBaseAllOf(ResultEnum? Result, string Msg)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
        }

        /// <summary>
        /// Returns builder of JsonErrorBaseAllOf.
        /// </summary>
        /// <returns>JsonErrorBaseAllOfBuilder</returns>
        public static JsonErrorBaseAllOfBuilder Builder()
        {
            return new JsonErrorBaseAllOfBuilder();
        }

        /// <summary>
        /// Returns JsonErrorBaseAllOfBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>JsonErrorBaseAllOfBuilder</returns>
        public JsonErrorBaseAllOfBuilder With()
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

        public bool Equals(JsonErrorBaseAllOf other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (JsonErrorBaseAllOf.
        /// </summary>
        /// <param name="left">Compared (JsonErrorBaseAllOf</param>
        /// <param name="right">Compared (JsonErrorBaseAllOf</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (JsonErrorBaseAllOf left, JsonErrorBaseAllOf right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (JsonErrorBaseAllOf.
        /// </summary>
        /// <param name="left">Compared (JsonErrorBaseAllOf</param>
        /// <param name="right">Compared (JsonErrorBaseAllOf</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (JsonErrorBaseAllOf left, JsonErrorBaseAllOf right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of JsonErrorBaseAllOf.
        /// </summary>
        public sealed class JsonErrorBaseAllOfBuilder
        {
            private ResultEnum? _Result;
            private string _Msg;

            internal JsonErrorBaseAllOfBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for JsonErrorBaseAllOf.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public JsonErrorBaseAllOfBuilder Result(ResultEnum? value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for JsonErrorBaseAllOf.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public JsonErrorBaseAllOfBuilder Msg(string value)
            {
                _Msg = value;
                return this;
            }


            /// <summary>
            /// Builds instance of JsonErrorBaseAllOf.
            /// </summary>
            /// <returns>JsonErrorBaseAllOf</returns>
            public JsonErrorBaseAllOf Build()
            {
                Validate();
                return new JsonErrorBaseAllOf(
                    Result: _Result,
                    Msg: _Msg
                );
            }

            private void Validate()
            { 
                if (_Result == null)
                {
                    throw new ArgumentException("Result is a required property for JsonErrorBaseAllOf and cannot be null");
                } 
                if (_Msg == null)
                {
                    throw new ArgumentException("Msg is a required property for JsonErrorBaseAllOf and cannot be null");
                } 
            }
        }

        
        public enum ResultEnum { Error };
    }
}
