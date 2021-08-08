namespace OpenAPI
open OpenAPI.Model.InlineResponse200
open WebhooksApiHandlerParams
open WebhooksApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module WebhooksApiServiceImplementation =
    
    //#region Service implementation
    type WebhooksApiServiceImpl() = 
      interface IWebhooksApiService with
      
        member this.ZulipOutgoingWebhooks ctx  =
            let content = "Success " :> obj :?> InlineResponse200 // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ZulipOutgoingWebhooksStatusCode200 { content = content }

      //#endregion

    let WebhooksApiService = WebhooksApiServiceImpl() :> IWebhooksApiService