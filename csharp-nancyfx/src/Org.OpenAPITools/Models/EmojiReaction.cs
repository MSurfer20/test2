using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// EmojiReaction
    /// </summary>
    public sealed class EmojiReaction:  IEquatable<EmojiReaction>
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
        /// Use EmojiReaction.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public EmojiReaction()
        {
        }

        private EmojiReaction(Object EmojiCode, Object EmojiName, Object ReactionType, Object UserId, Object User)
        {
            
            this.EmojiCode = EmojiCode;
            
            this.EmojiName = EmojiName;
            
            this.ReactionType = ReactionType;
            
            this.UserId = UserId;
            
            this.User = User;
            
        }

        /// <summary>
        /// Returns builder of EmojiReaction.
        /// </summary>
        /// <returns>EmojiReactionBuilder</returns>
        public static EmojiReactionBuilder Builder()
        {
            return new EmojiReactionBuilder();
        }

        /// <summary>
        /// Returns EmojiReactionBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>EmojiReactionBuilder</returns>
        public EmojiReactionBuilder With()
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

        public bool Equals(EmojiReaction other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (EmojiReaction.
        /// </summary>
        /// <param name="left">Compared (EmojiReaction</param>
        /// <param name="right">Compared (EmojiReaction</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (EmojiReaction left, EmojiReaction right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (EmojiReaction.
        /// </summary>
        /// <param name="left">Compared (EmojiReaction</param>
        /// <param name="right">Compared (EmojiReaction</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (EmojiReaction left, EmojiReaction right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of EmojiReaction.
        /// </summary>
        public sealed class EmojiReactionBuilder
        {
            private Object _EmojiCode;
            private Object _EmojiName;
            private Object _ReactionType;
            private Object _UserId;
            private Object _User;

            internal EmojiReactionBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for EmojiReaction.EmojiCode property.
            /// </summary>
            /// <param name="value">EmojiCode</param>
            public EmojiReactionBuilder EmojiCode(Object value)
            {
                _EmojiCode = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmojiReaction.EmojiName property.
            /// </summary>
            /// <param name="value">EmojiName</param>
            public EmojiReactionBuilder EmojiName(Object value)
            {
                _EmojiName = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmojiReaction.ReactionType property.
            /// </summary>
            /// <param name="value">ReactionType</param>
            public EmojiReactionBuilder ReactionType(Object value)
            {
                _ReactionType = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmojiReaction.UserId property.
            /// </summary>
            /// <param name="value">UserId</param>
            public EmojiReactionBuilder UserId(Object value)
            {
                _UserId = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmojiReaction.User property.
            /// </summary>
            /// <param name="value">User</param>
            public EmojiReactionBuilder User(Object value)
            {
                _User = value;
                return this;
            }


            /// <summary>
            /// Builds instance of EmojiReaction.
            /// </summary>
            /// <returns>EmojiReaction</returns>
            public EmojiReaction Build()
            {
                Validate();
                return new EmojiReaction(
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
