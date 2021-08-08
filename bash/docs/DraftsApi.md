# DraftsApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDrafts**](DraftsApi.md#createDrafts) | **POST** /drafts | Create drafts
[**deleteDraft**](DraftsApi.md#deleteDraft) | **DELETE** /drafts/{draft_id} | Delete a draft
[**editDraft**](DraftsApi.md#editDraft) | **PATCH** /drafts/{draft_id} | Edit a draft
[**getDrafts**](DraftsApi.md#getDrafts) | **GET** /drafts | Get drafts



## createDrafts

Create drafts

Create one or more drafts on the server. These drafts will be automatically
synchronized to other clients via 'drafts' events.

'POST {{ api_url }}/v1/drafts'

### Example

```bash
 createDrafts  Specify as:  drafts=value1 drafts=value2 drafts=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drafts** | [**array[Draft]**](Draft.md) | A JSON-encoded list of containing new draft objects. | [optional] [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## deleteDraft

Delete a draft

Delete a single draft from the server. The deletion will be automatically
synchronized to other clients via a 'drafts' event.

'DELETE {{ api_url }}/v1/drafts/{draft_id}'

### Example

```bash
 deleteDraft draft_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **integer** | The ID of the draft you want to delete. | [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## editDraft

Edit a draft

Edit a draft on the server. The edit will be automatically
synchronized to other clients via 'drafts' events.

'PATCH {{ api_url }}/v1/drafts/{draft_id}'

### Example

```bash
 editDraft draft_id=value  draft=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **integer** | The ID of the draft to be edited. | [default to null]
 **draft** | [**Draft**](.md) | A JSON-encoded object containing a replacement draft object for this ID. | [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getDrafts

Get drafts

Fetch all drafts for the current user.

'GET {{ api_url }}/v1/drafts'

### Example

```bash
 getDrafts
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

