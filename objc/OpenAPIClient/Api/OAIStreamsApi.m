#import "OAIStreamsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAICodedError.h"
#import "OAIJsonError.h"
#import "OAIJsonSuccess.h"
#import "OAIJsonSuccessBase.h"
#import "OAINonExistingStreamError.h"
#import "OAIOneOfObjectObject.h"
#import "OAIOneOfStringInteger.h"


@interface OAIStreamsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIStreamsApi

NSString* kOAIStreamsApiErrorDomain = @"OAIStreamsApiErrorDomain";
NSInteger kOAIStreamsApiMissingParamErrorCode = 234513;

@synthesize apiClient = _apiClient;

#pragma mark - Initialize methods

- (instancetype) init {
    return [self initWithApiClient:[OAIApiClient sharedClient]];
}


-(instancetype) initWithApiClient:(OAIApiClient *)apiClient {
    self = [super init];
    if (self) {
        _apiClient = apiClient;
        _mutableDefaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

-(NSString*) defaultHeaderForKey:(NSString*)key {
    return self.mutableDefaultHeaders[key];
}

-(void) setDefaultHeaderValue:(NSString*) value forKey:(NSString*)key {
    [self.mutableDefaultHeaders setValue:value forKey:key];
}

-(NSDictionary *)defaultHeaders {
    return self.mutableDefaultHeaders;
}

#pragma mark - Api Methods

///
/// Archive a stream
/// [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 
///  @param streamId The ID of the stream to access.  
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) archiveStreamWithStreamId: (NSNumber*) streamId
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'streamId' is set
    if (streamId == nil) {
        NSParameterAssert(streamId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"streamId"] };
            NSError* error = [NSError errorWithDomain:kOAIStreamsApiErrorDomain code:kOAIStreamsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/streams/{stream_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (streamId != nil) {
        pathParams[@"stream_id"] = streamId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"DELETE"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIJsonSuccess*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIJsonSuccess*)data, error);
                                }
                            }];
}

///
/// Create BigBlueButton video call
/// Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) createBigBlueButtonVideoCallWithCompletionHandler: 
    (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/calls/bigbluebutton/create"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIJsonSuccessBase*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIJsonSuccessBase*)data, error);
                                }
                            }];
}

///
/// Get stream ID
/// Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 
///  @param stream The name of the stream to access.  
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) getStreamIdWithStream: (NSString*) stream
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    // verify the required parameter 'stream' is set
    if (stream == nil) {
        NSParameterAssert(stream);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"stream"] };
            NSError* error = [NSError errorWithDomain:kOAIStreamsApiErrorDomain code:kOAIStreamsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/get_stream_id"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (stream != nil) {
        queryParams[@"stream"] = stream;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIJsonSuccessBase*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIJsonSuccessBase*)data, error);
                                }
                            }];
}

///
/// Get topics in a stream
/// Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 
///  @param streamId The ID of the stream to access.  
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) getStreamTopicsWithStreamId: (NSNumber*) streamId
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    // verify the required parameter 'streamId' is set
    if (streamId == nil) {
        NSParameterAssert(streamId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"streamId"] };
            NSError* error = [NSError errorWithDomain:kOAIStreamsApiErrorDomain code:kOAIStreamsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/users/me/{stream_id}/topics"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (streamId != nil) {
        pathParams[@"stream_id"] = streamId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIJsonSuccessBase*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIJsonSuccessBase*)data, error);
                                }
                            }];
}

