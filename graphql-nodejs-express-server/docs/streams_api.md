# streams_api

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ArchiveStream**](streams_api.md#ArchiveStream) | **DELETE** /streams/{stream_id} | Archive a stream
[**CreateBigBlueButtonVideoCall**](streams_api.md#CreateBigBlueButtonVideoCall) | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
[**GetStreamId**](streams_api.md#GetStreamId) | **GET** /get_stream_id | Get stream ID
[**GetStreamTopics**](streams_api.md#GetStreamTopics) | **GET** /users/me/{stream_id}/topics | Get topics in a stream
[**GetStreams**](streams_api.md#GetStreams) | **GET** /streams | Get all streams
[**GetSubscriptionStatus**](streams_api.md#GetSubscriptionStatus) | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
[**GetSubscriptions**](streams_api.md#GetSubscriptions) | **GET** /users/me/subscriptions | Get subscribed streams
[**MuteTopic**](streams_api.md#MuteTopic) | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
[**Subscribe**](streams_api.md#Subscribe) | **POST** /users/me/subscriptions | Subscribe to a stream
[**Unsubscribe**](streams_api.md#Unsubscribe) | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
[**UpdateStream**](streams_api.md#UpdateStream) | **PATCH** /streams/{stream_id} | Update a stream
[**UpdateSubscriptionSettings**](streams_api.md#UpdateSubscriptionSettings) | **POST** /users/me/subscriptions/properties | Update subscription settings
[**UpdateSubscriptions**](streams_api.md#UpdateSubscriptions) | **PATCH** /users/me/subscriptions | Update subscriptions


<a name="ArchiveStream"></a>
# **ArchiveStream**
> JsonSuccess ArchiveStream(streamId)

Archive a stream

[Archive the stream](/help/archive-a-stream) with the ID &#x60;stream_id&#x60;.  &#x60;DELETE {{ api_url }}/v1/streams/{stream_id}&#x60; 
<a name="CreateBigBlueButtonVideoCall"></a>
# **CreateBigBlueButtonVideoCall**
> JsonSuccessBase CreateBigBlueButtonVideoCall()

Create BigBlueButton video call

Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
<a name="GetStreamId"></a>
# **GetStreamId**
> JsonSuccessBase GetStreamId(stream)

Get stream ID

Get the unique ID of a given stream.  &#x60;GET {{ api_url }}/v1/get_stream_id&#x60; 
<a name="GetStreamTopics"></a>
# **GetStreamTopics**
> JsonSuccessBase GetStreamTopics(streamId)

Get topics in a stream

Get all the topics in a specific stream  &#x60;GET {{ api_url }}/v1/users/me/{stream_id}/topics&#x60; 
<a name="GetStreams"></a>
# **GetStreams**
> JsonSuccessBase GetStreams(includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed)

Get all streams

Get all streams that the user has access to.  &#x60;GET {{ api_url }}/v1/streams&#x60; 
<a name="GetSubscriptionStatus"></a>
# **GetSubscriptionStatus**
> JsonSuccessBase GetSubscriptionStatus(userId, streamId)

Get subscription status

Check whether a user is subscribed to a stream.  &#x60;GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}&#x60;  **Changes**: New in Zulip 3.0 (feature level 11). 
<a name="GetSubscriptions"></a>
# **GetSubscriptions**
> JsonSuccessBase GetSubscriptions(includeSubscribers)

Get subscribed streams

Get all streams that the user is subscribed to.  &#x60;GET {{ api_url }}/v1/users/me/subscriptions&#x60; 
<a name="MuteTopic"></a>
# **MuteTopic**
> JsonSuccess MuteTopic(topic, op, stream, streamId)

Topic muting

This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user&#39;s unread count totals.  &#x60;PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics&#x60; 
<a name="Subscribe"></a>
# **Subscribe**
> OneOfobjectobject Subscribe(subscriptions, principals, authorizationErrorsFatal, announce, inviteOnly, historyPublicToSubscribers, streamPostPolicy, messageRetentionDays)

Subscribe to a stream

Subscribe one or more users to one or more streams.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions&#x60;  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like &#x60;invite_only&#x60; detailed below. 
<a name="Unsubscribe"></a>
# **Unsubscribe**
> JsonSuccessBase Unsubscribe(subscriptions, principals)

Unsubscribe from a stream

Unsubscribe yourself or other users from one or more streams.  &#x60;DELETE {{ api_url }}/v1/users/me/subscriptions&#x60; 
<a name="UpdateStream"></a>
# **UpdateStream**
> JsonSuccess UpdateStream(streamId, description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays)

Update a stream

Configure the stream with the ID &#x60;stream_id&#x60;.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  &#x60;PATCH {{ api_url }}/v1/streams/{stream_id}&#x60; 
<a name="UpdateSubscriptionSettings"></a>
# **UpdateSubscriptionSettings**
> JsonSuccessBase UpdateSubscriptionSettings(subscriptionData)

Update subscription settings

This endpoint is used to update the user&#39;s personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions/properties&#x60; 
<a name="UpdateSubscriptions"></a>
# **UpdateSubscriptions**
> JsonSuccessBase UpdateSubscriptions(delete, add)

Update subscriptions

Update which streams you are are subscribed to. 
