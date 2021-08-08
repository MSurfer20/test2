namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MessagesBaseTopicLinks = 

  //#region MessagesBaseTopicLinks

  [<CLIMutable>]
  type MessagesBaseTopicLinks = {
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }
  
  //#endregion
  