namespace OpenAPI
open OpenAPI.Model.ApiKeyResponse
open AuthenticationApiHandlerParams
open AuthenticationApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module AuthenticationApiServiceImplementation =
    
    //#region Service implementation
    type AuthenticationApiServiceImpl() = 
      interface IAuthenticationApiService with
      
        member this.DevFetchApiKey ctx args =
            let content = "Success." :> obj :?> ApiKeyResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DevFetchApiKeyStatusCode200 { content = content }

        member this.FetchApiKey ctx args =
            let content = "Valid credentials the client can use to access the Zulip API." :> obj :?> ApiKeyResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            FetchApiKeyStatusCode200 { content = content }

      //#endregion

    let AuthenticationApiService = AuthenticationApiServiceImpl() :> IAuthenticationApiService