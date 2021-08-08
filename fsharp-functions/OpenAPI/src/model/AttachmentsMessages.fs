namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AttachmentsMessages = 

  //#region AttachmentsMessages

  [<CLIMutable>]
  type AttachmentsMessages = {
    [<JsonProperty(PropertyName = "date_sent")>]
    DateSent : int;
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
  }
  
  //#endregion
  