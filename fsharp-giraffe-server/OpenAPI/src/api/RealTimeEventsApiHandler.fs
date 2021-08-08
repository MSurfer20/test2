namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open RealTimeEventsApiHandlerParams
open RealTimeEventsApiServiceInterface
open RealTimeEventsApiServiceImplementation
open OpenAPI.Model.BadEventQueueIdError
open OpenAPI.Model.JsonSuccess
open OpenAPI.Model.JsonSuccessBase
open OpenAPI.Model.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError
open OpenAPI.Model.OneOfRateLimitedError
open OpenAPI.Model.OneOfUserDeactivatedErrorRealmDeactivatedError

module RealTimeEventsApiHandler = 

    /// <summary>
    /// 
    /// </summary>

    //#region DeleteQueue
    /// <summary>
    /// Delete an event queue
    /// </summary>

    let DeleteQueue  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<DeleteQueueQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : DeleteQueueArgs
          let result = RealTimeEventsApiService.DeleteQueue ctx serviceArgs
          return! (match result with 
                      | DeleteQueueStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeleteQueueStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetEvents
    /// <summary>
    /// Get events from an event queue
    /// </summary>

    let GetEvents  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetEventsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : GetEventsArgs
          let result = RealTimeEventsApiService.GetEvents ctx serviceArgs
          return! (match result with 
                      | GetEventsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetEventsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region RealTimePost
    /// <summary>
    /// 
    /// </summary>

    let RealTimePost  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<RealTimePostQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : RealTimePostArgs
          let result = RealTimeEventsApiService.RealTimePost ctx serviceArgs
          return! (match result with 
                      | RealTimePostStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region RegisterQueue
    /// <summary>
    /// Register an event queue
    /// </summary>

    let RegisterQueue  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<RegisterQueueQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : RegisterQueueArgs
          let result = RealTimeEventsApiService.RegisterQueue ctx serviceArgs
          return! (match result with 
                      | RegisterQueueStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region RestErrorHandling
    /// <summary>
    /// Error handling
    /// </summary>

    let RestErrorHandling  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = RealTimeEventsApiService.RestErrorHandling ctx 
          return! (match result with 
                      | RestErrorHandlingStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | RestErrorHandlingStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | RestErrorHandlingStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
          ) next ctx
        }
    //#endregion


    
