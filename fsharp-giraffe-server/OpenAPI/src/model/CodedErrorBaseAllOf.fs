namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType

module CodedErrorBaseAllOf = 

  //#region CodedErrorBaseAllOf


  type CodedErrorBase_allOf = {
    Result : AnyType;
    Msg : AnyType;
    Code : string;
  }
  //#endregion
  