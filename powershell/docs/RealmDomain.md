# RealmDomain
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Domain** | **String** | The new allowed domain.  | [optional] 
**AllowSubdomains** | **Boolean** | Whether subdomains are allowed for this domain.  | [optional] 

## Examples

- Prepare the resource
```powershell
$RealmDomain = Initialize-PSOpenAPIToolsRealmDomain  -Domain null `
 -AllowSubdomains null
```

- Convert the resource to JSON
```powershell
$RealmDomain | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

