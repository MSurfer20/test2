#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/any_type.h"
#include "../model/coded_error.h"
#include "../model/invalid_message_error.h"
#include "../model/json_success.h"
#include "../model/json_success_base.h"
#include "../model/object.h"
#include "../model/one_ofobjectobject.h"
#include "../model/one_ofstringinteger.h"

// Enum TYPE for MessagesAPI_sendMessage
typedef enum  { zulip_rest_api_sendMessage_TYPE_NULL = 0, zulip_rest_api_sendMessage_TYPE__private, zulip_rest_api_sendMessage_TYPE_stream } zulip_rest_api_sendMessage_type_e;

// Enum PROPAGATEMODE for MessagesAPI_updateMessage
typedef enum  { zulip_rest_api_updateMessage_PROPAGATEMODE_NULL = 0, zulip_rest_api_updateMessage_PROPAGATEMODE_change_one, zulip_rest_api_updateMessage_PROPAGATEMODE_change_later, zulip_rest_api_updateMessage_PROPAGATEMODE_change_all } zulip_rest_api_updateMessage_propagate_mode_e;

// Enum OP for MessagesAPI_updateMessageFlags
typedef enum  { zulip_rest_api_updateMessageFlags_OP_NULL = 0, zulip_rest_api_updateMessageFlags_OP_add, zulip_rest_api_updateMessageFlags_OP__remove } zulip_rest_api_updateMessageFlags_op_e;


// Add an emoji reaction
//
// Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` 
//
json_success_t*
MessagesAPI_addReaction(apiClient_t *apiClient, int message_id , char * emoji_name , char * emoji_code , char * reaction_type );


// Check if messages match a narrow
//
// Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. 
//
any_type_t*
MessagesAPI_checkMessagesMatchNarrow(apiClient_t *apiClient, list_t * msg_ids , list_t * narrow );


// Delete a message
//
// Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
//
json_success_t*
MessagesAPI_deleteMessage(apiClient_t *apiClient, int message_id );


// Get public temporary URL
//
// Get a temporary URL for access to the file that doesn't require authentication. 
//
json_success_base_t*
MessagesAPI_getFileTemporaryUrl(apiClient_t *apiClient, int realm_id_str , char * filename );


// Get a message's edit history
//
// Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
//
json_success_base_t*
MessagesAPI_getMessageHistory(apiClient_t *apiClient, int message_id );


// Get messages
//
// Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
//
json_success_base_t*
MessagesAPI_getMessages(apiClient_t *apiClient, int num_before , int num_after , one_ofstringinteger_t * anchor , list_t * narrow , int client_gravatar , int apply_markdown , int use_first_unread_anchor );


// Get a message's raw Markdown
//
// Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). 
//
json_success_base_t*
MessagesAPI_getRawMessage(apiClient_t *apiClient, int message_id );


// Mark all messages as read
//
// Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` 
//
json_success_t*
MessagesAPI_markAllAsRead(apiClient_t *apiClient);


// Mark messages in a stream as read
//
// Mark all the unread messages in a stream as read. 
//
json_success_t*
MessagesAPI_markStreamAsRead(apiClient_t *apiClient, int stream_id );


// Mark messages in a topic as read
//
// Mark all the unread messages in a topic as read. 
//
json_success_t*
MessagesAPI_markTopicAsRead(apiClient_t *apiClient, int stream_id , char * topic_name );


// Remove an emoji reaction
//
// Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` 
//
json_success_t*
MessagesAPI_removeReaction(apiClient_t *apiClient, int message_id , char * emoji_name , char * emoji_code , char * reaction_type );


// Render message
//
// Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` 
//
json_success_base_t*
MessagesAPI_renderMessage(apiClient_t *apiClient, char * content );


// Send a message
//
// Send a stream or a private message.  `POST {{ api_url }}/v1/messages` 
//
json_success_base_t*
MessagesAPI_sendMessage(apiClient_t *apiClient, zulip_rest_api_sendMessage_type_e type , list_t * to , char * content , char * topic , char * queue_id , char * local_id );


// Edit a message
//
// Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
//
json_success_t*
MessagesAPI_updateMessage(apiClient_t *apiClient, int message_id , char * topic , zulip_rest_api_updateMessage_propagate_mode_e propagate_mode , int send_notification_to_old_thread , int send_notification_to_new_thread , char * content , int stream_id );


// Update personal message flags
//
// Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
//
json_success_base_t*
MessagesAPI_updateMessageFlags(apiClient_t *apiClient, list_t * messages , zulip_rest_api_updateMessageFlags_op_e op , char * flag );


// Upload a file
//
// Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
//
json_success_base_t*
MessagesAPI_uploadFile(apiClient_t *apiClient, binary_t* filename );


