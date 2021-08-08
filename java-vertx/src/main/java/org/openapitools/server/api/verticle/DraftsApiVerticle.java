package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.CodedError;
import org.openapitools.server.api.model.Draft;
import org.openapitools.server.api.model.JsonError;
import org.openapitools.server.api.model.JsonSuccess;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class DraftsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(DraftsApiVerticle.class);
    
    static final String CREATE-DRAFTS_SERVICE_ID = "create-drafts";
    static final String DELETE-DRAFT_SERVICE_ID = "delete-draft";
    static final String EDIT-DRAFT_SERVICE_ID = "edit-draft";
    static final String GET-DRAFTS_SERVICE_ID = "get-drafts";
    
    final DraftsApi service;

    public DraftsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.DraftsApiImpl");
            service = (DraftsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("DraftsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for create-drafts
        vertx.eventBus().<JsonObject> consumer(CREATE-DRAFTS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "create-drafts";
                JsonArray draftsParam = message.body().getJsonArray("drafts");
                List<Draft> drafts = (draftsParam == null) ? null : Json.mapper.readValue(draftsParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Draft.class));
                service.createDrafts(drafts, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "create-drafts");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("create-drafts", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for delete-draft
        vertx.eventBus().<JsonObject> consumer(DELETE-DRAFT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "delete-draft";
                String draftIdParam = message.body().getString("draft_id");
                if(draftIdParam == null) {
                    manageError(message, new MainApiException(400, "draft_id is required"), serviceId);
                    return;
                }
                Integer draftId = Json.mapper.readValue(draftIdParam, Integer.class);
                service.deleteDraft(draftId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "delete-draft");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("delete-draft", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for edit-draft
        vertx.eventBus().<JsonObject> consumer(EDIT-DRAFT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "edit-draft";
                String draftIdParam = message.body().getString("draft_id");
                if(draftIdParam == null) {
                    manageError(message, new MainApiException(400, "draft_id is required"), serviceId);
                    return;
                }
                Integer draftId = Json.mapper.readValue(draftIdParam, Integer.class);
                JsonObject draftParam = message.body().getJsonObject("draft");
                if (draftParam == null) {
                    manageError(message, new MainApiException(400, "draft is required"), serviceId);
                    return;
                }
                Draft draft = Json.mapper.readValue(draftParam.encode(), Draft.class);
                service.editDraft(draftId, draft, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "edit-draft");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("edit-draft", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-drafts
        vertx.eventBus().<JsonObject> consumer(GET-DRAFTS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-drafts";
                service.getDrafts(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-drafts");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-drafts", e);
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
