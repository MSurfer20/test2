using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class CodedErrorBase {
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
    /// A string that identifies the error. 
    /// </summary>
    /// <value>A string that identifies the error. </value>
    [DataMember(Name="code", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "code")]
    public string Code { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CodedErrorBase {\n");
      sb.Append("  Result: ").Append(Result).Append("\n");
      sb.Append("  Msg: ").Append(Msg).Append("\n");
      sb.Append("  Code: ").Append(Code).Append("\n");
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
