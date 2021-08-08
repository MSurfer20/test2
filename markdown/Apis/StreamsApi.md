# StreamsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveStream**](StreamsApi.md#archiveStream) | **DELETE** /streams/{stream_id} | Archive a stream
[**createBigBlueButtonVideoCall**](StreamsApi.md#createBigBlueButtonVideoCall) | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
[**deleteTopic**](StreamsApi.md#deleteTopic) | **POST** /streams/{stream_id}/delete_topic | Delete a topic
[**getStreamId**](StreamsApi.md#getStreamId) | **GET** /get_stream_id | Get stream ID
[**getStreamTopics**](StreamsApi.md#getStreamTopics) | **GET** /users/me/{stream_id}/topics | Get topics in a stream
[**getStreams**](StreamsApi.md#getStreams) | **GET** /streams | Get all streams
[**getSubscribers**](StreamsApi.md#getSubscribers) | **GET** /streams/{stream_id}/members | Get the subscribers of a stream
[**getSubscriptionStatus**](StreamsApi.md#getSubscriptionStatus) | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
[**getSubscriptions**](StreamsApi.md#getSubscriptions) | **GET** /users/me/subscriptions | Get subscribed streams
[**muteTopic**](StreamsApi.md#muteTopic) | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
[**subscribe**](StreamsApi.md#subscribe) | **POST** /users/me/subscriptions | Subscribe to a stream
[**unsubscribe**](StreamsApi.md#unsubscribe) | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
[**updateStream**](StreamsApi.md#updateStream) | **PATCH** /streams/{stream_id} | Update a stream
[**updateSubscriptionSettings**](StreamsApi.md#updateSubscriptionSettings) | **POST** /users/me/subscriptions/properties | Update subscription settings
[**updateSubscriptions**](StreamsApi.md#updateSubscriptions) | **PATCH** /users/me/subscriptions | Update subscriptions


<a name="archiveStream"></a>
# **archiveStream**
> JsonSuccess archiveStream(stream\_id)

Archive a stream

    [Archive the stream](/help/archive-a-stream) with the ID &#x60;stream_id&#x60;.  &#x60;DELETE {{ api_url }}/v1/streams/{stream_id}&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream\_id** | **Integer**| The ID of the stream to access.  | [default to null]

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="createBigBlueButtonVideoCall"></a>
# **createBigBlueButtonVideoCall**
> JsonSuccessBase createBigBlueButtonVideoCall()

Create BigBlueButton video call

    Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteTopic"></a>
# **deleteTopic**
> JsonSuccess deleteTopic(stream\_id, topic\_name)

Delete a topic

    Delete all messages in a topic.  &#x60;POST {{ api_url }}/v1/streams/{stream_id}/delete_topic&#x60;  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream\_id** | **Integer**| The ID of the stream to access.  | [default to null]
 **topic\_name** | **String**| The name of the topic to delete.  | [default to null]

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getStreamId"></a>
# **getStreamId**
> JsonSuccessBase getStreamId(stream)

Get stream ID

    Get the unique ID of a given stream.  &#x60;GET {{ api_url }}/v1/get_stream_id&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream** | **String**| The name of the stream to access.  | [default to null]

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getStreamTopics"></a>
# **getStreamTopics**
> JsonSuccessBase getStreamTopics(stream\_id)

Get topics in a stream

    Get all the topics in a specific stream  &#x60;GET {{ api_url }}/v1/users/me/{stream_id}/topics&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream\_id** | **Integer**| The ID of the stream to access.  | [default to null]

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getStreams"></a>
# **getStreams**
> JsonSuccessBase getStreams(include\_public, include\_web\_public, include\_subscribed, include\_all\_active, include\_default, include\_owner\_subscribed)

Get all streams

    Get all streams that the user has access to.  &#x60;GET {{ api_url }}/v1/streams&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include\_public** | **Boolean**| Include all public streams.  | [optional] [default to true]
 **include\_web\_public** | **Boolean**| Include all web public streams.  | [optional] [default to false]
 **include\_subscribed** | **Boolean**| Include all streams that the user is subscribed to.  | [optional] [default to true]
 **include\_all\_active** | **Boolean**| Include all active streams. The user must have administrative privileges to use this parameter.  | [optional] [default to false]
 **include\_default** | **Boolean**| Include all default streams for the user&#39;s realm.  | [optional] [default to false]
 **include\_owner\_subscribed** | **Boolean**| If the user is a bot, include all streams that the bot&#39;s owner is subscribed to.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getSubscribers"></a>
# **getSubscribers**
> JsonSuccessBase getSubscribers(stream\_id)

Get the subscribers of a stream

    Get all users subscribed to a stream.  &#x60;Get {{ api_url }}/v1/streams/{stream_id}/members&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream\_id** | **Integer**| The ID of the stream to access.  | [default to null]

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getSubscriptionStatus"></a>
# **getSubscriptionStatus**
> JsonSuccessBase getSubscriptionStatus(user\_id, stream\_id)

Get subscription status

    Check whether a user is subscribed to a stream.  &#x60;GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}&#x60;  **Changes**: New in Zulip 3.0 (feature level 11). 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user\_id** | **Integer**| The target user&#39;s ID.  | [default to null]
 **stream\_id** | **Integer**| The ID of the stream to access.  | [default to null]

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getSubscriptions"></a>
# **getSubscriptions**
> JsonSuccessBase getSubscriptions(include\_subscribers)

Get subscribed streams

    Get all streams that the user is subscribed to.  &#x60;GET {{ api_url }}/v1/users/me/subscriptions&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include\_subscribers** | **Boolean**| Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  | [optional] [default to false]

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="muteTopic"></a>
# **muteTopic**
> JsonSuccess muteTopic(topic, op, stream, stream\_id)

Topic muting

    This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user&#39;s unread count totals.  &#x60;PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topic** | **String**| The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic.  | [default to null]
 **op** | **String**| Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic.  | [default to null] [enum: add, remove]
 **stream** | **String**| The name of the stream to access.  | [optional] [default to null]
 **stream\_id** | **Integer**| The ID of the stream to access.  | [optional] [default to null]

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="subscribe"></a>
# **subscribe**
> oneOf&lt;object,object&gt; subscribe(subscriptions, principals, authorization\_errors\_fatal, announce, invite\_only, history\_public\_to\_subscribers, stream\_post\_policy, message\_retention\_days)

Subscribe to a stream

    Subscribe one or more users to one or more streams.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions&#x60;  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like &#x60;invite_only&#x60; detailed below. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | [**List**](../Models/Object.md)| A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value.  | [default to null]
 **principals** | [**List**](../Models/oneOf&lt;string,integer&gt;.md)| A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | [optional] [default to null]
 **authorization\_errors\_fatal** | **Boolean**| A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key.  | [optional] [default to true]
 **announce** | **Boolean**| If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation.  | [optional] [default to false]
 **invite\_only** | **Boolean**| As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  | [optional] [default to false]
 **history\_public\_to\_subscribers** | **Boolean**| Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | [optional] [default to null]
 **stream\_post\_policy** | **Integer**| Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] [default to 1]
 **message\_retention\_days** | [**oneOf&lt;string,integer&gt;**](../Models/.md)| Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional] [default to null]

### Return type

[**oneOf&lt;object,object&gt;**](../Models/oneOf&lt;object,object&gt;.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="unsubscribe"></a>
# **unsubscribe**
> JsonSuccessBase unsubscribe(subscriptions, principals)

Unsubscribe from a stream

    Unsubscribe yourself or other users from one or more streams.  &#x60;DELETE {{ api_url }}/v1/users/me/subscriptions&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | [**List**](../Models/String.md)| A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API.  | [default to null]
 **principals** | [**List**](../Models/oneOf&lt;string,integer&gt;.md)| A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | [optional] [default to null]

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updateStream"></a>
# **updateStream**
> JsonSuccess updateStream(stream\_id, description, new\_name, is\_private, is\_announcement\_only, stream\_post\_policy, history\_public\_to\_subscribers, message\_retention\_days)

Update a stream

    Configure the stream with the ID &#x60;stream_id&#x60;.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  &#x60;PATCH {{ api_url }}/v1/streams/{stream_id}&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream\_id** | **Integer**| The ID of the stream to access.  | [default to null]
 **description** | **String**| The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | [optional] [default to null]
 **new\_name** | **String**| The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | [optional] [default to null]
 **is\_private** | **Boolean**| Change whether the stream is a private stream.  | [optional] [default to null]
 **is\_announcement\_only** | **Boolean**| Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead.  | [optional] [default to null]
 **stream\_post\_policy** | **Integer**| Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] [default to 1]
 **history\_public\_to\_subscribers** | **Boolean**| Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | [optional] [default to null]
 **message\_retention\_days** | [**oneOf&lt;string,integer&gt;**](../Models/.md)| Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional] [default to null]

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updateSubscriptionSettings"></a>
# **updateSubscriptionSettings**
> JsonSuccessBase updateSubscriptionSettings(subscription\_data)

Update subscription settings

    This endpoint is used to update the user&#39;s personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions/properties&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscription\_data** | [**List**](../Models/Object.md)| A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream.  | [default to null]

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updateSubscriptions"></a>
# **updateSubscriptions**
> JsonSuccessBase updateSubscriptions(delete, add)

Update subscriptions

    Update which streams you are are subscribed to. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete** | [**List**](../Models/String.md)| A list of stream names to unsubscribe from.  | [optional] [default to null]
 **add** | [**List**](../Models/Object.md)| A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  | [optional] [default to null]

### Return type

[**JsonSuccessBase**](../Models/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

