using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// EmojiBase
    /// </summary>
    public sealed class EmojiBase:  IEquatable<EmojiBase>
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
        /// Empty constructor required by some serializers.
        /// Use EmojiBase.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public EmojiBase()
        {
        }

        private EmojiBase(string EmojiCode, string EmojiName, string ReactionType)
        {
            
            this.EmojiCode = EmojiCode;
            
            this.EmojiName = EmojiName;
            
            this.ReactionType = ReactionType;
            
        }

        /// <summary>
        /// Returns builder of EmojiBase.
        /// </summary>
        /// <returns>EmojiBaseBuilder</returns>
        public static EmojiBaseBuilder Builder()
        {
            return new EmojiBaseBuilder();
        }

        /// <summary>
        /// Returns EmojiBaseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>EmojiBaseBuilder</returns>
        public EmojiBaseBuilder With()
        {
            return Builder()
                .EmojiCode(EmojiCode)
                .EmojiName(EmojiName)
                .ReactionType(ReactionType);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(EmojiBase other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (EmojiBase.
        /// </summary>
        /// <param name="left">Compared (EmojiBase</param>
        /// <param name="right">Compared (EmojiBase</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (EmojiBase left, EmojiBase right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (EmojiBase.
        /// </summary>
        /// <param name="left">Compared (EmojiBase</param>
        /// <param name="right">Compared (EmojiBase</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (EmojiBase left, EmojiBase right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of EmojiBase.
        /// </summary>
        public sealed class EmojiBaseBuilder
        {
            private string _EmojiCode;
            private string _EmojiName;
            private string _ReactionType;

            internal EmojiBaseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for EmojiBase.EmojiCode property.
            /// </summary>
            /// <param name="value">A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji. </param>
            public EmojiBaseBuilder EmojiCode(string value)
            {
                _EmojiCode = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmojiBase.EmojiName property.
            /// </summary>
            /// <param name="value">Name of the emoji. </param>
            public EmojiBaseBuilder EmojiName(string value)
            {
                _EmojiName = value;
                return this;
            }

            /// <summary>
            /// Sets value for EmojiBase.ReactionType property.
            /// </summary>
            /// <param name="value">One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji. </param>
            public EmojiBaseBuilder ReactionType(string value)
            {
                _ReactionType = value;
                return this;
            }


            /// <summary>
            /// Builds instance of EmojiBase.
            /// </summary>
            /// <returns>EmojiBase</returns>
            public EmojiBase Build()
            {
                Validate();
                return new EmojiBase(
                    EmojiCode: _EmojiCode,
                    EmojiName: _EmojiName,
                    ReactionType: _ReactionType
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
