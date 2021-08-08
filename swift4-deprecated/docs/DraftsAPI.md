# DraftsAPI

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDrafts**](DraftsAPI.md#createdrafts) | **POST** /drafts | Create drafts
[**deleteDraft**](DraftsAPI.md#deletedraft) | **DELETE** /drafts/{draft_id} | Delete a draft
[**editDraft**](DraftsAPI.md#editdraft) | **PATCH** /drafts/{draft_id} | Edit a draft
[**getDrafts**](DraftsAPI.md#getdrafts) | **GET** /drafts | Get drafts


# **createDrafts**
```swift
    open class func createDrafts(drafts: [Draft]? = nil, completion: @escaping (_ data: JsonSuccess?, _ error: Error?) -> Void)
```

Create drafts

Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let drafts = [Draft(id: 123, type: "type_example", to: [123], topic: "topic_example", content: "content_example", timestamp: 123)] // [Draft] | A JSON-encoded list of containing new draft objects.  (optional)

// Create drafts
DraftsAPI.createDrafts(drafts: drafts) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drafts** | [**[Draft]**](Draft.md) | A JSON-encoded list of containing new draft objects.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteDraft**
```swift
    open class func deleteDraft(draftId: Int, completion: @escaping (_ data: JsonSuccess?, _ error: Error?) -> Void)
```

Delete a draft

Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let draftId = 987 // Int | The ID of the draft you want to delete. 

// Delete a draft
DraftsAPI.deleteDraft(draftId: draftId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **Int** | The ID of the draft you want to delete.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **editDraft**
```swift
    open class func editDraft(draftId: Int, draft: Draft, completion: @escaping (_ data: JsonSuccess?, _ error: Error?) -> Void)
```

Edit a draft

Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let draftId = 987 // Int | The ID of the draft to be edited. 
let draft = Draft(id: 123, type: "type_example", to: [123], topic: "topic_example", content: "content_example", timestamp: 123) // Draft | A JSON-encoded object containing a replacement draft object for this ID. 

// Edit a draft
DraftsAPI.editDraft(draftId: draftId, draft: draft) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **Int** | The ID of the draft to be edited.  | 
 **draft** | [**Draft**](.md) | A JSON-encoded object containing a replacement draft object for this ID.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDrafts**
```swift
    open class func getDrafts(completion: @escaping (_ data: JsonSuccess?, _ error: Error?) -> Void)
```

Get drafts

Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// Get drafts
DraftsAPI.getDrafts() { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

