using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// AttachmentsMessages
    /// </summary>
    public sealed class AttachmentsMessages:  IEquatable<AttachmentsMessages>
    { 
        /// <summary>
        /// Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called &#x60;name&#x60; and was a floating point number. 
        /// </summary>
        public int? DateSent { get; private set; }

        /// <summary>
        /// The unique message ID.  Messages should always be displayed sorted by ID. 
        /// </summary>
        public int? Id { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AttachmentsMessages.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AttachmentsMessages()
        {
        }

        private AttachmentsMessages(int? DateSent, int? Id)
        {
            
            this.DateSent = DateSent;
            
            this.Id = Id;
            
        }

        /// <summary>
        /// Returns builder of AttachmentsMessages.
        /// </summary>
        /// <returns>AttachmentsMessagesBuilder</returns>
        public static AttachmentsMessagesBuilder Builder()
        {
            return new AttachmentsMessagesBuilder();
        }

        /// <summary>
        /// Returns AttachmentsMessagesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AttachmentsMessagesBuilder</returns>
        public AttachmentsMessagesBuilder With()
        {
            return Builder()
                .DateSent(DateSent)
                .Id(Id);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(AttachmentsMessages other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AttachmentsMessages.
        /// </summary>
        /// <param name="left">Compared (AttachmentsMessages</param>
        /// <param name="right">Compared (AttachmentsMessages</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AttachmentsMessages left, AttachmentsMessages right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AttachmentsMessages.
        /// </summary>
        /// <param name="left">Compared (AttachmentsMessages</param>
        /// <param name="right">Compared (AttachmentsMessages</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AttachmentsMessages left, AttachmentsMessages right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AttachmentsMessages.
        /// </summary>
        public sealed class AttachmentsMessagesBuilder
        {
            private int? _DateSent;
            private int? _Id;

            internal AttachmentsMessagesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AttachmentsMessages.DateSent property.
            /// </summary>
            /// <param name="value">Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called &#x60;name&#x60; and was a floating point number. </param>
            public AttachmentsMessagesBuilder DateSent(int? value)
            {
                _DateSent = value;
                return this;
            }

            /// <summary>
            /// Sets value for AttachmentsMessages.Id property.
            /// </summary>
            /// <param name="value">The unique message ID.  Messages should always be displayed sorted by ID. </param>
            public AttachmentsMessagesBuilder Id(int? value)
            {
                _Id = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AttachmentsMessages.
            /// </summary>
            /// <returns>AttachmentsMessages</returns>
            public AttachmentsMessages Build()
            {
                Validate();
                return new AttachmentsMessages(
                    DateSent: _DateSent,
                    Id: _Id
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
