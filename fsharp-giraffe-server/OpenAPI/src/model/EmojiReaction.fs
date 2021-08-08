namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.EmojiReactionAllOf
open OpenAPI.Model.EmojiReactionBase

module EmojiReaction = 

  //#region EmojiReaction


  type EmojiReaction = {
    EmojiCode : AnyType;
    EmojiName : AnyType;
    ReactionType : AnyType;
    UserId : AnyType;
    User : AnyType;
  }
  //#endregion
  