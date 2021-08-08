# PSOpenAPITools.PSOpenAPITools/Api.MessagesApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Add-Reaction**](MessagesApi.md#Add-Reaction) | **POST** /messages/{message_id}/reactions | Add an emoji reaction
[**Invoke-CheckMessagesMatchNarrow**](MessagesApi.md#Invoke-CheckMessagesMatchNarrow) | **GET** /messages/matches_narrow | Check if messages match a narrow
[**Invoke-DeleteMessage**](MessagesApi.md#Invoke-DeleteMessage) | **DELETE** /messages/{message_id} | Delete a message
[**Get-FileTemporaryUrl**](MessagesApi.md#Get-FileTemporaryUrl) | **GET** /user_uploads/{realm_id_str}/{filename} | Get public temporary URL
[**Get-MessageHistory**](MessagesApi.md#Get-MessageHistory) | **GET** /messages/{message_id}/history | Get a message&#39;s edit history
[**Get-Messages**](MessagesApi.md#Get-Messages) | **GET** /messages | Get messages
[**Get-RawMessage**](MessagesApi.md#Get-RawMessage) | **GET** /messages/{message_id} | Get a message&#39;s raw Markdown
[**Invoke-MarkAllAsRead**](MessagesApi.md#Invoke-MarkAllAsRead) | **POST** /mark_all_as_read | Mark all messages as read
[**Invoke-MarkStreamAsRead**](MessagesApi.md#Invoke-MarkStreamAsRead) | **POST** /mark_stream_as_read | Mark messages in a stream as read
[**Invoke-MarkTopicAsRead**](MessagesApi.md#Invoke-MarkTopicAsRead) | **POST** /mark_topic_as_read | Mark messages in a topic as read
[**Remove-Reaction**](MessagesApi.md#Remove-Reaction) | **DELETE** /messages/{message_id}/reactions | Remove an emoji reaction
[**Invoke-RenderMessage**](MessagesApi.md#Invoke-RenderMessage) | **POST** /messages/render | Render message
[**Send-Message**](MessagesApi.md#Send-Message) | **POST** /messages | Send a message
[**Update-Message**](MessagesApi.md#Update-Message) | **PATCH** /messages/{message_id} | Edit a message
[**Update-MessageFlags**](MessagesApi.md#Update-MessageFlags) | **POST** /messages/flags | Update personal message flags
[**Invoke-UploadFile**](MessagesApi.md#Invoke-UploadFile) | **POST** /user_uploads | Upload a file


<a name="Add-Reaction"></a>
# **Add-Reaction**
> JsonSuccess Add-Reaction<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MessageId] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EmojiName] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EmojiCode] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ReactionType] <String><br>

Add an emoji reaction

Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` 

### Example
```powershell
$MessageId = 42 # Int32 | The target message's ID. 
$EmojiName = "octopus" # String | The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. 
$EmojiCode = "1f419" # String | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a ""diffenent"" emoji.  (optional)
$ReactionType = "unicode_emoji" # String | If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified.  (optional)

# Add an emoji reaction
try {
    $Result = Add-Reaction -MessageId $MessageId -EmojiName $EmojiName -EmojiCode $EmojiCode -ReactionType $ReactionType
} catch {
    Write-Host ("Exception occured when calling Add-Reaction: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **MessageId** | **Int32**| The target message&#39;s ID.  | 
 **EmojiName** | **String**| The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name.  | 
 **EmojiCode** | **String**| A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a &quot;&quot;diffenent&quot;&quot; emoji.  | [optional] 
 **ReactionType** | **String**| If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Invoke-CheckMessagesMatchNarrow"></a>
# **Invoke-CheckMessagesMatchNarrow**
> AnyType Invoke-CheckMessagesMatchNarrow<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MsgIds] <System.Nullable[Int32][]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Narrow] <PSCustomObject[]><br>

Check if messages match a narrow

Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. 

### Example
```powershell
$MsgIds = 0 # Int32[] | List of IDs for the messages to check.
$Narrow =  # SystemCollectionsHashtable[] | A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).

# Check if messages match a narrow
try {
    $Result = Invoke-CheckMessagesMatchNarrow -MsgIds $MsgIds -Narrow $Narrow
} catch {
    Write-Host ("Exception occured when calling Invoke-CheckMessagesMatchNarrow: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **MsgIds** | [**Int32[]**](Int32.md)| List of IDs for the messages to check. | 
 **Narrow** | [**SystemCollectionsHashtable[]**](SystemCollectionsHashtable.md)| A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow). | 

### Return type

[**AnyType**](AnyType.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Invoke-DeleteMessage"></a>
# **Invoke-DeleteMessage**
> JsonSuccess Invoke-DeleteMessage<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MessageId] <Int32><br>

Delete a message

Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 

### Example
```powershell
$MessageId = 42 # Int32 | The target message's ID. 

# Delete a message
try {
    $Result = Invoke-DeleteMessage -MessageId $MessageId
} catch {
    Write-Host ("Exception occured when calling Invoke-DeleteMessage: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **MessageId** | **Int32**| The target message&#39;s ID.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-FileTemporaryUrl"></a>
# **Get-FileTemporaryUrl**
> JsonSuccessBase Get-FileTemporaryUrl<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-RealmIdStr] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Filename] <String><br>

Get public temporary URL

Get a temporary URL for access to the file that doesn't require authentication. 

### Example
```powershell
$RealmIdStr = 1 # Int32 | The realm id. 
$Filename = "4e/m2A3MSqFnWRLUf9SaPzQ0Up_/zulip.txt" # String | Path to the URL. 

# Get public temporary URL
try {
    $Result = Get-FileTemporaryUrl -RealmIdStr $RealmIdStr -Filename $Filename
} catch {
    Write-Host ("Exception occured when calling Get-FileTemporaryUrl: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **RealmIdStr** | **Int32**| The realm id.  | 
 **Filename** | **String**| Path to the URL.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-MessageHistory"></a>
# **Get-MessageHistory**
> JsonSuccessBase Get-MessageHistory<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MessageId] <Int32><br>

Get a message's edit history

Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 

### Example
```powershell
$MessageId = 42 # Int32 | The target message's ID. 

# Get a message's edit history
try {
    $Result = Get-MessageHistory -MessageId $MessageId
} catch {
    Write-Host ("Exception occured when calling Get-MessageHistory: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **MessageId** | **Int32**| The target message&#39;s ID.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-Messages"></a>
# **Get-Messages**
> JsonSuccessBase Get-Messages<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-NumBefore] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-NumAfter] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Anchor] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Narrow] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ClientGravatar] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ApplyMarkdown] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UseFirstUnreadAnchor] <System.Nullable[Boolean]><br>

Get messages

Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 

### Example
```powershell
$NumBefore = 4 # Int32 | The number of messages with IDs less than the anchor to retrieve. 
$NumAfter = 8 # Int32 | The number of messages with IDs greater than the anchor to retrieve. 
 # OneOfstringinteger | Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * `newest`: The most recent message. * `oldest`: The oldest message. * `first_unread`: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of `'newest'` and `'oldest'` are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   `first_unread` functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, `oldest` can be emulated with   `anchor=0`, and `newest` with `anchor=10000000000000000`   (that specific large value works around a bug in Zulip   2.1.x and older in the `found_newest` return value).  (optional)
$Narrow =  # SystemCollectionsHashtable[] | The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow).  (optional)
$ClientGravatar = $true # Boolean | Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional) (default to $false)
$ApplyMarkdown = $false # Boolean | If `true`, message content is returned in the rendered HTML format. If `false`, message content is returned in the raw Markdown-format text that user entered.  (optional) (default to $true)
$UseFirstUnreadAnchor = $true # Boolean | Legacy way to specify `anchor=""first_unread""` in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the `anchor`.  Mutually exclusive with `anchor`.  **Changes**: Deprecated in Zulip 3.0, replaced by `anchor=""first_unread""` instead.  (optional) (default to $false)

# Get messages
try {
    $Result = Get-Messages -NumBefore $NumBefore -NumAfter $NumAfter -Anchor $Anchor -Narrow $Narrow -ClientGravatar $ClientGravatar -ApplyMarkdown $ApplyMarkdown -UseFirstUnreadAnchor $UseFirstUnreadAnchor
} catch {
    Write-Host ("Exception occured when calling Get-Messages: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **NumBefore** | **Int32**| The number of messages with IDs less than the anchor to retrieve.  | 
 **NumAfter** | **Int32**| The number of messages with IDs greater than the anchor to retrieve.  | 
 **Anchor** | [**OneOfstringinteger**](OneOfstringinteger.md)| Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * &#x60;newest&#x60;: The most recent message. * &#x60;oldest&#x60;: The oldest message. * &#x60;first_unread&#x60;: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of &#x60;&#39;newest&#39;&#x60; and &#x60;&#39;oldest&#39;&#x60; are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   &#x60;first_unread&#x60; functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, &#x60;oldest&#x60; can be emulated with   &#x60;anchor&#x3D;0&#x60;, and &#x60;newest&#x60; with &#x60;anchor&#x3D;10000000000000000&#x60;   (that specific large value works around a bug in Zulip   2.1.x and older in the &#x60;found_newest&#x60; return value).  | [optional] 
 **Narrow** | [**SystemCollectionsHashtable[]**](SystemCollectionsHashtable.md)| The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow).  | [optional] 
 **ClientGravatar** | **Boolean**| Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars.  | [optional] [default to $false]
 **ApplyMarkdown** | **Boolean**| If &#x60;true&#x60;, message content is returned in the rendered HTML format. If &#x60;false&#x60;, message content is returned in the raw Markdown-format text that user entered.  | [optional] [default to $true]
 **UseFirstUnreadAnchor** | **Boolean**| Legacy way to specify &#x60;anchor&#x3D;&quot;&quot;first_unread&quot;&quot;&#x60; in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the &#x60;anchor&#x60;.  Mutually exclusive with &#x60;anchor&#x60;.  **Changes**: Deprecated in Zulip 3.0, replaced by &#x60;anchor&#x3D;&quot;&quot;first_unread&quot;&quot;&#x60; instead.  | [optional] [default to $false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-RawMessage"></a>
# **Get-RawMessage**
> JsonSuccessBase Get-RawMessage<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MessageId] <Int32><br>

Get a message's raw Markdown

Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). 

### Example
```powershell
$MessageId = 42 # Int32 | The target message's ID. 

# Get a message's raw Markdown
try {
    $Result = Get-RawMessage -MessageId $MessageId
} catch {
    Write-Host ("Exception occured when calling Get-RawMessage: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **MessageId** | **Int32**| The target message&#39;s ID.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Invoke-MarkAllAsRead"></a>
# **Invoke-MarkAllAsRead**
> JsonSuccess Invoke-MarkAllAsRead<br>

Mark all messages as read

Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` 

### Example
```powershell

# Mark all messages as read
try {
    $Result = Invoke-MarkAllAsRead
} catch {
    Write-Host ("Exception occured when calling Invoke-MarkAllAsRead: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Invoke-MarkStreamAsRead"></a>
# **Invoke-MarkStreamAsRead**
> JsonSuccess Invoke-MarkStreamAsRead<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StreamId] <Int32><br>

Mark messages in a stream as read

Mark all the unread messages in a stream as read. 

### Example
```powershell
$StreamId = 42 # Int32 | The ID of the stream to access. 

# Mark messages in a stream as read
try {
    $Result = Invoke-MarkStreamAsRead -StreamId $StreamId
} catch {
    Write-Host ("Exception occured when calling Invoke-MarkStreamAsRead: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **StreamId** | **Int32**| The ID of the stream to access.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Invoke-MarkTopicAsRead"></a>
# **Invoke-MarkTopicAsRead**
> JsonSuccess Invoke-MarkTopicAsRead<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StreamId] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-TopicName] <String><br>

Mark messages in a topic as read

Mark all the unread messages in a topic as read. 

### Example
```powershell
$StreamId = 42 # Int32 | The ID of the stream to access. 
$TopicName = "new coffee machine" # String | The name of the topic whose messages should be marked as read. 

# Mark messages in a topic as read
try {
    $Result = Invoke-MarkTopicAsRead -StreamId $StreamId -TopicName $TopicName
} catch {
    Write-Host ("Exception occured when calling Invoke-MarkTopicAsRead: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **StreamId** | **Int32**| The ID of the stream to access.  | 
 **TopicName** | **String**| The name of the topic whose messages should be marked as read.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Remove-Reaction"></a>
# **Remove-Reaction**
> JsonSuccess Remove-Reaction<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MessageId] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EmojiName] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EmojiCode] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ReactionType] <String><br>

Remove an emoji reaction

Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` 

### Example
```powershell
$MessageId = 42 # Int32 | The target message's ID. 
$EmojiName = "octopus" # String | The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name.  (optional)
$EmojiCode = "1f419" # String | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a ""diffenent"" emoji.  (optional)
$ReactionType = "unicode_emoji" # String | If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified.  (optional)

# Remove an emoji reaction
try {
    $Result = Remove-Reaction -MessageId $MessageId -EmojiName $EmojiName -EmojiCode $EmojiCode -ReactionType $ReactionType
} catch {
    Write-Host ("Exception occured when calling Remove-Reaction: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **MessageId** | **Int32**| The target message&#39;s ID.  | 
 **EmojiName** | **String**| The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name.  | [optional] 
 **EmojiCode** | **String**| A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a &quot;&quot;diffenent&quot;&quot; emoji.  | [optional] 
 **ReactionType** | **String**| If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Invoke-RenderMessage"></a>
# **Invoke-RenderMessage**
> JsonSuccessBase Invoke-RenderMessage<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Content] <String><br>

Render message

Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` 

### Example
```powershell
$Content = "Hello" # String | The content of the message. Maximum message size of 10000 bytes. 

# Render message
try {
    $Result = Invoke-RenderMessage -Content $Content
} catch {
    Write-Host ("Exception occured when calling Invoke-RenderMessage: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Content** | **String**| The content of the message. Maximum message size of 10000 bytes.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Send-Message"></a>
# **Send-Message**
> JsonSuccessBase Send-Message<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Type] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-To] <System.Nullable[Int32][]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Content] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Topic] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-QueueId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LocalId] <String><br>

Send a message

Send a stream or a private message.  `POST {{ api_url }}/v1/messages` 

### Example
```powershell
$Type = "private" # String | The type of message to be sent. `private` for a private message and `stream` for a stream message. 
$To = 0 # Int32[] | For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. 
$Content = "Hello" # String | The content of the message. Maximum message size of 10000 bytes. 
$Topic = "Castle" # String | The topic of the message. Only required for stream messages (`type=""stream""`), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias.  (optional)
$QueueId = "1593114627:0" # String | For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, `local_id` is required.  If the message is successfully sent, the server will include `local_id` in the `message` event that the client with this `queue_id` will receive notifying it of the new message via [`GET /events`](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device).  (optional)
$LocalId = "100.01" # String | For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the `queue_id` description.  (optional)

# Send a message
try {
    $Result = Send-Message -Type $Type -To $To -Content $Content -Topic $Topic -QueueId $QueueId -LocalId $LocalId
} catch {
    Write-Host ("Exception occured when calling Send-Message: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Type** | **String**| The type of message to be sent. &#x60;private&#x60; for a private message and &#x60;stream&#x60; for a stream message.  | 
 **To** | [**Int32[]**](Int32.md)| For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0.  | 
 **Content** | **String**| The content of the message. Maximum message size of 10000 bytes.  | 
 **Topic** | **String**| The topic of the message. Only required for stream messages (&#x60;type&#x3D;&quot;&quot;stream&quot;&quot;&#x60;), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias.  | [optional] 
 **QueueId** | **String**| For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, &#x60;local_id&#x60; is required.  If the message is successfully sent, the server will include &#x60;local_id&#x60; in the &#x60;message&#x60; event that the client with this &#x60;queue_id&#x60; will receive notifying it of the new message via [&#x60;GET /events&#x60;](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device).  | [optional] 
 **LocalId** | **String**| For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the &#x60;queue_id&#x60; description.  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Update-Message"></a>
# **Update-Message**
> JsonSuccess Update-Message<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MessageId] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Topic] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PropagateMode] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SendNotificationToOldThread] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SendNotificationToNewThread] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Content] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StreamId] <System.Nullable[Int32]><br>

Edit a message

Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 

### Example
```powershell
$MessageId = 42 # Int32 | The target message's ID. 
$Topic = "Castle" # String | The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias.  (optional)
$PropagateMode = "change_one" # String | Which message(s) should be edited: just the one indicated in `message_id`, messages in the same topic that had been sent after this one, or all of them.  Only the default value of `change_one` is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic.  (optional) (default to "change_one")
$SendNotificationToOldThread = $true # Boolean | Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9).  (optional) (default to $true)
$SendNotificationToNewThread = $true # Boolean | Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9).  (optional) (default to $true)
$Content = "Hello" # String | The content of the message. Maximum message size of 10000 bytes.  (optional)
$StreamId = 42 # Int32 | The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message.  (optional)

# Edit a message
try {
    $Result = Update-Message -MessageId $MessageId -Topic $Topic -PropagateMode $PropagateMode -SendNotificationToOldThread $SendNotificationToOldThread -SendNotificationToNewThread $SendNotificationToNewThread -Content $Content -StreamId $StreamId
} catch {
    Write-Host ("Exception occured when calling Update-Message: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **MessageId** | **Int32**| The target message&#39;s ID.  | 
 **Topic** | **String**| The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias.  | [optional] 
 **PropagateMode** | **String**| Which message(s) should be edited: just the one indicated in &#x60;message_id&#x60;, messages in the same topic that had been sent after this one, or all of them.  Only the default value of &#x60;change_one&#x60; is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic.  | [optional] [default to &quot;change_one&quot;]
 **SendNotificationToOldThread** | **Boolean**| Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9).  | [optional] [default to $true]
 **SendNotificationToNewThread** | **Boolean**| Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9).  | [optional] [default to $true]
 **Content** | **String**| The content of the message. Maximum message size of 10000 bytes.  | [optional] 
 **StreamId** | **Int32**| The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Update-MessageFlags"></a>
# **Update-MessageFlags**
> JsonSuccessBase Update-MessageFlags<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Messages] <System.Nullable[Int32][]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Op] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Flag] <String><br>

Update personal message flags

Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 

### Example
```powershell
$Messages = 0 # Int32[] | An array containing the IDs of the target messages. 
$Op = "add" # String | Whether to `add` the flag or `remove` it. 
$Flag = "read" # String | The flag that should be added/removed. 

# Update personal message flags
try {
    $Result = Update-MessageFlags -Messages $Messages -Op $Op -Flag $Flag
} catch {
    Write-Host ("Exception occured when calling Update-MessageFlags: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Messages** | [**Int32[]**](Int32.md)| An array containing the IDs of the target messages.  | 
 **Op** | **String**| Whether to &#x60;add&#x60; the flag or &#x60;remove&#x60; it.  | 
 **Flag** | **String**| The flag that should be added/removed.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Invoke-UploadFile"></a>
# **Invoke-UploadFile**
> JsonSuccessBase Invoke-UploadFile<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Filename] <System.IO.FileInfo><br>

Upload a file

Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 

### Example
```powershell
$Filename =  # System.IO.FileInfo |  (optional)

# Upload a file
try {
    $Result = Invoke-UploadFile -Filename $Filename
} catch {
    Write-Host ("Exception occured when calling Invoke-UploadFile: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Filename** | **System.IO.FileInfo****System.IO.FileInfo**|  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

