/**
* Zulip REST API
* Powerful open source group chat 
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * MessagesApi.h
 *
 * 
 */

#ifndef MessagesApi_H_
#define MessagesApi_H_


#include <pistache/http.h>
#include <pistache/router.h>
#include <pistache/http_headers.h>
#include <pistache/optional.h>

#include <utility>

#include "AnyType.h"
#include "CodedError.h"
#include "InvalidMessageError.h"
#include "JsonSuccess.h"
#include "JsonSuccessBase.h"
#include "Object.h"
#include "OneOfobjectobject.h"
#include "OneOfstringinteger.h"
#include <string>

namespace org::openapitools::server::api
{

class  MessagesApi {
public:
    explicit MessagesApi(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    virtual ~MessagesApi() = default;
    void init();

    static const std::string base;

private:
    void setupRoutes();

    void add_reaction_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void check_messages_match_narrow_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void delete_message_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_file_temporary_url_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_message_history_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_messages_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_raw_message_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void mark_all_as_read_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void mark_stream_as_read_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void mark_topic_as_read_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void remove_reaction_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void render_message_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void send_message_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void update_message_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void update_message_flags_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void upload_file_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void messages_api_default_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);

    const std::shared_ptr<Pistache::Rest::Router> router;

    /// <summary>
    /// Helper function to handle unexpected Exceptions during Parameter parsing and validation.
    /// May be overriden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual std::pair<Pistache::Http::Code, std::string> handleParsingException(const std::exception& ex) const noexcept;

    /// <summary>
    /// Helper function to handle unexpected Exceptions during processing of the request in handler functions.
    /// May be overriden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual std::pair<Pistache::Http::Code, std::string> handleOperationException(const std::exception& ex) const noexcept;

