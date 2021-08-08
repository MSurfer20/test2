namespace OpenAPI

open OpenAPI.Model.ApiKeyResponse
open System.Collections.Generic
open System

module AuthenticationApiHandlerParams = 


    //#region Query parameters
    [<CLIMutable>]
    type DevFetchApiKeyQueryParams = {
      username : string ;
      
    }
    //#endregion

    
    type DevFetchApiKeyStatusCode200Response = {
      content:ApiKeyResponse;
      
    }
    type DevFetchApiKeyResult = DevFetchApiKeyStatusCode200 of DevFetchApiKeyStatusCode200Response

    type DevFetchApiKeyArgs = {
      queryParams:Result<DevFetchApiKeyQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type FetchApiKeyQueryParams = {
      username : string ;
      

      password : string ;
      
    }
    //#endregion

    
    type FetchApiKeyStatusCode200Response = {
      content:ApiKeyResponse;
      
    }
    type FetchApiKeyResult = FetchApiKeyStatusCode200 of FetchApiKeyStatusCode200Response

    type FetchApiKeyArgs = {
      queryParams:Result<FetchApiKeyQueryParams,string>;
    }
    