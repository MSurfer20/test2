# openapi.model.BasicBotBase

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **int** | The user id of the bot.  | [optional] 
**fullName** | **String** | The full name of the bot.  | [optional] 
**apiKey** | **String** | The API key of the bot which it uses to make API requests.  | [optional] 
**defaultSendingStream** | **String** | The default sending stream of the bot. Null if the bot doesn't have a default sending stream.  | [optional] 
**defaultEventsRegisterStream** | **String** | The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream.  | [optional] 
**defaultAllPublicStreams** | **bool** | Whether the bot can send messages to all streams by default.  | [optional] 
**avatarUrl** | **String** | The URL of the bot's avatar.  | [optional] 
**ownerId** | **int** | The user id of the bot's owner.  Null if the bot has no owner.  | [optional] 
**services** | [**BuiltList&lt;OneOfobjectobject&gt;**](OneOfobjectobject.md) | The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


