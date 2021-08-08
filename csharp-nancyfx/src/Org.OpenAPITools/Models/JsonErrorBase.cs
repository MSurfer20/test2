using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// JsonErrorBase
    /// </summary>
    public sealed class JsonErrorBase:  IEquatable<JsonErrorBase>
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
        /// Use JsonErrorBase.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public JsonErrorBase()
        {
        }

        private JsonErrorBase(ResultEnum? Result, string Msg)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
        }

        /// <summary>
        /// Returns builder of JsonErrorBase.
        /// </summary>
        /// <returns>JsonErrorBaseBuilder</returns>
        public static JsonErrorBaseBuilder Builder()
        {
            return new JsonErrorBaseBuilder();
        }

        /// <summary>
        /// Returns JsonErrorBaseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>JsonErrorBaseBuilder</returns>
        public JsonErrorBaseBuilder With()
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

        public bool Equals(JsonErrorBase other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (JsonErrorBase.
        /// </summary>
        /// <param name="left">Compared (JsonErrorBase</param>
        /// <param name="right">Compared (JsonErrorBase</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (JsonErrorBase left, JsonErrorBase right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (JsonErrorBase.
        /// </summary>
        /// <param name="left">Compared (JsonErrorBase</param>
        /// <param name="right">Compared (JsonErrorBase</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (JsonErrorBase left, JsonErrorBase right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of JsonErrorBase.
        /// </summary>
        public sealed class JsonErrorBaseBuilder
        {
            private ResultEnum? _Result;
            private string _Msg;

            internal JsonErrorBaseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for JsonErrorBase.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public JsonErrorBaseBuilder Result(ResultEnum? value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for JsonErrorBase.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public JsonErrorBaseBuilder Msg(string value)
            {
                _Msg = value;
                return this;
            }


            /// <summary>
            /// Builds instance of JsonErrorBase.
            /// </summary>
            /// <returns>JsonErrorBase</returns>
            public JsonErrorBase Build()
            {
                Validate();
                return new JsonErrorBase(
                    Result: _Result,
                    Msg: _Msg
                );
            }

            private void Validate()
            { 
                if (_Result == null)
                {
                    throw new ArgumentException("Result is a required property for JsonErrorBase and cannot be null");
                } 
                if (_Msg == null)
                {
                    throw new ArgumentException("Msg is a required property for JsonErrorBase and cannot be null");
                } 
            }
        }

        
        public enum ResultEnum { Error };
    }
}
