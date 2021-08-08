# DraftsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateDrafts**](DraftsApi.md#CreateDrafts) | **POST** /drafts | Create drafts
[**DeleteDraft**](DraftsApi.md#DeleteDraft) | **DELETE** /drafts/{draft_id} | Delete a draft
[**EditDraft**](DraftsApi.md#EditDraft) | **PATCH** /drafts/{draft_id} | Edit a draft
[**GetDrafts**](DraftsApi.md#GetDrafts) | **GET** /drafts | Get drafts


# **CreateDrafts**
> JsonSuccess CreateDrafts(drafts=var.drafts)

Create drafts

Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 

### Example
```R
library(openapi)

var.drafts <- list(Draft$new("", list(123), "topic_example", "content_example", 123, 123)) # array[Draft] | A JSON-encoded list of containing new draft objects. 

#Create drafts
api.instance <- DraftsApi$new()
result <- api.instance$CreateDrafts(drafts=var.drafts)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drafts** | list( [**Draft**](Draft.md) )| A JSON-encoded list of containing new draft objects.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

# **DeleteDraft**
> JsonSuccess DeleteDraft(draft.id)

Delete a draft

Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 

### Example
```R
library(openapi)

var.draft.id <- 1 # integer | The ID of the draft you want to delete. 

#Delete a draft
api.instance <- DraftsApi$new()
result <- api.instance$DeleteDraft(var.draft.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draft.id** | **integer**| The ID of the draft you want to delete.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **404** | Not Found. |  -  |

# **EditDraft**
> JsonSuccess EditDraft(draft.id, draft)

Edit a draft

Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 

### Example
```R
library(openapi)

var.draft.id <- 2 # integer | The ID of the draft to be edited. 
var.draft <- Draft$new("", list(123), "topic_example", "content_example", 123, 123) # Draft | A JSON-encoded object containing a replacement draft object for this ID. 

#Edit a draft
api.instance <- DraftsApi$new()
result <- api.instance$EditDraft(var.draft.id, var.draft)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draft.id** | **integer**| The ID of the draft to be edited.  | 
 **draft** | [**Draft**](.md)| A JSON-encoded object containing a replacement draft object for this ID.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **404** | Not Found. |  -  |

# **GetDrafts**
> JsonSuccess GetDrafts()

Get drafts

Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 

### Example
```R
library(openapi)


#Get drafts
api.instance <- DraftsApi$new()
result <- api.instance$GetDrafts()
dput(result)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

