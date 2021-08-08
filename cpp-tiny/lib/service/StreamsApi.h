#ifndef TINY_CPP_CLIENT_StreamsApi_H_
#define TINY_CPP_CLIENT_StreamsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "AbstractService.h"
#include "Helpers.h"
#include <list>

#include "CodedError.h"
#include "JsonError.h"
#include "JsonSuccess.h"
#include "JsonSuccessBase.h"
#include "NonExistingStreamError.h"
#include "Object.h"
#include "OneOf<object,object>.h"
#include "OneOf<string,integer>.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class StreamsApi : public AbstractService {
public:
    StreamsApi() = default;

    virtual ~StreamsApi() = default;

    /**
    * Archive a stream.
    *
    * [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 
    * \param streamId The ID of the stream to access.  *Required*
    */
    Response<
                JsonSuccess
        >
    archiveStream(
            
            int streamId
            
    );
    /**
    * Create BigBlueButton video call.
    *
    * Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
    */
    Response<
                JsonSuccessBase
        >
    createBigBlueButtonVideoCall(
    );
    /**
    * Delete a topic.
    *
    * Delete all messages in a topic.  `POST {{ api_url }}/v1/streams/{stream_id}/delete_topic`  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. 
    * \param streamId The ID of the stream to access.  *Required*
    * \param topicName The name of the topic to delete.  *Required*
    */
    Response<
                JsonSuccess
        >
    deleteTopic(
            
            int streamId
            , 
            
            std::string topicName
            
    );
    /**
    * Get stream ID.
    *
    * Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 
    * \param stream The name of the stream to access.  *Required*
    */
    Response<
                JsonSuccessBase
        >
    getStreamId(
            
            std::string stream
            
    );
    /**
    * Get topics in a stream.
    *
    * Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 
    * \param streamId The ID of the stream to access.  *Required*
    */
    Response<
                JsonSuccessBase
        >
    getStreamTopics(
            
            int streamId
            
    );
    /**
    * Get all streams.
    *
    * Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 
    * \param includePublic Include all public streams. 
    * \param includeWebPublic Include all web public streams. 
    * \param includeSubscribed Include all streams that the user is subscribed to. 
    * \param includeAllActive Include all active streams. The user must have administrative privileges to use this parameter. 
    * \param includeDefault Include all default streams for the user's realm. 
    * \param includeOwnerSubscribed If the user is a bot, include all streams that the bot's owner is subscribed to. 
    */
    Response<
                JsonSuccessBase
        >
    getStreams(
            
            bool includePublic
            , 
            
            bool includeWebPublic
            , 
            
            bool includeSubscribed
            , 
            
            bool includeAllActive
            , 
            
            bool includeDefault
            , 
            
            bool includeOwnerSubscribed
            
    );
    /**
    * Get the subscribers of a stream.
    *
    * Get all users subscribed to a stream.  `Get {{ api_url }}/v1/streams/{stream_id}/members` 
    * \param streamId The ID of the stream to access.  *Required*
    */
    Response<
                JsonSuccessBase
        >
    getSubscribers(
            
            int streamId
            
    );
    /**
    * Get subscription status.
    *
    * Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 
    * \param userId The target user's ID.  *Required*
    * \param streamId The ID of the stream to access.  *Required*
    */
    Response<
                JsonSuccessBase
        >
    getSubscriptionStatus(
            
            int userId
            , 
            
            int streamId
            
    );
    /**
    * Get subscribed streams.
    *
    * Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 
    * \param includeSubscribers Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 
    */
    Response<
                JsonSuccessBase
        >
    getSubscriptions(
            
            bool includeSubscribers
            
    );
    /**
    * Topic muting.
    *
    * This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 
    * \param topic The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic.  *Required*
    * \param op Whether to mute (`add`) or unmute (`remove`) the provided topic.  *Required*
    * \param stream The name of the stream to access. 
    * \param streamId The ID of the stream to access. 
    */
    Response<
                JsonSuccess
        >
    muteTopic(
            
            std::string topic
            , 
            
            std::string op
            , 
            
            std::string stream
            , 
            
            int streamId
            
    );
    /**
    * Subscribe to a stream.
    *
    * Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 
    * \param subscriptions A list of dictionaries containing the key `name` and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key `description` with an appropriate value.  *Required*
    * \param principals A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
    * \param authorizationErrorsFatal A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When `True`, an authorization error is reported as such. When set to `False`, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the `unauthorized` key. 
    * \param announce If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream's creation. 
    * \param inviteOnly As described above, this endpoint will create a new stream if passed a stream name that doesn't already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. 
    * \param historyPublicToSubscribers Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
    * \param streamPostPolicy Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
    * \param messageRetentionDays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
    */
    Response<
                OneOf&lt;object,object&gt;
        >
    subscribe(
            std::list<Object> subscriptions
            
            , 
            std::list<OneOf&lt;string,integer&gt;> principals
            
            , 
            
            bool authorizationErrorsFatal
            , 
            
            bool announce
            , 
            
            bool inviteOnly
            , 
            
            bool historyPublicToSubscribers
            , 
            
            int streamPostPolicy
            , 
            
            OneOf<string,integer> messageRetentionDays
            
    );
    /**
    * Unsubscribe from a stream.
    *
    * Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 
    * \param subscriptions A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API.  *Required*
    * \param principals A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
    */
    Response<
                JsonSuccessBase
        >
    unsubscribe(
            std::list<std::string> subscriptions
            
            , 
            std::list<OneOf&lt;string,integer&gt;> principals
            
            
    );
    /**
    * Update a stream.
    *
    * Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 
    * \param streamId The ID of the stream to access.  *Required*
    * \param description The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
    * \param newName The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
    * \param isPrivate Change whether the stream is a private stream. 
    * \param isAnnouncementOnly Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead. 
    * \param streamPostPolicy Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
    * \param historyPublicToSubscribers Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
    * \param messageRetentionDays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
    */
    Response<
                JsonSuccess
        >
    updateStream(
            
            int streamId
            , 
            
            std::string description
            , 
            
            std::string newName
            , 
            
            bool isPrivate
            , 
            
            bool isAnnouncementOnly
            , 
            
            int streamPostPolicy
            , 
            
            bool historyPublicToSubscribers
            , 
            
            OneOf<string,integer> messageRetentionDays
            
    );
    /**
    * Update subscription settings.
    *
    * This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 
    * \param subscriptionData A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream.  *Required*
    */
    Response<
                JsonSuccessBase
        >
    updateSubscriptionSettings(
            std::list<Object> subscriptionData
            
            
    );
    /**
    * Update subscriptions.
    *
    * Update which streams you are are subscribed to. 
    * \param r_delete A list of stream names to unsubscribe from. 
    * \param add A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. 
    */
    Response<
                JsonSuccessBase
        >
    updateSubscriptions(
            std::list<std::string> r_delete
            
            , 
            std::list<Object> add
            
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_StreamsApi_H_ */