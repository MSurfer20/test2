# UserNotAuthorizedError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | [**AnyType**](.md) |  | 
**Msg** | [**AnyType**](.md) |  | 
**Code** | [**AnyType**](.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$UserNotAuthorizedError = Initialize-PSOpenAPIToolsUserNotAuthorizedError  -Result null `
 -Msg null `
 -Code null
```

- Convert the resource to JSON
```powershell
$UserNotAuthorizedError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

