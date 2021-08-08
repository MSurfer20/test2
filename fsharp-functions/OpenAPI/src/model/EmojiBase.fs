namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module EmojiBase = 

  //#region EmojiBase

  [<CLIMutable>]
  type EmojiBase = {
    [<JsonProperty(PropertyName = "emoji_code")>]
    EmojiCode : string;
    [<JsonProperty(PropertyName = "emoji_name")>]
    EmojiName : string;
    [<JsonProperty(PropertyName = "reaction_type")>]
    ReactionType : string;
  }
  
  //#endregion
  