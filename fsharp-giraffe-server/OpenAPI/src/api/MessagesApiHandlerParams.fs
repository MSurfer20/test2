namespace OpenAPI

open OpenAPI.Model.AnyType
open OpenAPI.Model.CodedError
open OpenAPI.Model.InvalidMessageError
open OpenAPI.Model.JsonSuccess
open OpenAPI.Model.JsonSuccessBase
open OpenAPI.Model.OneOfobjectobject
open OpenAPI.Model.OneOfstringinteger
open System.Collections.Generic
open System

module MessagesApiHandlerParams = 

    //#region Path parameters
    [<CLIMutable>]
    type AddReactionPathParams = {
      messageId : int ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type AddReactionQueryParams = {
      emojiName : string ;
      

      emojiCode : string option;
      

      reactionType : string option;
      
    }
    //#endregion

    
    type AddReactionStatusCode200Response = {
      content:JsonSuccess;
      
    }
    
    type AddReactionStatusCode400Response = {
      content:CodedError;
      
    }
    type AddReactionResult = AddReactionStatusCode200 of AddReactionStatusCode200Response|AddReactionStatusCode400 of AddReactionStatusCode400Response

    type AddReactionArgs = {
      pathParams:AddReactionPathParams;
      queryParams:Result<AddReactionQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type CheckMessagesMatchNarrowQueryParams = {
      msgIds : int[] ;
      

      narrow : obj[] ;
      
    }
    //#endregion

    
    type CheckMessagesMatchNarrowStatusCode200Response = {
      content:AnyType;
      
    }
    type CheckMessagesMatchNarrowResult = CheckMessagesMatchNarrowStatusCode200 of CheckMessagesMatchNarrowStatusCode200Response

    type CheckMessagesMatchNarrowArgs = {
      queryParams:Result<CheckMessagesMatchNarrowQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteMessagePathParams = {
      messageId : int ;
    }
    //#endregion

    
    type DeleteMessageStatusCode200Response = {
      content:JsonSuccess;
      
    }
    
    type DeleteMessageStatusCode400Response = {
      content:OneOfobjectobject;
      
    }
    type DeleteMessageResult = DeleteMessageStatusCode200 of DeleteMessageStatusCode200Response|DeleteMessageStatusCode400 of DeleteMessageStatusCode400Response

    type DeleteMessageArgs = {
      pathParams:DeleteMessagePathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetFileTemporaryUrlPathParams = {
      realmIdStr : int ;
    //#endregion
      filename : string ;
    }
    //#endregion

    
    type GetFileTemporaryUrlStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type GetFileTemporaryUrlResult = GetFileTemporaryUrlStatusCode200 of GetFileTemporaryUrlStatusCode200Response

    type GetFileTemporaryUrlArgs = {
      pathParams:GetFileTemporaryUrlPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetMessageHistoryPathParams = {
      messageId : int ;
    }
    //#endregion

    
    type GetMessageHistoryStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    
    type GetMessageHistoryStatusCode400Response = {
      content:InvalidMessageError;
      
    }
    type GetMessageHistoryResult = GetMessageHistoryStatusCode200 of GetMessageHistoryStatusCode200Response|GetMessageHistoryStatusCode400 of GetMessageHistoryStatusCode400Response

    type GetMessageHistoryArgs = {
      pathParams:GetMessageHistoryPathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type GetMessagesQueryParams = {
      anchor : OneOfstringinteger option;
      

      numBefore : int ;
      

      numAfter : int ;
      

      narrow : obj[] option;
      

      clientGravatar : bool option;
      

      applyMarkdown : bool option;
      

      useFirstUnreadAnchor : bool option;
      
    }
    //#endregion

    
    type GetMessagesStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type GetMessagesResult = GetMessagesStatusCode200 of GetMessagesStatusCode200Response

    type GetMessagesArgs = {
      queryParams:Result<GetMessagesQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetRawMessagePathParams = {
      messageId : int ;
    }
    //#endregion

    
    type GetRawMessageStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    
    type GetRawMessageStatusCode400Response = {
      content:InvalidMessageError;
      
    }
    type GetRawMessageResult = GetRawMessageStatusCode200 of GetRawMessageStatusCode200Response|GetRawMessageStatusCode400 of GetRawMessageStatusCode400Response

    type GetRawMessageArgs = {
      pathParams:GetRawMessagePathParams;
    }

    
    type MarkAllAsReadStatusCode200Response = {
      content:JsonSuccess;
      
    }
    type MarkAllAsReadResult = MarkAllAsReadStatusCode200 of MarkAllAsReadStatusCode200Response


    //#region Query parameters
    [<CLIMutable>]
    type MarkStreamAsReadQueryParams = {
      streamId : int ;
      
    }
    //#endregion

    
    type MarkStreamAsReadStatusCode200Response = {
      content:JsonSuccess;
      
    }
    type MarkStreamAsReadResult = MarkStreamAsReadStatusCode200 of MarkStreamAsReadStatusCode200Response

    type MarkStreamAsReadArgs = {
      queryParams:Result<MarkStreamAsReadQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type MarkTopicAsReadQueryParams = {
      streamId : int ;
      

      topicName : string ;
      
    }
    //#endregion

    
    type MarkTopicAsReadStatusCode200Response = {
      content:JsonSuccess;
      
    }
    type MarkTopicAsReadResult = MarkTopicAsReadStatusCode200 of MarkTopicAsReadStatusCode200Response

    type MarkTopicAsReadArgs = {
      queryParams:Result<MarkTopicAsReadQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type RemoveReactionPathParams = {
      messageId : int ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type RemoveReactionQueryParams = {
      emojiName : string option;
      

      emojiCode : string option;
      

      reactionType : string option;
      
    }
    //#endregion

    
    type RemoveReactionStatusCode200Response = {
      content:JsonSuccess;
      
    }
    
    type RemoveReactionStatusCode400Response = {
      content:CodedError;
      
    }
    type RemoveReactionResult = RemoveReactionStatusCode200 of RemoveReactionStatusCode200Response|RemoveReactionStatusCode400 of RemoveReactionStatusCode400Response

    type RemoveReactionArgs = {
      pathParams:RemoveReactionPathParams;
      queryParams:Result<RemoveReactionQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type RenderMessageQueryParams = {
      content : string ;
      
    }
    //#endregion

    
    type RenderMessageStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type RenderMessageResult = RenderMessageStatusCode200 of RenderMessageStatusCode200Response

    type RenderMessageArgs = {
      queryParams:Result<RenderMessageQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type SendMessageQueryParams = {
      _type : string ;
      

      _to : int[] ;
      

      content : string ;
      

      topic : string option;
      

      queueId : string option;
      

      localId : string option;
      
    }
    //#endregion

    
    type SendMessageStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    
    type SendMessageStatusCode400Response = {
      content:OneOfobjectobject;
      
    }
    type SendMessageResult = SendMessageStatusCode200 of SendMessageStatusCode200Response|SendMessageStatusCode400 of SendMessageStatusCode400Response

    type SendMessageArgs = {
      queryParams:Result<SendMessageQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateMessagePathParams = {
      messageId : int ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type UpdateMessageQueryParams = {
      topic : string option;
      

      propagateMode : string option;
      

      sendNotificationToOldThread : bool option;
      

      sendNotificationToNewThread : bool option;
      

      content : string option;
      

      streamId : int option;
      
    }
    //#endregion

    
    type UpdateMessageStatusCode200Response = {
      content:JsonSuccess;
      
    }
    
    type UpdateMessageStatusCode400Response = {
      content:CodedError;
      
    }
    type UpdateMessageResult = UpdateMessageStatusCode200 of UpdateMessageStatusCode200Response|UpdateMessageStatusCode400 of UpdateMessageStatusCode400Response

    type UpdateMessageArgs = {
      pathParams:UpdateMessagePathParams;
      queryParams:Result<UpdateMessageQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type UpdateMessageFlagsQueryParams = {
      messages : int[] ;
      

      op : string ;
      

      flag : string ;
      
    }
    //#endregion

    
    type UpdateMessageFlagsStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type UpdateMessageFlagsResult = UpdateMessageFlagsStatusCode200 of UpdateMessageFlagsStatusCode200Response

    type UpdateMessageFlagsArgs = {
      queryParams:Result<UpdateMessageFlagsQueryParams,string>;
    }

    //#region Form parameters
    [<CLIMutable>]
    type UploadFileFormParams = {
      filename : System.IO.Stream option;
    }
    //#endregion

    
    type UploadFileStatusCode200Response = {
      content:JsonSuccessBase;
      
    }
    type UploadFileResult = UploadFileStatusCode200 of UploadFileStatusCode200Response

    type UploadFileArgs = {
      formParams:Result<UploadFileFormParams,string>
    }
    