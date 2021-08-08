package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ApiKeyResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface AuthenticationApi  {
    Future<ApiResponse<ApiKeyResponse>> devFetchApiKey(String username);
    Future<ApiResponse<ApiKeyResponse>> fetchApiKey(String username, String password);
}
