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
    //add_reaction
    void addReaction(Integer messageId, String emojiName, String emojiCode, String reactionType, Handler<AsyncResult<JsonSuccess>> handler);
    
    //check_messages_match_narrow
    void checkMessagesMatchNarrow(List<Integer> msgIds, List<Object> narrow, Handler<AsyncResult<Object>> handler);
    
    //delete_message
    void deleteMessage(Integer messageId, Handler<AsyncResult<JsonSuccess>> handler);
    
    //get_file_temporary_url
    void getFileTemporaryUrl(Integer realmIdStr, String filename, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get_message_history
    void getMessageHistory(Integer messageId, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get_messages
    void getMessages(Integer numBefore, Integer numAfter, OneOfstringinteger anchor, List<Object> narrow, Boolean clientGravatar, Boolean applyMarkdown, Boolean useFirstUnreadAnchor, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get_raw_message
    void getRawMessage(Integer messageId, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //mark_all_as_read
    void markAllAsRead(Handler<AsyncResult<JsonSuccess>> handler);
    
    //mark_stream_as_read
    void markStreamAsRead(Integer streamId, Handler<AsyncResult<JsonSuccess>> handler);
    
    //mark_topic_as_read
    void markTopicAsRead(Integer streamId, String topicName, Handler<AsyncResult<JsonSuccess>> handler);
    
    //remove_reaction
    void removeReaction(Integer messageId, String emojiName, String emojiCode, String reactionType, Handler<AsyncResult<JsonSuccess>> handler);
    
    //render_message
    void renderMessage(String content, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //send_message
    void sendMessage(String type, List<Integer> to, String content, String topic, String queueId, String localId, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //update_message
    void updateMessage(Integer messageId, String topic, String propagateMode, Boolean sendNotificationToOldThread, Boolean sendNotificationToNewThread, String content, Integer streamId, Handler<AsyncResult<JsonSuccess>> handler);
    
    //update_message_flags
    void updateMessageFlags(List<Integer> messages, String op, String flag, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //upload_file
    void uploadFile(File filename, Handler<AsyncResult<JsonSuccessBase>> handler);
    
}
