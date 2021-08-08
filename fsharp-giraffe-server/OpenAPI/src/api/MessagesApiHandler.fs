namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open MessagesApiHandlerParams
open MessagesApiServiceInterface
open MessagesApiServiceImplementation
open OpenAPI.Model.AnyType
open OpenAPI.Model.CodedError
open OpenAPI.Model.InvalidMessageError
open OpenAPI.Model.JsonSuccess
open OpenAPI.Model.JsonSuccessBase
open OpenAPI.Model.OneOfobjectobject
open OpenAPI.Model.OneOfstringinteger

module MessagesApiHandler = 

    /// <summary>
    /// 
    /// </summary>

    //#region AddReaction
    /// <summary>
    /// Add an emoji reaction
    /// </summary>

    let AddReaction (pathParams:AddReactionPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AddReactionQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AddReactionArgs
          let result = MessagesApiService.AddReaction ctx serviceArgs
          return! (match result with 
                      | AddReactionStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AddReactionStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CheckMessagesMatchNarrow
    /// <summary>
    /// Check if messages match a narrow
    /// </summary>

    let CheckMessagesMatchNarrow  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CheckMessagesMatchNarrowQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : CheckMessagesMatchNarrowArgs
          let result = MessagesApiService.CheckMessagesMatchNarrow ctx serviceArgs
          return! (match result with 
                      | CheckMessagesMatchNarrowStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeleteMessage
    /// <summary>
    /// Delete a message
    /// </summary>

    let DeleteMessage (pathParams:DeleteMessagePathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DeleteMessageArgs
          let result = MessagesApiService.DeleteMessage ctx serviceArgs
          return! (match result with 
                      | DeleteMessageStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeleteMessageStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetFileTemporaryUrl
    /// <summary>
    /// Get public temporary URL
    /// </summary>

    let GetFileTemporaryUrl (pathParams:GetFileTemporaryUrlPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetFileTemporaryUrlArgs
          let result = MessagesApiService.GetFileTemporaryUrl ctx serviceArgs
          return! (match result with 
                      | GetFileTemporaryUrlStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetMessageHistory
    /// <summary>
    /// Get a message&#39;s edit history
    /// </summary>

    let GetMessageHistory (pathParams:GetMessageHistoryPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetMessageHistoryArgs
          let result = MessagesApiService.GetMessageHistory ctx serviceArgs
          return! (match result with 
                      | GetMessageHistoryStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetMessageHistoryStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetMessages
    /// <summary>
    /// Get messages
    /// </summary>

    let GetMessages  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetMessagesQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : GetMessagesArgs
          let result = MessagesApiService.GetMessages ctx serviceArgs
          return! (match result with 
                      | GetMessagesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetRawMessage
    /// <summary>
    /// Get a message&#39;s raw Markdown
    /// </summary>

    let GetRawMessage (pathParams:GetRawMessagePathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetRawMessageArgs
          let result = MessagesApiService.GetRawMessage ctx serviceArgs
          return! (match result with 
                      | GetRawMessageStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetRawMessageStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region MarkAllAsRead
    /// <summary>
    /// Mark all messages as read
    /// </summary>

    let MarkAllAsRead  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = MessagesApiService.MarkAllAsRead ctx 
          return! (match result with 
                      | MarkAllAsReadStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region MarkStreamAsRead
    /// <summary>
    /// Mark messages in a stream as read
    /// </summary>

    let MarkStreamAsRead  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<MarkStreamAsReadQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : MarkStreamAsReadArgs
          let result = MessagesApiService.MarkStreamAsRead ctx serviceArgs
          return! (match result with 
                      | MarkStreamAsReadStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region MarkTopicAsRead
    /// <summary>
    /// Mark messages in a topic as read
    /// </summary>

    let MarkTopicAsRead  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<MarkTopicAsReadQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : MarkTopicAsReadArgs
          let result = MessagesApiService.MarkTopicAsRead ctx serviceArgs
          return! (match result with 
                      | MarkTopicAsReadStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region RemoveReaction
    /// <summary>
    /// Remove an emoji reaction
    /// </summary>

    let RemoveReaction (pathParams:RemoveReactionPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<RemoveReactionQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : RemoveReactionArgs
          let result = MessagesApiService.RemoveReaction ctx serviceArgs
          return! (match result with 
                      | RemoveReactionStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | RemoveReactionStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region RenderMessage
    /// <summary>
    /// Render message
    /// </summary>

    let RenderMessage  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<RenderMessageQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : RenderMessageArgs
          let result = MessagesApiService.RenderMessage ctx serviceArgs
          return! (match result with 
                      | RenderMessageStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SendMessage
    /// <summary>
    /// Send a message
    /// </summary>

    let SendMessage  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<SendMessageQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : SendMessageArgs
          let result = MessagesApiService.SendMessage ctx serviceArgs
          return! (match result with 
                      | SendMessageStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SendMessageStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateMessage
    /// <summary>
    /// Edit a message
    /// </summary>

    let UpdateMessage (pathParams:UpdateMessagePathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UpdateMessageQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : UpdateMessageArgs
          let result = MessagesApiService.UpdateMessage ctx serviceArgs
          return! (match result with 
                      | UpdateMessageStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateMessageStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateMessageFlags
    /// <summary>
    /// Update personal message flags
    /// </summary>

    let UpdateMessageFlags  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UpdateMessageFlagsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : UpdateMessageFlagsArgs
          let result = MessagesApiService.UpdateMessageFlags ctx serviceArgs
          return! (match result with 
                      | UpdateMessageFlagsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UploadFile
    /// <summary>
    /// Upload a file
    /// </summary>

    let UploadFile  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! formParams = ctx.TryBindFormAsync<UploadFileFormParams>()
          let serviceArgs = {   formParams=formParams;   } : UploadFileArgs
          let result = MessagesApiService.UploadFile ctx serviceArgs
          return! (match result with 
                      | UploadFileStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion


    
