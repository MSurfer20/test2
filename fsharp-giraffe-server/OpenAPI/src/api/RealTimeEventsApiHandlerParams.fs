namespace OpenAPI

open OpenAPI.Model.BadEventQueueIdError
open OpenAPI.Model.JsonSuccess
open OpenAPI.Model.JsonSuccessBase
open OpenAPI.Model.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError
open OpenAPI.Model.OneOfRateLimitedError
open OpenAPI.Model.OneOfUserDeactivatedErrorRealmDeactivatedError
open System.Collections.Generic
open System

module RealTimeEventsApiHandlerParams = 


    //#region Query parameters
    [<CLIMutable>]
    type DeleteQueueQueryParams = {
      queueId : string ;
      
    }
    //#endregion

    
    type DeleteQueueStatusCode200Response = {
      content:JsonSuccess;
      
    }
    
    type DeleteQueueStatusCode400Response = {
      content:BadEventQueueIdError;
      
    }
    type DeleteQueueResult = DeleteQueueStatusCode200 of DeleteQueueStatusCode200Response|DeleteQueueStatusCode400 of DeleteQueueStatusCode400Response

    type DeleteQueueArgs = {
      queryParams:Result<DeleteQueueQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type GetEventsQueryParams = {
      queueId : string ;
      

      lastEventId : int option;
      

      dontBlock : bool option;
      
    }
    //#endregion

    
    type GetEventsStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    
    type GetEventsStatusCode400Response = {
      content:BadEventQueueIdError;
      
    }
    type GetEventsResult = GetEventsStatusCode200 of GetEventsStatusCode200Response|GetEventsStatusCode400 of GetEventsStatusCode400Response

    type GetEventsArgs = {
      queryParams:Result<GetEventsQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type RealTimePostQueryParams = {
      eventTypes : string[] option;
      

      narrow : string[][] option;
      

      allPublicStreams : bool option;
      
    }
    //#endregion

    
    type RealTimePostStatusCode200Response = {
      content:string;
      
    }
    type RealTimePostResult = RealTimePostStatusCode200 of RealTimePostStatusCode200Response

    type RealTimePostArgs = {
      queryParams:Result<RealTimePostQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type RegisterQueueQueryParams = {
      applyMarkdown : bool option;
      

      clientGravatar : bool option;
      

      slimPresence : bool option;
      

      eventTypes : string[] option;
      

      allPublicStreams : bool option;
      

      includeSubscribers : bool option;
      

      clientCapabilities : obj option;
      

      fetchEventTypes : string[] option;
      

      narrow : string[][] option;
      
    }
    //#endregion

    
    type RegisterQueueStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type RegisterQueueResult = RegisterQueueStatusCode200 of RegisterQueueStatusCode200Response

    type RegisterQueueArgs = {
      queryParams:Result<RegisterQueueQueryParams,string>;
    }

    
    type RestErrorHandlingStatusCode400Response = {
      content:OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError;
      
    }
    
    type RestErrorHandlingStatusCode401Response = {
      content:OneOfUserDeactivatedErrorRealmDeactivatedError;
      
    }
    
    type RestErrorHandlingStatusCode429Response = {
      content:OneOfRateLimitedError;
      
    }
    type RestErrorHandlingResult = RestErrorHandlingStatusCode400 of RestErrorHandlingStatusCode400Response|RestErrorHandlingStatusCode401 of RestErrorHandlingStatusCode401Response|RestErrorHandlingStatusCode429 of RestErrorHandlingStatusCode429Response

    