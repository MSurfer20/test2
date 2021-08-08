namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType

module CodedErrorAllOf = 

  //#region CodedErrorAllOf

  [<CLIMutable>]
  type CodedErrorAllOf = {
    [<JsonProperty(PropertyName = "result")>]
    Result : AnyType;
    [<JsonProperty(PropertyName = "msg")>]
    Msg : AnyType;
    [<JsonProperty(PropertyName = "code")>]
    Code : AnyType;
  }
  
  //#endregion
  