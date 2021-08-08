package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiKeyResponse;

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

public class AuthenticationApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(AuthenticationApiHandler.class);

    private final AuthenticationApi api;

    public AuthenticationApiHandler(AuthenticationApi api) {
        this.api = api;
    }

    @Deprecated
    public AuthenticationApiHandler() {
        this(new AuthenticationApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("devFetchApiKey").handler(this::devFetchApiKey);
        builder.operation("fetchApiKey").handler(this::fetchApiKey);
    }

    private void devFetchApiKey(RoutingContext routingContext) {
        logger.info("devFetchApiKey()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String username = requestParameters.queryParameter("username") != null ? requestParameters.queryParameter("username").getString() : null;

        logger.debug("Parameter username is {}", username);

        api.devFetchApiKey(username)
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

    private void fetchApiKey(RoutingContext routingContext) {
        logger.info("fetchApiKey()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String username = requestParameters.queryParameter("username") != null ? requestParameters.queryParameter("username").getString() : null;
        String password = requestParameters.queryParameter("password") != null ? requestParameters.queryParameter("password").getString() : null;

        logger.debug("Parameter username is {}", username);
        logger.debug("Parameter password is {}", password);

        api.fetchApiKey(username, password)
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
