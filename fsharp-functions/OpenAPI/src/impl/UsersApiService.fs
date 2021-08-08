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

module UsersApiServiceImplementation =
    
    //#region Service implementation
    type UsersApiServiceImpl() = 
      interface IUsersApiService with
      
        member this.CreateUser () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateUserStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> JsonError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateUserStatusCode400 { content = content }

        member this.CreateUserGroup () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateUserGroupStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> JsonError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateUserGroupStatusCode400 { content = content }

        member this.DeactivateOwnUser () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeactivateOwnUserStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> JsonError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeactivateOwnUserStatusCode400 { content = content }

        member this.DeactivateUser () =
          if true then 
            let content = "Success" :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeactivateUserStatusCode200 { content = content }
          else
            let content = "Bad request" :> obj :?> JsonError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeactivateUserStatusCode400 { content = content }

        member this.GetAttachments () =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetAttachmentsStatusCode200 { content = content }

        member this.GetOwnUser () =
            let content = "Success" :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetOwnUserStatusCode200 { content = content }

        member this.GetUser () =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetUserStatusCode200 { content = content }

        member this.GetUserByEmail () =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetUserByEmailStatusCode200 { content = content }

        member this.GetUserGroups () =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetUserGroupsStatusCode200 { content = content }

        member this.GetUserPresence () =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetUserPresenceStatusCode200 { content = content }

        member this.GetUsers () =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetUsersStatusCode200 { content = content }

        member this.MuteUser () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MuteUserStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> OneOfobjectobjectobject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MuteUserStatusCode400 { content = content }

        member this.ReactivateUser () =
            let content = "Success" :> obj :?> AnyType // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReactivateUserStatusCode200 { content = content }

        member this.RemoveUserGroup () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RemoveUserGroupStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> JsonError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RemoveUserGroupStatusCode400 { content = content }

        member this.SetTypingStatus () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SetTypingStatusStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> JsonError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SetTypingStatusStatusCode400 { content = content }

        member this.UnmuteUser () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UnmuteUserStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> OneOfobjectobject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UnmuteUserStatusCode400 { content = content }

        member this.UpdateSettings () =
            let content = "Success" :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateSettingsStatusCode200 { content = content }

        member this.UpdateStatus () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateStatusStatusCode200 { content = content }
          else
            let content = "Success." :> obj :?> OneOfobjectobjectobjectobjectobjectobject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateStatusStatusCode400 { content = content }

        member this.UpdateUser () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateUserStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> CodedError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateUserStatusCode400 { content = content }

        member this.UpdateUserGroup () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateUserGroupStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> JsonError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateUserGroupStatusCode400 { content = content }

        member this.UpdateUserGroupMembers () =
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateUserGroupMembersStatusCode200 { content = content }

      //#endregion

    let UsersApiService = UsersApiServiceImpl() :> IUsersApiService