namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open OpenAPI.Model.JsonError

module InvalidApiKeyError = 

  //#region InvalidApiKeyError

  [<CLIMutable>]
  type InvalidApiKeyError = {
    [<JsonProperty(PropertyName = "result")>]
    Result : AnyType;
    [<JsonProperty(PropertyName = "msg")>]
    Msg : AnyType;
  }
  
  //#endregion
  