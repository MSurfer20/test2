# OpenapiClient::DraftsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**create_drafts**](DraftsApi.md#create_drafts) | **POST** /drafts | Create drafts |
| [**delete_draft**](DraftsApi.md#delete_draft) | **DELETE** /drafts/{draft_id} | Delete a draft |
| [**edit_draft**](DraftsApi.md#edit_draft) | **PATCH** /drafts/{draft_id} | Edit a draft |
| [**get_drafts**](DraftsApi.md#get_drafts) | **GET** /drafts | Get drafts |


## create_drafts

> <JsonSuccess> create_drafts(opts)

Create drafts

Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::DraftsApi.new
opts = {
  drafts: [OpenapiClient::Draft.new({type: 'type_example', to: [37], topic: 'topic_example', content: 'content_example'})] # Array<Draft> | A JSON-encoded list of containing new draft objects. 
}

begin
  # Create drafts
  result = api_instance.create_drafts(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DraftsApi->create_drafts: #{e}"
end
```

#### Using the create_drafts_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> create_drafts_with_http_info(opts)

```ruby
begin
  # Create drafts
  data, status_code, headers = api_instance.create_drafts_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DraftsApi->create_drafts_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **drafts** | [**Array&lt;Draft&gt;**](Draft.md) | A JSON-encoded list of containing new draft objects.  | [optional] |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## delete_draft

> <JsonSuccess> delete_draft(draft_id)

Delete a draft

Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::DraftsApi.new
draft_id = 1 # Integer | The ID of the draft you want to delete. 

begin
  # Delete a draft
  result = api_instance.delete_draft(draft_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DraftsApi->delete_draft: #{e}"
end
```

#### Using the delete_draft_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> delete_draft_with_http_info(draft_id)

```ruby
begin
  # Delete a draft
  data, status_code, headers = api_instance.delete_draft_with_http_info(draft_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DraftsApi->delete_draft_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **draft_id** | **Integer** | The ID of the draft you want to delete.  |  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## edit_draft

> <JsonSuccess> edit_draft(draft_id, draft)

Edit a draft

Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::DraftsApi.new
draft_id = 2 # Integer | The ID of the draft to be edited. 
draft = OpenapiClient::Draft.new({type: 'type_example', to: [37], topic: 'topic_example', content: 'content_example'}) # Draft | A JSON-encoded object containing a replacement draft object for this ID. 

begin
  # Edit a draft
  result = api_instance.edit_draft(draft_id, draft)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DraftsApi->edit_draft: #{e}"
end
```

#### Using the edit_draft_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> edit_draft_with_http_info(draft_id, draft)

```ruby
begin
  # Edit a draft
  data, status_code, headers = api_instance.edit_draft_with_http_info(draft_id, draft)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DraftsApi->edit_draft_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **draft_id** | **Integer** | The ID of the draft to be edited.  |  |
| **draft** | [**Draft**](.md) | A JSON-encoded object containing a replacement draft object for this ID.  |  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_drafts

> <JsonSuccess> get_drafts

Get drafts

Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::DraftsApi.new

begin
  # Get drafts
  result = api_instance.get_drafts
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DraftsApi->get_drafts: #{e}"
end
```

#### Using the get_drafts_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> get_drafts_with_http_info

```ruby
begin
  # Get drafts
  data, status_code, headers = api_instance.get_drafts_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DraftsApi->get_drafts_with_http_info: #{e}"
end
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

