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
import io.vertx.ext.web.handler.impl.HttpStatusException;

import java.util.List;
import java.util.Map;

// Implement this class

public class MessagesApiImpl implements MessagesApi {
    public Future<ApiResponse<JsonSuccess>> addReaction(Integer messageId, String emojiName, String emojiCode, String reactionType) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<Object>> checkMessagesMatchNarrow(List<Integer> msgIds, List<Object> narrow) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> deleteMessage(Integer messageId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> getFileTemporaryUrl(Integer realmIdStr, String filename) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> getMessageHistory(Integer messageId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> getMessages(Integer numBefore, Integer numAfter, OneOfstringinteger anchor, List<Object> narrow, Boolean clientGravatar, Boolean applyMarkdown, Boolean useFirstUnreadAnchor) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> getRawMessage(Integer messageId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> markAllAsRead() {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> markStreamAsRead(Integer streamId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> markTopicAsRead(Integer streamId, String topicName) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> removeReaction(Integer messageId, String emojiName, String emojiCode, String reactionType) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> renderMessage(String content) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> sendMessage(String type, List<Integer> to, String content, String topic, String queueId, String localId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> updateMessage(Integer messageId, String topic, String propagateMode, Boolean sendNotificationToOldThread, Boolean sendNotificationToNewThread, String content, Integer streamId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> updateMessageFlags(List<Integer> messages, String op, String flag) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> uploadFile(FileUpload filename) {
        return Future.failedFuture(new HttpStatusException(501));
    }

}
