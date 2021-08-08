# PSOpenAPITools.PSOpenAPITools/Api.ServerAndOrganizationsApi

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Add-CodePlayground**](ServerAndOrganizationsApi.md#Add-CodePlayground) | **POST** /realm/playgrounds | Add a code playground
[**Add-Linkifier**](ServerAndOrganizationsApi.md#Add-Linkifier) | **POST** /realm/filters | Add a linkifier
[**New-CustomProfileField**](ServerAndOrganizationsApi.md#New-CustomProfileField) | **POST** /realm/profile_fields | Create a custom profile field
[**Get-CustomEmoji**](ServerAndOrganizationsApi.md#Get-CustomEmoji) | **GET** /realm/emoji | Get all custom emoji
[**Get-CustomProfileFields**](ServerAndOrganizationsApi.md#Get-CustomProfileFields) | **GET** /realm/profile_fields | Get all custom profile fields
[**Get-Linkifiers**](ServerAndOrganizationsApi.md#Get-Linkifiers) | **GET** /realm/linkifiers | Get linkifiers
[**Get-ServerSettings**](ServerAndOrganizationsApi.md#Get-ServerSettings) | **GET** /server_settings | Get server settings
[**Remove-CodePlayground**](ServerAndOrganizationsApi.md#Remove-CodePlayground) | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground
[**Remove-Linkifier**](ServerAndOrganizationsApi.md#Remove-Linkifier) | **DELETE** /realm/filters/{filter_id} | Remove a linkifier
[**Invoke-ReorderCustomProfileFields**](ServerAndOrganizationsApi.md#Invoke-ReorderCustomProfileFields) | **PATCH** /realm/profile_fields | Reorder custom profile fields
[**Update-Linkifier**](ServerAndOrganizationsApi.md#Update-Linkifier) | **PATCH** /realm/filters/{filter_id} | Update a linkifier
[**Invoke-UploadCustomEmoji**](ServerAndOrganizationsApi.md#Invoke-UploadCustomEmoji) | **POST** /realm/emoji/{emoji_name} | Upload custom emoji


<a name="Add-CodePlayground"></a>
# **Add-CodePlayground**
> JsonSuccessBase Add-CodePlayground<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Name] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PygmentsLanguage] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UrlPrefix] <String><br>

Add a code playground

Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 

### Example
```powershell
$Name = "Python playground" # String | The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language. 
$PygmentsLanguage = "Python" # String | The name of the Pygments language lexer for that programming language. 
$UrlPrefix = "https://python.example.com" # String | The url prefix for the playground. 

# Add a code playground
try {
    $Result = Add-CodePlayground -Name $Name -PygmentsLanguage $PygmentsLanguage -UrlPrefix $UrlPrefix
} catch {
    Write-Host ("Exception occured when calling Add-CodePlayground: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Name** | **String**| The user-visible display name of the playground which can be used to pick the target playground, especially when multiple playground options exist for that programming language.  | 
 **PygmentsLanguage** | **String**| The name of the Pygments language lexer for that programming language.  | 
 **UrlPrefix** | **String**| The url prefix for the playground.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Add-Linkifier"></a>
# **Add-Linkifier**
> JsonSuccessBase Add-Linkifier<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Pattern] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UrlFormatString] <String><br>

Add a linkifier

Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 

### Example
```powershell
$Pattern = "#(?P<id>[0-9]+)" # String | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
$UrlFormatString = "https://github.com/zulip/zulip/issues/%(id)s" # String | The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. 

# Add a linkifier
try {
    $Result = Add-Linkifier -Pattern $Pattern -UrlFormatString $UrlFormatString
} catch {
    Write-Host ("Exception occured when calling Add-Linkifier: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Pattern** | **String**| The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  | 
 **UrlFormatString** | **String**| The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;.  | 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="New-CustomProfileField"></a>
# **New-CustomProfileField**
> JsonSuccessBase New-CustomProfileField<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FieldType] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Name] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Hint] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FieldData] <PSCustomObject><br>

Create a custom profile field

[Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` 

### Example
```powershell
$FieldType = 3 # Int32 | The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
$Name = "Favorite programming language" # String | The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user's profile.  (optional)
$Hint = "Your favorite programming language." # String | The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  (optional)
$FieldData =  # SystemCollectionsHashtable | Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  (optional)

# Create a custom profile field
try {
    $Result = New-CustomProfileField -FieldType $FieldType -Name $Name -Hint $Hint -FieldData $FieldData
} catch {
    Write-Host ("Exception occured when calling New-CustomProfileField: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FieldType** | **Int32**| The field type can be any of the supported custom profile field types. See the [custom profile fields documentation](/help/add-custom-profile-fields) more details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account  | 
 **Name** | **String**| The name of the custom profile field, which will appear both in user-facing settings UI for configuring custom profile fields and in UI displaying a user&#39;s profile.  | [optional] 
 **Hint** | **String**| The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields.  | [optional] 
 **FieldData** | [**SystemCollectionsHashtable**](SystemCollectionsHashtable.md)| Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the &#x60;field_data&#x60; attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized.  | [optional] 

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-CustomEmoji"></a>
# **Get-CustomEmoji**
> JsonSuccessBase Get-CustomEmoji<br>

Get all custom emoji

Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` 

### Example
```powershell

# Get all custom emoji
try {
    $Result = Get-CustomEmoji
} catch {
    Write-Host ("Exception occured when calling Get-CustomEmoji: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-CustomProfileFields"></a>
# **Get-CustomProfileFields**
> JsonSuccessBase Get-CustomProfileFields<br>

Get all custom profile fields

Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` 

### Example
```powershell

# Get all custom profile fields
try {
    $Result = Get-CustomProfileFields
} catch {
    Write-Host ("Exception occured when calling Get-CustomProfileFields: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-Linkifiers"></a>
# **Get-Linkifiers**
> JsonSuccessBase Get-Linkifiers<br>

Get linkifiers

List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 

### Example
```powershell

# Get linkifiers
try {
    $Result = Get-Linkifiers
} catch {
    Write-Host ("Exception occured when calling Get-Linkifiers: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-ServerSettings"></a>
# **Get-ServerSettings**
> JsonSuccessBase Get-ServerSettings<br>

Get server settings

Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 

### Example
```powershell

# Get server settings
try {
    $Result = Get-ServerSettings
} catch {
    Write-Host ("Exception occured when calling Get-ServerSettings: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JsonSuccessBase**](JsonSuccessBase.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Remove-CodePlayground"></a>
# **Remove-CodePlayground**
> JsonSuccess Remove-CodePlayground<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PlaygroundId] <Int32><br>

Remove a code playground

Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 

### Example
```powershell
$PlaygroundId = 1 # Int32 | The ID of the playground that you want to remove. 

# Remove a code playground
try {
    $Result = Remove-CodePlayground -PlaygroundId $PlaygroundId
} catch {
    Write-Host ("Exception occured when calling Remove-CodePlayground: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **PlaygroundId** | **Int32**| The ID of the playground that you want to remove.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Remove-Linkifier"></a>
# **Remove-Linkifier**
> JsonSuccess Remove-Linkifier<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FilterId] <Int32><br>

Remove a linkifier

Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 

### Example
```powershell
$FilterId = 42 # Int32 | The ID of the linkifier that you want to remove. 

# Remove a linkifier
try {
    $Result = Remove-Linkifier -FilterId $FilterId
} catch {
    Write-Host ("Exception occured when calling Remove-Linkifier: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FilterId** | **Int32**| The ID of the linkifier that you want to remove.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Invoke-ReorderCustomProfileFields"></a>
# **Invoke-ReorderCustomProfileFields**
> JsonSuccess Invoke-ReorderCustomProfileFields<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <System.Nullable[Int32][]><br>

Reorder custom profile fields

Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 

### Example
```powershell
$Order = 0 # Int32[] | A list of the IDs of all the custom profile fields defined in this organization, in the desired new order. 

# Reorder custom profile fields
try {
    $Result = Invoke-ReorderCustomProfileFields -Order $Order
} catch {
    Write-Host ("Exception occured when calling Invoke-ReorderCustomProfileFields: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Order** | [**Int32[]**](Int32.md)| A list of the IDs of all the custom profile fields defined in this organization, in the desired new order.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Update-Linkifier"></a>
# **Update-Linkifier**
> JsonSuccess Update-Linkifier<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FilterId] <Int32><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Pattern] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UrlFormatString] <String><br>

Update a linkifier

Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 

### Example
```powershell
$FilterId = 2 # Int32 | The ID of the linkifier that you want to update. 
$Pattern = "#(?P<id>[0-9]+)" # String | The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier. 
$UrlFormatString = "https://github.com/zulip/zulip/issues/%(id)s" # String | The URL used for the link. If you used named groups for the `pattern`, you can insert their content here with `%(name_of_the_capturing_group)s`. 

# Update a linkifier
try {
    $Result = Update-Linkifier -FilterId $FilterId -Pattern $Pattern -UrlFormatString $UrlFormatString
} catch {
    Write-Host ("Exception occured when calling Update-Linkifier: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FilterId** | **Int32**| The ID of the linkifier that you want to update.  | 
 **Pattern** | **String**| The [Python regular expression](https://docs.python.org/3/howto/regex.html) that should trigger the linkifier.  | 
 **UrlFormatString** | **String**| The URL used for the link. If you used named groups for the &#x60;pattern&#x60;, you can insert their content here with &#x60;%(name_of_the_capturing_group)s&#x60;.  | 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Invoke-UploadCustomEmoji"></a>
# **Invoke-UploadCustomEmoji**
> JsonSuccess Invoke-UploadCustomEmoji<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EmojiName] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Filename] <System.IO.FileInfo><br>

Upload custom emoji

This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 

### Example
```powershell
$EmojiName = "smile" # String | The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji). 
$Filename =  # System.IO.FileInfo |  (optional)

# Upload custom emoji
try {
    $Result = Invoke-UploadCustomEmoji -EmojiName $EmojiName -Filename $Filename
} catch {
    Write-Host ("Exception occured when calling Invoke-UploadCustomEmoji: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **EmojiName** | **String**| The name that should be associated with the uploaded emoji image/gif. The emoji name can only contain letters, numbers, dashes, and spaces. Upper and lower case letters are treated the same, and underscores (_) are treated the same as spaces (consistent with how the Zulip UI handles emoji).  | 
 **Filename** | **System.IO.FileInfo****System.IO.FileInfo**|  | [optional] 

### Return type

[**JsonSuccess**](JsonSuccess.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

