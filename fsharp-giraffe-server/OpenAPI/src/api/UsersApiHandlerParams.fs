namespace OpenAPI

open OpenAPI.Model.AnyType
open OpenAPI.Model.CodedError
open OpenAPI.Model.JsonError
open OpenAPI.Model.JsonSuccess
open OpenAPI.Model.JsonSuccessBase
open OpenAPI.Model.OneOfobjectobject
open OpenAPI.Model.OneOfobjectobjectobject
open System.Collections.Generic
open System

module UsersApiHandlerParams = 


    //#region Query parameters
    [<CLIMutable>]
    type CreateUserQueryParams = {
      email : string ;
      

      password : string ;
      

      fullName : string ;
      
    }
    //#endregion

    
    type CreateUserStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    
    type CreateUserStatusCode400Response = {
      content:JsonError;
      
    }
    type CreateUserResult = CreateUserStatusCode200 of CreateUserStatusCode200Response|CreateUserStatusCode400 of CreateUserStatusCode400Response

    type CreateUserArgs = {
      queryParams:Result<CreateUserQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type CreateUserGroupQueryParams = {
      name : string ;
      

      description : string ;
      

      members : int[] ;
      
    }
    //#endregion

    
    type CreateUserGroupStatusCode200Response = {
      content:JsonSuccess;
      
    }
    
    type CreateUserGroupStatusCode400Response = {
      content:JsonError;
      
    }
    type CreateUserGroupResult = CreateUserGroupStatusCode200 of CreateUserGroupStatusCode200Response|CreateUserGroupStatusCode400 of CreateUserGroupStatusCode400Response

    type CreateUserGroupArgs = {
      queryParams:Result<CreateUserGroupQueryParams,string>;
    }

    
    type DeactivateOwnUserStatusCode200Response = {
      content:JsonSuccess;
      
    }
    
    type DeactivateOwnUserStatusCode400Response = {
      content:JsonError;
      
    }
    type DeactivateOwnUserResult = DeactivateOwnUserStatusCode200 of DeactivateOwnUserStatusCode200Response|DeactivateOwnUserStatusCode400 of DeactivateOwnUserStatusCode400Response

    //#region Path parameters
    [<CLIMutable>]
    type DeactivateUserPathParams = {
      userId : int ;
    }
    //#endregion

    
    type DeactivateUserStatusCode200Response = {
      content:JsonSuccess;
      
    }
    
    type DeactivateUserStatusCode400Response = {
      content:JsonError;
      
    }
    type DeactivateUserResult = DeactivateUserStatusCode200 of DeactivateUserStatusCode200Response|DeactivateUserStatusCode400 of DeactivateUserStatusCode400Response

    type DeactivateUserArgs = {
      pathParams:DeactivateUserPathParams;
    }

    
    type GetAttachmentsStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type GetAttachmentsResult = GetAttachmentsStatusCode200 of GetAttachmentsStatusCode200Response


    
    type GetOwnUserStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type GetOwnUserResult = GetOwnUserStatusCode200 of GetOwnUserStatusCode200Response

    //#region Path parameters
    [<CLIMutable>]
    type GetUserPathParams = {
      userId : int ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetUserQueryParams = {
      clientGravatar : bool option;
      

      includeCustomProfileFields : bool option;
      
    }
    //#endregion

    
    type GetUserStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type GetUserResult = GetUserStatusCode200 of GetUserStatusCode200Response

    type GetUserArgs = {
      pathParams:GetUserPathParams;
      queryParams:Result<GetUserQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetUserByEmailPathParams = {
      email : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetUserByEmailQueryParams = {
      clientGravatar : bool option;
      

      includeCustomProfileFields : bool option;
      
    }
    //#endregion

    
    type GetUserByEmailStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type GetUserByEmailResult = GetUserByEmailStatusCode200 of GetUserByEmailStatusCode200Response

    type GetUserByEmailArgs = {
      pathParams:GetUserByEmailPathParams;
      queryParams:Result<GetUserByEmailQueryParams,string>;
    }

    
    type GetUserGroupsStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type GetUserGroupsResult = GetUserGroupsStatusCode200 of GetUserGroupsStatusCode200Response

    //#region Path parameters
    [<CLIMutable>]
    type GetUserPresencePathParams = {
      userIdOrEmail : string ;
    }
    //#endregion

    
    type GetUserPresenceStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type GetUserPresenceResult = GetUserPresenceStatusCode200 of GetUserPresenceStatusCode200Response

    type GetUserPresenceArgs = {
      pathParams:GetUserPresencePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type GetUsersQueryParams = {
      clientGravatar : bool option;
      

      includeCustomProfileFields : bool option;
      
    }
    //#endregion

    
    type GetUsersStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type GetUsersResult = GetUsersStatusCode200 of GetUsersStatusCode200Response

    type GetUsersArgs = {
      queryParams:Result<GetUsersQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type MuteUserPathParams = {
      mutedUserId : int ;
    }
    //#endregion

    
    type MuteUserStatusCode200Response = {
      content:JsonSuccess;
      
    }
    
    type MuteUserStatusCode400Response = {
      content:OneOfobjectobjectobject;
      
    }
    type MuteUserResult = MuteUserStatusCode200 of MuteUserStatusCode200Response|MuteUserStatusCode400 of MuteUserStatusCode400Response

    type MuteUserArgs = {
      pathParams:MuteUserPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ReactivateUserPathParams = {
      userId : int ;
    }
    //#endregion

    
    type ReactivateUserStatusCode200Response = {
      content:AnyType;
      
    }
    type ReactivateUserResult = ReactivateUserStatusCode200 of ReactivateUserStatusCode200Response

    type ReactivateUserArgs = {
      pathParams:ReactivateUserPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type RemoveUserGroupPathParams = {
      userGroupId : int ;
    }
    //#endregion

    
    type RemoveUserGroupStatusCode200Response = {
      content:JsonSuccess;
      
    }
    
    type RemoveUserGroupStatusCode400Response = {
      content:JsonError;
      
    }
    type RemoveUserGroupResult = RemoveUserGroupStatusCode200 of RemoveUserGroupStatusCode200Response|RemoveUserGroupStatusCode400 of RemoveUserGroupStatusCode400Response

    type RemoveUserGroupArgs = {
      pathParams:RemoveUserGroupPathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type SetTypingStatusQueryParams = {
      _type : string option;
      

      op : string ;
      

      _to : int[] ;
      

      topic : string option;
      
    }
    //#endregion

    
    type SetTypingStatusStatusCode200Response = {
      content:JsonSuccess;
      
    }
    
    type SetTypingStatusStatusCode400Response = {
      content:JsonError;
      
    }
    type SetTypingStatusResult = SetTypingStatusStatusCode200 of SetTypingStatusStatusCode200Response|SetTypingStatusStatusCode400 of SetTypingStatusStatusCode400Response

    type SetTypingStatusArgs = {
      queryParams:Result<SetTypingStatusQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type UnmuteUserPathParams = {
      mutedUserId : int ;
    }
    //#endregion

    
    type UnmuteUserStatusCode200Response = {
      content:JsonSuccess;
      
    }
    
    type UnmuteUserStatusCode400Response = {
      content:OneOfobjectobject;
      
    }
    type UnmuteUserResult = UnmuteUserStatusCode200 of UnmuteUserStatusCode200Response|UnmuteUserStatusCode400 of UnmuteUserStatusCode400Response

    type UnmuteUserArgs = {
      pathParams:UnmuteUserPathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type UpdateDisplaySettingsQueryParams = {
      twentyFourHourTime : bool option;
      

      denseMode : bool option;
      

      starredMessageCounts : bool option;
      

      fluidLayoutWidth : bool option;
      

      highContrastMode : bool option;
      

      colorScheme : int option;
      

      translateEmoticons : bool option;
      

      defaultLanguage : string option;
      

      defaultView : string option;
      

      leftSideUserlist : bool option;
      

      emojiset : string option;
      

      demoteInactiveStreams : int option;
      

      timezone : string option;
      
    }
    //#endregion

    
    type UpdateDisplaySettingsStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type UpdateDisplaySettingsResult = UpdateDisplaySettingsStatusCode200 of UpdateDisplaySettingsStatusCode200Response

    type UpdateDisplaySettingsArgs = {
      queryParams:Result<UpdateDisplaySettingsQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type UpdateNotificationSettingsQueryParams = {
      enableStreamDesktopNotifications : bool option;
      

      enableStreamEmailNotifications : bool option;
      

      enableStreamPushNotifications : bool option;
      

      enableStreamAudibleNotifications : bool option;
      

      notificationSound : string option;
      

      enableDesktopNotifications : bool option;
      

      enableSounds : bool option;
      

      enableOfflineEmailNotifications : bool option;
      

      enableOfflinePushNotifications : bool option;
      

      enableOnlinePushNotifications : bool option;
      

      enableDigestEmails : bool option;
      

      enableMarketingEmails : bool option;
      

      enableLoginEmails : bool option;
      

      messageContentInEmailNotifications : bool option;
      

      pmContentInDesktopNotifications : bool option;
      

      wildcardMentionsNotify : bool option;
      

      desktopIconCountDisplay : int option;
      

      realmNameInNotifications : bool option;
      

      presenceEnabled : bool option;
      
    }
    //#endregion

    
    type UpdateNotificationSettingsStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type UpdateNotificationSettingsResult = UpdateNotificationSettingsStatusCode200 of UpdateNotificationSettingsStatusCode200Response

    type UpdateNotificationSettingsArgs = {
      queryParams:Result<UpdateNotificationSettingsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateUserPathParams = {
      userId : int ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type UpdateUserQueryParams = {
      fullName : string option;
      

      role : int option;
      

      profileData : obj[] option;
      
    }
    //#endregion

    
    type UpdateUserStatusCode200Response = {
      content:JsonSuccess;
      
    }
    
    type UpdateUserStatusCode400Response = {
      content:CodedError;
      
    }
    type UpdateUserResult = UpdateUserStatusCode200 of UpdateUserStatusCode200Response|UpdateUserStatusCode400 of UpdateUserStatusCode400Response

    type UpdateUserArgs = {
      pathParams:UpdateUserPathParams;
      queryParams:Result<UpdateUserQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateUserGroupPathParams = {
      userGroupId : int ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type UpdateUserGroupQueryParams = {
      name : string ;
      

      description : string ;
      
    }
    //#endregion

    
    type UpdateUserGroupStatusCode200Response = {
      content:JsonSuccess;
      
    }
    
    type UpdateUserGroupStatusCode400Response = {
      content:JsonError;
      
    }
    type UpdateUserGroupResult = UpdateUserGroupStatusCode200 of UpdateUserGroupStatusCode200Response|UpdateUserGroupStatusCode400 of UpdateUserGroupStatusCode400Response

    type UpdateUserGroupArgs = {
      pathParams:UpdateUserGroupPathParams;
      queryParams:Result<UpdateUserGroupQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateUserGroupMembersPathParams = {
      userGroupId : int ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type UpdateUserGroupMembersQueryParams = {
      delete : int[] option;
      

      add : int[] option;
      
    }
    //#endregion

    
    type UpdateUserGroupMembersStatusCode200Response = {
      content:JsonSuccess;
      
    }
    type UpdateUserGroupMembersResult = UpdateUserGroupMembersStatusCode200 of UpdateUserGroupMembersStatusCode200Response

    type UpdateUserGroupMembersArgs = {
      pathParams:UpdateUserGroupMembersPathParams;
      queryParams:Result<UpdateUserGroupMembersQueryParams,string>;
    }
    