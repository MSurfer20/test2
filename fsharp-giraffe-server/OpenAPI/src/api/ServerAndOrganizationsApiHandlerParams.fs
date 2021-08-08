namespace OpenAPI

open OpenAPI.Model.JsonSuccess
open OpenAPI.Model.JsonSuccessBase
open System.Collections.Generic
open System

module ServerAndOrganizationsApiHandlerParams = 


    //#region Query parameters
    [<CLIMutable>]
    type AddCodePlaygroundQueryParams = {
      name : string ;
      

      pygmentsLanguage : string ;
      

      urlPrefix : string ;
      
    }
    //#endregion

    
    type AddCodePlaygroundStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type AddCodePlaygroundResult = AddCodePlaygroundStatusCode200 of AddCodePlaygroundStatusCode200Response

    type AddCodePlaygroundArgs = {
      queryParams:Result<AddCodePlaygroundQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type AddLinkifierQueryParams = {
      pattern : string ;
      

      urlFormatString : string ;
      
    }
    //#endregion

    
    type AddLinkifierStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type AddLinkifierResult = AddLinkifierStatusCode200 of AddLinkifierStatusCode200Response

    type AddLinkifierArgs = {
      queryParams:Result<AddLinkifierQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type CreateCustomProfileFieldQueryParams = {
      name : string option;
      

      hint : string option;
      

      fieldType : int ;
      

      fieldData : obj option;
      
    }
    //#endregion

    
    type CreateCustomProfileFieldStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type CreateCustomProfileFieldResult = CreateCustomProfileFieldStatusCode200 of CreateCustomProfileFieldStatusCode200Response

    type CreateCustomProfileFieldArgs = {
      queryParams:Result<CreateCustomProfileFieldQueryParams,string>;
    }

    
    type GetCustomEmojiStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type GetCustomEmojiResult = GetCustomEmojiStatusCode200 of GetCustomEmojiStatusCode200Response


    
    type GetCustomProfileFieldsStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type GetCustomProfileFieldsResult = GetCustomProfileFieldsStatusCode200 of GetCustomProfileFieldsStatusCode200Response


    
    type GetLinkifiersStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type GetLinkifiersResult = GetLinkifiersStatusCode200 of GetLinkifiersStatusCode200Response


    
    type GetServerSettingsStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type GetServerSettingsResult = GetServerSettingsStatusCode200 of GetServerSettingsStatusCode200Response

    //#region Path parameters
    [<CLIMutable>]
    type RemoveCodePlaygroundPathParams = {
      playgroundId : int ;
    }
    //#endregion

    
    type RemoveCodePlaygroundStatusCode200Response = {
      content:JsonSuccess;
      
    }
    type RemoveCodePlaygroundResult = RemoveCodePlaygroundStatusCode200 of RemoveCodePlaygroundStatusCode200Response

    type RemoveCodePlaygroundArgs = {
      pathParams:RemoveCodePlaygroundPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type RemoveLinkifierPathParams = {
      filterId : int ;
    }
    //#endregion

    
    type RemoveLinkifierStatusCode200Response = {
      content:JsonSuccess;
      
    }
    type RemoveLinkifierResult = RemoveLinkifierStatusCode200 of RemoveLinkifierStatusCode200Response

    type RemoveLinkifierArgs = {
      pathParams:RemoveLinkifierPathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type ReorderCustomProfileFieldsQueryParams = {
      order : int[] ;
      
    }
    //#endregion

    
    type ReorderCustomProfileFieldsStatusCode200Response = {
      content:JsonSuccess;
      
    }
    type ReorderCustomProfileFieldsResult = ReorderCustomProfileFieldsStatusCode200 of ReorderCustomProfileFieldsStatusCode200Response

    type ReorderCustomProfileFieldsArgs = {
      queryParams:Result<ReorderCustomProfileFieldsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateLinkifierPathParams = {
      filterId : int ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type UpdateLinkifierQueryParams = {
      pattern : string ;
      

      urlFormatString : string ;
      
    }
    //#endregion

    
    type UpdateLinkifierStatusCode200Response = {
      content:JsonSuccess;
      
    }
    type UpdateLinkifierResult = UpdateLinkifierStatusCode200 of UpdateLinkifierStatusCode200Response

    type UpdateLinkifierArgs = {
      pathParams:UpdateLinkifierPathParams;
      queryParams:Result<UpdateLinkifierQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type UploadCustomEmojiPathParams = {
      emojiName : string ;
    }
    //#endregion

    //#region Form parameters
    [<CLIMutable>]
    type UploadCustomEmojiFormParams = {
      filename : System.IO.Stream option;
    }
    //#endregion

    
    type UploadCustomEmojiStatusCode200Response = {
      content:JsonSuccess;
      
    }
    type UploadCustomEmojiResult = UploadCustomEmojiStatusCode200 of UploadCustomEmojiStatusCode200Response

    type UploadCustomEmojiArgs = {
      pathParams:UploadCustomEmojiPathParams;
      formParams:Result<UploadCustomEmojiFormParams,string>
    }
    