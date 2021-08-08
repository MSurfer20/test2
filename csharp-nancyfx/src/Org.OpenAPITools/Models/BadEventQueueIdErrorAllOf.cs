using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// BadEventQueueIdErrorAllOf
    /// </summary>
    public sealed class BadEventQueueIdErrorAllOf:  IEquatable<BadEventQueueIdErrorAllOf>
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
        /// The string that identifies the invalid event queue. 
        /// </summary>
        public string QueueId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use BadEventQueueIdErrorAllOf.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public BadEventQueueIdErrorAllOf()
        {
        }

        private BadEventQueueIdErrorAllOf(Object Result, Object Msg, Object Code, string QueueId)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
            this.Code = Code;
            
            this.QueueId = QueueId;
            
        }

        /// <summary>
        /// Returns builder of BadEventQueueIdErrorAllOf.
        /// </summary>
        /// <returns>BadEventQueueIdErrorAllOfBuilder</returns>
        public static BadEventQueueIdErrorAllOfBuilder Builder()
        {
            return new BadEventQueueIdErrorAllOfBuilder();
        }

        /// <summary>
        /// Returns BadEventQueueIdErrorAllOfBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>BadEventQueueIdErrorAllOfBuilder</returns>
        public BadEventQueueIdErrorAllOfBuilder With()
        {
            return Builder()
                .Result(Result)
                .Msg(Msg)
                .Code(Code)
                .QueueId(QueueId);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(BadEventQueueIdErrorAllOf other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (BadEventQueueIdErrorAllOf.
        /// </summary>
        /// <param name="left">Compared (BadEventQueueIdErrorAllOf</param>
        /// <param name="right">Compared (BadEventQueueIdErrorAllOf</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (BadEventQueueIdErrorAllOf left, BadEventQueueIdErrorAllOf right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (BadEventQueueIdErrorAllOf.
        /// </summary>
        /// <param name="left">Compared (BadEventQueueIdErrorAllOf</param>
        /// <param name="right">Compared (BadEventQueueIdErrorAllOf</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (BadEventQueueIdErrorAllOf left, BadEventQueueIdErrorAllOf right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of BadEventQueueIdErrorAllOf.
        /// </summary>
        public sealed class BadEventQueueIdErrorAllOfBuilder
        {
            private Object _Result;
            private Object _Msg;
            private Object _Code;
            private string _QueueId;

            internal BadEventQueueIdErrorAllOfBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for BadEventQueueIdErrorAllOf.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public BadEventQueueIdErrorAllOfBuilder Result(Object value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for BadEventQueueIdErrorAllOf.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public BadEventQueueIdErrorAllOfBuilder Msg(Object value)
            {
                _Msg = value;
                return this;
            }

            /// <summary>
            /// Sets value for BadEventQueueIdErrorAllOf.Code property.
            /// </summary>
            /// <param name="value">Code</param>
            public BadEventQueueIdErrorAllOfBuilder Code(Object value)
            {
                _Code = value;
                return this;
            }

            /// <summary>
            /// Sets value for BadEventQueueIdErrorAllOf.QueueId property.
            /// </summary>
            /// <param name="value">The string that identifies the invalid event queue. </param>
            public BadEventQueueIdErrorAllOfBuilder QueueId(string value)
            {
                _QueueId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of BadEventQueueIdErrorAllOf.
            /// </summary>
            /// <returns>BadEventQueueIdErrorAllOf</returns>
            public BadEventQueueIdErrorAllOf Build()
            {
                Validate();
                return new BadEventQueueIdErrorAllOf(
                    Result: _Result,
                    Msg: _Msg,
                    Code: _Code,
                    QueueId: _QueueId
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
