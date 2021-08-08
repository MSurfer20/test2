namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.BasicBotBase
open OpenAPI.Model.BotAllOf
open OpenAPI.Model.int option

module Bot = 

  //#region Bot


  type Bot = {
    UserId : AnyType;
    FullName : AnyType;
    ApiKey : AnyType;
    DefaultSendingStream : AnyType;
    DefaultEventsRegisterStream : AnyType;
    DefaultAllPublicStreams : AnyType;
    AvatarUrl : AnyType;
    OwnerId : AnyType;
    Services : AnyType;
    Email : string;
    BotType : int option;
    IsActive : bool;
  }
  //#endregion
  