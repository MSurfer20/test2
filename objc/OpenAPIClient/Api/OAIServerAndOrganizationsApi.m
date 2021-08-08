#import "OAIServerAndOrganizationsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "NSObject*.h"
#import "OAIJsonSuccess.h"
#import "OAIJsonSuccessBase.h"


@interface OAIServerAndOrganizationsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIServerAndOrganizationsApi

NSString* kOAIServerAndOrganizationsApiErrorDomain = @"OAIServerAndOrganizationsApiErrorDomain";
NSInteger kOAIServerAndOrganizationsApiMissingParamErrorCode = 234513;

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
/// Add a code playground
/// Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
///  @param name The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language.  
///
///  @param pygmentsLanguage The name of the Pygments language lexer for that programming language.  
///
///  @param urlPrefix The url prefix for the playground.  
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) addCodePlaygroundWithName: (NSString*) name
    pygmentsLanguage: (NSString*) pygmentsLanguage
    urlPrefix: (NSString*) urlPrefix
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    // verify the required parameter 'name' is set
    if (name == nil) {
        NSParameterAssert(name);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"name"] };
            NSError* error = [NSError errorWithDomain:kOAIServerAndOrganizationsApiErrorDomain code:kOAIServerAndOrganizationsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'pygmentsLanguage' is set
    if (pygmentsLanguage == nil) {
        NSParameterAssert(pygmentsLanguage);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"pygmentsLanguage"] };
            NSError* error = [NSError errorWithDomain:kOAIServerAndOrganizationsApiErrorDomain code:kOAIServerAndOrganizationsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'urlPrefix' is set
    if (urlPrefix == nil) {
        NSParameterAssert(urlPrefix);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"urlPrefix"] };
            NSError* error = [NSError errorWithDomain:kOAIServerAndOrganizationsApiErrorDomain code:kOAIServerAndOrganizationsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/realm/playgrounds"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (name != nil) {
        queryParams[@"name"] = name;
    }
    if (pygmentsLanguage != nil) {
        queryParams[@"pygments_language"] = pygmentsLanguage;
    }
    if (urlPrefix != nil) {
        queryParams[@"url_prefix"] = urlPrefix;
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
/// Add a linkifier
/// Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 
///  @param pattern The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  
///
///  @param urlFormatString The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`.  
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) addLinkifierWithPattern: (NSString*) pattern
    urlFormatString: (NSString*) urlFormatString
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    // verify the required parameter 'pattern' is set
    if (pattern == nil) {
        NSParameterAssert(pattern);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"pattern"] };
            NSError* error = [NSError errorWithDomain:kOAIServerAndOrganizationsApiErrorDomain code:kOAIServerAndOrganizationsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'urlFormatString' is set
    if (urlFormatString == nil) {
        NSParameterAssert(urlFormatString);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"urlFormatString"] };
            NSError* error = [NSError errorWithDomain:kOAIServerAndOrganizationsApiErrorDomain code:kOAIServerAndOrganizationsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/realm/filters"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (pattern != nil) {
        queryParams[@"pattern"] = pattern;
    }
    if (urlFormatString != nil) {
        queryParams[@"url_format_string"] = urlFormatString;
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
/// Create a custom profile field
/// [Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` 
///  @param fieldType The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account  
///
///  @param name The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user's profile.  (optional)
///
///  @param hint The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  (optional)
///
///  @param fieldData Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  (optional)
///
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) createCustomProfileFieldWithFieldType: (NSNumber*) fieldType
    name: (NSString*) name
    hint: (NSString*) hint
    fieldData: (NSObject*) fieldData
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    // verify the required parameter 'fieldType' is set
    if (fieldType == nil) {
        NSParameterAssert(fieldType);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"fieldType"] };
            NSError* error = [NSError errorWithDomain:kOAIServerAndOrganizationsApiErrorDomain code:kOAIServerAndOrganizationsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/realm/profile_fields"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (name != nil) {
        queryParams[@"name"] = name;
    }
    if (hint != nil) {
        queryParams[@"hint"] = hint;
    }
    if (fieldType != nil) {
        queryParams[@"field_type"] = fieldType;
    }
    if (fieldData != nil) {
        queryParams[@"field_data"] = fieldData;
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
/// Get all custom emoji
/// Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` 
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) getCustomEmojiWithCompletionHandler: 
    (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/realm/emoji"];

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
/// Get all custom profile fields
/// Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` 
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) getCustomProfileFieldsWithCompletionHandler: 
    (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/realm/profile_fields"];

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
/// Get linkifiers
/// List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) getLinkifiersWithCompletionHandler: 
    (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/realm/linkifiers"];

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
/// Get server settings
/// Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
///  @returns OAIJsonSuccessBase*
///
-(NSURLSessionTask*) getServerSettingsWithCompletionHandler: 
    (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/server_settings"];

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
/// Remove a code playground
/// Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 
///  @param playgroundId The ID of the playground that you want to remove.  
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) removeCodePlaygroundWithPlaygroundId: (NSNumber*) playgroundId
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'playgroundId' is set
    if (playgroundId == nil) {
        NSParameterAssert(playgroundId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"playgroundId"] };
            NSError* error = [NSError errorWithDomain:kOAIServerAndOrganizationsApiErrorDomain code:kOAIServerAndOrganizationsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/realm/playgrounds/{playground_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (playgroundId != nil) {
        pathParams[@"playground_id"] = playgroundId;
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
/// Remove a linkifier
/// Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 
///  @param filterId The ID of the linkifier that you want to remove.  
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) removeLinkifierWithFilterId: (NSNumber*) filterId
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'filterId' is set
    if (filterId == nil) {
        NSParameterAssert(filterId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"filterId"] };
            NSError* error = [NSError errorWithDomain:kOAIServerAndOrganizationsApiErrorDomain code:kOAIServerAndOrganizationsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/realm/filters/{filter_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (filterId != nil) {
        pathParams[@"filter_id"] = filterId;
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
/// Reorder custom profile fields
/// Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
///  @param order A list of the IDs of all the custom profile fields defined in this organization, in the desired new order.  
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) reorderCustomProfileFieldsWithOrder: (NSArray<NSNumber*>*) order
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'order' is set
    if (order == nil) {
        NSParameterAssert(order);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"order"] };
            NSError* error = [NSError errorWithDomain:kOAIServerAndOrganizationsApiErrorDomain code:kOAIServerAndOrganizationsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/realm/profile_fields"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (order != nil) {
        queryParams[@"order"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: order format: @"multi"];
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
/// Update a linkifier
/// Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 
///  @param filterId The ID of the linkifier that you want to update.  
///
///  @param pattern The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  
///
///  @param urlFormatString The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`.  
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) updateLinkifierWithFilterId: (NSNumber*) filterId
    pattern: (NSString*) pattern
    urlFormatString: (NSString*) urlFormatString
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'filterId' is set
    if (filterId == nil) {
        NSParameterAssert(filterId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"filterId"] };
            NSError* error = [NSError errorWithDomain:kOAIServerAndOrganizationsApiErrorDomain code:kOAIServerAndOrganizationsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'pattern' is set
    if (pattern == nil) {
        NSParameterAssert(pattern);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"pattern"] };
            NSError* error = [NSError errorWithDomain:kOAIServerAndOrganizationsApiErrorDomain code:kOAIServerAndOrganizationsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'urlFormatString' is set
    if (urlFormatString == nil) {
        NSParameterAssert(urlFormatString);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"urlFormatString"] };
            NSError* error = [NSError errorWithDomain:kOAIServerAndOrganizationsApiErrorDomain code:kOAIServerAndOrganizationsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/realm/filters/{filter_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (filterId != nil) {
        pathParams[@"filter_id"] = filterId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (pattern != nil) {
        queryParams[@"pattern"] = pattern;
    }
    if (urlFormatString != nil) {
        queryParams[@"url_format_string"] = urlFormatString;
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
/// Upload custom emoji
/// This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 
///  @param emojiName The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji).  
///
///  @param filename  (optional)
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) uploadCustomEmojiWithEmojiName: (NSString*) emojiName
    filename: (NSURL*) filename
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'emojiName' is set
    if (emojiName == nil) {
        NSParameterAssert(emojiName);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"emojiName"] };
            NSError* error = [NSError errorWithDomain:kOAIServerAndOrganizationsApiErrorDomain code:kOAIServerAndOrganizationsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/realm/emoji/{emoji_name}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (emojiName != nil) {
        pathParams[@"emoji_name"] = emojiName;
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
                              responseType: @"OAIJsonSuccess*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIJsonSuccess*)data, error);
                                }
                            }];
}



@end
