namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType

module MissingArgumentErrorAllOf = 

  //#region MissingArgumentErrorAllOf


  type MissingArgumentError_allOf = {
    Result : AnyType;
    Msg : AnyType;
    Code : AnyType;
    VarName : string;
  }
  //#endregion
  