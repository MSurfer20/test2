package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.InlineResponse200;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface WebhooksApi  {
    //zulip_outgoing_webhooks
    void zulipOutgoingWebhooks(Handler<AsyncResult<InlineResponse200>> handler);
    
}
