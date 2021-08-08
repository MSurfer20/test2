namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.JsonResponseBase
open OpenAPI.Model.JsonSuccessBaseAllOf

module JsonSuccessBase = 

  //#region JsonSuccessBase

  //#region enums
  type ResultEnum = SuccessEnum of string  
  //#endregion

  type JsonSuccessBase = {
    Result : ResultEnum;
    Msg : string;
  }
  //#endregion
  