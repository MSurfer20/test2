namespace OpenAPI

open DraftsApiHandlerParams
open DraftsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module DraftsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region CreateDrafts
    /// <summary>
    /// Create drafts
    /// </summary>
   [<FunctionName("CreateDrafts")>]
    let CreateDrafts
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/drafts")>]
        req:HttpRequest ) =
      
      let result = DraftsApiService.CreateDrafts ()
      match result with 
      | CreateDraftsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | CreateDraftsStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region DeleteDraft
    /// <summary>
    /// Delete a draft
    /// </summary>
   [<FunctionName("DeleteDraft")>]
    let DeleteDraft
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/api/v1/drafts/{draft_id}")>]
        req:HttpRequest ) =
      
      let result = DraftsApiService.DeleteDraft ()
      match result with 
      | DeleteDraftStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | DeleteDraftStatusCode404 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404)) 

    //#region EditDraft
    /// <summary>
    /// Edit a draft
    /// </summary>
   [<FunctionName("EditDraft")>]
    let EditDraft
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "PATCH", Route = "/api/v1/drafts/{draft_id}")>]
        req:HttpRequest ) =
      
      let result = DraftsApiService.EditDraft ()
      match result with 
      | EditDraftStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | EditDraftStatusCode404 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404)) 

    //#region GetDrafts
    /// <summary>
    /// Get drafts
    /// </summary>
   [<FunctionName("GetDrafts")>]
    let GetDrafts
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/drafts")>]
        req:HttpRequest ) =
      
      let result = DraftsApiService.GetDrafts ()
      match result with 
      | GetDraftsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 


      

