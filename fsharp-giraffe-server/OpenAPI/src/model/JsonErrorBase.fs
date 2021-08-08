namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.JsonErrorBaseAllOf
open OpenAPI.Model.JsonResponseBase

module JsonErrorBase = 

  //#region JsonErrorBase

  //#region enums
  type ResultEnum = ErrorEnum of string  
  //#endregion

  type JsonErrorBase = {
    Result : ResultEnum;
    Msg : string;
  }
  //#endregion
  