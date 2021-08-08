
package org.openapitools.client.model


case class InvalidMessageError (
    _result: AnyType,
    _msg: AnyType,
    /* The raw content of the message.  */
    _rawContent: Option[String]
)
object InvalidMessageError {
    def toStringBody(var_result: Object, var_msg: Object, var_rawContent: Object) =
        s"""
        | {
        | "result":$var_result,"msg":$var_msg,"rawContent":$var_rawContent
        | }
        """.stripMargin
}
