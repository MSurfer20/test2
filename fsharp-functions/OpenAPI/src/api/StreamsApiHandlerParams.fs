namespace OpenAPI

open OpenAPI.Model.CodedError
open OpenAPI.Model.JsonError
open OpenAPI.Model.JsonSuccess
open OpenAPI.Model.JsonSuccessBase
open OpenAPI.Model.NonExistingStreamError
open OpenAPI.Model.OneOfobjectobject
open OpenAPI.Model.OneOfstringinteger
open System.Collections.Generic
open System

module StreamsApiHandlerParams = 

    //#region Path parameters
    [<CLIMutable>]
    type ArchiveStreamPathParams = {
      streamId : int ;
    }
    //#endregion

    
    type ArchiveStreamStatusCode200Response = {
      content:JsonSuccess;
      
    }
    
    type ArchiveStreamStatusCode400Response = {
      content:JsonError;
      
    }
    type ArchiveStreamResult = ArchiveStreamStatusCode200 of ArchiveStreamStatusCode200Response|ArchiveStreamStatusCode400 of ArchiveStreamStatusCode400Response

    type ArchiveStreamArgs = {
      pathParams:ArchiveStreamPathParams;
    }

    
    type CreateBigBlueButtonVideoCallStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type CreateBigBlueButtonVideoCallResult = CreateBigBlueButtonVideoCallStatusCode200 of CreateBigBlueButtonVideoCallStatusCode200Response

    //#region Path parameters
    [<CLIMutable>]
    type DeleteTopicPathParams = {
      streamId : int ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type DeleteTopicQueryParams = {
      topicName : string ;
      
    }
    //#endregion

    
    type DeleteTopicStatusCode200Response = {
      content:JsonSuccess;
      
    }
    
    type DeleteTopicStatusCode400Response = {
      content:JsonError;
      
    }
    type DeleteTopicResult = DeleteTopicStatusCode200 of DeleteTopicStatusCode200Response|DeleteTopicStatusCode400 of DeleteTopicStatusCode400Response

    type DeleteTopicArgs = {
      pathParams:DeleteTopicPathParams;
      queryParams:Result<DeleteTopicQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type GetStreamIdQueryParams = {
      stream : string ;
      
    }
    //#endregion

    
    type GetStreamIdStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    
    type GetStreamIdStatusCode400Response = {
      content:CodedError;
      
    }
    type GetStreamIdResult = GetStreamIdStatusCode200 of GetStreamIdStatusCode200Response|GetStreamIdStatusCode400 of GetStreamIdStatusCode400Response

    type GetStreamIdArgs = {
      queryParams:Result<GetStreamIdQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetStreamTopicsPathParams = {
      streamId : int ;
    }
    //#endregion

    
    type GetStreamTopicsStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    
    type GetStreamTopicsStatusCode400Response = {
      content:JsonError;
      
    }
    type GetStreamTopicsResult = GetStreamTopicsStatusCode200 of GetStreamTopicsStatusCode200Response|GetStreamTopicsStatusCode400 of GetStreamTopicsStatusCode400Response

    type GetStreamTopicsArgs = {
      pathParams:GetStreamTopicsPathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type GetStreamsQueryParams = {
      includePublic : bool option;
      

      includeWebPublic : bool option;
      

      includeSubscribed : bool option;
      

      includeAllActive : bool option;
      

      includeDefault : bool option;
      

      includeOwnerSubscribed : bool option;
      
    }
    //#endregion

    
    type GetStreamsStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    
    type GetStreamsStatusCode400Response = {
      content:CodedError;
      
    }
    type GetStreamsResult = GetStreamsStatusCode200 of GetStreamsStatusCode200Response|GetStreamsStatusCode400 of GetStreamsStatusCode400Response

    type GetStreamsArgs = {
      queryParams:Result<GetStreamsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetSubscribersPathParams = {
      streamId : int ;
    }
    //#endregion

    
    type GetSubscribersStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    
    type GetSubscribersStatusCode400Response = {
      content:JsonError;
      
    }
    type GetSubscribersResult = GetSubscribersStatusCode200 of GetSubscribersStatusCode200Response|GetSubscribersStatusCode400 of GetSubscribersStatusCode400Response

    type GetSubscribersArgs = {
      pathParams:GetSubscribersPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetSubscriptionStatusPathParams = {
      userId : int ;
    //#endregion
      streamId : int ;
    }
    //#endregion

    
    type GetSubscriptionStatusStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type GetSubscriptionStatusResult = GetSubscriptionStatusStatusCode200 of GetSubscriptionStatusStatusCode200Response

    type GetSubscriptionStatusArgs = {
      pathParams:GetSubscriptionStatusPathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type GetSubscriptionsQueryParams = {
      includeSubscribers : bool option;
      
    }
    //#endregion

    
    type GetSubscriptionsStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type GetSubscriptionsResult = GetSubscriptionsStatusCode200 of GetSubscriptionsStatusCode200Response

    type GetSubscriptionsArgs = {
      queryParams:Result<GetSubscriptionsQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type MuteTopicQueryParams = {
      stream : string option;
      

      streamId : int option;
      

      topic : string ;
      

      op : string ;
      
    }
    //#endregion

    
    type MuteTopicStatusCode200Response = {
      content:JsonSuccess;
      
    }
    
    type MuteTopicStatusCode400Response = {
      content:OneOfobjectobject;
      
    }
    type MuteTopicResult = MuteTopicStatusCode200 of MuteTopicStatusCode200Response|MuteTopicStatusCode400 of MuteTopicStatusCode400Response

    type MuteTopicArgs = {
      queryParams:Result<MuteTopicQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type SubscribeQueryParams = {
      subscriptions : obj[] ;
      

      principals : OneOfstringinteger[] option;
      

      authorizationErrorsFatal : bool option;
      

      announce : bool option;
      

      inviteOnly : bool option;
      

      historyPublicToSubscribers : bool option;
      

      streamPostPolicy : int option;
      

      messageRetentionDays : OneOfstringinteger option;
      
    }
    //#endregion

    
    type SubscribeStatusCode200Response = {
      content:OneOfobjectobject;
      
    }
    
    type SubscribeStatusCode400Response = {
      content:OneOfobjectobject;
      
    }
    type SubscribeResult = SubscribeStatusCode200 of SubscribeStatusCode200Response|SubscribeStatusCode400 of SubscribeStatusCode400Response

    type SubscribeArgs = {
      queryParams:Result<SubscribeQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type UnsubscribeQueryParams = {
      subscriptions : string[] ;
      

      principals : OneOfstringinteger[] option;
      
    }
    //#endregion

    
    type UnsubscribeStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    
    type UnsubscribeStatusCode400Response = {
      content:NonExistingStreamError;
      
    }
    type UnsubscribeResult = UnsubscribeStatusCode200 of UnsubscribeStatusCode200Response|UnsubscribeStatusCode400 of UnsubscribeStatusCode400Response

    type UnsubscribeArgs = {
      queryParams:Result<UnsubscribeQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateStreamPathParams = {
      streamId : int ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type UpdateStreamQueryParams = {
      description : string option;
      

      newName : string option;
      

      isPrivate : bool option;
      

      isAnnouncementOnly : bool option;
      

      streamPostPolicy : int option;
      

      historyPublicToSubscribers : bool option;
      

      messageRetentionDays : OneOfstringinteger option;
      
    }
    //#endregion

    
    type UpdateStreamStatusCode200Response = {
      content:JsonSuccess;
      
    }
    
    type UpdateStreamStatusCode400Response = {
      content:JsonError;
      
    }
    type UpdateStreamResult = UpdateStreamStatusCode200 of UpdateStreamStatusCode200Response|UpdateStreamStatusCode400 of UpdateStreamStatusCode400Response

    type UpdateStreamArgs = {
      pathParams:UpdateStreamPathParams;
      queryParams:Result<UpdateStreamQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type UpdateSubscriptionSettingsQueryParams = {
      subscriptionData : obj[] ;
      
    }
    //#endregion

    
    type UpdateSubscriptionSettingsStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type UpdateSubscriptionSettingsResult = UpdateSubscriptionSettingsStatusCode200 of UpdateSubscriptionSettingsStatusCode200Response

    type UpdateSubscriptionSettingsArgs = {
      queryParams:Result<UpdateSubscriptionSettingsQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type UpdateSubscriptionsQueryParams = {
      delete : string[] option;
      

      add : obj[] option;
      
    }
    //#endregion

    
    type UpdateSubscriptionsStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type UpdateSubscriptionsResult = UpdateSubscriptionsStatusCode200 of UpdateSubscriptionsStatusCode200Response

    type UpdateSubscriptionsArgs = {
      queryParams:Result<UpdateSubscriptionsQueryParams,string>;
    }
    