package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CodedError;
import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.InvalidMessageError;
import org.openapitools.vertxweb.server.model.JsonSuccess;
import org.openapitools.vertxweb.server.model.JsonSuccessBase;
import org.openapitools.vertxweb.server.model.OneOfobjectobject;
import org.openapitools.vertxweb.server.model.OneOfstringinteger;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface MessagesApi  {
    Future<ApiResponse<JsonSuccess>> addReaction(Integer messageId, String emojiName, String emojiCode, String reactionType);
    Future<ApiResponse<Object>> checkMessagesMatchNarrow(List<Integer> msgIds, List<Object> narrow);
    Future<ApiResponse<JsonSuccess>> deleteMessage(Integer messageId);
    Future<ApiResponse<JsonSuccessBase>> getFileTemporaryUrl(Integer realmIdStr, String filename);
    Future<ApiResponse<JsonSuccessBase>> getMessageHistory(Integer messageId);
    Future<ApiResponse<JsonSuccessBase>> getMessages(Integer numBefore, Integer numAfter, OneOfstringinteger anchor, List<Object> narrow, Boolean clientGravatar, Boolean applyMarkdown, Boolean useFirstUnreadAnchor);
    Future<ApiResponse<JsonSuccessBase>> getRawMessage(Integer messageId);
    Future<ApiResponse<JsonSuccess>> markAllAsRead();
    Future<ApiResponse<JsonSuccess>> markStreamAsRead(Integer streamId);
    Future<ApiResponse<JsonSuccess>> markTopicAsRead(Integer streamId, String topicName);
    Future<ApiResponse<JsonSuccess>> removeReaction(Integer messageId, String emojiName, String emojiCode, String reactionType);
    Future<ApiResponse<JsonSuccessBase>> renderMessage(String content);
    Future<ApiResponse<JsonSuccessBase>> sendMessage(String type, List<Integer> to, String content, String topic, String queueId, String localId);
    Future<ApiResponse<JsonSuccess>> updateMessage(Integer messageId, String topic, String propagateMode, Boolean sendNotificationToOldThread, Boolean sendNotificationToNewThread, String content, Integer streamId);
    Future<ApiResponse<JsonSuccessBase>> updateMessageFlags(List<Integer> messages, String op, String flag);
    Future<ApiResponse<JsonSuccessBase>> uploadFile(FileUpload filename);
}
