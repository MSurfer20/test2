namespace OpenAPI

open WebhooksApiHandlerParams
open WebhooksApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module WebhooksApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region ZulipOutgoingWebhooks
    /// <summary>
    /// Outgoing webhooks
    /// </summary>
   [<FunctionName("ZulipOutgoingWebhooks")>]
    let ZulipOutgoingWebhooks
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/zulip-outgoing-webhook")>]
        req:HttpRequest ) =
      
      let result = WebhooksApiService.ZulipOutgoingWebhooks ()
      match result with 
      | ZulipOutgoingWebhooksStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 


      

