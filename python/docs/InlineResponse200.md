# InlineResponse200

This is an example of the JSON payload that the Zulip server will `POST` to your server 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bot_email** | **str** | Email of the bot user.  | [optional] 
**bot_full_name** | **str** | The full name of the bot user.  | [optional] 
**data** | **str** | The message content, in raw Markdown format (not rendered to HTML).  | [optional] 
**trigger** | **str** | What aspect of the message triggered the outgoing webhook notification. Possible values include &#x60;private_message&#x60; and &#x60;mention&#x60;.  | [optional] 
**token** | **str** | A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the &#x60;zuliprc&#x60; file downloaded when creating the bot.  | [optional] 
**message** | **dict** | A dict containing details on the message that triggered the outgoing webhook, in the format used by [&#x60;GET /messages&#x60;](/api/get-messages).  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


