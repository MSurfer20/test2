namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open System.Collections.Generic

module AddSubscriptionsResponseAllOf = 

  //#region AddSubscriptionsResponseAllOf


  type AddSubscriptionsResponse_allOf = {
    Result : AnyType;
    Msg : AnyType;
    Subscribed : IDictionary<string, string[]>;
    AlreadySubscribed : IDictionary<string, string[]>;
    Unauthorized : string[];
  }
  //#endregion
  