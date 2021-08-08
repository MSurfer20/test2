# openapi.model.BotAllOf

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | [**JsonObject**](.md) |  | [optional] 
**fullName** | [**JsonObject**](.md) |  | [optional] 
**apiKey** | [**JsonObject**](.md) |  | [optional] 
**defaultSendingStream** | [**JsonObject**](.md) |  | [optional] 
**defaultEventsRegisterStream** | [**JsonObject**](.md) |  | [optional] 
**defaultAllPublicStreams** | [**JsonObject**](.md) |  | [optional] 
**avatarUrl** | [**JsonObject**](.md) |  | [optional] 
**ownerId** | [**JsonObject**](.md) |  | [optional] 
**services** | [**JsonObject**](.md) |  | [optional] 
**email** | **String** | The email of the bot.  | [optional] 
**botType** | **int** | An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot.  | [optional] 
**isActive** | **bool** | A boolean describing whether the user account has been deactivated.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


