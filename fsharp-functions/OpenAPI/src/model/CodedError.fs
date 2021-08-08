namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open OpenAPI.Model.CodedErrorAllOf
open OpenAPI.Model.CodedErrorBase

module CodedError = 

  //#region CodedError

  [<CLIMutable>]
  type CodedError = {
    [<JsonProperty(PropertyName = "result")>]
    Result : AnyType;
    [<JsonProperty(PropertyName = "msg")>]
    Msg : AnyType;
    [<JsonProperty(PropertyName = "code")>]
    Code : AnyType;
  }
  
  //#endregion
  