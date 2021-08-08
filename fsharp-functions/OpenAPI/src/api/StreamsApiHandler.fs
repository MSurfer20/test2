namespace OpenAPI

open StreamsApiHandlerParams
open StreamsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module StreamsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region ArchiveStream
    /// <summary>
    /// Archive a stream
    /// </summary>
   [<FunctionName("ArchiveStream")>]
    let ArchiveStream
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/api/v1/streams/{stream_id}")>]
        req:HttpRequest ) =
      
      let result = StreamsApiService.ArchiveStream ()
      match result with 
      | ArchiveStreamStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | ArchiveStreamStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region CreateBigBlueButtonVideoCall
    /// <summary>
    /// Create BigBlueButton video call
    /// </summary>
   [<FunctionName("CreateBigBlueButtonVideoCall")>]
    let CreateBigBlueButtonVideoCall
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/calls/bigbluebutton/create")>]
        req:HttpRequest ) =
      
      let result = StreamsApiService.CreateBigBlueButtonVideoCall ()
      match result with 
      | CreateBigBlueButtonVideoCallStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region DeleteTopic
    /// <summary>
    /// Delete a topic
    /// </summary>
   [<FunctionName("DeleteTopic")>]
    let DeleteTopic
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/streams/{stream_id}/delete_topic")>]
        req:HttpRequest ) =
      
      let result = StreamsApiService.DeleteTopic ()
      match result with 
      | DeleteTopicStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | DeleteTopicStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region GetStreamId
    /// <summary>
    /// Get stream ID
    /// </summary>
   [<FunctionName("GetStreamId")>]
    let GetStreamId
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/get_stream_id")>]
        req:HttpRequest ) =
      
      let result = StreamsApiService.GetStreamId ()
      match result with 
      | GetStreamIdStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | GetStreamIdStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region GetStreamTopics
    /// <summary>
    /// Get topics in a stream
    /// </summary>
   [<FunctionName("GetStreamTopics")>]
    let GetStreamTopics
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/users/me/{stream_id}/topics")>]
        req:HttpRequest ) =
      
      let result = StreamsApiService.GetStreamTopics ()
      match result with 
      | GetStreamTopicsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | GetStreamTopicsStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region GetStreams
    /// <summary>
    /// Get all streams
    /// </summary>
   [<FunctionName("GetStreams")>]
    let GetStreams
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/streams")>]
        req:HttpRequest ) =
      
      let result = StreamsApiService.GetStreams ()
      match result with 
      | GetStreamsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | GetStreamsStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region GetSubscribers
    /// <summary>
    /// Get the subscribers of a stream
    /// </summary>
   [<FunctionName("GetSubscribers")>]
    let GetSubscribers
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/streams/{stream_id}/members")>]
        req:HttpRequest ) =
      
      let result = StreamsApiService.GetSubscribers ()
      match result with 
      | GetSubscribersStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | GetSubscribersStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region GetSubscriptionStatus
    /// <summary>
    /// Get subscription status
    /// </summary>
   [<FunctionName("GetSubscriptionStatus")>]
    let GetSubscriptionStatus
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/users/{user_id}/subscriptions/{stream_id}")>]
        req:HttpRequest ) =
      
      let result = StreamsApiService.GetSubscriptionStatus ()
      match result with 
      | GetSubscriptionStatusStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region GetSubscriptions
    /// <summary>
    /// Get subscribed streams
    /// </summary>
   [<FunctionName("GetSubscriptions")>]
    let GetSubscriptions
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/users/me/subscriptions")>]
        req:HttpRequest ) =
      
      let result = StreamsApiService.GetSubscriptions ()
      match result with 
      | GetSubscriptionsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region MuteTopic
    /// <summary>
    /// Topic muting
    /// </summary>
   [<FunctionName("MuteTopic")>]
    let MuteTopic
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "PATCH", Route = "/api/v1/users/me/subscriptions/muted_topics")>]
        req:HttpRequest ) =
      
      let result = StreamsApiService.MuteTopic ()
      match result with 
      | MuteTopicStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | MuteTopicStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region Subscribe
    /// <summary>
    /// Subscribe to a stream
    /// </summary>
   [<FunctionName("Subscribe")>]
    let Subscribe
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/users/me/subscriptions")>]
        req:HttpRequest ) =
      
      let result = StreamsApiService.Subscribe ()
      match result with 
      | SubscribeStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | SubscribeStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region Unsubscribe
    /// <summary>
    /// Unsubscribe from a stream
    /// </summary>
   [<FunctionName("Unsubscribe")>]
    let Unsubscribe
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/api/v1/users/me/subscriptions")>]
        req:HttpRequest ) =
      
      let result = StreamsApiService.Unsubscribe ()
      match result with 
      | UnsubscribeStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | UnsubscribeStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region UpdateStream
    /// <summary>
    /// Update a stream
    /// </summary>
   [<FunctionName("UpdateStream")>]
    let UpdateStream
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "PATCH", Route = "/api/v1/streams/{stream_id}")>]
        req:HttpRequest ) =
      
      let result = StreamsApiService.UpdateStream ()
      match result with 
      | UpdateStreamStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | UpdateStreamStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region UpdateSubscriptionSettings
    /// <summary>
    /// Update subscription settings
    /// </summary>
   [<FunctionName("UpdateSubscriptionSettings")>]
    let UpdateSubscriptionSettings
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/users/me/subscriptions/properties")>]
        req:HttpRequest ) =
      
      let result = StreamsApiService.UpdateSubscriptionSettings ()
      match result with 
      | UpdateSubscriptionSettingsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region UpdateSubscriptions
    /// <summary>
    /// Update subscriptions
    /// </summary>
   [<FunctionName("UpdateSubscriptions")>]
    let UpdateSubscriptions
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "PATCH", Route = "/api/v1/users/me/subscriptions")>]
        req:HttpRequest ) =
      
      let result = StreamsApiService.UpdateSubscriptions ()
      match result with 
      | UpdateSubscriptionsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 


      

