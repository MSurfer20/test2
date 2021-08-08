namespace OpenAPI
open WebhooksApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module WebhooksApiServiceInterface =
    
    //#region Service interface
    type IWebhooksApiService = 
      abstract member ZulipOutgoingWebhooks:HttpContext ->ZulipOutgoingWebhooksResult
    //#endregion