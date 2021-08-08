namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.int option
open OpenAPI.Model.string option
open System.Collections.Generic

module UserBase = 

  //#region UserBase

  //#region enums
  type RoleEnum = _100Enum of int  |  _200Enum of int  |  _300Enum of int  |  _400Enum of int  |  _600Enum of int  
  //#endregion

  type UserBase = {
    Email : string;
    IsBot : bool;
    AvatarUrl : string option;
    AvatarVersion : int;
    FullName : string;
    IsAdmin : bool;
    IsOwner : bool;
    IsBillingAdmin : bool;
    Role : RoleEnum;
    BotType : int option;
    UserId : int;
    BotOwnerId : int option;
    IsActive : bool;
    IsGuest : bool;
    Timezone : string;
    DateJoined : string;
    DeliveryEmail : string;
    ProfileData : IDictionary<string, obj>;
  }
  //#endregion
  