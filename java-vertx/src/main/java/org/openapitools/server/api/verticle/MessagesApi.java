package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CodedError;
import java.io.File;
import org.openapitools.server.api.model.InvalidMessageError;
import org.openapitools.server.api.model.JsonSuccess;
import org.openapitools.server.api.model.JsonSuccessBase;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OneOfobjectobject;
import org.openapitools.server.api.model.OneOfstringinteger;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface MessagesApi  {
    //add-reaction
    void addReaction(Integer messageId, String emojiName, String emojiCode, String reactionType, Handler<AsyncResult<JsonSuccess>> handler);
    
    //check-messages-match-narrow
    void checkMessagesMatchNarrow(List<Integer> msgIds, List<Object> narrow, Handler<AsyncResult<Object>> handler);
    
    //delete-message
    void deleteMessage(Integer messageId, Handler<AsyncResult<JsonSuccess>> handler);
    
    //get-file-temporary-url
    void getFileTemporaryUrl(Integer realmIdStr, String filename, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get-message-history
    void getMessageHistory(Integer messageId, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get-messages
    void getMessages(Integer numBefore, Integer numAfter, OneOfstringinteger anchor, List<Object> narrow, Boolean clientGravatar, Boolean applyMarkdown, Boolean useFirstUnreadAnchor, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get-raw-message
    void getRawMessage(Integer messageId, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //mark-all-as-read
    void markAllAsRead(Handler<AsyncResult<JsonSuccess>> handler);
    
    //mark-stream-as-read
    void markStreamAsRead(Integer streamId, Handler<AsyncResult<JsonSuccess>> handler);
    
    //mark-topic-as-read
    void markTopicAsRead(Integer streamId, String topicName, Handler<AsyncResult<JsonSuccess>> handler);
    
    //remove-reaction
    void removeReaction(Integer messageId, String emojiName, String emojiCode, String reactionType, Handler<AsyncResult<JsonSuccess>> handler);
    
    //render-message
    void renderMessage(String content, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //send-message
    void sendMessage(String type, List<Integer> to, String content, String topic, String queueId, String localId, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //update-message
    void updateMessage(Integer messageId, String topic, String propagateMode, Boolean sendNotificationToOldThread, Boolean sendNotificationToNewThread, String content, Integer streamId, Handler<AsyncResult<JsonSuccess>> handler);
    
    //update-message-flags
    void updateMessageFlags(List<Integer> messages, String op, String flag, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //upload-file
    void uploadFile(File filename, Handler<AsyncResult<JsonSuccessBase>> handler);
    
}
