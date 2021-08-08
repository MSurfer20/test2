# PSOpenAPITools.PSOpenAPITools/Api.StreamsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-ArchiveStream**](StreamsApi.md#Invoke-ArchiveStream) | **DELETE** /streams/{stream_id} | Archive a stream
[**New-BigBlueButtonVideoCall**](StreamsApi.md#New-BigBlueButtonVideoCall) | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
[**Get-StreamId**](StreamsApi.md#Get-StreamId) | **GET** /get_stream_id | Get stream ID
[**Get-StreamTopics**](StreamsApi.md#Get-StreamTopics) | **GET** /users/me/{stream_id}/topics | Get topics in a stream
[**Get-Streams**](StreamsApi.md#Get-Streams) | **GET** /streams | Get all streams
[**Get-SubscriptionStatus**](StreamsApi.md#Get-SubscriptionStatus) | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
[**Get-Subscriptions**](StreamsApi.md#Get-Subscriptions) | **GET** /users/me/subscriptions | Get subscribed streams
[**Invoke-MuteTopic**](StreamsApi.md#Invoke-MuteTopic) | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
[**Invoke-Subscribe**](StreamsApi.md#Invoke-Subscribe) | **POST** /users/me/subscriptions | Subscribe to a stream
[**Invoke-Unsubscribe**](StreamsApi.md#Invoke-Unsubscribe) | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
[**Update-Stream**](StreamsApi.md#Update-Stream) | **PATCH** /streams/{stream_id} | Update a stream
[**Update-SubscriptionSettings**](StreamsApi.md#Update-SubscriptionSettings) | **POST** /users/me/subscriptions/properties | Update subscription settings
[**Update-Subscriptions**](StreamsApi.md#Update-Subscriptions) | **PATCH** /users/me/subscriptions | Update subscriptions


<a name="Invoke-ArchiveStream"></a>
# **Invoke-ArchiveStream**
> JsonSuccess Invoke-ArchiveStream<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StreamId] <Int32><br>

Archive a stream

[Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 

### Example
```powershell
$StreamId = 1 # Int32 | The ID of the stream to access. 

# Archive a stream
try {
    $Result = Invoke-ArchiveStream -StreamId $StreamId
} catch {
    Write-Host ("Exception occured when calling Invoke-ArchiveStream: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
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

<a name="New-BigBlueButtonVideoCall"></a>
# **New-BigBlueButtonVideoCall**
> JsonSuccessBase New-BigBlueButtonVideoCall<br>

Create BigBlueButton video call

Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 

### Example
```powershell

# Create BigBlueButton video call
try {
    $Result = New-BigBlueButtonVideoCall
} catch {
    Write-Host ("Exception occured when calling New-BigBlueButtonVideoCall: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-StreamId"></a>
# **Get-StreamId**
> JsonSuccessBase Get-StreamId<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Stream] <String><br>

Get stream ID

Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 

### Example
```powershell
$Stream = "Denmark" # String | The name of the stream to access. 

# Get stream ID
try {
    $Result = Get-StreamId -Stream $Stream
} catch {
    Write-Host ("Exception occured when calling Get-StreamId: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Stream** | **String**| The name of the stream to access.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-StreamTopics"></a>
# **Get-StreamTopics**
> JsonSuccessBase Get-StreamTopics<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StreamId] <Int32><br>

Get topics in a stream

Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 

### Example
```powershell
$StreamId = 1 # Int32 | The ID of the stream to access. 

# Get topics in a stream
try {
    $Result = Get-StreamTopics -StreamId $StreamId
} catch {
    Write-Host ("Exception occured when calling Get-StreamTopics: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **StreamId** | **Int32**| The ID of the stream to access.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-Streams"></a>
# **Get-Streams**
> JsonSuccessBase Get-Streams<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IncludePublic] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IncludeWebPublic] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IncludeSubscribed] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IncludeAllActive] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IncludeDefault] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IncludeOwnerSubscribed] <System.Nullable[Boolean]><br>

Get all streams

Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 

### Example
```powershell
$IncludePublic = $false # Boolean | Include all public streams.  (optional) (default to $true)
$IncludeWebPublic = $true # Boolean | Include all web public streams.  (optional) (default to $false)
$IncludeSubscribed = $false # Boolean | Include all streams that the user is subscribed to.  (optional) (default to $true)
$IncludeAllActive = $true # Boolean | Include all active streams. The user must have administrative privileges to use this parameter.  (optional) (default to $false)
$IncludeDefault = $true # Boolean | Include all default streams for the user's realm.  (optional) (default to $false)
$IncludeOwnerSubscribed = $true # Boolean | If the user is a bot, include all streams that the bot's owner is subscribed to.  (optional) (default to $false)

# Get all streams
try {
    $Result = Get-Streams -IncludePublic $IncludePublic -IncludeWebPublic $IncludeWebPublic -IncludeSubscribed $IncludeSubscribed -IncludeAllActive $IncludeAllActive -IncludeDefault $IncludeDefault -IncludeOwnerSubscribed $IncludeOwnerSubscribed
} catch {
    Write-Host ("Exception occured when calling Get-Streams: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **IncludePublic** | **Boolean**| Include all public streams.  | [optional] [default to $true]
 **IncludeWebPublic** | **Boolean**| Include all web public streams.  | [optional] [default to $false]
 **IncludeSubscribed** | **Boolean**| Include all streams that the user is subscribed to.  | [optional] [default to $true]
 **IncludeAllActive** | **Boolean**| Include all active streams. The user must have administrative privileges to use this parameter.  | [optional] [default to $false]
 **IncludeDefault** | **Boolean**| Include all default streams for the user&#39;s realm.  | [optional] [default to $false]
 **IncludeOwnerSubscribed** | **Boolean**| If the user is a bot, include all streams that the bot&#39;s owner is subscribed to.  | [optional] [default to $false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-SubscriptionStatus"></a>
# **Get-SubscriptionStatus**
> JsonSuccessBase Get-SubscriptionStatus<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserId] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StreamId] <Int32><br>

Get subscription status

Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 

### Example
```powershell
$UserId = 12 # Int32 | The target user's ID. 
$StreamId = 1 # Int32 | The ID of the stream to access. 

# Get subscription status
try {
    $Result = Get-SubscriptionStatus -UserId $UserId -StreamId $StreamId
} catch {
    Write-Host ("Exception occured when calling Get-SubscriptionStatus: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **UserId** | **Int32**| The target user&#39;s ID.  | 
 **StreamId** | **Int32**| The ID of the stream to access.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-Subscriptions"></a>
# **Get-Subscriptions**
> JsonSuccessBase Get-Subscriptions<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IncludeSubscribers] <System.Nullable[Boolean]><br>

Get subscribed streams

Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 

### Example
```powershell
$IncludeSubscribers = $true # Boolean | Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  (optional) (default to $false)

# Get subscribed streams
try {
    $Result = Get-Subscriptions -IncludeSubscribers $IncludeSubscribers
} catch {
    Write-Host ("Exception occured when calling Get-Subscriptions: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **IncludeSubscribers** | **Boolean**| Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  | [optional] [default to $false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Invoke-MuteTopic"></a>
# **Invoke-MuteTopic**
> JsonSuccess Invoke-MuteTopic<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Topic] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Op] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Stream] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StreamId] <System.Nullable[Int32]><br>

Topic muting

This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 

### Example
```powershell
$Topic = "dinner" # String | The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. 
$Op = "add" # String | Whether to mute (`add`) or unmute (`remove`) the provided topic. 
$Stream = "Denmark" # String | The name of the stream to access.  (optional)
$StreamId = 42 # Int32 | The ID of the stream to access.  (optional)

# Topic muting
try {
    $Result = Invoke-MuteTopic -Topic $Topic -Op $Op -Stream $Stream -StreamId $StreamId
} catch {
    Write-Host ("Exception occured when calling Invoke-MuteTopic: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Topic** | **String**| The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic.  | 
 **Op** | **String**| Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic.  | 
 **Stream** | **String**| The name of the stream to access.  | [optional] 
 **StreamId** | **Int32**| The ID of the stream to access.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Invoke-Subscribe"></a>
# **Invoke-Subscribe**
> OneOfobjectobject Invoke-Subscribe<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Subscriptions] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Principals] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AuthorizationErrorsFatal] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Announce] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-InviteOnly] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-HistoryPublicToSubscribers] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StreamPostPolicy] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MessageRetentionDays] <PSCustomObject><br>

Subscribe to a stream

Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 

### Example
```powershell
$Subscriptions =  # SystemCollectionsHashtable[] | A list of dictionaries containing the key `name` and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key `description` with an appropriate value. 
 # OneOfstringinteger[] | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  (optional)
$AuthorizationErrorsFatal = $false # Boolean | A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When `True`, an authorization error is reported as such. When set to `False`, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the `unauthorized` key.  (optional) (default to $true)
$Announce = $true # Boolean | If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream's creation.  (optional) (default to $false)
$InviteOnly = $true # Boolean | As described above, this endpoint will create a new stream if passed a stream name that doesn't already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  (optional) (default to $false)
$HistoryPublicToSubscribers = $false # Boolean | Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  (optional)
$StreamPostPolicy = 2 # Int32 | Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  (optional) (default to 1)
 # OneOfstringinteger | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * ""realm_default"" => Return to the organization-level setting. * ""forever"" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  (optional)

# Subscribe to a stream
try {
    $Result = Invoke-Subscribe -Subscriptions $Subscriptions -Principals $Principals -AuthorizationErrorsFatal $AuthorizationErrorsFatal -Announce $Announce -InviteOnly $InviteOnly -HistoryPublicToSubscribers $HistoryPublicToSubscribers -StreamPostPolicy $StreamPostPolicy -MessageRetentionDays $MessageRetentionDays
} catch {
    Write-Host ("Exception occured when calling Invoke-Subscribe: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Subscriptions** | [**SystemCollectionsHashtable[]**](SystemCollectionsHashtable.md)| A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value.  | 
 **Principals** | [**OneOfstringinteger[]**](OneOfstringinteger.md)| A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | [optional] 
 **AuthorizationErrorsFatal** | **Boolean**| A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key.  | [optional] [default to $true]
 **Announce** | **Boolean**| If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation.  | [optional] [default to $false]
 **InviteOnly** | **Boolean**| As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  | [optional] [default to $false]
 **HistoryPublicToSubscribers** | **Boolean**| Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | [optional] 
 **StreamPostPolicy** | **Int32**| Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] [default to 1]
 **MessageRetentionDays** | [**OneOfstringinteger**](OneOfstringinteger.md)| Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * &quot;&quot;realm_default&quot;&quot; &#x3D;&gt; Return to the organization-level setting. * &quot;&quot;forever&quot;&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional] 

### Return type

[**OneOfobjectobject**](OneOfobjectobject.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Invoke-Unsubscribe"></a>
# **Invoke-Unsubscribe**
> JsonSuccessBase Invoke-Unsubscribe<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Subscriptions] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Principals] <PSCustomObject[]><br>

Unsubscribe from a stream

Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 

### Example
```powershell
$Subscriptions = "MySubscriptions" # String[] | A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API. 
 # OneOfstringinteger[] | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  (optional)

# Unsubscribe from a stream
try {
    $Result = Invoke-Unsubscribe -Subscriptions $Subscriptions -Principals $Principals
} catch {
    Write-Host ("Exception occured when calling Invoke-Unsubscribe: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Subscriptions** | [**String[]**](String.md)| A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API.  | 
 **Principals** | [**OneOfstringinteger[]**](OneOfstringinteger.md)| A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Update-Stream"></a>
# **Update-Stream**
> JsonSuccess Update-Stream<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StreamId] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Description] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-NewName] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IsPrivate] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IsAnnouncementOnly] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StreamPostPolicy] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-HistoryPublicToSubscribers] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MessageRetentionDays] <PSCustomObject><br>

