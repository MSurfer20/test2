namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.JsonSuccessAllOf
open OpenAPI.Model.JsonSuccessBase

module JsonSuccess = 

  //#region JsonSuccess


  type JsonSuccess = {
    Result : AnyType;
    Msg : AnyType;
  }
  //#endregion
  