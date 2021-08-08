# openapi.model.GetMessagesAllOf

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatarUrl** | [**Object**](.md) |  | [optional] 
**client** | [**Object**](.md) |  | [optional] 
**content** | [**Object**](.md) |  | [optional] 
**contentType** | [**Object**](.md) |  | [optional] 
**displayRecipient** | [**Object**](.md) |  | [optional] 
**id** | [**Object**](.md) |  | [optional] 
**isMeMessage** | [**Object**](.md) |  | [optional] 
**reactions** | [**Object**](.md) |  | [optional] 
**recipientId** | [**Object**](.md) |  | [optional] 
**senderEmail** | [**Object**](.md) |  | [optional] 
**senderFullName** | [**Object**](.md) |  | [optional] 
**senderId** | [**Object**](.md) |  | [optional] 
**senderRealmStr** | [**Object**](.md) |  | [optional] 
**streamId** | [**Object**](.md) |  | [optional] 
**subject** | [**Object**](.md) |  | [optional] 
**topicLinks** | [**Object**](.md) |  | [optional] 
**submessages** | [**Object**](.md) |  | [optional] 
**timestamp** | [**Object**](.md) |  | [optional] 
**type** | [**Object**](.md) |  | [optional] 
**flags** | **List<String>** | The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags  | [optional] [default to const []]
**lastEditTimestamp** | **int** | The UNIX timestamp for when the message was last edited, in UTC seconds.  | [optional] 
**matchContent** | **String** | Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords.  | [optional] 
**matchSubject** | **String** | Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


