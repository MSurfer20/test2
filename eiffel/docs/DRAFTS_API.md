# DRAFTS_API

All URIs are relative to *https://example.zulipchat.com/api/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**create_drafts**](DRAFTS_API.md#create_drafts) | **Post** /drafts | Create drafts
[**delete_draft**](DRAFTS_API.md#delete_draft) | **Delete** /drafts/{draft_id} | Delete a draft
[**drafts**](DRAFTS_API.md#drafts) | **Get** /drafts | Get drafts
[**edit_draft**](DRAFTS_API.md#edit_draft) | **Patch** /drafts/{draft_id} | Edit a draft


# **create_drafts**
> create_drafts (drafts:  detachable LIST [DRAFT] ): detachable JSON_SUCCESS
	

Create drafts

Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drafts** | [**LIST [DRAFT]**](DRAFT.md)| A JSON-encoded list of containing new draft objects.  | [optional] [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_draft**
> delete_draft (draft_id: INTEGER_32 ): detachable JSON_SUCCESS
	

Delete a draft

Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draft_id** | **INTEGER_32**| The ID of the draft you want to delete.  | [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **drafts**
> drafts : detachable JSON_SUCCESS
	

Get drafts

Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 


### Parameters
This endpoint does not need any parameter.

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **edit_draft**
> edit_draft (draft_id: INTEGER_32 ; draft: DRAFT ): detachable JSON_SUCCESS
	

Edit a draft

Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draft_id** | **INTEGER_32**| The ID of the draft to be edited.  | [default to null]
 **draft** | [**DRAFT**](.md)| A JSON-encoded object containing a replacement draft object for this ID.  | [default to null]

### Return type

[**JSON_SUCCESS**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

