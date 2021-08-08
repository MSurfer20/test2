namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RealmPlayground = 

  //#region RealmPlayground

  [<CLIMutable>]
  type RealmPlayground = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "pygments_language")>]
    PygmentsLanguage : string;
    [<JsonProperty(PropertyName = "url_prefix")>]
    UrlPrefix : string;
  }
  
  //#endregion
  