namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BasicStream

module DefaultStreamGroup = 

  //#region DefaultStreamGroup

  [<CLIMutable>]
  type DefaultStreamGroup = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "streams")>]
    Streams : BasicStream[];
  }
  
  //#endregion
  