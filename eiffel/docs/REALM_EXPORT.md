# REALM_EXPORT

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_32** | The id of the export.  | [optional] [default to null]
**acting_user_id** | **INTEGER_32** | The id of the user who did the export.  | [optional] [default to null]
**export_time** | **REAL_32** | The UNIX timestamp of when the export was made.  | [optional] [default to null]
**deleted_timestamp** | **REAL_32** | The timestamp of when the export was deleted. Null if it wasn&#39;t.  | [optional] [default to null]
**failed_timestamp** | **REAL_32** | The timestamp of when the export failed. Null if it didn&#39;t.  | [optional] [default to null]
**export_url** | [**STRING_32**](STRING_32.md) | The URL of the export. &#x60;null&#x60; if there&#39;s no URL.  | [optional] [default to null]
**pending** | **BOOLEAN** | Whether the export is pending or not.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


