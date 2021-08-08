# OpenapiClient::ServerAndOrganizationsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**add_code_playground**](ServerAndOrganizationsApi.md#add_code_playground) | **POST** /realm/playgrounds | Add a code playground |
| [**add_linkifier**](ServerAndOrganizationsApi.md#add_linkifier) | **POST** /realm/filters | Add a linkifier |
| [**create_custom_profile_field**](ServerAndOrganizationsApi.md#create_custom_profile_field) | **POST** /realm/profile_fields | Create a custom profile field |
| [**get_custom_emoji**](ServerAndOrganizationsApi.md#get_custom_emoji) | **GET** /realm/emoji | Get all custom emoji |
| [**get_custom_profile_fields**](ServerAndOrganizationsApi.md#get_custom_profile_fields) | **GET** /realm/profile_fields | Get all custom profile fields |
| [**get_linkifiers**](ServerAndOrganizationsApi.md#get_linkifiers) | **GET** /realm/linkifiers | Get linkifiers |
| [**get_server_settings**](ServerAndOrganizationsApi.md#get_server_settings) | **GET** /server_settings | Get server settings |
| [**remove_code_playground**](ServerAndOrganizationsApi.md#remove_code_playground) | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground |
| [**remove_linkifier**](ServerAndOrganizationsApi.md#remove_linkifier) | **DELETE** /realm/filters/{filter_id} | Remove a linkifier |
| [**reorder_custom_profile_fields**](ServerAndOrganizationsApi.md#reorder_custom_profile_fields) | **PATCH** /realm/profile_fields | Reorder custom profile fields |
| [**update_linkifier**](ServerAndOrganizationsApi.md#update_linkifier) | **PATCH** /realm/filters/{filter_id} | Update a linkifier |
| [**upload_custom_emoji**](ServerAndOrganizationsApi.md#upload_custom_emoji) | **POST** /realm/emoji/{emoji_name} | Upload custom emoji |


## add_code_playground

> <JsonSuccessBase> add_code_playground(name, pygments_language, url_prefix)

Add a code playground

Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::ServerAndOrganizationsApi.new
name = 'Python playground' # String | The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. 
pygments_language = 'Python' # String | The name of the Pygments language lexer for that programming language. 
url_prefix = 'https://python.example.com' # String | The url prefix for the playground. 

begin
  # Add a code playground
  result = api_instance.add_code_playground(name, pygments_language, url_prefix)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ServerAndOrganizationsApi->add_code_playground: #{e}"
end
```

#### Using the add_code_playground_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> add_code_playground_with_http_info(name, pygments_language, url_prefix)

```ruby
begin
  # Add a code playground
  data, status_code, headers = api_instance.add_code_playground_with_http_info(name, pygments_language, url_prefix)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ServerAndOrganizationsApi->add_code_playground_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language.  |  |
| **pygments_language** | **String** | The name of the Pygments language lexer for that programming language.  |  |
| **url_prefix** | **String** | The url prefix for the playground.  |  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## add_linkifier

> <JsonSuccessBase> add_linkifier(pattern, url_format_string)

Add a linkifier

Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::ServerAndOrganizationsApi.new
pattern = '#(?P<id>[0-9]+)' # String | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
url_format_string = 'https://github.com/zulip/zulip/issues/%(id)s' # String | The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. 

begin
  # Add a linkifier
  result = api_instance.add_linkifier(pattern, url_format_string)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ServerAndOrganizationsApi->add_linkifier: #{e}"
end
```

#### Using the add_linkifier_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> add_linkifier_with_http_info(pattern, url_format_string)

```ruby
begin
  # Add a linkifier
  data, status_code, headers = api_instance.add_linkifier_with_http_info(pattern, url_format_string)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ServerAndOrganizationsApi->add_linkifier_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **pattern** | **String** | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  |  |
| **url_format_string** | **String** | The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;.  |  |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## create_custom_profile_field

> <JsonSuccessBase> create_custom_profile_field(field_type, opts)

Create a custom profile field

[Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::ServerAndOrganizationsApi.new
field_type = 3 # Integer | The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
opts = {
  name: 'Favorite programming language', # String | The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user's profile. 
  hint: 'Your favorite programming language.', # String | The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
  field_data: TODO # Object | Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
}

begin
  # Create a custom profile field
  result = api_instance.create_custom_profile_field(field_type, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ServerAndOrganizationsApi->create_custom_profile_field: #{e}"
end
```

#### Using the create_custom_profile_field_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> create_custom_profile_field_with_http_info(field_type, opts)

```ruby
begin
  # Create a custom profile field
  data, status_code, headers = api_instance.create_custom_profile_field_with_http_info(field_type, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ServerAndOrganizationsApi->create_custom_profile_field_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **field_type** | **Integer** | The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account  |  |
| **name** | **String** | The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile.  | [optional] |
| **hint** | **String** | The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  | [optional] |
| **field_data** | [**Object**](.md) | Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  | [optional] |

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_custom_emoji

> <JsonSuccessBase> get_custom_emoji

Get all custom emoji

Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::ServerAndOrganizationsApi.new

begin
  # Get all custom emoji
  result = api_instance.get_custom_emoji
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ServerAndOrganizationsApi->get_custom_emoji: #{e}"
end
```

#### Using the get_custom_emoji_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> get_custom_emoji_with_http_info

```ruby
begin
  # Get all custom emoji
  data, status_code, headers = api_instance.get_custom_emoji_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ServerAndOrganizationsApi->get_custom_emoji_with_http_info: #{e}"
end
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


## get_custom_profile_fields

> <JsonSuccessBase> get_custom_profile_fields

Get all custom profile fields

Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::ServerAndOrganizationsApi.new

begin
  # Get all custom profile fields
  result = api_instance.get_custom_profile_fields
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ServerAndOrganizationsApi->get_custom_profile_fields: #{e}"
end
```

#### Using the get_custom_profile_fields_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> get_custom_profile_fields_with_http_info

```ruby
begin
  # Get all custom profile fields
  data, status_code, headers = api_instance.get_custom_profile_fields_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ServerAndOrganizationsApi->get_custom_profile_fields_with_http_info: #{e}"
end
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


## get_linkifiers

> <JsonSuccessBase> get_linkifiers

Get linkifiers

List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::ServerAndOrganizationsApi.new

begin
  # Get linkifiers
  result = api_instance.get_linkifiers
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ServerAndOrganizationsApi->get_linkifiers: #{e}"
end
```

#### Using the get_linkifiers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> get_linkifiers_with_http_info

```ruby
begin
  # Get linkifiers
  data, status_code, headers = api_instance.get_linkifiers_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ServerAndOrganizationsApi->get_linkifiers_with_http_info: #{e}"
end
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


## get_server_settings

> <JsonSuccessBase> get_server_settings

Get server settings

Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::ServerAndOrganizationsApi.new

begin
  # Get server settings
  result = api_instance.get_server_settings
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ServerAndOrganizationsApi->get_server_settings: #{e}"
end
```

#### Using the get_server_settings_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccessBase>, Integer, Hash)> get_server_settings_with_http_info

```ruby
begin
  # Get server settings
  data, status_code, headers = api_instance.get_server_settings_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccessBase>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ServerAndOrganizationsApi->get_server_settings_with_http_info: #{e}"
end
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


## remove_code_playground

> <JsonSuccess> remove_code_playground(playground_id)

Remove a code playground

Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::ServerAndOrganizationsApi.new
playground_id = 1 # Integer | The ID of the playground that you want to remove. 

begin
  # Remove a code playground
  result = api_instance.remove_code_playground(playground_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ServerAndOrganizationsApi->remove_code_playground: #{e}"
end
```

#### Using the remove_code_playground_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> remove_code_playground_with_http_info(playground_id)

```ruby
begin
  # Remove a code playground
  data, status_code, headers = api_instance.remove_code_playground_with_http_info(playground_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ServerAndOrganizationsApi->remove_code_playground_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **playground_id** | **Integer** | The ID of the playground that you want to remove.  |  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## remove_linkifier

> <JsonSuccess> remove_linkifier(filter_id)

Remove a linkifier

Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::ServerAndOrganizationsApi.new
filter_id = 42 # Integer | The ID of the linkifier that you want to remove. 

begin
  # Remove a linkifier
  result = api_instance.remove_linkifier(filter_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ServerAndOrganizationsApi->remove_linkifier: #{e}"
end
```

#### Using the remove_linkifier_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> remove_linkifier_with_http_info(filter_id)

```ruby
begin
  # Remove a linkifier
  data, status_code, headers = api_instance.remove_linkifier_with_http_info(filter_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ServerAndOrganizationsApi->remove_linkifier_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **filter_id** | **Integer** | The ID of the linkifier that you want to remove.  |  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## reorder_custom_profile_fields

> <JsonSuccess> reorder_custom_profile_fields(order)

Reorder custom profile fields

Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::ServerAndOrganizationsApi.new
order = [37] # Array<Integer> | A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. 

begin
  # Reorder custom profile fields
  result = api_instance.reorder_custom_profile_fields(order)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ServerAndOrganizationsApi->reorder_custom_profile_fields: #{e}"
end
```

#### Using the reorder_custom_profile_fields_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> reorder_custom_profile_fields_with_http_info(order)

```ruby
begin
  # Reorder custom profile fields
  data, status_code, headers = api_instance.reorder_custom_profile_fields_with_http_info(order)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ServerAndOrganizationsApi->reorder_custom_profile_fields_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **order** | [**Array&lt;Integer&gt;**](Integer.md) | A list of the IDs of all the custom profile fields defined in this organization, in the desired new order.  |  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## update_linkifier

> <JsonSuccess> update_linkifier(filter_id, pattern, url_format_string)

Update a linkifier

Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::ServerAndOrganizationsApi.new
filter_id = 2 # Integer | The ID of the linkifier that you want to update. 
pattern = '#(?P<id>[0-9]+)' # String | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
url_format_string = 'https://github.com/zulip/zulip/issues/%(id)s' # String | The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. 

begin
  # Update a linkifier
  result = api_instance.update_linkifier(filter_id, pattern, url_format_string)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ServerAndOrganizationsApi->update_linkifier: #{e}"
end
```

#### Using the update_linkifier_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> update_linkifier_with_http_info(filter_id, pattern, url_format_string)

```ruby
begin
  # Update a linkifier
  data, status_code, headers = api_instance.update_linkifier_with_http_info(filter_id, pattern, url_format_string)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ServerAndOrganizationsApi->update_linkifier_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **filter_id** | **Integer** | The ID of the linkifier that you want to update.  |  |
| **pattern** | **String** | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  |  |
| **url_format_string** | **String** | The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;.  |  |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## upload_custom_emoji

> <JsonSuccess> upload_custom_emoji(emoji_name, opts)

Upload custom emoji

This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::ServerAndOrganizationsApi.new
emoji_name = 'smile' # String | The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). 
opts = {
  filename: File.new('/path/to/some/file') # File | 
}

begin
  # Upload custom emoji
  result = api_instance.upload_custom_emoji(emoji_name, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ServerAndOrganizationsApi->upload_custom_emoji: #{e}"
end
```

#### Using the upload_custom_emoji_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<JsonSuccess>, Integer, Hash)> upload_custom_emoji_with_http_info(emoji_name, opts)

```ruby
begin
  # Upload custom emoji
  data, status_code, headers = api_instance.upload_custom_emoji_with_http_info(emoji_name, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <JsonSuccess>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ServerAndOrganizationsApi->upload_custom_emoji_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **emoji_name** | **String** | The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji).  |  |
| **filename** | **File** |  | [optional] |

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

