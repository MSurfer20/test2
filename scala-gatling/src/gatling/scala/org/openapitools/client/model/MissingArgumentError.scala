
package org.openapitools.client.model


case class MissingArgumentError (
    _result: AnyType,
    _msg: AnyType,
    _code: Option[AnyType],
    /* It contains the information about the missing parameter.  */
    _varName: Option[String]
)
object MissingArgumentError {
    def toStringBody(var_result: Object, var_msg: Object, var_code: Object, var_varName: Object) =
        s"""
        | {
        | "result":$var_result,"msg":$var_msg,"code":$var_code,"varName":$var_varName
        | }
        """.stripMargin
}
