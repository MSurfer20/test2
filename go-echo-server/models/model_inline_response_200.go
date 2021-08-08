package models

// InlineResponse200 - This is an example of the JSON payload that the Zulip server will `POST` to your server 
type InlineResponse200 struct {

	// Email of the bot user. 
	BotEmail string `json:"bot_email,omitempty"`

	// The full name of the bot user. 
	BotFullName string `json:"bot_full_name,omitempty"`

	// The message content, in raw Markdown format (not rendered to HTML). 
	Data string `json:"data,omitempty"`

	// What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`. 
	Trigger string `json:"trigger,omitempty"`

	// A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot. 
	Token string `json:"token,omitempty"`

	// A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages). 
	Message MessagesBase `json:"message,omitempty"`
}
