namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.OneOfobjectobject
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module BasicBotBase = 

  //#region BasicBotBase


  type BasicBotBase = {
    UserId : int;
    FullName : string;
    ApiKey : string;
    DefaultSendingStream : string option;
    DefaultEventsRegisterStream : string option;
    DefaultAllPublicStreams : bool;
    AvatarUrl : string;
    OwnerId : int option;
    Services : OneOfobjectobject[];
  }
  //#endregion
  