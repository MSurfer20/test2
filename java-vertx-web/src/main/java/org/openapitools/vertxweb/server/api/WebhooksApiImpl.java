package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.InlineResponse200;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.impl.HttpStatusException;

import java.util.List;
import java.util.Map;

// Implement this class

public class WebhooksApiImpl implements WebhooksApi {
    public Future<ApiResponse<InlineResponse200>> zulipOutgoingWebhooks() {
        return Future.failedFuture(new HttpStatusException(501));
    }

}
