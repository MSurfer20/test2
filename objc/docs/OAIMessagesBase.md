# OAIMessagesBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatarUrl** | **NSString*** | The URL of the user&#39;s avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user&#39;s email address itself for this user.  | [optional] 
**client** | **NSString*** | A Zulip \&quot;client\&quot; string, describing what Zulip client sent the message.  | [optional] 
**content** | **NSString*** | The content/body of the message.  | [optional] 
**contentType** | **NSString*** | The HTTP &#x60;content_type&#x60; for the message content.  This will be &#x60;text/html&#x60; or &#x60;text/x-markdown&#x60;, depending on whether &#x60;apply_markdown&#x60; was set.  | [optional] 
**displayRecipient** | [**OAIOneOfStringArray***](OAIOneOfStringArray.md) | Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message.  | [optional] 
**_id** | **NSNumber*** | The unique message ID.  Messages should always be displayed sorted by ID.  | [optional] 
**isMeMessage** | **NSNumber*** | Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages  | [optional] 
**reactions** | [**NSArray&lt;OAIEmojiReaction&gt;***](OAIEmojiReaction.md) | Data on any reactions to the message.  | [optional] 
**recipientId** | **NSNumber*** | A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing.  | [optional] 
**senderEmail** | **NSString*** | The Zulip display email address of the message&#39;s sender.  | [optional] 
**senderFullName** | **NSString*** | The full name of the message&#39;s sender.  | [optional] 
**senderId** | **NSNumber*** | The user ID of the message&#39;s sender.  | [optional] 
**senderRealmStr** | **NSString*** | A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on &#x60;example.zulip.com&#x60;, this will be &#x60;example&#x60;.  | [optional] 
**streamId** | **NSNumber*** | Only present for stream messages; the ID of the stream.  | [optional] 
**subject** | **NSString*** | The &#x60;topic&#x60; of the message.  Currently always &#x60;\&quot;\&quot;&#x60; for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \&quot;subjects\&quot; and will eventually change.  | [optional] 
**topicLinks** | [**NSArray&lt;OAIMessagesBaseTopicLinks&gt;***](OAIMessagesBaseTopicLinks.md) | Data on any links to be included in the &#x60;topic&#x60; line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message&#39;s topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called &#x60;subject_links&#x60;; clients are recommended to rename &#x60;subject_links&#x60; to &#x60;topic_links&#x60; if present for compatibility with older Zulip servers.  | [optional] 
**submessages** | **NSArray&lt;NSString*&gt;*** | Data used for certain experimental Zulip integrations.  | [optional] 
**timestamp** | **NSNumber*** | The UNIX timestamp for when the message was sent, in UTC seconds.  | [optional] 
**type** | **NSString*** | The type of the message: &#x60;stream&#x60; or &#x60;private&#x60;.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


