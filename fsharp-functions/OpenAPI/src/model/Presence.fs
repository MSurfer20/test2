namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module Presence = 

  //#region Presence

  [<CLIMutable>]
  type Presence = {
    [<JsonProperty(PropertyName = "client")>]
    Client : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "timestamp")>]
    Timestamp : int;
    [<JsonProperty(PropertyName = "pushable")>]
    Pushable : bool;
  }
  
  //#endregion
  