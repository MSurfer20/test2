namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CustomProfileField = 

  //#region CustomProfileField

  [<CLIMutable>]
  type CustomProfileField = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "type")>]
    Type : int;
    [<JsonProperty(PropertyName = "order")>]
    Order : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "hint")>]
    Hint : string;
    [<JsonProperty(PropertyName = "field_data")>]
    FieldData : string;
  }
  
  //#endregion
  