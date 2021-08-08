namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AddSubscriptionsResponseAllOf
open OpenAPI.Model.AnyType
open OpenAPI.Model.JsonSuccessBase
open System.Collections.Generic

module AddSubscriptionsResponse = 

  //#region AddSubscriptionsResponse


  type AddSubscriptionsResponse = {
    Result : AnyType;
    Msg : AnyType;
    Subscribed : IDictionary<string, string[]>;
    AlreadySubscribed : IDictionary<string, string[]>;
    Unauthorized : string[];
  }
  //#endregion
  