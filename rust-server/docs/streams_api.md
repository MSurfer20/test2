# streams_api

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
**archive-stream**](streams_api.md#archive-stream) | **DELETE** /streams/{stream_id} | Archive a stream
**create-big-blue-button-video-call**](streams_api.md#create-big-blue-button-video-call) | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
**delete-topic**](streams_api.md#delete-topic) | **POST** /streams/{stream_id}/delete_topic | Delete a topic
**get-stream-id**](streams_api.md#get-stream-id) | **GET** /get_stream_id | Get stream ID
**get-stream-topics**](streams_api.md#get-stream-topics) | **GET** /users/me/{stream_id}/topics | Get topics in a stream
**get-streams**](streams_api.md#get-streams) | **GET** /streams | Get all streams
**get-subscribers**](streams_api.md#get-subscribers) | **GET** /streams/{stream_id}/members | Get the subscribers of a stream
**get-subscription-status**](streams_api.md#get-subscription-status) | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
**get-subscriptions**](streams_api.md#get-subscriptions) | **GET** /users/me/subscriptions | Get subscribed streams
**mute-topic**](streams_api.md#mute-topic) | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
**subscribe**](streams_api.md#subscribe) | **POST** /users/me/subscriptions | Subscribe to a stream
**unsubscribe**](streams_api.md#unsubscribe) | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
**update-stream**](streams_api.md#update-stream) | **PATCH** /streams/{stream_id} | Update a stream
**update-subscription-settings**](streams_api.md#update-subscription-settings) | **POST** /users/me/subscriptions/properties | Update subscription settings
**update-subscriptions**](streams_api.md#update-subscriptions) | **PATCH** /users/me/subscriptions | Update subscriptions


# **archive-stream**
> JsonSuccess archive-stream(stream_id)
Archive a stream

[Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **stream_id** | **i32**| The ID of the stream to access.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create-big-blue-button-video-call**
> JsonSuccessBase create-big-blue-button-video-call()
Create BigBlueButton video call

Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete-topic**
> JsonSuccess delete-topic(stream_id, topic_name)
Delete a topic

Delete all messages in a topic.  `POST {{ api_url }}/v1/streams/{stream_id}/delete_topic`  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **stream_id** | **i32**| The ID of the stream to access.  | 
  **topic_name** | **String**| The name of the topic to delete.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get-stream-id**
> JsonSuccessBase get-stream-id(stream)
Get stream ID

Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **stream** | **String**| The name of the stream to access.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get-stream-topics**
> JsonSuccessBase get-stream-topics(stream_id)
Get topics in a stream

Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **stream_id** | **i32**| The ID of the stream to access.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get-streams**
> JsonSuccessBase get-streams(optional)
Get all streams

Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include_public** | **bool**| Include all public streams.  | [default to true]
 **include_web_public** | **bool**| Include all web public streams.  | [default to false]
 **include_subscribed** | **bool**| Include all streams that the user is subscribed to.  | [default to true]
 **include_all_active** | **bool**| Include all active streams. The user must have administrative privileges to use this parameter.  | [default to false]
 **include_default** | **bool**| Include all default streams for the user's realm.  | [default to false]
 **include_owner_subscribed** | **bool**| If the user is a bot, include all streams that the bot's owner is subscribed to.  | [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get-subscribers**
> JsonSuccessBase get-subscribers(stream_id)
Get the subscribers of a stream

Get all users subscribed to a stream.  `Get {{ api_url }}/v1/streams/{stream_id}/members` 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **stream_id** | **i32**| The ID of the stream to access.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get-subscription-status**
> JsonSuccessBase get-subscription-status(user_id, stream_id)
Get subscription status

Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **user_id** | **i32**| The target user's ID.  | 
  **stream_id** | **i32**| The ID of the stream to access.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get-subscriptions**
> JsonSuccessBase get-subscriptions(optional)
Get subscribed streams

Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include_subscribers** | **bool**| Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  | [default to false]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mute-topic**
> JsonSuccess mute-topic(topic, op, optional)
Topic muting

This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **topic** | **String**| The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic.  | 
  **op** | **String**| Whether to mute (`add`) or unmute (`remove`) the provided topic.  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topic** | **String**| The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic.  | 
 **op** | **String**| Whether to mute (`add`) or unmute (`remove`) the provided topic.  | 
 **stream** | **String**| The name of the stream to access.  | 
 **stream_id** | **i32**| The ID of the stream to access.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **subscribe**
> swagger::OneOf2<AddSubscriptionsResponse,AddSubscriptionsResponse> subscribe(subscriptions, optional)
Subscribe to a stream

Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **subscriptions** | [**serde_json::Value**](serde_json::Value.md)| A list of dictionaries containing the key `name` and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key `description` with an appropriate value.  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | [**serde_json::Value**](serde_json::Value.md)| A list of dictionaries containing the key `name` and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key `description` with an appropriate value.  | 
 **principals** | [**swagger::OneOf2<String,i32>**](swagger::OneOf2<String,i32>.md)| A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | 
 **authorization_errors_fatal** | **bool**| A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When `True`, an authorization error is reported as such. When set to `False`, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the `unauthorized` key.  | [default to true]
 **announce** | **bool**| If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream's creation.  | [default to false]
 **invite_only** | **bool**| As described above, this endpoint will create a new stream if passed a stream name that doesn't already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  | [default to false]
 **history_public_to_subscribers** | **bool**| Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | 
 **stream_post_policy** | **i32**| Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  | [default to 1]
 **message_retention_days** | [****](.md)| Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | 

### Return type

[**swagger::OneOf2<AddSubscriptionsResponse,AddSubscriptionsResponse>**](swagger::OneOf2<AddSubscriptionsResponse,AddSubscriptionsResponse>.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unsubscribe**
> JsonSuccessBase unsubscribe(subscriptions, optional)
Unsubscribe from a stream

Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **subscriptions** | [**String**](String.md)| A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API.  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | [**String**](String.md)| A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API.  | 
 **principals** | [**swagger::OneOf2<String,i32>**](swagger::OneOf2<String,i32>.md)| A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update-stream**
> JsonSuccess update-stream(stream_id, optional)
Update a stream

Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **stream_id** | **i32**| The ID of the stream to access.  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream_id** | **i32**| The ID of the stream to access.  | 
 **description** | **String**| The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | 
 **new_name** | **String**| The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | 
 **is_private** | **bool**| Change whether the stream is a private stream.  | 
 **is_announcement_only** | **bool**| Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead.  | 
 **stream_post_policy** | **i32**| Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  | [default to 1]
 **history_public_to_subscribers** | **bool**| Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | 
 **message_retention_days** | [****](.md)| Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update-subscription-settings**
> JsonSuccessBase update-subscription-settings(subscription_data)
Update subscription settings

This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **subscription_data** | [**serde_json::Value**](serde_json::Value.md)| A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update-subscriptions**
> JsonSuccessBase update-subscriptions(optional)
Update subscriptions

Update which streams you are are subscribed to. 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete** | [**String**](String.md)| A list of stream names to unsubscribe from.  | 
 **add** | [**serde_json::Value**](serde_json::Value.md)| A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

