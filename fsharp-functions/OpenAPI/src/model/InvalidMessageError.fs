namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open OpenAPI.Model.InvalidMessageErrorAllOf
open OpenAPI.Model.JsonSuccessBase

module InvalidMessageError = 

  //#region InvalidMessageError

  [<CLIMutable>]
  type InvalidMessageError = {
    [<JsonProperty(PropertyName = "result")>]
    Result : AnyType;
    [<JsonProperty(PropertyName = "msg")>]
    Msg : AnyType;
    [<JsonProperty(PropertyName = "raw_content")>]
    RawContent : string;
  }
  
  //#endregion
  