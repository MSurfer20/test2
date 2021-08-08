# DraftsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDrafts**](DraftsApi.md#createDrafts) | **POST** /drafts | Create drafts
[**deleteDraft**](DraftsApi.md#deleteDraft) | **DELETE** /drafts/{draft_id} | Delete a draft
[**editDraft**](DraftsApi.md#editDraft) | **PATCH** /drafts/{draft_id} | Edit a draft
[**getDrafts**](DraftsApi.md#getDrafts) | **GET** /drafts | Get drafts


<a name="createDrafts"></a>
# **createDrafts**
> JsonSuccess createDrafts(drafts)

Create drafts

Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DraftsApi()
val drafts : kotlin.collections.List<Draft> =  // kotlin.collections.List<Draft> | A JSON-encoded list of containing new draft objects. 
try {
    val result : JsonSuccess = apiInstance.createDrafts(drafts)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DraftsApi#createDrafts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DraftsApi#createDrafts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drafts** | [**kotlin.collections.List&lt;Draft&gt;**](Draft.md)| A JSON-encoded list of containing new draft objects.  | [optional]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDraft"></a>
# **deleteDraft**
> JsonSuccess deleteDraft(draftId)

Delete a draft

Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DraftsApi()
val draftId : kotlin.Int = 1 // kotlin.Int | The ID of the draft you want to delete. 
try {
    val result : JsonSuccess = apiInstance.deleteDraft(draftId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DraftsApi#deleteDraft")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DraftsApi#deleteDraft")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **kotlin.Int**| The ID of the draft you want to delete.  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="editDraft"></a>
# **editDraft**
> JsonSuccess editDraft(draftId, draft)

Edit a draft

Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DraftsApi()
val draftId : kotlin.Int = 2 // kotlin.Int | The ID of the draft to be edited. 
val draft : Draft =  // Draft | A JSON-encoded object containing a replacement draft object for this ID. 
try {
    val result : JsonSuccess = apiInstance.editDraft(draftId, draft)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DraftsApi#editDraft")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DraftsApi#editDraft")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **kotlin.Int**| The ID of the draft to be edited.  |
 **draft** | [**Draft**](.md)| A JSON-encoded object containing a replacement draft object for this ID.  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDrafts"></a>
# **getDrafts**
> JsonSuccess getDrafts()

Get drafts

Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60; 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DraftsApi()
try {
    val result : JsonSuccess = apiInstance.getDrafts()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DraftsApi#getDrafts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DraftsApi#getDrafts")
    e.printStackTrace()
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

