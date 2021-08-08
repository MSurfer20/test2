from typing import List, Dict
from aiohttp import web

from openapi_server.models.coded_error import CodedError
from openapi_server.models.invalid_message_error import InvalidMessageError
from openapi_server.models.json_success import JsonSuccess
from openapi_server.models.json_success_base import JsonSuccessBase
from openapi_server.models.one_ofobjectobject import OneOfobjectobject
from openapi_server.models.one_ofstringinteger import OneOfstringinteger
from openapi_server import util


async def add_reaction(request: web.Request, message_id, emoji_name, emoji_code=None, reaction_type=None) -> web.Response:
    """Add an emoji reaction

    Add an [emoji reaction](/help/emoji-reactions) to a message.  &#x60;POST {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 

    :param message_id: The target message&#39;s ID. 
    :type message_id: int
    :param emoji_name: The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name. 
    :type emoji_name: str
    :param emoji_code: A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji. 
    :type emoji_code: str
    :param reaction_type: If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified. 
    :type reaction_type: str

    """
    return web.Response(status=200)


async def check_messages_match_narrow(request: web.Request, msg_ids, narrow) -> web.Response:
    """Check if messages match a narrow

    Check whether a set of messages match a [narrow](/api/construct-narrow).  &#x60;GET {{ api_url }}/v1/messages/matches_narrow&#x60;  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the &#x60;match_subject&#x60; and &#x60;match_content&#x60; objects is designed to match those of &#x60;GET /messages&#x60;, so that a client can splice these fields into a &#x60;message&#x60; object received from &#x60;GET /events&#x60; and end up with an extended message object identical to how a &#x60;GET /messages&#x60; for the current narrow would have returned the message. 

    :param msg_ids: List of IDs for the messages to check.
    :type msg_ids: List[int]
    :param narrow: A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).
    :type narrow: List[]

    """
    return web.Response(status=200)


async def delete_message(request: web.Request, message_id) -> web.Response:
    """Delete a message

    Permanently delete a message.  &#x60;DELETE {{ api_url }}/v1/messages/{msg_id}&#x60;  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 

    :param message_id: The target message&#39;s ID. 
    :type message_id: int

    """
    return web.Response(status=200)


async def get_file_temporary_url(request: web.Request, realm_id_str, filename) -> web.Response:
    """Get public temporary URL

    Get a temporary URL for access to the file that doesn&#39;t require authentication. 

    :param realm_id_str: The realm id. 
    :type realm_id_str: int
    :param filename: Path to the URL. 
    :type filename: str

    """
    return web.Response(status=200)


async def get_message_history(request: web.Request, message_id) -> web.Response:
    """Get a message&#39;s edit history

    Fetch the message edit history of a previously edited message.  &#x60;GET {{ api_url }}/v1/messages/{message_id}/history&#x60;  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 

    :param message_id: The target message&#39;s ID. 
    :type message_id: int

    """
    return web.Response(status=200)


async def get_messages(request: web.Request, num_before, num_after, anchor=None, narrow=None, client_gravatar=None, apply_markdown=None, use_first_unread_anchor=None) -> web.Response:
    """Get messages

    Fetch message history from a Zulip server.  &#x60;GET {{ api_url }}/v1/messages&#x60;  This &#x60;GET /api/v1/messages&#x60; endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip&#39;s powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user&#39;s message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an &#x60;anchor&#x60; message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the &#x60;num_before&#x60; and &#x60;num_after&#x60; limits.  We recommend using &#x60;num_before &lt;&#x3D; 1000&#x60; and &#x60;num_after &lt;&#x3D; 1000&#x60; to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 

    :param num_before: The number of messages with IDs less than the anchor to retrieve. 
    :type num_before: int
    :param num_after: The number of messages with IDs greater than the anchor to retrieve. 
    :type num_after: int
    :param anchor: Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * &#x60;newest&#x60;: The most recent message. * &#x60;oldest&#x60;: The oldest message. * &#x60;first_unread&#x60;: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of &#x60;&#39;newest&#39;&#x60; and &#x60;&#39;oldest&#39;&#x60; are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   &#x60;first_unread&#x60; functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, &#x60;oldest&#x60; can be emulated with   &#x60;anchor&#x3D;0&#x60;, and &#x60;newest&#x60; with &#x60;anchor&#x3D;10000000000000000&#x60;   (that specific large value works around a bug in Zulip   2.1.x and older in the &#x60;found_newest&#x60; return value). 
    :type anchor: dict | bytes
    :param narrow: The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow). 
    :type narrow: List[]
    :param client_gravatar: Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. 
    :type client_gravatar: bool
    :param apply_markdown: If &#x60;true&#x60;, message content is returned in the rendered HTML format. If &#x60;false&#x60;, message content is returned in the raw Markdown-format text that user entered. 
    :type apply_markdown: bool
    :param use_first_unread_anchor: Legacy way to specify &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the &#x60;anchor&#x60;.  Mutually exclusive with &#x60;anchor&#x60;.  **Changes**: Deprecated in Zulip 3.0, replaced by &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; instead. 
    :type use_first_unread_anchor: bool

    """
    anchor = .from_dict(anchor)
    return web.Response(status=200)


