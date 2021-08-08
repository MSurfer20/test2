namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.bool option
open OpenAPI.Model.int option

module Subscriptions = 

  //#region Subscriptions

  [<CLIMutable>]
  type Subscriptions = {
    [<JsonProperty(PropertyName = "stream_id")>]
    StreamId : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "rendered_description")>]
    RenderedDescription : string;
    [<JsonProperty(PropertyName = "date_created")>]
    DateCreated : int;
    [<JsonProperty(PropertyName = "invite_only")>]
    InviteOnly : bool;
    [<JsonProperty(PropertyName = "subscribers")>]
    Subscribers : int[];
    [<JsonProperty(PropertyName = "desktop_notifications")>]
    DesktopNotifications : bool option;
    [<JsonProperty(PropertyName = "email_notifications")>]
    EmailNotifications : bool option;
    [<JsonProperty(PropertyName = "wildcard_mentions_notify")>]
    WildcardMentionsNotify : bool option;
    [<JsonProperty(PropertyName = "push_notifications")>]
    PushNotifications : bool option;
    [<JsonProperty(PropertyName = "audible_notifications")>]
    AudibleNotifications : bool option;
    [<JsonProperty(PropertyName = "pin_to_top")>]
    PinToTop : bool;
    [<JsonProperty(PropertyName = "email_address")>]
    EmailAddress : string;
    [<JsonProperty(PropertyName = "is_muted")>]
    IsMuted : bool;
    [<JsonProperty(PropertyName = "in_home_view")>]
    InHomeView : bool;
    [<JsonProperty(PropertyName = "is_announcement_only")>]
    IsAnnouncementOnly : bool;
    [<JsonProperty(PropertyName = "is_web_public")>]
    IsWebPublic : bool;
    [<JsonProperty(PropertyName = "role")>]
    Role : int;
    [<JsonProperty(PropertyName = "color")>]
    Color : string;
    [<JsonProperty(PropertyName = "stream_post_policy")>]
    StreamPostPolicy : int;
    [<JsonProperty(PropertyName = "message_retention_days")>]
    MessageRetentionDays : int option;
    [<JsonProperty(PropertyName = "history_public_to_subscribers")>]
    HistoryPublicToSubscribers : bool;
    [<JsonProperty(PropertyName = "first_message_id")>]
    FirstMessageId : int option;
    [<JsonProperty(PropertyName = "stream_weekly_traffic")>]
    StreamWeeklyTraffic : int option;
  }
  
  //#endregion
  