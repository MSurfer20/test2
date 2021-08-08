using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// BasicStreamAllOf
    /// </summary>
    public sealed class BasicStreamAllOf:  IEquatable<BasicStreamAllOf>
    { 
        /// <summary>
        /// StreamId
        /// </summary>
        public Object StreamId { get; private set; }

        /// <summary>
        /// Name
        /// </summary>
        public Object Name { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public Object Description { get; private set; }

        /// <summary>
        /// DateCreated
        /// </summary>
        public Object DateCreated { get; private set; }

        /// <summary>
        /// InviteOnly
        /// </summary>
        public Object InviteOnly { get; private set; }

        /// <summary>
        /// RenderedDescription
        /// </summary>
        public Object RenderedDescription { get; private set; }

        /// <summary>
        /// IsWebPublic
        /// </summary>
        public Object IsWebPublic { get; private set; }

        /// <summary>
        /// StreamPostPolicy
        /// </summary>
        public Object StreamPostPolicy { get; private set; }

        /// <summary>
        /// MessageRetentionDays
        /// </summary>
        public Object MessageRetentionDays { get; private set; }

        /// <summary>
        /// HistoryPublicToSubscribers
        /// </summary>
        public Object HistoryPublicToSubscribers { get; private set; }

        /// <summary>
        /// FirstMessageId
        /// </summary>
        public Object FirstMessageId { get; private set; }

        /// <summary>
        /// IsAnnouncementOnly
        /// </summary>
        public Object IsAnnouncementOnly { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use BasicStreamAllOf.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public BasicStreamAllOf()
        {
        }

        private BasicStreamAllOf(Object StreamId, Object Name, Object Description, Object DateCreated, Object InviteOnly, Object RenderedDescription, Object IsWebPublic, Object StreamPostPolicy, Object MessageRetentionDays, Object HistoryPublicToSubscribers, Object FirstMessageId, Object IsAnnouncementOnly)
        {
            
            this.StreamId = StreamId;
            
            this.Name = Name;
            
            this.Description = Description;
            
            this.DateCreated = DateCreated;
            
            this.InviteOnly = InviteOnly;
            
            this.RenderedDescription = RenderedDescription;
            
            this.IsWebPublic = IsWebPublic;
            
            this.StreamPostPolicy = StreamPostPolicy;
            
            this.MessageRetentionDays = MessageRetentionDays;
            
            this.HistoryPublicToSubscribers = HistoryPublicToSubscribers;
            
            this.FirstMessageId = FirstMessageId;
            
            this.IsAnnouncementOnly = IsAnnouncementOnly;
            
        }

        /// <summary>
        /// Returns builder of BasicStreamAllOf.
        /// </summary>
        /// <returns>BasicStreamAllOfBuilder</returns>
        public static BasicStreamAllOfBuilder Builder()
        {
            return new BasicStreamAllOfBuilder();
        }

        /// <summary>
        /// Returns BasicStreamAllOfBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>BasicStreamAllOfBuilder</returns>
        public BasicStreamAllOfBuilder With()
        {
            return Builder()
                .StreamId(StreamId)
                .Name(Name)
                .Description(Description)
                .DateCreated(DateCreated)
                .InviteOnly(InviteOnly)
                .RenderedDescription(RenderedDescription)
                .IsWebPublic(IsWebPublic)
                .StreamPostPolicy(StreamPostPolicy)
                .MessageRetentionDays(MessageRetentionDays)
                .HistoryPublicToSubscribers(HistoryPublicToSubscribers)
                .FirstMessageId(FirstMessageId)
                .IsAnnouncementOnly(IsAnnouncementOnly);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(BasicStreamAllOf other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (BasicStreamAllOf.
        /// </summary>
        /// <param name="left">Compared (BasicStreamAllOf</param>
        /// <param name="right">Compared (BasicStreamAllOf</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (BasicStreamAllOf left, BasicStreamAllOf right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (BasicStreamAllOf.
        /// </summary>
        /// <param name="left">Compared (BasicStreamAllOf</param>
        /// <param name="right">Compared (BasicStreamAllOf</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (BasicStreamAllOf left, BasicStreamAllOf right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of BasicStreamAllOf.
        /// </summary>
        public sealed class BasicStreamAllOfBuilder
        {
            private Object _StreamId;
            private Object _Name;
            private Object _Description;
            private Object _DateCreated;
            private Object _InviteOnly;
            private Object _RenderedDescription;
            private Object _IsWebPublic;
            private Object _StreamPostPolicy;
            private Object _MessageRetentionDays;
            private Object _HistoryPublicToSubscribers;
            private Object _FirstMessageId;
            private Object _IsAnnouncementOnly;

            internal BasicStreamAllOfBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for BasicStreamAllOf.StreamId property.
            /// </summary>
            /// <param name="value">StreamId</param>
            public BasicStreamAllOfBuilder StreamId(Object value)
            {
                _StreamId = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStreamAllOf.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public BasicStreamAllOfBuilder Name(Object value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStreamAllOf.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public BasicStreamAllOfBuilder Description(Object value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStreamAllOf.DateCreated property.
            /// </summary>
            /// <param name="value">DateCreated</param>
            public BasicStreamAllOfBuilder DateCreated(Object value)
            {
                _DateCreated = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStreamAllOf.InviteOnly property.
            /// </summary>
            /// <param name="value">InviteOnly</param>
            public BasicStreamAllOfBuilder InviteOnly(Object value)
            {
                _InviteOnly = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStreamAllOf.RenderedDescription property.
            /// </summary>
            /// <param name="value">RenderedDescription</param>
            public BasicStreamAllOfBuilder RenderedDescription(Object value)
            {
                _RenderedDescription = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStreamAllOf.IsWebPublic property.
            /// </summary>
            /// <param name="value">IsWebPublic</param>
            public BasicStreamAllOfBuilder IsWebPublic(Object value)
            {
                _IsWebPublic = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStreamAllOf.StreamPostPolicy property.
            /// </summary>
            /// <param name="value">StreamPostPolicy</param>
            public BasicStreamAllOfBuilder StreamPostPolicy(Object value)
            {
                _StreamPostPolicy = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStreamAllOf.MessageRetentionDays property.
            /// </summary>
            /// <param name="value">MessageRetentionDays</param>
            public BasicStreamAllOfBuilder MessageRetentionDays(Object value)
            {
                _MessageRetentionDays = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStreamAllOf.HistoryPublicToSubscribers property.
            /// </summary>
            /// <param name="value">HistoryPublicToSubscribers</param>
            public BasicStreamAllOfBuilder HistoryPublicToSubscribers(Object value)
            {
                _HistoryPublicToSubscribers = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStreamAllOf.FirstMessageId property.
            /// </summary>
            /// <param name="value">FirstMessageId</param>
            public BasicStreamAllOfBuilder FirstMessageId(Object value)
            {
                _FirstMessageId = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStreamAllOf.IsAnnouncementOnly property.
            /// </summary>
            /// <param name="value">IsAnnouncementOnly</param>
            public BasicStreamAllOfBuilder IsAnnouncementOnly(Object value)
            {
                _IsAnnouncementOnly = value;
                return this;
            }


            /// <summary>
            /// Builds instance of BasicStreamAllOf.
            /// </summary>
            /// <returns>BasicStreamAllOf</returns>
            public BasicStreamAllOf Build()
            {
                Validate();
                return new BasicStreamAllOf(
                    StreamId: _StreamId,
                    Name: _Name,
                    Description: _Description,
                    DateCreated: _DateCreated,
                    InviteOnly: _InviteOnly,
                    RenderedDescription: _RenderedDescription,
                    IsWebPublic: _IsWebPublic,
                    StreamPostPolicy: _StreamPostPolicy,
                    MessageRetentionDays: _MessageRetentionDays,
                    HistoryPublicToSubscribers: _HistoryPublicToSubscribers,
                    FirstMessageId: _FirstMessageId,
                    IsAnnouncementOnly: _IsAnnouncementOnly
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
