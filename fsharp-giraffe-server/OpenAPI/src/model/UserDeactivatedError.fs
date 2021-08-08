namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.CodedError

module UserDeactivatedError = 

  //#region UserDeactivatedError


  type UserDeactivatedError = {
    Result : AnyType;
    Msg : AnyType;
    Code : AnyType;
  }
  //#endregion
  