namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AddSubscriptionsResponseAllOf
open OpenAPI.Model.AnyType
open OpenAPI.Model.JsonSuccessBase
open System.Collections.Generic

module AddSubscriptionsResponse = 

  //#region AddSubscriptionsResponse

  [<CLIMutable>]
  type AddSubscriptionsResponse = {
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
  