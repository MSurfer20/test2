# Org.OpenAPITools.Model.RealmExport
Object containing details about a realm export. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int** | The id of the export.  | [optional] 
**ActingUserId** | **int** | The id of the user who did the export.  | [optional] 
**ExportTime** | **decimal** | The UNIX timestamp of when the export was made.  | [optional] 
**DeletedTimestamp** | **decimal?** | The timestamp of when the export was deleted. Null if it wasn&#39;t.  | [optional] 
**FailedTimestamp** | **decimal?** | The timestamp of when the export failed. Null if it didn&#39;t.  | [optional] 
**ExportUrl** | **string** | The URL of the export. &#x60;null&#x60; if there&#39;s no URL.  | [optional] 
**Pending** | **bool** | Whether the export is pending or not.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

