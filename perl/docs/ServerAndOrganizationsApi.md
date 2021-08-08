# WWW::OpenAPIClient::ServerAndOrganizationsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ServerAndOrganizationsApi;
```

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_code_playground**](ServerAndOrganizationsApi.md#add_code_playground) | **POST** /realm/playgrounds | Add a code playground
[**add_linkifier**](ServerAndOrganizationsApi.md#add_linkifier) | **POST** /realm/filters | Add a linkifier
[**create_custom_profile_field**](ServerAndOrganizationsApi.md#create_custom_profile_field) | **POST** /realm/profile_fields | Create a custom profile field
[**get_custom_emoji**](ServerAndOrganizationsApi.md#get_custom_emoji) | **GET** /realm/emoji | Get all custom emoji
[**get_custom_profile_fields**](ServerAndOrganizationsApi.md#get_custom_profile_fields) | **GET** /realm/profile_fields | Get all custom profile fields
[**get_linkifiers**](ServerAndOrganizationsApi.md#get_linkifiers) | **GET** /realm/linkifiers | Get linkifiers
[**get_server_settings**](ServerAndOrganizationsApi.md#get_server_settings) | **GET** /server_settings | Get server settings
[**remove_code_playground**](ServerAndOrganizationsApi.md#remove_code_playground) | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground
[**remove_linkifier**](ServerAndOrganizationsApi.md#remove_linkifier) | **DELETE** /realm/filters/{filter_id} | Remove a linkifier
[**reorder_custom_profile_fields**](ServerAndOrganizationsApi.md#reorder_custom_profile_fields) | **PATCH** /realm/profile_fields | Reorder custom profile fields
[**update_linkifier**](ServerAndOrganizationsApi.md#update_linkifier) | **PATCH** /realm/filters/{filter_id} | Update a linkifier
[**upload_custom_emoji**](ServerAndOrganizationsApi.md#upload_custom_emoji) | **POST** /realm/emoji/{emoji_name} | Upload custom emoji


# **add_code_playground**
> JsonSuccessBase add_code_playground(name => $name, pygments_language => $pygments_language, url_prefix => $url_prefix)

Add a code playground

Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ServerAndOrganizationsApi;
my $api_instance = WWW::OpenAPIClient::ServerAndOrganizationsApi->new(
);

my $name = Python playground; # string | The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. 
my $pygments_language = Python; # string | The name of the Pygments language lexer for that programming language. 
my $url_prefix = https://python.example.com; # string | The url prefix for the playground. 

eval { 
    my $result = $api_instance->add_code_playground(name => $name, pygments_language => $pygments_language, url_prefix => $url_prefix);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ServerAndOrganizationsApi->add_code_playground: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string**| The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language.  | 
 **pygments_language** | **string**| The name of the Pygments language lexer for that programming language.  | 
 **url_prefix** | **string**| The url prefix for the playground.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **add_linkifier**
> JsonSuccessBase add_linkifier(pattern => $pattern, url_format_string => $url_format_string)

Add a linkifier

Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ServerAndOrganizationsApi;
my $api_instance = WWW::OpenAPIClient::ServerAndOrganizationsApi->new(
);

my $pattern = #(?P<id>[0-9]+); # string | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
my $url_format_string = https://github.com/zulip/zulip/issues/%(id)s; # string | The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. 

eval { 
    my $result = $api_instance->add_linkifier(pattern => $pattern, url_format_string => $url_format_string);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ServerAndOrganizationsApi->add_linkifier: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pattern** | **string**| The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  | 
 **url_format_string** | **string**| The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_custom_profile_field**
> JsonSuccessBase create_custom_profile_field(field_type => $field_type, name => $name, hint => $hint, field_data => $field_data)

Create a custom profile field

[Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ServerAndOrganizationsApi;
my $api_instance = WWW::OpenAPIClient::ServerAndOrganizationsApi->new(
);

my $field_type = 3; # int | The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
my $name = Favorite programming language; # string | The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user's profile. 
my $hint = Your favorite programming language.; # string | The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
my $field_data = null; # object | Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 

eval { 
    my $result = $api_instance->create_custom_profile_field(field_type => $field_type, name => $name, hint => $hint, field_data => $field_data);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ServerAndOrganizationsApi->create_custom_profile_field: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **field_type** | **int**| The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account  | 
 **name** | **string**| The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile.  | [optional] 
 **hint** | **string**| The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  | [optional] 
 **field_data** | [**object**](.md)| Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_custom_emoji**
> JsonSuccessBase get_custom_emoji()

Get all custom emoji

Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ServerAndOrganizationsApi;
my $api_instance = WWW::OpenAPIClient::ServerAndOrganizationsApi->new(
);


eval { 
    my $result = $api_instance->get_custom_emoji();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ServerAndOrganizationsApi->get_custom_emoji: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_custom_profile_fields**
> JsonSuccessBase get_custom_profile_fields()

Get all custom profile fields

Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ServerAndOrganizationsApi;
my $api_instance = WWW::OpenAPIClient::ServerAndOrganizationsApi->new(
);


eval { 
    my $result = $api_instance->get_custom_profile_fields();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ServerAndOrganizationsApi->get_custom_profile_fields: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_linkifiers**
> JsonSuccessBase get_linkifiers()

Get linkifiers

List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ServerAndOrganizationsApi;
my $api_instance = WWW::OpenAPIClient::ServerAndOrganizationsApi->new(
);


eval { 
    my $result = $api_instance->get_linkifiers();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ServerAndOrganizationsApi->get_linkifiers: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_server_settings**
> JsonSuccessBase get_server_settings()

Get server settings

Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ServerAndOrganizationsApi;
my $api_instance = WWW::OpenAPIClient::ServerAndOrganizationsApi->new(
);


eval { 
    my $result = $api_instance->get_server_settings();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ServerAndOrganizationsApi->get_server_settings: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_code_playground**
> JsonSuccess remove_code_playground(playground_id => $playground_id)

Remove a code playground

Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ServerAndOrganizationsApi;
my $api_instance = WWW::OpenAPIClient::ServerAndOrganizationsApi->new(
);

my $playground_id = 1; # int | The ID of the playground that you want to remove. 

eval { 
    my $result = $api_instance->remove_code_playground(playground_id => $playground_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ServerAndOrganizationsApi->remove_code_playground: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playground_id** | **int**| The ID of the playground that you want to remove.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_linkifier**
> JsonSuccess remove_linkifier(filter_id => $filter_id)

Remove a linkifier

Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ServerAndOrganizationsApi;
my $api_instance = WWW::OpenAPIClient::ServerAndOrganizationsApi->new(
);

my $filter_id = 42; # int | The ID of the linkifier that you want to remove. 

eval { 
    my $result = $api_instance->remove_linkifier(filter_id => $filter_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ServerAndOrganizationsApi->remove_linkifier: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter_id** | **int**| The ID of the linkifier that you want to remove.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reorder_custom_profile_fields**
> JsonSuccess reorder_custom_profile_fields(order => $order)

Reorder custom profile fields

Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ServerAndOrganizationsApi;
my $api_instance = WWW::OpenAPIClient::ServerAndOrganizationsApi->new(
);

my $order = [(null)]; # ARRAY[int] | A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. 

eval { 
    my $result = $api_instance->reorder_custom_profile_fields(order => $order);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ServerAndOrganizationsApi->reorder_custom_profile_fields: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**ARRAY[int]**](int.md)| A list of the IDs of all the custom profile fields defined in this organization, in the desired new order.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_linkifier**
> JsonSuccess update_linkifier(filter_id => $filter_id, pattern => $pattern, url_format_string => $url_format_string)

Update a linkifier

Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ServerAndOrganizationsApi;
my $api_instance = WWW::OpenAPIClient::ServerAndOrganizationsApi->new(
);

my $filter_id = 2; # int | The ID of the linkifier that you want to update. 
my $pattern = #(?P<id>[0-9]+); # string | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
my $url_format_string = https://github.com/zulip/zulip/issues/%(id)s; # string | The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. 

eval { 
    my $result = $api_instance->update_linkifier(filter_id => $filter_id, pattern => $pattern, url_format_string => $url_format_string);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ServerAndOrganizationsApi->update_linkifier: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter_id** | **int**| The ID of the linkifier that you want to update.  | 
 **pattern** | **string**| The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  | 
 **url_format_string** | **string**| The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **upload_custom_emoji**
> JsonSuccess upload_custom_emoji(emoji_name => $emoji_name, filename => $filename)

Upload custom emoji

This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ServerAndOrganizationsApi;
my $api_instance = WWW::OpenAPIClient::ServerAndOrganizationsApi->new(
);

my $emoji_name = smile; # string | The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). 
my $filename = "/path/to/file"; # string | 

eval { 
    my $result = $api_instance->upload_custom_emoji(emoji_name => $emoji_name, filename => $filename);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ServerAndOrganizationsApi->upload_custom_emoji: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emoji_name** | **string**| The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji).  | 
 **filename** | **string****string**|  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

