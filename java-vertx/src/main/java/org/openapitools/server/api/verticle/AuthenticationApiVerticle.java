package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.ApiKeyResponse;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class AuthenticationApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationApiVerticle.class);
    
    static final String DEV-FETCH-API-KEY_SERVICE_ID = "dev-fetch-api-key";
    static final String FETCH-API-KEY_SERVICE_ID = "fetch-api-key";
    
    final AuthenticationApi service;

    public AuthenticationApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.AuthenticationApiImpl");
            service = (AuthenticationApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("AuthenticationApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for dev-fetch-api-key
        vertx.eventBus().<JsonObject> consumer(DEV-FETCH-API-KEY_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "dev-fetch-api-key";
                String usernameParam = message.body().getString("username");
                if(usernameParam == null) {
                    manageError(message, new MainApiException(400, "username is required"), serviceId);
                    return;
                }
                String username = usernameParam;
                service.devFetchApiKey(username, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "dev-fetch-api-key");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("dev-fetch-api-key", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for fetch-api-key
        vertx.eventBus().<JsonObject> consumer(FETCH-API-KEY_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "fetch-api-key";
                String usernameParam = message.body().getString("username");
                if(usernameParam == null) {
                    manageError(message, new MainApiException(400, "username is required"), serviceId);
                    return;
                }
                String username = usernameParam;
                String passwordParam = message.body().getString("password");
                if(passwordParam == null) {
                    manageError(message, new MainApiException(400, "password is required"), serviceId);
                    return;
                }
                String password = passwordParam;
                service.fetchApiKey(username, password, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "fetch-api-key");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("fetch-api-key", e);
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
