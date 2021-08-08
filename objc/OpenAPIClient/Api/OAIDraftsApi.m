#import "OAIDraftsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAICodedError.h"
#import "OAIDraft.h"
#import "OAIJsonError.h"
#import "OAIJsonSuccess.h"


@interface OAIDraftsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIDraftsApi

NSString* kOAIDraftsApiErrorDomain = @"OAIDraftsApiErrorDomain";
NSInteger kOAIDraftsApiMissingParamErrorCode = 234513;

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
/// Create drafts
/// Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
///  @param drafts A JSON-encoded list of containing new draft objects.  (optional)
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) createDraftsWithDrafts: (NSArray<OAIDraft>*) drafts
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/drafts"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (drafts != nil) {
        queryParams[@"drafts"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: drafts format: @"multi"];
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
/// Delete a draft
/// Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 
///  @param draftId The ID of the draft you want to delete.  
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) deleteDraftWithDraftId: (NSNumber*) draftId
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'draftId' is set
    if (draftId == nil) {
        NSParameterAssert(draftId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"draftId"] };
            NSError* error = [NSError errorWithDomain:kOAIDraftsApiErrorDomain code:kOAIDraftsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/drafts/{draft_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (draftId != nil) {
        pathParams[@"draft_id"] = draftId;
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
/// Edit a draft
/// Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 
///  @param draftId The ID of the draft to be edited.  
///
///  @param draft A JSON-encoded object containing a replacement draft object for this ID.  
///
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) editDraftWithDraftId: (NSNumber*) draftId
    draft: (OAIDraft*) draft
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    // verify the required parameter 'draftId' is set
    if (draftId == nil) {
        NSParameterAssert(draftId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"draftId"] };
            NSError* error = [NSError errorWithDomain:kOAIDraftsApiErrorDomain code:kOAIDraftsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'draft' is set
    if (draft == nil) {
        NSParameterAssert(draft);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"draft"] };
            NSError* error = [NSError errorWithDomain:kOAIDraftsApiErrorDomain code:kOAIDraftsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/drafts/{draft_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (draftId != nil) {
        pathParams[@"draft_id"] = draftId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (draft != nil) {
        queryParams[@"draft"] = draft;
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
/// Get drafts
/// Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 
///  @returns OAIJsonSuccess*
///
-(NSURLSessionTask*) getDraftsWithCompletionHandler: 
    (void (^)(OAIJsonSuccess* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/drafts"];

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
                              responseType: @"OAIJsonSuccess*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIJsonSuccess*)data, error);
                                }
                            }];
}



@end
