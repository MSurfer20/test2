namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType

module GetMessagesAllOf = 

  //#region GetMessagesAllOf

  [<CLIMutable>]
  type GetMessagesAllOf = {
    [<JsonProperty(PropertyName = "avatar_url")>]
    AvatarUrl : AnyType;
    [<JsonProperty(PropertyName = "client")>]
    Client : AnyType;
    [<JsonProperty(PropertyName = "content")>]
    Content : AnyType;
    [<JsonProperty(PropertyName = "content_type")>]
    ContentType : AnyType;
    [<JsonProperty(PropertyName = "display_recipient")>]
    DisplayRecipient : AnyType;
    [<JsonProperty(PropertyName = "id")>]
    Id : AnyType;
    [<JsonProperty(PropertyName = "is_me_message")>]
    IsMeMessage : AnyType;
    [<JsonProperty(PropertyName = "reactions")>]
    Reactions : AnyType;
    [<JsonProperty(PropertyName = "recipient_id")>]
    RecipientId : AnyType;
    [<JsonProperty(PropertyName = "sender_email")>]
    SenderEmail : AnyType;
    [<JsonProperty(PropertyName = "sender_full_name")>]
    SenderFullName : AnyType;
    [<JsonProperty(PropertyName = "sender_id")>]
    SenderId : AnyType;
    [<JsonProperty(PropertyName = "sender_realm_str")>]
    SenderRealmStr : AnyType;
    [<JsonProperty(PropertyName = "stream_id")>]
    StreamId : AnyType;
    [<JsonProperty(PropertyName = "subject")>]
    Subject : AnyType;
    [<JsonProperty(PropertyName = "topic_links")>]
    TopicLinks : AnyType;
    [<JsonProperty(PropertyName = "submessages")>]
    Submessages : AnyType;
    [<JsonProperty(PropertyName = "timestamp")>]
    Timestamp : AnyType;
    [<JsonProperty(PropertyName = "type")>]
    Type : AnyType;
    [<JsonProperty(PropertyName = "flags")>]
    Flags : string[];
    [<JsonProperty(PropertyName = "last_edit_timestamp")>]
    LastEditTimestamp : int;
    [<JsonProperty(PropertyName = "match_content")>]
    MatchContent : string;
    [<JsonProperty(PropertyName = "match_subject")>]
    MatchSubject : string;
  }
  
  //#endregion
  