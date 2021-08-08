namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module JsonSuccessBaseAllOf = 

  //#region JsonSuccessBaseAllOf

  [<CLIMutable>]
  type JsonSuccessBaseAllOf = {
    [<JsonProperty(PropertyName = "result")>]
    Result : string;
    [<JsonProperty(PropertyName = "msg")>]
    Msg : string;
  }
  
  //#endregion
  