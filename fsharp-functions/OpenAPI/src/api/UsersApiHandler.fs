namespace OpenAPI

open UsersApiHandlerParams
open UsersApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module UsersApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region CreateUser
    /// <summary>
    /// Create a user
    /// </summary>
   [<FunctionName("CreateUser")>]
    let CreateUser
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/users")>]
        req:HttpRequest ) =
      
      let result = UsersApiService.CreateUser ()
      match result with 
      | CreateUserStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | CreateUserStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region CreateUserGroup
    /// <summary>
    /// Create a user group
    /// </summary>
   [<FunctionName("CreateUserGroup")>]
    let CreateUserGroup
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/user_groups/create")>]
        req:HttpRequest ) =
      
      let result = UsersApiService.CreateUserGroup ()
      match result with 
      | CreateUserGroupStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | CreateUserGroupStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region DeactivateOwnUser
    /// <summary>
    /// Deactivate own user
    /// </summary>
   [<FunctionName("DeactivateOwnUser")>]
    let DeactivateOwnUser
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/api/v1/users/me")>]
        req:HttpRequest ) =
      
      let result = UsersApiService.DeactivateOwnUser ()
      match result with 
      | DeactivateOwnUserStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | DeactivateOwnUserStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region DeactivateUser
    /// <summary>
    /// Deactivate a user
    /// </summary>
   [<FunctionName("DeactivateUser")>]
    let DeactivateUser
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/api/v1/users/{user_id}")>]
        req:HttpRequest ) =
      
      let result = UsersApiService.DeactivateUser ()
      match result with 
      | DeactivateUserStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | DeactivateUserStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region GetAttachments
    /// <summary>
    /// Get attachments
    /// </summary>
   [<FunctionName("GetAttachments")>]
    let GetAttachments
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/attachments")>]
        req:HttpRequest ) =
      
      let result = UsersApiService.GetAttachments ()
      match result with 
      | GetAttachmentsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region GetOwnUser
    /// <summary>
    /// Get own user
    /// </summary>
   [<FunctionName("GetOwnUser")>]
    let GetOwnUser
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/users/me")>]
        req:HttpRequest ) =
      
      let result = UsersApiService.GetOwnUser ()
      match result with 
      | GetOwnUserStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region GetUser
    /// <summary>
    /// Get a user
    /// </summary>
   [<FunctionName("GetUser")>]
    let GetUser
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/users/{user_id}")>]
        req:HttpRequest ) =
      
      let result = UsersApiService.GetUser ()
      match result with 
      | GetUserStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region GetUserByEmail
    /// <summary>
    /// Get a user by email
    /// </summary>
   [<FunctionName("GetUserByEmail")>]
    let GetUserByEmail
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/users/{email}")>]
        req:HttpRequest ) =
      
      let result = UsersApiService.GetUserByEmail ()
      match result with 
      | GetUserByEmailStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region GetUserGroups
    /// <summary>
    /// Get user groups
    /// </summary>
   [<FunctionName("GetUserGroups")>]
    let GetUserGroups
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/user_groups")>]
        req:HttpRequest ) =
      
      let result = UsersApiService.GetUserGroups ()
      match result with 
      | GetUserGroupsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region GetUserPresence
    /// <summary>
    /// Get user presence
    /// </summary>
   [<FunctionName("GetUserPresence")>]
    let GetUserPresence
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/users/{user_id_or_email}/presence")>]
        req:HttpRequest ) =
      
      let result = UsersApiService.GetUserPresence ()
      match result with 
      | GetUserPresenceStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region GetUsers
    /// <summary>
    /// Get all users
    /// </summary>
   [<FunctionName("GetUsers")>]
    let GetUsers
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/v1/users")>]
        req:HttpRequest ) =
      
      let result = UsersApiService.GetUsers ()
      match result with 
      | GetUsersStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region MuteUser
    /// <summary>
    /// Mute a user
    /// </summary>
   [<FunctionName("MuteUser")>]
    let MuteUser
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/users/me/muted_users/{muted_user_id}")>]
        req:HttpRequest ) =
      
      let result = UsersApiService.MuteUser ()
      match result with 
      | MuteUserStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | MuteUserStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region ReactivateUser
    /// <summary>
    /// Reactivate a user
    /// </summary>
   [<FunctionName("ReactivateUser")>]
    let ReactivateUser
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/users/{user_id}/reactivate")>]
        req:HttpRequest ) =
      
      let result = UsersApiService.ReactivateUser ()
      match result with 
      | ReactivateUserStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region RemoveUserGroup
    /// <summary>
    /// Delete a user group
    /// </summary>
   [<FunctionName("RemoveUserGroup")>]
    let RemoveUserGroup
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/api/v1/user_groups/{user_group_id}")>]
        req:HttpRequest ) =
      
      let result = UsersApiService.RemoveUserGroup ()
      match result with 
      | RemoveUserGroupStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | RemoveUserGroupStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region SetTypingStatus
    /// <summary>
    /// Set \&quot;typing\&quot; status
    /// </summary>
   [<FunctionName("SetTypingStatus")>]
    let SetTypingStatus
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/typing")>]
        req:HttpRequest ) =
      
      let result = UsersApiService.SetTypingStatus ()
      match result with 
      | SetTypingStatusStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | SetTypingStatusStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region UnmuteUser
    /// <summary>
    /// Unmute a user
    /// </summary>
   [<FunctionName("UnmuteUser")>]
    let UnmuteUser
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/api/v1/users/me/muted_users/{muted_user_id}")>]
        req:HttpRequest ) =
      
      let result = UsersApiService.UnmuteUser ()
      match result with 
      | UnmuteUserStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | UnmuteUserStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region UpdateDisplaySettings
    /// <summary>
    /// Update display settings
    /// </summary>
   [<FunctionName("UpdateDisplaySettings")>]
    let UpdateDisplaySettings
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "PATCH", Route = "/api/v1/settings/display")>]
        req:HttpRequest ) =
      
      let result = UsersApiService.UpdateDisplaySettings ()
      match result with 
      | UpdateDisplaySettingsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region UpdateNotificationSettings
    /// <summary>
    /// Update notification settings
    /// </summary>
   [<FunctionName("UpdateNotificationSettings")>]
    let UpdateNotificationSettings
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "PATCH", Route = "/api/v1/settings/notifications")>]
        req:HttpRequest ) =
      
      let result = UsersApiService.UpdateNotificationSettings ()
      match result with 
      | UpdateNotificationSettingsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 

    //#region UpdateUser
    /// <summary>
    /// Update a user
    /// </summary>
   [<FunctionName("UpdateUser")>]
    let UpdateUser
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "PATCH", Route = "/api/v1/users/{user_id}")>]
        req:HttpRequest ) =
      
      let result = UsersApiService.UpdateUser ()
      match result with 
      | UpdateUserStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | UpdateUserStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region UpdateUserGroup
    /// <summary>
    /// Update a user group
    /// </summary>
   [<FunctionName("UpdateUserGroup")>]
    let UpdateUserGroup
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "PATCH", Route = "/api/v1/user_groups/{user_group_id}")>]
        req:HttpRequest ) =
      
      let result = UsersApiService.UpdateUserGroup ()
      match result with 
      | UpdateUserGroupStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | UpdateUserGroupStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 

    //#region UpdateUserGroupMembers
    /// <summary>
    /// Update user group members
    /// </summary>
   [<FunctionName("UpdateUserGroupMembers")>]
    let UpdateUserGroupMembers
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/api/v1/user_groups/{user_group_id}/members")>]
        req:HttpRequest ) =
      
      let result = UsersApiService.UpdateUserGroupMembers ()
      match result with 
      | UpdateUserGroupMembersStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 


      

