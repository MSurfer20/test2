using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// Dictionary containing details of a single hotspot. 
    /// </summary>
    public sealed class Hotspot:  IEquatable<Hotspot>
    { 
        /// <summary>
        /// The delay after which the user should be shown the hotspot. 
        /// </summary>
        public decimal? Delay { get; private set; }

        /// <summary>
        /// The name of the hotspot. 
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// The title of the hotspot, as will be displayed to the user. 
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// The description of the hotspot, as will be displayed to the user. 
        /// </summary>
        public string Description { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Hotspot.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Hotspot()
        {
        }

        private Hotspot(decimal? Delay, string Name, string Title, string Description)
        {
            
            this.Delay = Delay;
            
            this.Name = Name;
            
            this.Title = Title;
            
            this.Description = Description;
            
        }

        /// <summary>
        /// Returns builder of Hotspot.
        /// </summary>
        /// <returns>HotspotBuilder</returns>
        public static HotspotBuilder Builder()
        {
            return new HotspotBuilder();
        }

        /// <summary>
        /// Returns HotspotBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>HotspotBuilder</returns>
        public HotspotBuilder With()
        {
            return Builder()
                .Delay(Delay)
                .Name(Name)
                .Title(Title)
                .Description(Description);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Hotspot other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Hotspot.
        /// </summary>
        /// <param name="left">Compared (Hotspot</param>
        /// <param name="right">Compared (Hotspot</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Hotspot left, Hotspot right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Hotspot.
        /// </summary>
        /// <param name="left">Compared (Hotspot</param>
        /// <param name="right">Compared (Hotspot</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Hotspot left, Hotspot right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Hotspot.
        /// </summary>
        public sealed class HotspotBuilder
        {
            private decimal? _Delay;
            private string _Name;
            private string _Title;
            private string _Description;

            internal HotspotBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Hotspot.Delay property.
            /// </summary>
            /// <param name="value">The delay after which the user should be shown the hotspot. </param>
            public HotspotBuilder Delay(decimal? value)
            {
                _Delay = value;
                return this;
            }

            /// <summary>
            /// Sets value for Hotspot.Name property.
            /// </summary>
            /// <param name="value">The name of the hotspot. </param>
            public HotspotBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for Hotspot.Title property.
            /// </summary>
            /// <param name="value">The title of the hotspot, as will be displayed to the user. </param>
            public HotspotBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for Hotspot.Description property.
            /// </summary>
            /// <param name="value">The description of the hotspot, as will be displayed to the user. </param>
            public HotspotBuilder Description(string value)
            {
                _Description = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Hotspot.
            /// </summary>
            /// <returns>Hotspot</returns>
            public Hotspot Build()
            {
                Validate();
                return new Hotspot(
                    Delay: _Delay,
                    Name: _Name,
                    Title: _Title,
                    Description: _Description
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
