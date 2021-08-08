namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType

module UserAllOf = 

  //#region UserAllOf

  [<CLIMutable>]
  type UserAllOf = {
    [<JsonProperty(PropertyName = "email")>]
    Email : AnyType;
    [<JsonProperty(PropertyName = "is_bot")>]
    IsBot : AnyType;
    [<JsonProperty(PropertyName = "avatar_url")>]
    AvatarUrl : AnyType;
    [<JsonProperty(PropertyName = "avatar_version")>]
    AvatarVersion : AnyType;
    [<JsonProperty(PropertyName = "full_name")>]
    FullName : AnyType;
    [<JsonProperty(PropertyName = "is_admin")>]
    IsAdmin : AnyType;
    [<JsonProperty(PropertyName = "is_owner")>]
    IsOwner : AnyType;
    [<JsonProperty(PropertyName = "is_billing_admin")>]
    IsBillingAdmin : AnyType;
    [<JsonProperty(PropertyName = "role")>]
    Role : AnyType;
    [<JsonProperty(PropertyName = "bot_type")>]
    BotType : AnyType;
    [<JsonProperty(PropertyName = "user_id")>]
    UserId : AnyType;
    [<JsonProperty(PropertyName = "bot_owner_id")>]
    BotOwnerId : AnyType;
    [<JsonProperty(PropertyName = "is_active")>]
    IsActive : AnyType;
    [<JsonProperty(PropertyName = "is_guest")>]
    IsGuest : AnyType;
    [<JsonProperty(PropertyName = "timezone")>]
    Timezone : AnyType;
    [<JsonProperty(PropertyName = "date_joined")>]
    DateJoined : AnyType;
    [<JsonProperty(PropertyName = "delivery_email")>]
    DeliveryEmail : AnyType;
    [<JsonProperty(PropertyName = "profile_data")>]
    ProfileData : AnyType;
  }
  
  //#endregion
  