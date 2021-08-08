namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open OpenAPI.Model.BadEventQueueIdErrorAllOf
open OpenAPI.Model.CodedErrorBase

module BadEventQueueIdError = 

  //#region BadEventQueueIdError

  [<CLIMutable>]
  type BadEventQueueIdError = {
    [<JsonProperty(PropertyName = "result")>]
    Result : AnyType;
    [<JsonProperty(PropertyName = "msg")>]
    Msg : AnyType;
    [<JsonProperty(PropertyName = "code")>]
    Code : AnyType;
    [<JsonProperty(PropertyName = "queue_id")>]
    QueueId : string;
  }
  
  //#endregion
  