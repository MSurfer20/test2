
package org.openapitools.client.model


case class RealmDeactivatedError (
    _result: AnyType,
    _msg: AnyType,
    _code: Option[AnyType]
)
object RealmDeactivatedError {
    def toStringBody(var_result: Object, var_msg: Object, var_code: Object) =
        s"""
        | {
        | "result":$var_result,"msg":$var_msg,"code":$var_code
        | }
        """.stripMargin
}
