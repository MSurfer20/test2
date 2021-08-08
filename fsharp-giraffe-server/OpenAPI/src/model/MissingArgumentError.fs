namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.CodedErrorBase
open OpenAPI.Model.MissingArgumentErrorAllOf

module MissingArgumentError = 

  //#region MissingArgumentError


  type MissingArgumentError = {
    Result : AnyType;
    Msg : AnyType;
    Code : AnyType;
    VarName : string;
  }
  //#endregion
  