package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CodedError;
import org.openapitools.vertxweb.server.model.JsonError;
import org.openapitools.vertxweb.server.model.JsonSuccess;
import org.openapitools.vertxweb.server.model.JsonSuccessBase;
import org.openapitools.vertxweb.server.model.NonExistingStreamError;
import org.openapitools.vertxweb.server.model.OneOfobjectobject;
import org.openapitools.vertxweb.server.model.OneOfstringinteger;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.impl.HttpStatusException;

import java.util.List;
import java.util.Map;

// Implement this class

public class StreamsApiImpl implements StreamsApi {
    public Future<ApiResponse<JsonSuccess>> archiveStream(Integer streamId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> createBigBlueButtonVideoCall() {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> getStreamId(String stream) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> getStreamTopics(Integer streamId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> getStreams(Boolean includePublic, Boolean includeWebPublic, Boolean includeSubscribed, Boolean includeAllActive, Boolean includeDefault, Boolean includeOwnerSubscribed) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> getSubscriptionStatus(Integer userId, Integer streamId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> getSubscriptions(Boolean includeSubscribers) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> muteTopic(String topic, String op, String stream, Integer streamId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<OneOfobjectobject>> subscribe(List<Object> subscriptions, List<OneOfstringinteger> principals, Boolean authorizationErrorsFatal, Boolean announce, Boolean inviteOnly, Boolean historyPublicToSubscribers, Integer streamPostPolicy, OneOfstringinteger messageRetentionDays) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> unsubscribe(List<String> subscriptions, List<OneOfstringinteger> principals) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccess>> updateStream(Integer streamId, String description, String newName, Boolean isPrivate, Boolean isAnnouncementOnly, Integer streamPostPolicy, Boolean historyPublicToSubscribers, OneOfstringinteger messageRetentionDays) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> updateSubscriptionSettings(List<Object> subscriptionData) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<JsonSuccessBase>> updateSubscriptions(List<String> delete, List<Object> add) {
        return Future.failedFuture(new HttpStatusException(501));
    }

}
