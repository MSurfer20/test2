using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// JsonSuccessBase
    /// </summary>
    public sealed class JsonSuccessBase:  IEquatable<JsonSuccessBase>
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
        /// Use JsonSuccessBase.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public JsonSuccessBase()
        {
        }

        private JsonSuccessBase(ResultEnum? Result, string Msg)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
        }

        /// <summary>
        /// Returns builder of JsonSuccessBase.
        /// </summary>
        /// <returns>JsonSuccessBaseBuilder</returns>
        public static JsonSuccessBaseBuilder Builder()
        {
            return new JsonSuccessBaseBuilder();
        }

        /// <summary>
        /// Returns JsonSuccessBaseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>JsonSuccessBaseBuilder</returns>
        public JsonSuccessBaseBuilder With()
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

        public bool Equals(JsonSuccessBase other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (JsonSuccessBase.
        /// </summary>
        /// <param name="left">Compared (JsonSuccessBase</param>
        /// <param name="right">Compared (JsonSuccessBase</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (JsonSuccessBase left, JsonSuccessBase right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (JsonSuccessBase.
        /// </summary>
        /// <param name="left">Compared (JsonSuccessBase</param>
        /// <param name="right">Compared (JsonSuccessBase</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (JsonSuccessBase left, JsonSuccessBase right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of JsonSuccessBase.
        /// </summary>
        public sealed class JsonSuccessBaseBuilder
        {
            private ResultEnum? _Result;
            private string _Msg;

            internal JsonSuccessBaseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for JsonSuccessBase.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public JsonSuccessBaseBuilder Result(ResultEnum? value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for JsonSuccessBase.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public JsonSuccessBaseBuilder Msg(string value)
            {
                _Msg = value;
                return this;
            }


            /// <summary>
            /// Builds instance of JsonSuccessBase.
            /// </summary>
            /// <returns>JsonSuccessBase</returns>
            public JsonSuccessBase Build()
            {
                Validate();
                return new JsonSuccessBase(
                    Result: _Result,
                    Msg: _Msg
                );
            }

            private void Validate()
            { 
                if (_Result == null)
                {
                    throw new ArgumentException("Result is a required property for JsonSuccessBase and cannot be null");
                } 
                if (_Msg == null)
                {
                    throw new ArgumentException("Msg is a required property for JsonSuccessBase and cannot be null");
                } 
            }
        }

        
        public enum ResultEnum { Success };
    }
}
