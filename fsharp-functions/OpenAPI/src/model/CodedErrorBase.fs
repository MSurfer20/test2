namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open OpenAPI.Model.CodedErrorBaseAllOf
open OpenAPI.Model.JsonErrorBase

module CodedErrorBase = 

  //#region CodedErrorBase

  [<CLIMutable>]
  type CodedErrorBase = {
    [<JsonProperty(PropertyName = "result")>]
    Result : AnyType;
    [<JsonProperty(PropertyName = "msg")>]
    Msg : AnyType;
    [<JsonProperty(PropertyName = "code")>]
    Code : string;
  }
  
  //#endregion
  