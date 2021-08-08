namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AttachmentsMessages

module Attachments = 

  //#region Attachments

  [<CLIMutable>]
  type Attachments = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "path_id")>]
    PathId : string;
    [<JsonProperty(PropertyName = "size")>]
    Size : int;
    [<JsonProperty(PropertyName = "create_time")>]
    CreateTime : int;
    [<JsonProperty(PropertyName = "messages")>]
    Messages : AttachmentsMessages[];
  }
  
  //#endregion
  