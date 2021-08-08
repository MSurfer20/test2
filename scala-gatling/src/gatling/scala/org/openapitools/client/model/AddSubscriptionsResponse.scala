
package org.openapitools.client.model


case class AddSubscriptionsResponse (
    _result: AnyType,
    _msg: AnyType,
    /* A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query.  */
    _subscribed: Option[Map[String, List[String]]],
    /* A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to.  */
    _alreadySubscribed: Option[Map[String, List[String]]],
    /* A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`.  */
    _unauthorized: Option[List[String]]
)
object AddSubscriptionsResponse {
    def toStringBody(var_result: Object, var_msg: Object, var_subscribed: Object, var_alreadySubscribed: Object, var_unauthorized: Object) =
        s"""
        | {
        | "result":$var_result,"msg":$var_msg,"subscribed":$var_subscribed,"alreadySubscribed":$var_alreadySubscribed,"unauthorized":$var_unauthorized
        | }
        """.stripMargin
}
