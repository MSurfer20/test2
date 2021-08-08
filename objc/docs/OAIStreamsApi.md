# OAIStreamsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveStream**](OAIStreamsApi.md#archivestream) | **DELETE** /streams/{stream_id} | Archive a stream
[**createBigBlueButtonVideoCall**](OAIStreamsApi.md#createbigbluebuttonvideocall) | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
[**deleteTopic**](OAIStreamsApi.md#deletetopic) | **POST** /streams/{stream_id}/delete_topic | Delete a topic
[**getStreamId**](OAIStreamsApi.md#getstreamid) | **GET** /get_stream_id | Get stream ID
[**getStreamTopics**](OAIStreamsApi.md#getstreamtopics) | **GET** /users/me/{stream_id}/topics | Get topics in a stream
[**getStreams**](OAIStreamsApi.md#getstreams) | **GET** /streams | Get all streams
[**getSubscribers**](OAIStreamsApi.md#getsubscribers) | **GET** /streams/{stream_id}/members | Get the subscribers of a stream
[**getSubscriptionStatus**](OAIStreamsApi.md#getsubscriptionstatus) | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
[**getSubscriptions**](OAIStreamsApi.md#getsubscriptions) | **GET** /users/me/subscriptions | Get subscribed streams
[**muteTopic**](OAIStreamsApi.md#mutetopic) | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
[**subscribe**](OAIStreamsApi.md#subscribe) | **POST** /users/me/subscriptions | Subscribe to a stream
[**unsubscribe**](OAIStreamsApi.md#unsubscribe) | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
[**updateStream**](OAIStreamsApi.md#updatestream) | **PATCH** /streams/{stream_id} | Update a stream
[**updateSubscriptionSettings**](OAIStreamsApi.md#updatesubscriptionsettings) | **POST** /users/me/subscriptions/properties | Update subscription settings
[**updateSubscriptions**](OAIStreamsApi.md#updatesubscriptions) | **PATCH** /users/me/subscriptions | Update subscriptions


# **archiveStream**
```objc
-(NSURLSessionTask*) archiveStreamWithStreamId: (NSNumber*) streamId
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Archive a stream

[Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 

### Example 
```objc

NSNumber* streamId = 1; // The ID of the stream to access. 

OAIStreamsApi*apiInstance = [[OAIStreamsApi alloc] init];

// Archive a stream
[apiInstance archiveStreamWithStreamId:streamId
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIStreamsApi->archiveStream: %@", error);
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

# **createBigBlueButtonVideoCall**
```objc
-(NSURLSessionTask*) createBigBlueButtonVideoCallWithCompletionHandler: 
        (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Create BigBlueButton video call

Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 

### Example 
```objc


OAIStreamsApi*apiInstance = [[OAIStreamsApi alloc] init];

// Create BigBlueButton video call
[apiInstance createBigBlueButtonVideoCallWithCompletionHandler: 
          ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIStreamsApi->createBigBlueButtonVideoCall: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteTopic**
```objc
-(NSURLSessionTask*) deleteTopicWithStreamId: (NSNumber*) streamId
    topicName: (NSString*) topicName
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Delete a topic

Delete all messages in a topic.  `POST {{ api_url }}/v1/streams/{stream_id}/delete_topic`  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. 

### Example 
```objc

NSNumber* streamId = 1; // The ID of the stream to access. 
NSString* topicName = new coffee machine; // The name of the topic to delete. 

OAIStreamsApi*apiInstance = [[OAIStreamsApi alloc] init];

// Delete a topic
[apiInstance deleteTopicWithStreamId:streamId
              topicName:topicName
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIStreamsApi->deleteTopic: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **NSNumber***| The ID of the stream to access.  | 
 **topicName** | **NSString***| The name of the topic to delete.  | 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getStreamId**
```objc
-(NSURLSessionTask*) getStreamIdWithStream: (NSString*) stream
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Get stream ID

Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 

### Example 
```objc

NSString* stream = Denmark; // The name of the stream to access. 

OAIStreamsApi*apiInstance = [[OAIStreamsApi alloc] init];

// Get stream ID
[apiInstance getStreamIdWithStream:stream
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIStreamsApi->getStreamId: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stream** | **NSString***| The name of the stream to access.  | 

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getStreamTopics**
```objc
-(NSURLSessionTask*) getStreamTopicsWithStreamId: (NSNumber*) streamId
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Get topics in a stream

Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 

### Example 
```objc

NSNumber* streamId = 1; // The ID of the stream to access. 

OAIStreamsApi*apiInstance = [[OAIStreamsApi alloc] init];

// Get topics in a stream
[apiInstance getStreamTopicsWithStreamId:streamId
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIStreamsApi->getStreamTopics: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **NSNumber***| The ID of the stream to access.  | 

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getStreams**
```objc
-(NSURLSessionTask*) getStreamsWithIncludePublic: (NSNumber*) includePublic
    includeWebPublic: (NSNumber*) includeWebPublic
    includeSubscribed: (NSNumber*) includeSubscribed
    includeAllActive: (NSNumber*) includeAllActive
    includeDefault: (NSNumber*) includeDefault
    includeOwnerSubscribed: (NSNumber*) includeOwnerSubscribed
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Get all streams

Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 

### Example 
```objc

NSNumber* includePublic = false; // Include all public streams.  (optional) (default to @(YES))
NSNumber* includeWebPublic = true; // Include all web public streams.  (optional) (default to @(NO))
NSNumber* includeSubscribed = false; // Include all streams that the user is subscribed to.  (optional) (default to @(YES))
NSNumber* includeAllActive = true; // Include all active streams. The user must have administrative privileges to use this parameter.  (optional) (default to @(NO))
NSNumber* includeDefault = true; // Include all default streams for the user's realm.  (optional) (default to @(NO))
NSNumber* includeOwnerSubscribed = true; // If the user is a bot, include all streams that the bot's owner is subscribed to.  (optional) (default to @(NO))

OAIStreamsApi*apiInstance = [[OAIStreamsApi alloc] init];

// Get all streams
[apiInstance getStreamsWithIncludePublic:includePublic
              includeWebPublic:includeWebPublic
              includeSubscribed:includeSubscribed
              includeAllActive:includeAllActive
              includeDefault:includeDefault
              includeOwnerSubscribed:includeOwnerSubscribed
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIStreamsApi->getStreams: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includePublic** | **NSNumber***| Include all public streams.  | [optional] [default to @(YES)]
 **includeWebPublic** | **NSNumber***| Include all web public streams.  | [optional] [default to @(NO)]
 **includeSubscribed** | **NSNumber***| Include all streams that the user is subscribed to.  | [optional] [default to @(YES)]
 **includeAllActive** | **NSNumber***| Include all active streams. The user must have administrative privileges to use this parameter.  | [optional] [default to @(NO)]
 **includeDefault** | **NSNumber***| Include all default streams for the user&#39;s realm.  | [optional] [default to @(NO)]
 **includeOwnerSubscribed** | **NSNumber***| If the user is a bot, include all streams that the bot&#39;s owner is subscribed to.  | [optional] [default to @(NO)]

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSubscribers**
```objc
-(NSURLSessionTask*) getSubscribersWithStreamId: (NSNumber*) streamId
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Get the subscribers of a stream

Get all users subscribed to a stream.  `Get {{ api_url }}/v1/streams/{stream_id}/members` 

### Example 
```objc

NSNumber* streamId = 1; // The ID of the stream to access. 

OAIStreamsApi*apiInstance = [[OAIStreamsApi alloc] init];

// Get the subscribers of a stream
[apiInstance getSubscribersWithStreamId:streamId
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIStreamsApi->getSubscribers: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **NSNumber***| The ID of the stream to access.  | 

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSubscriptionStatus**
```objc
-(NSURLSessionTask*) getSubscriptionStatusWithUserId: (NSNumber*) userId
    streamId: (NSNumber*) streamId
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Get subscription status

Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 

### Example 
```objc

NSNumber* userId = 12; // The target user's ID. 
NSNumber* streamId = 1; // The ID of the stream to access. 

OAIStreamsApi*apiInstance = [[OAIStreamsApi alloc] init];

// Get subscription status
[apiInstance getSubscriptionStatusWithUserId:userId
              streamId:streamId
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIStreamsApi->getSubscriptionStatus: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **NSNumber***| The target user&#39;s ID.  | 
 **streamId** | **NSNumber***| The ID of the stream to access.  | 

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getSubscriptions**
```objc
-(NSURLSessionTask*) getSubscriptionsWithIncludeSubscribers: (NSNumber*) includeSubscribers
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Get subscribed streams

Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 

### Example 
```objc

NSNumber* includeSubscribers = true; // Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  (optional) (default to @(NO))

OAIStreamsApi*apiInstance = [[OAIStreamsApi alloc] init];

// Get subscribed streams
[apiInstance getSubscriptionsWithIncludeSubscribers:includeSubscribers
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIStreamsApi->getSubscriptions: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeSubscribers** | **NSNumber***| Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  | [optional] [default to @(NO)]

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **muteTopic**
```objc
-(NSURLSessionTask*) muteTopicWithTopic: (NSString*) topic
    op: (NSString*) op
    stream: (NSString*) stream
    streamId: (NSNumber*) streamId
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Topic muting

This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 

### Example 
```objc

NSString* topic = dinner; // The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. 
NSString* op = add; // Whether to mute (`add`) or unmute (`remove`) the provided topic. 
NSString* stream = Denmark; // The name of the stream to access.  (optional)
NSNumber* streamId = 42; // The ID of the stream to access.  (optional)

OAIStreamsApi*apiInstance = [[OAIStreamsApi alloc] init];

// Topic muting
[apiInstance muteTopicWithTopic:topic
              op:op
              stream:stream
              streamId:streamId
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIStreamsApi->muteTopic: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **topic** | **NSString***| The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic.  | 
 **op** | **NSString***| Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic.  | 
 **stream** | **NSString***| The name of the stream to access.  | [optional] 
 **streamId** | **NSNumber***| The ID of the stream to access.  | [optional] 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **subscribe**
```objc
-(NSURLSessionTask*) subscribeWithSubscriptions: (NSArray<NSObject*>*) subscriptions
    principals: (NSArray<OAIOneOfStringInteger>*) principals
    authorizationErrorsFatal: (NSNumber*) authorizationErrorsFatal
    announce: (NSNumber*) announce
    inviteOnly: (NSNumber*) inviteOnly
    historyPublicToSubscribers: (NSNumber*) historyPublicToSubscribers
    streamPostPolicy: (NSNumber*) streamPostPolicy
    messageRetentionDays: (OAIOneOfStringInteger*) messageRetentionDays
        completionHandler: (void (^)(OAIOneOfObjectObject* output, NSError* error)) handler;
```

Subscribe to a stream

Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 

### Example 
```objc

NSArray<NSObject*>* subscriptions = @[[[NSObject alloc] init]]; // A list of dictionaries containing the key `name` and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key `description` with an appropriate value. 
NSArray<OAIOneOfStringInteger>* principals = @[[[OAIOneOfStringInteger alloc] init]]; // A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  (optional)
NSNumber* authorizationErrorsFatal = false; // A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When `True`, an authorization error is reported as such. When set to `False`, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the `unauthorized` key.  (optional) (default to @(YES))
NSNumber* announce = true; // If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream's creation.  (optional) (default to @(NO))
NSNumber* inviteOnly = true; // As described above, this endpoint will create a new stream if passed a stream name that doesn't already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  (optional) (default to @(NO))
NSNumber* historyPublicToSubscribers = false; // Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  (optional)
NSNumber* streamPostPolicy = 2; // Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  (optional) (default to @1)
OAIOneOfStringInteger* messageRetentionDays = 20; // Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  (optional)

OAIStreamsApi*apiInstance = [[OAIStreamsApi alloc] init];

// Subscribe to a stream
[apiInstance subscribeWithSubscriptions:subscriptions
              principals:principals
              authorizationErrorsFatal:authorizationErrorsFatal
              announce:announce
              inviteOnly:inviteOnly
              historyPublicToSubscribers:historyPublicToSubscribers
              streamPostPolicy:streamPostPolicy
              messageRetentionDays:messageRetentionDays
          completionHandler: ^(OAIOneOfObjectObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIStreamsApi->subscribe: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | [**NSArray&lt;NSObject*&gt;***](NSObject*.md)| A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value.  | 
 **principals** | [**NSArray&lt;OAIOneOfStringInteger&gt;***](OAIOneOfStringInteger*.md)| A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | [optional] 
 **authorizationErrorsFatal** | **NSNumber***| A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key.  | [optional] [default to @(YES)]
 **announce** | **NSNumber***| If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation.  | [optional] [default to @(NO)]
 **inviteOnly** | **NSNumber***| As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  | [optional] [default to @(NO)]
 **historyPublicToSubscribers** | **NSNumber***| Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | [optional] 
 **streamPostPolicy** | **NSNumber***| Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] [default to @1]
 **messageRetentionDays** | [**OAIOneOfStringInteger***](.md)| Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional] 

### Return type

[**OAIOneOfObjectObject***](OAIOneOfObjectObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unsubscribe**
```objc
-(NSURLSessionTask*) unsubscribeWithSubscriptions: (NSArray<NSString*>*) subscriptions
    principals: (NSArray<OAIOneOfStringInteger>*) principals
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Unsubscribe from a stream

Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 

### Example 
```objc

NSArray<NSString*>* subscriptions = @[@"subscriptions_example"]; // A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API. 
NSArray<OAIOneOfStringInteger>* principals = @[[[OAIOneOfStringInteger alloc] init]]; // A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  (optional)

OAIStreamsApi*apiInstance = [[OAIStreamsApi alloc] init];

// Unsubscribe from a stream
[apiInstance unsubscribeWithSubscriptions:subscriptions
              principals:principals
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIStreamsApi->unsubscribe: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptions** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API.  | 
 **principals** | [**NSArray&lt;OAIOneOfStringInteger&gt;***](OAIOneOfStringInteger*.md)| A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  | [optional] 

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateStream**
```objc
-(NSURLSessionTask*) updateStreamWithStreamId: (NSNumber*) streamId
    _description: (NSString*) _description
    varNewName: (NSString*) varNewName
    isPrivate: (NSNumber*) isPrivate
    isAnnouncementOnly: (NSNumber*) isAnnouncementOnly
    streamPostPolicy: (NSNumber*) streamPostPolicy
    historyPublicToSubscribers: (NSNumber*) historyPublicToSubscribers
    messageRetentionDays: (OAIOneOfStringInteger*) messageRetentionDays
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Update a stream

Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 

### Example 
```objc

NSNumber* streamId = 1; // The ID of the stream to access. 
NSString* _description = Discuss Italian history and travel destinations.; // The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  (optional)
NSString* varNewName = Italy; // The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  (optional)
NSNumber* isPrivate = true; // Change whether the stream is a private stream.  (optional)
NSNumber* isAnnouncementOnly = true; // Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead.  (optional)
NSNumber* streamPostPolicy = 2; // Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  (optional) (default to @1)
NSNumber* historyPublicToSubscribers = false; // Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  (optional)
OAIOneOfStringInteger* messageRetentionDays = 20; // Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  (optional)

OAIStreamsApi*apiInstance = [[OAIStreamsApi alloc] init];

// Update a stream
[apiInstance updateStreamWithStreamId:streamId
              _description:_description
              varNewName:varNewName
              isPrivate:isPrivate
              isAnnouncementOnly:isAnnouncementOnly
              streamPostPolicy:streamPostPolicy
              historyPublicToSubscribers:historyPublicToSubscribers
              messageRetentionDays:messageRetentionDays
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIStreamsApi->updateStream: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **NSNumber***| The ID of the stream to access.  | 
 **_description** | **NSString***| The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | [optional] 
 **varNewName** | **NSString***| The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  | [optional] 
 **isPrivate** | **NSNumber***| Change whether the stream is a private stream.  | [optional] 
 **isAnnouncementOnly** | **NSNumber***| Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead.  | [optional] 
 **streamPostPolicy** | **NSNumber***| Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] [default to @1]
 **historyPublicToSubscribers** | **NSNumber***| Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  | [optional] 
 **messageRetentionDays** | [**OAIOneOfStringInteger***](.md)| Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional] 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateSubscriptionSettings**
```objc
-(NSURLSessionTask*) updateSubscriptionSettingsWithSubscriptionData: (NSArray<NSObject*>*) subscriptionData
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Update subscription settings

This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 

### Example 
```objc

NSArray<NSObject*>* subscriptionData = @[[[NSObject alloc] init]]; // A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream. 

OAIStreamsApi*apiInstance = [[OAIStreamsApi alloc] init];

// Update subscription settings
[apiInstance updateSubscriptionSettingsWithSubscriptionData:subscriptionData
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIStreamsApi->updateSubscriptionSettings: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionData** | [**NSArray&lt;NSObject*&gt;***](NSObject*.md)| A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream.  | 

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateSubscriptions**
```objc
-(NSURLSessionTask*) updateSubscriptionsWithDelete: (NSArray<NSString*>*) delete
    add: (NSArray<NSObject*>*) add
        completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;
```

Update subscriptions

Update which streams you are are subscribed to. 

### Example 
```objc

NSArray<NSString*>* delete = @[@"delete_example"]; // A list of stream names to unsubscribe from.  (optional)
NSArray<NSObject*>* add = @[[[NSObject alloc] init]]; // A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  (optional)

OAIStreamsApi*apiInstance = [[OAIStreamsApi alloc] init];

// Update subscriptions
[apiInstance updateSubscriptionsWithDelete:delete
              add:add
          completionHandler: ^(OAIJsonSuccessBase* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIStreamsApi->updateSubscriptions: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delete** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| A list of stream names to unsubscribe from.  | [optional] 
 **add** | [**NSArray&lt;NSObject*&gt;***](NSObject*.md)| A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  | [optional] 

### Return type

[**OAIJsonSuccessBase***](OAIJsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

