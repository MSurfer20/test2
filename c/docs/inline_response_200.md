# inline_response_200_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bot_email** | **char \*** | Email of the bot user.  | [optional] 
**bot_full_name** | **char \*** | The full name of the bot user.  | [optional] 
**data** | **char \*** | The message content, in raw Markdown format (not rendered to HTML).  | [optional] 
**trigger** | **char \*** | What aspect of the message triggered the outgoing webhook notification. Possible values include &#x60;private_message&#x60; and &#x60;mention&#x60;.  | [optional] 
**token** | **char \*** | A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the &#x60;zuliprc&#x60; file downloaded when creating the bot.  | [optional] 
**message** | [**messages_base_t**](messages_base.md) \* | A dict containing details on the message that triggered the outgoing webhook, in the format used by [&#x60;GET /messages&#x60;](/api/get-messages).  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


