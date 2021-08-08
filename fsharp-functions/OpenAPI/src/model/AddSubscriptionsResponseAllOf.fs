namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open System.Collections.Generic

module AddSubscriptionsResponseAllOf = 

  //#region AddSubscriptionsResponseAllOf

  [<CLIMutable>]
  type AddSubscriptionsResponseAllOf = {
    [<JsonProperty(PropertyName = "result")>]
    Result : AnyType;
    [<JsonProperty(PropertyName = "msg")>]
    Msg : AnyType;
    [<JsonProperty(PropertyName = "subscribed")>]
    Subscribed : IDictionary<string, string[]>;
    [<JsonProperty(PropertyName = "already_subscribed")>]
    AlreadySubscribed : IDictionary<string, string[]>;
    [<JsonProperty(PropertyName = "unauthorized")>]
    Unauthorized : string[];
  }
  
  //#endregion
  