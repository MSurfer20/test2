using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Models
{
    /// <summary>
    /// Dictionary containing the details of a custom profile field configured for this organization. 
    /// </summary>
    public sealed class CustomProfileField:  IEquatable<CustomProfileField>
    { 
        /// <summary>
        /// The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. 
        /// </summary>
        public int? Id { get; private set; }

        /// <summary>
        /// An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
        /// </summary>
        public int? Type { get; private set; }

        /// <summary>
        /// Custom profile fields are displayed in both settings UI and UI showing users&#39; profiles in increasing &#x60;order&#x60;. 
        /// </summary>
        public int? Order { get; private set; }

        /// <summary>
        /// The name of the custom profile field. 
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
        /// </summary>
        public string Hint { get; private set; }

        /// <summary>
        /// Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
        /// </summary>
        public string FieldData { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use CustomProfileField.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public CustomProfileField()
        {
        }

        private CustomProfileField(int? Id, int? Type, int? Order, string Name, string Hint, string FieldData)
        {
            
            this.Id = Id;
            
            this.Type = Type;
            
            this.Order = Order;
            
            this.Name = Name;
            
            this.Hint = Hint;
            
            this.FieldData = FieldData;
            
        }

        /// <summary>
        /// Returns builder of CustomProfileField.
        /// </summary>
        /// <returns>CustomProfileFieldBuilder</returns>
        public static CustomProfileFieldBuilder Builder()
        {
            return new CustomProfileFieldBuilder();
        }

        /// <summary>
        /// Returns CustomProfileFieldBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>CustomProfileFieldBuilder</returns>
        public CustomProfileFieldBuilder With()
        {
            return Builder()
                .Id(Id)
                .Type(Type)
                .Order(Order)
                .Name(Name)
                .Hint(Hint)
                .FieldData(FieldData);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(CustomProfileField other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (CustomProfileField.
        /// </summary>
        /// <param name="left">Compared (CustomProfileField</param>
        /// <param name="right">Compared (CustomProfileField</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (CustomProfileField left, CustomProfileField right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (CustomProfileField.
        /// </summary>
        /// <param name="left">Compared (CustomProfileField</param>
        /// <param name="right">Compared (CustomProfileField</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (CustomProfileField left, CustomProfileField right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of CustomProfileField.
        /// </summary>
        public sealed class CustomProfileFieldBuilder
        {
            private int? _Id;
            private int? _Type;
            private int? _Order;
            private string _Name;
            private string _Hint;
            private string _FieldData;

            internal CustomProfileFieldBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for CustomProfileField.Id property.
            /// </summary>
            /// <param name="value">The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. </param>
            public CustomProfileFieldBuilder Id(int? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for CustomProfileField.Type property.
            /// </summary>
            /// <param name="value">An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account </param>
            public CustomProfileFieldBuilder Type(int? value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for CustomProfileField.Order property.
            /// </summary>
            /// <param name="value">Custom profile fields are displayed in both settings UI and UI showing users&#39; profiles in increasing &#x60;order&#x60;. </param>
            public CustomProfileFieldBuilder Order(int? value)
            {
                _Order = value;
                return this;
            }

            /// <summary>
            /// Sets value for CustomProfileField.Name property.
            /// </summary>
            /// <param name="value">The name of the custom profile field. </param>
            public CustomProfileFieldBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for CustomProfileField.Hint property.
            /// </summary>
            /// <param name="value">The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. </param>
            public CustomProfileFieldBuilder Hint(string value)
            {
                _Hint = value;
                return this;
            }

            /// <summary>
            /// Sets value for CustomProfileField.FieldData property.
            /// </summary>
            /// <param name="value">Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. </param>
            public CustomProfileFieldBuilder FieldData(string value)
            {
                _FieldData = value;
                return this;
            }


            /// <summary>
            /// Builds instance of CustomProfileField.
            /// </summary>
            /// <returns>CustomProfileField</returns>
            public CustomProfileField Build()
            {
                Validate();
                return new CustomProfileField(
                    Id: _Id,
                    Type: _Type,
                    Order: _Order,
                    Name: _Name,
                    Hint: _Hint,
                    FieldData: _FieldData
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
