# \DraftsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateDrafts**](DraftsApi.md#CreateDrafts) | **Post** /drafts | Create drafts
[**DeleteDraft**](DraftsApi.md#DeleteDraft) | **Delete** /drafts/{draft_id} | Delete a draft
[**EditDraft**](DraftsApi.md#EditDraft) | **Patch** /drafts/{draft_id} | Edit a draft
[**GetDrafts**](DraftsApi.md#GetDrafts) | **Get** /drafts | Get drafts



## CreateDrafts

> JsonSuccess CreateDrafts(ctx).Drafts(drafts).Execute()

Create drafts



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    drafts := []openapiclient.Draft{*openapiclient.NewDraft("Type_example", []int32{int32(123)}, "Topic_example", "Content_example")} // []Draft | A JSON-encoded list of containing new draft objects.  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.DraftsApi.CreateDrafts(context.Background()).Drafts(drafts).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DraftsApi.CreateDrafts``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CreateDrafts`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `DraftsApi.CreateDrafts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateDraftsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drafts** | [**[]Draft**](Draft.md) | A JSON-encoded list of containing new draft objects.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteDraft

> JsonSuccess DeleteDraft(ctx, draftId).Execute()

Delete a draft



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    draftId := int32(1) // int32 | The ID of the draft you want to delete. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.DraftsApi.DeleteDraft(context.Background(), draftId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DraftsApi.DeleteDraft``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DeleteDraft`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `DraftsApi.DeleteDraft`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**draftId** | **int32** | The ID of the draft you want to delete.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteDraftRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## EditDraft

> JsonSuccess EditDraft(ctx, draftId).Draft(draft).Execute()

Edit a draft



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    draftId := int32(2) // int32 | The ID of the draft to be edited. 
    draft := *openapiclient.NewDraft("Type_example", []int32{int32(123)}, "Topic_example", "Content_example") // Draft | A JSON-encoded object containing a replacement draft object for this ID. 

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.DraftsApi.EditDraft(context.Background(), draftId).Draft(draft).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DraftsApi.EditDraft``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `EditDraft`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `DraftsApi.EditDraft`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**draftId** | **int32** | The ID of the draft to be edited.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiEditDraftRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **draft** | [**Draft**](Draft.md) | A JSON-encoded object containing a replacement draft object for this ID.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetDrafts

> JsonSuccess GetDrafts(ctx).Execute()

Get drafts



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.DraftsApi.GetDrafts(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DraftsApi.GetDrafts``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetDrafts`: JsonSuccess
    fmt.Fprintf(os.Stdout, "Response from `DraftsApi.GetDrafts`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetDraftsRequest struct via the builder pattern


### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

