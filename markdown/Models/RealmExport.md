# RealmExport
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**Integer**](integer.md) | The id of the export.  | [optional] [default to null]
**acting\_user\_id** | [**Integer**](integer.md) | The id of the user who did the export.  | [optional] [default to null]
**export\_time** | [**BigDecimal**](number.md) | The UNIX timestamp of when the export was made.  | [optional] [default to null]
**deleted\_timestamp** | [**BigDecimal**](number.md) | The timestamp of when the export was deleted. Null if it wasn&#39;t.  | [optional] [default to null]
**failed\_timestamp** | [**BigDecimal**](number.md) | The timestamp of when the export failed. Null if it didn&#39;t.  | [optional] [default to null]
**export\_url** | [**String**](string.md) | The URL of the export. &#x60;null&#x60; if there&#39;s no URL.  | [optional] [default to null]
**pending** | [**Boolean**](boolean.md) | Whether the export is pending or not.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

