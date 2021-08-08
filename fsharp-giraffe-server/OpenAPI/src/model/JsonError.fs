namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.JsonErrorBase
open OpenAPI.Model.JsonSuccessAllOf

module JsonError = 

  //#region JsonError


  type JsonError = {
    Result : AnyType;
    Msg : AnyType;
  }
  //#endregion
  