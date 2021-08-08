# StreamsAPI

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**StreamsAPI_archiveStream**](StreamsAPI.md#StreamsAPI_archiveStream) | **DELETE** /streams/{stream_id} | Archive a stream
[**StreamsAPI_createBigBlueButtonVideoCall**](StreamsAPI.md#StreamsAPI_createBigBlueButtonVideoCall) | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
[**StreamsAPI_getStreamId**](StreamsAPI.md#StreamsAPI_getStreamId) | **GET** /get_stream_id | Get stream ID
[**StreamsAPI_getStreamTopics**](StreamsAPI.md#StreamsAPI_getStreamTopics) | **GET** /users/me/{stream_id}/topics | Get topics in a stream
[**StreamsAPI_getStreams**](StreamsAPI.md#StreamsAPI_getStreams) | **GET** /streams | Get all streams
[**StreamsAPI_getSubscriptionStatus**](StreamsAPI.md#StreamsAPI_getSubscriptionStatus) | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
[**StreamsAPI_getSubscriptions**](StreamsAPI.md#StreamsAPI_getSubscriptions) | **GET** /users/me/subscriptions | Get subscribed streams
[**StreamsAPI_muteTopic**](StreamsAPI.md#StreamsAPI_muteTopic) | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
[**StreamsAPI_subscribe**](StreamsAPI.md#StreamsAPI_subscribe) | **POST** /users/me/subscriptions | Subscribe to a stream
[**StreamsAPI_unsubscribe**](StreamsAPI.md#StreamsAPI_unsubscribe) | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
[**StreamsAPI_updateStream**](StreamsAPI.md#StreamsAPI_updateStream) | **PATCH** /streams/{stream_id} | Update a stream
[**StreamsAPI_updateSubscriptionSettings**](StreamsAPI.md#StreamsAPI_updateSubscriptionSettings) | **POST** /users/me/subscriptions/properties | Update subscription settings
[**StreamsAPI_updateSubscriptions**](StreamsAPI.md#StreamsAPI_updateSubscriptions) | **PATCH** /users/me/subscriptions | Update subscriptions


# **StreamsAPI_archiveStream**
```c
// Archive a stream
//
// [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 
//
json_success_t* StreamsAPI_archiveStream(apiClient_t *apiClient, int stream_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**stream_id** | **int** | The ID of the stream to access.  | 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StreamsAPI_createBigBlueButtonVideoCall**
```c
// Create BigBlueButton video call
//
// Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
//
json_success_base_t* StreamsAPI_createBigBlueButtonVideoCall(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StreamsAPI_getStreamId**
```c
// Get stream ID
//
// Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 
//
json_success_base_t* StreamsAPI_getStreamId(apiClient_t *apiClient, char * stream);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**stream** | **char \*** | The name of the stream to access.  | 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StreamsAPI_getStreamTopics**
```c
// Get topics in a stream
//
// Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 
//
json_success_base_t* StreamsAPI_getStreamTopics(apiClient_t *apiClient, int stream_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**stream_id** | **int** | The ID of the stream to access.  | 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StreamsAPI_getStreams**
```c
// Get all streams
//
// Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 
//
json_success_base_t* StreamsAPI_getStreams(apiClient_t *apiClient, int include_public, int include_web_public, int include_subscribed, int include_all_active, int include_default, int include_owner_subscribed);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**include_public** | **int** | Include all public streams.  | [optional] [default to true]
**include_web_public** | **int** | Include all web public streams.  | [optional] [default to false]
**include_subscribed** | **int** | Include all streams that the user is subscribed to.  | [optional] [default to true]
**include_all_active** | **int** | Include all active streams. The user must have administrative privileges to use this parameter.  | [optional] [default to false]
**include_default** | **int** | Include all default streams for the user&#39;s realm.  | [optional] [default to false]
**include_owner_subscribed** | **int** | If the user is a bot, include all streams that the bot&#39;s owner is subscribed to.  | [optional] [default to false]

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StreamsAPI_getSubscriptionStatus**
```c
// Get subscription status
//
// Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 
//
json_success_base_t* StreamsAPI_getSubscriptionStatus(apiClient_t *apiClient, int user_id, int stream_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**user_id** | **int** | The target user&#39;s ID.  | 
**stream_id** | **int** | The ID of the stream to access.  | 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StreamsAPI_getSubscriptions**
```c
// Get subscribed streams
//
// Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 
//
json_success_base_t* StreamsAPI_getSubscriptions(apiClient_t *apiClient, int include_subscribers);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**include_subscribers** | **int** | Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  | [optional] [default to false]

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StreamsAPI_muteTopic**
```c
// Topic muting
//
// This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 
//
json_success_t* StreamsAPI_muteTopic(apiClient_t *apiClient, char * topic, zulip_rest_api_muteTopic_op_e op, char * stream, int stream_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**topic** | **char \*** | The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic.  | 
**op** | **zulip_rest_api_muteTopic_op_e** | Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic.  | 
**stream** | **char \*** | The name of the stream to access.  | [optional] 
**stream_id** | **int** | The ID of the stream to access.  | [optional] 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StreamsAPI_subscribe**
```c
// Subscribe to a stream
//
// Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 
//
one_ofobjectobject_t* StreamsAPI_subscribe(apiClient_t *apiClient, list_t * subscriptions, list_t * principals, int authorization_errors_fatal, int announce, int invite_only, int history_public_to_subscribers, int stream_post_policy, one_ofstringinteger_t * message_retention_days);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**subscriptions** | **[list_t](object.md) \*** | A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value.  | 
**principals** | **[list_t](one_ofstringinteger.md) \*** | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | [optional] 
**authorization_errors_fatal** | **int** | A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key.  | [optional] [default to true]
**announce** | **int** | If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation.  | [optional] [default to false]
**invite_only** | **int** | As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  | [optional] [default to false]
**history_public_to_subscribers** | **int** | Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | [optional] 
**stream_post_policy** | **int** | Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] [default to 1]
**message_retention_days** | **[one_ofstringinteger_t](.md) \*** | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional] 

### Return type

[one_ofobjectobject_t](one_ofobjectobject.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StreamsAPI_unsubscribe**
```c
// Unsubscribe from a stream
//
// Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 
//
json_success_base_t* StreamsAPI_unsubscribe(apiClient_t *apiClient, list_t * subscriptions, list_t * principals);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**subscriptions** | **[list_t](char.md) \*** | A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API.  | 
**principals** | **[list_t](one_ofstringinteger.md) \*** | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | [optional] 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StreamsAPI_updateStream**
```c
// Update a stream
//
// Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 
//
json_success_t* StreamsAPI_updateStream(apiClient_t *apiClient, int stream_id, char * description, char * new_name, int is_private, int is_announcement_only, int stream_post_policy, int history_public_to_subscribers, one_ofstringinteger_t * message_retention_days);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**stream_id** | **int** | The ID of the stream to access.  | 
**description** | **char \*** | The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | [optional] 
**new_name** | **char \*** | The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | [optional] 
**is_private** | **int** | Change whether the stream is a private stream.  | [optional] 
**is_announcement_only** | **int** | Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead.  | [optional] 
**stream_post_policy** | **int** | Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] [default to 1]
**history_public_to_subscribers** | **int** | Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | [optional] 
**message_retention_days** | **[one_ofstringinteger_t](.md) \*** | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional] 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StreamsAPI_updateSubscriptionSettings**
```c
// Update subscription settings
//
// This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 
//
json_success_base_t* StreamsAPI_updateSubscriptionSettings(apiClient_t *apiClient, list_t * subscription_data);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**subscription_data** | **[list_t](object.md) \*** | A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream.  | 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StreamsAPI_updateSubscriptions**
```c
// Update subscriptions
//
// Update which streams you are are subscribed to. 
//
json_success_base_t* StreamsAPI_updateSubscriptions(apiClient_t *apiClient, list_t * _delete, list_t * add);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**_delete** | **[list_t](char.md) \*** | A list of stream names to unsubscribe from.  | [optional] 
**add** | **[list_t](object.md) \*** | A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  | [optional] 

### Return type

[json_success_base_t](json_success_base.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

