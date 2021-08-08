namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.CodedError

module RealmDeactivatedError = 

  //#region RealmDeactivatedError


  type RealmDeactivatedError = {
    Result : AnyType;
    Msg : AnyType;
    Code : AnyType;
  }
  //#endregion
  