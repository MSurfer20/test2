using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// JsonResponseBase
    /// </summary>
    public sealed class JsonResponseBase:  IEquatable<JsonResponseBase>
    { 
        /// <summary>
        /// Result
        /// </summary>
        public string Result { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use JsonResponseBase.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public JsonResponseBase()
        {
        }

        private JsonResponseBase(string Result)
        {
            
            this.Result = Result;
            
        }

        /// <summary>
        /// Returns builder of JsonResponseBase.
        /// </summary>
        /// <returns>JsonResponseBaseBuilder</returns>
        public static JsonResponseBaseBuilder Builder()
        {
            return new JsonResponseBaseBuilder();
        }

        /// <summary>
        /// Returns JsonResponseBaseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>JsonResponseBaseBuilder</returns>
        public JsonResponseBaseBuilder With()
        {
            return Builder()
                .Result(Result);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(JsonResponseBase other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (JsonResponseBase.
        /// </summary>
        /// <param name="left">Compared (JsonResponseBase</param>
        /// <param name="right">Compared (JsonResponseBase</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (JsonResponseBase left, JsonResponseBase right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (JsonResponseBase.
        /// </summary>
        /// <param name="left">Compared (JsonResponseBase</param>
        /// <param name="right">Compared (JsonResponseBase</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (JsonResponseBase left, JsonResponseBase right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of JsonResponseBase.
        /// </summary>
        public sealed class JsonResponseBaseBuilder
        {
            private string _Result;

            internal JsonResponseBaseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for JsonResponseBase.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public JsonResponseBaseBuilder Result(string value)
            {
                _Result = value;
                return this;
            }


            /// <summary>
            /// Builds instance of JsonResponseBase.
            /// </summary>
            /// <returns>JsonResponseBase</returns>
            public JsonResponseBase Build()
            {
                Validate();
                return new JsonResponseBase(
                    Result: _Result
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
