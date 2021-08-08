namespace OpenAPI
open DraftsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module DraftsApiServiceInterface =
    
    //#region Service interface
    type IDraftsApiService = 
      abstract member CreateDrafts : unit -> CreateDraftsResult
      abstract member DeleteDraft : unit -> DeleteDraftResult
      abstract member EditDraft : unit -> EditDraftResult
      abstract member GetDrafts : unit -> GetDraftsResult
    //#endregion