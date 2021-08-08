package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessagesBase

/**
 * This is an example of the JSON payload that the Zulip server will `POST` to your server 
 * @param botUnderscoreemail Email of the bot user. 
 * @param botUnderscorefullUnderscorename The full name of the bot user. 
 * @param data The message content, in raw Markdown format (not rendered to HTML). 
 * @param trigger What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`. 
 * @param token A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot. 
 * @param message A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages). 
 */
case class InlineResponse200(botUnderscoreemail: Option[String],
                botUnderscorefullUnderscorename: Option[String],
                data: Option[String],
                trigger: Option[String],
                token: Option[String],
                message: Option[MessagesBase]
                )

object InlineResponse200 {
    /**
     * Creates the codec for converting InlineResponse200 from and to JSON.
     */
    implicit val decoder: Decoder[InlineResponse200] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineResponse200] = deriveEncoder
}
