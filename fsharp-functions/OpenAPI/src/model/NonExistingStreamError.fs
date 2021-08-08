namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open OpenAPI.Model.CodedErrorBase
open OpenAPI.Model.NonExistingStreamErrorAllOf

module NonExistingStreamError = 

  //#region NonExistingStreamError

  [<CLIMutable>]
  type NonExistingStreamError = {
    [<JsonProperty(PropertyName = "result")>]
    Result : AnyType;
    [<JsonProperty(PropertyName = "msg")>]
    Msg : AnyType;
    [<JsonProperty(PropertyName = "code")>]
    Code : AnyType;
    [<JsonProperty(PropertyName = "stream")>]
    Stream : string;
  }
  
  //#endregion
  