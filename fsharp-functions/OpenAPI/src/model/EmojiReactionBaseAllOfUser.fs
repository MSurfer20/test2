namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module EmojiReactionBaseAllOfUser = 

  //#region EmojiReactionBaseAllOfUser

  [<CLIMutable>]
  type EmojiReactionBaseAllOfUser = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "email")>]
    Email : string;
    [<JsonProperty(PropertyName = "full_name")>]
    FullName : string;
    [<JsonProperty(PropertyName = "is_mirror_dummy")>]
    IsMirrorDummy : bool;
  }
  
  //#endregion
  