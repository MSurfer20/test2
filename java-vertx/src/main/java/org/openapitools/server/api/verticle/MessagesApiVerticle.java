package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.CodedError;
import java.io.File;
import org.openapitools.server.api.model.InvalidMessageError;
import org.openapitools.server.api.model.JsonSuccess;
import org.openapitools.server.api.model.JsonSuccessBase;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OneOfobjectobject;
import org.openapitools.server.api.model.OneOfstringinteger;

import java.util.List;
import java.util.Map;

public class MessagesApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(MessagesApiVerticle.class);
    
    static final String ADD-REACTION_SERVICE_ID = "add-reaction";
    static final String CHECK-MESSAGES-MATCH-NARROW_SERVICE_ID = "check-messages-match-narrow";
    static final String DELETE-MESSAGE_SERVICE_ID = "delete-message";
    static final String GET-FILE-TEMPORARY-URL_SERVICE_ID = "get-file-temporary-url";
    static final String GET-MESSAGE-HISTORY_SERVICE_ID = "get-message-history";
    static final String GET-MESSAGES_SERVICE_ID = "get-messages";
    static final String GET-RAW-MESSAGE_SERVICE_ID = "get-raw-message";
    static final String MARK-ALL-AS-READ_SERVICE_ID = "mark-all-as-read";
    static final String MARK-STREAM-AS-READ_SERVICE_ID = "mark-stream-as-read";
    static final String MARK-TOPIC-AS-READ_SERVICE_ID = "mark-topic-as-read";
    static final String REMOVE-REACTION_SERVICE_ID = "remove-reaction";
    static final String RENDER-MESSAGE_SERVICE_ID = "render-message";
    static final String SEND-MESSAGE_SERVICE_ID = "send-message";
    static final String UPDATE-MESSAGE_SERVICE_ID = "update-message";
    static final String UPDATE-MESSAGE-FLAGS_SERVICE_ID = "update-message-flags";
    static final String UPLOAD-FILE_SERVICE_ID = "upload-file";
    
    final MessagesApi service;

    public MessagesApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.MessagesApiImpl");
            service = (MessagesApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("MessagesApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for add-reaction
        vertx.eventBus().<JsonObject> consumer(ADD-REACTION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "add-reaction";
                String messageIdParam = message.body().getString("message_id");
                if(messageIdParam == null) {
                    manageError(message, new MainApiException(400, "message_id is required"), serviceId);
                    return;
                }
                Integer messageId = Json.mapper.readValue(messageIdParam, Integer.class);
                String emojiNameParam = message.body().getString("emoji_name");
                if(emojiNameParam == null) {
                    manageError(message, new MainApiException(400, "emoji_name is required"), serviceId);
                    return;
                }
                String emojiName = emojiNameParam;
                String emojiCodeParam = message.body().getString("emoji_code");
                String emojiCode = (emojiCodeParam == null) ? null : emojiCodeParam;
                String reactionTypeParam = message.body().getString("reaction_type");
                String reactionType = (reactionTypeParam == null) ? null : reactionTypeParam;
                service.addReaction(messageId, emojiName, emojiCode, reactionType, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "add-reaction");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("add-reaction", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for check-messages-match-narrow
        vertx.eventBus().<JsonObject> consumer(CHECK-MESSAGES-MATCH-NARROW_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "check-messages-match-narrow";
                JsonArray msgIdsParam = message.body().getJsonArray("msg_ids");
                if(msgIdsParam == null) {
                    manageError(message, new MainApiException(400, "msg_ids is required"), serviceId);
                    return;
                }
                List<Integer> msgIds = Json.mapper.readValue(msgIdsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Integer.class));
                JsonArray narrowParam = message.body().getJsonArray("narrow");
                if(narrowParam == null) {
                    manageError(message, new MainApiException(400, "narrow is required"), serviceId);
                    return;
                }
                List<Object> narrow = Json.mapper.readValue(narrowParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Object.class));
                service.checkMessagesMatchNarrow(msgIds, narrow, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "check-messages-match-narrow");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("check-messages-match-narrow", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for delete-message
        vertx.eventBus().<JsonObject> consumer(DELETE-MESSAGE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "delete-message";
                String messageIdParam = message.body().getString("message_id");
                if(messageIdParam == null) {
                    manageError(message, new MainApiException(400, "message_id is required"), serviceId);
                    return;
                }
                Integer messageId = Json.mapper.readValue(messageIdParam, Integer.class);
                service.deleteMessage(messageId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "delete-message");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("delete-message", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-file-temporary-url
        vertx.eventBus().<JsonObject> consumer(GET-FILE-TEMPORARY-URL_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-file-temporary-url";
                String realmIdStrParam = message.body().getString("realm_id_str");
                if(realmIdStrParam == null) {
                    manageError(message, new MainApiException(400, "realm_id_str is required"), serviceId);
                    return;
                }
                Integer realmIdStr = Json.mapper.readValue(realmIdStrParam, Integer.class);
                String filenameParam = message.body().getString("filename");
                if(filenameParam == null) {
                    manageError(message, new MainApiException(400, "filename is required"), serviceId);
                    return;
                }
                String filename = filenameParam;
                service.getFileTemporaryUrl(realmIdStr, filename, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-file-temporary-url");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-file-temporary-url", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-message-history
        vertx.eventBus().<JsonObject> consumer(GET-MESSAGE-HISTORY_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-message-history";
                String messageIdParam = message.body().getString("message_id");
                if(messageIdParam == null) {
                    manageError(message, new MainApiException(400, "message_id is required"), serviceId);
                    return;
                }
                Integer messageId = Json.mapper.readValue(messageIdParam, Integer.class);
                service.getMessageHistory(messageId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-message-history");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-message-history", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-messages
        vertx.eventBus().<JsonObject> consumer(GET-MESSAGES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-messages";
                String numBeforeParam = message.body().getString("num_before");
                if(numBeforeParam == null) {
                    manageError(message, new MainApiException(400, "num_before is required"), serviceId);
                    return;
                }
                Integer numBefore = Json.mapper.readValue(numBeforeParam, Integer.class);
                String numAfterParam = message.body().getString("num_after");
                if(numAfterParam == null) {
                    manageError(message, new MainApiException(400, "num_after is required"), serviceId);
                    return;
                }
                Integer numAfter = Json.mapper.readValue(numAfterParam, Integer.class);
                JsonObject anchorParam = message.body().getJsonObject("anchor");
                if (anchorParam == null) {
                    manageError(message, new MainApiException(400, "anchor is required"), serviceId);
                    return;
                }
                OneOfstringinteger anchor = Json.mapper.readValue(anchorParam.encode(), OneOfstringinteger.class);
                JsonArray narrowParam = message.body().getJsonArray("narrow");
                List<Object> narrow = (narrowParam == null) ? [] : Json.mapper.readValue(narrowParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Object.class));
                String clientGravatarParam = message.body().getString("client_gravatar");
                Boolean clientGravatar = (clientGravatarParam == null) ? false : Json.mapper.readValue(clientGravatarParam, Boolean.class);
                String applyMarkdownParam = message.body().getString("apply_markdown");
                Boolean applyMarkdown = (applyMarkdownParam == null) ? true : Json.mapper.readValue(applyMarkdownParam, Boolean.class);
                String useFirstUnreadAnchorParam = message.body().getString("use_first_unread_anchor");
                Boolean useFirstUnreadAnchor = (useFirstUnreadAnchorParam == null) ? false : Json.mapper.readValue(useFirstUnreadAnchorParam, Boolean.class);
                service.getMessages(numBefore, numAfter, anchor, narrow, clientGravatar, applyMarkdown, useFirstUnreadAnchor, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-messages");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-messages", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-raw-message
        vertx.eventBus().<JsonObject> consumer(GET-RAW-MESSAGE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-raw-message";
                String messageIdParam = message.body().getString("message_id");
                if(messageIdParam == null) {
                    manageError(message, new MainApiException(400, "message_id is required"), serviceId);
                    return;
                }
                Integer messageId = Json.mapper.readValue(messageIdParam, Integer.class);
                service.getRawMessage(messageId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-raw-message");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-raw-message", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for mark-all-as-read
        vertx.eventBus().<JsonObject> consumer(MARK-ALL-AS-READ_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "mark-all-as-read";
                service.markAllAsRead(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "mark-all-as-read");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("mark-all-as-read", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for mark-stream-as-read
        vertx.eventBus().<JsonObject> consumer(MARK-STREAM-AS-READ_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "mark-stream-as-read";
                String streamIdParam = message.body().getString("stream_id");
                if(streamIdParam == null) {
                    manageError(message, new MainApiException(400, "stream_id is required"), serviceId);
                    return;
                }
                Integer streamId = Json.mapper.readValue(streamIdParam, Integer.class);
                service.markStreamAsRead(streamId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "mark-stream-as-read");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("mark-stream-as-read", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for mark-topic-as-read
        vertx.eventBus().<JsonObject> consumer(MARK-TOPIC-AS-READ_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "mark-topic-as-read";
                String streamIdParam = message.body().getString("stream_id");
                if(streamIdParam == null) {
                    manageError(message, new MainApiException(400, "stream_id is required"), serviceId);
                    return;
                }
                Integer streamId = Json.mapper.readValue(streamIdParam, Integer.class);
                String topicNameParam = message.body().getString("topic_name");
                if(topicNameParam == null) {
                    manageError(message, new MainApiException(400, "topic_name is required"), serviceId);
                    return;
                }
                String topicName = topicNameParam;
                service.markTopicAsRead(streamId, topicName, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "mark-topic-as-read");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("mark-topic-as-read", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for remove-reaction
        vertx.eventBus().<JsonObject> consumer(REMOVE-REACTION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "remove-reaction";
                String messageIdParam = message.body().getString("message_id");
                if(messageIdParam == null) {
                    manageError(message, new MainApiException(400, "message_id is required"), serviceId);
                    return;
                }
                Integer messageId = Json.mapper.readValue(messageIdParam, Integer.class);
                String emojiNameParam = message.body().getString("emoji_name");
                String emojiName = (emojiNameParam == null) ? null : emojiNameParam;
                String emojiCodeParam = message.body().getString("emoji_code");
                String emojiCode = (emojiCodeParam == null) ? null : emojiCodeParam;
                String reactionTypeParam = message.body().getString("reaction_type");
                String reactionType = (reactionTypeParam == null) ? null : reactionTypeParam;
                service.removeReaction(messageId, emojiName, emojiCode, reactionType, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "remove-reaction");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("remove-reaction", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for render-message
        vertx.eventBus().<JsonObject> consumer(RENDER-MESSAGE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "render-message";
                String contentParam = message.body().getString("content");
                if(contentParam == null) {
                    manageError(message, new MainApiException(400, "content is required"), serviceId);
                    return;
                }
                String content = contentParam;
                service.renderMessage(content, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "render-message");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("render-message", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for send-message
        vertx.eventBus().<JsonObject> consumer(SEND-MESSAGE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "send-message";
                String typeParam = message.body().getString("type");
                if(typeParam == null) {
                    manageError(message, new MainApiException(400, "type is required"), serviceId);
                    return;
                }
                String type = typeParam;
                JsonArray toParam = message.body().getJsonArray("to");
                if(toParam == null) {
                    manageError(message, new MainApiException(400, "to is required"), serviceId);
                    return;
                }
                List<Integer> to = Json.mapper.readValue(toParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Integer.class));
                String contentParam = message.body().getString("content");
                if(contentParam == null) {
                    manageError(message, new MainApiException(400, "content is required"), serviceId);
                    return;
                }
                String content = contentParam;
                String topicParam = message.body().getString("topic");
                String topic = (topicParam == null) ? null : topicParam;
                String queueIdParam = message.body().getString("queue_id");
                String queueId = (queueIdParam == null) ? null : queueIdParam;
                String localIdParam = message.body().getString("local_id");
                String localId = (localIdParam == null) ? null : localIdParam;
                service.sendMessage(type, to, content, topic, queueId, localId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "send-message");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("send-message", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for update-message
        vertx.eventBus().<JsonObject> consumer(UPDATE-MESSAGE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "update-message";
                String messageIdParam = message.body().getString("message_id");
                if(messageIdParam == null) {
                    manageError(message, new MainApiException(400, "message_id is required"), serviceId);
                    return;
                }
                Integer messageId = Json.mapper.readValue(messageIdParam, Integer.class);
                String topicParam = message.body().getString("topic");
                String topic = (topicParam == null) ? null : topicParam;
                String propagateModeParam = message.body().getString("propagate_mode");
                String propagateMode = (propagateModeParam == null) ? "change_one" : propagateModeParam;
                String sendNotificationToOldThreadParam = message.body().getString("send_notification_to_old_thread");
                Boolean sendNotificationToOldThread = (sendNotificationToOldThreadParam == null) ? true : Json.mapper.readValue(sendNotificationToOldThreadParam, Boolean.class);
                String sendNotificationToNewThreadParam = message.body().getString("send_notification_to_new_thread");
                Boolean sendNotificationToNewThread = (sendNotificationToNewThreadParam == null) ? true : Json.mapper.readValue(sendNotificationToNewThreadParam, Boolean.class);
                String contentParam = message.body().getString("content");
                String content = (contentParam == null) ? null : contentParam;
                String streamIdParam = message.body().getString("stream_id");
                Integer streamId = (streamIdParam == null) ? null : Json.mapper.readValue(streamIdParam, Integer.class);
                service.updateMessage(messageId, topic, propagateMode, sendNotificationToOldThread, sendNotificationToNewThread, content, streamId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "update-message");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("update-message", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for update-message-flags
        vertx.eventBus().<JsonObject> consumer(UPDATE-MESSAGE-FLAGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "update-message-flags";
                JsonArray messagesParam = message.body().getJsonArray("messages");
                if(messagesParam == null) {
                    manageError(message, new MainApiException(400, "messages is required"), serviceId);
                    return;
                }
                List<Integer> messages = Json.mapper.readValue(messagesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Integer.class));
                String opParam = message.body().getString("op");
                if(opParam == null) {
                    manageError(message, new MainApiException(400, "op is required"), serviceId);
                    return;
                }
                String op = opParam;
                String flagParam = message.body().getString("flag");
                if(flagParam == null) {
                    manageError(message, new MainApiException(400, "flag is required"), serviceId);
                    return;
                }
                String flag = flagParam;
                service.updateMessageFlags(messages, op, flag, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "update-message-flags");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("update-message-flags", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for upload-file
        vertx.eventBus().<JsonObject> consumer(UPLOAD-FILE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "upload-file";
                String filenameParam = message.body().getString("filename");
                File filename = (filenameParam == null) ? null : Json.mapper.readValue(filenameParam, File.class);
                service.uploadFile(filename, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "upload-file");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("upload-file", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }
    
    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause); 
        }
            
        message.fail(code, statusMessage);
    }
    
    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
