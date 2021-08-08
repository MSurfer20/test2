namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType

module CodedErrorBaseAllOf = 

  //#region CodedErrorBaseAllOf

  [<CLIMutable>]
  type CodedErrorBaseAllOf = {
    [<JsonProperty(PropertyName = "result")>]
    Result : AnyType;
    [<JsonProperty(PropertyName = "msg")>]
    Msg : AnyType;
    [<JsonProperty(PropertyName = "code")>]
    Code : string;
  }
  
  //#endregion
  