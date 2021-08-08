#ifndef _StreamsManager_H_
#define _StreamsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "CodedError.h"
#include "JsonError.h"
#include "JsonSuccess.h"
#include "JsonSuccessBase.h"
#include "NonExistingStreamError.h"
#include "OneOf<object,object>.h"
#include "OneOf<string,integer>.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Streams Streams
 * \ingroup Operations
 *  @{
 */
class StreamsManager {
public:
	StreamsManager();
	virtual ~StreamsManager();

/*! \brief Archive a stream. *Synchronous*
 *
 * [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 
 * \param streamId The ID of the stream to access.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool archiveStreamSync(char * accessToken,
	int streamId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);

/*! \brief Archive a stream. *Asynchronous*
 *
 * [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 
 * \param streamId The ID of the stream to access.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool archiveStreamAsync(char * accessToken,
	int streamId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);


/*! \brief Create BigBlueButton video call. *Synchronous*
 *
 * Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createBigBlueButtonVideoCallSync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Create BigBlueButton video call. *Asynchronous*
 *
 * Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createBigBlueButtonVideoCallAsync(char * accessToken,
	
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);


/*! \brief Get stream ID. *Synchronous*
 *
 * Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 
 * \param stream The name of the stream to access.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getStreamIdSync(char * accessToken,
	std::string stream, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Get stream ID. *Asynchronous*
 *
 * Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 
 * \param stream The name of the stream to access.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getStreamIdAsync(char * accessToken,
	std::string stream, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);


/*! \brief Get topics in a stream. *Synchronous*
 *
 * Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 
 * \param streamId The ID of the stream to access.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getStreamTopicsSync(char * accessToken,
	int streamId, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Get topics in a stream. *Asynchronous*
 *
 * Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 
 * \param streamId The ID of the stream to access.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getStreamTopicsAsync(char * accessToken,
	int streamId, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);


/*! \brief Get all streams. *Synchronous*
 *
 * Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 
 * \param includePublic Include all public streams. 
 * \param includeWebPublic Include all web public streams. 
 * \param includeSubscribed Include all streams that the user is subscribed to. 
 * \param includeAllActive Include all active streams. The user must have administrative privileges to use this parameter. 
 * \param includeDefault Include all default streams for the user's realm. 
 * \param includeOwnerSubscribed If the user is a bot, include all streams that the bot's owner is subscribed to. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getStreamsSync(char * accessToken,
	bool includePublic, bool includeWebPublic, bool includeSubscribed, bool includeAllActive, bool includeDefault, bool includeOwnerSubscribed, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Get all streams. *Asynchronous*
 *
 * Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 
 * \param includePublic Include all public streams. 
 * \param includeWebPublic Include all web public streams. 
 * \param includeSubscribed Include all streams that the user is subscribed to. 
 * \param includeAllActive Include all active streams. The user must have administrative privileges to use this parameter. 
 * \param includeDefault Include all default streams for the user's realm. 
 * \param includeOwnerSubscribed If the user is a bot, include all streams that the bot's owner is subscribed to. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getStreamsAsync(char * accessToken,
	bool includePublic, bool includeWebPublic, bool includeSubscribed, bool includeAllActive, bool includeDefault, bool includeOwnerSubscribed, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);


/*! \brief Get subscription status. *Synchronous*
 *
 * Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 
 * \param userId The target user's ID.  *Required*
 * \param streamId The ID of the stream to access.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getSubscriptionStatusSync(char * accessToken,
	int userId, int streamId, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Get subscription status. *Asynchronous*
 *
 * Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 
 * \param userId The target user's ID.  *Required*
 * \param streamId The ID of the stream to access.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getSubscriptionStatusAsync(char * accessToken,
	int userId, int streamId, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);


/*! \brief Get subscribed streams. *Synchronous*
 *
 * Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 
 * \param includeSubscribers Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getSubscriptionsSync(char * accessToken,
	bool includeSubscribers, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Get subscribed streams. *Asynchronous*
 *
 * Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 
 * \param includeSubscribers Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getSubscriptionsAsync(char * accessToken,
	bool includeSubscribers, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);


/*! \brief Topic muting. *Synchronous*
 *
 * This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 
 * \param topic The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic.  *Required*
 * \param op Whether to mute (`add`) or unmute (`remove`) the provided topic.  *Required*
 * \param stream The name of the stream to access. 
 * \param streamId The ID of the stream to access. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool muteTopicSync(char * accessToken,
	std::string topic, std::string op, std::string stream, int streamId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);

/*! \brief Topic muting. *Asynchronous*
 *
 * This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 
 * \param topic The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic.  *Required*
 * \param op Whether to mute (`add`) or unmute (`remove`) the provided topic.  *Required*
 * \param stream The name of the stream to access. 
 * \param streamId The ID of the stream to access. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool muteTopicAsync(char * accessToken,
	std::string topic, std::string op, std::string stream, int streamId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);


/*! \brief Subscribe to a stream. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool subscribeSync(char * accessToken,
	std::list<std::string> subscriptions, std::list<OneOf&lt;string,integer&gt;> principals, bool authorizationErrorsFatal, bool announce, bool inviteOnly, bool historyPublicToSubscribers, int streamPostPolicy, OneOf<string,integer> messageRetentionDays, 
	void(* handler)(OneOf&lt;object,object&gt;, Error, void* )
	, void* userData);

/*! \brief Subscribe to a stream. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool subscribeAsync(char * accessToken,
	std::list<std::string> subscriptions, std::list<OneOf&lt;string,integer&gt;> principals, bool authorizationErrorsFatal, bool announce, bool inviteOnly, bool historyPublicToSubscribers, int streamPostPolicy, OneOf<string,integer> messageRetentionDays, 
	void(* handler)(OneOf&lt;object,object&gt;, Error, void* )
	, void* userData);


/*! \brief Unsubscribe from a stream. *Synchronous*
 *
 * Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 
 * \param subscriptions A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API.  *Required*
 * \param principals A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool unsubscribeSync(char * accessToken,
	std::list<std::string> subscriptions, std::list<OneOf&lt;string,integer&gt;> principals, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Unsubscribe from a stream. *Asynchronous*
 *
 * Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 
 * \param subscriptions A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API.  *Required*
 * \param principals A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool unsubscribeAsync(char * accessToken,
	std::list<std::string> subscriptions, std::list<OneOf&lt;string,integer&gt;> principals, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);


/*! \brief Update a stream. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateStreamSync(char * accessToken,
	int streamId, std::string description, std::string newName, bool isPrivate, bool isAnnouncementOnly, int streamPostPolicy, bool historyPublicToSubscribers, OneOf<string,integer> messageRetentionDays, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);

/*! \brief Update a stream. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateStreamAsync(char * accessToken,
	int streamId, std::string description, std::string newName, bool isPrivate, bool isAnnouncementOnly, int streamPostPolicy, bool historyPublicToSubscribers, OneOf<string,integer> messageRetentionDays, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);


/*! \brief Update subscription settings. *Synchronous*
 *
 * This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 
 * \param subscriptionData A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateSubscriptionSettingsSync(char * accessToken,
	std::list<std::string> subscriptionData, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Update subscription settings. *Asynchronous*
 *
 * This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 
 * \param subscriptionData A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateSubscriptionSettingsAsync(char * accessToken,
	std::list<std::string> subscriptionData, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);


/*! \brief Update subscriptions. *Synchronous*
 *
 * Update which streams you are are subscribed to. 
 * \param r_delete A list of stream names to unsubscribe from. 
 * \param add A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateSubscriptionsSync(char * accessToken,
	std::list<std::string> r_delete, std::list<std::string> add, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);

/*! \brief Update subscriptions. *Asynchronous*
 *
 * Update which streams you are are subscribed to. 
 * \param r_delete A list of stream names to unsubscribe from. 
 * \param add A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateSubscriptionsAsync(char * accessToken,
	std::list<std::string> r_delete, std::list<std::string> add, 
	void(* handler)(JsonSuccessBase, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://example.zulipchat.com/api/v1";
	}
};
/** @}*/

}
}
#endif /* StreamsManager_H_ */
