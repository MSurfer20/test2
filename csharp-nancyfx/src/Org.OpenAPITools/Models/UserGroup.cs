using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// Object containing the user group&#39;s attributes. 
    /// </summary>
    public sealed class UserGroup:  IEquatable<UserGroup>
    { 
        /// <summary>
        /// The name of the user group. 
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// The description of the user group. 
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Array containing the id of the users who are members of this user group. 
        /// </summary>
        public List<int?> Members { get; private set; }

        /// <summary>
        /// The ID of the user group. 
        /// </summary>
        public int? Id { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use UserGroup.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public UserGroup()
        {
        }

        private UserGroup(string Name, string Description, List<int?> Members, int? Id)
        {
            
            this.Name = Name;
            
            this.Description = Description;
            
            this.Members = Members;
            
            this.Id = Id;
            
        }

        /// <summary>
        /// Returns builder of UserGroup.
        /// </summary>
        /// <returns>UserGroupBuilder</returns>
        public static UserGroupBuilder Builder()
        {
            return new UserGroupBuilder();
        }

        /// <summary>
        /// Returns UserGroupBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>UserGroupBuilder</returns>
        public UserGroupBuilder With()
        {
            return Builder()
                .Name(Name)
                .Description(Description)
                .Members(Members)
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

        public bool Equals(UserGroup other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (UserGroup.
        /// </summary>
        /// <param name="left">Compared (UserGroup</param>
        /// <param name="right">Compared (UserGroup</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (UserGroup left, UserGroup right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (UserGroup.
        /// </summary>
        /// <param name="left">Compared (UserGroup</param>
        /// <param name="right">Compared (UserGroup</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (UserGroup left, UserGroup right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of UserGroup.
        /// </summary>
        public sealed class UserGroupBuilder
        {
            private string _Name;
            private string _Description;
            private List<int?> _Members;
            private int? _Id;

            internal UserGroupBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for UserGroup.Name property.
            /// </summary>
            /// <param name="value">The name of the user group. </param>
            public UserGroupBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserGroup.Description property.
            /// </summary>
            /// <param name="value">The description of the user group. </param>
            public UserGroupBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserGroup.Members property.
            /// </summary>
            /// <param name="value">Array containing the id of the users who are members of this user group. </param>
            public UserGroupBuilder Members(List<int?> value)
            {
                _Members = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserGroup.Id property.
            /// </summary>
            /// <param name="value">The ID of the user group. </param>
            public UserGroupBuilder Id(int? value)
            {
                _Id = value;
                return this;
            }


            /// <summary>
            /// Builds instance of UserGroup.
            /// </summary>
            /// <returns>UserGroup</returns>
            public UserGroup Build()
            {
                Validate();
                return new UserGroup(
                    Name: _Name,
                    Description: _Description,
                    Members: _Members,
                    Id: _Id
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
