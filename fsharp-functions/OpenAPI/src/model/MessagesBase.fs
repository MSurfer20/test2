namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EmojiReaction
open OpenAPI.Model.MessagesBaseTopicLinks
open OpenAPI.Model.OneOfstringarray
open OpenAPI.Model.string option

module MessagesBase = 

  //#region MessagesBase

  [<CLIMutable>]
  type MessagesBase = {
    [<JsonProperty(PropertyName = "avatar_url")>]
    AvatarUrl : string option;
    [<JsonProperty(PropertyName = "client")>]
    Client : string;
    [<JsonProperty(PropertyName = "content")>]
    Content : string;
    [<JsonProperty(PropertyName = "content_type")>]
    ContentType : string;
    [<JsonProperty(PropertyName = "display_recipient")>]
    DisplayRecipient : OneOfstringarray;
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "is_me_message")>]
    IsMeMessage : bool;
    [<JsonProperty(PropertyName = "reactions")>]
    Reactions : EmojiReaction[];
    [<JsonProperty(PropertyName = "recipient_id")>]
    RecipientId : int;
    [<JsonProperty(PropertyName = "sender_email")>]
    SenderEmail : string;
    [<JsonProperty(PropertyName = "sender_full_name")>]
    SenderFullName : string;
    [<JsonProperty(PropertyName = "sender_id")>]
    SenderId : int;
    [<JsonProperty(PropertyName = "sender_realm_str")>]
    SenderRealmStr : string;
    [<JsonProperty(PropertyName = "stream_id")>]
    StreamId : int;
    [<JsonProperty(PropertyName = "subject")>]
    Subject : string;
    [<JsonProperty(PropertyName = "topic_links")>]
    TopicLinks : MessagesBaseTopicLinks[];
    [<JsonProperty(PropertyName = "submessages")>]
    Submessages : string[];
    [<JsonProperty(PropertyName = "timestamp")>]
    Timestamp : int;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }
  
  //#endregion
  