package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.BadEventQueueIdError;
import org.openapitools.server.api.model.JsonSuccess;
import org.openapitools.server.api.model.JsonSuccessBase;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError;
import org.openapitools.server.api.model.OneOfRateLimitedError;
import org.openapitools.server.api.model.OneOfUserDeactivatedErrorRealmDeactivatedError;

import java.util.List;
import java.util.Map;

public class RealTimeEventsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(RealTimeEventsApiVerticle.class);
    
    static final String DELETE-QUEUE_SERVICE_ID = "delete-queue";
    static final String GET-EVENTS_SERVICE_ID = "get-events";
    static final String POST_REAL_TIME_SERVICE_ID = "POST_real_time";
    static final String REGISTER-QUEUE_SERVICE_ID = "register-queue";
    static final String REST-ERROR-HANDLING_SERVICE_ID = "rest-error-handling";
    
    final RealTimeEventsApi service;

    public RealTimeEventsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.RealTimeEventsApiImpl");
            service = (RealTimeEventsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("RealTimeEventsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for delete-queue
        vertx.eventBus().<JsonObject> consumer(DELETE-QUEUE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "delete-queue";
                String queueIdParam = message.body().getString("queue_id");
                if(queueIdParam == null) {
                    manageError(message, new MainApiException(400, "queue_id is required"), serviceId);
                    return;
                }
                String queueId = queueIdParam;
                service.deleteQueue(queueId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "delete-queue");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("delete-queue", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-events
        vertx.eventBus().<JsonObject> consumer(GET-EVENTS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-events";
                String queueIdParam = message.body().getString("queue_id");
                if(queueIdParam == null) {
                    manageError(message, new MainApiException(400, "queue_id is required"), serviceId);
                    return;
                }
                String queueId = queueIdParam;
                String lastEventIdParam = message.body().getString("last_event_id");
                Integer lastEventId = (lastEventIdParam == null) ? null : Json.mapper.readValue(lastEventIdParam, Integer.class);
                String dontBlockParam = message.body().getString("dont_block");
                Boolean dontBlock = (dontBlockParam == null) ? false : Json.mapper.readValue(dontBlockParam, Boolean.class);
                service.getEvents(queueId, lastEventId, dontBlock, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-events");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-events", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for POST_real_time
        vertx.eventBus().<JsonObject> consumer(POST_REAL_TIME_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "POST_real_time";
                JsonArray eventTypesParam = message.body().getJsonArray("event_types");
                List<String> eventTypes = (eventTypesParam == null) ? null : Json.mapper.readValue(eventTypesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                JsonArray narrowParam = message.body().getJsonArray("narrow");
                List<List<String>> narrow = (narrowParam == null) ? [] : Json.mapper.readValue(narrowParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, List<String>.class));
                String allPublicStreamsParam = message.body().getString("all_public_streams");
                Boolean allPublicStreams = (allPublicStreamsParam == null) ? false : Json.mapper.readValue(allPublicStreamsParam, Boolean.class);
                service.realTimePost(eventTypes, narrow, allPublicStreams, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "POST_real_time");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("POST_real_time", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for register-queue
        vertx.eventBus().<JsonObject> consumer(REGISTER-QUEUE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "register-queue";
                String applyMarkdownParam = message.body().getString("apply_markdown");
                Boolean applyMarkdown = (applyMarkdownParam == null) ? false : Json.mapper.readValue(applyMarkdownParam, Boolean.class);
                String clientGravatarParam = message.body().getString("client_gravatar");
                Boolean clientGravatar = (clientGravatarParam == null) ? false : Json.mapper.readValue(clientGravatarParam, Boolean.class);
                String slimPresenceParam = message.body().getString("slim_presence");
                Boolean slimPresence = (slimPresenceParam == null) ? false : Json.mapper.readValue(slimPresenceParam, Boolean.class);
                JsonArray eventTypesParam = message.body().getJsonArray("event_types");
                List<String> eventTypes = (eventTypesParam == null) ? null : Json.mapper.readValue(eventTypesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                String allPublicStreamsParam = message.body().getString("all_public_streams");
                Boolean allPublicStreams = (allPublicStreamsParam == null) ? false : Json.mapper.readValue(allPublicStreamsParam, Boolean.class);
                String includeSubscribersParam = message.body().getString("include_subscribers");
                Boolean includeSubscribers = (includeSubscribersParam == null) ? false : Json.mapper.readValue(includeSubscribersParam, Boolean.class);
                JsonObject clientCapabilitiesParam = message.body().getJsonObject("client_capabilities");
                if (clientCapabilitiesParam == null) {
                    manageError(message, new MainApiException(400, "client_capabilities is required"), serviceId);
                    return;
                }
                Object clientCapabilities = Json.mapper.readValue(clientCapabilitiesParam.encode(), Object.class);
                JsonArray fetchEventTypesParam = message.body().getJsonArray("fetch_event_types");
                List<String> fetchEventTypes = (fetchEventTypesParam == null) ? null : Json.mapper.readValue(fetchEventTypesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                JsonArray narrowParam = message.body().getJsonArray("narrow");
                List<List<String>> narrow = (narrowParam == null) ? [] : Json.mapper.readValue(narrowParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, List<String>.class));
                service.registerQueue(applyMarkdown, clientGravatar, slimPresence, eventTypes, allPublicStreams, includeSubscribers, clientCapabilities, fetchEventTypes, narrow, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "register-queue");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("register-queue", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for rest-error-handling
        vertx.eventBus().<JsonObject> consumer(REST-ERROR-HANDLING_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "rest-error-handling";
                service.restErrorHandling(result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "rest-error-handling");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("rest-error-handling", e);
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
