package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiKeyResponse;
import org.openapitools.server.api.MainApiException;

public final class AuthenticationApiException extends MainApiException {
    public AuthenticationApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final AuthenticationApiException Authentication_devFetchApiKey_200_Exception = new AuthenticationApiException(200, "Success.");
    public static final AuthenticationApiException Authentication_fetchApiKey_200_Exception = new AuthenticationApiException(200, "Valid credentials the client can use to access the Zulip API.");
    

}