# openapi::InlineResponse200

This is an example of the JSON payload that the Zulip server will `POST` to your server 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bot_email** | **character** | Email of the bot user.  | [optional] 
**bot_full_name** | **character** | The full name of the bot user.  | [optional] 
**data** | **character** | The message content, in raw Markdown format (not rendered to HTML).  | [optional] 
**trigger** | **character** | What aspect of the message triggered the outgoing webhook notification. Possible values include &#x60;private_message&#x60; and &#x60;mention&#x60;.  | [optional] 
**token** | **character** | A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the &#x60;zuliprc&#x60; file downloaded when creating the bot.  | [optional] 
**message** | [**MessagesBase**](MessagesBase.md) | A dict containing details on the message that triggered the outgoing webhook, in the format used by [&#x60;GET /messages&#x60;](/api/get-messages).  | [optional] 


