using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// Dictionary containing details of a default stream group. 
    /// </summary>
    public sealed class DefaultStreamGroup:  IEquatable<DefaultStreamGroup>
    { 
        /// <summary>
        /// Name of the default stream group. 
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// Description of the default stream group. 
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// id of the default stream group. 
        /// </summary>
        public int? Id { get; private set; }

        /// <summary>
        /// Array containing details about the streams in the default stream group. 
        /// </summary>
        public List<BasicStream> Streams { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DefaultStreamGroup.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DefaultStreamGroup()
        {
        }

        private DefaultStreamGroup(string Name, string Description, int? Id, List<BasicStream> Streams)
        {
            
            this.Name = Name;
            
            this.Description = Description;
            
            this.Id = Id;
            
            this.Streams = Streams;
            
        }

        /// <summary>
        /// Returns builder of DefaultStreamGroup.
        /// </summary>
        /// <returns>DefaultStreamGroupBuilder</returns>
        public static DefaultStreamGroupBuilder Builder()
        {
            return new DefaultStreamGroupBuilder();
        }

        /// <summary>
        /// Returns DefaultStreamGroupBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DefaultStreamGroupBuilder</returns>
        public DefaultStreamGroupBuilder With()
        {
            return Builder()
                .Name(Name)
                .Description(Description)
                .Id(Id)
                .Streams(Streams);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DefaultStreamGroup other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DefaultStreamGroup.
        /// </summary>
        /// <param name="left">Compared (DefaultStreamGroup</param>
        /// <param name="right">Compared (DefaultStreamGroup</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DefaultStreamGroup left, DefaultStreamGroup right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DefaultStreamGroup.
        /// </summary>
        /// <param name="left">Compared (DefaultStreamGroup</param>
        /// <param name="right">Compared (DefaultStreamGroup</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DefaultStreamGroup left, DefaultStreamGroup right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DefaultStreamGroup.
        /// </summary>
        public sealed class DefaultStreamGroupBuilder
        {
            private string _Name;
            private string _Description;
            private int? _Id;
            private List<BasicStream> _Streams;

            internal DefaultStreamGroupBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DefaultStreamGroup.Name property.
            /// </summary>
            /// <param name="value">Name of the default stream group. </param>
            public DefaultStreamGroupBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for DefaultStreamGroup.Description property.
            /// </summary>
            /// <param name="value">Description of the default stream group. </param>
            public DefaultStreamGroupBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for DefaultStreamGroup.Id property.
            /// </summary>
            /// <param name="value">id of the default stream group. </param>
            public DefaultStreamGroupBuilder Id(int? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for DefaultStreamGroup.Streams property.
            /// </summary>
            /// <param name="value">Array containing details about the streams in the default stream group. </param>
            public DefaultStreamGroupBuilder Streams(List<BasicStream> value)
            {
                _Streams = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DefaultStreamGroup.
            /// </summary>
            /// <returns>DefaultStreamGroup</returns>
            public DefaultStreamGroup Build()
            {
                Validate();
                return new DefaultStreamGroup(
                    Name: _Name,
                    Description: _Description,
                    Id: _Id,
                    Streams: _Streams
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
