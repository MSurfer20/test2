package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CodedError;
import org.openapitools.server.api.model.JsonError;
import org.openapitools.server.api.model.JsonSuccess;
import org.openapitools.server.api.model.JsonSuccessBase;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.NonExistingStreamError;
import org.openapitools.server.api.model.OneOfobjectobject;
import org.openapitools.server.api.model.OneOfstringinteger;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface StreamsApi  {
    //archive_stream
    void archiveStream(Integer streamId, Handler<AsyncResult<JsonSuccess>> handler);
    
    //create_big_blue_button_video_call
    void createBigBlueButtonVideoCall(Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get_stream_id
    void getStreamId(String stream, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get_stream_topics
    void getStreamTopics(Integer streamId, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get_streams
    void getStreams(Boolean includePublic, Boolean includeWebPublic, Boolean includeSubscribed, Boolean includeAllActive, Boolean includeDefault, Boolean includeOwnerSubscribed, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get_subscription_status
    void getSubscriptionStatus(Integer userId, Integer streamId, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //get_subscriptions
    void getSubscriptions(Boolean includeSubscribers, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //mute_topic
    void muteTopic(String topic, String op, String stream, Integer streamId, Handler<AsyncResult<JsonSuccess>> handler);
    
    //subscribe
    void subscribe(List<Object> subscriptions, List<OneOfstringinteger> principals, Boolean authorizationErrorsFatal, Boolean announce, Boolean inviteOnly, Boolean historyPublicToSubscribers, Integer streamPostPolicy, OneOfstringinteger messageRetentionDays, Handler<AsyncResult<OneOfobjectobject>> handler);
    
    //unsubscribe
    void unsubscribe(List<String> subscriptions, List<OneOfstringinteger> principals, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //update_stream
    void updateStream(Integer streamId, String description, String newName, Boolean isPrivate, Boolean isAnnouncementOnly, Integer streamPostPolicy, Boolean historyPublicToSubscribers, OneOfstringinteger messageRetentionDays, Handler<AsyncResult<JsonSuccess>> handler);
    
    //update_subscription_settings
    void updateSubscriptionSettings(List<Object> subscriptionData, Handler<AsyncResult<JsonSuccessBase>> handler);
    
    //update_subscriptions
    void updateSubscriptions(List<String> delete, List<Object> add, Handler<AsyncResult<JsonSuccessBase>> handler);
    
}
