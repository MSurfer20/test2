namespace OpenAPI
open OpenAPI.Model.CodedError
open OpenAPI.Model.Draft
open OpenAPI.Model.JsonError
open OpenAPI.Model.JsonSuccess
open DraftsApiHandlerParams
open DraftsApiServiceInterface
open System.Collections.Generic
open System

module DraftsApiServiceImplementation =
    
    //#region Service implementation
    type DraftsApiServiceImpl() = 
      interface IDraftsApiService with
      
        member this.CreateDrafts () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateDraftsStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> CodedError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateDraftsStatusCode400 { content = content }

        member this.DeleteDraft () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteDraftStatusCode200 { content = content }
          else
            let content = "Not Found." :> obj :?> JsonError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteDraftStatusCode404 { content = content }

        member this.EditDraft () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EditDraftStatusCode200 { content = content }
          else
            let content = "Not Found." :> obj :?> JsonError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EditDraftStatusCode404 { content = content }

        member this.GetDrafts () =
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetDraftsStatusCode200 { content = content }

      //#endregion

    let DraftsApiService = DraftsApiServiceImpl() :> IDraftsApiService