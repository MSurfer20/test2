namespace OpenAPI
open RealTimeEventsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module RealTimeEventsApiServiceInterface =
    
    //#region Service interface
    type IRealTimeEventsApiService = 
      abstract member DeleteQueue:HttpContext -> DeleteQueueArgs->DeleteQueueResult
      abstract member GetEvents:HttpContext -> GetEventsArgs->GetEventsResult
      abstract member RealTimePost:HttpContext -> RealTimePostArgs->RealTimePostResult
      abstract member RegisterQueue:HttpContext -> RegisterQueueArgs->RegisterQueueResult
      abstract member RestErrorHandling:HttpContext ->RestErrorHandlingResult
    //#endregion