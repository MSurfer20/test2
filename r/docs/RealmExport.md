# openapi::RealmExport

Object containing details about a realm export. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The id of the export.  | [optional] 
**acting_user_id** | **integer** | The id of the user who did the export.  | [optional] 
**export_time** | **numeric** | The UNIX timestamp of when the export was made.  | [optional] 
**deleted_timestamp** | **numeric** | The timestamp of when the export was deleted. Null if it wasn&#39;t.  | [optional] 
**failed_timestamp** | **numeric** | The timestamp of when the export failed. Null if it didn&#39;t.  | [optional] 
**export_url** | **character** | The URL of the export. &#x60;null&#x60; if there&#39;s no URL.  | [optional] 
**pending** | **character** | Whether the export is pending or not.  | [optional] 


