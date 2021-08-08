namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.BasicStreamAllOf
open OpenAPI.Model.BasicStreamBase

module BasicStream = 

  //#region BasicStream


  type BasicStream = {
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
  