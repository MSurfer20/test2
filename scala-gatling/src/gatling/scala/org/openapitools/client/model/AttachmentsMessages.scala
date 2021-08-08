
package org.openapitools.client.model


case class AttachmentsMessages (
    /* Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number.  */
    _dateSent: Option[Integer],
    /* The unique message ID.  Messages should always be displayed sorted by ID.  */
    _id: Option[Integer]
)
object AttachmentsMessages {
    def toStringBody(var_dateSent: Object, var_id: Object) =
        s"""
        | {
        | "dateSent":$var_dateSent,"id":$var_id
        | }
        """.stripMargin
}
