# STREAMS_API

All URIs are relative to *https://example.zulipchat.com/api/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**archive_stream**](STREAMS_API.md#archive_stream) | **Delete** /streams/{stream_id} | Archive a stream
[**create_big_blue_button_video_call**](STREAMS_API.md#create_big_blue_button_video_call) | **Get** /calls/bigbluebutton/create | Create BigBlueButton video call
[**delete_topic**](STREAMS_API.md#delete_topic) | **Post** /streams/{stream_id}/delete_topic | Delete a topic
[**mute_topic**](STREAMS_API.md#mute_topic) | **Patch** /users/me/subscriptions/muted_topics | Topic muting
[**stream_id**](STREAMS_API.md#stream_id) | **Get** /get_stream_id | Get stream ID
[**stream_topics**](STREAMS_API.md#stream_topics) | **Get** /users/me/{stream_id}/topics | Get topics in a stream
[**streams**](STREAMS_API.md#streams) | **Get** /streams | Get all streams
[**subscribe**](STREAMS_API.md#subscribe) | **Post** /users/me/subscriptions | Subscribe to a stream
[**subscribers**](STREAMS_API.md#subscribers) | **Get** /streams/{stream_id}/members | Get the subscribers of a stream
[**subscription_status**](STREAMS_API.md#subscription_status) | **Get** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
[**subscriptions**](STREAMS_API.md#subscriptions) | **Get** /users/me/subscriptions | Get subscribed streams
[**unsubscribe**](STREAMS_API.md#unsubscribe) | **Delete** /users/me/subscriptions | Unsubscribe from a stream
[**update_stream**](STREAMS_API.md#update_stream) | **Patch** /streams/{stream_id} | Update a stream
[**update_subscription_settings**](STREAMS_API.md#update_subscription_settings) | **Post** /users/me/subscriptions/properties | Update subscription settings
[**update_subscriptions**](STREAMS_API.md#update_subscriptions) | **Patch** /users/me/subscriptions | Update subscriptions


# **archive_stream**
> archive_stream (stream_id: INTEGER_32 ): detachable JSON_SUCCESS
	

Archive a stream

[Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream_id** | **INTEGER_32**| The ID of the stream to access.  | [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_big_blue_button_video_call**
> create_big_blue_button_video_call : detachable JSON_SUCCESS_BASE
	

Create BigBlueButton video call

Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 


### Parameters
This endpoint does not need any parameter.

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_topic**
> delete_topic (stream_id: INTEGER_32 ; topic_name: STRING_32 ): detachable JSON_SUCCESS
	

Delete a topic

Delete all messages in a topic.  `POST {{ api_url }}/v1/streams/{stream_id}/delete_topic`  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream_id** | **INTEGER_32**| The ID of the stream to access.  | [default to null]
 **topic_name** | **STRING_32**| The name of the topic to delete.  | [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mute_topic**
> mute_topic (topic: STRING_32 ; op: STRING_32 ; stream:  detachable STRING_32 ; stream_id:  detachable INTEGER_32 ): detachable JSON_SUCCESS
	

Topic muting

This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topic** | **STRING_32**| The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic.  | [default to null]
 **op** | **STRING_32**| Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic.  | [default to null]
 **stream** | **STRING_32**| The name of the stream to access.  | [optional] [default to null]
 **stream_id** | **INTEGER_32**| The ID of the stream to access.  | [optional] [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **stream_id**
> stream_id (stream: STRING_32 ): detachable JSON_SUCCESS_BASE
	

Get stream ID

Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream** | **STRING_32**| The name of the stream to access.  | [default to null]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **stream_topics**
> stream_topics (stream_id: INTEGER_32 ): detachable JSON_SUCCESS_BASE
	

Get topics in a stream

Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream_id** | **INTEGER_32**| The ID of the stream to access.  | [default to null]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **streams**
> streams (include_public:  detachable BOOLEAN ; include_web_public:  detachable BOOLEAN ; include_subscribed:  detachable BOOLEAN ; include_all_active:  detachable BOOLEAN ; include_default:  detachable BOOLEAN ; include_owner_subscribed:  detachable BOOLEAN ): detachable JSON_SUCCESS_BASE
	

Get all streams

Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include_public** | **BOOLEAN**| Include all public streams.  | [optional] [default to true]
 **include_web_public** | **BOOLEAN**| Include all web public streams.  | [optional] [default to false]
 **include_subscribed** | **BOOLEAN**| Include all streams that the user is subscribed to.  | [optional] [default to true]
 **include_all_active** | **BOOLEAN**| Include all active streams. The user must have administrative privileges to use this parameter.  | [optional] [default to false]
 **include_default** | **BOOLEAN**| Include all default streams for the user&#39;s realm.  | [optional] [default to false]
 **include_owner_subscribed** | **BOOLEAN**| If the user is a bot, include all streams that the bot&#39;s owner is subscribed to.  | [optional] [default to false]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **subscribe**
> subscribe (subscriptions: LIST [ANY] ; principals:  detachable LIST [ONE_OFSTRINGINTEGER] ; authorization_errors_fatal:  detachable BOOLEAN ; announce:  detachable BOOLEAN ; invite_only:  detachable BOOLEAN ; history_public_to_subscribers:  detachable BOOLEAN ; stream_post_policy:  detachable INTEGER_32 ; message_retention_days:  detachable ONE_OFSTRINGINTEGER ): detachable ONE_OFOBJECTOBJECT
	

Subscribe to a stream

Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | [**LIST [ANY]**](ANY.md)| A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value.  | [default to null]
 **principals** | [**LIST [ONE_OFSTRINGINTEGER]**](ONE_OFSTRINGINTEGER.md)| A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | [optional] [default to null]
 **authorization_errors_fatal** | **BOOLEAN**| A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key.  | [optional] [default to true]
 **announce** | **BOOLEAN**| If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation.  | [optional] [default to false]
 **invite_only** | **BOOLEAN**| As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  | [optional] [default to false]
 **history_public_to_subscribers** | **BOOLEAN**| Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | [optional] [default to null]
 **stream_post_policy** | **INTEGER_32**| Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] [default to 1]
 **message_retention_days** | [**ONE_OFSTRINGINTEGER**](.md)| Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional] [default to null]

### Return type

[**ONE_OFOBJECTOBJECT**](oneOf&lt;object,object&gt;.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **subscribers**
> subscribers (stream_id: INTEGER_32 ): detachable JSON_SUCCESS_BASE
	

Get the subscribers of a stream

Get all users subscribed to a stream.  `Get {{ api_url }}/v1/streams/{stream_id}/members` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream_id** | **INTEGER_32**| The ID of the stream to access.  | [default to null]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **subscription_status**
> subscription_status (user_id: INTEGER_32 ; stream_id: INTEGER_32 ): detachable JSON_SUCCESS_BASE
	

Get subscription status

Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **INTEGER_32**| The target user&#39;s ID.  | [default to null]
 **stream_id** | **INTEGER_32**| The ID of the stream to access.  | [default to null]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **subscriptions**
> subscriptions (include_subscribers:  detachable BOOLEAN ): detachable JSON_SUCCESS_BASE
	

Get subscribed streams

Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include_subscribers** | **BOOLEAN**| Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  | [optional] [default to false]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unsubscribe**
> unsubscribe (subscriptions: LIST [STRING_32] ; principals:  detachable LIST [ONE_OFSTRINGINTEGER] ): detachable JSON_SUCCESS_BASE
	

Unsubscribe from a stream

Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | [**LIST [STRING_32]**](STRING_32.md)| A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API.  | [default to null]
 **principals** | [**LIST [ONE_OFSTRINGINTEGER]**](ONE_OFSTRINGINTEGER.md)| A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | [optional] [default to null]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_stream**
> update_stream (stream_id: INTEGER_32 ; description:  detachable STRING_32 ; new_name:  detachable STRING_32 ; is_private:  detachable BOOLEAN ; is_announcement_only:  detachable BOOLEAN ; stream_post_policy:  detachable INTEGER_32 ; history_public_to_subscribers:  detachable BOOLEAN ; message_retention_days:  detachable ONE_OFSTRINGINTEGER ): detachable JSON_SUCCESS
	

Update a stream

Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream_id** | **INTEGER_32**| The ID of the stream to access.  | [default to null]
 **description** | **STRING_32**| The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | [optional] [default to null]
 **new_name** | **STRING_32**| The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | [optional] [default to null]
 **is_private** | **BOOLEAN**| Change whether the stream is a private stream.  | [optional] [default to null]
 **is_announcement_only** | **BOOLEAN**| Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead.  | [optional] [default to null]
 **stream_post_policy** | **INTEGER_32**| Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] [default to 1]
 **history_public_to_subscribers** | **BOOLEAN**| Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | [optional] [default to null]
 **message_retention_days** | [**ONE_OFSTRINGINTEGER**](.md)| Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional] [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_subscription_settings**
> update_subscription_settings (subscription_data: LIST [ANY] ): detachable JSON_SUCCESS_BASE
	

Update subscription settings

This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscription_data** | [**LIST [ANY]**](ANY.md)| A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream.  | [default to null]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_subscriptions**
> update_subscriptions (delete:  detachable LIST [STRING_32] ; add:  detachable LIST [ANY] ): detachable JSON_SUCCESS_BASE
	

Update subscriptions

Update which streams you are are subscribed to. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete** | [**LIST [STRING_32]**](STRING_32.md)| A list of stream names to unsubscribe from.  | [optional] [default to null]
 **add** | [**LIST [ANY]**](ANY.md)| A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  | [optional] [default to null]

### Return type

[**JSON_SUCCESS_BASE**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

