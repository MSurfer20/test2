namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType

module BasicBotAllOf = 

  //#region BasicBotAllOf

  [<CLIMutable>]
  type BasicBotAllOf = {
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
  }
  
  //#endregion
  