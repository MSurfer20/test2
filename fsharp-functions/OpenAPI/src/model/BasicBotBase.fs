namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OneOfobjectobject
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module BasicBotBase = 

  //#region BasicBotBase

  [<CLIMutable>]
  type BasicBotBase = {
    [<JsonProperty(PropertyName = "user_id")>]
    UserId : int;
    [<JsonProperty(PropertyName = "full_name")>]
    FullName : string;
    [<JsonProperty(PropertyName = "api_key")>]
    ApiKey : string;
    [<JsonProperty(PropertyName = "default_sending_stream")>]
    DefaultSendingStream : string option;
    [<JsonProperty(PropertyName = "default_events_register_stream")>]
    DefaultEventsRegisterStream : string option;
    [<JsonProperty(PropertyName = "default_all_public_streams")>]
    DefaultAllPublicStreams : bool;
    [<JsonProperty(PropertyName = "avatar_url")>]
    AvatarUrl : string;
    [<JsonProperty(PropertyName = "owner_id")>]
    OwnerId : int option;
    [<JsonProperty(PropertyName = "services")>]
    Services : OneOfobjectobject[];
  }
  
  //#endregion
  