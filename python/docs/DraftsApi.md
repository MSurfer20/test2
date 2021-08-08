# openapi_client.DraftsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_drafts**](DraftsApi.md#create_drafts) | **POST** /drafts | Create drafts
[**delete_draft**](DraftsApi.md#delete_draft) | **DELETE** /drafts/{draft_id} | Delete a draft
[**edit_draft**](DraftsApi.md#edit_draft) | **PATCH** /drafts/{draft_id} | Edit a draft
[**get_drafts**](DraftsApi.md#get_drafts) | **GET** /drafts | Get drafts


# **create_drafts**
> dict create_drafts()

Create drafts

Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 

### Example

```python
import time
import openapi_client
from openapi_client.api import drafts_api
from openapi_client.model.draft import Draft
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = drafts_api.DraftsApi(api_client)
    drafts =  # [Draft] | A JSON-encoded list of containing new draft objects.  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Create drafts
        api_response = api_instance.create_drafts(drafts=drafts)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling DraftsApi->create_drafts: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drafts** | [**[Draft]**](Draft.md)| A JSON-encoded list of containing new draft objects.  | [optional]

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Bad request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_draft**
> dict delete_draft(draft_id)

Delete a draft

Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 

### Example

```python
import time
import openapi_client
from openapi_client.api import drafts_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = drafts_api.DraftsApi(api_client)
    draft_id = 1 # int | The ID of the draft you want to delete. 

    # example passing only required values which don't have defaults set
    try:
        # Delete a draft
        api_response = api_instance.delete_draft(draft_id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling DraftsApi->delete_draft: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draft_id** | **int**| The ID of the draft you want to delete.  |

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**404** | Not Found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **edit_draft**
> dict edit_draft(draft_id, draft)

Edit a draft

Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 

### Example

```python
import time
import openapi_client
from openapi_client.api import drafts_api
from openapi_client.model.draft import Draft
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = drafts_api.DraftsApi(api_client)
    draft_id = 2 # int | The ID of the draft to be edited. 
    draft =  # Draft | A JSON-encoded object containing a replacement draft object for this ID. 

    # example passing only required values which don't have defaults set
    try:
        # Edit a draft
        api_response = api_instance.edit_draft(draft_id, draft)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling DraftsApi->edit_draft: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draft_id** | **int**| The ID of the draft to be edited.  |
 **draft** | **Draft**| A JSON-encoded object containing a replacement draft object for this ID.  |

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**404** | Not Found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_drafts**
> dict get_drafts()

Get drafts

Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 

### Example

```python
import time
import openapi_client
from openapi_client.api import drafts_api
from pprint import pprint
# Defining the host is optional and defaults to https://example.zulipchat.com/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://example.zulipchat.com/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = drafts_api.DraftsApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get drafts
        api_response = api_instance.get_drafts()
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling DraftsApi->get_drafts: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

**dict**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

