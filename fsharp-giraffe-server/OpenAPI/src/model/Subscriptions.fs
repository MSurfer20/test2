namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.bool option
open OpenAPI.Model.int option

module Subscriptions = 

  //#region Subscriptions

  //#region enums
  type RoleEnum = _20Enum of int  |  _50Enum of int  
  //#endregion

  type Subscriptions = {
    StreamId : int;
    Name : string;
    Description : string;
    RenderedDescription : string;
    DateCreated : int;
    InviteOnly : bool;
    Subscribers : int[];
    DesktopNotifications : bool option;
    EmailNotifications : bool option;
    WildcardMentionsNotify : bool option;
    PushNotifications : bool option;
    AudibleNotifications : bool option;
    PinToTop : bool;
    EmailAddress : string;
    IsMuted : bool;
    InHomeView : bool;
    IsAnnouncementOnly : bool;
    IsWebPublic : bool;
    Role : RoleEnum;
    Color : string;
    StreamPostPolicy : int;
    MessageRetentionDays : int option;
    HistoryPublicToSubscribers : bool;
    FirstMessageId : int option;
    StreamWeeklyTraffic : int option;
  }
  //#endregion
  