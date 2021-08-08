namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open OpenAPI.Model.EmojiReactionAllOf
open OpenAPI.Model.EmojiReactionBase

module EmojiReaction = 

  //#region EmojiReaction

  [<CLIMutable>]
  type EmojiReaction = {
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
  