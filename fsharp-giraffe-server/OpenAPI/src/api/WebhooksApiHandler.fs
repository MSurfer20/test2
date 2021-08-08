namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open WebhooksApiHandlerParams
open WebhooksApiServiceInterface
open WebhooksApiServiceImplementation
open OpenAPI.Model.InlineResponse200

module WebhooksApiHandler = 

    /// <summary>
    /// 
    /// </summary>

    //#region ZulipOutgoingWebhooks
    /// <summary>
    /// Outgoing webhooks
    /// </summary>

    let ZulipOutgoingWebhooks  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = WebhooksApiService.ZulipOutgoingWebhooks ctx 
          return! (match result with 
                      | ZulipOutgoingWebhooksStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion


    
