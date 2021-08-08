namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType

module ApiKeyResponseAllOf = 

  //#region ApiKeyResponseAllOf

  [<CLIMutable>]
  type ApiKeyResponseAllOf = {
    [<JsonProperty(PropertyName = "result")>]
    Result : AnyType;
    [<JsonProperty(PropertyName = "msg")>]
    Msg : AnyType;
    [<JsonProperty(PropertyName = "api_key")>]
    ApiKey : string;
    [<JsonProperty(PropertyName = "email")>]
    Email : string;
  }
  
  //#endregion
  