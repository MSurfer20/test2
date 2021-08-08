namespace OpenAPI
open UsersApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module UsersApiServiceInterface =
    
    //#region Service interface
    type IUsersApiService = 
      abstract member CreateUser : unit -> CreateUserResult
      abstract member CreateUserGroup : unit -> CreateUserGroupResult
      abstract member DeactivateOwnUser : unit -> DeactivateOwnUserResult
      abstract member DeactivateUser : unit -> DeactivateUserResult
      abstract member GetAttachments : unit -> GetAttachmentsResult
      abstract member GetOwnUser : unit -> GetOwnUserResult
      abstract member GetUser : unit -> GetUserResult
      abstract member GetUserByEmail : unit -> GetUserByEmailResult
      abstract member GetUserGroups : unit -> GetUserGroupsResult
      abstract member GetUserPresence : unit -> GetUserPresenceResult
      abstract member GetUsers : unit -> GetUsersResult
      abstract member MuteUser : unit -> MuteUserResult
      abstract member ReactivateUser : unit -> ReactivateUserResult
      abstract member RemoveUserGroup : unit -> RemoveUserGroupResult
      abstract member SetTypingStatus : unit -> SetTypingStatusResult
      abstract member UnmuteUser : unit -> UnmuteUserResult
      abstract member UpdateSettings : unit -> UpdateSettingsResult
      abstract member UpdateStatus : unit -> UpdateStatusResult
      abstract member UpdateUser : unit -> UpdateUserResult
      abstract member UpdateUserGroup : unit -> UpdateUserGroupResult
      abstract member UpdateUserGroupMembers : unit -> UpdateUserGroupMembersResult
    //#endregion