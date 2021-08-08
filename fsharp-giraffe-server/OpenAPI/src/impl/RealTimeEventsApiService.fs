namespace OpenAPI
open OpenAPI.Model.BadEventQueueIdError
open OpenAPI.Model.JsonSuccess
open OpenAPI.Model.JsonSuccessBase
open OpenAPI.Model.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError
open OpenAPI.Model.OneOfRateLimitedError
open OpenAPI.Model.OneOfUserDeactivatedErrorRealmDeactivatedError
open RealTimeEventsApiHandlerParams
open RealTimeEventsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module RealTimeEventsApiServiceImplementation =
    
    //#region Service implementation
    type RealTimeEventsApiServiceImpl() = 
      interface IRealTimeEventsApiService with
      
        member this.DeleteQueue ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteQueueStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> BadEventQueueIdError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteQueueStatusCode400 { content = content }

        member this.GetEvents ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetEventsStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> BadEventQueueIdError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetEventsStatusCode400 { content = content }

        member this.RealTimePost ctx args =
            let content = "Success" 
            RealTimePostStatusCode200 { content = content }

        member this.RegisterQueue ctx args =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RegisterQueueStatusCode200 { content = content }

        member this.RestErrorHandling ctx  =
          if true then 
            let content = "Bad request. " :> obj :?> OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RestErrorHandlingStatusCode400 { content = content }
          else if true then 
            let content = "Unauthorized. " :> obj :?> OneOfUserDeactivatedErrorRealmDeactivatedError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RestErrorHandlingStatusCode401 { content = content }
          else
            let content = "Rate limit exceeded. " :> obj :?> OneOfRateLimitedError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RestErrorHandlingStatusCode429 { content = content }

      //#endregion

    let RealTimeEventsApiService = RealTimeEventsApiServiceImpl() :> IRealTimeEventsApiService