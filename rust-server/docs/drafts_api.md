# drafts_api

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
**create-drafts**](drafts_api.md#create-drafts) | **POST** /drafts | Create drafts
**delete-draft**](drafts_api.md#delete-draft) | **DELETE** /drafts/{draft_id} | Delete a draft
**edit-draft**](drafts_api.md#edit-draft) | **PATCH** /drafts/{draft_id} | Edit a draft
**get-drafts**](drafts_api.md#get-drafts) | **GET** /drafts | Get drafts


# **create-drafts**
> JsonSuccess create-drafts(optional)
Create drafts

Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drafts** | [**models::Draft**](models::Draft.md)| A JSON-encoded list of containing new draft objects.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete-draft**
> JsonSuccess delete-draft(draft_id)
Delete a draft

Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **draft_id** | **i32**| The ID of the draft you want to delete.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **edit-draft**
> JsonSuccess edit-draft(draft_id, draft)
Edit a draft

Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **draft_id** | **i32**| The ID of the draft to be edited.  | 
  **draft** | [****](.md)| A JSON-encoded object containing a replacement draft object for this ID.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get-drafts**
> JsonSuccess get-drafts()
Get drafts

Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

