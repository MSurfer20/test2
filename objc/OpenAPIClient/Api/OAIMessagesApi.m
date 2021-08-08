#import "OAIMessagesApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIAnyType.h"
#import "OAICodedError.h"
#import "OAIInvalidMessageError.h"
#import "OAIJsonSuccess.h"
#import "OAIJsonSuccessBase.h"
#import "OAIOneOfObjectObject.h"
#import "OAIOneOfStringInteger.h"


@interface OAIMessagesApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIMessagesApi

NSString* kOAIMessagesApiErrorDomain = @"OAIMessagesApiErrorDomain";
NSInteger kOAIMessagesApiMissingParamErrorCode = 234513;

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
/// Add an emoji reaction
/// Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` 
///  @param messageId The target message's ID.  
///
///  @param emojiName The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name.  
///
///  @param emojiCode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji.  (optional)
///
///  @param reactionType If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified.  (optional)
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) addReactionWithMessageId: (NSNumber*) messageId
    emojiName: (NSString*) emojiName
    emojiCode: (NSString*) emojiCode
    reactionType: (NSString*) reactionType
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'messageId' is set
    if (messageId == nil) {
        NSParameterAssert(messageId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"messageId"] };
            NSError* error = [NSError errorWithDomain:kOAIMessagesApiErrorDomain code:kOAIMessagesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'emojiName' is set
    if (emojiName == nil) {
        NSParameterAssert(emojiName);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"emojiName"] };
            NSError* error = [NSError errorWithDomain:kOAIMessagesApiErrorDomain code:kOAIMessagesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/messages/{message_id}/reactions"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (messageId != nil) {
        pathParams[@"message_id"] = messageId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (emojiName != nil) {
        queryParams[@"emoji_name"] = emojiName;
    }
    if (emojiCode != nil) {
        queryParams[@"emoji_code"] = emojiCode;
    }
    if (reactionType != nil) {
        queryParams[@"reaction_type"] = reactionType;
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
                              responseType: @"OAIJsonSuccess*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIJsonSuccess*)data, error);
                                }
                            }];
}

///
/// Check if messages match a narrow
/// Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. 
///  @param msgIds List of IDs for the messages to check. 
///
///  @param narrow A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow). 
///
///  @returns OAIAnyType*
///
-(NSURLSessionTask*) checkMessagesMatchNarrowWithMsgIds: (NSArray<NSNumber*>*) msgIds
    narrow: (NSArray<NSObject*>*) narrow
    completionHandler: (void (^)(OAIAnyType* output, NSError* error)) handler {
    // verify the required parameter 'msgIds' is set
    if (msgIds == nil) {
        NSParameterAssert(msgIds);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"msgIds"] };
            NSError* error = [NSError errorWithDomain:kOAIMessagesApiErrorDomain code:kOAIMessagesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'narrow' is set
    if (narrow == nil) {
        NSParameterAssert(narrow);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"narrow"] };
            NSError* error = [NSError errorWithDomain:kOAIMessagesApiErrorDomain code:kOAIMessagesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/messages/matches_narrow"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (msgIds != nil) {
        queryParams[@"msg_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: msgIds format: @"multi"];
    }
    if (narrow != nil) {
        queryParams[@"narrow"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: narrow format: @"multi"];
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
                              responseType: @"OAIAnyType*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAnyType*)data, error);
                                }
                            }];
}

