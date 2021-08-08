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
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DraftsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    DraftsApi apiInstance = new DraftsApi(defaultClient);
    List<Draft> drafts = Arrays.asList(); // List<Draft> | A JSON-encoded list of containing new draft objects. 
    try {
      JsonSuccess result = apiInstance.createDrafts(drafts);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DraftsApi#createDrafts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
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
**200** | Success. |  -  |
**400** | Bad request. |  -  |

<a name="deleteDraft"></a>
# **deleteDraft**
> JsonSuccess deleteDraft(draftId)

Delete a draft

Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DraftsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    DraftsApi apiInstance = new DraftsApi(defaultClient);
    Integer draftId = 1; // Integer | The ID of the draft you want to delete. 
    try {
      JsonSuccess result = apiInstance.deleteDraft(draftId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DraftsApi#deleteDraft");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **Integer**| The ID of the draft you want to delete.  |

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
**200** | Success. |  -  |
**404** | Not Found. |  -  |

<a name="editDraft"></a>
# **editDraft**
> JsonSuccess editDraft(draftId, draft)

Edit a draft

Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DraftsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    DraftsApi apiInstance = new DraftsApi(defaultClient);
    Integer draftId = 2; // Integer | The ID of the draft to be edited. 
    Draft draft = new Draft(); // Draft | A JSON-encoded object containing a replacement draft object for this ID. 
    try {
      JsonSuccess result = apiInstance.editDraft(draftId, draft);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DraftsApi#editDraft");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **Integer**| The ID of the draft to be edited.  |
 **draft** | [**Draft**](.md)| A JSON-encoded object containing a replacement draft object for this ID.  |

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
**200** | Success. |  -  |
**404** | Not Found. |  -  |

<a name="getDrafts"></a>
# **getDrafts**
> JsonSuccess getDrafts()

Get drafts

Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60; 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DraftsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.zulipchat.com/api/v1");

    DraftsApi apiInstance = new DraftsApi(defaultClient);
    try {
      JsonSuccess result = apiInstance.getDrafts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DraftsApi#getDrafts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
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
**200** | Success. |  -  |

