# OpenAPI\Server\Api\DraftsApiInterface

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDrafts**](DraftsApiInterface.md#createDrafts) | **POST** /drafts | Create drafts
[**deleteDraft**](DraftsApiInterface.md#deleteDraft) | **DELETE** /drafts/{draft_id} | Delete a draft
[**editDraft**](DraftsApiInterface.md#editDraft) | **PATCH** /drafts/{draft_id} | Edit a draft
[**getDrafts**](DraftsApiInterface.md#getDrafts) | **GET** /drafts | Get drafts


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.drafts:
        class: Acme\MyBundle\Api\DraftsApi
        tags:
            - { name: "open_api_server.api", api: "drafts" }
    # ...
```

## **createDrafts**
> JsonSuccess createDrafts($drafts)

Create drafts

Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/DraftsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\DraftsApiInterface;

class DraftsApi implements DraftsApiInterface
{

    // ...

    /**
     * Implementation of DraftsApiInterface#createDrafts
     */
    public function createDrafts(array $drafts = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drafts** | [**OpenAPI\Server\Model\Draft**](../Model/OpenAPI\Server\Model\Draft.md)| A JSON-encoded list of containing new draft objects. | [optional]

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deleteDraft**
> JsonSuccess deleteDraft($draftId)

Delete a draft

Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/DraftsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\DraftsApiInterface;

class DraftsApi implements DraftsApiInterface
{

    // ...

    /**
     * Implementation of DraftsApiInterface#deleteDraft
     */
    public function deleteDraft($draftId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **int**| The ID of the draft you want to delete. |

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **editDraft**
> JsonSuccess editDraft($draftId, $draft)

Edit a draft

Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/DraftsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\DraftsApiInterface;

class DraftsApi implements DraftsApiInterface
{

    // ...

    /**
     * Implementation of DraftsApiInterface#editDraft
     */
    public function editDraft($draftId, Draft $draft)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **draftId** | **int**| The ID of the draft to be edited. |
 **draft** | [**OpenAPI\Server\Model\Draft**](../Model/.md)| A JSON-encoded object containing a replacement draft object for this ID. |

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getDrafts**
> JsonSuccess getDrafts()

Get drafts

Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/DraftsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\DraftsApiInterface;

class DraftsApi implements DraftsApiInterface
{

    // ...

    /**
     * Implementation of DraftsApiInterface#getDrafts
     */
    public function getDrafts()
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

