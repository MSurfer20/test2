package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.CodedError;
import org.openapitools.server.api.model.JsonError;
import org.openapitools.server.api.model.JsonSuccess;
import org.openapitools.server.api.model.JsonSuccessBase;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.NonExistingStreamError;
import org.openapitools.server.api.model.OneOfobjectobject;
import org.openapitools.server.api.model.OneOfstringinteger;

import java.util.List;
import java.util.Map;

public class StreamsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(StreamsApiVerticle.class);
    
    static final String ARCHIVE-STREAM_SERVICE_ID = "archive-stream";
    static final String CREATE-BIG-BLUE-BUTTON-VIDEO-CALL_SERVICE_ID = "create-big-blue-button-video-call";
    static final String DELETE-TOPIC_SERVICE_ID = "delete-topic";
    static final String GET-STREAM-ID_SERVICE_ID = "get-stream-id";
    static final String GET-STREAM-TOPICS_SERVICE_ID = "get-stream-topics";
    static final String GET-STREAMS_SERVICE_ID = "get-streams";
    static final String GET-SUBSCRIBERS_SERVICE_ID = "get-subscribers";
    static final String GET-SUBSCRIPTION-STATUS_SERVICE_ID = "get-subscription-status";
    static final String GET-SUBSCRIPTIONS_SERVICE_ID = "get-subscriptions";
    static final String MUTE-TOPIC_SERVICE_ID = "mute-topic";
    static final String SUBSCRIBE_SERVICE_ID = "subscribe";
    static final String UNSUBSCRIBE_SERVICE_ID = "unsubscribe";
    static final String UPDATE-STREAM_SERVICE_ID = "update-stream";
    static final String UPDATE-SUBSCRIPTION-SETTINGS_SERVICE_ID = "update-subscription-settings";
    static final String UPDATE-SUBSCRIPTIONS_SERVICE_ID = "update-subscriptions";
    
    final StreamsApi service;

    public StreamsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.StreamsApiImpl");
            service = (StreamsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("StreamsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for archive-stream
        vertx.eventBus().<JsonObject> consumer(ARCHIVE-STREAM_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "archive-stream";
                String streamIdParam = message.body().getString("stream_id");
                if(streamIdParam == null) {
                    manageError(message, new MainApiException(400, "stream_id is required"), serviceId);
                    return;
                }
                Integer streamId = Json.mapper.readValue(streamIdParam, Integer.class);
                service.archiveStream(streamId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "archive-stream");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("archive-stream", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for create-big-blue-button-video-call
        vertx.eventBus().<JsonObject> consumer(CREATE-BIG-BLUE-BUTTON-VIDEO-CALL_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "create-big-blue-button-video-call";
                service.createBigBlueButtonVideoCall(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "create-big-blue-button-video-call");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("create-big-blue-button-video-call", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for delete-topic
        vertx.eventBus().<JsonObject> consumer(DELETE-TOPIC_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "delete-topic";
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
                service.deleteTopic(streamId, topicName, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "delete-topic");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("delete-topic", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-stream-id
        vertx.eventBus().<JsonObject> consumer(GET-STREAM-ID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-stream-id";
                String streamParam = message.body().getString("stream");
                if(streamParam == null) {
                    manageError(message, new MainApiException(400, "stream is required"), serviceId);
                    return;
                }
                String stream = streamParam;
                service.getStreamId(stream, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-stream-id");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-stream-id", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-stream-topics
        vertx.eventBus().<JsonObject> consumer(GET-STREAM-TOPICS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-stream-topics";
                String streamIdParam = message.body().getString("stream_id");
                if(streamIdParam == null) {
                    manageError(message, new MainApiException(400, "stream_id is required"), serviceId);
                    return;
                }
                Integer streamId = Json.mapper.readValue(streamIdParam, Integer.class);
                service.getStreamTopics(streamId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-stream-topics");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-stream-topics", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-streams
        vertx.eventBus().<JsonObject> consumer(GET-STREAMS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-streams";
                String includePublicParam = message.body().getString("include_public");
                Boolean includePublic = (includePublicParam == null) ? true : Json.mapper.readValue(includePublicParam, Boolean.class);
                String includeWebPublicParam = message.body().getString("include_web_public");
                Boolean includeWebPublic = (includeWebPublicParam == null) ? false : Json.mapper.readValue(includeWebPublicParam, Boolean.class);
                String includeSubscribedParam = message.body().getString("include_subscribed");
                Boolean includeSubscribed = (includeSubscribedParam == null) ? true : Json.mapper.readValue(includeSubscribedParam, Boolean.class);
                String includeAllActiveParam = message.body().getString("include_all_active");
                Boolean includeAllActive = (includeAllActiveParam == null) ? false : Json.mapper.readValue(includeAllActiveParam, Boolean.class);
                String includeDefaultParam = message.body().getString("include_default");
                Boolean includeDefault = (includeDefaultParam == null) ? false : Json.mapper.readValue(includeDefaultParam, Boolean.class);
                String includeOwnerSubscribedParam = message.body().getString("include_owner_subscribed");
                Boolean includeOwnerSubscribed = (includeOwnerSubscribedParam == null) ? false : Json.mapper.readValue(includeOwnerSubscribedParam, Boolean.class);
                service.getStreams(includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-streams");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-streams", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-subscribers
        vertx.eventBus().<JsonObject> consumer(GET-SUBSCRIBERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-subscribers";
                String streamIdParam = message.body().getString("stream_id");
                if(streamIdParam == null) {
                    manageError(message, new MainApiException(400, "stream_id is required"), serviceId);
                    return;
                }
                Integer streamId = Json.mapper.readValue(streamIdParam, Integer.class);
                service.getSubscribers(streamId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-subscribers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-subscribers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-subscription-status
        vertx.eventBus().<JsonObject> consumer(GET-SUBSCRIPTION-STATUS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-subscription-status";
                String userIdParam = message.body().getString("user_id");
                if(userIdParam == null) {
                    manageError(message, new MainApiException(400, "user_id is required"), serviceId);
                    return;
                }
                Integer userId = Json.mapper.readValue(userIdParam, Integer.class);
                String streamIdParam = message.body().getString("stream_id");
                if(streamIdParam == null) {
                    manageError(message, new MainApiException(400, "stream_id is required"), serviceId);
                    return;
                }
                Integer streamId = Json.mapper.readValue(streamIdParam, Integer.class);
                service.getSubscriptionStatus(userId, streamId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-subscription-status");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-subscription-status", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-subscriptions
        vertx.eventBus().<JsonObject> consumer(GET-SUBSCRIPTIONS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-subscriptions";
                String includeSubscribersParam = message.body().getString("include_subscribers");
                Boolean includeSubscribers = (includeSubscribersParam == null) ? false : Json.mapper.readValue(includeSubscribersParam, Boolean.class);
                service.getSubscriptions(includeSubscribers, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-subscriptions");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-subscriptions", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for mute-topic
        vertx.eventBus().<JsonObject> consumer(MUTE-TOPIC_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "mute-topic";
                String topicParam = message.body().getString("topic");
                if(topicParam == null) {
                    manageError(message, new MainApiException(400, "topic is required"), serviceId);
                    return;
                }
                String topic = topicParam;
                String opParam = message.body().getString("op");
                if(opParam == null) {
                    manageError(message, new MainApiException(400, "op is required"), serviceId);
                    return;
                }
                String op = opParam;
                String streamParam = message.body().getString("stream");
                String stream = (streamParam == null) ? null : streamParam;
                String streamIdParam = message.body().getString("stream_id");
                Integer streamId = (streamIdParam == null) ? null : Json.mapper.readValue(streamIdParam, Integer.class);
                service.muteTopic(topic, op, stream, streamId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "mute-topic");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("mute-topic", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for subscribe
        vertx.eventBus().<JsonObject> consumer(SUBSCRIBE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "subscribe";
                JsonArray subscriptionsParam = message.body().getJsonArray("subscriptions");
                if(subscriptionsParam == null) {
                    manageError(message, new MainApiException(400, "subscriptions is required"), serviceId);
                    return;
                }
                List<Object> subscriptions = Json.mapper.readValue(subscriptionsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Object.class));
                JsonArray principalsParam = message.body().getJsonArray("principals");
                List<OneOfstringinteger> principals = (principalsParam == null) ? null : Json.mapper.readValue(principalsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, OneOfstringinteger.class));
                String authorizationErrorsFatalParam = message.body().getString("authorization_errors_fatal");
                Boolean authorizationErrorsFatal = (authorizationErrorsFatalParam == null) ? true : Json.mapper.readValue(authorizationErrorsFatalParam, Boolean.class);
                String announceParam = message.body().getString("announce");
                Boolean announce = (announceParam == null) ? false : Json.mapper.readValue(announceParam, Boolean.class);
                String inviteOnlyParam = message.body().getString("invite_only");
                Boolean inviteOnly = (inviteOnlyParam == null) ? false : Json.mapper.readValue(inviteOnlyParam, Boolean.class);
                String historyPublicToSubscribersParam = message.body().getString("history_public_to_subscribers");
                Boolean historyPublicToSubscribers = (historyPublicToSubscribersParam == null) ? null : Json.mapper.readValue(historyPublicToSubscribersParam, Boolean.class);
                String streamPostPolicyParam = message.body().getString("stream_post_policy");
                Integer streamPostPolicy = (streamPostPolicyParam == null) ? 1 : Json.mapper.readValue(streamPostPolicyParam, Integer.class);
                JsonObject messageRetentionDaysParam = message.body().getJsonObject("message_retention_days");
                if (messageRetentionDaysParam == null) {
                    manageError(message, new MainApiException(400, "message_retention_days is required"), serviceId);
                    return;
                }
                OneOfstringinteger messageRetentionDays = Json.mapper.readValue(messageRetentionDaysParam.encode(), OneOfstringinteger.class);
                service.subscribe(subscriptions, principals, authorizationErrorsFatal, announce, inviteOnly, historyPublicToSubscribers, streamPostPolicy, messageRetentionDays, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "subscribe");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("subscribe", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for unsubscribe
        vertx.eventBus().<JsonObject> consumer(UNSUBSCRIBE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "unsubscribe";
                JsonArray subscriptionsParam = message.body().getJsonArray("subscriptions");
                if(subscriptionsParam == null) {
                    manageError(message, new MainApiException(400, "subscriptions is required"), serviceId);
                    return;
                }
                List<String> subscriptions = Json.mapper.readValue(subscriptionsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                JsonArray principalsParam = message.body().getJsonArray("principals");
                List<OneOfstringinteger> principals = (principalsParam == null) ? null : Json.mapper.readValue(principalsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, OneOfstringinteger.class));
                service.unsubscribe(subscriptions, principals, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "unsubscribe");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("unsubscribe", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for update-stream
        vertx.eventBus().<JsonObject> consumer(UPDATE-STREAM_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "update-stream";
                String streamIdParam = message.body().getString("stream_id");
                if(streamIdParam == null) {
                    manageError(message, new MainApiException(400, "stream_id is required"), serviceId);
                    return;
                }
                Integer streamId = Json.mapper.readValue(streamIdParam, Integer.class);
                String descriptionParam = message.body().getString("description");
                String description = (descriptionParam == null) ? null : descriptionParam;
                String newNameParam = message.body().getString("new_name");
                String newName = (newNameParam == null) ? null : newNameParam;
                String isPrivateParam = message.body().getString("is_private");
                Boolean isPrivate = (isPrivateParam == null) ? null : Json.mapper.readValue(isPrivateParam, Boolean.class);
                String isAnnouncementOnlyParam = message.body().getString("is_announcement_only");
                Boolean isAnnouncementOnly = (isAnnouncementOnlyParam == null) ? null : Json.mapper.readValue(isAnnouncementOnlyParam, Boolean.class);
                String streamPostPolicyParam = message.body().getString("stream_post_policy");
                Integer streamPostPolicy = (streamPostPolicyParam == null) ? 1 : Json.mapper.readValue(streamPostPolicyParam, Integer.class);
                String historyPublicToSubscribersParam = message.body().getString("history_public_to_subscribers");
                Boolean historyPublicToSubscribers = (historyPublicToSubscribersParam == null) ? null : Json.mapper.readValue(historyPublicToSubscribersParam, Boolean.class);
                JsonObject messageRetentionDaysParam = message.body().getJsonObject("message_retention_days");
                if (messageRetentionDaysParam == null) {
                    manageError(message, new MainApiException(400, "message_retention_days is required"), serviceId);
                    return;
                }
                OneOfstringinteger messageRetentionDays = Json.mapper.readValue(messageRetentionDaysParam.encode(), OneOfstringinteger.class);
                service.updateStream(streamId, description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "update-stream");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("update-stream", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for update-subscription-settings
        vertx.eventBus().<JsonObject> consumer(UPDATE-SUBSCRIPTION-SETTINGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "update-subscription-settings";
                JsonArray subscriptionDataParam = message.body().getJsonArray("subscription_data");
                if(subscriptionDataParam == null) {
                    manageError(message, new MainApiException(400, "subscription_data is required"), serviceId);
                    return;
                }
                List<Object> subscriptionData = Json.mapper.readValue(subscriptionDataParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Object.class));
                service.updateSubscriptionSettings(subscriptionData, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "update-subscription-settings");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("update-subscription-settings", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for update-subscriptions
        vertx.eventBus().<JsonObject> consumer(UPDATE-SUBSCRIPTIONS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "update-subscriptions";
                JsonArray deleteParam = message.body().getJsonArray("delete");
                List<String> delete = (deleteParam == null) ? null : Json.mapper.readValue(deleteParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                JsonArray addParam = message.body().getJsonArray("add");
                List<Object> add = (addParam == null) ? null : Json.mapper.readValue(addParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Object.class));
                service.updateSubscriptions(delete, add, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "update-subscriptions");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("update-subscriptions", e);
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
