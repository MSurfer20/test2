using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Object containing details of the newly added domain. 
  /// </summary>
  [DataContract]
  public class RealmDomain {
    /// <summary>
    /// The new allowed domain. 
    /// </summary>
    /// <value>The new allowed domain. </value>
    [DataMember(Name="domain", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "domain")]
    public string Domain { get; set; }

    /// <summary>
    /// Whether subdomains are allowed for this domain. 
    /// </summary>
    /// <value>Whether subdomains are allowed for this domain. </value>
    [DataMember(Name="allow_subdomains", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "allow_subdomains")]
    public bool? AllowSubdomains { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class RealmDomain {\n");
      sb.Append("  Domain: ").Append(Domain).Append("\n");
      sb.Append("  AllowSubdomains: ").Append(AllowSubdomains).Append("\n");
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
