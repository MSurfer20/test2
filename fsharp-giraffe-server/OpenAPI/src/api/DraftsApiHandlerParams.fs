namespace OpenAPI

open OpenAPI.Model.CodedError
open OpenAPI.Model.Draft
open OpenAPI.Model.JsonError
open OpenAPI.Model.JsonSuccess
open System.Collections.Generic
open System

module DraftsApiHandlerParams = 


    //#region Query parameters
    [<CLIMutable>]
    type CreateDraftsQueryParams = {
      drafts : Draft[] option;
      
    }
    //#endregion

    
    type CreateDraftsStatusCode200Response = {
      content:JsonSuccess;
      
    }
    
    type CreateDraftsStatusCode400Response = {
      content:CodedError;
      
    }
    type CreateDraftsResult = CreateDraftsStatusCode200 of CreateDraftsStatusCode200Response|CreateDraftsStatusCode400 of CreateDraftsStatusCode400Response

    type CreateDraftsArgs = {
      queryParams:Result<CreateDraftsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteDraftPathParams = {
      draftId : int ;
    }
    //#endregion

    
    type DeleteDraftStatusCode200Response = {
      content:JsonSuccess;
      
    }
    
    type DeleteDraftStatusCode404Response = {
      content:JsonError;
      
    }
    type DeleteDraftResult = DeleteDraftStatusCode200 of DeleteDraftStatusCode200Response|DeleteDraftStatusCode404 of DeleteDraftStatusCode404Response

    type DeleteDraftArgs = {
      pathParams:DeleteDraftPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type EditDraftPathParams = {
      draftId : int ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type EditDraftQueryParams = {
      draft : Draft ;
      
    }
    //#endregion

    
    type EditDraftStatusCode200Response = {
      content:JsonSuccess;
      
    }
    
    type EditDraftStatusCode404Response = {
      content:JsonError;
      
    }
    type EditDraftResult = EditDraftStatusCode200 of EditDraftStatusCode200Response|EditDraftStatusCode404 of EditDraftStatusCode404Response

    type EditDraftArgs = {
      pathParams:EditDraftPathParams;
      queryParams:Result<EditDraftQueryParams,string>;
    }

    
    type GetDraftsStatusCode200Response = {
      content:JsonSuccess;
      
    }
    type GetDraftsResult = GetDraftsStatusCode200 of GetDraftsStatusCode200Response

    