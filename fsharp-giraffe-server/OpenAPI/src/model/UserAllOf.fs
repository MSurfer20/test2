namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType

module UserAllOf = 

  //#region UserAllOf


  type User_allOf = {
    Email : AnyType;
    IsBot : AnyType;
    AvatarUrl : AnyType;
    AvatarVersion : AnyType;
    FullName : AnyType;
    IsAdmin : AnyType;
    IsOwner : AnyType;
    IsBillingAdmin : AnyType;
    Role : AnyType;
    BotType : AnyType;
    UserId : AnyType;
    BotOwnerId : AnyType;
    IsActive : AnyType;
    IsGuest : AnyType;
    Timezone : AnyType;
    DateJoined : AnyType;
    DeliveryEmail : AnyType;
    ProfileData : AnyType;
  }
  //#endregion
  