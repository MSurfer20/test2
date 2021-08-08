namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.JsonResponseBase
open OpenAPI.Model.JsonSuccessBaseAllOf

module JsonSuccessBase = 

  //#region JsonSuccessBase

  [<CLIMutable>]
  type JsonSuccessBase = {
    [<JsonProperty(PropertyName = "result")>]
    Result : string;
    [<JsonProperty(PropertyName = "msg")>]
    Msg : string;
  }
  
  //#endregion
  