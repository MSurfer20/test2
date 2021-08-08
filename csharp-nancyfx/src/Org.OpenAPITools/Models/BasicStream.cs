using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// BasicStream
    /// </summary>
    public sealed class BasicStream:  IEquatable<BasicStream>
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
        /// Use BasicStream.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public BasicStream()
        {
        }

        private BasicStream(Object StreamId, Object Name, Object Description, Object DateCreated, Object InviteOnly, Object RenderedDescription, Object IsWebPublic, Object StreamPostPolicy, Object MessageRetentionDays, Object HistoryPublicToSubscribers, Object FirstMessageId, Object IsAnnouncementOnly)
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
        /// Returns builder of BasicStream.
        /// </summary>
        /// <returns>BasicStreamBuilder</returns>
        public static BasicStreamBuilder Builder()
        {
            return new BasicStreamBuilder();
        }

        /// <summary>
        /// Returns BasicStreamBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>BasicStreamBuilder</returns>
        public BasicStreamBuilder With()
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

        public bool Equals(BasicStream other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (BasicStream.
        /// </summary>
        /// <param name="left">Compared (BasicStream</param>
        /// <param name="right">Compared (BasicStream</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (BasicStream left, BasicStream right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (BasicStream.
        /// </summary>
        /// <param name="left">Compared (BasicStream</param>
        /// <param name="right">Compared (BasicStream</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (BasicStream left, BasicStream right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of BasicStream.
        /// </summary>
        public sealed class BasicStreamBuilder
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

            internal BasicStreamBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for BasicStream.StreamId property.
            /// </summary>
            /// <param name="value">StreamId</param>
            public BasicStreamBuilder StreamId(Object value)
            {
                _StreamId = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStream.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public BasicStreamBuilder Name(Object value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStream.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public BasicStreamBuilder Description(Object value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStream.DateCreated property.
            /// </summary>
            /// <param name="value">DateCreated</param>
            public BasicStreamBuilder DateCreated(Object value)
            {
                _DateCreated = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStream.InviteOnly property.
            /// </summary>
            /// <param name="value">InviteOnly</param>
            public BasicStreamBuilder InviteOnly(Object value)
            {
                _InviteOnly = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStream.RenderedDescription property.
            /// </summary>
            /// <param name="value">RenderedDescription</param>
            public BasicStreamBuilder RenderedDescription(Object value)
            {
                _RenderedDescription = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStream.IsWebPublic property.
            /// </summary>
            /// <param name="value">IsWebPublic</param>
            public BasicStreamBuilder IsWebPublic(Object value)
            {
                _IsWebPublic = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStream.StreamPostPolicy property.
            /// </summary>
            /// <param name="value">StreamPostPolicy</param>
            public BasicStreamBuilder StreamPostPolicy(Object value)
            {
                _StreamPostPolicy = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStream.MessageRetentionDays property.
            /// </summary>
            /// <param name="value">MessageRetentionDays</param>
            public BasicStreamBuilder MessageRetentionDays(Object value)
            {
                _MessageRetentionDays = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStream.HistoryPublicToSubscribers property.
            /// </summary>
            /// <param name="value">HistoryPublicToSubscribers</param>
            public BasicStreamBuilder HistoryPublicToSubscribers(Object value)
            {
                _HistoryPublicToSubscribers = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStream.FirstMessageId property.
            /// </summary>
            /// <param name="value">FirstMessageId</param>
            public BasicStreamBuilder FirstMessageId(Object value)
            {
                _FirstMessageId = value;
                return this;
            }

            /// <summary>
            /// Sets value for BasicStream.IsAnnouncementOnly property.
            /// </summary>
            /// <param name="value">IsAnnouncementOnly</param>
            public BasicStreamBuilder IsAnnouncementOnly(Object value)
            {
                _IsAnnouncementOnly = value;
                return this;
            }


            /// <summary>
            /// Builds instance of BasicStream.
            /// </summary>
            /// <returns>BasicStream</returns>
            public BasicStream Build()
            {
                Validate();
                return new BasicStream(
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
