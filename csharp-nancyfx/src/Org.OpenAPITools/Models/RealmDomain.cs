using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// Object containing details of the newly added domain. 
    /// </summary>
    public sealed class RealmDomain:  IEquatable<RealmDomain>
    { 
        /// <summary>
        /// The new allowed domain. 
        /// </summary>
        public string Domain { get; private set; }

        /// <summary>
        /// Whether subdomains are allowed for this domain. 
        /// </summary>
        public bool? AllowSubdomains { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use RealmDomain.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public RealmDomain()
        {
        }

        private RealmDomain(string Domain, bool? AllowSubdomains)
        {
            
            this.Domain = Domain;
            
            this.AllowSubdomains = AllowSubdomains;
            
        }

        /// <summary>
        /// Returns builder of RealmDomain.
        /// </summary>
        /// <returns>RealmDomainBuilder</returns>
        public static RealmDomainBuilder Builder()
        {
            return new RealmDomainBuilder();
        }

        /// <summary>
        /// Returns RealmDomainBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>RealmDomainBuilder</returns>
        public RealmDomainBuilder With()
        {
            return Builder()
                .Domain(Domain)
                .AllowSubdomains(AllowSubdomains);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(RealmDomain other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (RealmDomain.
        /// </summary>
        /// <param name="left">Compared (RealmDomain</param>
        /// <param name="right">Compared (RealmDomain</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (RealmDomain left, RealmDomain right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (RealmDomain.
        /// </summary>
        /// <param name="left">Compared (RealmDomain</param>
        /// <param name="right">Compared (RealmDomain</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (RealmDomain left, RealmDomain right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of RealmDomain.
        /// </summary>
        public sealed class RealmDomainBuilder
        {
            private string _Domain;
            private bool? _AllowSubdomains;

            internal RealmDomainBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for RealmDomain.Domain property.
            /// </summary>
            /// <param name="value">The new allowed domain. </param>
            public RealmDomainBuilder Domain(string value)
            {
                _Domain = value;
                return this;
            }

            /// <summary>
            /// Sets value for RealmDomain.AllowSubdomains property.
            /// </summary>
            /// <param name="value">Whether subdomains are allowed for this domain. </param>
            public RealmDomainBuilder AllowSubdomains(bool? value)
            {
                _AllowSubdomains = value;
                return this;
            }


            /// <summary>
            /// Builds instance of RealmDomain.
            /// </summary>
            /// <returns>RealmDomain</returns>
            public RealmDomain Build()
            {
                Validate();
                return new RealmDomain(
                    Domain: _Domain,
                    AllowSubdomains: _AllowSubdomains
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
