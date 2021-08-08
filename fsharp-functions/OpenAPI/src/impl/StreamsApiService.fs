namespace OpenAPI
open OpenAPI.Model.CodedError
open OpenAPI.Model.JsonError
open OpenAPI.Model.JsonSuccess
open OpenAPI.Model.JsonSuccessBase
open OpenAPI.Model.NonExistingStreamError
open OpenAPI.Model.OneOfobjectobject
open OpenAPI.Model.OneOfstringinteger
open StreamsApiHandlerParams
open StreamsApiServiceInterface
open System.Collections.Generic
open System

module StreamsApiServiceImplementation =
    
    //#region Service implementation
    type StreamsApiServiceImpl() = 
      interface IStreamsApiService with
      
        member this.ArchiveStream () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ArchiveStreamStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> JsonError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ArchiveStreamStatusCode400 { content = content }

        member this.CreateBigBlueButtonVideoCall () =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateBigBlueButtonVideoCallStatusCode200 { content = content }

        member this.GetStreamId () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetStreamIdStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> CodedError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetStreamIdStatusCode400 { content = content }

        member this.GetStreamTopics () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetStreamTopicsStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> JsonError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetStreamTopicsStatusCode400 { content = content }

        member this.GetStreams () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetStreamsStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> CodedError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetStreamsStatusCode400 { content = content }

        member this.GetSubscriptionStatus () =
            let content = "Success" :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSubscriptionStatusStatusCode200 { content = content }

        member this.GetSubscriptions () =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSubscriptionsStatusCode200 { content = content }

        member this.MuteTopic () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MuteTopicStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> OneOfobjectobject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MuteTopicStatusCode400 { content = content }

        member this.Subscribe () =
          if true then 
            let content = "Success." :> obj :?> OneOfobjectobject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SubscribeStatusCode200 { content = content }
          else
            let content = "Success." :> obj :?> OneOfobjectobject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SubscribeStatusCode400 { content = content }

        member this.Unsubscribe () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UnsubscribeStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> NonExistingStreamError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UnsubscribeStatusCode400 { content = content }

        member this.UpdateStream () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateStreamStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> JsonError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateStreamStatusCode400 { content = content }

        member this.UpdateSubscriptionSettings () =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateSubscriptionSettingsStatusCode200 { content = content }

        member this.UpdateSubscriptions () =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateSubscriptionsStatusCode200 { content = content }

      //#endregion

    let StreamsApiService = StreamsApiServiceImpl() :> IStreamsApiService