///
/// Get all streams
/// Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 
///  @param includePublic Include all public streams.  (optional, default to @(YES))
///
///  @param includeWebPublic Include all web public streams.  (optional, default to @(NO))
///
///  @param includeSubscribed Include all streams that the user is subscribed to.  (optional, default to @(YES))
///
///  @param includeAllActive Include all active streams. The user must have administrative privileges to use this parameter.  (optional, default to @(NO))
///
///  @param includeDefault Include all default streams for the user's realm.  (optional, default to @(NO))
///
///  @param includeOwnerSubscribed If the user is a bot, include all streams that the bot's owner is subscribed to.  (optional, default to @(NO))
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) getStreamsWithIncludePublic: (NSNumber*) includePublic
    includeWebPublic: (NSNumber*) includeWebPublic
    includeSubscribed: (NSNumber*) includeSubscribed
    includeAllActive: (NSNumber*) includeAllActive
    includeDefault: (NSNumber*) includeDefault
    includeOwnerSubscribed: (NSNumber*) includeOwnerSubscribed
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/streams"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (includePublic != nil) {
        queryParams[@"include_public"] = [includePublic isEqual:@(YES)] ? @"true" : @"false";
    }
    if (includeWebPublic != nil) {
        queryParams[@"include_web_public"] = [includeWebPublic isEqual:@(YES)] ? @"true" : @"false";
    }
    if (includeSubscribed != nil) {
        queryParams[@"include_subscribed"] = [includeSubscribed isEqual:@(YES)] ? @"true" : @"false";
    }
    if (includeAllActive != nil) {
        queryParams[@"include_all_active"] = [includeAllActive isEqual:@(YES)] ? @"true" : @"false";
    }
    if (includeDefault != nil) {
        queryParams[@"include_default"] = [includeDefault isEqual:@(YES)] ? @"true" : @"false";
    }
    if (includeOwnerSubscribed != nil) {
        queryParams[@"include_owner_subscribed"] = [includeOwnerSubscribed isEqual:@(YES)] ? @"true" : @"false";
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIJsonSuccessBase*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIJsonSuccessBase*)data, error);
                                }
                            }];
}

///
/// Get subscription status
/// Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 
///  @param userId The target user's ID.  
///
///  @param streamId The ID of the stream to access.  
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) getSubscriptionStatusWithUserId: (NSNumber*) userId
    streamId: (NSNumber*) streamId
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    // verify the required parameter 'userId' is set
    if (userId == nil) {
        NSParameterAssert(userId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"userId"] };
            NSError* error = [NSError errorWithDomain:kOAIStreamsApiErrorDomain code:kOAIStreamsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'streamId' is set
    if (streamId == nil) {
        NSParameterAssert(streamId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"streamId"] };
            NSError* error = [NSError errorWithDomain:kOAIStreamsApiErrorDomain code:kOAIStreamsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/users/{user_id}/subscriptions/{stream_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (userId != nil) {
        pathParams[@"user_id"] = userId;
    }
    if (streamId != nil) {
        pathParams[@"stream_id"] = streamId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIJsonSuccessBase*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIJsonSuccessBase*)data, error);
                                }
                            }];
}

///
/// Get subscribed streams
/// Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 
///  @param includeSubscribers Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  (optional, default to @(NO))
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) getSubscriptionsWithIncludeSubscribers: (NSNumber*) includeSubscribers
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/users/me/subscriptions"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (includeSubscribers != nil) {
        queryParams[@"include_subscribers"] = [includeSubscribers isEqual:@(YES)] ? @"true" : @"false";
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIJsonSuccessBase*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIJsonSuccessBase*)data, error);
                                }
                            }];
}

///
/// Topic muting
/// This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 
///  @param topic The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic.  
///
///  @param op Whether to mute (`add`) or unmute (`remove`) the provided topic.  
///
///  @param stream The name of the stream to access.  (optional)
///
///  @param streamId The ID of the stream to access.  (optional)
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) muteTopicWithTopic: (NSString*) topic
    op: (NSString*) op
    stream: (NSString*) stream
    streamId: (NSNumber*) streamId
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'topic' is set
    if (topic == nil) {
        NSParameterAssert(topic);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"topic"] };
            NSError* error = [NSError errorWithDomain:kOAIStreamsApiErrorDomain code:kOAIStreamsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'op' is set
    if (op == nil) {
        NSParameterAssert(op);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"op"] };
            NSError* error = [NSError errorWithDomain:kOAIStreamsApiErrorDomain code:kOAIStreamsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/users/me/subscriptions/muted_topics"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (stream != nil) {
        queryParams[@"stream"] = stream;
    }
    if (streamId != nil) {
        queryParams[@"stream_id"] = streamId;
    }
    if (topic != nil) {
        queryParams[@"topic"] = topic;
    }
    if (op != nil) {
        queryParams[@"op"] = op;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"PATCH"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIJsonSuccess*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIJsonSuccess*)data, error);
                                }
                            }];
}

