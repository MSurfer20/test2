namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open UsersApiHandlerParams
open UsersApiServiceInterface
open UsersApiServiceImplementation
open OpenAPI.Model.AnyType
open OpenAPI.Model.CodedError
open OpenAPI.Model.JsonError
open OpenAPI.Model.JsonSuccess
open OpenAPI.Model.JsonSuccessBase
open OpenAPI.Model.OneOfobjectobject
open OpenAPI.Model.OneOfobjectobjectobject

module UsersApiHandler = 

    /// <summary>
    /// 
    /// </summary>

    //#region CreateUser
    /// <summary>
    /// Create a user
    /// </summary>

    let CreateUser  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CreateUserQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : CreateUserArgs
          let result = UsersApiService.CreateUser ctx serviceArgs
          return! (match result with 
                      | CreateUserStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CreateUserStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateUserGroup
    /// <summary>
    /// Create a user group
    /// </summary>

    let CreateUserGroup  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CreateUserGroupQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : CreateUserGroupArgs
          let result = UsersApiService.CreateUserGroup ctx serviceArgs
          return! (match result with 
                      | CreateUserGroupStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CreateUserGroupStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeactivateOwnUser
    /// <summary>
    /// Deactivate own user
    /// </summary>

    let DeactivateOwnUser  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = UsersApiService.DeactivateOwnUser ctx 
          return! (match result with 
                      | DeactivateOwnUserStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeactivateOwnUserStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeactivateUser
    /// <summary>
    /// Deactivate a user
    /// </summary>

    let DeactivateUser (pathParams:DeactivateUserPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DeactivateUserArgs
          let result = UsersApiService.DeactivateUser ctx serviceArgs
          return! (match result with 
                      | DeactivateUserStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeactivateUserStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetAttachments
    /// <summary>
    /// Get attachments
    /// </summary>

    let GetAttachments  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = UsersApiService.GetAttachments ctx 
          return! (match result with 
                      | GetAttachmentsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetOwnUser
    /// <summary>
    /// Get own user
    /// </summary>

    let GetOwnUser  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = UsersApiService.GetOwnUser ctx 
          return! (match result with 
                      | GetOwnUserStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetUser
    /// <summary>
    /// Get a user
    /// </summary>

    let GetUser (pathParams:GetUserPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetUserQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetUserArgs
          let result = UsersApiService.GetUser ctx serviceArgs
          return! (match result with 
                      | GetUserStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetUserByEmail
    /// <summary>
    /// Get a user by email
    /// </summary>

    let GetUserByEmail (pathParams:GetUserByEmailPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetUserByEmailQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetUserByEmailArgs
          let result = UsersApiService.GetUserByEmail ctx serviceArgs
          return! (match result with 
                      | GetUserByEmailStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetUserGroups
    /// <summary>
    /// Get user groups
    /// </summary>

    let GetUserGroups  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = UsersApiService.GetUserGroups ctx 
          return! (match result with 
                      | GetUserGroupsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetUserPresence
    /// <summary>
    /// Get user presence
    /// </summary>

    let GetUserPresence (pathParams:GetUserPresencePathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetUserPresenceArgs
          let result = UsersApiService.GetUserPresence ctx serviceArgs
          return! (match result with 
                      | GetUserPresenceStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetUsers
    /// <summary>
    /// Get all users
    /// </summary>

    let GetUsers  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetUsersQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : GetUsersArgs
          let result = UsersApiService.GetUsers ctx serviceArgs
          return! (match result with 
                      | GetUsersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region MuteUser
    /// <summary>
    /// Mute a user
    /// </summary>

    let MuteUser (pathParams:MuteUserPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : MuteUserArgs
          let result = UsersApiService.MuteUser ctx serviceArgs
          return! (match result with 
                      | MuteUserStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | MuteUserStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ReactivateUser
    /// <summary>
    /// Reactivate a user
    /// </summary>

    let ReactivateUser (pathParams:ReactivateUserPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : ReactivateUserArgs
          let result = UsersApiService.ReactivateUser ctx serviceArgs
          return! (match result with 
                      | ReactivateUserStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region RemoveUserGroup
    /// <summary>
    /// Delete a user group
    /// </summary>

    let RemoveUserGroup (pathParams:RemoveUserGroupPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : RemoveUserGroupArgs
          let result = UsersApiService.RemoveUserGroup ctx serviceArgs
          return! (match result with 
                      | RemoveUserGroupStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | RemoveUserGroupStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SetTypingStatus
    /// <summary>
    /// Set \&quot;typing\&quot; status
    /// </summary>

    let SetTypingStatus  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<SetTypingStatusQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : SetTypingStatusArgs
          let result = UsersApiService.SetTypingStatus ctx serviceArgs
          return! (match result with 
                      | SetTypingStatusStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SetTypingStatusStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UnmuteUser
    /// <summary>
    /// Unmute a user
    /// </summary>

    let UnmuteUser (pathParams:UnmuteUserPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : UnmuteUserArgs
          let result = UsersApiService.UnmuteUser ctx serviceArgs
          return! (match result with 
                      | UnmuteUserStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UnmuteUserStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateDisplaySettings
    /// <summary>
    /// Update display settings
    /// </summary>

    let UpdateDisplaySettings  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UpdateDisplaySettingsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : UpdateDisplaySettingsArgs
          let result = UsersApiService.UpdateDisplaySettings ctx serviceArgs
          return! (match result with 
                      | UpdateDisplaySettingsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateNotificationSettings
    /// <summary>
    /// Update notification settings
    /// </summary>

    let UpdateNotificationSettings  : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UpdateNotificationSettingsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : UpdateNotificationSettingsArgs
          let result = UsersApiService.UpdateNotificationSettings ctx serviceArgs
          return! (match result with 
                      | UpdateNotificationSettingsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateUser
    /// <summary>
    /// Update a user
    /// </summary>

    let UpdateUser (pathParams:UpdateUserPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UpdateUserQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : UpdateUserArgs
          let result = UsersApiService.UpdateUser ctx serviceArgs
          return! (match result with 
                      | UpdateUserStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateUserStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateUserGroup
    /// <summary>
    /// Update a user group
    /// </summary>

    let UpdateUserGroup (pathParams:UpdateUserGroupPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UpdateUserGroupQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : UpdateUserGroupArgs
          let result = UsersApiService.UpdateUserGroup ctx serviceArgs
          return! (match result with 
                      | UpdateUserGroupStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateUserGroupStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateUserGroupMembers
    /// <summary>
    /// Update user group members
    /// </summary>

    let UpdateUserGroupMembers (pathParams:UpdateUserGroupMembersPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UpdateUserGroupMembersQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : UpdateUserGroupMembersArgs
          let result = UsersApiService.UpdateUserGroupMembers ctx serviceArgs
          return! (match result with 
                      | UpdateUserGroupMembersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion


    
