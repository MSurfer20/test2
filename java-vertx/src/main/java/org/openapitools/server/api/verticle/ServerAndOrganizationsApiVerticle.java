package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import java.io.File;
import org.openapitools.server.api.model.JsonSuccess;
import org.openapitools.server.api.model.JsonSuccessBase;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class ServerAndOrganizationsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(ServerAndOrganizationsApiVerticle.class);
    
    static final String ADD-CODE-PLAYGROUND_SERVICE_ID = "add-code-playground";
    static final String ADD-LINKIFIER_SERVICE_ID = "add-linkifier";
    static final String CREATE-CUSTOM-PROFILE-FIELD_SERVICE_ID = "create-custom-profile-field";
    static final String GET-CUSTOM-EMOJI_SERVICE_ID = "get-custom-emoji";
    static final String GET-CUSTOM-PROFILE-FIELDS_SERVICE_ID = "get-custom-profile-fields";
    static final String GET-LINKIFIERS_SERVICE_ID = "get-linkifiers";
    static final String GET-SERVER-SETTINGS_SERVICE_ID = "get-server-settings";
    static final String REMOVE-CODE-PLAYGROUND_SERVICE_ID = "remove-code-playground";
    static final String REMOVE-LINKIFIER_SERVICE_ID = "remove-linkifier";
    static final String REORDER-CUSTOM-PROFILE-FIELDS_SERVICE_ID = "reorder-custom-profile-fields";
    static final String UPDATE-LINKIFIER_SERVICE_ID = "update-linkifier";
    static final String UPLOAD-CUSTOM-EMOJI_SERVICE_ID = "upload-custom-emoji";
    
    final ServerAndOrganizationsApi service;

    public ServerAndOrganizationsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.ServerAndOrganizationsApiImpl");
            service = (ServerAndOrganizationsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("ServerAndOrganizationsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for add-code-playground
        vertx.eventBus().<JsonObject> consumer(ADD-CODE-PLAYGROUND_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "add-code-playground";
                String nameParam = message.body().getString("name");
                if(nameParam == null) {
                    manageError(message, new MainApiException(400, "name is required"), serviceId);
                    return;
                }
                String name = nameParam;
                String pygmentsLanguageParam = message.body().getString("pygments_language");
                if(pygmentsLanguageParam == null) {
                    manageError(message, new MainApiException(400, "pygments_language is required"), serviceId);
                    return;
                }
                String pygmentsLanguage = pygmentsLanguageParam;
                String urlPrefixParam = message.body().getString("url_prefix");
                if(urlPrefixParam == null) {
                    manageError(message, new MainApiException(400, "url_prefix is required"), serviceId);
                    return;
                }
                String urlPrefix = urlPrefixParam;
                service.addCodePlayground(name, pygmentsLanguage, urlPrefix, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "add-code-playground");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("add-code-playground", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for add-linkifier
        vertx.eventBus().<JsonObject> consumer(ADD-LINKIFIER_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "add-linkifier";
                String patternParam = message.body().getString("pattern");
                if(patternParam == null) {
                    manageError(message, new MainApiException(400, "pattern is required"), serviceId);
                    return;
                }
                String pattern = patternParam;
                String urlFormatStringParam = message.body().getString("url_format_string");
                if(urlFormatStringParam == null) {
                    manageError(message, new MainApiException(400, "url_format_string is required"), serviceId);
                    return;
                }
                String urlFormatString = urlFormatStringParam;
                service.addLinkifier(pattern, urlFormatString, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "add-linkifier");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("add-linkifier", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for create-custom-profile-field
        vertx.eventBus().<JsonObject> consumer(CREATE-CUSTOM-PROFILE-FIELD_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "create-custom-profile-field";
                String fieldTypeParam = message.body().getString("field_type");
                if(fieldTypeParam == null) {
                    manageError(message, new MainApiException(400, "field_type is required"), serviceId);
                    return;
                }
                Integer fieldType = Json.mapper.readValue(fieldTypeParam, Integer.class);
                String nameParam = message.body().getString("name");
                String name = (nameParam == null) ? null : nameParam;
                String hintParam = message.body().getString("hint");
                String hint = (hintParam == null) ? null : hintParam;
                JsonObject fieldDataParam = message.body().getJsonObject("field_data");
                if (fieldDataParam == null) {
                    manageError(message, new MainApiException(400, "field_data is required"), serviceId);
                    return;
                }
                Object fieldData = Json.mapper.readValue(fieldDataParam.encode(), Object.class);
                service.createCustomProfileField(fieldType, name, hint, fieldData, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "create-custom-profile-field");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("create-custom-profile-field", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-custom-emoji
        vertx.eventBus().<JsonObject> consumer(GET-CUSTOM-EMOJI_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-custom-emoji";
                service.getCustomEmoji(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-custom-emoji");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-custom-emoji", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-custom-profile-fields
        vertx.eventBus().<JsonObject> consumer(GET-CUSTOM-PROFILE-FIELDS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-custom-profile-fields";
                service.getCustomProfileFields(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-custom-profile-fields");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-custom-profile-fields", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-linkifiers
        vertx.eventBus().<JsonObject> consumer(GET-LINKIFIERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-linkifiers";
                service.getLinkifiers(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-linkifiers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-linkifiers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-server-settings
        vertx.eventBus().<JsonObject> consumer(GET-SERVER-SETTINGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-server-settings";
                service.getServerSettings(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-server-settings");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-server-settings", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for remove-code-playground
        vertx.eventBus().<JsonObject> consumer(REMOVE-CODE-PLAYGROUND_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "remove-code-playground";
                String playgroundIdParam = message.body().getString("playground_id");
                if(playgroundIdParam == null) {
                    manageError(message, new MainApiException(400, "playground_id is required"), serviceId);
                    return;
                }
                Integer playgroundId = Json.mapper.readValue(playgroundIdParam, Integer.class);
                service.removeCodePlayground(playgroundId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "remove-code-playground");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("remove-code-playground", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for remove-linkifier
        vertx.eventBus().<JsonObject> consumer(REMOVE-LINKIFIER_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "remove-linkifier";
                String filterIdParam = message.body().getString("filter_id");
                if(filterIdParam == null) {
                    manageError(message, new MainApiException(400, "filter_id is required"), serviceId);
                    return;
                }
                Integer filterId = Json.mapper.readValue(filterIdParam, Integer.class);
                service.removeLinkifier(filterId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "remove-linkifier");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("remove-linkifier", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for reorder-custom-profile-fields
        vertx.eventBus().<JsonObject> consumer(REORDER-CUSTOM-PROFILE-FIELDS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "reorder-custom-profile-fields";
                JsonArray orderParam = message.body().getJsonArray("order");
                if(orderParam == null) {
                    manageError(message, new MainApiException(400, "order is required"), serviceId);
                    return;
                }
                List<Integer> order = Json.mapper.readValue(orderParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, Integer.class));
                service.reorderCustomProfileFields(order, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "reorder-custom-profile-fields");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("reorder-custom-profile-fields", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for update-linkifier
        vertx.eventBus().<JsonObject> consumer(UPDATE-LINKIFIER_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "update-linkifier";
                String filterIdParam = message.body().getString("filter_id");
                if(filterIdParam == null) {
                    manageError(message, new MainApiException(400, "filter_id is required"), serviceId);
                    return;
                }
                Integer filterId = Json.mapper.readValue(filterIdParam, Integer.class);
                String patternParam = message.body().getString("pattern");
                if(patternParam == null) {
                    manageError(message, new MainApiException(400, "pattern is required"), serviceId);
                    return;
                }
                String pattern = patternParam;
                String urlFormatStringParam = message.body().getString("url_format_string");
                if(urlFormatStringParam == null) {
                    manageError(message, new MainApiException(400, "url_format_string is required"), serviceId);
                    return;
                }
                String urlFormatString = urlFormatStringParam;
                service.updateLinkifier(filterId, pattern, urlFormatString, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "update-linkifier");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("update-linkifier", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for upload-custom-emoji
        vertx.eventBus().<JsonObject> consumer(UPLOAD-CUSTOM-EMOJI_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "upload-custom-emoji";
                String emojiNameParam = message.body().getString("emoji_name");
                if(emojiNameParam == null) {
                    manageError(message, new MainApiException(400, "emoji_name is required"), serviceId);
                    return;
                }
                String emojiName = emojiNameParam;
                String filenameParam = message.body().getString("filename");
                File filename = (filenameParam == null) ? null : Json.mapper.readValue(filenameParam, File.class);
                service.uploadCustomEmoji(emojiName, filename, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "upload-custom-emoji");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("upload-custom-emoji", e);
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
