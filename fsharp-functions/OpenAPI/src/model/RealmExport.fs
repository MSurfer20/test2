namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module RealmExport = 

  //#region RealmExport

  [<CLIMutable>]
  type RealmExport = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "acting_user_id")>]
    ActingUserId : int;
    [<JsonProperty(PropertyName = "export_time")>]
    ExportTime : decimal;
    [<JsonProperty(PropertyName = "deleted_timestamp")>]
    DeletedTimestamp : decimal option;
    [<JsonProperty(PropertyName = "failed_timestamp")>]
    FailedTimestamp : decimal option;
    [<JsonProperty(PropertyName = "export_url")>]
    ExportUrl : string option;
    [<JsonProperty(PropertyName = "pending")>]
    Pending : bool;
  }
  
  //#endregion
  