///
/// Delete a message
/// Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
///  @param messageId The target message's ID.  
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) deleteMessageWithMessageId: (NSNumber*) messageId
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'messageId' is set
    if (messageId == nil) {
        NSParameterAssert(messageId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"messageId"] };
            NSError* error = [NSError errorWithDomain:kOAIMessagesApiErrorDomain code:kOAIMessagesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/messages/{message_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (messageId != nil) {
        pathParams[@"message_id"] = messageId;
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
/// Get public temporary URL
/// Get a temporary URL for access to the file that doesn't require authentication. 
///  @param realmIdStr The realm id.  
///
///  @param filename Path to the URL.  
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) getFileTemporaryUrlWithRealmIdStr: (NSNumber*) realmIdStr
    filename: (NSString*) filename
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    // verify the required parameter 'realmIdStr' is set
    if (realmIdStr == nil) {
        NSParameterAssert(realmIdStr);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"realmIdStr"] };
            NSError* error = [NSError errorWithDomain:kOAIMessagesApiErrorDomain code:kOAIMessagesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'filename' is set
    if (filename == nil) {
        NSParameterAssert(filename);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"filename"] };
            NSError* error = [NSError errorWithDomain:kOAIMessagesApiErrorDomain code:kOAIMessagesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user_uploads/{realm_id_str}/{filename}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (realmIdStr != nil) {
        pathParams[@"realm_id_str"] = realmIdStr;
    }
    if (filename != nil) {
        pathParams[@"filename"] = filename;
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
/// Get a message's edit history
/// Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
///  @param messageId The target message's ID.  
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) getMessageHistoryWithMessageId: (NSNumber*) messageId
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    // verify the required parameter 'messageId' is set
    if (messageId == nil) {
        NSParameterAssert(messageId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"messageId"] };
            NSError* error = [NSError errorWithDomain:kOAIMessagesApiErrorDomain code:kOAIMessagesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/messages/{message_id}/history"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (messageId != nil) {
        pathParams[@"message_id"] = messageId;
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
/// Get messages
/// Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
///  @param numBefore The number of messages with IDs less than the anchor to retrieve.  
///
///  @param numAfter The number of messages with IDs greater than the anchor to retrieve.  
///
///  @param anchor Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * `newest`: The most recent message. * `oldest`: The oldest message. * `first_unread`: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of `'newest'` and `'oldest'` are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   `first_unread` functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, `oldest` can be emulated with   `anchor=0`, and `newest` with `anchor=10000000000000000`   (that specific large value works around a bug in Zulip   2.1.x and older in the `found_newest` return value).  (optional)
///
///  @param narrow The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow).  (optional)
///
///  @param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional, default to @(NO))
///
///  @param applyMarkdown If `true`, message content is returned in the rendered HTML format. If `false`, message content is returned in the raw Markdown-format text that user entered.  (optional, default to @(YES))
///
///  @param useFirstUnreadAnchor Legacy way to specify `anchor=\"first_unread\"` in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the `anchor`.  Mutually exclusive with `anchor`.  **Changes**: Deprecated in Zulip 3.0, replaced by `anchor=\"first_unread\"` instead.  (optional, default to @(NO))
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) getMessagesWithNumBefore: (NSNumber*) numBefore
    numAfter: (NSNumber*) numAfter
    anchor: (OAIOneOfStringInteger*) anchor
    narrow: (NSArray<NSObject*>*) narrow
    clientGravatar: (NSNumber*) clientGravatar
    applyMarkdown: (NSNumber*) applyMarkdown
    useFirstUnreadAnchor: (NSNumber*) useFirstUnreadAnchor
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    // verify the required parameter 'numBefore' is set
    if (numBefore == nil) {
        NSParameterAssert(numBefore);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"numBefore"] };
            NSError* error = [NSError errorWithDomain:kOAIMessagesApiErrorDomain code:kOAIMessagesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'numAfter' is set
    if (numAfter == nil) {
        NSParameterAssert(numAfter);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"numAfter"] };
            NSError* error = [NSError errorWithDomain:kOAIMessagesApiErrorDomain code:kOAIMessagesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/messages"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (anchor != nil) {
        queryParams[@"anchor"] = anchor;
    }
    if (numBefore != nil) {
        queryParams[@"num_before"] = numBefore;
    }
    if (numAfter != nil) {
        queryParams[@"num_after"] = numAfter;
    }
    if (narrow != nil) {
        queryParams[@"narrow"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: narrow format: @"multi"];
    }
    if (clientGravatar != nil) {
        queryParams[@"client_gravatar"] = [clientGravatar isEqual:@(YES)] ? @"true" : @"false";
    }
    if (applyMarkdown != nil) {
        queryParams[@"apply_markdown"] = [applyMarkdown isEqual:@(YES)] ? @"true" : @"false";
    }
    if (useFirstUnreadAnchor != nil) {
        queryParams[@"use_first_unread_anchor"] = [useFirstUnreadAnchor isEqual:@(YES)] ? @"true" : @"false";
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
/// Get a message's raw Markdown
/// Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). 
///  @param messageId The target message's ID.  
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) getRawMessageWithMessageId: (NSNumber*) messageId
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    // verify the required parameter 'messageId' is set
    if (messageId == nil) {
        NSParameterAssert(messageId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"messageId"] };
            NSError* error = [NSError errorWithDomain:kOAIMessagesApiErrorDomain code:kOAIMessagesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/messages/{message_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (messageId != nil) {
        pathParams[@"message_id"] = messageId;
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
/// Mark all messages as read
/// Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` 
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) markAllAsReadWithCompletionHandler: 
    (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/mark_all_as_read"];

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
                              responseType: @"OAIJsonSuccess*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIJsonSuccess*)data, error);
                                }
                            }];
}

