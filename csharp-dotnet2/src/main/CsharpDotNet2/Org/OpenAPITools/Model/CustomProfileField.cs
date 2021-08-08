using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Dictionary containing the details of a custom profile field configured for this organization. 
  /// </summary>
  [DataContract]
  public class CustomProfileField {
    /// <summary>
    /// The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. 
    /// </summary>
    /// <value>The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. </value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public int? Id { get; set; }

    /// <summary>
    /// An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
    /// </summary>
    /// <value>An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account </value>
    [DataMember(Name="type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type")]
    public int? Type { get; set; }

    /// <summary>
    /// Custom profile fields are displayed in both settings UI and UI showing users' profiles in increasing `order`. 
    /// </summary>
    /// <value>Custom profile fields are displayed in both settings UI and UI showing users' profiles in increasing `order`. </value>
    [DataMember(Name="order", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "order")]
    public int? Order { get; set; }

    /// <summary>
    /// The name of the custom profile field. 
    /// </summary>
    /// <value>The name of the custom profile field. </value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
    /// </summary>
    /// <value>The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. </value>
    [DataMember(Name="hint", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "hint")]
    public string Hint { get; set; }

    /// <summary>
    /// Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
    /// </summary>
    /// <value>Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. </value>
    [DataMember(Name="field_data", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "field_data")]
    public string FieldData { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CustomProfileField {\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
      sb.Append("  Order: ").Append(Order).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Hint: ").Append(Hint).Append("\n");
      sb.Append("  FieldData: ").Append(FieldData).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
    }

}
}
