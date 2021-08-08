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
open Giraffe

module StreamsApiServiceImplementation =
    
    //#region Service implementation
    type StreamsApiServiceImpl() = 
      interface IStreamsApiService with
      
        member this.ArchiveStream ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ArchiveStreamStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> JsonError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ArchiveStreamStatusCode400 { content = content }

        member this.CreateBigBlueButtonVideoCall ctx  =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateBigBlueButtonVideoCallStatusCode200 { content = content }

        member this.GetStreamId ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetStreamIdStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> CodedError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetStreamIdStatusCode400 { content = content }

        member this.GetStreamTopics ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetStreamTopicsStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> JsonError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetStreamTopicsStatusCode400 { content = content }

        member this.GetStreams ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetStreamsStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> CodedError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetStreamsStatusCode400 { content = content }

        member this.GetSubscriptionStatus ctx args =
            let content = "Success" :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSubscriptionStatusStatusCode200 { content = content }

        member this.GetSubscriptions ctx args =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetSubscriptionsStatusCode200 { content = content }

        member this.MuteTopic ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MuteTopicStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> OneOfobjectobject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MuteTopicStatusCode400 { content = content }

        member this.Subscribe ctx args =
          if true then 
            let content = "Success." :> obj :?> OneOfobjectobject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SubscribeStatusCode200 { content = content }
          else
            let content = "Success." :> obj :?> OneOfobjectobject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SubscribeStatusCode400 { content = content }

        member this.Unsubscribe ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UnsubscribeStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> NonExistingStreamError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UnsubscribeStatusCode400 { content = content }

        member this.UpdateStream ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateStreamStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> JsonError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateStreamStatusCode400 { content = content }

        member this.UpdateSubscriptionSettings ctx args =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateSubscriptionSettingsStatusCode200 { content = content }

        member this.UpdateSubscriptions ctx args =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateSubscriptionsStatusCode200 { content = content }

      //#endregion

    let StreamsApiService = StreamsApiServiceImpl() :> IStreamsApiService