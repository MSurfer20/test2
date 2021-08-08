# openapi.model.InlineResponse200

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**botEmail** | **String** | Email of the bot user.  | [optional] 
**botFullName** | **String** | The full name of the bot user.  | [optional] 
**data** | **String** | The message content, in raw Markdown format (not rendered to HTML).  | [optional] 
**trigger** | **String** | What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`.  | [optional] 
**token** | **String** | A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot.  | [optional] 
**message** | [**MessagesBase**](MessagesBase.md) | A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages).  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


