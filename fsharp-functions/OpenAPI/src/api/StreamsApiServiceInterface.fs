namespace OpenAPI
open StreamsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module StreamsApiServiceInterface =
    
    //#region Service interface
    type IStreamsApiService = 
      abstract member ArchiveStream : unit -> ArchiveStreamResult
      abstract member CreateBigBlueButtonVideoCall : unit -> CreateBigBlueButtonVideoCallResult
      abstract member GetStreamId : unit -> GetStreamIdResult
      abstract member GetStreamTopics : unit -> GetStreamTopicsResult
      abstract member GetStreams : unit -> GetStreamsResult
      abstract member GetSubscriptionStatus : unit -> GetSubscriptionStatusResult
      abstract member GetSubscriptions : unit -> GetSubscriptionsResult
      abstract member MuteTopic : unit -> MuteTopicResult
      abstract member Subscribe : unit -> SubscribeResult
      abstract member Unsubscribe : unit -> UnsubscribeResult
      abstract member UpdateStream : unit -> UpdateStreamResult
      abstract member UpdateSubscriptionSettings : unit -> UpdateSubscriptionSettingsResult
      abstract member UpdateSubscriptions : unit -> UpdateSubscriptionsResult
    //#endregion