using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// Object containing details about a realm export. 
    /// </summary>
    public sealed class RealmExport:  IEquatable<RealmExport>
    { 
        /// <summary>
        /// The id of the export. 
        /// </summary>
        public int? Id { get; private set; }

        /// <summary>
        /// The id of the user who did the export. 
        /// </summary>
        public int? ActingUserId { get; private set; }

        /// <summary>
        /// The UNIX timestamp of when the export was made. 
        /// </summary>
        public decimal? ExportTime { get; private set; }

        /// <summary>
        /// The timestamp of when the export was deleted. Null if it wasn&#39;t. 
        /// </summary>
        public decimal? DeletedTimestamp { get; private set; }

        /// <summary>
        /// The timestamp of when the export failed. Null if it didn&#39;t. 
        /// </summary>
        public decimal? FailedTimestamp { get; private set; }

        /// <summary>
        /// The URL of the export. &#x60;null&#x60; if there&#39;s no URL. 
        /// </summary>
        public string ExportUrl { get; private set; }

        /// <summary>
        /// Whether the export is pending or not. 
        /// </summary>
        public bool? Pending { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use RealmExport.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public RealmExport()
        {
        }

        private RealmExport(int? Id, int? ActingUserId, decimal? ExportTime, decimal? DeletedTimestamp, decimal? FailedTimestamp, string ExportUrl, bool? Pending)
        {
            
            this.Id = Id;
            
            this.ActingUserId = ActingUserId;
            
            this.ExportTime = ExportTime;
            
            this.DeletedTimestamp = DeletedTimestamp;
            
            this.FailedTimestamp = FailedTimestamp;
            
            this.ExportUrl = ExportUrl;
            
            this.Pending = Pending;
            
        }

        /// <summary>
        /// Returns builder of RealmExport.
        /// </summary>
        /// <returns>RealmExportBuilder</returns>
        public static RealmExportBuilder Builder()
        {
            return new RealmExportBuilder();
        }

        /// <summary>
        /// Returns RealmExportBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>RealmExportBuilder</returns>
        public RealmExportBuilder With()
        {
            return Builder()
                .Id(Id)
                .ActingUserId(ActingUserId)
                .ExportTime(ExportTime)
                .DeletedTimestamp(DeletedTimestamp)
                .FailedTimestamp(FailedTimestamp)
                .ExportUrl(ExportUrl)
                .Pending(Pending);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(RealmExport other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (RealmExport.
        /// </summary>
        /// <param name="left">Compared (RealmExport</param>
        /// <param name="right">Compared (RealmExport</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (RealmExport left, RealmExport right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (RealmExport.
        /// </summary>
        /// <param name="left">Compared (RealmExport</param>
        /// <param name="right">Compared (RealmExport</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (RealmExport left, RealmExport right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of RealmExport.
        /// </summary>
        public sealed class RealmExportBuilder
        {
            private int? _Id;
            private int? _ActingUserId;
            private decimal? _ExportTime;
            private decimal? _DeletedTimestamp;
            private decimal? _FailedTimestamp;
            private string _ExportUrl;
            private bool? _Pending;

            internal RealmExportBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for RealmExport.Id property.
            /// </summary>
            /// <param name="value">The id of the export. </param>
            public RealmExportBuilder Id(int? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for RealmExport.ActingUserId property.
            /// </summary>
            /// <param name="value">The id of the user who did the export. </param>
            public RealmExportBuilder ActingUserId(int? value)
            {
                _ActingUserId = value;
                return this;
            }

            /// <summary>
            /// Sets value for RealmExport.ExportTime property.
            /// </summary>
            /// <param name="value">The UNIX timestamp of when the export was made. </param>
            public RealmExportBuilder ExportTime(decimal? value)
            {
                _ExportTime = value;
                return this;
            }

            /// <summary>
            /// Sets value for RealmExport.DeletedTimestamp property.
            /// </summary>
            /// <param name="value">The timestamp of when the export was deleted. Null if it wasn&#39;t. </param>
            public RealmExportBuilder DeletedTimestamp(decimal? value)
            {
                _DeletedTimestamp = value;
                return this;
            }

            /// <summary>
            /// Sets value for RealmExport.FailedTimestamp property.
            /// </summary>
            /// <param name="value">The timestamp of when the export failed. Null if it didn&#39;t. </param>
            public RealmExportBuilder FailedTimestamp(decimal? value)
            {
                _FailedTimestamp = value;
                return this;
            }

            /// <summary>
            /// Sets value for RealmExport.ExportUrl property.
            /// </summary>
            /// <param name="value">The URL of the export. &#x60;null&#x60; if there&#39;s no URL. </param>
            public RealmExportBuilder ExportUrl(string value)
            {
                _ExportUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for RealmExport.Pending property.
            /// </summary>
            /// <param name="value">Whether the export is pending or not. </param>
            public RealmExportBuilder Pending(bool? value)
            {
                _Pending = value;
                return this;
            }


            /// <summary>
            /// Builds instance of RealmExport.
            /// </summary>
            /// <returns>RealmExport</returns>
            public RealmExport Build()
            {
                Validate();
                return new RealmExport(
                    Id: _Id,
                    ActingUserId: _ActingUserId,
                    ExportTime: _ExportTime,
                    DeletedTimestamp: _DeletedTimestamp,
                    FailedTimestamp: _FailedTimestamp,
                    ExportUrl: _ExportUrl,
                    Pending: _Pending
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
