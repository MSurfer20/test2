namespace OpenAPI

open MessagesApiHandlerParams
open MessagesApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module MessagesApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region AddReaction
    /// <summary>
    /// Add an emoji reaction
    /// </summary>
   [<FunctionName("AddReaction")>]
    let AddReaction
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/messages/{message_id}/reactions")>]
        req:HttpRequest ) =
      
      let result = MessagesApiService.AddReaction ()
      match result with 
      | AddReactionStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | AddReactionStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region CheckMessagesMatchNarrow
    /// <summary>
    /// Check if messages match a narrow
    /// </summary>
   [<FunctionName("CheckMessagesMatchNarrow")>]
    let CheckMessagesMatchNarrow
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/messages/matches_narrow")>]
        req:HttpRequest ) =
      
      let result = MessagesApiService.CheckMessagesMatchNarrow ()
      match result with 
      | CheckMessagesMatchNarrowStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region DeleteMessage
    /// <summary>
    /// Delete a message
    /// </summary>
   [<FunctionName("DeleteMessage")>]
    let DeleteMessage
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/api/v1/messages/{message_id}")>]
        req:HttpRequest ) =
      
      let result = MessagesApiService.DeleteMessage ()
      match result with 
      | DeleteMessageStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | DeleteMessageStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region GetFileTemporaryUrl
    /// <summary>
    /// Get public temporary URL
    /// </summary>
   [<FunctionName("GetFileTemporaryUrl")>]
    let GetFileTemporaryUrl
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/user_uploads/{realm_id_str}/{filename}")>]
        req:HttpRequest ) =
      
      let result = MessagesApiService.GetFileTemporaryUrl ()
      match result with 
      | GetFileTemporaryUrlStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region GetMessageHistory
    /// <summary>
    /// Get a message&#39;s edit history
    /// </summary>
   [<FunctionName("GetMessageHistory")>]
    let GetMessageHistory
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/messages/{message_id}/history")>]
        req:HttpRequest ) =
      
      let result = MessagesApiService.GetMessageHistory ()
      match result with 
      | GetMessageHistoryStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | GetMessageHistoryStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region GetMessages
    /// <summary>
    /// Get messages
    /// </summary>
   [<FunctionName("GetMessages")>]
    let GetMessages
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/messages")>]
        req:HttpRequest ) =
      
      let result = MessagesApiService.GetMessages ()
      match result with 
      | GetMessagesStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region GetRawMessage
    /// <summary>
    /// Get a message&#39;s raw Markdown
    /// </summary>
   [<FunctionName("GetRawMessage")>]
    let GetRawMessage
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/messages/{message_id}")>]
        req:HttpRequest ) =
      
      let result = MessagesApiService.GetRawMessage ()
      match result with 
      | GetRawMessageStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | GetRawMessageStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region MarkAllAsRead
    /// <summary>
    /// Mark all messages as read
    /// </summary>
   [<FunctionName("MarkAllAsRead")>]
    let MarkAllAsRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/mark_all_as_read")>]
        req:HttpRequest ) =
      
      let result = MessagesApiService.MarkAllAsRead ()
      match result with 
      | MarkAllAsReadStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region MarkStreamAsRead
    /// <summary>
    /// Mark messages in a stream as read
    /// </summary>
   [<FunctionName("MarkStreamAsRead")>]
    let MarkStreamAsRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/mark_stream_as_read")>]
        req:HttpRequest ) =
      
      let result = MessagesApiService.MarkStreamAsRead ()
      match result with 
      | MarkStreamAsReadStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region MarkTopicAsRead
    /// <summary>
    /// Mark messages in a topic as read
    /// </summary>
   [<FunctionName("MarkTopicAsRead")>]
    let MarkTopicAsRead
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/mark_topic_as_read")>]
        req:HttpRequest ) =
      
      let result = MessagesApiService.MarkTopicAsRead ()
      match result with 
      | MarkTopicAsReadStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region RemoveReaction
    /// <summary>
    /// Remove an emoji reaction
    /// </summary>
   [<FunctionName("RemoveReaction")>]
    let RemoveReaction
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/api/v1/messages/{message_id}/reactions")>]
        req:HttpRequest ) =
      
      let result = MessagesApiService.RemoveReaction ()
      match result with 
      | RemoveReactionStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | RemoveReactionStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region RenderMessage
    /// <summary>
    /// Render message
    /// </summary>
   [<FunctionName("RenderMessage")>]
    let RenderMessage
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/messages/render")>]
        req:HttpRequest ) =
      
      let result = MessagesApiService.RenderMessage ()
      match result with 
      | RenderMessageStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region SendMessage
    /// <summary>
    /// Send a message
    /// </summary>
   [<FunctionName("SendMessage")>]
    let SendMessage
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/messages")>]
        req:HttpRequest ) =
      
      let result = MessagesApiService.SendMessage ()
      match result with 
      | SendMessageStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | SendMessageStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region UpdateMessage
    /// <summary>
    /// Edit a message
    /// </summary>
   [<FunctionName("UpdateMessage")>]
    let UpdateMessage
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "PATCH", Route = "/api/v1/messages/{message_id}")>]
        req:HttpRequest ) =
      
      let result = MessagesApiService.UpdateMessage ()
      match result with 
      | UpdateMessageStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | UpdateMessageStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region UpdateMessageFlags
    /// <summary>
    /// Update personal message flags
    /// </summary>
   [<FunctionName("UpdateMessageFlags")>]
    let UpdateMessageFlags
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/messages/flags")>]
        req:HttpRequest ) =
      
      let result = MessagesApiService.UpdateMessageFlags ()
      match result with 
      | UpdateMessageFlagsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region UploadFile
    /// <summary>
    /// Upload a file
    /// </summary>
   [<FunctionName("UploadFile")>]
    let UploadFile
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/user_uploads")>]
        req:HttpRequest ) =
      
      let result = MessagesApiService.UploadFile ()
      match result with 
      | UploadFileStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 


      