///
/// Mark messages in a stream as read
/// Mark all the unread messages in a stream as read. 
///  @param streamId The ID of the stream to access.  
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) markStreamAsReadWithStreamId: (NSNumber*) streamId
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'streamId' is set
    if (streamId == nil) {
        NSParameterAssert(streamId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"streamId"] };
            NSError* error = [NSError errorWithDomain:kOAIMessagesApiErrorDomain code:kOAIMessagesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/mark_stream_as_read"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (streamId != nil) {
        queryParams[@"stream_id"] = streamId;
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
                              responseType: @"OAIJsonSuccess*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIJsonSuccess*)data, error);
                                }
                            }];
}

///
/// Mark messages in a topic as read
/// Mark all the unread messages in a topic as read. 
///  @param streamId The ID of the stream to access.  
///
///  @param topicName The name of the topic whose messages should be marked as read.  
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) markTopicAsReadWithStreamId: (NSNumber*) streamId
    topicName: (NSString*) topicName
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'streamId' is set
    if (streamId == nil) {
        NSParameterAssert(streamId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"streamId"] };
            NSError* error = [NSError errorWithDomain:kOAIMessagesApiErrorDomain code:kOAIMessagesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'topicName' is set
    if (topicName == nil) {
        NSParameterAssert(topicName);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"topicName"] };
            NSError* error = [NSError errorWithDomain:kOAIMessagesApiErrorDomain code:kOAIMessagesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/mark_topic_as_read"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (streamId != nil) {
        queryParams[@"stream_id"] = streamId;
    }
    if (topicName != nil) {
        queryParams[@"topic_name"] = topicName;
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
                              responseType: @"OAIJsonSuccess*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIJsonSuccess*)data, error);
                                }
                            }];
}

///
/// Remove an emoji reaction
/// Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` 
///  @param messageId The target message's ID.  
///
///  @param emojiName The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name.  (optional)
///
///  @param emojiCode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji.  (optional)
///
///  @param reactionType If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified.  (optional)
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) removeReactionWithMessageId: (NSNumber*) messageId
    emojiName: (NSString*) emojiName
    emojiCode: (NSString*) emojiCode
    reactionType: (NSString*) reactionType
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'messageId' is set
    if (messageId == nil) {
        NSParameterAssert(messageId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"messageId"] };
            NSError* error = [NSError errorWithDomain:kOAIMessagesApiErrorDomain code:kOAIMessagesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/messages/{message_id}/reactions"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (messageId != nil) {
        pathParams[@"message_id"] = messageId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (emojiName != nil) {
        queryParams[@"emoji_name"] = emojiName;
    }
    if (emojiCode != nil) {
        queryParams[@"emoji_code"] = emojiCode;
    }
    if (reactionType != nil) {
        queryParams[@"reaction_type"] = reactionType;
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
                              responseType: @"OAIJsonSuccess*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIJsonSuccess*)data, error);
                                }
                            }];
}

