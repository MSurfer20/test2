namespace OpenAPI

open AuthenticationApiHandlerParams
open AuthenticationApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module AuthenticationApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region DevFetchApiKey
    /// <summary>
    /// Fetch an API key (development only)
    /// </summary>
   [<FunctionName("DevFetchApiKey")>]
    let DevFetchApiKey
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/dev_fetch_api_key")>]
        req:HttpRequest ) =
      
      let result = AuthenticationApiService.DevFetchApiKey ()
      match result with 
      | DevFetchApiKeyStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region FetchApiKey
    /// <summary>
    /// Fetch an API key (production)
    /// </summary>
   [<FunctionName("FetchApiKey")>]
    let FetchApiKey
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/fetch_api_key")>]
        req:HttpRequest ) =
      
      let result = AuthenticationApiService.FetchApiKey ()
      match result with 
      | FetchApiKeyStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 


      

