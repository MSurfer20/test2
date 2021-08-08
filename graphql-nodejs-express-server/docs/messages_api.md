# messages_api

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddReaction**](messages_api.md#AddReaction) | **POST** /messages/{message_id}/reactions | Add an emoji reaction
[**CheckMessagesMatchNarrow**](messages_api.md#CheckMessagesMatchNarrow) | **GET** /messages/matches_narrow | Check if messages match a narrow
[**DeleteMessage**](messages_api.md#DeleteMessage) | **DELETE** /messages/{message_id} | Delete a message
[**GetFileTemporaryUrl**](messages_api.md#GetFileTemporaryUrl) | **GET** /user_uploads/{realm_id_str}/{filename} | Get public temporary URL
[**GetMessageHistory**](messages_api.md#GetMessageHistory) | **GET** /messages/{message_id}/history | Get a message&#39;s edit history
[**GetMessages**](messages_api.md#GetMessages) | **GET** /messages | Get messages
[**GetRawMessage**](messages_api.md#GetRawMessage) | **GET** /messages/{message_id} | Get a message&#39;s raw Markdown
[**MarkAllAsRead**](messages_api.md#MarkAllAsRead) | **POST** /mark_all_as_read | Mark all messages as read
[**MarkStreamAsRead**](messages_api.md#MarkStreamAsRead) | **POST** /mark_stream_as_read | Mark messages in a stream as read
[**MarkTopicAsRead**](messages_api.md#MarkTopicAsRead) | **POST** /mark_topic_as_read | Mark messages in a topic as read
[**RemoveReaction**](messages_api.md#RemoveReaction) | **DELETE** /messages/{message_id}/reactions | Remove an emoji reaction
[**RenderMessage**](messages_api.md#RenderMessage) | **POST** /messages/render | Render message
[**SendMessage**](messages_api.md#SendMessage) | **POST** /messages | Send a message
[**UpdateMessage**](messages_api.md#UpdateMessage) | **PATCH** /messages/{message_id} | Edit a message
[**UpdateMessageFlags**](messages_api.md#UpdateMessageFlags) | **POST** /messages/flags | Update personal message flags
[**UploadFile**](messages_api.md#UploadFile) | **POST** /user_uploads | Upload a file


<a name="AddReaction"></a>
# **AddReaction**
> JsonSuccess AddReaction(messageId, emojiName, emojiCode, reactionType)

Add an emoji reaction

Add an [emoji reaction](/help/emoji-reactions) to a message.  &#x60;POST {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 
<a name="CheckMessagesMatchNarrow"></a>
# **CheckMessagesMatchNarrow**
> AnyType CheckMessagesMatchNarrow(msgIds, narrow)

Check if messages match a narrow

Check whether a set of messages match a [narrow](/api/construct-narrow).  &#x60;GET {{ api_url }}/v1/messages/matches_narrow&#x60;  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the &#x60;match_subject&#x60; and &#x60;match_content&#x60; objects is designed to match those of &#x60;GET /messages&#x60;, so that a client can splice these fields into a &#x60;message&#x60; object received from &#x60;GET /events&#x60; and end up with an extended message object identical to how a &#x60;GET /messages&#x60; for the current narrow would have returned the message. 
<a name="DeleteMessage"></a>
# **DeleteMessage**
> JsonSuccess DeleteMessage(messageId)

Delete a message

Permanently delete a message.  &#x60;DELETE {{ api_url }}/v1/messages/{msg_id}&#x60;  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
<a name="GetFileTemporaryUrl"></a>
# **GetFileTemporaryUrl**
> JsonSuccessBase GetFileTemporaryUrl(realmIdStr, filename)

Get public temporary URL

Get a temporary URL for access to the file that doesn&#39;t require authentication. 
<a name="GetMessageHistory"></a>
# **GetMessageHistory**
> JsonSuccessBase GetMessageHistory(messageId)

Get a message&#39;s edit history

Fetch the message edit history of a previously edited message.  &#x60;GET {{ api_url }}/v1/messages/{message_id}/history&#x60;  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
<a name="GetMessages"></a>
# **GetMessages**
> JsonSuccessBase GetMessages(numBefore, numAfter, anchor, narrow, clientGravatar, applyMarkdown, useFirstUnreadAnchor)

Get messages

Fetch message history from a Zulip server.  &#x60;GET {{ api_url }}/v1/messages&#x60;  This &#x60;GET /api/v1/messages&#x60; endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip&#39;s powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user&#39;s message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an &#x60;anchor&#x60; message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the &#x60;num_before&#x60; and &#x60;num_after&#x60; limits.  We recommend using &#x60;num_before &lt;&#x3D; 1000&#x60; and &#x60;num_after &lt;&#x3D; 1000&#x60; to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
<a name="GetRawMessage"></a>
# **GetRawMessage**
> JsonSuccessBase GetRawMessage(messageId)

Get a message&#39;s raw Markdown

Get the raw content of a message.  &#x60;GET {{ api_url }}/v1/messages/{msg_id}&#x60;  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message&#39;s raw Markdown (e.g. for pre-filling a message-editing UI). 
<a name="MarkAllAsRead"></a>
# **MarkAllAsRead**
> JsonSuccess MarkAllAsRead()

Mark all messages as read

Marks all of the current user&#39;s unread messages as read.  &#x60;POST {{ api_url }}/v1/mark_all_as_read&#x60; 
<a name="MarkStreamAsRead"></a>
# **MarkStreamAsRead**
> JsonSuccess MarkStreamAsRead(streamId)

Mark messages in a stream as read

Mark all the unread messages in a stream as read. 
<a name="MarkTopicAsRead"></a>
# **MarkTopicAsRead**
> JsonSuccess MarkTopicAsRead(streamId, topicName)

Mark messages in a topic as read

Mark all the unread messages in a topic as read. 
<a name="RemoveReaction"></a>
# **RemoveReaction**
> JsonSuccess RemoveReaction(messageId, emojiName, emojiCode, reactionType)

Remove an emoji reaction

Remove an [emoji reaction](/help/emoji-reactions) from a message.  &#x60;DELETE {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 
<a name="RenderMessage"></a>
# **RenderMessage**
> JsonSuccessBase RenderMessage(content)

Render message

Render a message to HTML.  &#x60;POST {{ api_url }}/v1/messages/render&#x60; 
<a name="SendMessage"></a>
# **SendMessage**
> JsonSuccessBase SendMessage(Type_, to, content, topic, queueId, localId)

Send a message

Send a stream or a private message.  &#x60;POST {{ api_url }}/v1/messages&#x60; 
<a name="UpdateMessage"></a>
# **UpdateMessage**
> JsonSuccess UpdateMessage(messageId, topic, propagateMode, sendNotificationToOldThread, sendNotificationToNewThread, content, streamId)

Edit a message

Edit/update the content or topic of a message.  &#x60;PATCH {{ api_url }}/v1/messages/{msg_id}&#x60;  &#x60;{msg_id}&#x60; in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to &#x60;✔ {original_topic}&#x60;.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
<a name="UpdateMessageFlags"></a>
# **UpdateMessageFlags**
> JsonSuccessBase UpdateMessageFlags(messages, op, flag)

Update personal message flags

Add or remove personal message flags like &#x60;read&#x60; and &#x60;starred&#x60; on a collection of message IDs.  &#x60;POST {{ api_url }}/v1/messages/flags&#x60;  For updating the &#x60;read&#x60; flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
<a name="UploadFile"></a>
# **UploadFile**
> JsonSuccessBase UploadFile(filename)

Upload a file

Upload a single file and get the corresponding URI.  &#x60;POST {{ api_url }}/v1/user_uploads&#x60;  Initially, only you will be able to access the link.  To share the uploaded file, you&#39;ll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
