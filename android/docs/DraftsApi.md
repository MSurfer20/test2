# DraftsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDrafts**](DraftsApi.md#createDrafts) | **POST** /drafts | Create drafts
[**deleteDraft**](DraftsApi.md#deleteDraft) | **DELETE** /drafts/{draft_id} | Delete a draft
[**editDraft**](DraftsApi.md#editDraft) | **PATCH** /drafts/{draft_id} | Edit a draft
[**getDrafts**](DraftsApi.md#getDrafts) | **GET** /drafts | Get drafts



## createDrafts

> JsonSuccess createDrafts(drafts)

Create drafts

Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60; 

### Example

```java
// Import classes:
//import org.openapitools.client.api.DraftsApi;

DraftsApi apiInstance = new DraftsApi();
List<Draft> drafts = null; // List<Draft> | A JSON-encoded list of containing new draft objects. 
try {
    JsonSuccess result = apiInstance.createDrafts(drafts);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DraftsApi#createDrafts");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drafts** | [**List&lt;Draft&gt;**](Draft.md)| A JSON-encoded list of containing new draft objects.  | [optional] [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## deleteDraft

> JsonSuccess deleteDraft(draftId)

Delete a draft

Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; 

### Example

```java
// Import classes:
//import org.openapitools.client.api.DraftsApi;

DraftsApi apiInstance = new DraftsApi();
Integer draftId = 1; // Integer | The ID of the draft you want to delete. 
try {
    JsonSuccess result = apiInstance.deleteDraft(draftId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DraftsApi#deleteDraft");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **Integer**| The ID of the draft you want to delete.  | [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## editDraft

> JsonSuccess editDraft(draftId, draft)

Edit a draft

Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; 

### Example

```java
// Import classes:
//import org.openapitools.client.api.DraftsApi;

DraftsApi apiInstance = new DraftsApi();
Integer draftId = 2; // Integer | The ID of the draft to be edited. 
Draft draft = null; // Draft | A JSON-encoded object containing a replacement draft object for this ID. 
try {
    JsonSuccess result = apiInstance.editDraft(draftId, draft);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DraftsApi#editDraft");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **Integer**| The ID of the draft to be edited.  | [default to null]
 **draft** | [**Draft**](.md)| A JSON-encoded object containing a replacement draft object for this ID.  | [default to null]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getDrafts

> JsonSuccess getDrafts()

Get drafts

Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60; 

### Example

```java
// Import classes:
//import org.openapitools.client.api.DraftsApi;

DraftsApi apiInstance = new DraftsApi();
try {
    JsonSuccess result = apiInstance.getDrafts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DraftsApi#getDrafts");
    e.printStackTrace();
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

