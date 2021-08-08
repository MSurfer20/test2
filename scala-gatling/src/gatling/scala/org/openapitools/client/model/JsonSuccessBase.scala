
package org.openapitools.client.model


case class JsonSuccessBase (
    _result: String,
    _msg: String
)
object JsonSuccessBase {
    def toStringBody(var_result: Object, var_msg: Object) =
        s"""
        | {
        | "result":$var_result,"msg":$var_msg
        | }
        """.stripMargin
}
