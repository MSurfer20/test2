# ZulipRestApi.DraftsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDrafts**](DraftsApi.md#createDrafts) | **POST** /drafts | Create drafts
[**deleteDraft**](DraftsApi.md#deleteDraft) | **DELETE** /drafts/{draft_id} | Delete a draft
[**editDraft**](DraftsApi.md#editDraft) | **PATCH** /drafts/{draft_id} | Edit a draft
[**getDrafts**](DraftsApi.md#getDrafts) | **GET** /drafts | Get drafts



## createDrafts

> JsonSuccess createDrafts(opts)

Create drafts

Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.DraftsApi();
let opts = {
  'drafts': [new ZulipRestApi.Draft()] // [Draft] | A JSON-encoded list of containing new draft objects. 
};
apiInstance.createDrafts(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drafts** | [**[Draft]**](Draft.md)| A JSON-encoded list of containing new draft objects.  | [optional] 

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

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.DraftsApi();
let draftId = 1; // Number | The ID of the draft you want to delete. 
apiInstance.deleteDraft(draftId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **Number**| The ID of the draft you want to delete.  | 

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

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.DraftsApi();
let draftId = 2; // Number | The ID of the draft to be edited. 
let draft = new ZulipRestApi.Draft(); // Draft | A JSON-encoded object containing a replacement draft object for this ID. 
apiInstance.editDraft(draftId, draft, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **Number**| The ID of the draft to be edited.  | 
 **draft** | [**Draft**](.md)| A JSON-encoded object containing a replacement draft object for this ID.  | 

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

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.DraftsApi();
apiInstance.getDrafts((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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

