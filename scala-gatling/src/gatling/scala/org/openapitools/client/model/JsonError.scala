
package org.openapitools.client.model


case class JsonError (
    _result: AnyType,
    _msg: AnyType
)
object JsonError {
    def toStringBody(var_result: Object, var_msg: Object) =
        s"""
        | {
        | "result":$var_result,"msg":$var_msg
        | }
        """.stripMargin
}
