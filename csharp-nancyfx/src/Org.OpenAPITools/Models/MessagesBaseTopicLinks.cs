using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// MessagesBaseTopicLinks
    /// </summary>
    public sealed class MessagesBaseTopicLinks:  IEquatable<MessagesBaseTopicLinks>
    { 
        /// <summary>
        /// The original link text present in the topic. 
        /// </summary>
        public string Text { get; private set; }

        /// <summary>
        /// The expanded target url which the link points to. 
        /// </summary>
        public string Url { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use MessagesBaseTopicLinks.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public MessagesBaseTopicLinks()
        {
        }

        private MessagesBaseTopicLinks(string Text, string Url)
        {
            
            this.Text = Text;
            
            this.Url = Url;
            
        }

        /// <summary>
        /// Returns builder of MessagesBaseTopicLinks.
        /// </summary>
        /// <returns>MessagesBaseTopicLinksBuilder</returns>
        public static MessagesBaseTopicLinksBuilder Builder()
        {
            return new MessagesBaseTopicLinksBuilder();
        }

        /// <summary>
        /// Returns MessagesBaseTopicLinksBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>MessagesBaseTopicLinksBuilder</returns>
        public MessagesBaseTopicLinksBuilder With()
        {
            return Builder()
                .Text(Text)
                .Url(Url);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(MessagesBaseTopicLinks other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (MessagesBaseTopicLinks.
        /// </summary>
        /// <param name="left">Compared (MessagesBaseTopicLinks</param>
        /// <param name="right">Compared (MessagesBaseTopicLinks</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (MessagesBaseTopicLinks left, MessagesBaseTopicLinks right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (MessagesBaseTopicLinks.
        /// </summary>
        /// <param name="left">Compared (MessagesBaseTopicLinks</param>
        /// <param name="right">Compared (MessagesBaseTopicLinks</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (MessagesBaseTopicLinks left, MessagesBaseTopicLinks right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of MessagesBaseTopicLinks.
        /// </summary>
        public sealed class MessagesBaseTopicLinksBuilder
        {
            private string _Text;
            private string _Url;

            internal MessagesBaseTopicLinksBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for MessagesBaseTopicLinks.Text property.
            /// </summary>
            /// <param name="value">The original link text present in the topic. </param>
            public MessagesBaseTopicLinksBuilder Text(string value)
            {
                _Text = value;
                return this;
            }

            /// <summary>
            /// Sets value for MessagesBaseTopicLinks.Url property.
            /// </summary>
            /// <param name="value">The expanded target url which the link points to. </param>
            public MessagesBaseTopicLinksBuilder Url(string value)
            {
                _Url = value;
                return this;
            }


            /// <summary>
            /// Builds instance of MessagesBaseTopicLinks.
            /// </summary>
            /// <returns>MessagesBaseTopicLinks</returns>
            public MessagesBaseTopicLinks Build()
            {
                Validate();
                return new MessagesBaseTopicLinks(
                    Text: _Text,
                    Url: _Url
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