    /// <summary>
    /// Add an emoji reaction
    /// </summary>
    /// <remarks>
    /// Add an [emoji reaction](/help/emoji-reactions) to a message.  &#x60;POST {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 
    /// </remarks>
    /// <param name="messageId">The target message&#39;s ID. </param>
    /// <param name="emojiName">The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name. </param>
    /// <param name="emojiCode">A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji.  (optional, default to &quot;&quot;)</param>
    /// <param name="reactionType">If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified.  (optional, default to &quot;&quot;)</param>
    virtual void add_reaction(const int32_t &messageId, const Pistache::Optional<std::string> &emojiName, const Pistache::Optional<std::string> &emojiCode, const Pistache::Optional<std::string> &reactionType, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Check if messages match a narrow
    /// </summary>
    /// <remarks>
    /// Check whether a set of messages match a [narrow](/api/construct-narrow).  &#x60;GET {{ api_url }}/v1/messages/matches_narrow&#x60;  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the &#x60;match_subject&#x60; and &#x60;match_content&#x60; objects is designed to match those of &#x60;GET /messages&#x60;, so that a client can splice these fields into a &#x60;message&#x60; object received from &#x60;GET /events&#x60; and end up with an extended message object identical to how a &#x60;GET /messages&#x60; for the current narrow would have returned the message. 
    /// </remarks>
    /// <param name="msgIds">List of IDs for the messages to check.</param>
    /// <param name="narrow">A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).</param>
    virtual void check_messages_match_narrow(const Pistache::Optional<std::vector<int32_t>> &msgIds, const Pistache::Optional<std::vector<Object>> &narrow, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Delete a message
    /// </summary>
    /// <remarks>
    /// Permanently delete a message.  &#x60;DELETE {{ api_url }}/v1/messages/{msg_id}&#x60;  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
    /// </remarks>
    /// <param name="messageId">The target message&#39;s ID. </param>
    virtual void delete_message(const int32_t &messageId, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Get public temporary URL
    /// </summary>
    /// <remarks>
    /// Get a temporary URL for access to the file that doesn&#39;t require authentication. 
    /// </remarks>
    /// <param name="realmIdStr">The realm id. </param>
    /// <param name="filename">Path to the URL. </param>
    virtual void get_file_temporary_url(const int32_t &realmIdStr, const std::string &filename, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Get a message&#39;s edit history
    /// </summary>
    /// <remarks>
    /// Fetch the message edit history of a previously edited message.  &#x60;GET {{ api_url }}/v1/messages/{message_id}/history&#x60;  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
    /// </remarks>
    /// <param name="messageId">The target message&#39;s ID. </param>
    virtual void get_message_history(const int32_t &messageId, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Get messages
    /// </summary>
    /// <remarks>
    /// Fetch message history from a Zulip server.  &#x60;GET {{ api_url }}/v1/messages&#x60;  This &#x60;GET /api/v1/messages&#x60; endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip&#39;s powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user&#39;s message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an &#x60;anchor&#x60; message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the &#x60;num_before&#x60; and &#x60;num_after&#x60; limits.  We recommend using &#x60;num_before &lt;&#x3D; 1000&#x60; and &#x60;num_after &lt;&#x3D; 1000&#x60; to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
    /// </remarks>
    /// <param name="numBefore">The number of messages with IDs less than the anchor to retrieve. </param>
    /// <param name="numAfter">The number of messages with IDs greater than the anchor to retrieve. </param>
    /// <param name="anchor">Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * &#x60;newest&#x60;: The most recent message. * &#x60;oldest&#x60;: The oldest message. * &#x60;first_unread&#x60;: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of &#x60;&#39;newest&#39;&#x60; and &#x60;&#39;oldest&#39;&#x60; are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   &#x60;first_unread&#x60; functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, &#x60;oldest&#x60; can be emulated with   &#x60;anchor&#x3D;0&#x60;, and &#x60;newest&#x60; with &#x60;anchor&#x3D;10000000000000000&#x60;   (that specific large value works around a bug in Zulip   2.1.x and older in the &#x60;found_newest&#x60; return value).  (optional, default to )</param>
    /// <param name="narrow">The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow).  (optional, default to std::vector&lt;Object&gt;())</param>
    /// <param name="clientGravatar">Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  (optional, default to false)</param>
    /// <param name="applyMarkdown">If &#x60;true&#x60;, message content is returned in the rendered HTML format. If &#x60;false&#x60;, message content is returned in the raw Markdown-format text that user entered.  (optional, default to false)</param>
    /// <param name="useFirstUnreadAnchor">Legacy way to specify &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the &#x60;anchor&#x60;.  Mutually exclusive with &#x60;anchor&#x60;.  **Changes**: Deprecated in Zulip 3.0, replaced by &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; instead.  (optional, default to false)</param>
    virtual void get_messages(const Pistache::Optional<int32_t> &numBefore, const Pistache::Optional<int32_t> &numAfter, const org::openapitools::server::model::Pistache::Optional<OneOfstringinteger> &anchor, const Pistache::Optional<std::vector<Object>> &narrow, const Pistache::Optional<bool> &clientGravatar, const Pistache::Optional<bool> &applyMarkdown, const Pistache::Optional<bool> &useFirstUnreadAnchor, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Get a message&#39;s raw Markdown
    /// </summary>
    /// <remarks>
    /// Get the raw content of a message.  &#x60;GET {{ api_url }}/v1/messages/{msg_id}&#x60;  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message&#39;s raw Markdown (e.g. for pre-filling a message-editing UI). 
    /// </remarks>
    /// <param name="messageId">The target message&#39;s ID. </param>
    virtual void get_raw_message(const int32_t &messageId, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Mark all messages as read
    /// </summary>
    /// <remarks>
    /// Marks all of the current user&#39;s unread messages as read.  &#x60;POST {{ api_url }}/v1/mark_all_as_read&#x60; 
    /// </remarks>
    virtual void mark_all_as_read(Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Mark messages in a stream as read
    /// </summary>
    /// <remarks>
    /// Mark all the unread messages in a stream as read. 
    /// </remarks>
    /// <param name="streamId">The ID of the stream to access. </param>
    virtual void mark_stream_as_read(const Pistache::Optional<int32_t> &streamId, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Mark messages in a topic as read
    /// </summary>
    /// <remarks>
    /// Mark all the unread messages in a topic as read. 
    /// </remarks>
    /// <param name="streamId">The ID of the stream to access. </param>
    /// <param name="topicName">The name of the topic whose messages should be marked as read. </param>
    virtual void mark_topic_as_read(const Pistache::Optional<int32_t> &streamId, const Pistache::Optional<std::string> &topicName, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Remove an emoji reaction
    /// </summary>
    /// <remarks>
    /// Remove an [emoji reaction](/help/emoji-reactions) from a message.  &#x60;DELETE {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 
    /// </remarks>
    /// <param name="messageId">The target message&#39;s ID. </param>
    /// <param name="emojiName">The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name.  (optional, default to &quot;&quot;)</param>
    /// <param name="emojiCode">A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji.  (optional, default to &quot;&quot;)</param>
    /// <param name="reactionType">If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified.  (optional, default to &quot;&quot;)</param>
    virtual void remove_reaction(const int32_t &messageId, const Pistache::Optional<std::string> &emojiName, const Pistache::Optional<std::string> &emojiCode, const Pistache::Optional<std::string> &reactionType, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Render message
    /// </summary>
    /// <remarks>
    /// Render a message to HTML.  &#x60;POST {{ api_url }}/v1/messages/render&#x60; 
    /// </remarks>
    /// <param name="content">The content of the message. Maximum message size of 10000 bytes. </param>
    virtual void render_message(const Pistache::Optional<std::string> &content, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Send a message
    /// </summary>
    /// <remarks>
    /// Send a stream or a private message.  &#x60;POST {{ api_url }}/v1/messages&#x60; 
    /// </remarks>
    /// <param name="type">The type of message to be sent. &#x60;private&#x60; for a private message and &#x60;stream&#x60; for a stream message. </param>
    /// <param name="to">For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. </param>
    /// <param name="content">The content of the message. Maximum message size of 10000 bytes. </param>
    /// <param name="topic">The topic of the message. Only required for stream messages (&#x60;type&#x3D;\&quot;stream\&quot;&#x60;), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias.  (optional, default to &quot;&quot;)</param>
    /// <param name="queueId">For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, &#x60;local_id&#x60; is required.  If the message is successfully sent, the server will include &#x60;local_id&#x60; in the &#x60;message&#x60; event that the client with this &#x60;queue_id&#x60; will receive notifying it of the new message via [&#x60;GET /events&#x60;](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device).  (optional, default to &quot;&quot;)</param>
    /// <param name="localId">For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the &#x60;queue_id&#x60; description.  (optional, default to &quot;&quot;)</param>
    virtual void send_message(const Pistache::Optional<std::string> &type, const Pistache::Optional<std::vector<int32_t>> &to, const Pistache::Optional<std::string> &content, const Pistache::Optional<std::string> &topic, const Pistache::Optional<std::string> &queueId, const Pistache::Optional<std::string> &localId, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Edit a message
    /// </summary>
    /// <remarks>
    /// Edit/update the content or topic of a message.  &#x60;PATCH {{ api_url }}/v1/messages/{msg_id}&#x60;  &#x60;{msg_id}&#x60; in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to &#x60;??? {original_topic}&#x60;.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
    /// </remarks>
    /// <param name="messageId">The target message&#39;s ID. </param>
    /// <param name="topic">The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias.  (optional, default to &quot;&quot;)</param>
    /// <param name="propagateMode">Which message(s) should be edited: just the one indicated in &#x60;message_id&#x60;, messages in the same topic that had been sent after this one, or all of them.  Only the default value of &#x60;change_one&#x60; is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic.  (optional, default to &quot;change_one&quot;)</param>
    /// <param name="sendNotificationToOldThread">Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9).  (optional, default to false)</param>
    /// <param name="sendNotificationToNewThread">Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9).  (optional, default to false)</param>
    /// <param name="content">The content of the message. Maximum message size of 10000 bytes.  (optional, default to &quot;&quot;)</param>
    /// <param name="streamId">The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message.  (optional, default to 0)</param>
    virtual void update_message(const int32_t &messageId, const Pistache::Optional<std::string> &topic, const Pistache::Optional<std::string> &propagateMode, const Pistache::Optional<bool> &sendNotificationToOldThread, const Pistache::Optional<bool> &sendNotificationToNewThread, const Pistache::Optional<std::string> &content, const Pistache::Optional<int32_t> &streamId, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Update personal message flags
    /// </summary>
    /// <remarks>
    /// Add or remove personal message flags like &#x60;read&#x60; and &#x60;starred&#x60; on a collection of message IDs.  &#x60;POST {{ api_url }}/v1/messages/flags&#x60;  For updating the &#x60;read&#x60; flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
    /// </remarks>
    /// <param name="messages">An array containing the IDs of the target messages. </param>
    /// <param name="op">Whether to &#x60;add&#x60; the flag or &#x60;remove&#x60; it. </param>
    /// <param name="flag">The flag that should be added/removed. </param>
    virtual void update_message_flags(const Pistache::Optional<std::vector<int32_t>> &messages, const Pistache::Optional<std::string> &op, const Pistache::Optional<std::string> &flag, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Upload a file
    /// </summary>
    /// <remarks>
    /// Upload a single file and get the corresponding URI.  &#x60;POST {{ api_url }}/v1/user_uploads&#x60;  Initially, only you will be able to access the link.  To share the uploaded file, you&#39;ll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
    /// </remarks>
    virtual void upload_file(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter &response) = 0;

};

} // namespace org::openapitools::server::api

#endif /* MessagesApi_H_ */

