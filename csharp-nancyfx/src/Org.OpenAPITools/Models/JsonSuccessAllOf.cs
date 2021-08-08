using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// JsonSuccessAllOf
    /// </summary>
    public sealed class JsonSuccessAllOf:  IEquatable<JsonSuccessAllOf>
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
        /// Use JsonSuccessAllOf.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public JsonSuccessAllOf()
        {
        }

        private JsonSuccessAllOf(Object Result, Object Msg)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
        }

        /// <summary>
        /// Returns builder of JsonSuccessAllOf.
        /// </summary>
        /// <returns>JsonSuccessAllOfBuilder</returns>
        public static JsonSuccessAllOfBuilder Builder()
        {
            return new JsonSuccessAllOfBuilder();
        }

        /// <summary>
        /// Returns JsonSuccessAllOfBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>JsonSuccessAllOfBuilder</returns>
        public JsonSuccessAllOfBuilder With()
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

        public bool Equals(JsonSuccessAllOf other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (JsonSuccessAllOf.
        /// </summary>
        /// <param name="left">Compared (JsonSuccessAllOf</param>
        /// <param name="right">Compared (JsonSuccessAllOf</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (JsonSuccessAllOf left, JsonSuccessAllOf right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (JsonSuccessAllOf.
        /// </summary>
        /// <param name="left">Compared (JsonSuccessAllOf</param>
        /// <param name="right">Compared (JsonSuccessAllOf</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (JsonSuccessAllOf left, JsonSuccessAllOf right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of JsonSuccessAllOf.
        /// </summary>
        public sealed class JsonSuccessAllOfBuilder
        {
            private Object _Result;
            private Object _Msg;

            internal JsonSuccessAllOfBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for JsonSuccessAllOf.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public JsonSuccessAllOfBuilder Result(Object value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for JsonSuccessAllOf.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public JsonSuccessAllOfBuilder Msg(Object value)
            {
                _Msg = value;
                return this;
            }


            /// <summary>
            /// Builds instance of JsonSuccessAllOf.
            /// </summary>
            /// <returns>JsonSuccessAllOf</returns>
            public JsonSuccessAllOf Build()
            {
                Validate();
                return new JsonSuccessAllOf(
                    Result: _Result,
                    Msg: _Msg
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
