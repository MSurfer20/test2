using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// JsonError
    /// </summary>
    public sealed class JsonError:  IEquatable<JsonError>
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
        /// Use JsonError.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public JsonError()
        {
        }

        private JsonError(Object Result, Object Msg)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
        }

        /// <summary>
        /// Returns builder of JsonError.
        /// </summary>
        /// <returns>JsonErrorBuilder</returns>
        public static JsonErrorBuilder Builder()
        {
            return new JsonErrorBuilder();
        }

        /// <summary>
        /// Returns JsonErrorBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>JsonErrorBuilder</returns>
        public JsonErrorBuilder With()
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

        public bool Equals(JsonError other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (JsonError.
        /// </summary>
        /// <param name="left">Compared (JsonError</param>
        /// <param name="right">Compared (JsonError</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (JsonError left, JsonError right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (JsonError.
        /// </summary>
        /// <param name="left">Compared (JsonError</param>
        /// <param name="right">Compared (JsonError</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (JsonError left, JsonError right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of JsonError.
        /// </summary>
        public sealed class JsonErrorBuilder
        {
            private Object _Result;
            private Object _Msg;

            internal JsonErrorBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for JsonError.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public JsonErrorBuilder Result(Object value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for JsonError.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public JsonErrorBuilder Msg(Object value)
            {
                _Msg = value;
                return this;
            }


            /// <summary>
            /// Builds instance of JsonError.
            /// </summary>
            /// <returns>JsonError</returns>
            public JsonError Build()
            {
                Validate();
                return new JsonError(
                    Result: _Result,
                    Msg: _Msg
                );
            }

            private void Validate()
            { 
                if (_Result == null)
                {
                    throw new ArgumentException("Result is a required property for JsonError and cannot be null");
                } 
                if (_Msg == null)
                {
                    throw new ArgumentException("Msg is a required property for JsonError and cannot be null");
                } 
            }
        }

        
    }
}
