# openapi.api.DraftsApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDrafts**](DraftsApi.md#createdrafts) | **POST** /drafts | Create drafts
[**deleteDraft**](DraftsApi.md#deletedraft) | **DELETE** /drafts/{draft_id} | Delete a draft
[**editDraft**](DraftsApi.md#editdraft) | **PATCH** /drafts/{draft_id} | Edit a draft
[**getDrafts**](DraftsApi.md#getdrafts) | **GET** /drafts | Get drafts


# **createDrafts**
> JsonSuccess createDrafts(drafts)

Create drafts

Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 

### Example 
```dart
import 'package:openapi/api.dart';

final api_instance = DraftsApi();
final drafts = []; // List<Draft> | A JSON-encoded list of containing new draft objects. 

try { 
    final result = api_instance.createDrafts(drafts);
    print(result);
} catch (e) {
    print('Exception when calling DraftsApi->createDrafts: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drafts** | [**List<Draft>**](Draft.md)| A JSON-encoded list of containing new draft objects.  | [optional] [default to const []]

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteDraft**
> JsonSuccess deleteDraft(draftId)

Delete a draft

Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 

### Example 
```dart
import 'package:openapi/api.dart';

final api_instance = DraftsApi();
final draftId = 1; // int | The ID of the draft you want to delete. 

try { 
    final result = api_instance.deleteDraft(draftId);
    print(result);
} catch (e) {
    print('Exception when calling DraftsApi->deleteDraft: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **int**| The ID of the draft you want to delete.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **editDraft**
> JsonSuccess editDraft(draftId, draft)

Edit a draft

Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 

### Example 
```dart
import 'package:openapi/api.dart';

final api_instance = DraftsApi();
final draftId = 2; // int | The ID of the draft to be edited. 
final draft = ; // Draft | A JSON-encoded object containing a replacement draft object for this ID. 

try { 
    final result = api_instance.editDraft(draftId, draft);
    print(result);
} catch (e) {
    print('Exception when calling DraftsApi->editDraft: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **int**| The ID of the draft to be edited.  | 
 **draft** | [**Draft**](.md)| A JSON-encoded object containing a replacement draft object for this ID.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getDrafts**
> JsonSuccess getDrafts()

Get drafts

Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 

### Example 
```dart
import 'package:openapi/api.dart';

final api_instance = DraftsApi();

try { 
    final result = api_instance.getDrafts();
    print(result);
} catch (e) {
    print('Exception when calling DraftsApi->getDrafts: $e\n');
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

