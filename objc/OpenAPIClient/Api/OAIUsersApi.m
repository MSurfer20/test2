#import "OAIUsersApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIAnyType.h"
#import "OAICodedError.h"
#import "OAIJsonError.h"
#import "OAIJsonSuccess.h"
#import "OAIJsonSuccessBase.h"
#import "OAIOneOfObjectObject.h"
#import "OAIOneOfObjectObjectObject.h"
#import "OAIOneOfObjectObjectObjectObjectObjectObject.h"


@interface OAIUsersApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIUsersApi

NSString* kOAIUsersApiErrorDomain = @"OAIUsersApiErrorDomain";
NSInteger kOAIUsersApiMissingParamErrorCode = 234513;

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
/// Create a user
/// {!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 
///  @param email The email address of the new user.  
///
///  @param password The password of the new user.  
///
///  @param fullName The full name of the new user.  
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) createUserWithEmail: (NSString*) email
    password: (NSString*) password
    fullName: (NSString*) fullName
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    // verify the required parameter 'email' is set
    if (email == nil) {
        NSParameterAssert(email);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"email"] };
            NSError* error = [NSError errorWithDomain:kOAIUsersApiErrorDomain code:kOAIUsersApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'password' is set
    if (password == nil) {
        NSParameterAssert(password);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"password"] };
            NSError* error = [NSError errorWithDomain:kOAIUsersApiErrorDomain code:kOAIUsersApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'fullName' is set
    if (fullName == nil) {
        NSParameterAssert(fullName);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"fullName"] };
            NSError* error = [NSError errorWithDomain:kOAIUsersApiErrorDomain code:kOAIUsersApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/users"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (email != nil) {
        queryParams[@"email"] = email;
    }
    if (password != nil) {
        queryParams[@"password"] = password;
    }
    if (fullName != nil) {
        queryParams[@"full_name"] = fullName;
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
/// Create a user group
/// Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 
///  @param name The name of the user group.  
///
///  @param _description The description of the user group.  
///
///  @param members An array containing the user IDs of the initial members for the new user group.  
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) createUserGroupWithName: (NSString*) name
    _description: (NSString*) _description
    members: (NSArray<NSNumber*>*) members
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'name' is set
    if (name == nil) {
        NSParameterAssert(name);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"name"] };
            NSError* error = [NSError errorWithDomain:kOAIUsersApiErrorDomain code:kOAIUsersApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter '_description' is set
    if (_description == nil) {
        NSParameterAssert(_description);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"_description"] };
            NSError* error = [NSError errorWithDomain:kOAIUsersApiErrorDomain code:kOAIUsersApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'members' is set
    if (members == nil) {
        NSParameterAssert(members);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"members"] };
            NSError* error = [NSError errorWithDomain:kOAIUsersApiErrorDomain code:kOAIUsersApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user_groups/create"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (name != nil) {
        queryParams[@"name"] = name;
    }
    if (_description != nil) {
        queryParams[@"description"] = _description;
    }
    if (members != nil) {
        queryParams[@"members"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: members format: @"multi"];
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
/// Deactivate own user
/// Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) deactivateOwnUserWithCompletionHandler: 
    (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/users/me"];

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
/// Deactivate a user
/// [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 
///  @param userId The target user's ID.  
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) deactivateUserWithUserId: (NSNumber*) userId
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'userId' is set
    if (userId == nil) {
        NSParameterAssert(userId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"userId"] };
            NSError* error = [NSError errorWithDomain:kOAIUsersApiErrorDomain code:kOAIUsersApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/users/{user_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (userId != nil) {
        pathParams[@"user_id"] = userId;
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
/// Get attachments
/// Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) getAttachmentsWithCompletionHandler: 
    (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/attachments"];

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
/// Get own user
/// Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) getOwnUserWithCompletionHandler: 
    (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/users/me"];

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
/// Get a user
/// Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
///  @param userId The target user's ID.  
///
///  @param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional, default to @(NO))
///
///  @param includeCustomProfileFields Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  (optional, default to @(NO))
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) getUserWithUserId: (NSNumber*) userId
    clientGravatar: (NSNumber*) clientGravatar
    includeCustomProfileFields: (NSNumber*) includeCustomProfileFields
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    // verify the required parameter 'userId' is set
    if (userId == nil) {
        NSParameterAssert(userId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"userId"] };
            NSError* error = [NSError errorWithDomain:kOAIUsersApiErrorDomain code:kOAIUsersApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/users/{user_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (userId != nil) {
        pathParams[@"user_id"] = userId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (clientGravatar != nil) {
        queryParams[@"client_gravatar"] = [clientGravatar isEqual:@(YES)] ? @"true" : @"false";
    }
    if (includeCustomProfileFields != nil) {
        queryParams[@"include_custom_profile_fields"] = [includeCustomProfileFields isEqual:@(YES)] ? @"true" : @"false";
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
/// Get a user by email
/// Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
///  @param email The email address of the user whose details you want to fetch.  
///
///  @param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional, default to @(NO))
///
///  @param includeCustomProfileFields Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  (optional, default to @(NO))
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) getUserByEmailWithEmail: (NSString*) email
    clientGravatar: (NSNumber*) clientGravatar
    includeCustomProfileFields: (NSNumber*) includeCustomProfileFields
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    // verify the required parameter 'email' is set
    if (email == nil) {
        NSParameterAssert(email);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"email"] };
            NSError* error = [NSError errorWithDomain:kOAIUsersApiErrorDomain code:kOAIUsersApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/users/{email}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (email != nil) {
        pathParams[@"email"] = email;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (clientGravatar != nil) {
        queryParams[@"client_gravatar"] = [clientGravatar isEqual:@(YES)] ? @"true" : @"false";
    }
    if (includeCustomProfileFields != nil) {
        queryParams[@"include_custom_profile_fields"] = [includeCustomProfileFields isEqual:@(YES)] ? @"true" : @"false";
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
/// Get user groups
/// {!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) getUserGroupsWithCompletionHandler: 
    (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user_groups"];

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
/// Get user presence
/// Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
///  @param userIdOrEmail The user_id or Zulip display email address of the user whose presence you want to fetch.  **Changes**: New in Zulip 4.0 (feature level 43). Previous versions only supported identifying the user by Zulip display email.  
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) getUserPresenceWithUserIdOrEmail: (NSString*) userIdOrEmail
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    // verify the required parameter 'userIdOrEmail' is set
    if (userIdOrEmail == nil) {
        NSParameterAssert(userIdOrEmail);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"userIdOrEmail"] };
            NSError* error = [NSError errorWithDomain:kOAIUsersApiErrorDomain code:kOAIUsersApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/users/{user_id_or_email}/presence"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (userIdOrEmail != nil) {
        pathParams[@"user_id_or_email"] = userIdOrEmail;
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
/// Get all users
/// Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 
///  @param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (optional, default to @(NO))
///
///  @param includeCustomProfileFields Whether the client wants [custom profile field](/help/add-custom-profile-fields) data to be included in the response.  **Changes**: New in Zulip 2.1.0.  Previous versions do no offer these data via the API.  (optional, default to @(NO))
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) getUsersWithClientGravatar: (NSNumber*) clientGravatar
    includeCustomProfileFields: (NSNumber*) includeCustomProfileFields
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/users"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (clientGravatar != nil) {
        queryParams[@"client_gravatar"] = [clientGravatar isEqual:@(YES)] ? @"true" : @"false";
    }
    if (includeCustomProfileFields != nil) {
        queryParams[@"include_custom_profile_fields"] = [includeCustomProfileFields isEqual:@(YES)] ? @"true" : @"false";
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
/// Mute a user
/// This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
///  @param mutedUserId The ID of the user to mute/un-mute.  
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) muteUserWithMutedUserId: (NSNumber*) mutedUserId
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'mutedUserId' is set
    if (mutedUserId == nil) {
        NSParameterAssert(mutedUserId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"mutedUserId"] };
            NSError* error = [NSError errorWithDomain:kOAIUsersApiErrorDomain code:kOAIUsersApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/users/me/muted_users/{muted_user_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (mutedUserId != nil) {
        pathParams[@"muted_user_id"] = mutedUserId;
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
/// Reactivate a user
/// [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 
///  @param userId The target user's ID.  
///
///  @returns OAIAnyType*
///
-(NSURLSessionTask*) reactivateUserWithUserId: (NSNumber*) userId
    completionHandler: (void (^)(OAIAnyType* output, NSError* error)) handler {
    // verify the required parameter 'userId' is set
    if (userId == nil) {
        NSParameterAssert(userId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"userId"] };
            NSError* error = [NSError errorWithDomain:kOAIUsersApiErrorDomain code:kOAIUsersApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/users/{user_id}/reactivate"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (userId != nil) {
        pathParams[@"user_id"] = userId;
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
                              responseType: @"OAIAnyType*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAnyType*)data, error);
                                }
                            }];
}

///
/// Delete a user group
/// Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 
///  @param userGroupId The ID of the target user group.  
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) removeUserGroupWithUserGroupId: (NSNumber*) userGroupId
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'userGroupId' is set
    if (userGroupId == nil) {
        NSParameterAssert(userGroupId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"userGroupId"] };
            NSError* error = [NSError errorWithDomain:kOAIUsersApiErrorDomain code:kOAIUsersApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user_groups/{user_group_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (userGroupId != nil) {
        pathParams[@"user_group_id"] = userGroupId;
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
/// Set \"typing\" status
/// Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 
///  @param op Whether the user has started (`start`) or stopped (`stop`) to type.  
///
///  @param to For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11).  
///
///  @param type Type of the message being composed.  (optional, default to @"private")
///
///  @param topic Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type.  (optional)
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) setTypingStatusWithOp: (NSString*) op
    to: (NSArray<NSNumber*>*) to
    type: (NSString*) type
    topic: (NSString*) topic
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'op' is set
    if (op == nil) {
        NSParameterAssert(op);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"op"] };
            NSError* error = [NSError errorWithDomain:kOAIUsersApiErrorDomain code:kOAIUsersApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'to' is set
    if (to == nil) {
        NSParameterAssert(to);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"to"] };
            NSError* error = [NSError errorWithDomain:kOAIUsersApiErrorDomain code:kOAIUsersApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/typing"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (type != nil) {
        queryParams[@"type"] = type;
    }
    if (op != nil) {
        queryParams[@"op"] = op;
    }
    if (to != nil) {
        queryParams[@"to"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: to format: @"multi"];
    }
    if (topic != nil) {
        queryParams[@"topic"] = topic;
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
/// Unmute a user
/// This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 
///  @param mutedUserId The ID of the user to mute/un-mute.  
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) unmuteUserWithMutedUserId: (NSNumber*) mutedUserId
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'mutedUserId' is set
    if (mutedUserId == nil) {
        NSParameterAssert(mutedUserId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"mutedUserId"] };
            NSError* error = [NSError errorWithDomain:kOAIUsersApiErrorDomain code:kOAIUsersApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/users/me/muted_users/{muted_user_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (mutedUserId != nil) {
        pathParams[@"muted_user_id"] = mutedUserId;
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
/// Update settings
/// This endpoint is used to edit the current user's settings.  `PATCH {{ api_url }}/v1/settings`  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the `full_name`, `email`, `old_password`, and `new_password` parameters. Notification settings were managed by `PATCH /settings/notifications`, and all other settings by `PATCH /settings/display`. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for `/settings` in Zulip 5.0 (feature level 78).  The `/settings/display` and `/settings/notifications` endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 
///  @param fullName A new display name for the user.  (optional)
///
///  @param email Asks the server to initiate a confirmation sequence to change the user's email address to the indicated value. The user will need to demonstrate control of the new email address by clicking a confirmation link sent to that address.  (optional)
///
///  @param oldPassword The user's old Zulip password (or LDAP password, if LDAP authentication is in use).  Required only when sending the `new_password` parameter.  (optional)
///
///  @param varNewPassword The user's new Zulip password (or LDAP password, if LDAP authentication is in use).  The `old_password` parameter must be included in the request.  (optional)
///
///  @param twentyFourHourTime Whether time should be [displayed in 24-hour notation](/help/change-the-time-format).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
///
///  @param denseMode This setting has no effect at present.  It is reserved for use in controlling the default font size in Zulip.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
///
///  @param starredMessageCounts Whether clients should display the [number of starred messages](/help/star-a-message#display-the-number-of-starred-messages).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
///
///  @param fluidLayoutWidth Whether to use the [maximum available screen width](/help/enable-full-width-display) for the web app's center panel (message feed, recent topics) on wide screens.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
///
///  @param highContrastMode This setting is reserved for use to control variations in Zulip's design to help visually impaired users.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
///
///  @param colorScheme Controls which [color theme](/help/night-mode) to use.  * 1 - Automatic * 2 - Night mode * 3 - Day mode  Automatic detection is implementing using the standard `prefers-color-scheme` media query.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
///
///  @param enableDraftsSynchronization A boolean parameter to control whether synchronizing drafts is enabled for the user. When synchronization is disabled, all drafts stored in the server will be automatically deleted from the server.  This does not do anything (like sending events) to delete local copies of drafts stored in clients.  **Changes**: New in Zulip 5.0 (feature level 87).  (optional)
///
///  @param translateEmoticons Whether to [translate emoticons to emoji](/help/enable-emoticon-translations) in messages the user sends.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
///
///  @param defaultLanguage What [default language](/help/change-your-language) to use for the account.  This controls both the Zulip UI as well as email notifications sent to the user.  The value needs to be a standard language code that the Zulip server has translation data for; for example, `\"en\"` for English or `\"de\"` for German.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63).  (optional)
///
///  @param defaultView The [default view](/help/change-default-view) used when opening a new Zulip web app window or hitting the `Esc` keyboard shortcut repeatedly.  * \"recent_topics\" - Recent topics view * \"all_messages\" - All messages view  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  (optional)
///
///  @param leftSideUserlist Whether the users list on left sidebar in narrow windows.  This feature is not heavily used and is likely to be reworked.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
///
///  @param emojiset The user's configured [emoji set](/help/emoji-and-emoticons#use-emoticons), used to display emoji to the user everything they appear in the UI.  * \"google\" - Google modern * \"google-blob\" - Google classic * \"twitter\" - Twitter * \"text\" - Plain text  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  (optional)
///
///  @param demoteInactiveStreams Whether to [demote inactive streams](/help/manage-inactive-streams) in the left sidebar.  * 1 - Automatic * 2 - Always * 3 - Never  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  (optional)
///
///  @param timezone The user's [configured timezone](/help/change-your-timezone).  Timezone values supported by the server are served at [/static/generated/timezones.json](/static/generated/timezones.json).  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/display` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 64).  (optional)
///
///  @param enableStreamDesktopNotifications Enable visual desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
///
///  @param enableStreamEmailNotifications Enable email notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
///
///  @param enableStreamPushNotifications Enable mobile notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
///
///  @param enableStreamAudibleNotifications Enable audible desktop notifications for stream messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
///
///  @param notificationSound Notification sound name.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  Unnecessary JSON-encoding of this parameter was removed in Zulip 4.0 (feature level 63).  (optional)
///
///  @param enableDesktopNotifications Enable visual desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
///
///  @param enableSounds Enable audible desktop notifications for private messages and @-mentions.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
///
///  @param emailNotificationsBatchingPeriodSeconds The duration (in seconds) for which the server should wait to batch email notifications before sending them.  **Changes**: New in Zulip 5.0 (feature level 82)  (optional)
///
///  @param enableOfflineEmailNotifications Enable email notifications for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
///
///  @param enableOfflinePushNotifications Enable mobile notification for private messages and @-mentions received when the user is offline.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
///
///  @param enableOnlinePushNotifications Enable mobile notification for private messages and @-mentions received when the user is online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
///
///  @param enableDigestEmails Enable digest emails when the user is away.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
///
///  @param enableMarketingEmails Enable marketing emails. Has no function outside Zulip Cloud.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
///
///  @param enableLoginEmails Enable email notifications for new logins to account.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
///
///  @param messageContentInEmailNotifications Include the message's content in email notifications for new messages.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
///
///  @param pmContentInDesktopNotifications Include content of private messages in desktop notifications.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
///
///  @param wildcardMentionsNotify Whether wildcard mentions (E.g. @**all**) should send notifications like a personal mention.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
///
///  @param desktopIconCountDisplay Unread count summary (appears in desktop sidebar and browser tab)  * 1 - All unreads * 2 - Private messages and mentions * 3 - None  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
///
///  @param realmNameInNotifications Include organization name in subject of message notification emails.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
///
///  @param presenceEnabled Display the presence status to other users when online.  **Changes**: Before Zulip 5.0 (feature level 80), this setting was managed by the `PATCH /settings/notifications` endpoint.  (optional)
///
///  @param enterSends Whether pressing Enter in the compose box sends a message (or saves a message edit).  **Changes**: Before Zulip 5.0 (feature level 81), this setting was managed by the `POST /users/me/enter-sends` endpoint, with the same parameter format.  (optional)
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) updateSettingsWithFullName: (NSString*) fullName
    email: (NSString*) email
    oldPassword: (NSString*) oldPassword
    varNewPassword: (NSString*) varNewPassword
    twentyFourHourTime: (NSNumber*) twentyFourHourTime
    denseMode: (NSNumber*) denseMode
    starredMessageCounts: (NSNumber*) starredMessageCounts
    fluidLayoutWidth: (NSNumber*) fluidLayoutWidth
    highContrastMode: (NSNumber*) highContrastMode
    colorScheme: (NSNumber*) colorScheme
    enableDraftsSynchronization: (NSNumber*) enableDraftsSynchronization
    translateEmoticons: (NSNumber*) translateEmoticons
    defaultLanguage: (NSString*) defaultLanguage
    defaultView: (NSString*) defaultView
    leftSideUserlist: (NSNumber*) leftSideUserlist
    emojiset: (NSString*) emojiset
    demoteInactiveStreams: (NSNumber*) demoteInactiveStreams
    timezone: (NSString*) timezone
    enableStreamDesktopNotifications: (NSNumber*) enableStreamDesktopNotifications
    enableStreamEmailNotifications: (NSNumber*) enableStreamEmailNotifications
    enableStreamPushNotifications: (NSNumber*) enableStreamPushNotifications
    enableStreamAudibleNotifications: (NSNumber*) enableStreamAudibleNotifications
    notificationSound: (NSString*) notificationSound
    enableDesktopNotifications: (NSNumber*) enableDesktopNotifications
    enableSounds: (NSNumber*) enableSounds
    emailNotificationsBatchingPeriodSeconds: (NSNumber*) emailNotificationsBatchingPeriodSeconds
    enableOfflineEmailNotifications: (NSNumber*) enableOfflineEmailNotifications
    enableOfflinePushNotifications: (NSNumber*) enableOfflinePushNotifications
    enableOnlinePushNotifications: (NSNumber*) enableOnlinePushNotifications
    enableDigestEmails: (NSNumber*) enableDigestEmails
    enableMarketingEmails: (NSNumber*) enableMarketingEmails
    enableLoginEmails: (NSNumber*) enableLoginEmails
    messageContentInEmailNotifications: (NSNumber*) messageContentInEmailNotifications
    pmContentInDesktopNotifications: (NSNumber*) pmContentInDesktopNotifications
    wildcardMentionsNotify: (NSNumber*) wildcardMentionsNotify
    desktopIconCountDisplay: (NSNumber*) desktopIconCountDisplay
    realmNameInNotifications: (NSNumber*) realmNameInNotifications
    presenceEnabled: (NSNumber*) presenceEnabled
    enterSends: (NSNumber*) enterSends
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/settings"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (fullName != nil) {
        queryParams[@"full_name"] = fullName;
    }
    if (email != nil) {
        queryParams[@"email"] = email;
    }
    if (oldPassword != nil) {
        queryParams[@"old_password"] = oldPassword;
    }
    if (varNewPassword != nil) {
        queryParams[@"new_password"] = varNewPassword;
    }
    if (twentyFourHourTime != nil) {
        queryParams[@"twenty_four_hour_time"] = [twentyFourHourTime isEqual:@(YES)] ? @"true" : @"false";
    }
    if (denseMode != nil) {
        queryParams[@"dense_mode"] = [denseMode isEqual:@(YES)] ? @"true" : @"false";
    }
    if (starredMessageCounts != nil) {
        queryParams[@"starred_message_counts"] = [starredMessageCounts isEqual:@(YES)] ? @"true" : @"false";
    }
    if (fluidLayoutWidth != nil) {
        queryParams[@"fluid_layout_width"] = [fluidLayoutWidth isEqual:@(YES)] ? @"true" : @"false";
    }
    if (highContrastMode != nil) {
        queryParams[@"high_contrast_mode"] = [highContrastMode isEqual:@(YES)] ? @"true" : @"false";
    }
    if (colorScheme != nil) {
        queryParams[@"color_scheme"] = colorScheme;
    }
    if (enableDraftsSynchronization != nil) {
        queryParams[@"enable_drafts_synchronization"] = [enableDraftsSynchronization isEqual:@(YES)] ? @"true" : @"false";
    }
    if (translateEmoticons != nil) {
        queryParams[@"translate_emoticons"] = [translateEmoticons isEqual:@(YES)] ? @"true" : @"false";
    }
    if (defaultLanguage != nil) {
        queryParams[@"default_language"] = defaultLanguage;
    }
    if (defaultView != nil) {
        queryParams[@"default_view"] = defaultView;
    }
    if (leftSideUserlist != nil) {
        queryParams[@"left_side_userlist"] = [leftSideUserlist isEqual:@(YES)] ? @"true" : @"false";
    }
    if (emojiset != nil) {
        queryParams[@"emojiset"] = emojiset;
    }
    if (demoteInactiveStreams != nil) {
        queryParams[@"demote_inactive_streams"] = demoteInactiveStreams;
    }
    if (timezone != nil) {
        queryParams[@"timezone"] = timezone;
    }
    if (enableStreamDesktopNotifications != nil) {
        queryParams[@"enable_stream_desktop_notifications"] = [enableStreamDesktopNotifications isEqual:@(YES)] ? @"true" : @"false";
    }
    if (enableStreamEmailNotifications != nil) {
        queryParams[@"enable_stream_email_notifications"] = [enableStreamEmailNotifications isEqual:@(YES)] ? @"true" : @"false";
    }
    if (enableStreamPushNotifications != nil) {
        queryParams[@"enable_stream_push_notifications"] = [enableStreamPushNotifications isEqual:@(YES)] ? @"true" : @"false";
    }
    if (enableStreamAudibleNotifications != nil) {
        queryParams[@"enable_stream_audible_notifications"] = [enableStreamAudibleNotifications isEqual:@(YES)] ? @"true" : @"false";
    }
    if (notificationSound != nil) {
        queryParams[@"notification_sound"] = notificationSound;
    }
    if (enableDesktopNotifications != nil) {
        queryParams[@"enable_desktop_notifications"] = [enableDesktopNotifications isEqual:@(YES)] ? @"true" : @"false";
    }
    if (enableSounds != nil) {
        queryParams[@"enable_sounds"] = [enableSounds isEqual:@(YES)] ? @"true" : @"false";
    }
    if (emailNotificationsBatchingPeriodSeconds != nil) {
        queryParams[@"email_notifications_batching_period_seconds"] = emailNotificationsBatchingPeriodSeconds;
    }
    if (enableOfflineEmailNotifications != nil) {
        queryParams[@"enable_offline_email_notifications"] = [enableOfflineEmailNotifications isEqual:@(YES)] ? @"true" : @"false";
    }
    if (enableOfflinePushNotifications != nil) {
        queryParams[@"enable_offline_push_notifications"] = [enableOfflinePushNotifications isEqual:@(YES)] ? @"true" : @"false";
    }
    if (enableOnlinePushNotifications != nil) {
        queryParams[@"enable_online_push_notifications"] = [enableOnlinePushNotifications isEqual:@(YES)] ? @"true" : @"false";
    }
    if (enableDigestEmails != nil) {
        queryParams[@"enable_digest_emails"] = [enableDigestEmails isEqual:@(YES)] ? @"true" : @"false";
    }
    if (enableMarketingEmails != nil) {
        queryParams[@"enable_marketing_emails"] = [enableMarketingEmails isEqual:@(YES)] ? @"true" : @"false";
    }
    if (enableLoginEmails != nil) {
        queryParams[@"enable_login_emails"] = [enableLoginEmails isEqual:@(YES)] ? @"true" : @"false";
    }
    if (messageContentInEmailNotifications != nil) {
        queryParams[@"message_content_in_email_notifications"] = [messageContentInEmailNotifications isEqual:@(YES)] ? @"true" : @"false";
    }
    if (pmContentInDesktopNotifications != nil) {
        queryParams[@"pm_content_in_desktop_notifications"] = [pmContentInDesktopNotifications isEqual:@(YES)] ? @"true" : @"false";
    }
    if (wildcardMentionsNotify != nil) {
        queryParams[@"wildcard_mentions_notify"] = [wildcardMentionsNotify isEqual:@(YES)] ? @"true" : @"false";
    }
    if (desktopIconCountDisplay != nil) {
        queryParams[@"desktop_icon_count_display"] = desktopIconCountDisplay;
    }
    if (realmNameInNotifications != nil) {
        queryParams[@"realm_name_in_notifications"] = [realmNameInNotifications isEqual:@(YES)] ? @"true" : @"false";
    }
    if (presenceEnabled != nil) {
        queryParams[@"presence_enabled"] = [presenceEnabled isEqual:@(YES)] ? @"true" : @"false";
    }
    if (enterSends != nil) {
        queryParams[@"enter_sends"] = [enterSends isEqual:@(YES)] ? @"true" : @"false";
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

///
/// Update your status
/// Change your [status](/help/status-and-availability).  `POST {{ api_url }}/v1/users/me/status`  A request to this endpoint will only change the parameters passed. For example, passing just `status_text` requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user's status to a specific value should pass all supported parameters. 
///  @param statusText The text content of the status message. Sending the empty string will clear the user's status.  **Note**: The limit on the size of the message is 60 characters.  (optional)
///
///  @param away Whether the user should be marked as \"away\".  (optional)
///
///  @param emojiName The name for the emoji to associate with this status.  (optional)
///
///  @param emojiCode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji.  (optional)
///
///  @param reactionType One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji.  (optional)
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) updateStatusWithStatusText: (NSString*) statusText
    away: (NSNumber*) away
    emojiName: (NSString*) emojiName
    emojiCode: (NSString*) emojiCode
    reactionType: (NSString*) reactionType
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/users/me/status"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (statusText != nil) {
        queryParams[@"status_text"] = statusText;
    }
    if (away != nil) {
        queryParams[@"away"] = [away isEqual:@(YES)] ? @"true" : @"false";
    }
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
/// Update a user
/// Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
///  @param userId The target user's ID.  
///
///  @param fullName The user's full name.  (optional)
///
///  @param role New [role](/help/roles-and-permissions) for the user.  Roles are encoded as:  * Organization owner: 100 * Organization administrator: 200 * Organization moderator: 300 * Member: 400 * Guest: 600  Only organization owners can add or remove the owner role.  The owner role cannot be removed from the only organization owner.  **Changes**: New in Zulip 3.0 (feature level 8), replacing the previous pair of `is_admin` and `is_guest` boolean parameters. Organization moderator role added in Zulip 4.0 (feature level 60).  (optional)
///
///  @param profileData A dictionary containing the to be updated custom profile field data for the user.  (optional)
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) updateUserWithUserId: (NSNumber*) userId
    fullName: (NSString*) fullName
    role: (NSNumber*) role
    profileData: (NSArray<NSObject*>*) profileData
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'userId' is set
    if (userId == nil) {
        NSParameterAssert(userId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"userId"] };
            NSError* error = [NSError errorWithDomain:kOAIUsersApiErrorDomain code:kOAIUsersApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/users/{user_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (userId != nil) {
        pathParams[@"user_id"] = userId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (fullName != nil) {
        queryParams[@"full_name"] = fullName;
    }
    if (role != nil) {
        queryParams[@"role"] = role;
    }
    if (profileData != nil) {
        queryParams[@"profile_data"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: profileData format: @"multi"];
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
/// Update a user group
/// Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 
///  @param userGroupId The ID of the target user group.  
///
///  @param name The new name of the group.  
///
///  @param _description The new description of the group.  
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) updateUserGroupWithUserGroupId: (NSNumber*) userGroupId
    name: (NSString*) name
    _description: (NSString*) _description
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'userGroupId' is set
    if (userGroupId == nil) {
        NSParameterAssert(userGroupId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"userGroupId"] };
            NSError* error = [NSError errorWithDomain:kOAIUsersApiErrorDomain code:kOAIUsersApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'name' is set
    if (name == nil) {
        NSParameterAssert(name);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"name"] };
            NSError* error = [NSError errorWithDomain:kOAIUsersApiErrorDomain code:kOAIUsersApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter '_description' is set
    if (_description == nil) {
        NSParameterAssert(_description);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"_description"] };
            NSError* error = [NSError errorWithDomain:kOAIUsersApiErrorDomain code:kOAIUsersApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user_groups/{user_group_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (userGroupId != nil) {
        pathParams[@"user_group_id"] = userGroupId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (name != nil) {
        queryParams[@"name"] = name;
    }
    if (_description != nil) {
        queryParams[@"description"] = _description;
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
/// Update user group members
/// Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 
///  @param userGroupId The ID of the target user group.  
///
///  @param delete The list of user ids to be removed from the user group.  (optional)
///
///  @param add The list of user ids to be added to the user group.  (optional)
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) updateUserGroupMembersWithUserGroupId: (NSNumber*) userGroupId
    delete: (NSArray<NSNumber*>*) delete
    add: (NSArray<NSNumber*>*) add
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'userGroupId' is set
    if (userGroupId == nil) {
        NSParameterAssert(userGroupId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"userGroupId"] };
            NSError* error = [NSError errorWithDomain:kOAIUsersApiErrorDomain code:kOAIUsersApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user_groups/{user_group_id}/members"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (userGroupId != nil) {
        pathParams[@"user_group_id"] = userGroupId;
    }

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



@end
