# MissingArgumentError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | [**AnyType**](.md) |  | 
**Msg** | [**AnyType**](.md) |  | 
**Code** | [**AnyType**](.md) |  | [optional] 
**VarName** | **String** | It contains the information about the missing parameter.  | [optional] 

## Examples

- Prepare the resource
```powershell
$MissingArgumentError = Initialize-PSOpenAPIToolsMissingArgumentError  -Result null `
 -Msg null `
 -Code null `
 -VarName null
```

- Convert the resource to JSON
```powershell
$MissingArgumentError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

