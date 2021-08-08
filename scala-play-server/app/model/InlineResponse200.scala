package model

import play.api.libs.json._

/**
  * This is an example of the JSON payload that the Zulip server will `POST` to your server 
  * @param botEmail Email of the bot user. 
  * @param botFullName The full name of the bot user. 
  * @param data The message content, in raw Markdown format (not rendered to HTML). 
  * @param trigger What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`. 
  * @param token A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot. 
  * @param message A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages). 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T20:42:55.656112Z[Etc/UTC]")
case class InlineResponse200(
  botEmail: Option[String],
  botFullName: Option[String],
  data: Option[String],
  trigger: Option[String],
  token: Option[String],
  message: Option[MessagesBase]
)

object InlineResponse200 {
  implicit lazy val inlineResponse200JsonFormat: Format[InlineResponse200] = Json.format[InlineResponse200]
}

