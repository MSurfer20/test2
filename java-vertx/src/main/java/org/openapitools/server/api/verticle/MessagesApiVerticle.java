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
    
    static final String ADD_REACTION_SERVICE_ID = "add_reaction";
    static final String CHECK_MESSAGES_MATCH_NARROW_SERVICE_ID = "check_messages_match_narrow";
    static final String DELETE_MESSAGE_SERVICE_ID = "delete_message";
    static final String GET_FILE_TEMPORARY_URL_SERVICE_ID = "get_file_temporary_url";
    static final String GET_MESSAGE_HISTORY_SERVICE_ID = "get_message_history";
    static final String GET_MESSAGES_SERVICE_ID = "get_messages";
    static final String GET_RAW_MESSAGE_SERVICE_ID = "get_raw_message";
    static final String MARK_ALL_AS_READ_SERVICE_ID = "mark_all_as_read";
    static final String MARK_STREAM_AS_READ_SERVICE_ID = "mark_stream_as_read";
    static final String MARK_TOPIC_AS_READ_SERVICE_ID = "mark_topic_as_read";
    static final String REMOVE_REACTION_SERVICE_ID = "remove_reaction";
    static final String RENDER_MESSAGE_SERVICE_ID = "render_message";
    static final String SEND_MESSAGE_SERVICE_ID = "send_message";
    static final String UPDATE_MESSAGE_SERVICE_ID = "update_message";
    static final String UPDATE_MESSAGE_FLAGS_SERVICE_ID = "update_message_flags";
    static final String UPLOAD_FILE_SERVICE_ID = "upload_file";
    
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
        
        //Consumer for add_reaction
        vertx.eventBus().<JsonObject> consumer(ADD_REACTION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "add_reaction";
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
                        manageError(message, cause, "add_reaction");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("add_reaction", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for check_messages_match_narrow
        vertx.eventBus().<JsonObject> consumer(CHECK_MESSAGES_MATCH_NARROW_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "check_messages_match_narrow";
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
                        manageError(message, cause, "check_messages_match_narrow");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("check_messages_match_narrow", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for delete_message
        vertx.eventBus().<JsonObject> consumer(DELETE_MESSAGE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "delete_message";
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
                        manageError(message, cause, "delete_message");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("delete_message", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get_file_temporary_url
        vertx.eventBus().<JsonObject> consumer(GET_FILE_TEMPORARY_URL_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_file_temporary_url";
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
                        manageError(message, cause, "get_file_temporary_url");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_file_temporary_url", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get_message_history
        vertx.eventBus().<JsonObject> consumer(GET_MESSAGE_HISTORY_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_message_history";
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
                        manageError(message, cause, "get_message_history");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_message_history", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get_messages
        vertx.eventBus().<JsonObject> consumer(GET_MESSAGES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_messages";
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
                        manageError(message, cause, "get_messages");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_messages", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get_raw_message
        vertx.eventBus().<JsonObject> consumer(GET_RAW_MESSAGE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_raw_message";
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
                        manageError(message, cause, "get_raw_message");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_raw_message", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for mark_all_as_read
        vertx.eventBus().<JsonObject> consumer(MARK_ALL_AS_READ_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "mark_all_as_read";
                service.markAllAsRead(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "mark_all_as_read");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("mark_all_as_read", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for mark_stream_as_read
        vertx.eventBus().<JsonObject> consumer(MARK_STREAM_AS_READ_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "mark_stream_as_read";
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
                        manageError(message, cause, "mark_stream_as_read");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("mark_stream_as_read", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for mark_topic_as_read
        vertx.eventBus().<JsonObject> consumer(MARK_TOPIC_AS_READ_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "mark_topic_as_read";
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
                        manageError(message, cause, "mark_topic_as_read");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("mark_topic_as_read", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for remove_reaction
        vertx.eventBus().<JsonObject> consumer(REMOVE_REACTION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "remove_reaction";
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
                        manageError(message, cause, "remove_reaction");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("remove_reaction", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for render_message
        vertx.eventBus().<JsonObject> consumer(RENDER_MESSAGE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "render_message";
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
                        manageError(message, cause, "render_message");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("render_message", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for send_message
        vertx.eventBus().<JsonObject> consumer(SEND_MESSAGE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "send_message";
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
                        manageError(message, cause, "send_message");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("send_message", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for update_message
        vertx.eventBus().<JsonObject> consumer(UPDATE_MESSAGE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "update_message";
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
                        manageError(message, cause, "update_message");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("update_message", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for update_message_flags
        vertx.eventBus().<JsonObject> consumer(UPDATE_MESSAGE_FLAGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "update_message_flags";
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
                        manageError(message, cause, "update_message_flags");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("update_message_flags", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for upload_file
        vertx.eventBus().<JsonObject> consumer(UPLOAD_FILE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "upload_file";
                String filenameParam = message.body().getString("filename");
                File filename = (filenameParam == null) ? null : Json.mapper.readValue(filenameParam, File.class);
                service.uploadFile(filename, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "upload_file");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("upload_file", e);
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
