package org.openapitools.server.model


/**
 * This is an example of the JSON payload that the Zulip server will `POST` to your server 
 *
 * @param botEmail Email of the bot user.  for example: ''null''
 * @param botFullName The full name of the bot user.  for example: ''null''
 * @param data The message content, in raw Markdown format (not rendered to HTML).  for example: ''null''
 * @param trigger What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`.  for example: ''null''
 * @param token A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot.  for example: ''null''
 * @param message A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages).  for example: ''null''
*/
final case class InlineResponse200 (
  botEmail: Option[String],
  botFullName: Option[String],
  data: Option[String],
  trigger: Option[String],
  token: Option[String],
  message: Option[MessagesBase]
)

