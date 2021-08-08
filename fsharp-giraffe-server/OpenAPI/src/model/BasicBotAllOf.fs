namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType

module BasicBotAllOf = 

  //#region BasicBotAllOf


  type BasicBot_allOf = {
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
  