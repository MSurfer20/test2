namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.int option

module BasicStreamBase = 

  //#region BasicStreamBase


  type BasicStreamBase = {
    StreamId : int;
    Name : string;
    Description : string;
    DateCreated : int;
    InviteOnly : bool;
    RenderedDescription : string;
    IsWebPublic : bool;
    StreamPostPolicy : int;
    MessageRetentionDays : int option;
    HistoryPublicToSubscribers : bool;
    FirstMessageId : int option;
    IsAnnouncementOnly : bool;
  }
  //#endregion
  