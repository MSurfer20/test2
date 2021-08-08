
package org.openapitools.client.model


case class JsonSuccessAllOf (
    _result: Option[AnyType],
    _msg: Option[AnyType]
)
object JsonSuccessAllOf {
    def toStringBody(var_result: Object, var_msg: Object) =
        s"""
        | {
        | "result":$var_result,"msg":$var_msg
        | }
        """.stripMargin
}
