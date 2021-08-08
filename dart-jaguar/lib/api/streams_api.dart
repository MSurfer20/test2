import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_mimetype/jaguar_mimetype.dart';
import 'dart:async';

import 'package:openapi/model/json_success_base.dart';
import 'package:openapi/model/non_existing_stream_error.dart';
import 'package:openapi/model/json_success.dart';
import 'package:openapi/model/one_ofstringinteger.dart';
import 'package:openapi/model/one_ofobjectobject.dart';
import 'package:openapi/model/json_error.dart';
import 'package:openapi/model/coded_error.dart';

part 'streams_api.jretro.dart';

@GenApiClient()
class StreamsApi extends ApiClient with _$StreamsApiClient {
    final Route base;
    final Map<String, CodecRepo> converters;
    final Duration timeout;

    StreamsApi({this.base, this.converters, this.timeout = const Duration(minutes: 2)});

    /// Archive a stream
    ///
    /// [Archive the stream](/help/archive-a-stream) with the ID &#x60;stream_id&#x60;.  &#x60;DELETE {{ api_url }}/v1/streams/{stream_id}&#x60; 
    @DeleteReq(path: "/streams/:stream_id")
    Future<JsonSuccess> archiveStream(
            @PathParam("stream_id") int streamId
        ) {
        return super.archiveStream(
        streamId

        ).timeout(timeout);
    }

    /// Create BigBlueButton video call
    ///
    /// Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
    @GetReq(path: "/calls/bigbluebutton/create")
    Future<JsonSuccessBase> createBigBlueButtonVideoCall(
        ) {
        return super.createBigBlueButtonVideoCall(

        ).timeout(timeout);
    }

    /// Delete a topic
    ///
    /// Delete all messages in a topic.  &#x60;POST {{ api_url }}/v1/streams/{stream_id}/delete_topic&#x60;  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. 
    @PostReq(path: "/streams/:stream_id/delete_topic")
    Future<JsonSuccess> deleteTopic(
            @PathParam("stream_id") int streamId
        ,
            @QueryParam("topic_name") String topicName
        ) {
        return super.deleteTopic(
        streamId
        ,
        topicName

        ).timeout(timeout);
    }

    /// Get stream ID
    ///
    /// Get the unique ID of a given stream.  &#x60;GET {{ api_url }}/v1/get_stream_id&#x60; 
    @GetReq(path: "/get_stream_id")
    Future<JsonSuccessBase> getStreamId(
        
            @QueryParam("stream") String stream
        ) {
        return super.getStreamId(
        
        stream

        ).timeout(timeout);
    }

    /// Get topics in a stream
    ///
    /// Get all the topics in a specific stream  &#x60;GET {{ api_url }}/v1/users/me/{stream_id}/topics&#x60; 
    @GetReq(path: "/users/me/:stream_id/topics")
    Future<JsonSuccessBase> getStreamTopics(
            @PathParam("stream_id") int streamId
        ) {
        return super.getStreamTopics(
        streamId

        ).timeout(timeout);
    }

    /// Get all streams
    ///
    /// Get all streams that the user has access to.  &#x60;GET {{ api_url }}/v1/streams&#x60; 
    @GetReq(path: "/streams")
    Future<JsonSuccessBase> getStreams(
        
            @QueryParam("include_public") bool includePublic, 
        
            @QueryParam("include_web_public") bool includeWebPublic, 
        
            @QueryParam("include_subscribed") bool includeSubscribed, 
        
            @QueryParam("include_all_active") bool includeAllActive, 
        
            @QueryParam("include_default") bool includeDefault, 
        
            @QueryParam("include_owner_subscribed") bool includeOwnerSubscribed
        ) {
        return super.getStreams(
        
        includePublic, 
        
        includeWebPublic, 
        
        includeSubscribed, 
        
        includeAllActive, 
        
        includeDefault, 
        
        includeOwnerSubscribed

        ).timeout(timeout);
    }

    /// Get the subscribers of a stream
    ///
    /// Get all users subscribed to a stream.  &#x60;Get {{ api_url }}/v1/streams/{stream_id}/members&#x60; 
    @GetReq(path: "/streams/:stream_id/members")
    Future<JsonSuccessBase> getSubscribers(
            @PathParam("stream_id") int streamId
        ) {
        return super.getSubscribers(
        streamId

        ).timeout(timeout);
    }

    /// Get subscription status
    ///
    /// Check whether a user is subscribed to a stream.  &#x60;GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}&#x60;  **Changes**: New in Zulip 3.0 (feature level 11). 
    @GetReq(path: "/users/:user_id/subscriptions/:stream_id")
    Future<JsonSuccessBase> getSubscriptionStatus(
            @PathParam("user_id") int userId, 
            @PathParam("stream_id") int streamId
        ) {
        return super.getSubscriptionStatus(
        userId, 
        streamId

        ).timeout(timeout);
    }

