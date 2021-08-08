namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.CodedError

module RateLimitedError = 

  //#region RateLimitedError


  type RateLimitedError = {
    Result : AnyType;
    Msg : AnyType;
    Code : AnyType;
  }
  //#endregion
  