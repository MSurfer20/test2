namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType

module BasicStreamAllOf = 

  //#region BasicStreamAllOf

  [<CLIMutable>]
  type BasicStreamAllOf = {
    [<JsonProperty(PropertyName = "stream_id")>]
    StreamId : AnyType;
    [<JsonProperty(PropertyName = "name")>]
    Name : AnyType;
    [<JsonProperty(PropertyName = "description")>]
    Description : AnyType;
    [<JsonProperty(PropertyName = "date_created")>]
    DateCreated : AnyType;
    [<JsonProperty(PropertyName = "invite_only")>]
    InviteOnly : AnyType;
    [<JsonProperty(PropertyName = "rendered_description")>]
    RenderedDescription : AnyType;
    [<JsonProperty(PropertyName = "is_web_public")>]
    IsWebPublic : AnyType;
    [<JsonProperty(PropertyName = "stream_post_policy")>]
    StreamPostPolicy : AnyType;
    [<JsonProperty(PropertyName = "message_retention_days")>]
    MessageRetentionDays : AnyType;
    [<JsonProperty(PropertyName = "history_public_to_subscribers")>]
    HistoryPublicToSubscribers : AnyType;
    [<JsonProperty(PropertyName = "first_message_id")>]
    FirstMessageId : AnyType;
    [<JsonProperty(PropertyName = "is_announcement_only")>]
    IsAnnouncementOnly : AnyType;
  }
  
  //#endregion
  