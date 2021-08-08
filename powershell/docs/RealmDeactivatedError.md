# RealmDeactivatedError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | [**AnyType**](.md) |  | 
**Msg** | [**AnyType**](.md) |  | 
**Code** | [**AnyType**](.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$RealmDeactivatedError = Initialize-PSOpenAPIToolsRealmDeactivatedError  -Result null `
 -Msg null `
 -Code null
```

- Convert the resource to JSON
```powershell
$RealmDeactivatedError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

