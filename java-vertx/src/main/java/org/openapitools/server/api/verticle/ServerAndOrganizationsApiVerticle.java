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
    
    static final String ADD_CODE_PLAYGROUND_SERVICE_ID = "add_code_playground";
    static final String ADD_LINKIFIER_SERVICE_ID = "add_linkifier";
    static final String CREATE_CUSTOM_PROFILE_FIELD_SERVICE_ID = "create_custom_profile_field";
    static final String GET_CUSTOM_EMOJI_SERVICE_ID = "get_custom_emoji";
    static final String GET_CUSTOM_PROFILE_FIELDS_SERVICE_ID = "get_custom_profile_fields";
    static final String GET_LINKIFIERS_SERVICE_ID = "get_linkifiers";
    static final String GET_SERVER_SETTINGS_SERVICE_ID = "get_server_settings";
    static final String REMOVE_CODE_PLAYGROUND_SERVICE_ID = "remove_code_playground";
    static final String REMOVE_LINKIFIER_SERVICE_ID = "remove_linkifier";
    static final String REORDER_CUSTOM_PROFILE_FIELDS_SERVICE_ID = "reorder_custom_profile_fields";
    static final String UPDATE_LINKIFIER_SERVICE_ID = "update_linkifier";
    static final String UPLOAD_CUSTOM_EMOJI_SERVICE_ID = "upload_custom_emoji";
    
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
        
        //Consumer for add_code_playground
        vertx.eventBus().<JsonObject> consumer(ADD_CODE_PLAYGROUND_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "add_code_playground";
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
                        manageError(message, cause, "add_code_playground");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("add_code_playground", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for add_linkifier
        vertx.eventBus().<JsonObject> consumer(ADD_LINKIFIER_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "add_linkifier";
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
                        manageError(message, cause, "add_linkifier");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("add_linkifier", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for create_custom_profile_field
        vertx.eventBus().<JsonObject> consumer(CREATE_CUSTOM_PROFILE_FIELD_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "create_custom_profile_field";
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
                        manageError(message, cause, "create_custom_profile_field");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("create_custom_profile_field", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get_custom_emoji
        vertx.eventBus().<JsonObject> consumer(GET_CUSTOM_EMOJI_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_custom_emoji";
                service.getCustomEmoji(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get_custom_emoji");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_custom_emoji", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get_custom_profile_fields
        vertx.eventBus().<JsonObject> consumer(GET_CUSTOM_PROFILE_FIELDS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_custom_profile_fields";
                service.getCustomProfileFields(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get_custom_profile_fields");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_custom_profile_fields", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get_linkifiers
        vertx.eventBus().<JsonObject> consumer(GET_LINKIFIERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_linkifiers";
                service.getLinkifiers(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get_linkifiers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_linkifiers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get_server_settings
        vertx.eventBus().<JsonObject> consumer(GET_SERVER_SETTINGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get_server_settings";
                service.getServerSettings(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get_server_settings");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get_server_settings", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for remove_code_playground
        vertx.eventBus().<JsonObject> consumer(REMOVE_CODE_PLAYGROUND_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "remove_code_playground";
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
                        manageError(message, cause, "remove_code_playground");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("remove_code_playground", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for remove_linkifier
        vertx.eventBus().<JsonObject> consumer(REMOVE_LINKIFIER_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "remove_linkifier";
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
                        manageError(message, cause, "remove_linkifier");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("remove_linkifier", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for reorder_custom_profile_fields
        vertx.eventBus().<JsonObject> consumer(REORDER_CUSTOM_PROFILE_FIELDS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "reorder_custom_profile_fields";
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
                        manageError(message, cause, "reorder_custom_profile_fields");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("reorder_custom_profile_fields", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for update_linkifier
        vertx.eventBus().<JsonObject> consumer(UPDATE_LINKIFIER_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "update_linkifier";
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
                        manageError(message, cause, "update_linkifier");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("update_linkifier", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for upload_custom_emoji
        vertx.eventBus().<JsonObject> consumer(UPLOAD_CUSTOM_EMOJI_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "upload_custom_emoji";
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
                        manageError(message, cause, "upload_custom_emoji");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("upload_custom_emoji", e);
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
