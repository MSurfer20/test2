package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiKeyResponse;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface AuthenticationApi  {
    //dev-fetch-api-key
    void devFetchApiKey(String username, Handler<AsyncResult<ApiKeyResponse>> handler);
    
    //fetch-api-key
    void fetchApiKey(String username, String password, Handler<AsyncResult<ApiKeyResponse>> handler);
    
}
