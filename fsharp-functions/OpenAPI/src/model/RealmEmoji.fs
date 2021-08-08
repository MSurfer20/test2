namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.int option

module RealmEmoji = 

  //#region RealmEmoji

  [<CLIMutable>]
  type RealmEmoji = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "source_url")>]
    SourceUrl : string;
    [<JsonProperty(PropertyName = "deactivated")>]
    Deactivated : bool;
    [<JsonProperty(PropertyName = "author_id")>]
    AuthorId : int option;
  }
  
  //#endregion
  