namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EmojiBase
open OpenAPI.Model.EmojiReactionBaseAllOf
open OpenAPI.Model.EmojiReactionBaseAllOfUser

module EmojiReactionBase = 

  //#region EmojiReactionBase

  [<CLIMutable>]
  type EmojiReactionBase = {
    [<JsonProperty(PropertyName = "emoji_code")>]
    EmojiCode : string;
    [<JsonProperty(PropertyName = "emoji_name")>]
    EmojiName : string;
    [<JsonProperty(PropertyName = "reaction_type")>]
    ReactionType : string;
    [<JsonProperty(PropertyName = "user_id")>]
    UserId : int;
    [<JsonProperty(PropertyName = "user")>]
    User : EmojiReactionBaseAllOfUser;
  }
  
  //#endregion
  