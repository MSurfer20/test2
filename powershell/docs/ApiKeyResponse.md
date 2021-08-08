# ApiKeyResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | [**AnyType**](.md) |  | 
**Msg** | [**AnyType**](.md) |  | 
**ApiKey** | **String** | The API key that can be used to authenticate as the requested user.  | 
**Email** | **String** | The email address of the user who owns the API key  | 

## Examples

- Prepare the resource
```powershell
$ApiKeyResponse = Initialize-PSOpenAPIToolsApiKeyResponse  -Result null `
 -Msg null `
 -ApiKey null `
 -Email null
```

- Convert the resource to JSON
```powershell
$ApiKeyResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

