package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CodedError
import org.openapitools.model.JsonError
import org.openapitools.model.JsonSuccess
import org.openapitools.model.JsonSuccessBase
import org.openapitools.model.NonExistingStreamError
import org.openapitools.model.OneOfobjectobject
import org.openapitools.model.OneOfstringinteger

class StreamsApi {
    String basePath = "https://example.zulipchat.com/api/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def archiveStream ( Integer streamId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/streams/${stream_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (streamId == null) {
            throw new RuntimeException("missing required params streamId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    JsonSuccess.class )

    }

    def createBigBlueButtonVideoCall ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/calls/bigbluebutton/create"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    JsonSuccessBase.class )

    }

    def getStreamId ( String stream, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/get_stream_id"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (stream == null) {
            throw new RuntimeException("missing required params stream")
        }

        if (stream != null) {
            queryParams.put("stream", stream)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    JsonSuccessBase.class )

    }

    def getStreamTopics ( Integer streamId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users/me/${stream_id}/topics"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (streamId == null) {
            throw new RuntimeException("missing required params streamId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    JsonSuccessBase.class )

    }

    def getStreams ( Boolean includePublic, Boolean includeWebPublic, Boolean includeSubscribed, Boolean includeAllActive, Boolean includeDefault, Boolean includeOwnerSubscribed, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/streams"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (includePublic != null) {
            queryParams.put("include_public", includePublic)
        }
        if (includeWebPublic != null) {
            queryParams.put("include_web_public", includeWebPublic)
        }
        if (includeSubscribed != null) {
            queryParams.put("include_subscribed", includeSubscribed)
        }
        if (includeAllActive != null) {
            queryParams.put("include_all_active", includeAllActive)
        }
        if (includeDefault != null) {
            queryParams.put("include_default", includeDefault)
        }
        if (includeOwnerSubscribed != null) {
            queryParams.put("include_owner_subscribed", includeOwnerSubscribed)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    JsonSuccessBase.class )

    }

    def getSubscriptionStatus ( Integer userId, Integer streamId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users/${user_id}/subscriptions/${stream_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (streamId == null) {
            throw new RuntimeException("missing required params streamId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    JsonSuccessBase.class )

    }

    def getSubscriptions ( Boolean includeSubscribers, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users/me/subscriptions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (includeSubscribers != null) {
            queryParams.put("include_subscribers", includeSubscribers)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    JsonSuccessBase.class )

    }

    def muteTopic ( String topic, String op, String stream, Integer streamId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users/me/subscriptions/muted_topics"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (topic == null) {
            throw new RuntimeException("missing required params topic")
        }
        // verify required params are set
        if (op == null) {
            throw new RuntimeException("missing required params op")
        }

        if (stream != null) {
            queryParams.put("stream", stream)
        }
        if (streamId != null) {
            queryParams.put("stream_id", streamId)
        }
        if (topic != null) {
            queryParams.put("topic", topic)
        }
        if (op != null) {
            queryParams.put("op", op)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    JsonSuccess.class )

    }

    def subscribe ( List<Object> subscriptions, List<OneOfstringinteger> principals, Boolean authorizationErrorsFatal, Boolean announce, Boolean inviteOnly, Boolean historyPublicToSubscribers, Integer streamPostPolicy, OneOfstringinteger messageRetentionDays, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users/me/subscriptions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (subscriptions == null) {
            throw new RuntimeException("missing required params subscriptions")
        }

        if (subscriptions != null) {
            queryParams.put("subscriptions", subscriptions)
        }
        if (principals != null) {
            queryParams.put("principals", principals)
        }
        if (authorizationErrorsFatal != null) {
            queryParams.put("authorization_errors_fatal", authorizationErrorsFatal)
        }
        if (announce != null) {
            queryParams.put("announce", announce)
        }
        if (inviteOnly != null) {
            queryParams.put("invite_only", inviteOnly)
        }
        if (historyPublicToSubscribers != null) {
            queryParams.put("history_public_to_subscribers", historyPublicToSubscribers)
        }
        if (streamPostPolicy != null) {
            queryParams.put("stream_post_policy", streamPostPolicy)
        }
        if (messageRetentionDays != null) {
            queryParams.put("message_retention_days", messageRetentionDays)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    OneOfobjectobject.class )

    }

    def unsubscribe ( List<String> subscriptions, List<OneOfstringinteger> principals, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users/me/subscriptions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (subscriptions == null) {
            throw new RuntimeException("missing required params subscriptions")
        }

        if (subscriptions != null) {
            queryParams.put("subscriptions", subscriptions)
        }
        if (principals != null) {
            queryParams.put("principals", principals)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    JsonSuccessBase.class )

    }

    def updateStream ( Integer streamId, String description, String newName, Boolean isPrivate, Boolean isAnnouncementOnly, Integer streamPostPolicy, Boolean historyPublicToSubscribers, OneOfstringinteger messageRetentionDays, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/streams/${stream_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (streamId == null) {
            throw new RuntimeException("missing required params streamId")
        }

        if (description != null) {
            queryParams.put("description", description)
        }
        if (newName != null) {
            queryParams.put("new_name", newName)
        }
        if (isPrivate != null) {
            queryParams.put("is_private", isPrivate)
        }
        if (isAnnouncementOnly != null) {
            queryParams.put("is_announcement_only", isAnnouncementOnly)
        }
        if (streamPostPolicy != null) {
            queryParams.put("stream_post_policy", streamPostPolicy)
        }
        if (historyPublicToSubscribers != null) {
            queryParams.put("history_public_to_subscribers", historyPublicToSubscribers)
        }
        if (messageRetentionDays != null) {
            queryParams.put("message_retention_days", messageRetentionDays)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    JsonSuccess.class )

    }

    def updateSubscriptionSettings ( List<Object> subscriptionData, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users/me/subscriptions/properties"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (subscriptionData == null) {
            throw new RuntimeException("missing required params subscriptionData")
        }

        if (subscriptionData != null) {
            queryParams.put("subscription_data", subscriptionData)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    JsonSuccessBase.class )

    }

    def updateSubscriptions ( List<String> delete, List<Object> add, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users/me/subscriptions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (delete != null) {
            queryParams.put("delete", delete)
        }
        if (add != null) {
            queryParams.put("add", add)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    JsonSuccessBase.class )

    }

}
