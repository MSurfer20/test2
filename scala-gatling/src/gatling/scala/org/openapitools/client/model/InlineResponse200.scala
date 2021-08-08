
package org.openapitools.client.model


case class InlineResponse200 (
    /* Email of the bot user.  */
    _botEmail: Option[String],
    /* The full name of the bot user.  */
    _botFullName: Option[String],
    /* The message content, in raw Markdown format (not rendered to HTML).  */
    _data: Option[String],
    /* What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`.  */
    _trigger: Option[String],
    /* A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot.  */
    _token: Option[String],
    /* A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages).  */
    _message: Option[MessagesBase]
)
object InlineResponse200 {
    def toStringBody(var_botEmail: Object, var_botFullName: Object, var_data: Object, var_trigger: Object, var_token: Object, var_message: Object) =
        s"""
        | {
        | "botEmail":$var_botEmail,"botFullName":$var_botFullName,"data":$var_data,"trigger":$var_trigger,"token":$var_token,"message":$var_message
        | }
        """.stripMargin
}
