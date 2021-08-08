namespace OpenAPI
open OpenAPI.Model.JsonSuccess
open OpenAPI.Model.JsonSuccessBase
open ServerAndOrganizationsApiHandlerParams
open ServerAndOrganizationsApiServiceInterface
open System.Collections.Generic
open System

module ServerAndOrganizationsApiServiceImplementation =
    
    //#region Service implementation
    type ServerAndOrganizationsApiServiceImpl() = 
      interface IServerAndOrganizationsApiService with
      
        member this.AddCodePlayground () =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AddCodePlaygroundStatusCode200 { content = content }

        member this.AddLinkifier () =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AddLinkifierStatusCode200 { content = content }

        member this.CreateCustomProfileField () =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateCustomProfileFieldStatusCode200 { content = content }

        member this.GetCustomEmoji () =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetCustomEmojiStatusCode200 { content = content }

        member this.GetCustomProfileFields () =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetCustomProfileFieldsStatusCode200 { content = content }

        member this.GetLinkifiers () =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetLinkifiersStatusCode200 { content = content }

        member this.GetServerSettings () =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetServerSettingsStatusCode200 { content = content }

        member this.RemoveCodePlayground () =
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RemoveCodePlaygroundStatusCode200 { content = content }

        member this.RemoveLinkifier () =
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RemoveLinkifierStatusCode200 { content = content }

        member this.ReorderCustomProfileFields () =
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReorderCustomProfileFieldsStatusCode200 { content = content }

        member this.UpdateLinkifier () =
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateLinkifierStatusCode200 { content = content }

        member this.UploadCustomEmoji () =
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UploadCustomEmojiStatusCode200 { content = content }

      //#endregion

    let ServerAndOrganizationsApiService = ServerAndOrganizationsApiServiceImpl() :> IServerAndOrganizationsApiService