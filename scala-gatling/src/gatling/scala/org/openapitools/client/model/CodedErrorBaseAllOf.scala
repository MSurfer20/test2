
package org.openapitools.client.model


case class CodedErrorBaseAllOf (
    _result: Option[AnyType],
    _msg: Option[AnyType],
    /* A string that identifies the error.  */
    _code: Option[String]
)
object CodedErrorBaseAllOf {
    def toStringBody(var_result: Object, var_msg: Object, var_code: Object) =
        s"""
        | {
        | "result":$var_result,"msg":$var_msg,"code":$var_code
        | }
        """.stripMargin
}
