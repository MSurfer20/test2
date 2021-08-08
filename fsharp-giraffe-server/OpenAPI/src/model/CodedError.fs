namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.CodedErrorAllOf
open OpenAPI.Model.CodedErrorBase

module CodedError = 

  //#region CodedError


  type CodedError = {
    Result : AnyType;
    Msg : AnyType;
    Code : AnyType;
  }
  //#endregion
  