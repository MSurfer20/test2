goog.provide('API.Client.inline_response_200');

/**
 * This is an example of the JSON payload that the Zulip server will `POST` to your server 
 * @record
 */
API.Client.InlineResponse200 = function() {}

/**
 * Email of the bot user. 
 * @type {!string}
 * @export
 */
API.Client.InlineResponse200.prototype.botEmail;

/**
 * The full name of the bot user. 
 * @type {!string}
 * @export
 */
API.Client.InlineResponse200.prototype.botFullName;

/**
 * The message content, in raw Markdown format (not rendered to HTML). 
 * @type {!string}
 * @export
 */
API.Client.InlineResponse200.prototype.data;

/**
 * What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`. 
 * @type {!string}
 * @export
 */
API.Client.InlineResponse200.prototype.trigger;

/**
 * A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot. 
 * @type {!string}
 * @export
 */
API.Client.InlineResponse200.prototype.token;

/**
 * A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages). 
 * @type {!API.Client.MessagesBase}
 * @export
 */
API.Client.InlineResponse200.prototype.message;