    /// Get subscribed streams
    ///
    /// Get all streams that the user is subscribed to.  &#x60;GET {{ api_url }}/v1/users/me/subscriptions&#x60; 
    @GetReq(path: "/users/me/subscriptions")
    Future<JsonSuccessBase> getSubscriptions(
        
            @QueryParam("include_subscribers") bool includeSubscribers
        ) {
        return super.getSubscriptions(
        
        includeSubscribers

        ).timeout(timeout);
    }

    /// Topic muting
    ///
    /// This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user&#39;s unread count totals.  &#x60;PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics&#x60; 
    @PatchReq(path: "/users/me/subscriptions/muted_topics")
    Future<JsonSuccess> muteTopic(
        
            @QueryParam("stream") String stream, 
        
            @QueryParam("stream_id") int streamId, 
        
            @QueryParam("topic") String topic, 
        
            @QueryParam("op") String op
        ) {
        return super.muteTopic(
        
        stream, 
        
        streamId, 
        
        topic, 
        
        op

        ).timeout(timeout);
    }

    /// Subscribe to a stream
    ///
    /// Subscribe one or more users to one or more streams.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions&#x60;  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like &#x60;invite_only&#x60; detailed below. 
    @PostReq(path: "/users/me/subscriptions")
    Future<OneOfobjectobject> subscribe(
        
            @QueryParam("subscriptions") List<Object> subscriptions, 
        
            @QueryParam("principals") List<OneOfstringinteger> principals, 
        
            @QueryParam("authorization_errors_fatal") bool authorizationErrorsFatal, 
        
            @QueryParam("announce") bool announce, 
        
            @QueryParam("invite_only") bool inviteOnly, 
        
            @QueryParam("history_public_to_subscribers") bool historyPublicToSubscribers, 
        
            @QueryParam("stream_post_policy") int streamPostPolicy, 
        
            @QueryParam("message_retention_days") OneOfstringinteger messageRetentionDays
        ) {
        return super.subscribe(
        
        subscriptions, 
        
        principals, 
        
        authorizationErrorsFatal, 
        
        announce, 
        
        inviteOnly, 
        
        historyPublicToSubscribers, 
        
        streamPostPolicy, 
        
        messageRetentionDays

        ).timeout(timeout);
    }

    /// Unsubscribe from a stream
    ///
    /// Unsubscribe yourself or other users from one or more streams.  &#x60;DELETE {{ api_url }}/v1/users/me/subscriptions&#x60; 
    @DeleteReq(path: "/users/me/subscriptions")
    Future<JsonSuccessBase> unsubscribe(
        
            @QueryParam("subscriptions") List<String> subscriptions, 
        
            @QueryParam("principals") List<OneOfstringinteger> principals
        ) {
        return super.unsubscribe(
        
        subscriptions, 
        
        principals

        ).timeout(timeout);
    }

    /// Update a stream
    ///
    /// Configure the stream with the ID &#x60;stream_id&#x60;.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  &#x60;PATCH {{ api_url }}/v1/streams/{stream_id}&#x60; 
    @PatchReq(path: "/streams/:stream_id")
    Future<JsonSuccess> updateStream(
            @PathParam("stream_id") int streamId
        ,
            @QueryParam("description") String description, 
        
            @QueryParam("new_name") String newName, 
        
            @QueryParam("is_private") bool isPrivate, 
        
            @QueryParam("is_announcement_only") bool isAnnouncementOnly, 
        
            @QueryParam("stream_post_policy") int streamPostPolicy, 
        
            @QueryParam("history_public_to_subscribers") bool historyPublicToSubscribers, 
        
            @QueryParam("message_retention_days") OneOfstringinteger messageRetentionDays
        ) {
        return super.updateStream(
        streamId
        ,
        description, 
        
        newName, 
        
        isPrivate, 
        
        isAnnouncementOnly, 
        
        streamPostPolicy, 
        
        historyPublicToSubscribers, 
        
        messageRetentionDays

        ).timeout(timeout);
    }

    /// Update subscription settings
    ///
    /// This endpoint is used to update the user&#39;s personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions/properties&#x60; 
    @PostReq(path: "/users/me/subscriptions/properties")
    Future<JsonSuccessBase> updateSubscriptionSettings(
        
            @QueryParam("subscription_data") List<Object> subscriptionData
        ) {
        return super.updateSubscriptionSettings(
        
        subscriptionData

        ).timeout(timeout);
    }

    /// Update subscriptions
    ///
    /// Update which streams you are are subscribed to. 
    @PatchReq(path: "/users/me/subscriptions")
    Future<JsonSuccessBase> updateSubscriptions(
        
            @QueryParam("delete") List<String> delete, 
        
            @QueryParam("add") List<Object> add
        ) {
        return super.updateSubscriptions(
        
        delete, 
        
        add

        ).timeout(timeout);
    }


}
