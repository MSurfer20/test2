namespace OpenAPI
open MessagesApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module MessagesApiServiceInterface =
    
    //#region Service interface
    type IMessagesApiService = 
      abstract member AddReaction : unit -> AddReactionResult
      abstract member CheckMessagesMatchNarrow : unit -> CheckMessagesMatchNarrowResult
      abstract member DeleteMessage : unit -> DeleteMessageResult
      abstract member GetFileTemporaryUrl : unit -> GetFileTemporaryUrlResult
      abstract member GetMessageHistory : unit -> GetMessageHistoryResult
      abstract member GetMessages : unit -> GetMessagesResult
      abstract member GetRawMessage : unit -> GetRawMessageResult
      abstract member MarkAllAsRead : unit -> MarkAllAsReadResult
      abstract member MarkStreamAsRead : unit -> MarkStreamAsReadResult
      abstract member MarkTopicAsRead : unit -> MarkTopicAsReadResult
      abstract member RemoveReaction : unit -> RemoveReactionResult
      abstract member RenderMessage : unit -> RenderMessageResult
      abstract member SendMessage : unit -> SendMessageResult
      abstract member UpdateMessage : unit -> UpdateMessageResult
      abstract member UpdateMessageFlags : unit -> UpdateMessageFlagsResult
      abstract member UploadFile : unit -> UploadFileResult
    //#endregion