package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.InlineResponse200;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class WebhooksApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(WebhooksApiVerticle.class);
    
    static final String ZULIP_OUTGOING_WEBHOOKS_SERVICE_ID = "zulip_outgoing_webhooks";
    
    final WebhooksApi service;

    public WebhooksApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.WebhooksApiImpl");
            service = (WebhooksApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("WebhooksApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for zulip_outgoing_webhooks
        vertx.eventBus().<JsonObject> consumer(ZULIP_OUTGOING_WEBHOOKS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "zulip_outgoing_webhooks";
                service.zulipOutgoingWebhooks(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "zulip_outgoing_webhooks");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("zulip_outgoing_webhooks", e);
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
