namespace OpenAPI
open OpenAPI.Model.AnyType
open OpenAPI.Model.CodedError
open OpenAPI.Model.InvalidMessageError
open OpenAPI.Model.JsonSuccess
open OpenAPI.Model.JsonSuccessBase
open OpenAPI.Model.OneOfobjectobject
open OpenAPI.Model.OneOfstringinteger
open MessagesApiHandlerParams
open MessagesApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module MessagesApiServiceImplementation =
    
    //#region Service implementation
    type MessagesApiServiceImpl() = 
      interface IMessagesApiService with
      
        member this.AddReaction ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AddReactionStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> CodedError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AddReactionStatusCode400 { content = content }

        member this.CheckMessagesMatchNarrow ctx args =
            let content = "Success." :> obj :?> AnyType // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CheckMessagesMatchNarrowStatusCode200 { content = content }

        member this.DeleteMessage ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteMessageStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> OneOfobjectobject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteMessageStatusCode400 { content = content }

        member this.GetFileTemporaryUrl ctx args =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetFileTemporaryUrlStatusCode200 { content = content }

        member this.GetMessageHistory ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetMessageHistoryStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> InvalidMessageError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetMessageHistoryStatusCode400 { content = content }

        member this.GetMessages ctx args =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetMessagesStatusCode200 { content = content }

        member this.GetRawMessage ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetRawMessageStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> InvalidMessageError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetRawMessageStatusCode400 { content = content }

        member this.MarkAllAsRead ctx  =
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MarkAllAsReadStatusCode200 { content = content }

        member this.MarkStreamAsRead ctx args =
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MarkStreamAsReadStatusCode200 { content = content }

        member this.MarkTopicAsRead ctx args =
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MarkTopicAsReadStatusCode200 { content = content }

        member this.RemoveReaction ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RemoveReactionStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> CodedError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RemoveReactionStatusCode400 { content = content }

        member this.RenderMessage ctx args =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RenderMessageStatusCode200 { content = content }

        member this.SendMessage ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SendMessageStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> OneOfobjectobject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SendMessageStatusCode400 { content = content }

        member this.UpdateMessage ctx args =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateMessageStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> CodedError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateMessageStatusCode400 { content = content }

        member this.UpdateMessageFlags ctx args =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateMessageFlagsStatusCode200 { content = content }

        member this.UploadFile ctx args =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UploadFileStatusCode200 { content = content }

      //#endregion

    let MessagesApiService = MessagesApiServiceImpl() :> IMessagesApiService