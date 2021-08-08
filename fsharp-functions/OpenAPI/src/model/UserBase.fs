namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.int option
open OpenAPI.Model.string option
open System.Collections.Generic

module UserBase = 

  //#region UserBase

  [<CLIMutable>]
  type UserBase = {
    [<JsonProperty(PropertyName = "email")>]
    Email : string;
    [<JsonProperty(PropertyName = "is_bot")>]
    IsBot : bool;
    [<JsonProperty(PropertyName = "avatar_url")>]
    AvatarUrl : string option;
    [<JsonProperty(PropertyName = "avatar_version")>]
    AvatarVersion : int;
    [<JsonProperty(PropertyName = "full_name")>]
    FullName : string;
    [<JsonProperty(PropertyName = "is_admin")>]
    IsAdmin : bool;
    [<JsonProperty(PropertyName = "is_owner")>]
    IsOwner : bool;
    [<JsonProperty(PropertyName = "is_billing_admin")>]
    IsBillingAdmin : bool;
    [<JsonProperty(PropertyName = "role")>]
    Role : int;
    [<JsonProperty(PropertyName = "bot_type")>]
    BotType : int option;
    [<JsonProperty(PropertyName = "user_id")>]
    UserId : int;
    [<JsonProperty(PropertyName = "bot_owner_id")>]
    BotOwnerId : int option;
    [<JsonProperty(PropertyName = "is_active")>]
    IsActive : bool;
    [<JsonProperty(PropertyName = "is_guest")>]
    IsGuest : bool;
    [<JsonProperty(PropertyName = "timezone")>]
    Timezone : string;
    [<JsonProperty(PropertyName = "date_joined")>]
    DateJoined : string;
    [<JsonProperty(PropertyName = "delivery_email")>]
    DeliveryEmail : string;
    [<JsonProperty(PropertyName = "profile_data")>]
    ProfileData : IDictionary<string, obj>;
  }
  
  //#endregion
  