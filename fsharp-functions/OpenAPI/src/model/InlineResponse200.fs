namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessagesBase

module InlineResponse200 = 

  //#region InlineResponse200

  [<CLIMutable>]
  type InlineResponse200 = {
    [<JsonProperty(PropertyName = "bot_email")>]
    BotEmail : string;
    [<JsonProperty(PropertyName = "bot_full_name")>]
    BotFullName : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : string;
    [<JsonProperty(PropertyName = "trigger")>]
    Trigger : string;
    [<JsonProperty(PropertyName = "token")>]
    Token : string;
    [<JsonProperty(PropertyName = "message")>]
    Message : MessagesBase;
  }
  
  //#endregion
  