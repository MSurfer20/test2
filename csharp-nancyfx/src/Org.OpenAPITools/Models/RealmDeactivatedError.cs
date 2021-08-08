using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// RealmDeactivatedError
    /// </summary>
    public sealed class RealmDeactivatedError:  IEquatable<RealmDeactivatedError>
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
        /// Empty constructor required by some serializers.
        /// Use RealmDeactivatedError.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public RealmDeactivatedError()
        {
        }

        private RealmDeactivatedError(Object Result, Object Msg, Object Code)
        {
            
            this.Result = Result;
            
            this.Msg = Msg;
            
            this.Code = Code;
            
        }

        /// <summary>
        /// Returns builder of RealmDeactivatedError.
        /// </summary>
        /// <returns>RealmDeactivatedErrorBuilder</returns>
        public static RealmDeactivatedErrorBuilder Builder()
        {
            return new RealmDeactivatedErrorBuilder();
        }

        /// <summary>
        /// Returns RealmDeactivatedErrorBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>RealmDeactivatedErrorBuilder</returns>
        public RealmDeactivatedErrorBuilder With()
        {
            return Builder()
                .Result(Result)
                .Msg(Msg)
                .Code(Code);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(RealmDeactivatedError other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (RealmDeactivatedError.
        /// </summary>
        /// <param name="left">Compared (RealmDeactivatedError</param>
        /// <param name="right">Compared (RealmDeactivatedError</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (RealmDeactivatedError left, RealmDeactivatedError right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (RealmDeactivatedError.
        /// </summary>
        /// <param name="left">Compared (RealmDeactivatedError</param>
        /// <param name="right">Compared (RealmDeactivatedError</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (RealmDeactivatedError left, RealmDeactivatedError right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of RealmDeactivatedError.
        /// </summary>
        public sealed class RealmDeactivatedErrorBuilder
        {
            private Object _Result;
            private Object _Msg;
            private Object _Code;

            internal RealmDeactivatedErrorBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for RealmDeactivatedError.Result property.
            /// </summary>
            /// <param name="value">Result</param>
            public RealmDeactivatedErrorBuilder Result(Object value)
            {
                _Result = value;
                return this;
            }

            /// <summary>
            /// Sets value for RealmDeactivatedError.Msg property.
            /// </summary>
            /// <param name="value">Msg</param>
            public RealmDeactivatedErrorBuilder Msg(Object value)
            {
                _Msg = value;
                return this;
            }

            /// <summary>
            /// Sets value for RealmDeactivatedError.Code property.
            /// </summary>
            /// <param name="value">Code</param>
            public RealmDeactivatedErrorBuilder Code(Object value)
            {
                _Code = value;
                return this;
            }


            /// <summary>
            /// Builds instance of RealmDeactivatedError.
            /// </summary>
            /// <returns>RealmDeactivatedError</returns>
            public RealmDeactivatedError Build()
            {
                Validate();
                return new RealmDeactivatedError(
                    Result: _Result,
                    Msg: _Msg,
                    Code: _Code
                );
            }

            private void Validate()
            { 
                if (_Result == null)
                {
                    throw new ArgumentException("Result is a required property for RealmDeactivatedError and cannot be null");
                } 
                if (_Msg == null)
                {
                    throw new ArgumentException("Msg is a required property for RealmDeactivatedError and cannot be null");
                } 
            }
        }

        
    }
}
