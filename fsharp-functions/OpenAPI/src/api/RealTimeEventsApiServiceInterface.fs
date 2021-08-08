namespace OpenAPI
open RealTimeEventsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module RealTimeEventsApiServiceInterface =
    
    //#region Service interface
    type IRealTimeEventsApiService = 
      abstract member DeleteQueue : unit -> DeleteQueueResult
      abstract member GetEvents : unit -> GetEventsResult
      abstract member RealTimePost : unit -> RealTimePostResult
      abstract member RegisterQueue : unit -> RegisterQueueResult
      abstract member RestErrorHandling : unit -> RestErrorHandlingResult
    //#endregion