
package org.openapitools.client.model


case class NonExistingStreamError (
    _result: AnyType,
    _msg: AnyType,
    _code: Option[AnyType],
    /* The name of the stream that could not be found.  */
    _stream: Option[String]
)
object NonExistingStreamError {
    def toStringBody(var_result: Object, var_msg: Object, var_code: Object, var_stream: Object) =
        s"""
        | {
        | "result":$var_result,"msg":$var_msg,"code":$var_code,"stream":$var_stream
        | }
        """.stripMargin
}
