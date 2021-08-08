namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open StreamsApiHandlerParams
open StreamsApiServiceInterface
open StreamsApiServiceImplementation
open OpenAPI.Model.CodedError
open OpenAPI.Model.JsonError
open OpenAPI.Model.JsonSuccess
open OpenAPI.Model.JsonSuccessBase
open OpenAPI.Model.NonExistingStreamError
open OpenAPI.Model.OneOfobjectobject
open OpenAPI.Model.OneOfstringinteger

module StreamsApiHandler = 

    /// <summary>
    /// 
    /// </summary>

    //#region ArchiveStream
    /// <summary>
    /// Archive a stream
    /// </summary>

    let ArchiveStream (pathParams:ArchiveStreamPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : ArchiveStreamArgs
          let result = StreamsApiService.ArchiveStream ctx serviceArgs
          return! (match result with 
                      | ArchiveStreamStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ArchiveStreamStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateBigBlueButtonVideoCall
    /// <summary>
    /// Create BigBlueButton video call
    /// </summary>

    let CreateBigBlueButtonVideoCall  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = StreamsApiService.CreateBigBlueButtonVideoCall ctx 
          return! (match result with 
                      | CreateBigBlueButtonVideoCallStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetStreamId
    /// <summary>
    /// Get stream ID
    /// </summary>

    let GetStreamId  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetStreamIdQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : GetStreamIdArgs
          let result = StreamsApiService.GetStreamId ctx serviceArgs
          return! (match result with 
                      | GetStreamIdStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetStreamIdStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetStreamTopics
    /// <summary>
    /// Get topics in a stream
    /// </summary>

    let GetStreamTopics (pathParams:GetStreamTopicsPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetStreamTopicsArgs
          let result = StreamsApiService.GetStreamTopics ctx serviceArgs
          return! (match result with 
                      | GetStreamTopicsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetStreamTopicsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetStreams
    /// <summary>
    /// Get all streams
    /// </summary>

    let GetStreams  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetStreamsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : GetStreamsArgs
          let result = StreamsApiService.GetStreams ctx serviceArgs
          return! (match result with 
                      | GetStreamsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetStreamsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetSubscriptionStatus
    /// <summary>
    /// Get subscription status
    /// </summary>

    let GetSubscriptionStatus (pathParams:GetSubscriptionStatusPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetSubscriptionStatusArgs
          let result = StreamsApiService.GetSubscriptionStatus ctx serviceArgs
          return! (match result with 
                      | GetSubscriptionStatusStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetSubscriptions
    /// <summary>
    /// Get subscribed streams
    /// </summary>

    let GetSubscriptions  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetSubscriptionsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : GetSubscriptionsArgs
          let result = StreamsApiService.GetSubscriptions ctx serviceArgs
          return! (match result with 
                      | GetSubscriptionsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region MuteTopic
    /// <summary>
    /// Topic muting
    /// </summary>

    let MuteTopic  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<MuteTopicQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : MuteTopicArgs
          let result = StreamsApiService.MuteTopic ctx serviceArgs
          return! (match result with 
                      | MuteTopicStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | MuteTopicStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region Subscribe
    /// <summary>
    /// Subscribe to a stream
    /// </summary>

    let Subscribe  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<SubscribeQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : SubscribeArgs
          let result = StreamsApiService.Subscribe ctx serviceArgs
          return! (match result with 
                      | SubscribeStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SubscribeStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region Unsubscribe
    /// <summary>
    /// Unsubscribe from a stream
    /// </summary>

    let Unsubscribe  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UnsubscribeQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : UnsubscribeArgs
          let result = StreamsApiService.Unsubscribe ctx serviceArgs
          return! (match result with 
                      | UnsubscribeStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UnsubscribeStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateStream
    /// <summary>
    /// Update a stream
    /// </summary>

    let UpdateStream (pathParams:UpdateStreamPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UpdateStreamQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : UpdateStreamArgs
          let result = StreamsApiService.UpdateStream ctx serviceArgs
          return! (match result with 
                      | UpdateStreamStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateStreamStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateSubscriptionSettings
    /// <summary>
    /// Update subscription settings
    /// </summary>

    let UpdateSubscriptionSettings  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UpdateSubscriptionSettingsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : UpdateSubscriptionSettingsArgs
          let result = StreamsApiService.UpdateSubscriptionSettings ctx serviceArgs
          return! (match result with 
                      | UpdateSubscriptionSettingsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateSubscriptions
    /// <summary>
    /// Update subscriptions
    /// </summary>

    let UpdateSubscriptions  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UpdateSubscriptionsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : UpdateSubscriptionsArgs
          let result = StreamsApiService.UpdateSubscriptions ctx serviceArgs
          return! (match result with 
                      | UpdateSubscriptionsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion


    
