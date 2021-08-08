package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.BadEventQueueIdError;
import org.openapitools.server.api.model.JsonSuccess;
import org.openapitools.server.api.model.JsonSuccessBase;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError;
import org.openapitools.server.api.model.OneOfRateLimitedError;
import org.openapitools.server.api.model.OneOfUserDeactivatedErrorRealmDeactivatedError;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface RealTimeEventsApi  {
    //delete_queue
    void deleteQueue(String queueId, Handler<AsyncResult<JsonSuccess>> handler);
    
    //get_events
    void getEvents(String queueId, Integer lastEventId, Boolean dontBlock, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //POST_real_time
    void realTimePost(List<String> eventTypes, List<List<String>> narrow, Boolean allPublicStreams, Handler<AsyncResult<Void>> handler);
    
    //register_queue
    void registerQueue(Boolean applyMarkdown, Boolean clientGravatar, Boolean slimPresence, List<String> eventTypes, Boolean allPublicStreams, Boolean includeSubscribers, Object clientCapabilities, List<String> fetchEventTypes, List<List<String>> narrow, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //rest_error_handling
    void restErrorHandling(Handler<AsyncResult<Void>> handler);
    
}
