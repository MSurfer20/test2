namespace OpenAPI
open UsersApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module UsersApiServiceInterface =
    
    //#region Service interface
    type IUsersApiService = 
      abstract member CreateUser:HttpContext -> CreateUserArgs->CreateUserResult
      abstract member CreateUserGroup:HttpContext -> CreateUserGroupArgs->CreateUserGroupResult
      abstract member DeactivateOwnUser:HttpContext ->DeactivateOwnUserResult
      abstract member DeactivateUser:HttpContext -> DeactivateUserArgs->DeactivateUserResult
      abstract member GetAttachments:HttpContext ->GetAttachmentsResult
      abstract member GetOwnUser:HttpContext ->GetOwnUserResult
      abstract member GetUser:HttpContext -> GetUserArgs->GetUserResult
      abstract member GetUserByEmail:HttpContext -> GetUserByEmailArgs->GetUserByEmailResult
      abstract member GetUserGroups:HttpContext ->GetUserGroupsResult
      abstract member GetUserPresence:HttpContext -> GetUserPresenceArgs->GetUserPresenceResult
      abstract member GetUsers:HttpContext -> GetUsersArgs->GetUsersResult
      abstract member MuteUser:HttpContext -> MuteUserArgs->MuteUserResult
      abstract member ReactivateUser:HttpContext -> ReactivateUserArgs->ReactivateUserResult
      abstract member RemoveUserGroup:HttpContext -> RemoveUserGroupArgs->RemoveUserGroupResult
      abstract member SetTypingStatus:HttpContext -> SetTypingStatusArgs->SetTypingStatusResult
      abstract member UnmuteUser:HttpContext -> UnmuteUserArgs->UnmuteUserResult
      abstract member UpdateSettings:HttpContext -> UpdateSettingsArgs->UpdateSettingsResult
      abstract member UpdateStatus:HttpContext -> UpdateStatusArgs->UpdateStatusResult
      abstract member UpdateUser:HttpContext -> UpdateUserArgs->UpdateUserResult
      abstract member UpdateUserGroup:HttpContext -> UpdateUserGroupArgs->UpdateUserGroupResult
      abstract member UpdateUserGroupMembers:HttpContext -> UpdateUserGroupMembersArgs->UpdateUserGroupMembersResult
    //#endregion