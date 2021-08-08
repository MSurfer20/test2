# StreamsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ArchiveStream**](StreamsApi.md#ArchiveStream) | **DELETE** /streams/{stream_id} | Archive a stream
[**CreateBigBlueButtonVideoCall**](StreamsApi.md#CreateBigBlueButtonVideoCall) | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
[**DeleteTopic**](StreamsApi.md#DeleteTopic) | **POST** /streams/{stream_id}/delete_topic | Delete a topic
[**GetStreamId**](StreamsApi.md#GetStreamId) | **GET** /get_stream_id | Get stream ID
[**GetStreamTopics**](StreamsApi.md#GetStreamTopics) | **GET** /users/me/{stream_id}/topics | Get topics in a stream
[**GetStreams**](StreamsApi.md#GetStreams) | **GET** /streams | Get all streams
[**GetSubscribers**](StreamsApi.md#GetSubscribers) | **GET** /streams/{stream_id}/members | Get the subscribers of a stream
[**GetSubscriptionStatus**](StreamsApi.md#GetSubscriptionStatus) | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
[**GetSubscriptions**](StreamsApi.md#GetSubscriptions) | **GET** /users/me/subscriptions | Get subscribed streams
[**MuteTopic**](StreamsApi.md#MuteTopic) | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
[**Subscribe**](StreamsApi.md#Subscribe) | **POST** /users/me/subscriptions | Subscribe to a stream
[**Unsubscribe**](StreamsApi.md#Unsubscribe) | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
[**UpdateStream**](StreamsApi.md#UpdateStream) | **PATCH** /streams/{stream_id} | Update a stream
[**UpdateSubscriptionSettings**](StreamsApi.md#UpdateSubscriptionSettings) | **POST** /users/me/subscriptions/properties | Update subscription settings
[**UpdateSubscriptions**](StreamsApi.md#UpdateSubscriptions) | **PATCH** /users/me/subscriptions | Update subscriptions


# **ArchiveStream**
> JsonSuccess ArchiveStream(stream.id)

Archive a stream

[Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 

### Example
```R
library(openapi)

var.stream.id <- 1 # integer | The ID of the stream to access. 

#Archive a stream
api.instance <- StreamsApi$new()
result <- api.instance$ArchiveStream(var.stream.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream.id** | **integer**| The ID of the stream to access.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **CreateBigBlueButtonVideoCall**
> JsonSuccessBase CreateBigBlueButtonVideoCall()

Create BigBlueButton video call

Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 

### Example
```R
library(openapi)


#Create BigBlueButton video call
api.instance <- StreamsApi$new()
result <- api.instance$CreateBigBlueButtonVideoCall()
dput(result)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

# **DeleteTopic**
> JsonSuccess DeleteTopic(stream.id, topic.name)

Delete a topic

Delete all messages in a topic.  `POST {{ api_url }}/v1/streams/{stream_id}/delete_topic`  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. 

### Example
```R
library(openapi)

var.stream.id <- 1 # integer | The ID of the stream to access. 
var.topic.name <- 'new coffee machine' # character | The name of the topic to delete. 

#Delete a topic
api.instance <- StreamsApi$new()
result <- api.instance$DeleteTopic(var.stream.id, var.topic.name)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream.id** | **integer**| The ID of the stream to access.  | 
 **topic.name** | **character**| The name of the topic to delete.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Error. |  -  |

# **GetStreamId**
> JsonSuccessBase GetStreamId(stream)

Get stream ID

Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 

### Example
```R
library(openapi)

var.stream <- 'Denmark' # character | The name of the stream to access. 

#Get stream ID
api.instance <- StreamsApi$new()
result <- api.instance$GetStreamId(var.stream)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream** | **character**| The name of the stream to access.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **GetStreamTopics**
> JsonSuccessBase GetStreamTopics(stream.id)

Get topics in a stream

Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 

### Example
```R
library(openapi)

var.stream.id <- 1 # integer | The ID of the stream to access. 

#Get topics in a stream
api.instance <- StreamsApi$new()
result <- api.instance$GetStreamTopics(var.stream.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream.id** | **integer**| The ID of the stream to access.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **GetStreams**
> JsonSuccessBase GetStreams(include.public=TRUE, include.web.public=FALSE, include.subscribed=TRUE, include.all.active=FALSE, include.default=FALSE, include.owner.subscribed=FALSE)

Get all streams

Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 

### Example
```R
library(openapi)

var.include.public <- TRUE # character | Include all public streams. 
var.include.web.public <- FALSE # character | Include all web public streams. 
var.include.subscribed <- TRUE # character | Include all streams that the user is subscribed to. 
var.include.all.active <- FALSE # character | Include all active streams. The user must have administrative privileges to use this parameter. 
var.include.default <- FALSE # character | Include all default streams for the user's realm. 
var.include.owner.subscribed <- FALSE # character | If the user is a bot, include all streams that the bot's owner is subscribed to. 

#Get all streams
api.instance <- StreamsApi$new()
result <- api.instance$GetStreams(include.public=var.include.public, include.web.public=var.include.web.public, include.subscribed=var.include.subscribed, include.all.active=var.include.all.active, include.default=var.include.default, include.owner.subscribed=var.include.owner.subscribed)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include.public** | **character**| Include all public streams.  | [optional] [default to TRUE]
 **include.web.public** | **character**| Include all web public streams.  | [optional] [default to FALSE]
 **include.subscribed** | **character**| Include all streams that the user is subscribed to.  | [optional] [default to TRUE]
 **include.all.active** | **character**| Include all active streams. The user must have administrative privileges to use this parameter.  | [optional] [default to FALSE]
 **include.default** | **character**| Include all default streams for the user&#39;s realm.  | [optional] [default to FALSE]
 **include.owner.subscribed** | **character**| If the user is a bot, include all streams that the bot&#39;s owner is subscribed to.  | [optional] [default to FALSE]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **GetSubscribers**
> JsonSuccessBase GetSubscribers(stream.id)

Get the subscribers of a stream

Get all users subscribed to a stream.  `Get {{ api_url }}/v1/streams/{stream_id}/members` 

### Example
```R
library(openapi)

var.stream.id <- 1 # integer | The ID of the stream to access. 

#Get the subscribers of a stream
api.instance <- StreamsApi$new()
result <- api.instance$GetSubscribers(var.stream.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream.id** | **integer**| The ID of the stream to access.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **GetSubscriptionStatus**
> JsonSuccessBase GetSubscriptionStatus(user.id, stream.id)

Get subscription status

Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 

### Example
```R
library(openapi)

var.user.id <- 12 # integer | The target user's ID. 
var.stream.id <- 1 # integer | The ID of the stream to access. 

#Get subscription status
api.instance <- StreamsApi$new()
result <- api.instance$GetSubscriptionStatus(var.user.id, var.stream.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user.id** | **integer**| The target user&#39;s ID.  | 
 **stream.id** | **integer**| The ID of the stream to access.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

# **GetSubscriptions**
> JsonSuccessBase GetSubscriptions(include.subscribers=FALSE)

Get subscribed streams

Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 

### Example
```R
library(openapi)

var.include.subscribers <- FALSE # character | Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0. 

#Get subscribed streams
api.instance <- StreamsApi$new()
result <- api.instance$GetSubscriptions(include.subscribers=var.include.subscribers)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include.subscribers** | **character**| Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  | [optional] [default to FALSE]

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

# **MuteTopic**
> JsonSuccess MuteTopic(topic, op, stream=var.stream, stream.id=var.stream.id)

Topic muting

This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 

### Example
```R
library(openapi)

var.topic <- 'dinner' # character | The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. 
var.op <- 'add' # character | Whether to mute (`add`) or unmute (`remove`) the provided topic. 
var.stream <- 'Denmark' # character | The name of the stream to access. 
var.stream.id <- 42 # integer | The ID of the stream to access. 

#Topic muting
api.instance <- StreamsApi$new()
result <- api.instance$MuteTopic(var.topic, var.op, stream=var.stream, stream.id=var.stream.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topic** | **character**| The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic.  | 
 **op** | Enum [add, remove] | Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic.  | 
 **stream** | **character**| The name of the stream to access.  | [optional] 
 **stream.id** | **integer**| The ID of the stream to access.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **Subscribe**
> OneOfobjectobject Subscribe(subscriptions, principals=var.principals, authorization.errors.fatal=TRUE, announce=FALSE, invite.only=FALSE, history.public.to.subscribers=var.history.public.to.subscribers, stream.post.policy=1, message.retention.days=var.message.retention.days)

Subscribe to a stream

Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 

### Example
```R
library(openapi)

var.subscriptions <- list(123) # array[object] | A list of dictionaries containing the key `name` and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key `description` with an appropriate value. 
var.principals <- list(TODO) # array[OneOfstringinteger] | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
var.authorization.errors.fatal <- TRUE # character | A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When `True`, an authorization error is reported as such. When set to `False`, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the `unauthorized` key. 
var.announce <- FALSE # character | If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream's creation. 
var.invite.only <- FALSE # character | As described above, this endpoint will create a new stream if passed a stream name that doesn't already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams. 
var.history.public.to.subscribers <- 'false' # character | Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
var.stream.post.policy <- 1 # integer | Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
var.message.retention.days <- TODO # OneOfstringinteger | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 

#Subscribe to a stream
api.instance <- StreamsApi$new()
result <- api.instance$Subscribe(var.subscriptions, principals=var.principals, authorization.errors.fatal=var.authorization.errors.fatal, announce=var.announce, invite.only=var.invite.only, history.public.to.subscribers=var.history.public.to.subscribers, stream.post.policy=var.stream.post.policy, message.retention.days=var.message.retention.days)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | list( **object** )| A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value.  | 
 **principals** | list( [**OneOfstringinteger**](oneOf&lt;string,integer&gt;.md) )| A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | [optional] 
 **authorization.errors.fatal** | **character**| A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key.  | [optional] [default to TRUE]
 **announce** | **character**| If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation.  | [optional] [default to FALSE]
 **invite.only** | **character**| As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  | [optional] [default to FALSE]
 **history.public.to.subscribers** | **character**| Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | [optional] 
 **stream.post.policy** | **integer**| Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] [default to 1]
 **message.retention.days** | [**OneOfstringinteger**](.md)| Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional] 

### Return type

[**OneOfobjectobject**](oneOf&lt;object,object&gt;.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Success. |  -  |

# **Unsubscribe**
> JsonSuccessBase Unsubscribe(subscriptions, principals=var.principals)

Unsubscribe from a stream

Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 

### Example
```R
library(openapi)

var.subscriptions <- list("inner_example") # array[character] | A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API. 
var.principals <- list(TODO) # array[OneOfstringinteger] | A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 

#Unsubscribe from a stream
api.instance <- StreamsApi$new()
result <- api.instance$Unsubscribe(var.subscriptions, principals=var.principals)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | list( **character** )| A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API.  | 
 **principals** | list( [**OneOfstringinteger**](oneOf&lt;string,integer&gt;.md) )| A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **UpdateStream**
> JsonSuccess UpdateStream(stream.id, description=var.description, new.name=var.new.name, is.private=var.is.private, is.announcement.only=var.is.announcement.only, stream.post.policy=1, history.public.to.subscribers=var.history.public.to.subscribers, message.retention.days=var.message.retention.days)

Update a stream

Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 

### Example
```R
library(openapi)

var.stream.id <- 1 # integer | The ID of the stream to access. 
var.description <- 'Discuss Italian history and travel destinations.' # character | The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
var.new.name <- 'Italy' # character | The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
var.is.private <- 'true' # character | Change whether the stream is a private stream. 
var.is.announcement.only <- 'true' # character | Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead. 
var.stream.post.policy <- 1 # integer | Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
var.history.public.to.subscribers <- 'false' # character | Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
var.message.retention.days <- TODO # OneOfstringinteger | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 

#Update a stream
api.instance <- StreamsApi$new()
result <- api.instance$UpdateStream(var.stream.id, description=var.description, new.name=var.new.name, is.private=var.is.private, is.announcement.only=var.is.announcement.only, stream.post.policy=var.stream.post.policy, history.public.to.subscribers=var.history.public.to.subscribers, message.retention.days=var.message.retention.days)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream.id** | **integer**| The ID of the stream to access.  | 
 **description** | **character**| The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | [optional] 
 **new.name** | **character**| The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | [optional] 
 **is.private** | **character**| Change whether the stream is a private stream.  | [optional] 
 **is.announcement.only** | **character**| Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead.  | [optional] 
 **stream.post.policy** | **integer**| Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] [default to 1]
 **history.public.to.subscribers** | **character**| Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | [optional] 
 **message.retention.days** | [**OneOfstringinteger**](.md)| Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **UpdateSubscriptionSettings**
> JsonSuccessBase UpdateSubscriptionSettings(subscription.data)

Update subscription settings

This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 

### Example
```R
library(openapi)

var.subscription.data <- list(123) # array[object] | A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream. 

#Update subscription settings
api.instance <- StreamsApi$new()
result <- api.instance$UpdateSubscriptionSettings(var.subscription.data)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscription.data** | list( **object** )| A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

# **UpdateSubscriptions**
> JsonSuccessBase UpdateSubscriptions(delete=var.delete, add=var.add)

Update subscriptions

Update which streams you are are subscribed to. 

### Example
```R
library(openapi)

var.delete <- list("inner_example") # array[character] | A list of stream names to unsubscribe from. 
var.add <- list(123) # array[object] | A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. 

#Update subscriptions
api.instance <- StreamsApi$new()
result <- api.instance$UpdateSubscriptions(delete=var.delete, add=var.add)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete** | list( **character** )| A list of stream names to unsubscribe from.  | [optional] 
 **add** | list( **object** )| A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

