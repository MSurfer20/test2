# \DraftsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_drafts**](DraftsApi.md#create_drafts) | **POST** /drafts | Create drafts
[**delete_draft**](DraftsApi.md#delete_draft) | **DELETE** /drafts/{draft_id} | Delete a draft
[**edit_draft**](DraftsApi.md#edit_draft) | **PATCH** /drafts/{draft_id} | Edit a draft
[**get_drafts**](DraftsApi.md#get_drafts) | **GET** /drafts | Get drafts



## create_drafts

> crate::models::JsonSuccess create_drafts(drafts)
Create drafts

Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**drafts** | Option<[**Vec<crate::models::Draft>**](crate::models::Draft.md)> | A JSON-encoded list of containing new draft objects.  |  |

### Return type

[**crate::models::JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_draft

> crate::models::JsonSuccess delete_draft(draft_id)
Delete a draft

Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**draft_id** | **i32** | The ID of the draft you want to delete.  | [required] |

### Return type

[**crate::models::JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## edit_draft

> crate::models::JsonSuccess edit_draft(draft_id, draft)
Edit a draft

Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**draft_id** | **i32** | The ID of the draft to be edited.  | [required] |
**draft** | [**crate::models::Draft**](.md) | A JSON-encoded object containing a replacement draft object for this ID.  | [required] |

### Return type

[**crate::models::JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_drafts

> crate::models::JsonSuccess get_drafts()
Get drafts

Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 

### Parameters

This endpoint does not need any parameter.

### Return type

[**crate::models::JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

