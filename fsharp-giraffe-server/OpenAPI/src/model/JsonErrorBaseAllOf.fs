namespace OpenAPI.Model

open System
open System.Collections.Generic

module JsonErrorBaseAllOf = 

  //#region JsonErrorBaseAllOf

  //#region enums
  type ResultEnum = ErrorEnum of string  
  //#endregion

  type JsonErrorBase_allOf = {
    Result : ResultEnum;
    Msg : string;
  }
  //#endregion
  