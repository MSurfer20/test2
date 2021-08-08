package controllers;

import apimodels.CodedError;
import java.io.InputStream;
import apimodels.InvalidMessageError;
import apimodels.JsonSuccess;
import apimodels.JsonSuccessBase;
import apimodels.OneOfobjectobject;
import apimodels.OneOfstringinteger;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import static play.mvc.Results.ok;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public abstract class MessagesApiControllerImpInterface {
    @Inject private Config configuration;
    private ObjectMapper mapper = new ObjectMapper();

    public Result addReactionHttp(Http.Request request, Integer messageId, @NotNull String emojiName, String emojiCode, String reactionType) throws Exception {
        JsonSuccess obj = addReaction(request, messageId, emojiName, emojiCode, reactionType);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess addReaction(Http.Request request, Integer messageId, @NotNull String emojiName, String emojiCode, String reactionType) throws Exception;

    public Result checkMessagesMatchNarrowHttp(Http.Request request, @NotNull List<Integer> msgIds, @NotNull List<Object> narrow) throws Exception {
        Object obj = checkMessagesMatchNarrow(request, msgIds, narrow);
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract Object checkMessagesMatchNarrow(Http.Request request, @NotNull List<Integer> msgIds, @NotNull List<Object> narrow) throws Exception;

    public Result deleteMessageHttp(Http.Request request, Integer messageId) throws Exception {
        JsonSuccess obj = deleteMessage(request, messageId);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess deleteMessage(Http.Request request, Integer messageId) throws Exception;

    public Result getFileTemporaryUrlHttp(Http.Request request, Integer realmIdStr, String filename) throws Exception {
        JsonSuccessBase obj = getFileTemporaryUrl(request, realmIdStr, filename);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase getFileTemporaryUrl(Http.Request request, Integer realmIdStr, String filename) throws Exception;

    public Result getMessageHistoryHttp(Http.Request request, Integer messageId) throws Exception {
        JsonSuccessBase obj = getMessageHistory(request, messageId);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase getMessageHistory(Http.Request request, Integer messageId) throws Exception;

    public Result getMessagesHttp(Http.Request request, @NotNull  @Min(0)Integer numBefore, @NotNull  @Min(0)Integer numAfter, OneOfstringinteger anchor, List<Object> narrow, Boolean clientGravatar, Boolean applyMarkdown, Boolean useFirstUnreadAnchor) throws Exception {
        JsonSuccessBase obj = getMessages(request, numBefore, numAfter, anchor, narrow, clientGravatar, applyMarkdown, useFirstUnreadAnchor);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase getMessages(Http.Request request, @NotNull  @Min(0)Integer numBefore, @NotNull  @Min(0)Integer numAfter, OneOfstringinteger anchor, List<Object> narrow, Boolean clientGravatar, Boolean applyMarkdown, Boolean useFirstUnreadAnchor) throws Exception;

    public Result getRawMessageHttp(Http.Request request, Integer messageId) throws Exception {
        JsonSuccessBase obj = getRawMessage(request, messageId);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase getRawMessage(Http.Request request, Integer messageId) throws Exception;

    public Result markAllAsReadHttp(Http.Request request) throws Exception {
        JsonSuccess obj = markAllAsRead(request);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess markAllAsRead(Http.Request request) throws Exception;

    public Result markStreamAsReadHttp(Http.Request request, @NotNull Integer streamId) throws Exception {
        JsonSuccess obj = markStreamAsRead(request, streamId);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess markStreamAsRead(Http.Request request, @NotNull Integer streamId) throws Exception;

    public Result markTopicAsReadHttp(Http.Request request, @NotNull Integer streamId, @NotNull String topicName) throws Exception {
        JsonSuccess obj = markTopicAsRead(request, streamId, topicName);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess markTopicAsRead(Http.Request request, @NotNull Integer streamId, @NotNull String topicName) throws Exception;

    public Result removeReactionHttp(Http.Request request, Integer messageId, String emojiName, String emojiCode, String reactionType) throws Exception {
        JsonSuccess obj = removeReaction(request, messageId, emojiName, emojiCode, reactionType);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess removeReaction(Http.Request request, Integer messageId, String emojiName, String emojiCode, String reactionType) throws Exception;

    public Result renderMessageHttp(Http.Request request, @NotNull String content) throws Exception {
        JsonSuccessBase obj = renderMessage(request, content);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase renderMessage(Http.Request request, @NotNull String content) throws Exception;

    public Result sendMessageHttp(Http.Request request, @NotNull String type, @NotNull List<Integer> to, @NotNull String content, String topic, String queueId, String localId) throws Exception {
        JsonSuccessBase obj = sendMessage(request, type, to, content, topic, queueId, localId);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase sendMessage(Http.Request request, @NotNull String type, @NotNull List<Integer> to, @NotNull String content, String topic, String queueId, String localId) throws Exception;

    public Result updateMessageHttp(Http.Request request, Integer messageId, String topic, String propagateMode, Boolean sendNotificationToOldThread, Boolean sendNotificationToNewThread, String content, Integer streamId) throws Exception {
        JsonSuccess obj = updateMessage(request, messageId, topic, propagateMode, sendNotificationToOldThread, sendNotificationToNewThread, content, streamId);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccess updateMessage(Http.Request request, Integer messageId, String topic, String propagateMode, Boolean sendNotificationToOldThread, Boolean sendNotificationToNewThread, String content, Integer streamId) throws Exception;

    public Result updateMessageFlagsHttp(Http.Request request, @NotNull List<Integer> messages, @NotNull String op, @NotNull String flag) throws Exception {
        JsonSuccessBase obj = updateMessageFlags(request, messages, op, flag);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase updateMessageFlags(Http.Request request, @NotNull List<Integer> messages, @NotNull String op, @NotNull String flag) throws Exception;

    public Result uploadFileHttp(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> filename) throws Exception {
        JsonSuccessBase obj = uploadFile(request, filename);
    if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
    }
JsonNode result = mapper.valueToTree(obj);
return ok(result);

    }

    public abstract JsonSuccessBase uploadFile(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> filename) throws Exception;

}
