namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open DraftsApiHandlerParams
open DraftsApiServiceInterface
open DraftsApiServiceImplementation
open OpenAPI.Model.CodedError
open OpenAPI.Model.Draft
open OpenAPI.Model.JsonError
open OpenAPI.Model.JsonSuccess

module DraftsApiHandler = 

    /// <summary>
    /// 
    /// </summary>

    //#region CreateDrafts
    /// <summary>
    /// Create drafts
    /// </summary>

    let CreateDrafts  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CreateDraftsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : CreateDraftsArgs
          let result = DraftsApiService.CreateDrafts ctx serviceArgs
          return! (match result with 
                      | CreateDraftsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CreateDraftsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeleteDraft
    /// <summary>
    /// Delete a draft
    /// </summary>

    let DeleteDraft (pathParams:DeleteDraftPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DeleteDraftArgs
          let result = DraftsApiService.DeleteDraft ctx serviceArgs
          return! (match result with 
                      | DeleteDraftStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeleteDraftStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region EditDraft
    /// <summary>
    /// Edit a draft
    /// </summary>

    let EditDraft (pathParams:EditDraftPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<EditDraftQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : EditDraftArgs
          let result = DraftsApiService.EditDraft ctx serviceArgs
          return! (match result with 
                      | EditDraftStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | EditDraftStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetDrafts
    /// <summary>
    /// Get drafts
    /// </summary>

    let GetDrafts  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = DraftsApiService.GetDrafts ctx 
          return! (match result with 
                      | GetDraftsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion


    
