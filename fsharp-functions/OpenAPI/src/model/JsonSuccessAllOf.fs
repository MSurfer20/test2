namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType

module JsonSuccessAllOf = 

  //#region JsonSuccessAllOf

  [<CLIMutable>]
  type JsonSuccessAllOf = {
    [<JsonProperty(PropertyName = "result")>]
    Result : AnyType;
    [<JsonProperty(PropertyName = "msg")>]
    Msg : AnyType;
  }
  
  //#endregion
  