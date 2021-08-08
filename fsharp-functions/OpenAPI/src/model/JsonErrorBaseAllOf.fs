namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module JsonErrorBaseAllOf = 

  //#region JsonErrorBaseAllOf

  [<CLIMutable>]
  type JsonErrorBaseAllOf = {
    [<JsonProperty(PropertyName = "result")>]
    Result : string;
    [<JsonProperty(PropertyName = "msg")>]
    Msg : string;
  }
  
  //#endregion
  