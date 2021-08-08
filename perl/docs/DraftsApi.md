# WWW::OpenAPIClient::DraftsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::DraftsApi;
```

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_drafts**](DraftsApi.md#create_drafts) | **POST** /drafts | Create drafts
[**delete_draft**](DraftsApi.md#delete_draft) | **DELETE** /drafts/{draft_id} | Delete a draft
[**edit_draft**](DraftsApi.md#edit_draft) | **PATCH** /drafts/{draft_id} | Edit a draft
[**get_drafts**](DraftsApi.md#get_drafts) | **GET** /drafts | Get drafts


# **create_drafts**
> JsonSuccess create_drafts(drafts => $drafts)

Create drafts

Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DraftsApi;
my $api_instance = WWW::OpenAPIClient::DraftsApi->new(
);

my $drafts = [(new WWW::OpenAPIClient.Draft())]; # ARRAY[Draft] | A JSON-encoded list of containing new draft objects. 

eval { 
    my $result = $api_instance->create_drafts(drafts => $drafts);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DraftsApi->create_drafts: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drafts** | [**ARRAY[Draft]**](Draft.md)| A JSON-encoded list of containing new draft objects.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_draft**
> JsonSuccess delete_draft(draft_id => $draft_id)

Delete a draft

Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DraftsApi;
my $api_instance = WWW::OpenAPIClient::DraftsApi->new(
);

my $draft_id = 1; # int | The ID of the draft you want to delete. 

eval { 
    my $result = $api_instance->delete_draft(draft_id => $draft_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DraftsApi->delete_draft: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draft_id** | **int**| The ID of the draft you want to delete.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **edit_draft**
> JsonSuccess edit_draft(draft_id => $draft_id, draft => $draft)

Edit a draft

Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DraftsApi;
my $api_instance = WWW::OpenAPIClient::DraftsApi->new(
);

my $draft_id = 2; # int | The ID of the draft to be edited. 
my $draft = new WWW::OpenAPIClient.Draft(); # Draft | A JSON-encoded object containing a replacement draft object for this ID. 

eval { 
    my $result = $api_instance->edit_draft(draft_id => $draft_id, draft => $draft);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DraftsApi->edit_draft: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draft_id** | **int**| The ID of the draft to be edited.  | 
 **draft** | [**Draft**](.md)| A JSON-encoded object containing a replacement draft object for this ID.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_drafts**
> JsonSuccess get_drafts()

Get drafts

Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DraftsApi;
my $api_instance = WWW::OpenAPIClient::DraftsApi->new(
);


eval { 
    my $result = $api_instance->get_drafts();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DraftsApi->get_drafts: $@\n";
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

