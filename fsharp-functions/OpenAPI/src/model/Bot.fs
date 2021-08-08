namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open OpenAPI.Model.BasicBotBase
open OpenAPI.Model.BotAllOf
open OpenAPI.Model.int option

module Bot = 

  //#region Bot

  [<CLIMutable>]
  type Bot = {
    [<JsonProperty(PropertyName = "user_id")>]
    UserId : AnyType;
    [<JsonProperty(PropertyName = "full_name")>]
    FullName : AnyType;
    [<JsonProperty(PropertyName = "api_key")>]
    ApiKey : AnyType;
    [<JsonProperty(PropertyName = "default_sending_stream")>]
    DefaultSendingStream : AnyType;
    [<JsonProperty(PropertyName = "default_events_register_stream")>]
    DefaultEventsRegisterStream : AnyType;
    [<JsonProperty(PropertyName = "default_all_public_streams")>]
    DefaultAllPublicStreams : AnyType;
    [<JsonProperty(PropertyName = "avatar_url")>]
    AvatarUrl : AnyType;
    [<JsonProperty(PropertyName = "owner_id")>]
    OwnerId : AnyType;
    [<JsonProperty(PropertyName = "services")>]
    Services : AnyType;
    [<JsonProperty(PropertyName = "email")>]
    Email : string;
    [<JsonProperty(PropertyName = "bot_type")>]
    BotType : int option;
    [<JsonProperty(PropertyName = "is_active")>]
    IsActive : bool;
  }
  
  //#endregion
  