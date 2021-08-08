package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.MessagesBase
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * This is an example of the JSON payload that the Zulip server will `POST` to your server 
 * @param botEmail Email of the bot user. 
 * @param botFullName The full name of the bot user. 
 * @param data The message content, in raw Markdown format (not rendered to HTML). 
 * @param trigger What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`. 
 * @param token A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot. 
 * @param message A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages). 
 */
data class InlineResponse200(

    @field:JsonProperty("bot_email") val botEmail: kotlin.String? = null,

    @field:JsonProperty("bot_full_name") val botFullName: kotlin.String? = null,

    @field:JsonProperty("data") val data: kotlin.String? = null,

    @field:JsonProperty("trigger") val trigger: kotlin.String? = null,

    @field:JsonProperty("token") val token: kotlin.String? = null,

    @field:Valid
    @field:JsonProperty("message") val message: MessagesBase? = null
) {

}

