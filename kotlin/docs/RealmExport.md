
# RealmExport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | The id of the export.  |  [optional]
**actingUserId** | **kotlin.Int** | The id of the user who did the export.  |  [optional]
**exportTime** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The UNIX timestamp of when the export was made.  |  [optional]
**deletedTimestamp** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The timestamp of when the export was deleted. Null if it wasn&#39;t.  |  [optional]
**failedTimestamp** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The timestamp of when the export failed. Null if it didn&#39;t.  |  [optional]
**exportUrl** | **kotlin.String** | The URL of the export. &#x60;null&#x60; if there&#39;s no URL.  |  [optional]
**pending** | **kotlin.Boolean** | Whether the export is pending or not.  |  [optional]



