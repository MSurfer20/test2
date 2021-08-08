namespace OpenAPI
open ServerAndOrganizationsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ServerAndOrganizationsApiServiceInterface =
    
    //#region Service interface
    type IServerAndOrganizationsApiService = 
      abstract member AddCodePlayground : unit -> AddCodePlaygroundResult
      abstract member AddLinkifier : unit -> AddLinkifierResult
      abstract member CreateCustomProfileField : unit -> CreateCustomProfileFieldResult
      abstract member GetCustomEmoji : unit -> GetCustomEmojiResult
      abstract member GetCustomProfileFields : unit -> GetCustomProfileFieldsResult
      abstract member GetLinkifiers : unit -> GetLinkifiersResult
      abstract member GetServerSettings : unit -> GetServerSettingsResult
      abstract member RemoveCodePlayground : unit -> RemoveCodePlaygroundResult
      abstract member RemoveLinkifier : unit -> RemoveLinkifierResult
      abstract member ReorderCustomProfileFields : unit -> ReorderCustomProfileFieldsResult
      abstract member UpdateLinkifier : unit -> UpdateLinkifierResult
      abstract member UploadCustomEmoji : unit -> UploadCustomEmojiResult
    //#endregion