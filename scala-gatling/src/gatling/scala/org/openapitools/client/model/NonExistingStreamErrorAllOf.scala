
package org.openapitools.client.model


case class NonExistingStreamErrorAllOf (
    _result: Option[AnyType],
    _msg: Option[AnyType],
    _code: Option[AnyType],
    /* The name of the stream that could not be found.  */
    _stream: Option[String]
)
object NonExistingStreamErrorAllOf {
    def toStringBody(var_result: Object, var_msg: Object, var_code: Object, var_stream: Object) =
        s"""
        | {
        | "result":$var_result,"msg":$var_msg,"code":$var_code,"stream":$var_stream
        | }
        """.stripMargin
}
