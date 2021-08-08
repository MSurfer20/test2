
package org.openapitools.client.model


case class CodedErrorAllOf (
    _result: Option[AnyType],
    _msg: Option[AnyType],
    _code: Option[AnyType]
)
object CodedErrorAllOf {
    def toStringBody(var_result: Object, var_msg: Object, var_code: Object) =
        s"""
        | {
        | "result":$var_result,"msg":$var_msg,"code":$var_code
        | }
        """.stripMargin
}
