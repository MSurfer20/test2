namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.JsonError

module InvalidApiKeyError = 

  //#region InvalidApiKeyError


  type InvalidApiKeyError = {
    Result : AnyType;
    Msg : AnyType;
  }
  //#endregion
  