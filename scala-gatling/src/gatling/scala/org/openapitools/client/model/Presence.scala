
package org.openapitools.client.model


case class Presence (
    /* The client's platform name.  */
    _client: Option[String],
    /* The status of the user on this client. It is either `idle` or `active`.  */
    _status: Option[String],
    /* The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second.  */
    _timestamp: Option[Integer],
    /* Whether the client is capable of showing mobile/push notifications to the user.  */
    _pushable: Option[Boolean]
)
object Presence {
    def toStringBody(var_client: Object, var_status: Object, var_timestamp: Object, var_pushable: Object) =
        s"""
        | {
        | "client":$var_client,"status":$var_status,"timestamp":$var_timestamp,"pushable":$var_pushable
        | }
        """.stripMargin
}
