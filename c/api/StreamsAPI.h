#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/coded_error.h"
#include "../model/json_error.h"
#include "../model/json_success.h"
#include "../model/json_success_base.h"
#include "../model/non_existing_stream_error.h"
#include "../model/object.h"
#include "../model/one_ofobjectobject.h"
#include "../model/one_ofstringinteger.h"

// Enum OP for StreamsAPI_muteTopic
typedef enum  { zulip_rest_api_muteTopic_OP_NULL = 0, zulip_rest_api_muteTopic_OP_add, zulip_rest_api_muteTopic_OP__remove } zulip_rest_api_muteTopic_op_e;


// Archive a stream
//
// [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 
//
json_success_t*
StreamsAPI_archiveStream(apiClient_t *apiClient, int stream_id );


// Create BigBlueButton video call
//
// Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
//
json_success_base_t*
StreamsAPI_createBigBlueButtonVideoCall(apiClient_t *apiClient);


// Get stream ID
//
// Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 
//
json_success_base_t*
StreamsAPI_getStreamId(apiClient_t *apiClient, char * stream );


// Get topics in a stream
//
// Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 
//
json_success_base_t*
StreamsAPI_getStreamTopics(apiClient_t *apiClient, int stream_id );


// Get all streams
//
// Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 
//
json_success_base_t*
StreamsAPI_getStreams(apiClient_t *apiClient, int include_public , int include_web_public , int include_subscribed , int include_all_active , int include_default , int include_owner_subscribed );


// Get subscription status
//
// Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 
//
json_success_base_t*
StreamsAPI_getSubscriptionStatus(apiClient_t *apiClient, int user_id , int stream_id );


// Get subscribed streams
//
// Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 
//
json_success_base_t*
StreamsAPI_getSubscriptions(apiClient_t *apiClient, int include_subscribers );


// Topic muting
//
// This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 
//
json_success_t*
StreamsAPI_muteTopic(apiClient_t *apiClient, char * topic , zulip_rest_api_muteTopic_op_e op , char * stream , int stream_id );


// Subscribe to a stream
//
// Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 
//
one_ofobjectobject_t*
StreamsAPI_subscribe(apiClient_t *apiClient, list_t * subscriptions , list_t * principals , int authorization_errors_fatal , int announce , int invite_only , int history_public_to_subscribers , int stream_post_policy , one_ofstringinteger_t * message_retention_days );


// Unsubscribe from a stream
//
// Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 
//
json_success_base_t*
StreamsAPI_unsubscribe(apiClient_t *apiClient, list_t * subscriptions , list_t * principals );


// Update a stream
//
// Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 
//
json_success_t*
StreamsAPI_updateStream(apiClient_t *apiClient, int stream_id , char * description , char * new_name , int is_private , int is_announcement_only , int stream_post_policy , int history_public_to_subscribers , one_ofstringinteger_t * message_retention_days );


// Update subscription settings
//
// This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 
//
json_success_base_t*
StreamsAPI_updateSubscriptionSettings(apiClient_t *apiClient, list_t * subscription_data );


// Update subscriptions
//
// Update which streams you are are subscribed to. 
//
json_success_base_t*
StreamsAPI_updateSubscriptions(apiClient_t *apiClient, list_t * _delete , list_t * add );


