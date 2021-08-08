namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open AuthenticationApiHandlerParams
open AuthenticationApiServiceInterface
open AuthenticationApiServiceImplementation
open OpenAPI.Model.ApiKeyResponse

module AuthenticationApiHandler = 

    /// <summary>
    /// 
    /// </summary>

    //#region DevFetchApiKey
    /// <summary>
    /// Fetch an API key (development only)
    /// </summary>

    let DevFetchApiKey  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<DevFetchApiKeyQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : DevFetchApiKeyArgs
          let result = AuthenticationApiService.DevFetchApiKey ctx serviceArgs
          return! (match result with 
                      | DevFetchApiKeyStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region FetchApiKey
    /// <summary>
    /// Fetch an API key (production)
    /// </summary>

    let FetchApiKey  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<FetchApiKeyQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : FetchApiKeyArgs
          let result = AuthenticationApiService.FetchApiKey ctx serviceArgs
          return! (match result with 
                      | FetchApiKeyStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion


    
