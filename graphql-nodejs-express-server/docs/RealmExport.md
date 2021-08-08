# RealmExport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **Int!** | The id of the export.  | [optional] [default to null]
**actingUserId** | **Int!** | The id of the user who did the export.  | [optional] [default to null]
**exportTime** | **Float!** | The UNIX timestamp of when the export was made.  | [optional] [default to null]
**deletedTimestamp** | **Float** | The timestamp of when the export was deleted. Null if it wasn&#39;t.  | [optional] [default to null]
**failedTimestamp** | **Float** | The timestamp of when the export failed. Null if it didn&#39;t.  | [optional] [default to null]
**exportUrl** | **String** | The URL of the export. &#x60;null&#x60; if there&#39;s no URL.  | [optional] [default to null]
**pending** | **Boolean!** | Whether the export is pending or not.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


