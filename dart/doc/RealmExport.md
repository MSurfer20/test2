# openapi.model.RealmExport

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The id of the export.  | [optional] 
**actingUserId** | **int** | The id of the user who did the export.  | [optional] 
**exportTime** | **num** | The UNIX timestamp of when the export was made.  | [optional] 
**deletedTimestamp** | **num** | The timestamp of when the export was deleted. Null if it wasn't.  | [optional] 
**failedTimestamp** | **num** | The timestamp of when the export failed. Null if it didn't.  | [optional] 
**exportUrl** | **String** | The URL of the export. `null` if there's no URL.  | [optional] 
**pending** | **bool** | Whether the export is pending or not.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


