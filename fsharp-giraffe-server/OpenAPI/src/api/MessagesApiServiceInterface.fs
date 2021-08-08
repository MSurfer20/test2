namespace OpenAPI
open MessagesApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module MessagesApiServiceInterface =
    
    //#region Service interface
    type IMessagesApiService = 
      abstract member AddReaction:HttpContext -> AddReactionArgs->AddReactionResult
      abstract member CheckMessagesMatchNarrow:HttpContext -> CheckMessagesMatchNarrowArgs->CheckMessagesMatchNarrowResult
      abstract member DeleteMessage:HttpContext -> DeleteMessageArgs->DeleteMessageResult
      abstract member GetFileTemporaryUrl:HttpContext -> GetFileTemporaryUrlArgs->GetFileTemporaryUrlResult
      abstract member GetMessageHistory:HttpContext -> GetMessageHistoryArgs->GetMessageHistoryResult
      abstract member GetMessages:HttpContext -> GetMessagesArgs->GetMessagesResult
      abstract member GetRawMessage:HttpContext -> GetRawMessageArgs->GetRawMessageResult
      abstract member MarkAllAsRead:HttpContext ->MarkAllAsReadResult
      abstract member MarkStreamAsRead:HttpContext -> MarkStreamAsReadArgs->MarkStreamAsReadResult
      abstract member MarkTopicAsRead:HttpContext -> MarkTopicAsReadArgs->MarkTopicAsReadResult
      abstract member RemoveReaction:HttpContext -> RemoveReactionArgs->RemoveReactionResult
      abstract member RenderMessage:HttpContext -> RenderMessageArgs->RenderMessageResult
      abstract member SendMessage:HttpContext -> SendMessageArgs->SendMessageResult
      abstract member UpdateMessage:HttpContext -> UpdateMessageArgs->UpdateMessageResult
      abstract member UpdateMessageFlags:HttpContext -> UpdateMessageFlagsArgs->UpdateMessageFlagsResult
      abstract member UploadFile:HttpContext -> UploadFileArgs->UploadFileResult
    //#endregion