namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.BadEventQueueIdErrorAllOf
open OpenAPI.Model.CodedErrorBase

module BadEventQueueIdError = 

  //#region BadEventQueueIdError


  type BadEventQueueIdError = {
    Result : AnyType;
    Msg : AnyType;
    Code : AnyType;
    QueueId : string;
  }
  //#endregion
  