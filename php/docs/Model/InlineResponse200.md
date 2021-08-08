# # InlineResponse200

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bot_email** | **string** | Email of the bot user. | [optional]
**bot_full_name** | **string** | The full name of the bot user. | [optional]
**data** | **string** | The message content, in raw Markdown format (not rendered to HTML). | [optional]
**trigger** | **string** | What aspect of the message triggered the outgoing webhook notification. Possible values include &#x60;private_message&#x60; and &#x60;mention&#x60;. | [optional]
**token** | **string** | A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the &#x60;zuliprc&#x60; file downloaded when creating the bot. | [optional]
**message** | [**MessagesBase**](MessagesBase.md) | A dict containing details on the message that triggered the outgoing webhook, in the format used by [&#x60;GET /messages&#x60;](/api/get-messages). | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
