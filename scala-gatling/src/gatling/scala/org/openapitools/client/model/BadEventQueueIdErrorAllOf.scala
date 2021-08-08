
package org.openapitools.client.model


case class BadEventQueueIdErrorAllOf (
    _result: Option[AnyType],
    _msg: Option[AnyType],
    _code: Option[AnyType],
    /* The string that identifies the invalid event queue.  */
    _queueId: Option[String]
)
object BadEventQueueIdErrorAllOf {
    def toStringBody(var_result: Object, var_msg: Object, var_code: Object, var_queueId: Object) =
        s"""
        | {
        | "result":$var_result,"msg":$var_msg,"code":$var_code,"queueId":$var_queueId
        | }
        """.stripMargin
}
