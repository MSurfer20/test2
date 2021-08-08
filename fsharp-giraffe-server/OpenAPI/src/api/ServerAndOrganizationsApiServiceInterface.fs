namespace OpenAPI
open ServerAndOrganizationsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ServerAndOrganizationsApiServiceInterface =
    
    //#region Service interface
    type IServerAndOrganizationsApiService = 
      abstract member AddCodePlayground:HttpContext -> AddCodePlaygroundArgs->AddCodePlaygroundResult
      abstract member AddLinkifier:HttpContext -> AddLinkifierArgs->AddLinkifierResult
      abstract member CreateCustomProfileField:HttpContext -> CreateCustomProfileFieldArgs->CreateCustomProfileFieldResult
      abstract member GetCustomEmoji:HttpContext ->GetCustomEmojiResult
      abstract member GetCustomProfileFields:HttpContext ->GetCustomProfileFieldsResult
      abstract member GetLinkifiers:HttpContext ->GetLinkifiersResult
      abstract member GetServerSettings:HttpContext ->GetServerSettingsResult
      abstract member RemoveCodePlayground:HttpContext -> RemoveCodePlaygroundArgs->RemoveCodePlaygroundResult
      abstract member RemoveLinkifier:HttpContext -> RemoveLinkifierArgs->RemoveLinkifierResult
      abstract member ReorderCustomProfileFields:HttpContext -> ReorderCustomProfileFieldsArgs->ReorderCustomProfileFieldsResult
      abstract member UpdateLinkifier:HttpContext -> UpdateLinkifierArgs->UpdateLinkifierResult
      abstract member UploadCustomEmoji:HttpContext -> UploadCustomEmojiArgs->UploadCustomEmojiResult
    //#endregion