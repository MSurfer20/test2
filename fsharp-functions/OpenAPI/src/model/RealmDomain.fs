namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealmDomain = 

  //#region RealmDomain

  [<CLIMutable>]
  type RealmDomain = {
    [<JsonProperty(PropertyName = "domain")>]
    Domain : string;
    [<JsonProperty(PropertyName = "allow_subdomains")>]
    AllowSubdomains : bool;
  }
  
  //#endregion
  