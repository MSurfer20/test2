# ApiKeyResponseAllOf
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | [**AnyType**](.md) |  | [optional] 
**Msg** | [**AnyType**](.md) |  | [optional] 
**ApiKey** | **String** | The API key that can be used to authenticate as the requested user.  | 
**Email** | **String** | The email address of the user who owns the API key  | 

## Examples

- Prepare the resource
```powershell
$ApiKeyResponseAllOf = Initialize-PSOpenAPIToolsApiKeyResponseAllOf  -Result null `
 -Msg null `
 -ApiKey null `
 -Email null
```

- Convert the resource to JSON
```powershell
$ApiKeyResponseAllOf | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

