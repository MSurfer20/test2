namespace OpenAPI
open StreamsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module StreamsApiServiceInterface =
    
    //#region Service interface
    type IStreamsApiService = 
      abstract member ArchiveStream:HttpContext -> ArchiveStreamArgs->ArchiveStreamResult
      abstract member CreateBigBlueButtonVideoCall:HttpContext ->CreateBigBlueButtonVideoCallResult
      abstract member GetStreamId:HttpContext -> GetStreamIdArgs->GetStreamIdResult
      abstract member GetStreamTopics:HttpContext -> GetStreamTopicsArgs->GetStreamTopicsResult
      abstract member GetStreams:HttpContext -> GetStreamsArgs->GetStreamsResult
      abstract member GetSubscriptionStatus:HttpContext -> GetSubscriptionStatusArgs->GetSubscriptionStatusResult
      abstract member GetSubscriptions:HttpContext -> GetSubscriptionsArgs->GetSubscriptionsResult
      abstract member MuteTopic:HttpContext -> MuteTopicArgs->MuteTopicResult
      abstract member Subscribe:HttpContext -> SubscribeArgs->SubscribeResult
      abstract member Unsubscribe:HttpContext -> UnsubscribeArgs->UnsubscribeResult
      abstract member UpdateStream:HttpContext -> UpdateStreamArgs->UpdateStreamResult
      abstract member UpdateSubscriptionSettings:HttpContext -> UpdateSubscriptionSettingsArgs->UpdateSubscriptionSettingsResult
      abstract member UpdateSubscriptions:HttpContext -> UpdateSubscriptionsArgs->UpdateSubscriptionsResult
    //#endregion