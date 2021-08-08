namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module JsonResponseBase = 

  //#region JsonResponseBase

  [<CLIMutable>]
  type JsonResponseBase = {
    [<JsonProperty(PropertyName = "result")>]
    Result : string;
  }
  
  //#endregion
  