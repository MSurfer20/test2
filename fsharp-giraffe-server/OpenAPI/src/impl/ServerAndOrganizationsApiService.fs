namespace OpenAPI
open OpenAPI.Model.JsonSuccess
open OpenAPI.Model.JsonSuccessBase
open ServerAndOrganizationsApiHandlerParams
open ServerAndOrganizationsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module ServerAndOrganizationsApiServiceImplementation =
    
    //#region Service implementation
    type ServerAndOrganizationsApiServiceImpl() = 
      interface IServerAndOrganizationsApiService with
      
        member this.AddCodePlayground ctx args =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AddCodePlaygroundStatusCode200 { content = content }

        member this.AddLinkifier ctx args =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AddLinkifierStatusCode200 { content = content }

        member this.CreateCustomProfileField ctx args =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateCustomProfileFieldStatusCode200 { content = content }

        member this.GetCustomEmoji ctx  =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetCustomEmojiStatusCode200 { content = content }

        member this.GetCustomProfileFields ctx  =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetCustomProfileFieldsStatusCode200 { content = content }

        member this.GetLinkifiers ctx  =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetLinkifiersStatusCode200 { content = content }

        member this.GetServerSettings ctx  =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetServerSettingsStatusCode200 { content = content }

        member this.RemoveCodePlayground ctx args =
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RemoveCodePlaygroundStatusCode200 { content = content }

        member this.RemoveLinkifier ctx args =
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RemoveLinkifierStatusCode200 { content = content }

        member this.ReorderCustomProfileFields ctx args =
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReorderCustomProfileFieldsStatusCode200 { content = content }

        member this.UpdateLinkifier ctx args =
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateLinkifierStatusCode200 { content = content }

        member this.UploadCustomEmoji ctx args =
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UploadCustomEmojiStatusCode200 { content = content }

      //#endregion

    let ServerAndOrganizationsApiService = ServerAndOrganizationsApiServiceImpl() :> IServerAndOrganizationsApiService