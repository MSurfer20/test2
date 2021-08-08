using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
  /// </summary>
  [DataContract]
  public class MissingArgumentErrorAllOf {
    /// <summary>
    /// Gets or Sets Result
    /// </summary>
    [DataMember(Name="result", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "result")]
    public Object Result { get; set; }

    /// <summary>
    /// Gets or Sets Msg
    /// </summary>
    [DataMember(Name="msg", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "msg")]
    public Object Msg { get; set; }

    /// <summary>
    /// Gets or Sets Code
    /// </summary>
    [DataMember(Name="code", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "code")]
    public Object Code { get; set; }

    /// <summary>
    /// It contains the information about the missing parameter. 
    /// </summary>
    /// <value>It contains the information about the missing parameter. </value>
    [DataMember(Name="var_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "var_name")]
    public string VarName { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class MissingArgumentErrorAllOf {\n");
      sb.Append("  Result: ").Append(Result).Append("\n");
      sb.Append("  Msg: ").Append(Msg).Append("\n");
      sb.Append("  Code: ").Append(Code).Append("\n");
      sb.Append("  VarName: ").Append(VarName).Append("\n");
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
