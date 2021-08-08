# openapi.model.AddSubscriptionsResponse

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | [**Object**](.md) |  | [default to null]
**msg** | [**Object**](.md) |  | [default to null]
**subscribed** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query.  | [optional] [default to const {}]
**alreadySubscribed** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to.  | [optional] [default to const {}]
**unauthorized** | **List&lt;String&gt;** | A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if &#x60;authorization_errors_fatal&#x3D;false&#x60;.  | [optional] [default to const []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


