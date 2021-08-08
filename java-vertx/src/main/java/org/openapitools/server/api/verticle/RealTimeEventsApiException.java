package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.BadEventQueueIdError;
import org.openapitools.server.api.model.JsonSuccess;
import org.openapitools.server.api.model.JsonSuccessBase;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError;
import org.openapitools.server.api.model.OneOfRateLimitedError;
import org.openapitools.server.api.model.OneOfUserDeactivatedErrorRealmDeactivatedError;

public final class RealTimeEventsApiException extends MainApiException {
    public RealTimeEventsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final RealTimeEventsApiException RealTimeEvents_deleteQueue_200_Exception = new RealTimeEventsApiException(200, "Success.");
    public static final RealTimeEventsApiException RealTimeEvents_deleteQueue_400_Exception = new RealTimeEventsApiException(400, "Bad request.");
    public static final RealTimeEventsApiException RealTimeEvents_getEvents_200_Exception = new RealTimeEventsApiException(200, "Success.");
    public static final RealTimeEventsApiException RealTimeEvents_getEvents_400_Exception = new RealTimeEventsApiException(400, "Bad request.");
    public static final RealTimeEventsApiException RealTimeEvents_realTimePost_200_Exception = new RealTimeEventsApiException(200, "Success");
    public static final RealTimeEventsApiException RealTimeEvents_registerQueue_200_Exception = new RealTimeEventsApiException(200, "Success.");
    public static final RealTimeEventsApiException RealTimeEvents_restErrorHandling_400_Exception = new RealTimeEventsApiException(400, "Bad request. ");
    public static final RealTimeEventsApiException RealTimeEvents_restErrorHandling_401_Exception = new RealTimeEventsApiException(401, "Unauthorized. ");
    public static final RealTimeEventsApiException RealTimeEvents_restErrorHandling_429_Exception = new RealTimeEventsApiException(429, "Rate limit exceeded. ");
    

}