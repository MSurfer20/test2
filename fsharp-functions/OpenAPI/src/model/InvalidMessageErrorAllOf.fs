namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType

module InvalidMessageErrorAllOf = 

  //#region InvalidMessageErrorAllOf

  [<CLIMutable>]
  type InvalidMessageErrorAllOf = {
    [<JsonProperty(PropertyName = "result")>]
    Result : AnyType;
    [<JsonProperty(PropertyName = "msg")>]
    Msg : AnyType;
    [<JsonProperty(PropertyName = "raw_content")>]
    RawContent : string;
  }
  
  //#endregion
  