namespace OpenAPI.Model

open System
open System.Collections.Generic

module JsonSuccessBaseAllOf = 

  //#region JsonSuccessBaseAllOf

  //#region enums
  type ResultEnum = SuccessEnum of string  
  //#endregion

  type JsonSuccessBase_allOf = {
    Result : ResultEnum;
    Msg : string;
  }
  //#endregion
  