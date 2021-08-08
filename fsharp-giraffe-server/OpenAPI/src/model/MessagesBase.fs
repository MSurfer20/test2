namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EmojiReaction
open OpenAPI.Model.MessagesBaseTopicLinks
open OpenAPI.Model.OneOfstringarray
open OpenAPI.Model.string option

module MessagesBase = 

  //#region MessagesBase


  type MessagesBase = {
    AvatarUrl : string option;
    Client : string;
    Content : string;
    ContentType : string;
    DisplayRecipient : OneOfstringarray;
    Id : int;
    IsMeMessage : bool;
    Reactions : EmojiReaction[];
    RecipientId : int;
    SenderEmail : string;
    SenderFullName : string;
    SenderId : int;
    SenderRealmStr : string;
    StreamId : int;
    Subject : string;
    TopicLinks : MessagesBaseTopicLinks[];
    Submessages : string[];
    Timestamp : int;
    Type : string;
  }
  //#endregion
  