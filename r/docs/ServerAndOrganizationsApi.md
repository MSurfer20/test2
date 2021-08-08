# ServerAndOrganizationsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddCodePlayground**](ServerAndOrganizationsApi.md#AddCodePlayground) | **POST** /realm/playgrounds | Add a code playground
[**AddLinkifier**](ServerAndOrganizationsApi.md#AddLinkifier) | **POST** /realm/filters | Add a linkifier
[**CreateCustomProfileField**](ServerAndOrganizationsApi.md#CreateCustomProfileField) | **POST** /realm/profile_fields | Create a custom profile field
[**GetCustomEmoji**](ServerAndOrganizationsApi.md#GetCustomEmoji) | **GET** /realm/emoji | Get all custom emoji
[**GetCustomProfileFields**](ServerAndOrganizationsApi.md#GetCustomProfileFields) | **GET** /realm/profile_fields | Get all custom profile fields
[**GetLinkifiers**](ServerAndOrganizationsApi.md#GetLinkifiers) | **GET** /realm/linkifiers | Get linkifiers
[**GetServerSettings**](ServerAndOrganizationsApi.md#GetServerSettings) | **GET** /server_settings | Get server settings
[**RemoveCodePlayground**](ServerAndOrganizationsApi.md#RemoveCodePlayground) | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground
[**RemoveLinkifier**](ServerAndOrganizationsApi.md#RemoveLinkifier) | **DELETE** /realm/filters/{filter_id} | Remove a linkifier
[**ReorderCustomProfileFields**](ServerAndOrganizationsApi.md#ReorderCustomProfileFields) | **PATCH** /realm/profile_fields | Reorder custom profile fields
[**UpdateLinkifier**](ServerAndOrganizationsApi.md#UpdateLinkifier) | **PATCH** /realm/filters/{filter_id} | Update a linkifier
[**UploadCustomEmoji**](ServerAndOrganizationsApi.md#UploadCustomEmoji) | **POST** /realm/emoji/{emoji_name} | Upload custom emoji


# **AddCodePlayground**
> JsonSuccessBase AddCodePlayground(name, pygments.language, url.prefix)

Add a code playground

Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 

### Example
```R
library(openapi)

var.name <- 'Python playground' # character | The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. 
var.pygments.language <- 'Python' # character | The name of the Pygments language lexer for that programming language. 
var.url.prefix <- 'https://python.example.com' # character | The url prefix for the playground. 

#Add a code playground
api.instance <- ServerAndOrganizationsApi$new()
result <- api.instance$AddCodePlayground(var.name, var.pygments.language, var.url.prefix)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **character**| The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language.  | 
 **pygments.language** | **character**| The name of the Pygments language lexer for that programming language.  | 
 **url.prefix** | **character**| The url prefix for the playground.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

# **AddLinkifier**
> JsonSuccessBase AddLinkifier(pattern, url.format.string)

Add a linkifier

Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 

### Example
```R
library(openapi)

var.pattern <- '#(?P<id>[0-9]+)' # character | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
var.url.format.string <- 'https://github.com/zulip/zulip/issues/%(id)s' # character | The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. 

#Add a linkifier
api.instance <- ServerAndOrganizationsApi$new()
result <- api.instance$AddLinkifier(var.pattern, var.url.format.string)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pattern** | **character**| The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  | 
 **url.format.string** | **character**| The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

# **CreateCustomProfileField**
> JsonSuccessBase CreateCustomProfileField(field.type, name=var.name, hint=var.hint, field.data=var.field.data)

Create a custom profile field

[Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` 

### Example
```R
library(openapi)

var.field.type <- 3 # integer | The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
var.name <- 'Favorite programming language' # character | The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user's profile. 
var.hint <- 'Your favorite programming language.' # character | The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
var.field.data <- NULL # object | Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 

#Create a custom profile field
api.instance <- ServerAndOrganizationsApi$new()
result <- api.instance$CreateCustomProfileField(var.field.type, name=var.name, hint=var.hint, field.data=var.field.data)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **field.type** | **integer**| The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account  | 
 **name** | **character**| The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile.  | [optional] 
 **hint** | **character**| The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  | [optional] 
 **field.data** | [**object**](.md)| Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

# **GetCustomEmoji**
> JsonSuccessBase GetCustomEmoji()

Get all custom emoji

Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` 

### Example
```R
library(openapi)


#Get all custom emoji
api.instance <- ServerAndOrganizationsApi$new()
result <- api.instance$GetCustomEmoji()
dput(result)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

# **GetCustomProfileFields**
> JsonSuccessBase GetCustomProfileFields()

Get all custom profile fields

Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` 

### Example
```R
library(openapi)


#Get all custom profile fields
api.instance <- ServerAndOrganizationsApi$new()
result <- api.instance$GetCustomProfileFields()
dput(result)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

# **GetLinkifiers**
> JsonSuccessBase GetLinkifiers()

Get linkifiers

List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 

### Example
```R
library(openapi)


#Get linkifiers
api.instance <- ServerAndOrganizationsApi$new()
result <- api.instance$GetLinkifiers()
dput(result)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

# **GetServerSettings**
> JsonSuccessBase GetServerSettings()

Get server settings

Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 

### Example
```R
library(openapi)


#Get server settings
api.instance <- ServerAndOrganizationsApi$new()
result <- api.instance$GetServerSettings()
dput(result)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

# **RemoveCodePlayground**
> JsonSuccess RemoveCodePlayground(playground.id)

Remove a code playground

Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 

### Example
```R
library(openapi)

var.playground.id <- 1 # integer | The ID of the playground that you want to remove. 

#Remove a code playground
api.instance <- ServerAndOrganizationsApi$new()
result <- api.instance$RemoveCodePlayground(var.playground.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playground.id** | **integer**| The ID of the playground that you want to remove.  | 

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

# **RemoveLinkifier**
> JsonSuccess RemoveLinkifier(filter.id)

Remove a linkifier

Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 

### Example
```R
library(openapi)

var.filter.id <- 42 # integer | The ID of the linkifier that you want to remove. 

#Remove a linkifier
api.instance <- ServerAndOrganizationsApi$new()
result <- api.instance$RemoveLinkifier(var.filter.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter.id** | **integer**| The ID of the linkifier that you want to remove.  | 

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

# **ReorderCustomProfileFields**
> JsonSuccess ReorderCustomProfileFields(order)

Reorder custom profile fields

Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 

### Example
```R
library(openapi)

var.order <- list(123) # array[integer] | A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. 

#Reorder custom profile fields
api.instance <- ServerAndOrganizationsApi$new()
result <- api.instance$ReorderCustomProfileFields(var.order)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | list( **integer** )| A list of the IDs of all the custom profile fields defined in this organization, in the desired new order.  | 

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

# **UpdateLinkifier**
> JsonSuccess UpdateLinkifier(filter.id, pattern, url.format.string)

Update a linkifier

Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 

### Example
```R
library(openapi)

var.filter.id <- 2 # integer | The ID of the linkifier that you want to update. 
var.pattern <- '#(?P<id>[0-9]+)' # character | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
var.url.format.string <- 'https://github.com/zulip/zulip/issues/%(id)s' # character | The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. 

#Update a linkifier
api.instance <- ServerAndOrganizationsApi$new()
result <- api.instance$UpdateLinkifier(var.filter.id, var.pattern, var.url.format.string)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter.id** | **integer**| The ID of the linkifier that you want to update.  | 
 **pattern** | **character**| The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  | 
 **url.format.string** | **character**| The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;.  | 

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

# **UploadCustomEmoji**
> JsonSuccess UploadCustomEmoji(emoji.name, filename=var.filename)

Upload custom emoji

This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 

### Example
```R
library(openapi)

var.emoji.name <- 'smile' # character | The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). 
var.filename <- File.new('/path/to/file') # data.frame | 

#Upload custom emoji
api.instance <- ServerAndOrganizationsApi$new()
result <- api.instance$UploadCustomEmoji(var.emoji.name, filename=var.filename)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emoji.name** | **character**| The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji).  | 
 **filename** | **data.frame**|  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

