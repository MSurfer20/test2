# OAIDraftsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDrafts**](OAIDraftsApi.md#createdrafts) | **POST** /drafts | Create drafts
[**deleteDraft**](OAIDraftsApi.md#deletedraft) | **DELETE** /drafts/{draft_id} | Delete a draft
[**editDraft**](OAIDraftsApi.md#editdraft) | **PATCH** /drafts/{draft_id} | Edit a draft
[**getDrafts**](OAIDraftsApi.md#getdrafts) | **GET** /drafts | Get drafts


# **createDrafts**
```objc
-(NSURLSessionTask*) createDraftsWithDrafts: (NSArray<OAIDraft>*) drafts
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Create drafts

Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 

### Example 
```objc

NSArray<OAIDraft>* drafts = @[[[OAIDraft alloc] init]]; // A JSON-encoded list of containing new draft objects.  (optional)

OAIDraftsApi*apiInstance = [[OAIDraftsApi alloc] init];

// Create drafts
[apiInstance createDraftsWithDrafts:drafts
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIDraftsApi->createDrafts: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drafts** | [**NSArray&lt;OAIDraft&gt;***](OAIDraft*.md)| A JSON-encoded list of containing new draft objects.  | [optional] 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteDraft**
```objc
-(NSURLSessionTask*) deleteDraftWithDraftId: (NSNumber*) draftId
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Delete a draft

Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 

### Example 
```objc

NSNumber* draftId = 1; // The ID of the draft you want to delete. 

OAIDraftsApi*apiInstance = [[OAIDraftsApi alloc] init];

// Delete a draft
[apiInstance deleteDraftWithDraftId:draftId
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIDraftsApi->deleteDraft: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **NSNumber***| The ID of the draft you want to delete.  | 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **editDraft**
```objc
-(NSURLSessionTask*) editDraftWithDraftId: (NSNumber*) draftId
    draft: (OAIDraft*) draft
        completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Edit a draft

Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 

### Example 
```objc

NSNumber* draftId = 2; // The ID of the draft to be edited. 
OAIDraft* draft = [[OAIDraft alloc] init]; // A JSON-encoded object containing a replacement draft object for this ID. 

OAIDraftsApi*apiInstance = [[OAIDraftsApi alloc] init];

// Edit a draft
[apiInstance editDraftWithDraftId:draftId
              draft:draft
          completionHandler: ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIDraftsApi->editDraft: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **NSNumber***| The ID of the draft to be edited.  | 
 **draft** | [**OAIDraft***](.md)| A JSON-encoded object containing a replacement draft object for this ID.  | 

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDrafts**
```objc
-(NSURLSessionTask*) getDraftsWithCompletionHandler: 
        (void (^)(OAIJsonSuccess* output, NSError* error)) handler;
```

Get drafts

Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 

### Example 
```objc


OAIDraftsApi*apiInstance = [[OAIDraftsApi alloc] init];

// Get drafts
[apiInstance getDraftsWithCompletionHandler: 
          ^(OAIJsonSuccess* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIDraftsApi->getDrafts: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIJsonSuccess***](OAIJsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

