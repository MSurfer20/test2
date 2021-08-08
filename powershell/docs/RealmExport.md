# RealmExport
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The id of the export.  | [optional] 
**ActingUserId** | **Int32** | The id of the user who did the export.  | [optional] 
**ExportTime** | **Decimal** | The UNIX timestamp of when the export was made.  | [optional] 
**DeletedTimestamp** | **Decimal** | The timestamp of when the export was deleted. Null if it wasn&#39;t.  | [optional] 
**FailedTimestamp** | **Decimal** | The timestamp of when the export failed. Null if it didn&#39;t.  | [optional] 
**ExportUrl** | **String** | The URL of the export. &#x60;null&#x60; if there&#39;s no URL.  | [optional] 
**Pending** | **Boolean** | Whether the export is pending or not.  | [optional] 

## Examples

- Prepare the resource
```powershell
$RealmExport = Initialize-PSOpenAPIToolsRealmExport  -Id null `
 -ActingUserId null `
 -ExportTime null `
 -DeletedTimestamp null `
 -FailedTimestamp null `
 -ExportUrl null `
 -Pending null
```

- Convert the resource to JSON
```powershell
$RealmExport | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

