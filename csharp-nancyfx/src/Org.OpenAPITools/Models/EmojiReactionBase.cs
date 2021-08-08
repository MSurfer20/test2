using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// EmojiReactionBase
    /// </summary>
    public sealed class EmojiReactionBase:  IEquatable<EmojiReactionBase>
    { 
        /// <summary>
        /// A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji. 
        /// </summary>
        public string EmojiCode { get; private set; }

        /// <summary>
        /// Name of the emoji. 
        /// </summary>
        public string EmojiName { get; private set; }

        /// <summary>
        /// One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji. 
        /// </summary>
        public string ReactionType { get; private set; }

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
        /// Use EmojiReactionBase.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public EmojiReactionBase()
        {
        }

        private EmojiReactionBase(string EmojiCode, string EmojiName, string ReactionType, int? UserId, EmojiReactionBaseAllOfUser User)
        {
            
            this.EmojiCode = EmojiCode;
            
            this.EmojiName = EmojiName;
            
            this.ReactionType = ReactionType;
            
            this.UserId = UserId;
            
            this.User = User;
            
        }

        /// <summary>
        /// Returns builder of EmojiReactionBase.
        /// </summary>
        /// <returns>EmojiReactionBaseBuilder</returns>
        public static EmojiReactionBaseBuilder Builder()
        {
            return new EmojiReactionBaseBuilder();
        }

        /// <summary>
        /// Returns EmojiReactionBaseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>EmojiReactionBaseBuilder</returns>
        public EmojiReactionBaseBuilder With()
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

        public bool Equals(EmojiReactionBase other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (EmojiReactionBase.
        /// </summary>
        /// <param name="left">Compared (EmojiReactionBase</param>
        /// <param name="right">Compared (EmojiReactionBase</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (EmojiReactionBase left, EmojiReactionBase right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (EmojiReactionBase.
        /// </summary>
        /// <param name="left">Compared (EmojiReactionBase</param>
        /// <param name="right">Compared (EmojiReactionBase</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (EmojiReactionBase left, EmojiReactionBase right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of EmojiReactionBase.
        /// </summary>
        public sealed class EmojiReactionBaseBuilder
        {
            private string _EmojiCode;
            private string _EmojiName;
            private string _ReactionType;
            private int? _UserId;
            private EmojiReactionBaseAllOfUser _User;

            internal EmojiReactionBaseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for EmojiReactionBase.EmojiCode property.
            /// </summary>
            /// <param name="value">A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji. </param>
            public EmojiReactionBaseBuilder EmojiCode(string value)
            {
                _EmojiCode = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmojiReactionBase.EmojiName property.
            /// </summary>
            /// <param name="value">Name of the emoji. </param>
            public EmojiReactionBaseBuilder EmojiName(string value)
            {
                _EmojiName = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmojiReactionBase.ReactionType property.
            /// </summary>
            /// <param name="value">One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji. </param>
            public EmojiReactionBaseBuilder ReactionType(string value)
            {
                _ReactionType = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmojiReactionBase.UserId property.
            /// </summary>
            /// <param name="value">The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The &#x60;user&#x60; object is deprecated and will be removed in the future. </param>
            public EmojiReactionBaseBuilder UserId(int? value)
            {
                _UserId = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmojiReactionBase.User property.
            /// </summary>
            /// <param name="value">User</param>
            public EmojiReactionBaseBuilder User(EmojiReactionBaseAllOfUser value)
            {
                _User = value;
                return this;
            }


            /// <summary>
            /// Builds instance of EmojiReactionBase.
            /// </summary>
            /// <returns>EmojiReactionBase</returns>
            public EmojiReactionBase Build()
            {
                Validate();
                return new EmojiReactionBase(
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
