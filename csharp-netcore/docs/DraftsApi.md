# Org.OpenAPITools.Api.DraftsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateDrafts**](DraftsApi.md#createdrafts) | **POST** /drafts | Create drafts
[**DeleteDraft**](DraftsApi.md#deletedraft) | **DELETE** /drafts/{draft_id} | Delete a draft
[**EditDraft**](DraftsApi.md#editdraft) | **PATCH** /drafts/{draft_id} | Edit a draft
[**GetDrafts**](DraftsApi.md#getdrafts) | **GET** /drafts | Get drafts


<a name="createdrafts"></a>
# **CreateDrafts**
> JsonSuccess CreateDrafts (List<Draft> drafts = null)

Create drafts

Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateDraftsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://example.zulipchat.com/api/v1";
            var apiInstance = new DraftsApi(config);
            var drafts = new List<Draft>(); // List<Draft> | A JSON-encoded list of containing new draft objects.  (optional) 

            try
            {
                // Create drafts
                JsonSuccess result = apiInstance.CreateDrafts(drafts);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DraftsApi.CreateDrafts: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drafts** | [**List&lt;Draft&gt;**](Draft.md)| A JSON-encoded list of containing new draft objects.  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletedraft"></a>
# **DeleteDraft**
> JsonSuccess DeleteDraft (int draftId)

Delete a draft

Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteDraftExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://example.zulipchat.com/api/v1";
            var apiInstance = new DraftsApi(config);
            var draftId = 1;  // int | The ID of the draft you want to delete. 

            try
            {
                // Delete a draft
                JsonSuccess result = apiInstance.DeleteDraft(draftId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DraftsApi.DeleteDraft: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
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


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **404** | Not Found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="editdraft"></a>
# **EditDraft**
> JsonSuccess EditDraft (int draftId, Draft draft)

Edit a draft

Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class EditDraftExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://example.zulipchat.com/api/v1";
            var apiInstance = new DraftsApi(config);
            var draftId = 2;  // int | The ID of the draft to be edited. 
            var draft = new Draft(); // Draft | A JSON-encoded object containing a replacement draft object for this ID. 

            try
            {
                // Edit a draft
                JsonSuccess result = apiInstance.EditDraft(draftId, draft);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DraftsApi.EditDraft: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **int**| The ID of the draft to be edited.  | 
 **draft** | [**Draft**](Draft.md)| A JSON-encoded object containing a replacement draft object for this ID.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **404** | Not Found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdrafts"></a>
# **GetDrafts**
> JsonSuccess GetDrafts ()

Get drafts

Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetDraftsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://example.zulipchat.com/api/v1";
            var apiInstance = new DraftsApi(config);

            try
            {
                // Get drafts
                JsonSuccess result = apiInstance.GetDrafts();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DraftsApi.GetDrafts: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
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


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