///
/// Subscribe to a stream
/// Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 
///  @param subscriptions A list of dictionaries containing the key `name` and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key `description` with an appropriate value.  
///
///  @param principals A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  (optional)
///
///  @param authorizationErrorsFatal A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When `True`, an authorization error is reported as such. When set to `False`, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the `unauthorized` key.  (optional, default to @(YES))
///
///  @param announce If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream's creation.  (optional, default to @(NO))
///
///  @param inviteOnly As described above, this endpoint will create a new stream if passed a stream name that doesn't already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  (optional, default to @(NO))
///
///  @param historyPublicToSubscribers Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  (optional)
///
///  @param streamPostPolicy Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  (optional, default to @1)
///
///  @param messageRetentionDays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  (optional)
///
///  @returns OAIOneOfObjectObject*
///
-(NSURLSessionTask*) subscribeWithSubscriptions: (NSArray<NSObject*>*) subscriptions
    principals: (NSArray<OAIOneOfStringInteger>*) principals
    authorizationErrorsFatal: (NSNumber*) authorizationErrorsFatal
    announce: (NSNumber*) announce
    inviteOnly: (NSNumber*) inviteOnly
    historyPublicToSubscribers: (NSNumber*) historyPublicToSubscribers
    streamPostPolicy: (NSNumber*) streamPostPolicy
    messageRetentionDays: (OAIOneOfStringInteger*) messageRetentionDays
    completionHandler: (void (^)(OAIOneOfObjectObject* output, NSError* error)) handler {
    // verify the required parameter 'subscriptions' is set
    if (subscriptions == nil) {
        NSParameterAssert(subscriptions);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"subscriptions"] };
            NSError* error = [NSError errorWithDomain:kOAIStreamsApiErrorDomain code:kOAIStreamsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/users/me/subscriptions"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (subscriptions != nil) {
        queryParams[@"subscriptions"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: subscriptions format: @"multi"];
    }
    if (principals != nil) {
        queryParams[@"principals"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: principals format: @"multi"];
    }
    if (authorizationErrorsFatal != nil) {
        queryParams[@"authorization_errors_fatal"] = [authorizationErrorsFatal isEqual:@(YES)] ? @"true" : @"false";
    }
    if (announce != nil) {
        queryParams[@"announce"] = [announce isEqual:@(YES)] ? @"true" : @"false";
    }
    if (inviteOnly != nil) {
        queryParams[@"invite_only"] = [inviteOnly isEqual:@(YES)] ? @"true" : @"false";
    }
    if (historyPublicToSubscribers != nil) {
        queryParams[@"history_public_to_subscribers"] = [historyPublicToSubscribers isEqual:@(YES)] ? @"true" : @"false";
    }
    if (streamPostPolicy != nil) {
        queryParams[@"stream_post_policy"] = streamPostPolicy;
    }
    if (messageRetentionDays != nil) {
        queryParams[@"message_retention_days"] = messageRetentionDays;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIOneOfObjectObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIOneOfObjectObject*)data, error);
                                }
                            }];
}

///
/// Unsubscribe from a stream
/// Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 
///  @param subscriptions A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API.  
///
///  @param principals A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  (optional)
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) unsubscribeWithSubscriptions: (NSArray<NSString*>*) subscriptions
    principals: (NSArray<OAIOneOfStringInteger>*) principals
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    // verify the required parameter 'subscriptions' is set
    if (subscriptions == nil) {
        NSParameterAssert(subscriptions);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"subscriptions"] };
            NSError* error = [NSError errorWithDomain:kOAIStreamsApiErrorDomain code:kOAIStreamsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/users/me/subscriptions"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (subscriptions != nil) {
        queryParams[@"subscriptions"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: subscriptions format: @"multi"];
    }
    if (principals != nil) {
        queryParams[@"principals"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: principals format: @"multi"];
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"DELETE"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIJsonSuccessBase*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIJsonSuccessBase*)data, error);
                                }
                            }];
}

