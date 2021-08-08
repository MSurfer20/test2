namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module Hotspot = 

  //#region Hotspot

  [<CLIMutable>]
  type Hotspot = {
    [<JsonProperty(PropertyName = "delay")>]
    Delay : decimal;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
  }
  
  //#endregion
  