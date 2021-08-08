package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.InlineResponse200;
import org.openapitools.server.api.MainApiException;

public final class WebhooksApiException extends MainApiException {
    public WebhooksApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final WebhooksApiException Webhooks_zulipOutgoingWebhooks_200_Exception = new WebhooksApiException(200, "Success ");
    

}