# InlineResponse200

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bot_email** | **String** | Email of the bot user.  | [optional] [default to None]
**bot_full_name** | **String** | The full name of the bot user.  | [optional] [default to None]
**data** | **String** | The message content, in raw Markdown format (not rendered to HTML).  | [optional] [default to None]
**trigger** | **String** | What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`.  | [optional] [default to None]
**token** | **String** | A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot.  | [optional] [default to None]
**message** | [***MessagesBase**](MessagesBase.md) | A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages).  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


