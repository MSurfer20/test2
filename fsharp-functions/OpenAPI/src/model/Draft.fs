namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module Draft = 

  //#region Draft

  [<CLIMutable>]
  type Draft = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "to")>]
    To : int[];
    [<JsonProperty(PropertyName = "topic")>]
    Topic : string;
    [<JsonProperty(PropertyName = "content")>]
    Content : string;
    [<JsonProperty(PropertyName = "timestamp")>]
    Timestamp : decimal;
  }
  
  //#endregion
  