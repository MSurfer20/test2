package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.BadEventQueueIdError
import org.openapitools.model.JsonSuccess
import org.openapitools.model.JsonSuccessBase
import java.util.List
import org.openapitools.model.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError
import org.openapitools.model.OneOfRateLimitedError
import org.openapitools.model.OneOfUserDeactivatedErrorRealmDeactivatedError

class RealTimeEventsApi {
    String basePath = "https://example.zulipchat.com/api/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def deleteQueue ( String queueId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/events"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (queueId == null) {
            throw new RuntimeException("missing required params queueId")
        }

        if (queueId != null) {
            queryParams.put("queue_id", queueId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    JsonSuccess.class )

    }

    def getEvents ( String queueId, Integer lastEventId, Boolean dontBlock, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/events"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (queueId == null) {
            throw new RuntimeException("missing required params queueId")
        }

        if (queueId != null) {
            queryParams.put("queue_id", queueId)
        }
        if (lastEventId != null) {
            queryParams.put("last_event_id", lastEventId)
        }
        if (dontBlock != null) {
            queryParams.put("dont_block", dontBlock)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    JsonSuccessBase.class )

    }

    def realTimePost ( List<String> eventTypes, List<List<String>> narrow, Boolean allPublicStreams, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/real-time"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (eventTypes != null) {
            queryParams.put("event_types", eventTypes)
        }
        if (narrow != null) {
            queryParams.put("narrow", narrow)
        }
        if (allPublicStreams != null) {
            queryParams.put("all_public_streams", allPublicStreams)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def registerQueue ( Boolean applyMarkdown, Boolean clientGravatar, Boolean slimPresence, List<String> eventTypes, Boolean allPublicStreams, Boolean includeSubscribers, Object clientCapabilities, List<String> fetchEventTypes, List<List<String>> narrow, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/register"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (applyMarkdown != null) {
            queryParams.put("apply_markdown", applyMarkdown)
        }
        if (clientGravatar != null) {
            queryParams.put("client_gravatar", clientGravatar)
        }
        if (slimPresence != null) {
            queryParams.put("slim_presence", slimPresence)
        }
        if (eventTypes != null) {
            queryParams.put("event_types", eventTypes)
        }
        if (allPublicStreams != null) {
            queryParams.put("all_public_streams", allPublicStreams)
        }
        if (includeSubscribers != null) {
            queryParams.put("include_subscribers", includeSubscribers)
        }
        if (clientCapabilities != null) {
            queryParams.put("client_capabilities", clientCapabilities)
        }
        if (fetchEventTypes != null) {
            queryParams.put("fetch_event_types", fetchEventTypes)
        }
        if (narrow != null) {
            queryParams.put("narrow", narrow)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    JsonSuccessBase.class )

    }

    def restErrorHandling ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/rest-error-handling"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

}
