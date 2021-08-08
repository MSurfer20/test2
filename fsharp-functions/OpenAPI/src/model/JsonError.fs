namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open OpenAPI.Model.JsonErrorBase
open OpenAPI.Model.JsonSuccessAllOf

module JsonError = 

  //#region JsonError

  [<CLIMutable>]
  type JsonError = {
    [<JsonProperty(PropertyName = "result")>]
    Result : AnyType;
    [<JsonProperty(PropertyName = "msg")>]
    Msg : AnyType;
  }
  
  //#endregion
  