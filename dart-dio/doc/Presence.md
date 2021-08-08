# openapi.model.Presence

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client** | **String** | The client's platform name.  | [optional] 
**status** | **String** | The status of the user on this client. It is either `idle` or `active`.  | [optional] 
**timestamp** | **int** | The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second.  | [optional] 
**pushable** | **bool** | Whether the client is capable of showing mobile/push notifications to the user.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


