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

module MessagesApiServiceImplementation =
    
    //#region Service implementation
    type MessagesApiServiceImpl() = 
      interface IMessagesApiService with
      
        member this.AddReaction () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AddReactionStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> CodedError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AddReactionStatusCode400 { content = content }

        member this.CheckMessagesMatchNarrow () =
            let content = "Success." :> obj :?> AnyType // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CheckMessagesMatchNarrowStatusCode200 { content = content }

        member this.DeleteMessage () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteMessageStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> OneOfobjectobject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteMessageStatusCode400 { content = content }

        member this.GetFileTemporaryUrl () =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetFileTemporaryUrlStatusCode200 { content = content }

        member this.GetMessageHistory () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetMessageHistoryStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> InvalidMessageError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetMessageHistoryStatusCode400 { content = content }

        member this.GetMessages () =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetMessagesStatusCode200 { content = content }

        member this.GetRawMessage () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetRawMessageStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> InvalidMessageError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetRawMessageStatusCode400 { content = content }

        member this.MarkAllAsRead () =
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MarkAllAsReadStatusCode200 { content = content }

        member this.MarkStreamAsRead () =
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MarkStreamAsReadStatusCode200 { content = content }

        member this.MarkTopicAsRead () =
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MarkTopicAsReadStatusCode200 { content = content }

        member this.RemoveReaction () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RemoveReactionStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> CodedError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RemoveReactionStatusCode400 { content = content }

        member this.RenderMessage () =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RenderMessageStatusCode200 { content = content }

        member this.SendMessage () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SendMessageStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> OneOfobjectobject // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SendMessageStatusCode400 { content = content }

        member this.UpdateMessage () =
          if true then 
            let content = "Success." :> obj :?> JsonSuccess // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateMessageStatusCode200 { content = content }
          else
            let content = "Bad request." :> obj :?> CodedError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateMessageStatusCode400 { content = content }

        member this.UpdateMessageFlags () =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateMessageFlagsStatusCode200 { content = content }

        member this.UploadFile () =
            let content = "Success." :> obj :?> JsonSuccessBase // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UploadFileStatusCode200 { content = content }

      //#endregion

    let MessagesApiService = MessagesApiServiceImpl() :> IMessagesApiService