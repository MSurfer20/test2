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

import java.util.List;
import java.util.Map;

public interface StreamsApi  {
    Future<ApiResponse<JsonSuccess>> archiveStream(Integer streamId);
    Future<ApiResponse<JsonSuccessBase>> createBigBlueButtonVideoCall();
    Future<ApiResponse<JsonSuccessBase>> getStreamId(String stream);
    Future<ApiResponse<JsonSuccessBase>> getStreamTopics(Integer streamId);
    Future<ApiResponse<JsonSuccessBase>> getStreams(Boolean includePublic, Boolean includeWebPublic, Boolean includeSubscribed, Boolean includeAllActive, Boolean includeDefault, Boolean includeOwnerSubscribed);
    Future<ApiResponse<JsonSuccessBase>> getSubscriptionStatus(Integer userId, Integer streamId);
    Future<ApiResponse<JsonSuccessBase>> getSubscriptions(Boolean includeSubscribers);
    Future<ApiResponse<JsonSuccess>> muteTopic(String topic, String op, String stream, Integer streamId);
    Future<ApiResponse<OneOfobjectobject>> subscribe(List<Object> subscriptions, List<OneOfstringinteger> principals, Boolean authorizationErrorsFatal, Boolean announce, Boolean inviteOnly, Boolean historyPublicToSubscribers, Integer streamPostPolicy, OneOfstringinteger messageRetentionDays);
    Future<ApiResponse<JsonSuccessBase>> unsubscribe(List<String> subscriptions, List<OneOfstringinteger> principals);
    Future<ApiResponse<JsonSuccess>> updateStream(Integer streamId, String description, String newName, Boolean isPrivate, Boolean isAnnouncementOnly, Integer streamPostPolicy, Boolean historyPublicToSubscribers, OneOfstringinteger messageRetentionDays);
    Future<ApiResponse<JsonSuccessBase>> updateSubscriptionSettings(List<Object> subscriptionData);
    Future<ApiResponse<JsonSuccessBase>> updateSubscriptions(List<String> delete, List<Object> add);
}
