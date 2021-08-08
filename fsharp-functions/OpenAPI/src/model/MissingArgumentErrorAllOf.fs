namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType

module MissingArgumentErrorAllOf = 

  //#region MissingArgumentErrorAllOf

  [<CLIMutable>]
  type MissingArgumentErrorAllOf = {
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
  