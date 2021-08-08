using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// Object containing details about a realm playground. 
    /// </summary>
    public sealed class RealmPlayground:  IEquatable<RealmPlayground>
    { 
        /// <summary>
        /// The unique ID for the realm playground. 
        /// </summary>
        public int? Id { get; private set; }

        /// <summary>
        /// The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// The name of the Pygments language lexer for that programming language. 
        /// </summary>
        public string PygmentsLanguage { get; private set; }

        /// <summary>
        /// The url prefix for the playground. 
        /// </summary>
        public string UrlPrefix { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use RealmPlayground.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public RealmPlayground()
        {
        }

        private RealmPlayground(int? Id, string Name, string PygmentsLanguage, string UrlPrefix)
        {
            
            this.Id = Id;
            
            this.Name = Name;
            
            this.PygmentsLanguage = PygmentsLanguage;
            
            this.UrlPrefix = UrlPrefix;
            
        }

        /// <summary>
        /// Returns builder of RealmPlayground.
        /// </summary>
        /// <returns>RealmPlaygroundBuilder</returns>
        public static RealmPlaygroundBuilder Builder()
        {
            return new RealmPlaygroundBuilder();
        }

        /// <summary>
        /// Returns RealmPlaygroundBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>RealmPlaygroundBuilder</returns>
        public RealmPlaygroundBuilder With()
        {
            return Builder()
                .Id(Id)
                .Name(Name)
                .PygmentsLanguage(PygmentsLanguage)
                .UrlPrefix(UrlPrefix);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(RealmPlayground other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (RealmPlayground.
        /// </summary>
        /// <param name="left">Compared (RealmPlayground</param>
        /// <param name="right">Compared (RealmPlayground</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (RealmPlayground left, RealmPlayground right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (RealmPlayground.
        /// </summary>
        /// <param name="left">Compared (RealmPlayground</param>
        /// <param name="right">Compared (RealmPlayground</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (RealmPlayground left, RealmPlayground right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of RealmPlayground.
        /// </summary>
        public sealed class RealmPlaygroundBuilder
        {
            private int? _Id;
            private string _Name;
            private string _PygmentsLanguage;
            private string _UrlPrefix;

            internal RealmPlaygroundBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for RealmPlayground.Id property.
            /// </summary>
            /// <param name="value">The unique ID for the realm playground. </param>
            public RealmPlaygroundBuilder Id(int? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for RealmPlayground.Name property.
            /// </summary>
            /// <param name="value">The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). </param>
            public RealmPlaygroundBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for RealmPlayground.PygmentsLanguage property.
            /// </summary>
            /// <param name="value">The name of the Pygments language lexer for that programming language. </param>
            public RealmPlaygroundBuilder PygmentsLanguage(string value)
            {
                _PygmentsLanguage = value;
                return this;
            }

            /// <summary>
            /// Sets value for RealmPlayground.UrlPrefix property.
            /// </summary>
            /// <param name="value">The url prefix for the playground. </param>
            public RealmPlaygroundBuilder UrlPrefix(string value)
            {
                _UrlPrefix = value;
                return this;
            }


            /// <summary>
            /// Builds instance of RealmPlayground.
            /// </summary>
            /// <returns>RealmPlayground</returns>
            public RealmPlayground Build()
            {
                Validate();
                return new RealmPlayground(
                    Id: _Id,
                    Name: _Name,
                    PygmentsLanguage: _PygmentsLanguage,
                    UrlPrefix: _UrlPrefix
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
