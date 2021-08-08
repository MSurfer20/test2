namespace OpenAPI
open DraftsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module DraftsApiServiceInterface =
    
    //#region Service interface
    type IDraftsApiService = 
      abstract member CreateDrafts:HttpContext -> CreateDraftsArgs->CreateDraftsResult
      abstract member DeleteDraft:HttpContext -> DeleteDraftArgs->DeleteDraftResult
      abstract member EditDraft:HttpContext -> EditDraftArgs->EditDraftResult
      abstract member GetDrafts:HttpContext ->GetDraftsResult
    //#endregion