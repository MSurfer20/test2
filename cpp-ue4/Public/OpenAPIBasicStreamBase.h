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

namespace OpenAPI 
{

/*
 * OpenAPIBasicStreamBase
 *
 * Object containing basic details about the stream. 
 */
class OPENAPI_API OpenAPIBasicStreamBase : public Model
{
public:
    virtual ~OpenAPIBasicStreamBase() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The unique ID of the stream.  */
	TOptional<int32> StreamId;
	/* The name of the stream.  */
	TOptional<FString> Name;
	/* The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description.  */
	TOptional<FString> Description;
	/* The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30).  */
	TOptional<int32> DateCreated;
	/* Specifies whether the stream is private or not. Only people who have been invited can access a private stream.  */
	TOptional<bool> InviteOnly;
	/* The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message.  */
	TOptional<FString> RenderedDescription;
	/* Whether the stream has been configured to allow unauthenticated access to its message history from the web.  */
	TOptional<bool> IsWebPublic;
	/* Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  */
	TOptional<int32> StreamPostPolicy;
	/* Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17).  */
	TOptional<int32> MessageRetentionDays;
	/* Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future.  */
	TOptional<bool> HistoryPublicToSubscribers;
	/* The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history.  */
	TOptional<int32> FirstMessageId;
	/* Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead.  */
	TOptional<bool> IsAnnouncementOnly;
};

}
