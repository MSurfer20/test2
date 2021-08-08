# RealmExport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **isize** | The id of the export.  | [optional] [default to None]
**acting_user_id** | **isize** | The id of the user who did the export.  | [optional] [default to None]
**export_time** | **f64** | The UNIX timestamp of when the export was made.  | [optional] [default to None]
**deleted_timestamp** | **f64** | The timestamp of when the export was deleted. Null if it wasn't.  | [optional] [default to None]
**failed_timestamp** | **f64** | The timestamp of when the export failed. Null if it didn't.  | [optional] [default to None]
**export_url** | **String** | The URL of the export. `null` if there's no URL.  | [optional] [default to None]
**pending** | **bool** | Whether the export is pending or not.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


