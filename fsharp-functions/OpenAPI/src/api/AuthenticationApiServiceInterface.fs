namespace OpenAPI
open AuthenticationApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module AuthenticationApiServiceInterface =
    
    //#region Service interface
    type IAuthenticationApiService = 
      abstract member DevFetchApiKey : unit -> DevFetchApiKeyResult
      abstract member FetchApiKey : unit -> FetchApiKeyResult
    //#endregion