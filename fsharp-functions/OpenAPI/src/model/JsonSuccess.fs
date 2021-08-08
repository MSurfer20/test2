namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open OpenAPI.Model.JsonSuccessAllOf
open OpenAPI.Model.JsonSuccessBase

module JsonSuccess = 

  //#region JsonSuccess

  [<CLIMutable>]
  type JsonSuccess = {
    [<JsonProperty(PropertyName = "result")>]
    Result : AnyType;
    [<JsonProperty(PropertyName = "msg")>]
    Msg : AnyType;
  }
  
  //#endregion
  