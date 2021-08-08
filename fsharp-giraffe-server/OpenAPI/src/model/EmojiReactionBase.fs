namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EmojiReactionBaseUser

module EmojiReactionBase = 

  //#region EmojiReactionBase


  type EmojiReactionBase = {
    EmojiCode : string;
    EmojiName : string;
    ReactionType : string;
    UserId : int;
    User : EmojiReactionBaseUser;
  }
  //#endregion
  