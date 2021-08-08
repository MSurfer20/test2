namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.GetMessagesAllOf
open OpenAPI.Model.MessagesBase

module GetMessages = 

  //#region GetMessages


  type GetMessages = {
    AvatarUrl : AnyType;
    Client : AnyType;
    Content : AnyType;
    ContentType : AnyType;
    DisplayRecipient : AnyType;
    Id : AnyType;
    IsMeMessage : AnyType;
    Reactions : AnyType;
    RecipientId : AnyType;
    SenderEmail : AnyType;
    SenderFullName : AnyType;
    SenderId : AnyType;
    SenderRealmStr : AnyType;
    StreamId : AnyType;
    Subject : AnyType;
    TopicLinks : AnyType;
    Submessages : AnyType;
    Timestamp : AnyType;
    Type : AnyType;
    Flags : string[];
    LastEditTimestamp : int;
    MatchContent : string;
    MatchSubject : string;
  }
  //#endregion
  