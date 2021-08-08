package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CodedError;
import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.InvalidMessageError;
import org.openapitools.vertxweb.server.model.JsonSuccess;
import org.openapitools.vertxweb.server.model.JsonSuccessBase;
import org.openapitools.vertxweb.server.model.OneOfobjectobject;
import org.openapitools.vertxweb.server.model.OneOfstringinteger;

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class MessagesApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(MessagesApiHandler.class);

    private final MessagesApi api;

    public MessagesApiHandler(MessagesApi api) {
        this.api = api;
    }

    @Deprecated
    public MessagesApiHandler() {
        this(new MessagesApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("addReaction").handler(this::addReaction);
        builder.operation("checkMessagesMatchNarrow").handler(this::checkMessagesMatchNarrow);
        builder.operation("deleteMessage").handler(this::deleteMessage);
        builder.operation("getFileTemporaryUrl").handler(this::getFileTemporaryUrl);
        builder.operation("getMessageHistory").handler(this::getMessageHistory);
        builder.operation("getMessages").handler(this::getMessages);
        builder.operation("getRawMessage").handler(this::getRawMessage);
        builder.operation("markAllAsRead").handler(this::markAllAsRead);
        builder.operation("markStreamAsRead").handler(this::markStreamAsRead);
        builder.operation("markTopicAsRead").handler(this::markTopicAsRead);
        builder.operation("removeReaction").handler(this::removeReaction);
        builder.operation("renderMessage").handler(this::renderMessage);
        builder.operation("sendMessage").handler(this::sendMessage);
        builder.operation("updateMessage").handler(this::updateMessage);
        builder.operation("updateMessageFlags").handler(this::updateMessageFlags);
        builder.operation("uploadFile").handler(this::uploadFile);
    }

    private void addReaction(RoutingContext routingContext) {
        logger.info("addReaction()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer messageId = requestParameters.pathParameter("message_id") != null ? requestParameters.pathParameter("message_id").getInteger() : null;
        String emojiName = requestParameters.queryParameter("emoji_name") != null ? requestParameters.queryParameter("emoji_name").getString() : null;
        String emojiCode = requestParameters.queryParameter("emoji_code") != null ? requestParameters.queryParameter("emoji_code").getString() : null;
        String reactionType = requestParameters.queryParameter("reaction_type") != null ? requestParameters.queryParameter("reaction_type").getString() : null;

        logger.debug("Parameter messageId is {}", messageId);
        logger.debug("Parameter emojiName is {}", emojiName);
        logger.debug("Parameter emojiCode is {}", emojiCode);
        logger.debug("Parameter reactionType is {}", reactionType);

        api.addReaction(messageId, emojiName, emojiCode, reactionType)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void checkMessagesMatchNarrow(RoutingContext routingContext) {
        logger.info("checkMessagesMatchNarrow()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        List<Integer> msgIds = requestParameters.queryParameter("msg_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("msg_ids").get(), new TypeReference<List<Integer>>(){}) : null;
        List<Object> narrow = requestParameters.queryParameter("narrow") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("narrow").get(), new TypeReference<List<Object>>(){}) : null;

        logger.debug("Parameter msgIds is {}", msgIds);
        logger.debug("Parameter narrow is {}", narrow);

        api.checkMessagesMatchNarrow(msgIds, narrow)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void deleteMessage(RoutingContext routingContext) {
        logger.info("deleteMessage()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer messageId = requestParameters.pathParameter("message_id") != null ? requestParameters.pathParameter("message_id").getInteger() : null;

        logger.debug("Parameter messageId is {}", messageId);

        api.deleteMessage(messageId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getFileTemporaryUrl(RoutingContext routingContext) {
        logger.info("getFileTemporaryUrl()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer realmIdStr = requestParameters.pathParameter("realm_id_str") != null ? requestParameters.pathParameter("realm_id_str").getInteger() : null;
        String filename = requestParameters.pathParameter("filename") != null ? requestParameters.pathParameter("filename").getString() : null;

        logger.debug("Parameter realmIdStr is {}", realmIdStr);
        logger.debug("Parameter filename is {}", filename);

        api.getFileTemporaryUrl(realmIdStr, filename)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getMessageHistory(RoutingContext routingContext) {
        logger.info("getMessageHistory()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer messageId = requestParameters.pathParameter("message_id") != null ? requestParameters.pathParameter("message_id").getInteger() : null;

        logger.debug("Parameter messageId is {}", messageId);

        api.getMessageHistory(messageId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getMessages(RoutingContext routingContext) {
        logger.info("getMessages()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer numBefore = requestParameters.queryParameter("num_before") != null ? requestParameters.queryParameter("num_before").getInteger() : null;
        Integer numAfter = requestParameters.queryParameter("num_after") != null ? requestParameters.queryParameter("num_after").getInteger() : null;
        OneOfstringinteger anchor = requestParameters.queryParameter("anchor") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("anchor").get(), new TypeReference<OneOfstringinteger>(){}) : null;
        List<Object> narrow = requestParameters.queryParameter("narrow") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("narrow").get(), new TypeReference<List<Object>>(){}) : null;
        Boolean clientGravatar = requestParameters.queryParameter("client_gravatar") != null ? requestParameters.queryParameter("client_gravatar").getBoolean() : null;
        Boolean applyMarkdown = requestParameters.queryParameter("apply_markdown") != null ? requestParameters.queryParameter("apply_markdown").getBoolean() : null;
        Boolean useFirstUnreadAnchor = requestParameters.queryParameter("use_first_unread_anchor") != null ? requestParameters.queryParameter("use_first_unread_anchor").getBoolean() : null;

        logger.debug("Parameter numBefore is {}", numBefore);
        logger.debug("Parameter numAfter is {}", numAfter);
        logger.debug("Parameter anchor is {}", anchor);
        logger.debug("Parameter narrow is {}", narrow);
        logger.debug("Parameter clientGravatar is {}", clientGravatar);
        logger.debug("Parameter applyMarkdown is {}", applyMarkdown);
        logger.debug("Parameter useFirstUnreadAnchor is {}", useFirstUnreadAnchor);

        api.getMessages(numBefore, numAfter, anchor, narrow, clientGravatar, applyMarkdown, useFirstUnreadAnchor)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getRawMessage(RoutingContext routingContext) {
        logger.info("getRawMessage()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer messageId = requestParameters.pathParameter("message_id") != null ? requestParameters.pathParameter("message_id").getInteger() : null;

        logger.debug("Parameter messageId is {}", messageId);

        api.getRawMessage(messageId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void markAllAsRead(RoutingContext routingContext) {
        logger.info("markAllAsRead()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.markAllAsRead()
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void markStreamAsRead(RoutingContext routingContext) {
        logger.info("markStreamAsRead()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer streamId = requestParameters.queryParameter("stream_id") != null ? requestParameters.queryParameter("stream_id").getInteger() : null;

        logger.debug("Parameter streamId is {}", streamId);

        api.markStreamAsRead(streamId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void markTopicAsRead(RoutingContext routingContext) {
        logger.info("markTopicAsRead()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer streamId = requestParameters.queryParameter("stream_id") != null ? requestParameters.queryParameter("stream_id").getInteger() : null;
        String topicName = requestParameters.queryParameter("topic_name") != null ? requestParameters.queryParameter("topic_name").getString() : null;

        logger.debug("Parameter streamId is {}", streamId);
        logger.debug("Parameter topicName is {}", topicName);

        api.markTopicAsRead(streamId, topicName)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void removeReaction(RoutingContext routingContext) {
        logger.info("removeReaction()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer messageId = requestParameters.pathParameter("message_id") != null ? requestParameters.pathParameter("message_id").getInteger() : null;
        String emojiName = requestParameters.queryParameter("emoji_name") != null ? requestParameters.queryParameter("emoji_name").getString() : null;
        String emojiCode = requestParameters.queryParameter("emoji_code") != null ? requestParameters.queryParameter("emoji_code").getString() : null;
        String reactionType = requestParameters.queryParameter("reaction_type") != null ? requestParameters.queryParameter("reaction_type").getString() : null;

        logger.debug("Parameter messageId is {}", messageId);
        logger.debug("Parameter emojiName is {}", emojiName);
        logger.debug("Parameter emojiCode is {}", emojiCode);
        logger.debug("Parameter reactionType is {}", reactionType);

        api.removeReaction(messageId, emojiName, emojiCode, reactionType)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void renderMessage(RoutingContext routingContext) {
        logger.info("renderMessage()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String content = requestParameters.queryParameter("content") != null ? requestParameters.queryParameter("content").getString() : null;

        logger.debug("Parameter content is {}", content);

        api.renderMessage(content)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void sendMessage(RoutingContext routingContext) {
        logger.info("sendMessage()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String type = requestParameters.queryParameter("type") != null ? requestParameters.queryParameter("type").getString() : null;
        List<Integer> to = requestParameters.queryParameter("to") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("to").get(), new TypeReference<List<Integer>>(){}) : null;
        String content = requestParameters.queryParameter("content") != null ? requestParameters.queryParameter("content").getString() : null;
        String topic = requestParameters.queryParameter("topic") != null ? requestParameters.queryParameter("topic").getString() : null;
        String queueId = requestParameters.queryParameter("queue_id") != null ? requestParameters.queryParameter("queue_id").getString() : null;
        String localId = requestParameters.queryParameter("local_id") != null ? requestParameters.queryParameter("local_id").getString() : null;

        logger.debug("Parameter type is {}", type);
        logger.debug("Parameter to is {}", to);
        logger.debug("Parameter content is {}", content);
        logger.debug("Parameter topic is {}", topic);
        logger.debug("Parameter queueId is {}", queueId);
        logger.debug("Parameter localId is {}", localId);

        api.sendMessage(type, to, content, topic, queueId, localId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void updateMessage(RoutingContext routingContext) {
        logger.info("updateMessage()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer messageId = requestParameters.pathParameter("message_id") != null ? requestParameters.pathParameter("message_id").getInteger() : null;
        String topic = requestParameters.queryParameter("topic") != null ? requestParameters.queryParameter("topic").getString() : null;
        String propagateMode = requestParameters.queryParameter("propagate_mode") != null ? requestParameters.queryParameter("propagate_mode").getString() : null;
        Boolean sendNotificationToOldThread = requestParameters.queryParameter("send_notification_to_old_thread") != null ? requestParameters.queryParameter("send_notification_to_old_thread").getBoolean() : null;
        Boolean sendNotificationToNewThread = requestParameters.queryParameter("send_notification_to_new_thread") != null ? requestParameters.queryParameter("send_notification_to_new_thread").getBoolean() : null;
        String content = requestParameters.queryParameter("content") != null ? requestParameters.queryParameter("content").getString() : null;
        Integer streamId = requestParameters.queryParameter("stream_id") != null ? requestParameters.queryParameter("stream_id").getInteger() : null;

        logger.debug("Parameter messageId is {}", messageId);
        logger.debug("Parameter topic is {}", topic);
        logger.debug("Parameter propagateMode is {}", propagateMode);
        logger.debug("Parameter sendNotificationToOldThread is {}", sendNotificationToOldThread);
        logger.debug("Parameter sendNotificationToNewThread is {}", sendNotificationToNewThread);
        logger.debug("Parameter content is {}", content);
        logger.debug("Parameter streamId is {}", streamId);

        api.updateMessage(messageId, topic, propagateMode, sendNotificationToOldThread, sendNotificationToNewThread, content, streamId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void updateMessageFlags(RoutingContext routingContext) {
        logger.info("updateMessageFlags()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        List<Integer> messages = requestParameters.queryParameter("messages") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("messages").get(), new TypeReference<List<Integer>>(){}) : null;
        String op = requestParameters.queryParameter("op") != null ? requestParameters.queryParameter("op").getString() : null;
        String flag = requestParameters.queryParameter("flag") != null ? requestParameters.queryParameter("flag").getString() : null;

        logger.debug("Parameter messages is {}", messages);
        logger.debug("Parameter op is {}", op);
        logger.debug("Parameter flag is {}", flag);

        api.updateMessageFlags(messages, op, flag)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void uploadFile(RoutingContext routingContext) {
        logger.info("uploadFile()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        FileUpload filename = routingContext.fileUploads().iterator().next();

        logger.debug("Parameter filename is {}", filename);

        api.uploadFile(filename)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
