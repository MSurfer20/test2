namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.ApiKeyResponseAllOf
open OpenAPI.Model.JsonSuccessBase

module ApiKeyResponse = 

  //#region ApiKeyResponse


  type ApiKeyResponse = {
    Result : AnyType;
    Msg : AnyType;
    ApiKey : string;
    Email : string;
  }
  //#endregion
  