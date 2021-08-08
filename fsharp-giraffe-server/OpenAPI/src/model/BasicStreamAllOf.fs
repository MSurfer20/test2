namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType

module BasicStreamAllOf = 

  //#region BasicStreamAllOf


  type BasicStream_allOf = {
    StreamId : AnyType;
    Name : AnyType;
    Description : AnyType;
    DateCreated : AnyType;
    InviteOnly : AnyType;
    RenderedDescription : AnyType;
    IsWebPublic : AnyType;
    StreamPostPolicy : AnyType;
    MessageRetentionDays : AnyType;
    HistoryPublicToSubscribers : AnyType;
    FirstMessageId : AnyType;
    IsAnnouncementOnly : AnyType;
  }
  //#endregion
  