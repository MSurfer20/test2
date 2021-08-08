#ifndef TINY_CPP_CLIENT_MessagesApi_H_
#define TINY_CPP_CLIENT_MessagesApi_H_


#include "Response.h"
#include "Arduino.h"
#include "AbstractService.h"
#include "Helpers.h"
#include <list>

#include "AnyType.h"
#include "CodedError.h"
#include "InvalidMessageError.h"
#include "JsonSuccess.h"
#include "JsonSuccessBase.h"
#include "Object.h"
#include "OneOf<object,object>.h"
#include "OneOf<string,integer>.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class MessagesApi : public AbstractService {
public:
    MessagesApi() = default;

    virtual ~MessagesApi() = default;

    /**
    * Add an emoji reaction.
    *
    * Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` 
    * \param messageId The target message's ID.  *Required*
    * \param emojiName The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name.  *Required*
    * \param emojiCode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. 
    * \param reactionType If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. 
    */
    Response<
                JsonSuccess
        >
    addReaction(
            
            int messageId
            , 
            
            std::string emojiName
            , 
            
            std::string emojiCode
            , 
            
            std::string reactionType
            
    );
    /**
    * Check if messages match a narrow.
    *
    * Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. 
    * \param msgIds List of IDs for the messages to check. *Required*
    * \param narrow A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow). *Required*
    */
    Response<
                AnyType
        >
    checkMessagesMatchNarrow(
            std::list<int> msgIds
            
            , 
            std::list<Object> narrow
            
            
    );
    /**
    * Delete a message.
    *
    * Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
    * \param messageId The target message's ID.  *Required*
    */
    Response<
                JsonSuccess
        >
    deleteMessage(
            
            int messageId
            
    );
    /**
    * Get public temporary URL.
    *
    * Get a temporary URL for access to the file that doesn't require authentication. 
    * \param realmIdStr The realm id.  *Required*
    * \param filename Path to the URL.  *Required*
    */
    Response<
                JsonSuccessBase
        >
    getFileTemporaryUrl(
            
            int realmIdStr
            , 
            
            std::string filename
            
    );
    /**
    * Get a message's edit history.
    *
    * Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
    * \param messageId The target message's ID.  *Required*
    */
    Response<
                JsonSuccessBase
        >
    getMessageHistory(
            
            int messageId
            
    );
    /**
    * Get messages.
    *
    * Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
    * \param numBefore The number of messages with IDs less than the anchor to retrieve.  *Required*
    * \param numAfter The number of messages with IDs greater than the anchor to retrieve.  *Required*
    * \param anchor Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * `newest`: The most recent message. * `oldest`: The oldest message. * `first_unread`: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of `'newest'` and `'oldest'` are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   `first_unread` functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, `oldest` can be emulated with   `anchor=0`, and `newest` with `anchor=10000000000000000`   (that specific large value works around a bug in Zulip   2.1.x and older in the `found_newest` return value). 
    * \param narrow The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow). 
    * \param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars. 
    * \param applyMarkdown If `true`, message content is returned in the rendered HTML format. If `false`, message content is returned in the raw Markdown-format text that user entered. 
    * \param useFirstUnreadAnchor Legacy way to specify `anchor=\"first_unread\"` in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the `anchor`.  Mutually exclusive with `anchor`.  **Changes**: Deprecated in Zulip 3.0, replaced by `anchor=\"first_unread\"` instead. 
    */
    Response<
                JsonSuccessBase
        >
    getMessages(
            
            int numBefore
            , 
            
            int numAfter
            , 
            
            OneOf<string,integer> anchor
            , 
            std::list<Object> narrow
            
            , 
            
            bool clientGravatar
            , 
            
            bool applyMarkdown
            , 
            
            bool useFirstUnreadAnchor
            
    );
    /**
    * Get a message's raw Markdown.
    *
    * Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). 
    * \param messageId The target message's ID.  *Required*
    */
    Response<
                JsonSuccessBase
        >
    getRawMessage(
            
            int messageId
            
    );
    /**
    * Mark all messages as read.
    *
    * Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` 
    */
    Response<
                JsonSuccess
        >
    markAllAsRead(
    );
    /**
    * Mark messages in a stream as read.
    *
    * Mark all the unread messages in a stream as read. 
    * \param streamId The ID of the stream to access.  *Required*
    */
    Response<
                JsonSuccess
        >
    markStreamAsRead(
            
            int streamId
            
    );
    /**
    * Mark messages in a topic as read.
    *
    * Mark all the unread messages in a topic as read. 
    * \param streamId The ID of the stream to access.  *Required*
    * \param topicName The name of the topic whose messages should be marked as read.  *Required*
    */
    Response<
                JsonSuccess
        >
    markTopicAsRead(
            
            int streamId
            , 
            
            std::string topicName
            
    );
    /**
    * Remove an emoji reaction.
    *
    * Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` 
    * \param messageId The target message's ID.  *Required*
    * \param emojiName The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. 
    * \param emojiCode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. 
    * \param reactionType If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. 
    */
    Response<
                JsonSuccess
        >
    removeReaction(
            
            int messageId
            , 
            
            std::string emojiName
            , 
            
            std::string emojiCode
            , 
            
            std::string reactionType
            
    );
    /**
    * Render message.
    *
    * Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` 
    * \param content The content of the message. Maximum message size of 10000 bytes.  *Required*
    */
    Response<
                JsonSuccessBase
        >
    renderMessage(
            
            std::string content
            
    );
    /**
    * Send a message.
    *
    * Send a stream or a private message.  `POST {{ api_url }}/v1/messages` 
    * \param type The type of message to be sent. `private` for a private message and `stream` for a stream message.  *Required*
    * \param to For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0.  *Required*
    * \param content The content of the message. Maximum message size of 10000 bytes.  *Required*
    * \param topic The topic of the message. Only required for stream messages (`type=\"stream\"`), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. 
    * \param queueId For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, `local_id` is required.  If the message is successfully sent, the server will include `local_id` in the `message` event that the client with this `queue_id` will receive notifying it of the new message via [`GET /events`](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device). 
    * \param localId For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the `queue_id` description. 
    */
    Response<
                JsonSuccessBase
        >
    sendMessage(
            
            std::string type
            , 
            std::list<int> to
            
            , 
            
            std::string content
            , 
            
            std::string topic
            , 
            
            std::string queueId
            , 
            
            std::string localId
            
    );
    /**
    * Edit a message.
    *
    * Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
    * \param messageId The target message's ID.  *Required*
    * \param topic The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. 
    * \param propagateMode Which message(s) should be edited: just the one indicated in `message_id`, messages in the same topic that had been sent after this one, or all of them.  Only the default value of `change_one` is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic. 
    * \param sendNotificationToOldThread Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9). 
    * \param sendNotificationToNewThread Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9). 
    * \param content The content of the message. Maximum message size of 10000 bytes. 
    * \param streamId The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message. 
    */
    Response<
                JsonSuccess
        >
    updateMessage(
            
            int messageId
            , 
            
            std::string topic
            , 
            
            std::string propagateMode
            , 
            
            bool sendNotificationToOldThread
            , 
            
            bool sendNotificationToNewThread
            , 
            
            std::string content
            , 
            
            int streamId
            
    );
    /**
    * Update personal message flags.
    *
    * Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
    * \param messages An array containing the IDs of the target messages.  *Required*
    * \param op Whether to `add` the flag or `remove` it.  *Required*
    * \param flag The flag that should be added/removed.  *Required*
    */
    Response<
                JsonSuccessBase
        >
    updateMessageFlags(
            std::list<int> messages
            
            , 
            
            std::string op
            , 
            
            std::string flag
            
    );
    /**
    * Upload a file.
    *
    * Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
    * \param filename 
    */
    Response<
                JsonSuccessBase
        >
    uploadFile(
            
            std::string filename
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_MessagesApi_H_ */