# JsonSuccessAllOf
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | [**AnyType**](.md) |  | [optional] 
**Msg** | [**AnyType**](.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$JsonSuccessAllOf = Initialize-PSOpenAPIToolsJsonSuccessAllOf  -Result null `
 -Msg null
```

- Convert the resource to JSON
```powershell
$JsonSuccessAllOf | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

