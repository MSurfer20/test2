using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// EmojiReactionAllOf
    /// </summary>
    public sealed class EmojiReactionAllOf:  IEquatable<EmojiReactionAllOf>
    { 
        /// <summary>
        /// EmojiCode
        /// </summary>
        public Object EmojiCode { get; private set; }

        /// <summary>
        /// EmojiName
        /// </summary>
        public Object EmojiName { get; private set; }

        /// <summary>
        /// ReactionType
        /// </summary>
        public Object ReactionType { get; private set; }

        /// <summary>
        /// UserId
        /// </summary>
        public Object UserId { get; private set; }

        /// <summary>
        /// User
        /// </summary>
        public Object User { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use EmojiReactionAllOf.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public EmojiReactionAllOf()
        {
        }

        private EmojiReactionAllOf(Object EmojiCode, Object EmojiName, Object ReactionType, Object UserId, Object User)
        {
            
            this.EmojiCode = EmojiCode;
            
            this.EmojiName = EmojiName;
            
            this.ReactionType = ReactionType;
            
            this.UserId = UserId;
            
            this.User = User;
            
        }

        /// <summary>
        /// Returns builder of EmojiReactionAllOf.
        /// </summary>
        /// <returns>EmojiReactionAllOfBuilder</returns>
        public static EmojiReactionAllOfBuilder Builder()
        {
            return new EmojiReactionAllOfBuilder();
        }

        /// <summary>
        /// Returns EmojiReactionAllOfBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>EmojiReactionAllOfBuilder</returns>
        public EmojiReactionAllOfBuilder With()
        {
            return Builder()
                .EmojiCode(EmojiCode)
                .EmojiName(EmojiName)
                .ReactionType(ReactionType)
                .UserId(UserId)
                .User(User);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(EmojiReactionAllOf other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (EmojiReactionAllOf.
        /// </summary>
        /// <param name="left">Compared (EmojiReactionAllOf</param>
        /// <param name="right">Compared (EmojiReactionAllOf</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (EmojiReactionAllOf left, EmojiReactionAllOf right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (EmojiReactionAllOf.
        /// </summary>
        /// <param name="left">Compared (EmojiReactionAllOf</param>
        /// <param name="right">Compared (EmojiReactionAllOf</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (EmojiReactionAllOf left, EmojiReactionAllOf right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of EmojiReactionAllOf.
        /// </summary>
        public sealed class EmojiReactionAllOfBuilder
        {
            private Object _EmojiCode;
            private Object _EmojiName;
            private Object _ReactionType;
            private Object _UserId;
            private Object _User;

            internal EmojiReactionAllOfBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for EmojiReactionAllOf.EmojiCode property.
            /// </summary>
            /// <param name="value">EmojiCode</param>
            public EmojiReactionAllOfBuilder EmojiCode(Object value)
            {
                _EmojiCode = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmojiReactionAllOf.EmojiName property.
            /// </summary>
            /// <param name="value">EmojiName</param>
            public EmojiReactionAllOfBuilder EmojiName(Object value)
            {
                _EmojiName = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmojiReactionAllOf.ReactionType property.
            /// </summary>
            /// <param name="value">ReactionType</param>
            public EmojiReactionAllOfBuilder ReactionType(Object value)
            {
                _ReactionType = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmojiReactionAllOf.UserId property.
            /// </summary>
            /// <param name="value">UserId</param>
            public EmojiReactionAllOfBuilder UserId(Object value)
            {
                _UserId = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmojiReactionAllOf.User property.
            /// </summary>
            /// <param name="value">User</param>
            public EmojiReactionAllOfBuilder User(Object value)
            {
                _User = value;
                return this;
            }


            /// <summary>
            /// Builds instance of EmojiReactionAllOf.
            /// </summary>
            /// <returns>EmojiReactionAllOf</returns>
            public EmojiReactionAllOf Build()
            {
                Validate();
                return new EmojiReactionAllOf(
                    EmojiCode: _EmojiCode,
                    EmojiName: _EmojiName,
                    ReactionType: _ReactionType,
                    UserId: _UserId,
                    User: _User
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
