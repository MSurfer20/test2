# MissingArgumentErrorAllOf
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | [**AnyType**](.md) |  | [optional] 
**Msg** | [**AnyType**](.md) |  | [optional] 
**Code** | [**AnyType**](.md) |  | [optional] 
**VarName** | **String** | It contains the information about the missing parameter.  | [optional] 

## Examples

- Prepare the resource
```powershell
$MissingArgumentErrorAllOf = Initialize-PSOpenAPIToolsMissingArgumentErrorAllOf  -Result null `
 -Msg null `
 -Code null `
 -VarName null
```

- Convert the resource to JSON
```powershell
$MissingArgumentErrorAllOf | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

