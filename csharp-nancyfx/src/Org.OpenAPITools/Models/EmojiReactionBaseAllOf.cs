using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// EmojiReactionBaseAllOf
    /// </summary>
    public sealed class EmojiReactionBaseAllOf:  IEquatable<EmojiReactionBaseAllOf>
    { 
        /// <summary>
        /// The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The &#x60;user&#x60; object is deprecated and will be removed in the future. 
        /// </summary>
        public int? UserId { get; private set; }

        /// <summary>
        /// User
        /// </summary>
        public EmojiReactionBaseAllOfUser User { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use EmojiReactionBaseAllOf.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public EmojiReactionBaseAllOf()
        {
        }

        private EmojiReactionBaseAllOf(int? UserId, EmojiReactionBaseAllOfUser User)
        {
            
            this.UserId = UserId;
            
            this.User = User;
            
        }

        /// <summary>
        /// Returns builder of EmojiReactionBaseAllOf.
        /// </summary>
        /// <returns>EmojiReactionBaseAllOfBuilder</returns>
        public static EmojiReactionBaseAllOfBuilder Builder()
        {
            return new EmojiReactionBaseAllOfBuilder();
        }

        /// <summary>
        /// Returns EmojiReactionBaseAllOfBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>EmojiReactionBaseAllOfBuilder</returns>
        public EmojiReactionBaseAllOfBuilder With()
        {
            return Builder()
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

        public bool Equals(EmojiReactionBaseAllOf other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (EmojiReactionBaseAllOf.
        /// </summary>
        /// <param name="left">Compared (EmojiReactionBaseAllOf</param>
        /// <param name="right">Compared (EmojiReactionBaseAllOf</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (EmojiReactionBaseAllOf left, EmojiReactionBaseAllOf right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (EmojiReactionBaseAllOf.
        /// </summary>
        /// <param name="left">Compared (EmojiReactionBaseAllOf</param>
        /// <param name="right">Compared (EmojiReactionBaseAllOf</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (EmojiReactionBaseAllOf left, EmojiReactionBaseAllOf right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of EmojiReactionBaseAllOf.
        /// </summary>
        public sealed class EmojiReactionBaseAllOfBuilder
        {
            private int? _UserId;
            private EmojiReactionBaseAllOfUser _User;

            internal EmojiReactionBaseAllOfBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for EmojiReactionBaseAllOf.UserId property.
            /// </summary>
            /// <param name="value">The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The &#x60;user&#x60; object is deprecated and will be removed in the future. </param>
            public EmojiReactionBaseAllOfBuilder UserId(int? value)
            {
                _UserId = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmojiReactionBaseAllOf.User property.
            /// </summary>
            /// <param name="value">User</param>
            public EmojiReactionBaseAllOfBuilder User(EmojiReactionBaseAllOfUser value)
            {
                _User = value;
                return this;
            }


            /// <summary>
            /// Builds instance of EmojiReactionBaseAllOf.
            /// </summary>
            /// <returns>EmojiReactionBaseAllOf</returns>
            public EmojiReactionBaseAllOf Build()
            {
                Validate();
                return new EmojiReactionBaseAllOf(
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
