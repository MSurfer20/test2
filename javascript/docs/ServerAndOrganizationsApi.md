# ZulipRestApi.ServerAndOrganizationsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCodePlayground**](ServerAndOrganizationsApi.md#addCodePlayground) | **POST** /realm/playgrounds | Add a code playground
[**addLinkifier**](ServerAndOrganizationsApi.md#addLinkifier) | **POST** /realm/filters | Add a linkifier
[**createCustomProfileField**](ServerAndOrganizationsApi.md#createCustomProfileField) | **POST** /realm/profile_fields | Create a custom profile field
[**getCustomEmoji**](ServerAndOrganizationsApi.md#getCustomEmoji) | **GET** /realm/emoji | Get all custom emoji
[**getCustomProfileFields**](ServerAndOrganizationsApi.md#getCustomProfileFields) | **GET** /realm/profile_fields | Get all custom profile fields
[**getLinkifiers**](ServerAndOrganizationsApi.md#getLinkifiers) | **GET** /realm/linkifiers | Get linkifiers
[**getServerSettings**](ServerAndOrganizationsApi.md#getServerSettings) | **GET** /server_settings | Get server settings
[**removeCodePlayground**](ServerAndOrganizationsApi.md#removeCodePlayground) | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground
[**removeLinkifier**](ServerAndOrganizationsApi.md#removeLinkifier) | **DELETE** /realm/filters/{filter_id} | Remove a linkifier
[**reorderCustomProfileFields**](ServerAndOrganizationsApi.md#reorderCustomProfileFields) | **PATCH** /realm/profile_fields | Reorder custom profile fields
[**updateLinkifier**](ServerAndOrganizationsApi.md#updateLinkifier) | **PATCH** /realm/filters/{filter_id} | Update a linkifier
[**uploadCustomEmoji**](ServerAndOrganizationsApi.md#uploadCustomEmoji) | **POST** /realm/emoji/{emoji_name} | Upload custom emoji



## addCodePlayground

> JsonSuccessBase addCodePlayground(name, pygmentsLanguage, urlPrefix)

Add a code playground

Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  &#x60;POST {{ api_url }}/v1/realm/playgrounds&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.ServerAndOrganizationsApi();
let name = Python playground; // String | The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. 
let pygmentsLanguage = Python; // String | The name of the Pygments language lexer for that programming language. 
let urlPrefix = https://python.example.com; // String | The url prefix for the playground. 
apiInstance.addCodePlayground(name, pygmentsLanguage, urlPrefix, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language.  | 
 **pygmentsLanguage** | **String**| The name of the Pygments language lexer for that programming language.  | 
 **urlPrefix** | **String**| The url prefix for the playground.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## addLinkifier

> JsonSuccessBase addLinkifier(pattern, urlFormatString)

Add a linkifier

Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;POST {{ api_url }}/v1/realm/filters&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.ServerAndOrganizationsApi();
let pattern = #(?P<id>[0-9]+); // String | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
let urlFormatString = https://github.com/zulip/zulip/issues/%(id)s; // String | The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. 
apiInstance.addLinkifier(pattern, urlFormatString, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pattern** | **String**| The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  | 
 **urlFormatString** | **String**| The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## createCustomProfileField

> JsonSuccessBase createCustomProfileField(fieldType, opts)

Create a custom profile field

[Create a custom profile field](/help/add-custom-profile-fields) in the user&#39;s organization.  &#x60;POST {{ api_url }}/v1/realm/profile_fields&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.ServerAndOrganizationsApi();
let fieldType = 3; // Number | The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
let opts = {
  'name': Favorite programming language, // String | The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user's profile. 
  'hint': Your favorite programming language., // String | The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
  'fieldData': null // Object | Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
};
apiInstance.createCustomProfileField(fieldType, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldType** | **Number**| The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account  | 
 **name** | **String**| The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile.  | [optional] 
 **hint** | **String**| The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  | [optional] 
 **fieldData** | [**Object**](.md)| Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCustomEmoji

> JsonSuccessBase getCustomEmoji()

Get all custom emoji

Get all the custom emoji in the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/emoji&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.ServerAndOrganizationsApi();
apiInstance.getCustomEmoji((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## getCustomProfileFields

> JsonSuccessBase getCustomProfileFields()

Get all custom profile fields

Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user&#39;s organization.  &#x60;GET {{ api_url }}/v1/realm/profile_fields&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.ServerAndOrganizationsApi();
apiInstance.getCustomProfileFields((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## getLinkifiers

> JsonSuccessBase getLinkifiers()

Get linkifiers

List all of an organization&#39;s configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;GET {{ api_url }}/v1/realm/linkifiers&#x60;  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar &#x60;GET /realm/filters&#x60; endpoint was available with each entry in a &#x60;[pattern, url_format, id]&#x60; tuple format. 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.ServerAndOrganizationsApi();
apiInstance.getLinkifiers((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## getServerSettings

> JsonSuccessBase getServerSettings()

Get server settings

Fetch global settings for a Zulip server.  &#x60;GET {{ api_url }}/v1/server_settings&#x60;  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it&#39;s running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.ServerAndOrganizationsApi();
apiInstance.getServerSettings((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## removeCodePlayground

> JsonSuccess removeCodePlayground(playgroundId)

Remove a code playground

Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  &#x60;DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 49). 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.ServerAndOrganizationsApi();
let playgroundId = 1; // Number | The ID of the playground that you want to remove. 
apiInstance.removeCodePlayground(playgroundId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playgroundId** | **Number**| The ID of the playground that you want to remove.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## removeLinkifier

> JsonSuccess removeLinkifier(filterId)

Remove a linkifier

Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;DELETE {{ api_url }}/v1/realm/filters/{filter_id}&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.ServerAndOrganizationsApi();
let filterId = 42; // Number | The ID of the linkifier that you want to remove. 
apiInstance.removeLinkifier(filterId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterId** | **Number**| The ID of the linkifier that you want to remove.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## reorderCustomProfileFields

> JsonSuccess reorderCustomProfileFields(order)

Reorder custom profile fields

Reorder the custom profile fields in the user&#39;s organization.  &#x60;PATCH {{ api_url }}/v1/realm/profile_fields&#x60;  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.ServerAndOrganizationsApi();
let order = [null]; // [Number] | A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. 
apiInstance.reorderCustomProfileFields(order, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**[Number]**](Number.md)| A list of the IDs of all the custom profile fields defined in this organization, in the desired new order.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateLinkifier

> JsonSuccess updateLinkifier(filterId, pattern, urlFormatString)

Update a linkifier

Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  &#x60;PATCH {{ api_url }}/v1/realm/filters/{filter_id}&#x60;  **Changes**: New in Zulip 4.0 (feature level 57). 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.ServerAndOrganizationsApi();
let filterId = 2; // Number | The ID of the linkifier that you want to update. 
let pattern = #(?P<id>[0-9]+); // String | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
let urlFormatString = https://github.com/zulip/zulip/issues/%(id)s; // String | The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. 
apiInstance.updateLinkifier(filterId, pattern, urlFormatString, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterId** | **Number**| The ID of the linkifier that you want to update.  | 
 **pattern** | **String**| The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  | 
 **urlFormatString** | **String**| The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## uploadCustomEmoji

> JsonSuccess uploadCustomEmoji(emojiName, opts)

Upload custom emoji

This endpoint is used to upload a custom emoji for use in the user&#39;s organization.  Access to this endpoint depends on the [organization&#39;s configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  &#x60;POST {{ api_url }}/v1/realm/emoji/{emoji_name}&#x60; 

### Example

```javascript
import ZulipRestApi from 'zulip_rest_api';

let apiInstance = new ZulipRestApi.ServerAndOrganizationsApi();
let emojiName = smile; // String | The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). 
let opts = {
  'filename': "/path/to/file" // File | 
};
apiInstance.uploadCustomEmoji(emojiName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emojiName** | **String**| The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji).  | 
 **filename** | **File**|  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

