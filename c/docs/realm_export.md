# realm_export_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The id of the export.  | [optional] 
**acting_user_id** | **int** | The id of the user who did the export.  | [optional] 
**export_time** | **double** | The UNIX timestamp of when the export was made.  | [optional] 
**deleted_timestamp** | **double** | The timestamp of when the export was deleted. Null if it wasn&#39;t.  | [optional] 
**failed_timestamp** | **double** | The timestamp of when the export failed. Null if it didn&#39;t.  | [optional] 
**export_url** | **char \*** | The URL of the export. &#x60;null&#x60; if there&#39;s no URL.  | [optional] 
**pending** | **int** | Whether the export is pending or not.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


