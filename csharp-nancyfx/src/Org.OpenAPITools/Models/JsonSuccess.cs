using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// JsonSuccess
    /// </summary>
    public sealed class JsonSuccess:  IEquatable<JsonSuccess>
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
        /// Empty constructor required by some serializers.
        /// Use JsonSuccess.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public JsonSuccess()
        {
        }

        private JsonSuccess(Object Result, Object Msg)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
        }

        /// <summary>
        /// Returns builder of JsonSuccess.
        /// </summary>
        /// <returns>JsonSuccessBuilder</returns>
        public static JsonSuccessBuilder Builder()
        {
            return new JsonSuccessBuilder();
        }

        /// <summary>
        /// Returns JsonSuccessBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>JsonSuccessBuilder</returns>
        public JsonSuccessBuilder With()
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

        public bool Equals(JsonSuccess other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (JsonSuccess.
        /// </summary>
        /// <param name="left">Compared (JsonSuccess</param>
        /// <param name="right">Compared (JsonSuccess</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (JsonSuccess left, JsonSuccess right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (JsonSuccess.
        /// </summary>
        /// <param name="left">Compared (JsonSuccess</param>
        /// <param name="right">Compared (JsonSuccess</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (JsonSuccess left, JsonSuccess right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of JsonSuccess.
        /// </summary>
        public sealed class JsonSuccessBuilder
        {
            private Object _Result;
            private Object _Msg;

            internal JsonSuccessBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for JsonSuccess.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public JsonSuccessBuilder Result(Object value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for JsonSuccess.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public JsonSuccessBuilder Msg(Object value)
            {
                _Msg = value;
                return this;
            }


            /// <summary>
            /// Builds instance of JsonSuccess.
            /// </summary>
            /// <returns>JsonSuccess</returns>
            public JsonSuccess Build()
            {
                Validate();
                return new JsonSuccess(
                    Result: _Result,
                    Msg: _Msg
                );
            }

            private void Validate()
            { 
                if (_Result == null)
                {
                    throw new ArgumentException("Result is a required property for JsonSuccess and cannot be null");
                } 
                if (_Msg == null)
                {
                    throw new ArgumentException("Msg is a required property for JsonSuccess and cannot be null");
                } 
            }
        }

        
    }
}
