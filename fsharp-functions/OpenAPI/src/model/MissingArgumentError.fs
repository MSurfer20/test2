namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open OpenAPI.Model.CodedErrorBase
open OpenAPI.Model.MissingArgumentErrorAllOf

module MissingArgumentError = 

  //#region MissingArgumentError

  [<CLIMutable>]
  type MissingArgumentError = {
    [<JsonProperty(PropertyName = "result")>]
    Result : AnyType;
    [<JsonProperty(PropertyName = "msg")>]
    Msg : AnyType;
    [<JsonProperty(PropertyName = "code")>]
    Code : AnyType;
    [<JsonProperty(PropertyName = "var_name")>]
    VarName : string;
  }
  
  //#endregion
  