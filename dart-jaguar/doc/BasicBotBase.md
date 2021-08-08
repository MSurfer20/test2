# openapi.model.BasicBotBase

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **int** | The user id of the bot.  | [optional] [default to null]
**fullName** | **String** | The full name of the bot.  | [optional] [default to null]
**apiKey** | **String** | The API key of the bot which it uses to make API requests.  | [optional] [default to null]
**defaultSendingStream** | **String** | The default sending stream of the bot. Null if the bot doesn&#39;t have a default sending stream.  | [optional] [default to null]
**defaultEventsRegisterStream** | **String** | The default stream for which the bot receives events/register data. Null if the bot doesn&#39;t have such a default stream.  | [optional] [default to null]
**defaultAllPublicStreams** | **bool** | Whether the bot can send messages to all streams by default.  | [optional] [default to null]
**avatarUrl** | **String** | The URL of the bot&#39;s avatar.  | [optional] [default to null]
**ownerId** | **int** | The user id of the bot&#39;s owner.  Null if the bot has no owner.  | [optional] [default to null]
**services** | [**List&lt;OneOfobjectobject&gt;**](OneOfobjectobject.md) | The \&quot;Services\&quot; array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change.  | [optional] [default to const []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


