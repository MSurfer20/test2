namespace OpenAPI

open ServerAndOrganizationsApiHandlerParams
open ServerAndOrganizationsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module ServerAndOrganizationsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region AddCodePlayground
    /// <summary>
    /// Add a code playground
    /// </summary>
   [<FunctionName("AddCodePlayground")>]
    let AddCodePlayground
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/realm/playgrounds")>]
        req:HttpRequest ) =
      
      let result = ServerAndOrganizationsApiService.AddCodePlayground ()
      match result with 
      | AddCodePlaygroundStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region AddLinkifier
    /// <summary>
    /// Add a linkifier
    /// </summary>
   [<FunctionName("AddLinkifier")>]
    let AddLinkifier
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/realm/filters")>]
        req:HttpRequest ) =
      
      let result = ServerAndOrganizationsApiService.AddLinkifier ()
      match result with 
      | AddLinkifierStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region CreateCustomProfileField
    /// <summary>
    /// Create a custom profile field
    /// </summary>
   [<FunctionName("CreateCustomProfileField")>]
    let CreateCustomProfileField
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/realm/profile_fields")>]
        req:HttpRequest ) =
      
      let result = ServerAndOrganizationsApiService.CreateCustomProfileField ()
      match result with 
      | CreateCustomProfileFieldStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region GetCustomEmoji
    /// <summary>
    /// Get all custom emoji
    /// </summary>
   [<FunctionName("GetCustomEmoji")>]
    let GetCustomEmoji
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/realm/emoji")>]
        req:HttpRequest ) =
      
      let result = ServerAndOrganizationsApiService.GetCustomEmoji ()
      match result with 
      | GetCustomEmojiStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region GetCustomProfileFields
    /// <summary>
    /// Get all custom profile fields
    /// </summary>
   [<FunctionName("GetCustomProfileFields")>]
    let GetCustomProfileFields
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/realm/profile_fields")>]
        req:HttpRequest ) =
      
      let result = ServerAndOrganizationsApiService.GetCustomProfileFields ()
      match result with 
      | GetCustomProfileFieldsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region GetLinkifiers
    /// <summary>
    /// Get linkifiers
    /// </summary>
   [<FunctionName("GetLinkifiers")>]
    let GetLinkifiers
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/realm/linkifiers")>]
        req:HttpRequest ) =
      
      let result = ServerAndOrganizationsApiService.GetLinkifiers ()
      match result with 
      | GetLinkifiersStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region GetServerSettings
    /// <summary>
    /// Get server settings
    /// </summary>
   [<FunctionName("GetServerSettings")>]
    let GetServerSettings
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/server_settings")>]
        req:HttpRequest ) =
      
      let result = ServerAndOrganizationsApiService.GetServerSettings ()
      match result with 
      | GetServerSettingsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region RemoveCodePlayground
    /// <summary>
    /// Remove a code playground
    /// </summary>
   [<FunctionName("RemoveCodePlayground")>]
    let RemoveCodePlayground
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/api/v1/realm/playgrounds/{playground_id}")>]
        req:HttpRequest ) =
      
      let result = ServerAndOrganizationsApiService.RemoveCodePlayground ()
      match result with 
      | RemoveCodePlaygroundStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region RemoveLinkifier
    /// <summary>
    /// Remove a linkifier
    /// </summary>
   [<FunctionName("RemoveLinkifier")>]
    let RemoveLinkifier
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/api/v1/realm/filters/{filter_id}")>]
        req:HttpRequest ) =
      
      let result = ServerAndOrganizationsApiService.RemoveLinkifier ()
      match result with 
      | RemoveLinkifierStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region ReorderCustomProfileFields
    /// <summary>
    /// Reorder custom profile fields
    /// </summary>
   [<FunctionName("ReorderCustomProfileFields")>]
    let ReorderCustomProfileFields
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "PATCH", Route = "/api/v1/realm/profile_fields")>]
        req:HttpRequest ) =
      
      let result = ServerAndOrganizationsApiService.ReorderCustomProfileFields ()
      match result with 
      | ReorderCustomProfileFieldsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region UpdateLinkifier
    /// <summary>
    /// Update a linkifier
    /// </summary>
   [<FunctionName("UpdateLinkifier")>]
    let UpdateLinkifier
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "PATCH", Route = "/api/v1/realm/filters/{filter_id}")>]
        req:HttpRequest ) =
      
      let result = ServerAndOrganizationsApiService.UpdateLinkifier ()
      match result with 
      | UpdateLinkifierStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region UploadCustomEmoji
    /// <summary>
    /// Upload custom emoji
    /// </summary>
   [<FunctionName("UploadCustomEmoji")>]
    let UploadCustomEmoji
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/realm/emoji/{emoji_name}")>]
        req:HttpRequest ) =
      
      let result = ServerAndOrganizationsApiService.UploadCustomEmoji ()
      match result with 
      | UploadCustomEmojiStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 


      

