namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EmojiReactionBaseAllOfUser

module EmojiReactionBaseAllOf = 

  //#region EmojiReactionBaseAllOf

  [<CLIMutable>]
  type EmojiReactionBaseAllOf = {
    [<JsonProperty(PropertyName = "user_id")>]
    UserId : int;
    [<JsonProperty(PropertyName = "user")>]
    User : EmojiReactionBaseAllOfUser;
  }
  
  //#endregion
  