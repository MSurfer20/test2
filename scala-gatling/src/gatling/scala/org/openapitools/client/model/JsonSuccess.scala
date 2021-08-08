
package org.openapitools.client.model


case class JsonSuccess (
    _result: AnyType,
    _msg: AnyType
)
object JsonSuccess {
    def toStringBody(var_result: Object, var_msg: Object) =
        s"""
        | {
        | "result":$var_result,"msg":$var_msg
        | }
        """.stripMargin
}
