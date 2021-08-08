using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Object containing details about a realm export. 
  /// </summary>
  [DataContract]
  public class RealmExport {
    /// <summary>
    /// The id of the export. 
    /// </summary>
    /// <value>The id of the export. </value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public int? Id { get; set; }

    /// <summary>
    /// The id of the user who did the export. 
    /// </summary>
    /// <value>The id of the user who did the export. </value>
    [DataMember(Name="acting_user_id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "acting_user_id")]
    public int? ActingUserId { get; set; }

    /// <summary>
    /// The UNIX timestamp of when the export was made. 
    /// </summary>
    /// <value>The UNIX timestamp of when the export was made. </value>
    [DataMember(Name="export_time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "export_time")]
    public decimal? ExportTime { get; set; }

    /// <summary>
    /// The timestamp of when the export was deleted. Null if it wasn't. 
    /// </summary>
    /// <value>The timestamp of when the export was deleted. Null if it wasn't. </value>
    [DataMember(Name="deleted_timestamp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "deleted_timestamp")]
    public decimal? DeletedTimestamp { get; set; }

    /// <summary>
    /// The timestamp of when the export failed. Null if it didn't. 
    /// </summary>
    /// <value>The timestamp of when the export failed. Null if it didn't. </value>
    [DataMember(Name="failed_timestamp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "failed_timestamp")]
    public decimal? FailedTimestamp { get; set; }

    /// <summary>
    /// The URL of the export. `null` if there's no URL. 
    /// </summary>
    /// <value>The URL of the export. `null` if there's no URL. </value>
    [DataMember(Name="export_url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "export_url")]
    public string ExportUrl { get; set; }

    /// <summary>
    /// Whether the export is pending or not. 
    /// </summary>
    /// <value>Whether the export is pending or not. </value>
    [DataMember(Name="pending", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pending")]
    public bool? Pending { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class RealmExport {\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  ActingUserId: ").Append(ActingUserId).Append("\n");
      sb.Append("  ExportTime: ").Append(ExportTime).Append("\n");
      sb.Append("  DeletedTimestamp: ").Append(DeletedTimestamp).Append("\n");
      sb.Append("  FailedTimestamp: ").Append(FailedTimestamp).Append("\n");
      sb.Append("  ExportUrl: ").Append(ExportUrl).Append("\n");
      sb.Append("  Pending: ").Append(Pending).Append("\n");
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
