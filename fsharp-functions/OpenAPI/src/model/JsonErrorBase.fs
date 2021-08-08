namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.JsonErrorBaseAllOf
open OpenAPI.Model.JsonResponseBase

module JsonErrorBase = 

  //#region JsonErrorBase

  [<CLIMutable>]
  type JsonErrorBase = {
    [<JsonProperty(PropertyName = "result")>]
    Result : string;
    [<JsonProperty(PropertyName = "msg")>]
    Msg : string;
  }
  
  //#endregion
  