namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.CodedError

module UserNotAuthorizedError = 

  //#region UserNotAuthorizedError


  type UserNotAuthorizedError = {
    Result : AnyType;
    Msg : AnyType;
    Code : AnyType;
  }
  //#endregion
  