///
/// Update a stream
/// Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 
///  @param streamId The ID of the stream to access.  
///
///  @param _description The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  (optional)
///
///  @param varNewName The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  (optional)
///
///  @param isPrivate Change whether the stream is a private stream.  (optional)
///
///  @param isAnnouncementOnly Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead.  (optional)
///
///  @param streamPostPolicy Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  (optional, default to @1)
///
///  @param historyPublicToSubscribers Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  (optional)
///
///  @param messageRetentionDays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  (optional)
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) updateStreamWithStreamId: (NSNumber*) streamId
    _description: (NSString*) _description
    varNewName: (NSString*) varNewName
    isPrivate: (NSNumber*) isPrivate
    isAnnouncementOnly: (NSNumber*) isAnnouncementOnly
    streamPostPolicy: (NSNumber*) streamPostPolicy
    historyPublicToSubscribers: (NSNumber*) historyPublicToSubscribers
    messageRetentionDays: (OAIOneOfStringInteger*) messageRetentionDays
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'streamId' is set
    if (streamId == nil) {
        NSParameterAssert(streamId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"streamId"] };
            NSError* error = [NSError errorWithDomain:kOAIStreamsApiErrorDomain code:kOAIStreamsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/streams/{stream_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (streamId != nil) {
        pathParams[@"stream_id"] = streamId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (_description != nil) {
        queryParams[@"description"] = _description;
    }
    if (varNewName != nil) {
        queryParams[@"new_name"] = varNewName;
    }
    if (isPrivate != nil) {
        queryParams[@"is_private"] = [isPrivate isEqual:@(YES)] ? @"true" : @"false";
    }
    if (isAnnouncementOnly != nil) {
        queryParams[@"is_announcement_only"] = [isAnnouncementOnly isEqual:@(YES)] ? @"true" : @"false";
    }
    if (streamPostPolicy != nil) {
        queryParams[@"stream_post_policy"] = streamPostPolicy;
    }
    if (historyPublicToSubscribers != nil) {
        queryParams[@"history_public_to_subscribers"] = [historyPublicToSubscribers isEqual:@(YES)] ? @"true" : @"false";
    }
    if (messageRetentionDays != nil) {
        queryParams[@"message_retention_days"] = messageRetentionDays;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"PATCH"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIJsonSuccess*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIJsonSuccess*)data, error);
                                }
                            }];
}

///
/// Update subscription settings
/// This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 
///  @param subscriptionData A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream.  
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) updateSubscriptionSettingsWithSubscriptionData: (NSArray<NSObject*>*) subscriptionData
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    // verify the required parameter 'subscriptionData' is set
    if (subscriptionData == nil) {
        NSParameterAssert(subscriptionData);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"subscriptionData"] };
            NSError* error = [NSError errorWithDomain:kOAIStreamsApiErrorDomain code:kOAIStreamsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/users/me/subscriptions/properties"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (subscriptionData != nil) {
        queryParams[@"subscription_data"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: subscriptionData format: @"multi"];
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIJsonSuccessBase*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIJsonSuccessBase*)data, error);
                                }
                            }];
}

///
/// Update subscriptions
/// Update which streams you are are subscribed to. 
///  @param delete A list of stream names to unsubscribe from.  (optional)
///
///  @param add A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  (optional)
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) updateSubscriptionsWithDelete: (NSArray<NSString*>*) delete
    add: (NSArray<NSObject*>*) add
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/users/me/subscriptions"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (delete != nil) {
        queryParams[@"delete"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: delete format: @"multi"];
    }
    if (add != nil) {
        queryParams[@"add"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: add format: @"multi"];
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"PATCH"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIJsonSuccessBase*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIJsonSuccessBase*)data, error);
                                }
                            }];
}



@end
