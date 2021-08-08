namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EmojiBase
open OpenAPI.Model.EmojiReactionBaseAllOf
open OpenAPI.Model.EmojiReactionBaseAllOfUser

module EmojiReactionBase = 

  //#region EmojiReactionBase


  type EmojiReactionBase = {
    EmojiCode : string;
    EmojiName : string;
    ReactionType : string;
    UserId : int;
    User : EmojiReactionBaseAllOfUser;
  }
  //#endregion
  