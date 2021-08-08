using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// BadEventQueueIdError
    /// </summary>
    public sealed class BadEventQueueIdError:  IEquatable<BadEventQueueIdError>
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
        /// Use BadEventQueueIdError.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public BadEventQueueIdError()
        {
        }

        private BadEventQueueIdError(Object Result, Object Msg, Object Code, string QueueId)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
            this.Code = Code;
            
            this.QueueId = QueueId;
            
        }

        /// <summary>
        /// Returns builder of BadEventQueueIdError.
        /// </summary>
        /// <returns>BadEventQueueIdErrorBuilder</returns>
        public static BadEventQueueIdErrorBuilder Builder()
        {
            return new BadEventQueueIdErrorBuilder();
        }

        /// <summary>
        /// Returns BadEventQueueIdErrorBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>BadEventQueueIdErrorBuilder</returns>
        public BadEventQueueIdErrorBuilder With()
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

        public bool Equals(BadEventQueueIdError other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (BadEventQueueIdError.
        /// </summary>
        /// <param name="left">Compared (BadEventQueueIdError</param>
        /// <param name="right">Compared (BadEventQueueIdError</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (BadEventQueueIdError left, BadEventQueueIdError right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (BadEventQueueIdError.
        /// </summary>
        /// <param name="left">Compared (BadEventQueueIdError</param>
        /// <param name="right">Compared (BadEventQueueIdError</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (BadEventQueueIdError left, BadEventQueueIdError right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of BadEventQueueIdError.
        /// </summary>
        public sealed class BadEventQueueIdErrorBuilder
        {
            private Object _Result;
            private Object _Msg;
            private Object _Code;
            private string _QueueId;

            internal BadEventQueueIdErrorBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for BadEventQueueIdError.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public BadEventQueueIdErrorBuilder Result(Object value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for BadEventQueueIdError.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public BadEventQueueIdErrorBuilder Msg(Object value)
            {
                _Msg = value;
                return this;
            }

            /// <summary>
            /// Sets value for BadEventQueueIdError.Code property.
            /// </summary>
            /// <param name="value">Code</param>
            public BadEventQueueIdErrorBuilder Code(Object value)
            {
                _Code = value;
                return this;
            }

            /// <summary>
            /// Sets value for BadEventQueueIdError.QueueId property.
            /// </summary>
            /// <param name="value">The string that identifies the invalid event queue. </param>
            public BadEventQueueIdErrorBuilder QueueId(string value)
            {
                _QueueId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of BadEventQueueIdError.
            /// </summary>
            /// <returns>BadEventQueueIdError</returns>
            public BadEventQueueIdError Build()
            {
                Validate();
                return new BadEventQueueIdError(
                    Result: _Result,
                    Msg: _Msg,
                    Code: _Code,
                    QueueId: _QueueId
                );
            }

            private void Validate()
            { 
                if (_Result == null)
                {
                    throw new ArgumentException("Result is a required property for BadEventQueueIdError and cannot be null");
                } 
                if (_Msg == null)
                {
                    throw new ArgumentException("Msg is a required property for BadEventQueueIdError and cannot be null");
                } 
            }
        }

        
    }
}
