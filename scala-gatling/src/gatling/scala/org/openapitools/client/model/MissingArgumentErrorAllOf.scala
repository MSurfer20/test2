
package org.openapitools.client.model


case class MissingArgumentErrorAllOf (
    _result: Option[AnyType],
    _msg: Option[AnyType],
    _code: Option[AnyType],
    /* It contains the information about the missing parameter.  */
    _varName: Option[String]
)
object MissingArgumentErrorAllOf {
    def toStringBody(var_result: Object, var_msg: Object, var_code: Object, var_varName: Object) =
        s"""
        | {
        | "result":$var_result,"msg":$var_msg,"code":$var_code,"varName":$var_varName
        | }
        """.stripMargin
}
