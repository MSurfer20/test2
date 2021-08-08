# DraftsAPI

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DraftsAPI_createDrafts**](DraftsAPI.md#DraftsAPI_createDrafts) | **POST** /drafts | Create drafts
[**DraftsAPI_deleteDraft**](DraftsAPI.md#DraftsAPI_deleteDraft) | **DELETE** /drafts/{draft_id} | Delete a draft
[**DraftsAPI_editDraft**](DraftsAPI.md#DraftsAPI_editDraft) | **PATCH** /drafts/{draft_id} | Edit a draft
[**DraftsAPI_getDrafts**](DraftsAPI.md#DraftsAPI_getDrafts) | **GET** /drafts | Get drafts


# **DraftsAPI_createDrafts**
```c
// Create drafts
//
// Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
//
json_success_t* DraftsAPI_createDrafts(apiClient_t *apiClient, list_t * drafts);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**drafts** | **[list_t](draft.md) \*** | A JSON-encoded list of containing new draft objects.  | [optional] 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DraftsAPI_deleteDraft**
```c
// Delete a draft
//
// Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 
//
json_success_t* DraftsAPI_deleteDraft(apiClient_t *apiClient, int draft_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**draft_id** | **int** | The ID of the draft you want to delete.  | 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DraftsAPI_editDraft**
```c
// Edit a draft
//
// Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 
//
json_success_t* DraftsAPI_editDraft(apiClient_t *apiClient, int draft_id, draft_t * draft);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 
**draft_id** | **int** | The ID of the draft to be edited.  | 
**draft** | **[draft_t](.md) \*** | A JSON-encoded object containing a replacement draft object for this ID.  | 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DraftsAPI_getDrafts**
```c
// Get drafts
//
// Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 
//
json_success_t* DraftsAPI_getDrafts(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration | 

### Return type

[json_success_t](json_success.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

