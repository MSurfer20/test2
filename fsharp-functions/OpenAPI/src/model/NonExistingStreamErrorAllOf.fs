namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType

module NonExistingStreamErrorAllOf = 

  //#region NonExistingStreamErrorAllOf

  [<CLIMutable>]
  type NonExistingStreamErrorAllOf = {
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
  