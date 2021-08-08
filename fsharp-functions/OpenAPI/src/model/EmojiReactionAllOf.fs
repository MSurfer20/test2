namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType

module EmojiReactionAllOf = 

  //#region EmojiReactionAllOf

  [<CLIMutable>]
  type EmojiReactionAllOf = {
    [<JsonProperty(PropertyName = "emoji_code")>]
    EmojiCode : AnyType;
    [<JsonProperty(PropertyName = "emoji_name")>]
    EmojiName : AnyType;
    [<JsonProperty(PropertyName = "reaction_type")>]
    ReactionType : AnyType;
    [<JsonProperty(PropertyName = "user_id")>]
    UserId : AnyType;
    [<JsonProperty(PropertyName = "user")>]
    User : AnyType;
  }
  
  //#endregion
  