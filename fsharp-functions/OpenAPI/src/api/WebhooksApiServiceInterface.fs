namespace OpenAPI
open WebhooksApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module WebhooksApiServiceInterface =
    
    //#region Service interface
    type IWebhooksApiService = 
      abstract member ZulipOutgoingWebhooks : unit -> ZulipOutgoingWebhooksResult
    //#endregion