/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"
#include "OpenAPIMessagesApi.h"

#include "OpenAPIHelpers.h"
#include "OpenAPIAnyType.h"
#include "OpenAPICodedError.h"
#include "OpenAPIInvalidMessageError.h"
#include "OpenAPIJsonSuccess.h"
#include "OpenAPIJsonSuccessBase.h"
#include "OpenAPIOneOfobjectobject.h"
#include "OpenAPIOneOfstringinteger.h"

namespace OpenAPI 
{

/* Add an emoji reaction
 *
 * Add an [emoji reaction](/help/emoji-reactions) to a message.  &#x60;POST {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 
*/
class OPENAPI_API OpenAPIMessagesApi::AddReactionRequest : public Request
{
public:
    virtual ~AddReactionRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* The target message's ID.  */
	int32 MessageId = 0;
	/* The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name.  */
	FString EmojiName;
	/* A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji.  */
	TOptional<FString> EmojiCode;
	/* If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified.  */
	TOptional<FString> ReactionType;
};

class OPENAPI_API OpenAPIMessagesApi::AddReactionResponse : public Response
{
public:
    virtual ~AddReactionResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccess Content;
};

/* Check if messages match a narrow
 *
 * Check whether a set of messages match a [narrow](/api/construct-narrow).  &#x60;GET {{ api_url }}/v1/messages/matches_narrow&#x60;  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the &#x60;match_subject&#x60; and &#x60;match_content&#x60; objects is designed to match those of &#x60;GET /messages&#x60;, so that a client can splice these fields into a &#x60;message&#x60; object received from &#x60;GET /events&#x60; and end up with an extended message object identical to how a &#x60;GET /messages&#x60; for the current narrow would have returned the message. 
*/
class OPENAPI_API OpenAPIMessagesApi::CheckMessagesMatchNarrowRequest : public Request
{
public:
    virtual ~CheckMessagesMatchNarrowRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* List of IDs for the messages to check. */
	TArray<int32> MsgIds;
	/* A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow). */
	TArray<TSharedPtr<FJsonObject>> Narrow;
};

class OPENAPI_API OpenAPIMessagesApi::CheckMessagesMatchNarrowResponse : public Response
{
public:
    virtual ~CheckMessagesMatchNarrowResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIAnyType Content;
};

/* Delete a message
 *
 * Permanently delete a message.  &#x60;DELETE {{ api_url }}/v1/messages/{msg_id}&#x60;  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
*/
class OPENAPI_API OpenAPIMessagesApi::DeleteMessageRequest : public Request
{
public:
    virtual ~DeleteMessageRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* The target message's ID.  */
	int32 MessageId = 0;
};

class OPENAPI_API OpenAPIMessagesApi::DeleteMessageResponse : public Response
{
public:
    virtual ~DeleteMessageResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccess Content;
};

/* Get public temporary URL
 *
 * Get a temporary URL for access to the file that doesn&#39;t require authentication. 
*/
class OPENAPI_API OpenAPIMessagesApi::GetFileTemporaryUrlRequest : public Request
{
public:
    virtual ~GetFileTemporaryUrlRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* The realm id.  */
	int32 RealmIdStr = 0;
	/* Path to the URL.  */
	FString Filename;
};

class OPENAPI_API OpenAPIMessagesApi::GetFileTemporaryUrlResponse : public Response
{
public:
    virtual ~GetFileTemporaryUrlResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccessBase Content;
};

/* Get a message&#39;s edit history
 *
 * Fetch the message edit history of a previously edited message.  &#x60;GET {{ api_url }}/v1/messages/{message_id}/history&#x60;  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
*/
class OPENAPI_API OpenAPIMessagesApi::GetMessageHistoryRequest : public Request
{
public:
    virtual ~GetMessageHistoryRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* The target message's ID.  */
	int32 MessageId = 0;
};

class OPENAPI_API OpenAPIMessagesApi::GetMessageHistoryResponse : public Response
{
public:
    virtual ~GetMessageHistoryResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccessBase Content;
};

/* Get messages
 *
 * Fetch message history from a Zulip server.  &#x60;GET {{ api_url }}/v1/messages&#x60;  This &#x60;GET /api/v1/messages&#x60; endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip&#39;s powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user&#39;s message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an &#x60;anchor&#x60; message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the &#x60;num_before&#x60; and &#x60;num_after&#x60; limits.  We recommend using &#x60;num_before &lt;&#x3D; 1000&#x60; and &#x60;num_after &lt;&#x3D; 1000&#x60; to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
*/
class OPENAPI_API OpenAPIMessagesApi::GetMessagesRequest : public Request
{
public:
    virtual ~GetMessagesRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* The number of messages with IDs less than the anchor to retrieve.  */
	int32 NumBefore = 0;
	/* The number of messages with IDs greater than the anchor to retrieve.  */
	int32 NumAfter = 0;
	/* Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * `newest`: The most recent message. * `oldest`: The oldest message. * `first_unread`: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of `'newest'` and `'oldest'` are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   `first_unread` functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, `oldest` can be emulated with   `anchor=0`, and `newest` with `anchor=10000000000000000`   (that specific large value works around a bug in Zulip   2.1.x and older in the `found_newest` return value).  */
	TOptional<OpenAPIOneOfstringinteger> Anchor;
	/* The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow).  */
	TOptional<TArray<TSharedPtr<FJsonObject>>> Narrow;
	/* Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  */
	TOptional<bool> ClientGravatar;
	/* If `true`, message content is returned in the rendered HTML format. If `false`, message content is returned in the raw Markdown-format text that user entered.  */
	TOptional<bool> ApplyMarkdown;
	/* Legacy way to specify `anchor=\"first_unread\"` in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the `anchor`.  Mutually exclusive with `anchor`.  **Changes**: Deprecated in Zulip 3.0, replaced by `anchor=\"first_unread\"` instead.  */
	TOptional<bool> UseFirstUnreadAnchor;
};

class OPENAPI_API OpenAPIMessagesApi::GetMessagesResponse : public Response
{
public:
    virtual ~GetMessagesResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccessBase Content;
};

/* Get a message&#39;s raw Markdown
 *
 * Get the raw content of a message.  &#x60;GET {{ api_url }}/v1/messages/{msg_id}&#x60;  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message&#39;s raw Markdown (e.g. for pre-filling a message-editing UI). 
*/
class OPENAPI_API OpenAPIMessagesApi::GetRawMessageRequest : public Request
{
public:
    virtual ~GetRawMessageRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* The target message's ID.  */
	int32 MessageId = 0;
};

class OPENAPI_API OpenAPIMessagesApi::GetRawMessageResponse : public Response
{
public:
    virtual ~GetRawMessageResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccessBase Content;
};

/* Mark all messages as read
 *
 * Marks all of the current user&#39;s unread messages as read.  &#x60;POST {{ api_url }}/v1/mark_all_as_read&#x60; 
*/
class OPENAPI_API OpenAPIMessagesApi::MarkAllAsReadRequest : public Request
{
public:
    virtual ~MarkAllAsReadRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
};

class OPENAPI_API OpenAPIMessagesApi::MarkAllAsReadResponse : public Response
{
public:
    virtual ~MarkAllAsReadResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccess Content;
};

/* Mark messages in a stream as read
 *
 * Mark all the unread messages in a stream as read. 
*/
class OPENAPI_API OpenAPIMessagesApi::MarkStreamAsReadRequest : public Request
{
public:
    virtual ~MarkStreamAsReadRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* The ID of the stream to access.  */
	int32 StreamId = 0;
};

class OPENAPI_API OpenAPIMessagesApi::MarkStreamAsReadResponse : public Response
{
public:
    virtual ~MarkStreamAsReadResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccess Content;
};

/* Mark messages in a topic as read
 *
 * Mark all the unread messages in a topic as read. 
*/
class OPENAPI_API OpenAPIMessagesApi::MarkTopicAsReadRequest : public Request
{
public:
    virtual ~MarkTopicAsReadRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* The ID of the stream to access.  */
	int32 StreamId = 0;
	/* The name of the topic whose messages should be marked as read.  */
	FString TopicName;
};

class OPENAPI_API OpenAPIMessagesApi::MarkTopicAsReadResponse : public Response
{
public:
    virtual ~MarkTopicAsReadResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccess Content;
};

/* Remove an emoji reaction
 *
 * Remove an [emoji reaction](/help/emoji-reactions) from a message.  &#x60;DELETE {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 
*/
class OPENAPI_API OpenAPIMessagesApi::RemoveReactionRequest : public Request
{
public:
    virtual ~RemoveReactionRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* The target message's ID.  */
	int32 MessageId = 0;
	/* The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name.  */
	TOptional<FString> EmojiName;
	/* A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji.  */
	TOptional<FString> EmojiCode;
	/* If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified.  */
	TOptional<FString> ReactionType;
};

class OPENAPI_API OpenAPIMessagesApi::RemoveReactionResponse : public Response
{
public:
    virtual ~RemoveReactionResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccess Content;
};

/* Render message
 *
 * Render a message to HTML.  &#x60;POST {{ api_url }}/v1/messages/render&#x60; 
*/
class OPENAPI_API OpenAPIMessagesApi::RenderMessageRequest : public Request
{
public:
    virtual ~RenderMessageRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* The content of the message. Maximum message size of 10000 bytes.  */
	FString Content;
};

class OPENAPI_API OpenAPIMessagesApi::RenderMessageResponse : public Response
{
public:
    virtual ~RenderMessageResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccessBase Content;
};

/* Send a message
 *
 * Send a stream or a private message.  &#x60;POST {{ api_url }}/v1/messages&#x60; 
*/
class OPENAPI_API OpenAPIMessagesApi::SendMessageRequest : public Request
{
public:
    virtual ~SendMessageRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	enum class TypeEnum
	{
		_Private,
		Stream,
  	};

