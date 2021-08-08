namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.CodedErrorBase
open OpenAPI.Model.NonExistingStreamErrorAllOf

module NonExistingStreamError = 

  //#region NonExistingStreamError


  type NonExistingStreamError = {
    Result : AnyType;
    Msg : AnyType;
    Code : AnyType;
    Stream : string;
  }
  //#endregion
  