///
/// Render message
/// Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` 
///  @param content The content of the message. Maximum message size of 10000 bytes.  
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) renderMessageWithContent: (NSString*) content
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    // verify the required parameter 'content' is set
    if (content == nil) {
        NSParameterAssert(content);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"content"] };
            NSError* error = [NSError errorWithDomain:kOAIMessagesApiErrorDomain code:kOAIMessagesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/messages/render"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (content != nil) {
        queryParams[@"content"] = content;
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
/// Send a message
/// Send a stream or a private message.  `POST {{ api_url }}/v1/messages` 
///  @param type The type of message to be sent. `private` for a private message and `stream` for a stream message.  
///
///  @param to For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0.  
///
///  @param content The content of the message. Maximum message size of 10000 bytes.  
///
///  @param topic The topic of the message. Only required for stream messages (`type=\"stream\"`), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias.  (optional)
///
///  @param queueId For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, `local_id` is required.  If the message is successfully sent, the server will include `local_id` in the `message` event that the client with this `queue_id` will receive notifying it of the new message via [`GET /events`](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device).  (optional)
///
///  @param localId For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the `queue_id` description.  (optional)
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) sendMessageWithType: (NSString*) type
    to: (NSArray<NSNumber*>*) to
    content: (NSString*) content
    topic: (NSString*) topic
    queueId: (NSString*) queueId
    localId: (NSString*) localId
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    // verify the required parameter 'type' is set
    if (type == nil) {
        NSParameterAssert(type);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"type"] };
            NSError* error = [NSError errorWithDomain:kOAIMessagesApiErrorDomain code:kOAIMessagesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'to' is set
    if (to == nil) {
        NSParameterAssert(to);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"to"] };
            NSError* error = [NSError errorWithDomain:kOAIMessagesApiErrorDomain code:kOAIMessagesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'content' is set
    if (content == nil) {
        NSParameterAssert(content);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"content"] };
            NSError* error = [NSError errorWithDomain:kOAIMessagesApiErrorDomain code:kOAIMessagesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/messages"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (type != nil) {
        queryParams[@"type"] = type;
    }
    if (to != nil) {
        queryParams[@"to"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: to format: @"multi"];
    }
    if (content != nil) {
        queryParams[@"content"] = content;
    }
    if (topic != nil) {
        queryParams[@"topic"] = topic;
    }
    if (queueId != nil) {
        queryParams[@"queue_id"] = queueId;
    }
    if (localId != nil) {
        queryParams[@"local_id"] = localId;
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
/// Edit a message
/// Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
///  @param messageId The target message's ID.  
///
///  @param topic The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias.  (optional)
///
///  @param propagateMode Which message(s) should be edited: just the one indicated in `message_id`, messages in the same topic that had been sent after this one, or all of them.  Only the default value of `change_one` is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic.  (optional, default to @"change_one")
///
///  @param sendNotificationToOldThread Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9).  (optional, default to @(YES))
///
///  @param sendNotificationToNewThread Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9).  (optional, default to @(YES))
///
///  @param content The content of the message. Maximum message size of 10000 bytes.  (optional)
///
///  @param streamId The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message.  (optional)
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) updateMessageWithMessageId: (NSNumber*) messageId
    topic: (NSString*) topic
    propagateMode: (NSString*) propagateMode
    sendNotificationToOldThread: (NSNumber*) sendNotificationToOldThread
    sendNotificationToNewThread: (NSNumber*) sendNotificationToNewThread
    content: (NSString*) content
    streamId: (NSNumber*) streamId
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'messageId' is set
    if (messageId == nil) {
        NSParameterAssert(messageId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"messageId"] };
            NSError* error = [NSError errorWithDomain:kOAIMessagesApiErrorDomain code:kOAIMessagesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/messages/{message_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (messageId != nil) {
        pathParams[@"message_id"] = messageId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (topic != nil) {
        queryParams[@"topic"] = topic;
    }
    if (propagateMode != nil) {
        queryParams[@"propagate_mode"] = propagateMode;
    }
    if (sendNotificationToOldThread != nil) {
        queryParams[@"send_notification_to_old_thread"] = [sendNotificationToOldThread isEqual:@(YES)] ? @"true" : @"false";
    }
    if (sendNotificationToNewThread != nil) {
        queryParams[@"send_notification_to_new_thread"] = [sendNotificationToNewThread isEqual:@(YES)] ? @"true" : @"false";
    }
    if (content != nil) {
        queryParams[@"content"] = content;
    }
    if (streamId != nil) {
        queryParams[@"stream_id"] = streamId;
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
/// Update personal message flags
/// Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
///  @param messages An array containing the IDs of the target messages.  
///
///  @param op Whether to `add` the flag or `remove` it.  
///
///  @param flag The flag that should be added/removed.  
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) updateMessageFlagsWithMessages: (NSArray<NSNumber*>*) messages
    op: (NSString*) op
    flag: (NSString*) flag
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    // verify the required parameter 'messages' is set
    if (messages == nil) {
        NSParameterAssert(messages);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"messages"] };
            NSError* error = [NSError errorWithDomain:kOAIMessagesApiErrorDomain code:kOAIMessagesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'op' is set
    if (op == nil) {
        NSParameterAssert(op);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"op"] };
            NSError* error = [NSError errorWithDomain:kOAIMessagesApiErrorDomain code:kOAIMessagesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'flag' is set
    if (flag == nil) {
        NSParameterAssert(flag);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"flag"] };
            NSError* error = [NSError errorWithDomain:kOAIMessagesApiErrorDomain code:kOAIMessagesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/messages/flags"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (messages != nil) {
        queryParams[@"messages"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: messages format: @"multi"];
    }
    if (op != nil) {
        queryParams[@"op"] = op;
    }
    if (flag != nil) {
        queryParams[@"flag"] = flag;
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
/// Upload a file
/// Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
///  @param filename  (optional)
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) uploadFileWithFilename: (NSURL*) filename
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user_uploads"];

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
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"multipart/form-data"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    localVarFiles[@"filename"] = filename;

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



@end
