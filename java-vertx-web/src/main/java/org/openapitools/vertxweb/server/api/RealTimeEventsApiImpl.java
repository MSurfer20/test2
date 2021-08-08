package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.BadEventQueueIdError;
import org.openapitools.vertxweb.server.model.JsonSuccess;
import org.openapitools.vertxweb.server.model.JsonSuccessBase;
import org.openapitools.vertxweb.server.model.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError;
import org.openapitools.vertxweb.server.model.OneOfRateLimitedError;
import org.openapitools.vertxweb.server.model.OneOfUserDeactivatedErrorRealmDeactivatedError;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.impl.HttpStatusException;

import java.util.List;
import java.util.Map;

// Implement this class

public class RealTimeEventsApiImpl implements RealTimeEventsApi {
    public Future<ApiResponse<JsonSuccess>> deleteQueue(String queueId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> getEvents(String queueId, Integer lastEventId, Boolean dontBlock) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<Void>> realTimePost(List<String> eventTypes, List<List<String>> narrow, Boolean allPublicStreams) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> registerQueue(Boolean applyMarkdown, Boolean clientGravatar, Boolean slimPresence, List<String> eventTypes, Boolean allPublicStreams, Boolean includeSubscribers, Object clientCapabilities, List<String> fetchEventTypes, List<List<String>> narrow) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<Void>> restErrorHandling() {
        return Future.failedFuture(new HttpStatusException(501));
    }

}
