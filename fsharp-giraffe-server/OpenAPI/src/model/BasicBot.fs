namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.BasicBotAllOf
open OpenAPI.Model.BasicBotBase

module BasicBot = 

  //#region BasicBot


  type BasicBot = {
    UserId : AnyType;
    FullName : AnyType;
    ApiKey : AnyType;
    DefaultSendingStream : AnyType;
    DefaultEventsRegisterStream : AnyType;
    DefaultAllPublicStreams : AnyType;
    AvatarUrl : AnyType;
    OwnerId : AnyType;
    Services : AnyType;
  }
  //#endregion
  