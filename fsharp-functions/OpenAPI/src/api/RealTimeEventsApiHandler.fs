namespace OpenAPI

open RealTimeEventsApiHandlerParams
open RealTimeEventsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module RealTimeEventsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region DeleteQueue
    /// <summary>
    /// Delete an event queue
    /// </summary>
   [<FunctionName("DeleteQueue")>]
    let DeleteQueue
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/api/v1/events")>]
        req:HttpRequest ) =
      
      let result = RealTimeEventsApiService.DeleteQueue ()
      match result with 
      | DeleteQueueStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | DeleteQueueStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region GetEvents
    /// <summary>
    /// Get events from an event queue
    /// </summary>
   [<FunctionName("GetEvents")>]
    let GetEvents
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/events")>]
        req:HttpRequest ) =
      
      let result = RealTimeEventsApiService.GetEvents ()
      match result with 
      | GetEventsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | GetEventsStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region RealTimePost
    /// <summary>
    /// 
    /// </summary>
   [<FunctionName("RealTimePost")>]
    let RealTimePost
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/real-time")>]
        req:HttpRequest ) =
      
      let result = RealTimeEventsApiService.RealTimePost ()
      match result with 
      | RealTimePostStatusCode200 resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region RegisterQueue
    /// <summary>
    /// Register an event queue
    /// </summary>
   [<FunctionName("RegisterQueue")>]
    let RegisterQueue
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/register")>]
        req:HttpRequest ) =
      
      let result = RealTimeEventsApiService.RegisterQueue ()
      match result with 
      | RegisterQueueStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region RestErrorHandling
    /// <summary>
    /// Error handling
    /// </summary>
   [<FunctionName("RestErrorHandling")>]
    let RestErrorHandling
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/rest-error-handling")>]
        req:HttpRequest ) =
      
      let result = RealTimeEventsApiService.RestErrorHandling ()
      match result with 
      | RestErrorHandlingStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 
      | RestErrorHandlingStatusCode401 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(401)) 
      | RestErrorHandlingStatusCode429 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(429)) 


      

