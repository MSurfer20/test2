# OpenapiClient::RealmExport

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The id of the export.  | [optional] |
| **acting_user_id** | **Integer** | The id of the user who did the export.  | [optional] |
| **export_time** | **Float** | The UNIX timestamp of when the export was made.  | [optional] |
| **deleted_timestamp** | **Float** | The timestamp of when the export was deleted. Null if it wasn&#39;t.  | [optional] |
| **failed_timestamp** | **Float** | The timestamp of when the export failed. Null if it didn&#39;t.  | [optional] |
| **export_url** | **String** | The URL of the export. &#x60;null&#x60; if there&#39;s no URL.  | [optional] |
| **pending** | **Boolean** | Whether the export is pending or not.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::RealmExport.new(
  id: null,
  acting_user_id: null,
  export_time: null,
  deleted_timestamp: null,
  failed_timestamp: null,
  export_url: null,
  pending: null
)
```

