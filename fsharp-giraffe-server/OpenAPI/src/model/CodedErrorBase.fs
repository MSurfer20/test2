namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.CodedErrorBaseAllOf
open OpenAPI.Model.JsonErrorBase

module CodedErrorBase = 

  //#region CodedErrorBase


  type CodedErrorBase = {
    Result : AnyType;
    Msg : AnyType;
    Code : string;
  }
  //#endregion
  