# OAIMessagesApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addReaction**](OAIMessagesApi.md#addreaction) | **POST** /messages/{message_id}/reactions | Add an emoji reaction
[**checkMessagesMatchNarrow**](OAIMessagesApi.md#checkmessagesmatchnarrow) | **GET** /messages/matches_narrow | Check if messages match a narrow
[**deleteMessage**](OAIMessagesApi.md#deletemessage) | **DELETE** /messages/{message_id} | Delete a message
[**getFileTemporaryUrl**](OAIMessagesApi.md#getfiletemporaryurl) | **GET** /user_uploads/{realm_id_str}/{filename} | Get public temporary URL
[**getMessageHistory**](OAIMessagesApi.md#getmessagehistory) | **GET** /messages/{message_id}/history | Get a message&#39;s edit history
[**getMessages**](OAIMessagesApi.md#getmessages) | **GET** /messages | Get messages
[**getRawMessage**](OAIMessagesApi.md#getrawmessage) | **GET** /messages/{message_id} | Get a message&#39;s raw Markdown
[**markAllAsRead**](OAIMessagesApi.md#markallasread) | **POST** /mark_all_as_read | Mark all messages as read
[**markStreamAsRead**](OAIMessagesApi.md#markstreamasread) | **POST** /mark_stream_as_read | Mark messages in a stream as read
[**markTopicAsRead**](OAIMessagesApi.md#marktopicasread) | **POST** /mark_topic_as_read | Mark messages in a topic as read
[**removeReaction**](OAIMessagesApi.md#removereaction) | **DELETE** /messages/{message_id}/reactions | Remove an emoji reaction
[**renderMessage**](OAIMessagesApi.md#rendermessage) | **POST** /messages/render | Render message
[**sendMessage**](OAIMessagesApi.md#sendmessage) | **POST** /messages | Send a message
[**updateMessage**](OAIMessagesApi.md#updatemessage) | **PATCH** /messages/{message_id} | Edit a message
[**updateMessageFlags**](OAIMessagesApi.md#updatemessageflags) | **POST** /messages/flags | Update personal message flags
[**uploadFile**](OAIMessagesApi.md#uploadfile) | **POST** /user_uploads | Upload a file


# **addReaction**
```objc
-(NSURLSessionTask*) addReactionWithMessageId: (NSNumber*) messageId
    emojiName: (NSString*) emojiName
    emojiCode: (NSString*) emojiCode
    reactionType: (NSString*) reactionType
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Add an emoji reaction

Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` 

### Example 
```objc

NSNumber* messageId = 42; // The target message's ID. 
NSString* emojiName = octopus; // The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. 
NSString* emojiCode = 1f419; // A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji.  (optional)
NSString* reactionType = unicode_emoji; // If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified.  (optional)

OAIMessagesApi*apiInstance = [[OAIMessagesApi alloc] init];

// Add an emoji reaction
[apiInstance addReactionWithMessageId:messageId
              emojiName:emojiName
              emojiCode:emojiCode
              reactionType:reactionType
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMessagesApi->addReaction: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **NSNumber***| The target message&#39;s ID.  | 
 **emojiName** | **NSString***| The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name.  | 
 **emojiCode** | **NSString***| A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji.  | [optional] 
 **reactionType** | **NSString***| If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified.  | [optional] 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **checkMessagesMatchNarrow**
```objc
-(NSURLSessionTask*) checkMessagesMatchNarrowWithMsgIds: (NSArray<NSNumber*>*) msgIds
    narrow: (NSArray<NSObject*>*) narrow
        completionHandler: (void (^)(OAIAnyType* output, NSError* error)) handler;
```

Check if messages match a narrow

Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. 

### Example 
```objc

NSArray<NSNumber*>* msgIds = @[@56]; // List of IDs for the messages to check.
NSArray<NSObject*>* narrow = @[[[NSObject alloc] init]]; // A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).

OAIMessagesApi*apiInstance = [[OAIMessagesApi alloc] init];

// Check if messages match a narrow
[apiInstance checkMessagesMatchNarrowWithMsgIds:msgIds
              narrow:narrow
          completionHandler: ^(OAIAnyType* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMessagesApi->checkMessagesMatchNarrow: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgIds** | [**NSArray&lt;NSNumber*&gt;***](NSNumber*.md)| List of IDs for the messages to check. | 
 **narrow** | [**NSArray&lt;NSObject*&gt;***](NSObject*.md)| A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow). | 

### Return type

[**OAIAnyType***](OAIAnyType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteMessage**
```objc
-(NSURLSessionTask*) deleteMessageWithMessageId: (NSNumber*) messageId
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Delete a message

Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 

### Example 
```objc

NSNumber* messageId = 42; // The target message's ID. 

OAIMessagesApi*apiInstance = [[OAIMessagesApi alloc] init];

// Delete a message
[apiInstance deleteMessageWithMessageId:messageId
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMessagesApi->deleteMessage: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **NSNumber***| The target message&#39;s ID.  | 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getFileTemporaryUrl**
```objc
-(NSURLSessionTask*) getFileTemporaryUrlWithRealmIdStr: (NSNumber*) realmIdStr
    filename: (NSString*) filename
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Get public temporary URL

Get a temporary URL for access to the file that doesn't require authentication. 

### Example 
```objc

NSNumber* realmIdStr = 1; // The realm id. 
NSString* filename = 4e/m2A3MSqFnWRLUf9SaPzQ0Up_/zulip.txt; // Path to the URL. 

OAIMessagesApi*apiInstance = [[OAIMessagesApi alloc] init];

// Get public temporary URL
[apiInstance getFileTemporaryUrlWithRealmIdStr:realmIdStr
              filename:filename
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMessagesApi->getFileTemporaryUrl: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmIdStr** | **NSNumber***| The realm id.  | 
 **filename** | **NSString***| Path to the URL.  | 

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getMessageHistory**
```objc
-(NSURLSessionTask*) getMessageHistoryWithMessageId: (NSNumber*) messageId
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Get a message's edit history

Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 

### Example 
```objc

NSNumber* messageId = 42; // The target message's ID. 

OAIMessagesApi*apiInstance = [[OAIMessagesApi alloc] init];

// Get a message's edit history
[apiInstance getMessageHistoryWithMessageId:messageId
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMessagesApi->getMessageHistory: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **NSNumber***| The target message&#39;s ID.  | 

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getMessages**
```objc
-(NSURLSessionTask*) getMessagesWithNumBefore: (NSNumber*) numBefore
    numAfter: (NSNumber*) numAfter
    anchor: (OAIOneOfStringInteger*) anchor
    narrow: (NSArray<NSObject*>*) narrow
    clientGravatar: (NSNumber*) clientGravatar
    applyMarkdown: (NSNumber*) applyMarkdown
    useFirstUnreadAnchor: (NSNumber*) useFirstUnreadAnchor
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Get messages

Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 

### Example 
```objc

NSNumber* numBefore = 4; // The number of messages with IDs less than the anchor to retrieve. 
NSNumber* numAfter = 8; // The number of messages with IDs greater than the anchor to retrieve. 
OAIOneOfStringInteger* anchor = 42; // Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * `newest`: The most recent message. * `oldest`: The oldest message. * `first_unread`: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of `'newest'` and `'oldest'` are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   `first_unread` functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, `oldest` can be emulated with   `anchor=0`, and `newest` with `anchor=10000000000000000`   (that specific large value works around a bug in Zulip   2.1.x and older in the `found_newest` return value).  (optional)
NSArray<NSObject*>* narrow = @[[[NSObject alloc] init]]; // The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow).  (optional)
NSNumber* clientGravatar = true; // Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional) (default to @(NO))
NSNumber* applyMarkdown = false; // If `true`, message content is returned in the rendered HTML format. If `false`, message content is returned in the raw Markdown-format text that user entered.  (optional) (default to @(YES))
NSNumber* useFirstUnreadAnchor = true; // Legacy way to specify `anchor=\"first_unread\"` in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the `anchor`.  Mutually exclusive with `anchor`.  **Changes**: Deprecated in Zulip 3.0, replaced by `anchor=\"first_unread\"` instead.  (optional) (default to @(NO))

OAIMessagesApi*apiInstance = [[OAIMessagesApi alloc] init];

// Get messages
[apiInstance getMessagesWithNumBefore:numBefore
              numAfter:numAfter
              anchor:anchor
              narrow:narrow
              clientGravatar:clientGravatar
              applyMarkdown:applyMarkdown
              useFirstUnreadAnchor:useFirstUnreadAnchor
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMessagesApi->getMessages: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numBefore** | **NSNumber***| The number of messages with IDs less than the anchor to retrieve.  | 
 **numAfter** | **NSNumber***| The number of messages with IDs greater than the anchor to retrieve.  | 
 **anchor** | [**OAIOneOfStringInteger***](.md)| Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * &#x60;newest&#x60;: The most recent message. * &#x60;oldest&#x60;: The oldest message. * &#x60;first_unread&#x60;: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of &#x60;&#39;newest&#39;&#x60; and &#x60;&#39;oldest&#39;&#x60; are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   &#x60;first_unread&#x60; functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, &#x60;oldest&#x60; can be emulated with   &#x60;anchor&#x3D;0&#x60;, and &#x60;newest&#x60; with &#x60;anchor&#x3D;10000000000000000&#x60;   (that specific large value works around a bug in Zulip   2.1.x and older in the &#x60;found_newest&#x60; return value).  | [optional] 
 **narrow** | [**NSArray&lt;NSObject*&gt;***](NSObject*.md)| The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow).  | [optional] 
 **clientGravatar** | **NSNumber***| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to @(NO)]
 **applyMarkdown** | **NSNumber***| If &#x60;true&#x60;, message content is returned in the rendered HTML format. If &#x60;false&#x60;, message content is returned in the raw Markdown-format text that user entered.  | [optional] [default to @(YES)]
 **useFirstUnreadAnchor** | **NSNumber***| Legacy way to specify &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the &#x60;anchor&#x60;.  Mutually exclusive with &#x60;anchor&#x60;.  **Changes**: Deprecated in Zulip 3.0, replaced by &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; instead.  | [optional] [default to @(NO)]

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getRawMessage**
```objc
-(NSURLSessionTask*) getRawMessageWithMessageId: (NSNumber*) messageId
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Get a message's raw Markdown

Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). 

### Example 
```objc

NSNumber* messageId = 42; // The target message's ID. 

OAIMessagesApi*apiInstance = [[OAIMessagesApi alloc] init];

// Get a message's raw Markdown
[apiInstance getRawMessageWithMessageId:messageId
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMessagesApi->getRawMessage: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **NSNumber***| The target message&#39;s ID.  | 

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **markAllAsRead**
```objc
-(NSURLSessionTask*) markAllAsReadWithCompletionHandler: 
        (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Mark all messages as read

Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` 

### Example 
```objc


OAIMessagesApi*apiInstance = [[OAIMessagesApi alloc] init];

// Mark all messages as read
[apiInstance markAllAsReadWithCompletionHandler: 
          ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMessagesApi->markAllAsRead: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **markStreamAsRead**
```objc
-(NSURLSessionTask*) markStreamAsReadWithStreamId: (NSNumber*) streamId
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Mark messages in a stream as read

Mark all the unread messages in a stream as read. 

### Example 
```objc

NSNumber* streamId = 42; // The ID of the stream to access. 

OAIMessagesApi*apiInstance = [[OAIMessagesApi alloc] init];

// Mark messages in a stream as read
[apiInstance markStreamAsReadWithStreamId:streamId
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMessagesApi->markStreamAsRead: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **NSNumber***| The ID of the stream to access.  | 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **markTopicAsRead**
```objc
-(NSURLSessionTask*) markTopicAsReadWithStreamId: (NSNumber*) streamId
    topicName: (NSString*) topicName
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Mark messages in a topic as read

Mark all the unread messages in a topic as read. 

### Example 
```objc

NSNumber* streamId = 42; // The ID of the stream to access. 
NSString* topicName = new coffee machine; // The name of the topic whose messages should be marked as read. 

OAIMessagesApi*apiInstance = [[OAIMessagesApi alloc] init];

// Mark messages in a topic as read
[apiInstance markTopicAsReadWithStreamId:streamId
              topicName:topicName
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMessagesApi->markTopicAsRead: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **NSNumber***| The ID of the stream to access.  | 
 **topicName** | **NSString***| The name of the topic whose messages should be marked as read.  | 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **removeReaction**
```objc
-(NSURLSessionTask*) removeReactionWithMessageId: (NSNumber*) messageId
    emojiName: (NSString*) emojiName
    emojiCode: (NSString*) emojiCode
    reactionType: (NSString*) reactionType
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Remove an emoji reaction

Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` 

### Example 
```objc

NSNumber* messageId = 42; // The target message's ID. 
NSString* emojiName = octopus; // The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name.  (optional)
NSString* emojiCode = 1f419; // A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji.  (optional)
NSString* reactionType = unicode_emoji; // If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified.  (optional)

OAIMessagesApi*apiInstance = [[OAIMessagesApi alloc] init];

// Remove an emoji reaction
[apiInstance removeReactionWithMessageId:messageId
              emojiName:emojiName
              emojiCode:emojiCode
              reactionType:reactionType
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMessagesApi->removeReaction: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **NSNumber***| The target message&#39;s ID.  | 
 **emojiName** | **NSString***| The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name.  | [optional] 
 **emojiCode** | **NSString***| A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji.  | [optional] 
 **reactionType** | **NSString***| If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified.  | [optional] 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **renderMessage**
```objc
-(NSURLSessionTask*) renderMessageWithContent: (NSString*) content
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Render message

Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` 

### Example 
```objc

NSString* content = Hello; // The content of the message. Maximum message size of 10000 bytes. 

OAIMessagesApi*apiInstance = [[OAIMessagesApi alloc] init];

// Render message
[apiInstance renderMessageWithContent:content
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMessagesApi->renderMessage: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **NSString***| The content of the message. Maximum message size of 10000 bytes.  | 

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sendMessage**
```objc
-(NSURLSessionTask*) sendMessageWithType: (NSString*) type
    to: (NSArray<NSNumber*>*) to
    content: (NSString*) content
    topic: (NSString*) topic
    queueId: (NSString*) queueId
    localId: (NSString*) localId
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Send a message

Send a stream or a private message.  `POST {{ api_url }}/v1/messages` 

### Example 
```objc

NSString* type = private; // The type of message to be sent. `private` for a private message and `stream` for a stream message. 
NSArray<NSNumber*>* to = @[@56]; // For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. 
NSString* content = Hello; // The content of the message. Maximum message size of 10000 bytes. 
NSString* topic = Castle; // The topic of the message. Only required for stream messages (`type=\"stream\"`), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias.  (optional)
NSString* queueId = 1593114627:0; // For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, `local_id` is required.  If the message is successfully sent, the server will include `local_id` in the `message` event that the client with this `queue_id` will receive notifying it of the new message via [`GET /events`](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device).  (optional)
NSString* localId = 100.01; // For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the `queue_id` description.  (optional)

OAIMessagesApi*apiInstance = [[OAIMessagesApi alloc] init];

// Send a message
[apiInstance sendMessageWithType:type
              to:to
              content:content
              topic:topic
              queueId:queueId
              localId:localId
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMessagesApi->sendMessage: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **NSString***| The type of message to be sent. &#x60;private&#x60; for a private message and &#x60;stream&#x60; for a stream message.  | 
 **to** | [**NSArray&lt;NSNumber*&gt;***](NSNumber*.md)| For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0.  | 
 **content** | **NSString***| The content of the message. Maximum message size of 10000 bytes.  | 
 **topic** | **NSString***| The topic of the message. Only required for stream messages (&#x60;type&#x3D;\&quot;stream\&quot;&#x60;), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias.  | [optional] 
 **queueId** | **NSString***| For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, &#x60;local_id&#x60; is required.  If the message is successfully sent, the server will include &#x60;local_id&#x60; in the &#x60;message&#x60; event that the client with this &#x60;queue_id&#x60; will receive notifying it of the new message via [&#x60;GET /events&#x60;](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device).  | [optional] 
 **localId** | **NSString***| For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the &#x60;queue_id&#x60; description.  | [optional] 

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateMessage**
```objc
-(NSURLSessionTask*) updateMessageWithMessageId: (NSNumber*) messageId
    topic: (NSString*) topic
    propagateMode: (NSString*) propagateMode
    sendNotificationToOldThread: (NSNumber*) sendNotificationToOldThread
    sendNotificationToNewThread: (NSNumber*) sendNotificationToNewThread
    content: (NSString*) content
    streamId: (NSNumber*) streamId
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Edit a message

Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 

### Example 
```objc

NSNumber* messageId = 42; // The target message's ID. 
NSString* topic = Castle; // The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias.  (optional)
NSString* propagateMode = change_all; // Which message(s) should be edited: just the one indicated in `message_id`, messages in the same topic that had been sent after this one, or all of them.  Only the default value of `change_one` is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic.  (optional) (default to @"change_one")
NSNumber* sendNotificationToOldThread = true; // Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9).  (optional) (default to @(YES))
NSNumber* sendNotificationToNewThread = true; // Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9).  (optional) (default to @(YES))
NSString* content = Hello; // The content of the message. Maximum message size of 10000 bytes.  (optional)
NSNumber* streamId = 42; // The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message.  (optional)

OAIMessagesApi*apiInstance = [[OAIMessagesApi alloc] init];

// Edit a message
[apiInstance updateMessageWithMessageId:messageId
              topic:topic
              propagateMode:propagateMode
              sendNotificationToOldThread:sendNotificationToOldThread
              sendNotificationToNewThread:sendNotificationToNewThread
              content:content
              streamId:streamId
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMessagesApi->updateMessage: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageId** | **NSNumber***| The target message&#39;s ID.  | 
 **topic** | **NSString***| The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias.  | [optional] 
 **propagateMode** | **NSString***| Which message(s) should be edited: just the one indicated in &#x60;message_id&#x60;, messages in the same topic that had been sent after this one, or all of them.  Only the default value of &#x60;change_one&#x60; is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic.  | [optional] [default to @&quot;change_one&quot;]
 **sendNotificationToOldThread** | **NSNumber***| Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9).  | [optional] [default to @(YES)]
 **sendNotificationToNewThread** | **NSNumber***| Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9).  | [optional] [default to @(YES)]
 **content** | **NSString***| The content of the message. Maximum message size of 10000 bytes.  | [optional] 
 **streamId** | **NSNumber***| The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message.  | [optional] 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateMessageFlags**
```objc
-(NSURLSessionTask*) updateMessageFlagsWithMessages: (NSArray<NSNumber*>*) messages
    op: (NSString*) op
    flag: (NSString*) flag
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Update personal message flags

Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 

### Example 
```objc

NSArray<NSNumber*>* messages = @[@56]; // An array containing the IDs of the target messages. 
NSString* op = add; // Whether to `add` the flag or `remove` it. 
NSString* flag = read; // The flag that should be added/removed. 

OAIMessagesApi*apiInstance = [[OAIMessagesApi alloc] init];

// Update personal message flags
[apiInstance updateMessageFlagsWithMessages:messages
              op:op
              flag:flag
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMessagesApi->updateMessageFlags: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messages** | [**NSArray&lt;NSNumber*&gt;***](NSNumber*.md)| An array containing the IDs of the target messages.  | 
 **op** | **NSString***| Whether to &#x60;add&#x60; the flag or &#x60;remove&#x60; it.  | 
 **flag** | **NSString***| The flag that should be added/removed.  | 

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **uploadFile**
```objc
-(NSURLSessionTask*) uploadFileWithFilename: (NSURL*) filename
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Upload a file

Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 

### Example 
```objc

NSURL* filename = [NSURL fileURLWithPath:@"/path/to/file"]; //  (optional)

OAIMessagesApi*apiInstance = [[OAIMessagesApi alloc] init];

// Upload a file
[apiInstance uploadFileWithFilename:filename
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMessagesApi->uploadFile: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filename** | **NSURL*****NSURL***|  | [optional] 

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

