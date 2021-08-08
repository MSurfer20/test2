package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CodedError;
import java.io.File;
import org.openapitools.server.api.model.InvalidMessageError;
import org.openapitools.server.api.model.JsonSuccess;
import org.openapitools.server.api.model.JsonSuccessBase;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OneOfobjectobject;
import org.openapitools.server.api.model.OneOfstringinteger;

public final class MessagesApiException extends MainApiException {
    public MessagesApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final MessagesApiException Messages_addReaction_200_Exception = new MessagesApiException(200, "Success.");
    public static final MessagesApiException Messages_addReaction_400_Exception = new MessagesApiException(400, "Bad request.");
    public static final MessagesApiException Messages_checkMessagesMatchNarrow_200_Exception = new MessagesApiException(200, "Success.");
    public static final MessagesApiException Messages_deleteMessage_200_Exception = new MessagesApiException(200, "Success.");
    public static final MessagesApiException Messages_deleteMessage_400_Exception = new MessagesApiException(400, "Bad request.");
    public static final MessagesApiException Messages_getFileTemporaryUrl_200_Exception = new MessagesApiException(200, "Success.");
    public static final MessagesApiException Messages_getMessageHistory_200_Exception = new MessagesApiException(200, "Success.");
    public static final MessagesApiException Messages_getMessageHistory_400_Exception = new MessagesApiException(400, "Bad request.");
    public static final MessagesApiException Messages_getMessages_200_Exception = new MessagesApiException(200, "Success.");
    public static final MessagesApiException Messages_getRawMessage_200_Exception = new MessagesApiException(200, "Success.");
    public static final MessagesApiException Messages_getRawMessage_400_Exception = new MessagesApiException(400, "Bad request.");
    public static final MessagesApiException Messages_markAllAsRead_200_Exception = new MessagesApiException(200, "Success.");
    public static final MessagesApiException Messages_markStreamAsRead_200_Exception = new MessagesApiException(200, "Success.");
    public static final MessagesApiException Messages_markTopicAsRead_200_Exception = new MessagesApiException(200, "Success.");
    public static final MessagesApiException Messages_removeReaction_200_Exception = new MessagesApiException(200, "Success.");
    public static final MessagesApiException Messages_removeReaction_400_Exception = new MessagesApiException(400, "Bad request.");
    public static final MessagesApiException Messages_renderMessage_200_Exception = new MessagesApiException(200, "Success.");
    public static final MessagesApiException Messages_sendMessage_200_Exception = new MessagesApiException(200, "Success.");
    public static final MessagesApiException Messages_sendMessage_400_Exception = new MessagesApiException(400, "Bad request.");
    public static final MessagesApiException Messages_updateMessage_200_Exception = new MessagesApiException(200, "Success.");
    public static final MessagesApiException Messages_updateMessage_400_Exception = new MessagesApiException(400, "Bad request.");
    public static final MessagesApiException Messages_updateMessageFlags_200_Exception = new MessagesApiException(200, "Success.");
    public static final MessagesApiException Messages_uploadFile_200_Exception = new MessagesApiException(200, "Success.");
    

}