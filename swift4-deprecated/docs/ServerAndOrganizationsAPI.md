# ServerAndOrganizationsAPI

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCodePlayground**](ServerAndOrganizationsAPI.md#addcodeplayground) | **POST** /realm/playgrounds | Add a code playground
[**addLinkifier**](ServerAndOrganizationsAPI.md#addlinkifier) | **POST** /realm/filters | Add a linkifier
[**createCustomProfileField**](ServerAndOrganizationsAPI.md#createcustomprofilefield) | **POST** /realm/profile_fields | Create a custom profile field
[**getCustomEmoji**](ServerAndOrganizationsAPI.md#getcustomemoji) | **GET** /realm/emoji | Get all custom emoji
[**getCustomProfileFields**](ServerAndOrganizationsAPI.md#getcustomprofilefields) | **GET** /realm/profile_fields | Get all custom profile fields
[**getLinkifiers**](ServerAndOrganizationsAPI.md#getlinkifiers) | **GET** /realm/linkifiers | Get linkifiers
[**getServerSettings**](ServerAndOrganizationsAPI.md#getserversettings) | **GET** /server_settings | Get server settings
[**removeCodePlayground**](ServerAndOrganizationsAPI.md#removecodeplayground) | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground
[**removeLinkifier**](ServerAndOrganizationsAPI.md#removelinkifier) | **DELETE** /realm/filters/{filter_id} | Remove a linkifier
[**reorderCustomProfileFields**](ServerAndOrganizationsAPI.md#reordercustomprofilefields) | **PATCH** /realm/profile_fields | Reorder custom profile fields
[**updateLinkifier**](ServerAndOrganizationsAPI.md#updatelinkifier) | **PATCH** /realm/filters/{filter_id} | Update a linkifier
[**uploadCustomEmoji**](ServerAndOrganizationsAPI.md#uploadcustomemoji) | **POST** /realm/emoji/{emoji_name} | Upload custom emoji


# **addCodePlayground**
```swift
    open class func addCodePlayground(name: String, pygmentsLanguage: String, urlPrefix: String, completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Add a code playground

Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let name = "name_example" // String | The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. 
let pygmentsLanguage = "pygmentsLanguage_example" // String | The name of the Pygments language lexer for that programming language. 
let urlPrefix = "urlPrefix_example" // String | The url prefix for the playground. 

// Add a code playground
ServerAndOrganizationsAPI.addCodePlayground(name: name, pygmentsLanguage: pygmentsLanguage, urlPrefix: urlPrefix) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String** | The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language.  | 
 **pygmentsLanguage** | **String** | The name of the Pygments language lexer for that programming language.  | 
 **urlPrefix** | **String** | The url prefix for the playground.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **addLinkifier**
```swift
    open class func addLinkifier(pattern: String, urlFormatString: String, completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Add a linkifier

Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let pattern = "pattern_example" // String | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
let urlFormatString = "urlFormatString_example" // String | The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. 

// Add a linkifier
ServerAndOrganizationsAPI.addLinkifier(pattern: pattern, urlFormatString: urlFormatString) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pattern** | **String** | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  | 
 **urlFormatString** | **String** | The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createCustomProfileField**
```swift
    open class func createCustomProfileField(fieldType: Int, name: String? = nil, hint: String? = nil, fieldData: Any? = nil, completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Create a custom profile field

[Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let fieldType = 987 // Int | The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
let name = "name_example" // String | The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user's profile.  (optional)
let hint = "hint_example" // String | The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  (optional)
let fieldData = 987 // Any | Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  (optional)

// Create a custom profile field
ServerAndOrganizationsAPI.createCustomProfileField(fieldType: fieldType, name: name, hint: hint, fieldData: fieldData) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldType** | **Int** | The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account  | 
 **name** | **String** | The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile.  | [optional] 
 **hint** | **String** | The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  | [optional] 
 **fieldData** | [**Any**](.md) | Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getCustomEmoji**
```swift
    open class func getCustomEmoji(completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Get all custom emoji

Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// Get all custom emoji
ServerAndOrganizationsAPI.getCustomEmoji() { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
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

# **getCustomProfileFields**
```swift
    open class func getCustomProfileFields(completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Get all custom profile fields

Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// Get all custom profile fields
ServerAndOrganizationsAPI.getCustomProfileFields() { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
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

# **getLinkifiers**
```swift
    open class func getLinkifiers(completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Get linkifiers

List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// Get linkifiers
ServerAndOrganizationsAPI.getLinkifiers() { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
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

# **getServerSettings**
```swift
    open class func getServerSettings(completion: @escaping (_ data: JsonSuccessBase?, _ error: Error?) -> Void)
```

Get server settings

Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// Get server settings
ServerAndOrganizationsAPI.getServerSettings() { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
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

# **removeCodePlayground**
```swift
    open class func removeCodePlayground(playgroundId: Int, completion: @escaping (_ data: JsonSuccess?, _ error: Error?) -> Void)
```

Remove a code playground

Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let playgroundId = 987 // Int | The ID of the playground that you want to remove. 

// Remove a code playground
ServerAndOrganizationsAPI.removeCodePlayground(playgroundId: playgroundId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playgroundId** | **Int** | The ID of the playground that you want to remove.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **removeLinkifier**
```swift
    open class func removeLinkifier(filterId: Int, completion: @escaping (_ data: JsonSuccess?, _ error: Error?) -> Void)
```

Remove a linkifier

Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let filterId = 987 // Int | The ID of the linkifier that you want to remove. 

// Remove a linkifier
ServerAndOrganizationsAPI.removeLinkifier(filterId: filterId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterId** | **Int** | The ID of the linkifier that you want to remove.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reorderCustomProfileFields**
```swift
    open class func reorderCustomProfileFields(order: [Int], completion: @escaping (_ data: JsonSuccess?, _ error: Error?) -> Void)
```

Reorder custom profile fields

Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let order = [123] // [Int] | A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. 

// Reorder custom profile fields
ServerAndOrganizationsAPI.reorderCustomProfileFields(order: order) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**[Int]**](Int.md) | A list of the IDs of all the custom profile fields defined in this organization, in the desired new order.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateLinkifier**
```swift
    open class func updateLinkifier(filterId: Int, pattern: String, urlFormatString: String, completion: @escaping (_ data: JsonSuccess?, _ error: Error?) -> Void)
```

Update a linkifier

Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let filterId = 987 // Int | The ID of the linkifier that you want to update. 
let pattern = "pattern_example" // String | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
let urlFormatString = "urlFormatString_example" // String | The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. 

// Update a linkifier
ServerAndOrganizationsAPI.updateLinkifier(filterId: filterId, pattern: pattern, urlFormatString: urlFormatString) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterId** | **Int** | The ID of the linkifier that you want to update.  | 
 **pattern** | **String** | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  | 
 **urlFormatString** | **String** | The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **uploadCustomEmoji**
```swift
    open class func uploadCustomEmoji(emojiName: String, filename: URL? = nil, completion: @escaping (_ data: JsonSuccess?, _ error: Error?) -> Void)
```

Upload custom emoji

This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let emojiName = "emojiName_example" // String | The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). 
let filename = URL(string: "https://example.com")! // URL |  (optional)

// Upload custom emoji
ServerAndOrganizationsAPI.uploadCustomEmoji(emojiName: emojiName, filename: filename) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emojiName** | **String** | The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji).  | 
 **filename** | **URL** |  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

