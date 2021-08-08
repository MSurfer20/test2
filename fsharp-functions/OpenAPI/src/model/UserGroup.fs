namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module UserGroup = 

  //#region UserGroup

  [<CLIMutable>]
  type UserGroup = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "members")>]
    Members : int[];
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
  }
  
  //#endregion
  