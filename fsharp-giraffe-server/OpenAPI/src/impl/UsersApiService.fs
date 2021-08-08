namespace OpenAPI
open OpenAPI.Model.AnyType
open OpenAPI.Model.CodedError
open OpenAPI.Model.JsonError
open OpenAPI.Model.JsonSuccess
open OpenAPI.Model.JsonSuccessBase
open OpenAPI.Model.OneOfobjectobject
open OpenAPI.Model.OneOfobjectobjectobject
open OpenAPI.Model.OneOfobjectobjectobjectobjectobjectobject
open UsersApiHandlerParams
open UsersApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module UsersApiServiceImplementation =
    
    //#region Service implementation
    type UsersApiServiceImpl() = 
      interface IUsersApiService with
      
        member this.CreateUser ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateUserStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> JsonError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateUserStatusCode400 { content = content }

        member this.CreateUserGroup ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateUserGroupStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> JsonError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateUserGroupStatusCode400 { content = content }

        member this.DeactivateOwnUser ctx  =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeactivateOwnUserStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> JsonError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeactivateOwnUserStatusCode400 { content = content }

        member this.DeactivateUser ctx args =
          if true then 
            let content = "Success" :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeactivateUserStatusCode200 { content = content }
          else
            let content = "Bad request" :> obj :?> JsonError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeactivateUserStatusCode400 { content = content }

        member this.GetAttachments ctx  =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetAttachmentsStatusCode200 { content = content }

        member this.GetOwnUser ctx  =
            let content = "Success" :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOwnUserStatusCode200 { content = content }

        member this.GetUser ctx args =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetUserStatusCode200 { content = content }

        member this.GetUserByEmail ctx args =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetUserByEmailStatusCode200 { content = content }

        member this.GetUserGroups ctx  =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetUserGroupsStatusCode200 { content = content }

        member this.GetUserPresence ctx args =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetUserPresenceStatusCode200 { content = content }

        member this.GetUsers ctx args =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetUsersStatusCode200 { content = content }

        member this.MuteUser ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MuteUserStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> OneOfobjectobjectobject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MuteUserStatusCode400 { content = content }

        member this.ReactivateUser ctx args =
            let content = "Success" :> obj :?> AnyType // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReactivateUserStatusCode200 { content = content }

        member this.RemoveUserGroup ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RemoveUserGroupStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> JsonError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RemoveUserGroupStatusCode400 { content = content }

        member this.SetTypingStatus ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SetTypingStatusStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> JsonError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SetTypingStatusStatusCode400 { content = content }

        member this.UnmuteUser ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UnmuteUserStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> OneOfobjectobject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UnmuteUserStatusCode400 { content = content }

        member this.UpdateSettings ctx args =
            let content = "Success" :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateSettingsStatusCode200 { content = content }

        member this.UpdateStatus ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateStatusStatusCode200 { content = content }
          else
            let content = "Success." :> obj :?> OneOfobjectobjectobjectobjectobjectobject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateStatusStatusCode400 { content = content }

        member this.UpdateUser ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateUserStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> CodedError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateUserStatusCode400 { content = content }

        member this.UpdateUserGroup ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateUserGroupStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> JsonError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateUserGroupStatusCode400 { content = content }

        member this.UpdateUserGroupMembers ctx args =
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateUserGroupMembersStatusCode200 { content = content }

      //#endregion

    let UsersApiService = UsersApiServiceImpl() :> IUsersApiService