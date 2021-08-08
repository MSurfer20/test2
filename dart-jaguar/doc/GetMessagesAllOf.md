# openapi.model.GetMessagesAllOf

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatarUrl** | [**Object**](.md) |  | [optional] [default to null]
**client** | [**Object**](.md) |  | [optional] [default to null]
**content** | [**Object**](.md) |  | [optional] [default to null]
**contentType** | [**Object**](.md) |  | [optional] [default to null]
**displayRecipient** | [**Object**](.md) |  | [optional] [default to null]
**id** | [**Object**](.md) |  | [optional] [default to null]
**isMeMessage** | [**Object**](.md) |  | [optional] [default to null]
**reactions** | [**Object**](.md) |  | [optional] [default to null]
**recipientId** | [**Object**](.md) |  | [optional] [default to null]
**senderEmail** | [**Object**](.md) |  | [optional] [default to null]
**senderFullName** | [**Object**](.md) |  | [optional] [default to null]
**senderId** | [**Object**](.md) |  | [optional] [default to null]
**senderRealmStr** | [**Object**](.md) |  | [optional] [default to null]
**streamId** | [**Object**](.md) |  | [optional] [default to null]
**subject** | [**Object**](.md) |  | [optional] [default to null]
**topicLinks** | [**Object**](.md) |  | [optional] [default to null]
**submessages** | [**Object**](.md) |  | [optional] [default to null]
**timestamp** | [**Object**](.md) |  | [optional] [default to null]
**type** | [**Object**](.md) |  | [optional] [default to null]
**flags** | **List&lt;String&gt;** | The user&#39;s [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags  | [optional] [default to const []]
**lastEditTimestamp** | **int** | The UNIX timestamp for when the message was last edited, in UTC seconds.  | [optional] [default to null]
**matchContent** | **String** | Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords.  | [optional] [default to null]
**matchSubject** | **String** | Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


