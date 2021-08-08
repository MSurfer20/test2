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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drafts** | [**List**](../Models/Draft.md)| A JSON-encoded list of containing new draft objects.  | [optional] [default to null]

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteDraft"></a>
# **deleteDraft**
> JsonSuccess deleteDraft(draft\_id)

Delete a draft

    Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draft\_id** | **Integer**| The ID of the draft you want to delete.  | [default to null]

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="editDraft"></a>
# **editDraft**
> JsonSuccess editDraft(draft\_id, draft)

Edit a draft

    Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draft\_id** | **Integer**| The ID of the draft to be edited.  | [default to null]
 **draft** | [**Draft**](../Models/.md)| A JSON-encoded object containing a replacement draft object for this ID.  | [default to null]

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

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

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccess**](../Models/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

