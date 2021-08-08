
# Table `RealmExport` 
(mapped from: RealmExport)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The id of the export.  |  [optional]
**actingUserId** | acting_user_id | int |  | **kotlin.Int** | The id of the user who did the export.  |  [optional]
**exportTime** | export_time | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The UNIX timestamp of when the export was made.  |  [optional]
**deletedTimestamp** | deleted_timestamp | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The timestamp of when the export was deleted. Null if it wasn&#39;t.  |  [optional]
**failedTimestamp** | failed_timestamp | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The timestamp of when the export failed. Null if it didn&#39;t.  |  [optional]
**exportUrl** | export_url | text |  | **kotlin.String** | The URL of the export. &#x60;null&#x60; if there&#39;s no URL.  |  [optional]
**pending** | pending | boolean |  | **kotlin.Boolean** | Whether the export is pending or not.  |  [optional]