async def get_raw_message(request: web.Request, message_id) -> web.Response:
    """Get a message&#39;s raw Markdown

    Get the raw content of a message.  &#x60;GET {{ api_url }}/v1/messages/{msg_id}&#x60;  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message&#39;s raw Markdown (e.g. for pre-filling a message-editing UI). 

    :param message_id: The target message&#39;s ID. 
    :type message_id: int

    """
    return web.Response(status=200)


async def mark_all_as_read(request: web.Request, ) -> web.Response:
    """Mark all messages as read

    Marks all of the current user&#39;s unread messages as read.  &#x60;POST {{ api_url }}/v1/mark_all_as_read&#x60; 


    """
    return web.Response(status=200)


async def mark_stream_as_read(request: web.Request, stream_id) -> web.Response:
    """Mark messages in a stream as read

    Mark all the unread messages in a stream as read. 

    :param stream_id: The ID of the stream to access. 
    :type stream_id: int

    """
    return web.Response(status=200)


async def mark_topic_as_read(request: web.Request, stream_id, topic_name) -> web.Response:
    """Mark messages in a topic as read

    Mark all the unread messages in a topic as read. 

    :param stream_id: The ID of the stream to access. 
    :type stream_id: int
    :param topic_name: The name of the topic whose messages should be marked as read. 
    :type topic_name: str

    """
    return web.Response(status=200)


async def remove_reaction(request: web.Request, message_id, emoji_name=None, emoji_code=None, reaction_type=None) -> web.Response:
    """Remove an emoji reaction

    Remove an [emoji reaction](/help/emoji-reactions) from a message.  &#x60;DELETE {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 

    :param message_id: The target message&#39;s ID. 
    :type message_id: int
    :param emoji_name: The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name. 
    :type emoji_name: str
    :param emoji_code: A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji. 
    :type emoji_code: str
    :param reaction_type: If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified. 
    :type reaction_type: str

    """
    return web.Response(status=200)


async def render_message(request: web.Request, content) -> web.Response:
    """Render message

    Render a message to HTML.  &#x60;POST {{ api_url }}/v1/messages/render&#x60; 

    :param content: The content of the message. Maximum message size of 10000 bytes. 
    :type content: str

    """
    return web.Response(status=200)


async def send_message(request: web.Request, type, to, content, topic=None, queue_id=None, local_id=None) -> web.Response:
    """Send a message

    Send a stream or a private message.  &#x60;POST {{ api_url }}/v1/messages&#x60; 

    :param type: The type of message to be sent. &#x60;private&#x60; for a private message and &#x60;stream&#x60; for a stream message. 
    :type type: str
    :param to: For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. 
    :type to: List[int]
    :param content: The content of the message. Maximum message size of 10000 bytes. 
    :type content: str
    :param topic: The topic of the message. Only required for stream messages (&#x60;type&#x3D;\&quot;stream\&quot;&#x60;), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias. 
    :type topic: str
    :param queue_id: For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, &#x60;local_id&#x60; is required.  If the message is successfully sent, the server will include &#x60;local_id&#x60; in the &#x60;message&#x60; event that the client with this &#x60;queue_id&#x60; will receive notifying it of the new message via [&#x60;GET /events&#x60;](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device). 
    :type queue_id: str
    :param local_id: For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the &#x60;queue_id&#x60; description. 
    :type local_id: str

    """
    return web.Response(status=200)


async def update_message(request: web.Request, message_id, topic=None, propagate_mode=None, send_notification_to_old_thread=None, send_notification_to_new_thread=None, content=None, stream_id=None) -> web.Response:
    """Edit a message

    Edit/update the content or topic of a message.  &#x60;PATCH {{ api_url }}/v1/messages/{msg_id}&#x60;  &#x60;{msg_id}&#x60; in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to &#x60;✔ {original_topic}&#x60;.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 

    :param message_id: The target message&#39;s ID. 
    :type message_id: int
    :param topic: The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias. 
    :type topic: str
    :param propagate_mode: Which message(s) should be edited: just the one indicated in &#x60;message_id&#x60;, messages in the same topic that had been sent after this one, or all of them.  Only the default value of &#x60;change_one&#x60; is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic. 
    :type propagate_mode: str
    :param send_notification_to_old_thread: Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9). 
    :type send_notification_to_old_thread: bool
    :param send_notification_to_new_thread: Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9). 
    :type send_notification_to_new_thread: bool
    :param content: The content of the message. Maximum message size of 10000 bytes. 
    :type content: str
    :param stream_id: The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message. 
    :type stream_id: int

    """
    return web.Response(status=200)


async def update_message_flags(request: web.Request, messages, op, flag) -> web.Response:
    """Update personal message flags

    Add or remove personal message flags like &#x60;read&#x60; and &#x60;starred&#x60; on a collection of message IDs.  &#x60;POST {{ api_url }}/v1/messages/flags&#x60;  For updating the &#x60;read&#x60; flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 

    :param messages: An array containing the IDs of the target messages. 
    :type messages: List[int]
    :param op: Whether to &#x60;add&#x60; the flag or &#x60;remove&#x60; it. 
    :type op: str
    :param flag: The flag that should be added/removed. 
    :type flag: str

    """
    return web.Response(status=200)


async def upload_file(request: web.Request, filename=None) -> web.Response:
    """Upload a file

    Upload a single file and get the corresponding URI.  &#x60;POST {{ api_url }}/v1/user_uploads&#x60;  Initially, only you will be able to access the link.  To share the uploaded file, you&#39;ll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 

    :param filename: 
    :type filename: str

    """
    return web.Response(status=200)
