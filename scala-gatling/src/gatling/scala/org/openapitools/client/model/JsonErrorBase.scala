
package org.openapitools.client.model


case class JsonErrorBase (
    _result: String,
    _msg: String
)
object JsonErrorBase {
    def toStringBody(var_result: Object, var_msg: Object) =
        s"""
        | {
        | "result":$var_result,"msg":$var_msg
        | }
        """.stripMargin
}
