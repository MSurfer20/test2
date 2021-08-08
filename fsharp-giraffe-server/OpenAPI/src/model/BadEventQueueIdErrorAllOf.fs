namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType

module BadEventQueueIdErrorAllOf = 

  //#region BadEventQueueIdErrorAllOf


  type BadEventQueueIdError_allOf = {
    Result : AnyType;
    Msg : AnyType;
    Code : AnyType;
    QueueId : string;
  }
  //#endregion
  