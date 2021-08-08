package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiKeyResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.impl.HttpStatusException;

import java.util.List;
import java.util.Map;

// Implement this class

public class AuthenticationApiImpl implements AuthenticationApi {
    public Future<ApiResponse<ApiKeyResponse>> devFetchApiKey(String username) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<ApiKeyResponse>> fetchApiKey(String username, String password) {
        return Future.failedFuture(new HttpStatusException(501));
    }

}
