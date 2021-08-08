# UserGroup
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | The name of the user group.  | [optional] 
**Description** | **String** | The description of the user group.  | [optional] 
**Members** | **Int32[]** | Array containing the id of the users who are members of this user group.  | [optional] 
**Id** | **Int32** | The ID of the user group.  | [optional] 

## Examples

- Prepare the resource
```powershell
$UserGroup = Initialize-PSOpenAPIToolsUserGroup  -Name null `
 -Description null `
 -Members null `
 -Id null
```

- Convert the resource to JSON
```powershell
$UserGroup | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