Update a stream

Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 

### Example
```powershell
$StreamId = 1 # Int32 | The ID of the stream to access. 
$Description = "Discuss Italian history and travel destinations." # String | The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  (optional)
$NewName = "Italy" # String | The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  (optional)
$IsPrivate = $true # Boolean | Change whether the stream is a private stream.  (optional)
$IsAnnouncementOnly = $true # Boolean | Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead.  (optional)
$StreamPostPolicy = 2 # Int32 | Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  (optional) (default to 1)
$HistoryPublicToSubscribers = $false # Boolean | Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  (optional)
 # OneOfstringinteger | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * ""realm_default"" => Return to the organization-level setting. * ""forever"" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  (optional)

# Update a stream
try {
    $Result = Update-Stream -StreamId $StreamId -Description $Description -NewName $NewName -IsPrivate $IsPrivate -IsAnnouncementOnly $IsAnnouncementOnly -StreamPostPolicy $StreamPostPolicy -HistoryPublicToSubscribers $HistoryPublicToSubscribers -MessageRetentionDays $MessageRetentionDays
} catch {
    Write-Host ("Exception occured when calling Update-Stream: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **StreamId** | **Int32**| The ID of the stream to access.  | 
 **Description** | **String**| The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | [optional] 
 **NewName** | **String**| The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | [optional] 
 **IsPrivate** | **Boolean**| Change whether the stream is a private stream.  | [optional] 
 **IsAnnouncementOnly** | **Boolean**| Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead.  | [optional] 
 **StreamPostPolicy** | **Int32**| Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] [default to 1]
 **HistoryPublicToSubscribers** | **Boolean**| Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | [optional] 
 **MessageRetentionDays** | [**OneOfstringinteger**](OneOfstringinteger.md)| Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * &quot;&quot;realm_default&quot;&quot; &#x3D;&gt; Return to the organization-level setting. * &quot;&quot;forever&quot;&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Update-SubscriptionSettings"></a>
# **Update-SubscriptionSettings**
> JsonSuccessBase Update-SubscriptionSettings<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SubscriptionData] <PSCustomObject[]><br>

Update subscription settings

This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 

### Example
```powershell
$SubscriptionData =  # SystemCollectionsHashtable[] | A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream. 

# Update subscription settings
try {
    $Result = Update-SubscriptionSettings -SubscriptionData $SubscriptionData
} catch {
    Write-Host ("Exception occured when calling Update-SubscriptionSettings: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **SubscriptionData** | [**SystemCollectionsHashtable[]**](SystemCollectionsHashtable.md)| A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Update-Subscriptions"></a>
# **Update-Subscriptions**
> JsonSuccessBase Update-Subscriptions<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Delete] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Add] <PSCustomObject[]><br>

Update subscriptions

Update which streams you are are subscribed to. 

### Example
```powershell
$Delete = "MyDelete" # String[] | A list of stream names to unsubscribe from.  (optional)
 # SystemCollectionsHashtable[] | A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  (optional)

# Update subscriptions
try {
    $Result = Update-Subscriptions -Delete $Delete -Add $Add
} catch {
    Write-Host ("Exception occured when calling Update-Subscriptions: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Delete** | [**String[]**](String.md)| A list of stream names to unsubscribe from.  | [optional] 
 **Add** | [**SystemCollectionsHashtable[]**](SystemCollectionsHashtable.md)| A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