	static FString EnumToString(const TypeEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, TypeEnum& EnumValue);
	/* The type of message to be sent. `private` for a private message and `stream` for a stream message.  */
	TypeEnum Type;
	/* For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0.  */
	TArray<int32> To;
	/* The content of the message. Maximum message size of 10000 bytes.  */
	FString Content;
	/* The topic of the message. Only required for stream messages (`type=\"stream\"`), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias.  */
	TOptional<FString> Topic;
	/* For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, `local_id` is required.  If the message is successfully sent, the server will include `local_id` in the `message` event that the client with this `queue_id` will receive notifying it of the new message via [`GET /events`](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device).  */
	TOptional<FString> QueueId;
	/* For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the `queue_id` description.  */
	TOptional<FString> LocalId;
};

class OPENAPI_API OpenAPIMessagesApi::SendMessageResponse : public Response
{
public:
    virtual ~SendMessageResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccessBase Content;
};

/* Edit a message
 *
 * Edit/update the content or topic of a message.  &#x60;PATCH {{ api_url }}/v1/messages/{msg_id}&#x60;  &#x60;{msg_id}&#x60; in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to &#x60;✔ {original_topic}&#x60;.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
*/
class OPENAPI_API OpenAPIMessagesApi::UpdateMessageRequest : public Request
{
public:
    virtual ~UpdateMessageRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* The target message's ID.  */
	int32 MessageId = 0;
	/* The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias.  */
	TOptional<FString> Topic;
	enum class PropagateModeEnum
	{
		One,
		Later,
		All,
  	};

