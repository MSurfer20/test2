namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.int option

module BasicStreamBase = 

  //#region BasicStreamBase

  [<CLIMutable>]
  type BasicStreamBase = {
    [<JsonProperty(PropertyName = "stream_id")>]
    StreamId : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "date_created")>]
    DateCreated : int;
    [<JsonProperty(PropertyName = "invite_only")>]
    InviteOnly : bool;
    [<JsonProperty(PropertyName = "rendered_description")>]
    RenderedDescription : string;
    [<JsonProperty(PropertyName = "is_web_public")>]
    IsWebPublic : bool;
    [<JsonProperty(PropertyName = "stream_post_policy")>]
    StreamPostPolicy : int;
    [<JsonProperty(PropertyName = "message_retention_days")>]
    MessageRetentionDays : int option;
    [<JsonProperty(PropertyName = "history_public_to_subscribers")>]
    HistoryPublicToSubscribers : bool;
    [<JsonProperty(PropertyName = "first_message_id")>]
    FirstMessageId : int option;
    [<JsonProperty(PropertyName = "is_announcement_only")>]
    IsAnnouncementOnly : bool;
  }
  
  //#endregion
  