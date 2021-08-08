package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CodedError;
import org.openapitools.server.api.model.JsonError;
import org.openapitools.server.api.model.JsonSuccess;
import org.openapitools.server.api.model.JsonSuccessBase;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.NonExistingStreamError;
import org.openapitools.server.api.model.OneOfobjectobject;
import org.openapitools.server.api.model.OneOfstringinteger;

public final class StreamsApiException extends MainApiException {
    public StreamsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final StreamsApiException Streams_archiveStream_200_Exception = new StreamsApiException(200, "Success.");
    public static final StreamsApiException Streams_archiveStream_400_Exception = new StreamsApiException(400, "Bad request.");
    public static final StreamsApiException Streams_createBigBlueButtonVideoCall_200_Exception = new StreamsApiException(200, "Success.");
    public static final StreamsApiException Streams_getStreamId_200_Exception = new StreamsApiException(200, "Success.");
    public static final StreamsApiException Streams_getStreamId_400_Exception = new StreamsApiException(400, "Bad request.");
    public static final StreamsApiException Streams_getStreamTopics_200_Exception = new StreamsApiException(200, "Success.");
    public static final StreamsApiException Streams_getStreamTopics_400_Exception = new StreamsApiException(400, "Bad request.");
    public static final StreamsApiException Streams_getStreams_200_Exception = new StreamsApiException(200, "Success.");
    public static final StreamsApiException Streams_getStreams_400_Exception = new StreamsApiException(400, "Bad request.");
    public static final StreamsApiException Streams_getSubscriptionStatus_200_Exception = new StreamsApiException(200, "Success");
    public static final StreamsApiException Streams_getSubscriptions_200_Exception = new StreamsApiException(200, "Success.");
    public static final StreamsApiException Streams_muteTopic_200_Exception = new StreamsApiException(200, "Success.");
    public static final StreamsApiException Streams_muteTopic_400_Exception = new StreamsApiException(400, "Bad request.");
    public static final StreamsApiException Streams_subscribe_200_Exception = new StreamsApiException(200, "Success.");
    public static final StreamsApiException Streams_subscribe_400_Exception = new StreamsApiException(400, "Success.");
    public static final StreamsApiException Streams_unsubscribe_200_Exception = new StreamsApiException(200, "Success.");
    public static final StreamsApiException Streams_unsubscribe_400_Exception = new StreamsApiException(400, "Bad request.");
    public static final StreamsApiException Streams_updateStream_200_Exception = new StreamsApiException(200, "Success.");
    public static final StreamsApiException Streams_updateStream_400_Exception = new StreamsApiException(400, "Bad request.");
    public static final StreamsApiException Streams_updateSubscriptionSettings_200_Exception = new StreamsApiException(200, "Success.");
    public static final StreamsApiException Streams_updateSubscriptions_200_Exception = new StreamsApiException(200, "Success.");
    

}