	static FString EnumToString(const PropagateModeEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, PropagateModeEnum& EnumValue);
	/* Which message(s) should be edited: just the one indicated in `message_id`, messages in the same topic that had been sent after this one, or all of them.  Only the default value of `change_one` is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic.  */
	TOptional<PropagateModeEnum> PropagateMode;
	/* Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9).  */
	TOptional<bool> SendNotificationToOldThread;
	/* Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9).  */
	TOptional<bool> SendNotificationToNewThread;
	/* The content of the message. Maximum message size of 10000 bytes.  */
	TOptional<FString> Content;
	/* The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message.  */
	TOptional<int32> StreamId;
};

class OPENAPI_API OpenAPIMessagesApi::UpdateMessageResponse : public Response
{
public:
    virtual ~UpdateMessageResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccess Content;
};

/* Update personal message flags
 *
 * Add or remove personal message flags like &#x60;read&#x60; and &#x60;starred&#x60; on a collection of message IDs.  &#x60;POST {{ api_url }}/v1/messages/flags&#x60;  For updating the &#x60;read&#x60; flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
*/
class OPENAPI_API OpenAPIMessagesApi::UpdateMessageFlagsRequest : public Request
{
public:
    virtual ~UpdateMessageFlagsRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	/* An array containing the IDs of the target messages.  */
	TArray<int32> Messages;
	enum class OpEnum
	{
		Add,
		Remove,
  	};

	static FString EnumToString(const OpEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, OpEnum& EnumValue);
	/* Whether to `add` the flag or `remove` it.  */
	OpEnum Op;
	/* The flag that should be added/removed.  */
	FString Flag;
};

class OPENAPI_API OpenAPIMessagesApi::UpdateMessageFlagsResponse : public Response
{
public:
    virtual ~UpdateMessageFlagsResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccessBase Content;
};

/* Upload a file
 *
 * Upload a single file and get the corresponding URI.  &#x60;POST {{ api_url }}/v1/user_uploads&#x60;  Initially, only you will be able to access the link.  To share the uploaded file, you&#39;ll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
*/
class OPENAPI_API OpenAPIMessagesApi::UploadFileRequest : public Request
{
public:
    virtual ~UploadFileRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;
    
	TOptional<HttpFileInput> Filename;
};

class OPENAPI_API OpenAPIMessagesApi::UploadFileResponse : public Response
{
public:
    virtual ~UploadFileResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
    
    OpenAPIJsonSuccessBase Content;
};

}
