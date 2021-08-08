# openapi.model.GetMessages

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatarUrl** | [**JsonObject**](.md) |  | [optional] 
**client** | [**JsonObject**](.md) |  | [optional] 
**content** | [**JsonObject**](.md) |  | [optional] 
**contentType** | [**JsonObject**](.md) |  | [optional] 
**displayRecipient** | [**JsonObject**](.md) |  | [optional] 
**id** | [**JsonObject**](.md) |  | [optional] 
**isMeMessage** | [**JsonObject**](.md) |  | [optional] 
**reactions** | [**JsonObject**](.md) |  | [optional] 
**recipientId** | [**JsonObject**](.md) |  | [optional] 
**senderEmail** | [**JsonObject**](.md) |  | [optional] 
**senderFullName** | [**JsonObject**](.md) |  | [optional] 
**senderId** | [**JsonObject**](.md) |  | [optional] 
**senderRealmStr** | [**JsonObject**](.md) |  | [optional] 
**streamId** | [**JsonObject**](.md) |  | [optional] 
**subject** | [**JsonObject**](.md) |  | [optional] 
**topicLinks** | [**JsonObject**](.md) |  | [optional] 
**submessages** | [**JsonObject**](.md) |  | [optional] 
**timestamp** | [**JsonObject**](.md) |  | [optional] 
**type** | [**JsonObject**](.md) |  | [optional] 
**flags** | **BuiltList&lt;String&gt;** | The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags  | [optional] 
**lastEditTimestamp** | **int** | The UNIX timestamp for when the message was last edited, in UTC seconds.  | [optional] 
**matchContent** | **String** | Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords.  | [optional] 
**matchSubject** | **String** | Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


