namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ServerAndOrganizationsApiHandlerParams
open ServerAndOrganizationsApiServiceInterface
open ServerAndOrganizationsApiServiceImplementation
open OpenAPI.Model.JsonSuccess
open OpenAPI.Model.JsonSuccessBase

module ServerAndOrganizationsApiHandler = 

    /// <summary>
    /// 
    /// </summary>

    //#region AddCodePlayground
    /// <summary>
    /// Add a code playground
    /// </summary>

    let AddCodePlayground  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AddCodePlaygroundQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : AddCodePlaygroundArgs
          let result = ServerAndOrganizationsApiService.AddCodePlayground ctx serviceArgs
          return! (match result with 
                      | AddCodePlaygroundStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AddLinkifier
    /// <summary>
    /// Add a linkifier
    /// </summary>

    let AddLinkifier  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AddLinkifierQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : AddLinkifierArgs
          let result = ServerAndOrganizationsApiService.AddLinkifier ctx serviceArgs
          return! (match result with 
                      | AddLinkifierStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateCustomProfileField
    /// <summary>
    /// Create a custom profile field
    /// </summary>

    let CreateCustomProfileField  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CreateCustomProfileFieldQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : CreateCustomProfileFieldArgs
          let result = ServerAndOrganizationsApiService.CreateCustomProfileField ctx serviceArgs
          return! (match result with 
                      | CreateCustomProfileFieldStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetCustomEmoji
    /// <summary>
    /// Get all custom emoji
    /// </summary>

    let GetCustomEmoji  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = ServerAndOrganizationsApiService.GetCustomEmoji ctx 
          return! (match result with 
                      | GetCustomEmojiStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetCustomProfileFields
    /// <summary>
    /// Get all custom profile fields
    /// </summary>

    let GetCustomProfileFields  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = ServerAndOrganizationsApiService.GetCustomProfileFields ctx 
          return! (match result with 
                      | GetCustomProfileFieldsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetLinkifiers
    /// <summary>
    /// Get linkifiers
    /// </summary>

    let GetLinkifiers  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = ServerAndOrganizationsApiService.GetLinkifiers ctx 
          return! (match result with 
                      | GetLinkifiersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetServerSettings
    /// <summary>
    /// Get server settings
    /// </summary>

    let GetServerSettings  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = ServerAndOrganizationsApiService.GetServerSettings ctx 
          return! (match result with 
                      | GetServerSettingsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region RemoveCodePlayground
    /// <summary>
    /// Remove a code playground
    /// </summary>

    let RemoveCodePlayground (pathParams:RemoveCodePlaygroundPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : RemoveCodePlaygroundArgs
          let result = ServerAndOrganizationsApiService.RemoveCodePlayground ctx serviceArgs
          return! (match result with 
                      | RemoveCodePlaygroundStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region RemoveLinkifier
    /// <summary>
    /// Remove a linkifier
    /// </summary>

    let RemoveLinkifier (pathParams:RemoveLinkifierPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : RemoveLinkifierArgs
          let result = ServerAndOrganizationsApiService.RemoveLinkifier ctx serviceArgs
          return! (match result with 
                      | RemoveLinkifierStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ReorderCustomProfileFields
    /// <summary>
    /// Reorder custom profile fields
    /// </summary>

    let ReorderCustomProfileFields  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ReorderCustomProfileFieldsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ReorderCustomProfileFieldsArgs
          let result = ServerAndOrganizationsApiService.ReorderCustomProfileFields ctx serviceArgs
          return! (match result with 
                      | ReorderCustomProfileFieldsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateLinkifier
    /// <summary>
    /// Update a linkifier
    /// </summary>

    let UpdateLinkifier (pathParams:UpdateLinkifierPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UpdateLinkifierQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : UpdateLinkifierArgs
          let result = ServerAndOrganizationsApiService.UpdateLinkifier ctx serviceArgs
          return! (match result with 
                      | UpdateLinkifierStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UploadCustomEmoji
    /// <summary>
    /// Upload custom emoji
    /// </summary>

    let UploadCustomEmoji (pathParams:UploadCustomEmojiPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! formParams = ctx.TryBindFormAsync<UploadCustomEmojiFormParams>()
          let serviceArgs = {   formParams=formParams; pathParams=pathParams;  } : UploadCustomEmojiArgs
          let result = ServerAndOrganizationsApiService.UploadCustomEmoji ctx serviceArgs
          return! (match result with 
                      | UploadCustomEmojiStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion


    
