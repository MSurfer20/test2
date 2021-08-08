# OpenAPI\Server\Api\ServerAndOrganizationsApiInterface

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCodePlayground**](ServerAndOrganizationsApiInterface.md#addCodePlayground) | **POST** /realm/playgrounds | Add a code playground
[**addLinkifier**](ServerAndOrganizationsApiInterface.md#addLinkifier) | **POST** /realm/filters | Add a linkifier
[**createCustomProfileField**](ServerAndOrganizationsApiInterface.md#createCustomProfileField) | **POST** /realm/profile_fields | Create a custom profile field
[**getCustomEmoji**](ServerAndOrganizationsApiInterface.md#getCustomEmoji) | **GET** /realm/emoji | Get all custom emoji
[**getCustomProfileFields**](ServerAndOrganizationsApiInterface.md#getCustomProfileFields) | **GET** /realm/profile_fields | Get all custom profile fields
[**getLinkifiers**](ServerAndOrganizationsApiInterface.md#getLinkifiers) | **GET** /realm/linkifiers | Get linkifiers
[**getServerSettings**](ServerAndOrganizationsApiInterface.md#getServerSettings) | **GET** /server_settings | Get server settings
[**removeCodePlayground**](ServerAndOrganizationsApiInterface.md#removeCodePlayground) | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground
[**removeLinkifier**](ServerAndOrganizationsApiInterface.md#removeLinkifier) | **DELETE** /realm/filters/{filter_id} | Remove a linkifier
[**reorderCustomProfileFields**](ServerAndOrganizationsApiInterface.md#reorderCustomProfileFields) | **PATCH** /realm/profile_fields | Reorder custom profile fields
[**updateLinkifier**](ServerAndOrganizationsApiInterface.md#updateLinkifier) | **PATCH** /realm/filters/{filter_id} | Update a linkifier
[**uploadCustomEmoji**](ServerAndOrganizationsApiInterface.md#uploadCustomEmoji) | **POST** /realm/emoji/{emoji_name} | Upload custom emoji


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.serverAndOrganizations:
        class: Acme\MyBundle\Api\ServerAndOrganizationsApi
        tags:
            - { name: "open_api_server.api", api: "serverAndOrganizations" }
    # ...
```

## **addCodePlayground**
> JsonSuccessBase addCodePlayground($name, $pygmentsLanguage, $urlPrefix)

Add a code playground

Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57).

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ServerAndOrganizationsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ServerAndOrganizationsApiInterface;

class ServerAndOrganizationsApi implements ServerAndOrganizationsApiInterface
{

    // ...

    /**
     * Implementation of ServerAndOrganizationsApiInterface#addCodePlayground
     */
    public function addCodePlayground($name, $pygmentsLanguage, $urlPrefix)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string**| The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. |
 **pygmentsLanguage** | **string**| The name of the Pygments language lexer for that programming language. |
 **urlPrefix** | **string**| The url prefix for the playground. |

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **addLinkifier**
> JsonSuccessBase addLinkifier($pattern, $urlFormatString)

Add a linkifier

Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ServerAndOrganizationsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ServerAndOrganizationsApiInterface;

class ServerAndOrganizationsApi implements ServerAndOrganizationsApiInterface
{

    // ...

    /**
     * Implementation of ServerAndOrganizationsApiInterface#addLinkifier
     */
    public function addLinkifier($pattern, $urlFormatString)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pattern** | **string**| The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. |
 **urlFormatString** | **string**| The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. |

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createCustomProfileField**
> JsonSuccessBase createCustomProfileField($fieldType, $name, $hint, $fieldData)

Create a custom profile field

[Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ServerAndOrganizationsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ServerAndOrganizationsApiInterface;

class ServerAndOrganizationsApi implements ServerAndOrganizationsApiInterface
{

    // ...

    /**
     * Implementation of ServerAndOrganizationsApiInterface#createCustomProfileField
     */
    public function createCustomProfileField($fieldType, $name = null, $hint = null, array $fieldData = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldType** | **int**| The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account |
 **name** | **string**| The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile. | [optional]
 **hint** | **string**| The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. | [optional]
 **fieldData** | [**array**](../Model/.md)| Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. | [optional]

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getCustomEmoji**
> JsonSuccessBase getCustomEmoji()

Get all custom emoji

Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ServerAndOrganizationsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ServerAndOrganizationsApiInterface;

class ServerAndOrganizationsApi implements ServerAndOrganizationsApiInterface
{

    // ...

    /**
     * Implementation of ServerAndOrganizationsApiInterface#getCustomEmoji
     */
    public function getCustomEmoji()
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getCustomProfileFields**
> JsonSuccessBase getCustomProfileFields()

Get all custom profile fields

Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ServerAndOrganizationsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ServerAndOrganizationsApiInterface;

class ServerAndOrganizationsApi implements ServerAndOrganizationsApiInterface
{

    // ...

    /**
     * Implementation of ServerAndOrganizationsApiInterface#getCustomProfileFields
     */
    public function getCustomProfileFields()
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getLinkifiers**
> JsonSuccessBase getLinkifiers()

Get linkifiers

List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ServerAndOrganizationsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ServerAndOrganizationsApiInterface;

class ServerAndOrganizationsApi implements ServerAndOrganizationsApiInterface
{

    // ...

    /**
     * Implementation of ServerAndOrganizationsApiInterface#getLinkifiers
     */
    public function getLinkifiers()
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getServerSettings**
> JsonSuccessBase getServerSettings()

Get server settings

Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available).

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ServerAndOrganizationsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ServerAndOrganizationsApiInterface;

class ServerAndOrganizationsApi implements ServerAndOrganizationsApiInterface
{

    // ...

    /**
     * Implementation of ServerAndOrganizationsApiInterface#getServerSettings
     */
    public function getServerSettings()
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](../Model/JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **removeCodePlayground**
> JsonSuccess removeCodePlayground($playgroundId)

Remove a code playground

Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49).

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ServerAndOrganizationsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ServerAndOrganizationsApiInterface;

class ServerAndOrganizationsApi implements ServerAndOrganizationsApiInterface
{

    // ...

    /**
     * Implementation of ServerAndOrganizationsApiInterface#removeCodePlayground
     */
    public function removeCodePlayground($playgroundId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playgroundId** | **int**| The ID of the playground that you want to remove. |

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **removeLinkifier**
> JsonSuccess removeLinkifier($filterId)

Remove a linkifier

Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ServerAndOrganizationsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ServerAndOrganizationsApiInterface;

class ServerAndOrganizationsApi implements ServerAndOrganizationsApiInterface
{

    // ...

    /**
     * Implementation of ServerAndOrganizationsApiInterface#removeLinkifier
     */
    public function removeLinkifier($filterId)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterId** | **int**| The ID of the linkifier that you want to remove. |

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **reorderCustomProfileFields**
> JsonSuccess reorderCustomProfileFields($order)

Reorder custom profile fields

Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields).

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ServerAndOrganizationsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ServerAndOrganizationsApiInterface;

class ServerAndOrganizationsApi implements ServerAndOrganizationsApiInterface
{

    // ...

    /**
     * Implementation of ServerAndOrganizationsApiInterface#reorderCustomProfileFields
     */
    public function reorderCustomProfileFields(array $order)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**int**](../Model/int.md)| A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. |

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateLinkifier**
> JsonSuccess updateLinkifier($filterId, $pattern, $urlFormatString)

Update a linkifier

Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57).

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ServerAndOrganizationsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ServerAndOrganizationsApiInterface;

class ServerAndOrganizationsApi implements ServerAndOrganizationsApiInterface
{

    // ...

    /**
     * Implementation of ServerAndOrganizationsApiInterface#updateLinkifier
     */
    public function updateLinkifier($filterId, $pattern, $urlFormatString)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterId** | **int**| The ID of the linkifier that you want to update. |
 **pattern** | **string**| The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. |
 **urlFormatString** | **string**| The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;. |

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **uploadCustomEmoji**
> JsonSuccess uploadCustomEmoji($emojiName, $filename)

Upload custom emoji

This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}`

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ServerAndOrganizationsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ServerAndOrganizationsApiInterface;

class ServerAndOrganizationsApi implements ServerAndOrganizationsApiInterface
{

    // ...

    /**
     * Implementation of ServerAndOrganizationsApiInterface#uploadCustomEmoji
     */
    public function uploadCustomEmoji($emojiName, UploadedFile $filename = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emojiName** | **string**| The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). |
 **filename** | **UploadedFile****UploadedFile**|  | [optional]

### Return type

[**JsonSuccess**](../Model/JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

