require 'json'


MyApp.add_route('POST', '/api/v1/messages/{message_id}/reactions', {
  "resourcePath" => "/Messages",
  "summary" => "Add an emoji reaction",
  "nickname" => "add_reaction", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/messages/{message_id}/reactions", 
  "notes" => "Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` ",
  "parameters" => [
    {
      "name" => "emoji_name",
      "description" => "The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "emoji_code",
      "description" => "A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "reaction_type",
      "description" => "If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "message_id",
      "description" => "The target message&#39;s ID. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/messages/matches_narrow', {
  "resourcePath" => "/Messages",
  "summary" => "Check if messages match a narrow",
  "nickname" => "check_messages_match_narrow", 
  "responseClass" => "AnyType",
  "endpoint" => "/messages/matches_narrow", 
  "notes" => "Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. ",
  "parameters" => [
    {
      "name" => "msg_ids",
      "description" => "List of IDs for the messages to check.",
      "dataType" => "Array<Integer>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "narrow",
      "description" => "A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).",
      "dataType" => "Array<Object>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/api/v1/messages/{message_id}', {
  "resourcePath" => "/Messages",
  "summary" => "Delete a message",
  "nickname" => "delete_message", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/messages/{message_id}", 
  "notes" => "Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely ",
  "parameters" => [
    {
      "name" => "message_id",
      "description" => "The target message&#39;s ID. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/user_uploads/{realm_id_str}/{filename}', {
  "resourcePath" => "/Messages",
  "summary" => "Get public temporary URL",
  "nickname" => "get_file_temporary_url", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/user_uploads/{realm_id_str}/{filename}", 
  "notes" => "Get a temporary URL for access to the file that doesn't require authentication. ",
  "parameters" => [
    {
      "name" => "realm_id_str",
      "description" => "The realm id. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    {
      "name" => "filename",
      "description" => "Path to the URL. ",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/messages/{message_id}/history', {
  "resourcePath" => "/Messages",
  "summary" => "Get a message's edit history",
  "nickname" => "get_message_history", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/messages/{message_id}/history", 
  "notes" => "Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history ",
  "parameters" => [
    {
      "name" => "message_id",
      "description" => "The target message&#39;s ID. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/messages', {
  "resourcePath" => "/Messages",
  "summary" => "Get messages",
  "nickname" => "get_messages", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/messages", 
  "notes" => "Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. ",
  "parameters" => [
    {
      "name" => "anchor",
      "description" => "Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * &#x60;newest&#x60;: The most recent message. * &#x60;oldest&#x60;: The oldest message. * &#x60;first_unread&#x60;: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of &#x60;&#39;newest&#39;&#x60; and &#x60;&#39;oldest&#39;&#x60; are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   &#x60;first_unread&#x60; functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, &#x60;oldest&#x60; can be emulated with   &#x60;anchor&#x3D;0&#x60;, and &#x60;newest&#x60; with &#x60;anchor&#x3D;10000000000000000&#x60;   (that specific large value works around a bug in Zulip   2.1.x and older in the &#x60;found_newest&#x60; return value). ",
      "dataType" => "oneOf<string,integer>",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "num_before",
      "description" => "The number of messages with IDs less than the anchor to retrieve. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "num_after",
      "description" => "The number of messages with IDs greater than the anchor to retrieve. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "narrow",
      "description" => "The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow). ",
      "dataType" => "Array<Object>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "client_gravatar",
      "description" => "Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    {
      "name" => "apply_markdown",
      "description" => "If &#x60;true&#x60;, message content is returned in the rendered HTML format. If &#x60;false&#x60;, message content is returned in the raw Markdown-format text that user entered. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "use_first_unread_anchor",
      "description" => "Legacy way to specify &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the &#x60;anchor&#x60;.  Mutually exclusive with &#x60;anchor&#x60;.  **Changes**: Deprecated in Zulip 3.0, replaced by &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; instead. ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "false",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/messages/{message_id}', {
  "resourcePath" => "/Messages",
  "summary" => "Get a message's raw Markdown",
  "nickname" => "get_raw_message", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/messages/{message_id}", 
  "notes" => "Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). ",
  "parameters" => [
    {
      "name" => "message_id",
      "description" => "The target message&#39;s ID. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/v1/mark_all_as_read', {
  "resourcePath" => "/Messages",
  "summary" => "Mark all messages as read",
  "nickname" => "mark_all_as_read", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/mark_all_as_read", 
  "notes" => "Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` ",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/v1/mark_stream_as_read', {
  "resourcePath" => "/Messages",
  "summary" => "Mark messages in a stream as read",
  "nickname" => "mark_stream_as_read", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/mark_stream_as_read", 
  "notes" => "Mark all the unread messages in a stream as read. ",
  "parameters" => [
    {
      "name" => "stream_id",
      "description" => "The ID of the stream to access. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/v1/mark_topic_as_read', {
  "resourcePath" => "/Messages",
  "summary" => "Mark messages in a topic as read",
  "nickname" => "mark_topic_as_read", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/mark_topic_as_read", 
  "notes" => "Mark all the unread messages in a topic as read. ",
  "parameters" => [
    {
      "name" => "stream_id",
      "description" => "The ID of the stream to access. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "topic_name",
      "description" => "The name of the topic whose messages should be marked as read. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/api/v1/messages/{message_id}/reactions', {
  "resourcePath" => "/Messages",
  "summary" => "Remove an emoji reaction",
  "nickname" => "remove_reaction", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/messages/{message_id}/reactions", 
  "notes" => "Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` ",
  "parameters" => [
    {
      "name" => "emoji_name",
      "description" => "The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "emoji_code",
      "description" => "A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "reaction_type",
      "description" => "If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "message_id",
      "description" => "The target message&#39;s ID. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/v1/messages/render', {
  "resourcePath" => "/Messages",
  "summary" => "Render message",
  "nickname" => "render_message", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/messages/render", 
  "notes" => "Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` ",
  "parameters" => [
    {
      "name" => "content",
      "description" => "The content of the message. Maximum message size of 10000 bytes. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/v1/messages', {
  "resourcePath" => "/Messages",
  "summary" => "Send a message",
  "nickname" => "send_message", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/messages", 
  "notes" => "Send a stream or a private message.  `POST {{ api_url }}/v1/messages` ",
  "parameters" => [
    {
      "name" => "type",
      "description" => "The type of message to be sent. &#x60;private&#x60; for a private message and &#x60;stream&#x60; for a stream message. ",
      "dataType" => "String",
      "allowableValues" => "[private, stream]",
      "paramType" => "query",
    },
    {
      "name" => "to",
      "description" => "For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. ",
      "dataType" => "Array<Integer>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "content",
      "description" => "The content of the message. Maximum message size of 10000 bytes. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "topic",
      "description" => "The topic of the message. Only required for stream messages (&#x60;type&#x3D;\&quot;stream\&quot;&#x60;), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "queue_id",
      "description" => "For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, &#x60;local_id&#x60; is required.  If the message is successfully sent, the server will include &#x60;local_id&#x60; in the &#x60;message&#x60; event that the client with this &#x60;queue_id&#x60; will receive notifying it of the new message via [&#x60;GET /events&#x60;](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device). ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "local_id",
      "description" => "For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the &#x60;queue_id&#x60; description. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PATCH', '/api/v1/messages/{message_id}', {
  "resourcePath" => "/Messages",
  "summary" => "Edit a message",
  "nickname" => "update_message", 
  "responseClass" => "JsonSuccess",
  "endpoint" => "/messages/{message_id}", 
  "notes" => "Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion ",
  "parameters" => [
    {
      "name" => "topic",
      "description" => "The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "propagate_mode",
      "description" => "Which message(s) should be edited: just the one indicated in &#x60;message_id&#x60;, messages in the same topic that had been sent after this one, or all of them.  Only the default value of &#x60;change_one&#x60; is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic. ",
      "dataType" => "String",
      "allowableValues" => "[change_one, change_later, change_all]",
      "defaultValue" => "'change_one'",
      "paramType" => "query",
    },
    {
      "name" => "send_notification_to_old_thread",
      "description" => "Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9). ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "send_notification_to_new_thread",
      "description" => "Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9). ",
      "dataType" => "Boolean",
      "allowableValues" => "",
      "defaultValue" => "true",
      "paramType" => "query",
    },
    {
      "name" => "content",
      "description" => "The content of the message. Maximum message size of 10000 bytes. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "stream_id",
      "description" => "The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "message_id",
      "description" => "The target message&#39;s ID. ",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/v1/messages/flags', {
  "resourcePath" => "/Messages",
  "summary" => "Update personal message flags",
  "nickname" => "update_message_flags", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/messages/flags", 
  "notes" => "Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). ",
  "parameters" => [
    {
      "name" => "messages",
      "description" => "An array containing the IDs of the target messages. ",
      "dataType" => "Array<Integer>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "op",
      "description" => "Whether to &#x60;add&#x60; the flag or &#x60;remove&#x60; it. ",
      "dataType" => "String",
      "allowableValues" => "[add, remove]",
      "paramType" => "query",
    },
    {
      "name" => "flag",
      "description" => "The flag that should be added/removed. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/v1/user_uploads', {
  "resourcePath" => "/Messages",
  "summary" => "Upload a file",
  "nickname" => "upload_file", 
  "responseClass" => "JsonSuccessBase",
  "endpoint" => "/user_uploads", 
  "notes" => "Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message ",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

