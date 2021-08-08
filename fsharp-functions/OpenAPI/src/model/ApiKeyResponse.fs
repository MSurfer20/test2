namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open OpenAPI.Model.ApiKeyResponseAllOf
open OpenAPI.Model.JsonSuccessBase

module ApiKeyResponse = 

  //#region ApiKeyResponse

  [<CLIMutable>]
  type ApiKeyResponse = {
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
  