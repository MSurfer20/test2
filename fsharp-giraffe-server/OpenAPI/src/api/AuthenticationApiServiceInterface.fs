namespace OpenAPI
open AuthenticationApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module AuthenticationApiServiceInterface =
    
    //#region Service interface
    type IAuthenticationApiService = 
      abstract member DevFetchApiKey:HttpContext -> DevFetchApiKeyArgs->DevFetchApiKeyResult
      abstract member FetchApiKey:HttpContext -> FetchApiKeyArgs->FetchApiKeyResult
    //#endregion