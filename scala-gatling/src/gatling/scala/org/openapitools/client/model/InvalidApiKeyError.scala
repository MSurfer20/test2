
package org.openapitools.client.model


case class InvalidApiKeyError (
    _result: AnyType,
    _msg: AnyType
)
object InvalidApiKeyError {
    def toStringBody(var_result: Object, var_msg: Object) =
        s"""
        | {
        | "result":$var_result,"msg":$var_msg
        | }
        """.stripMargin
}
