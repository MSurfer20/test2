namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.InvalidMessageErrorAllOf
open OpenAPI.Model.JsonSuccessBase

module InvalidMessageError = 

  //#region InvalidMessageError


  type InvalidMessageError = {
    Result : AnyType;
    Msg : AnyType;
    RawContent : string;
  }
  //#endregion
  