
package org.openapitools.client.model


case class InvalidMessageErrorAllOf (
    _result: Option[AnyType],
    _msg: Option[AnyType],
    /* The raw content of the message.  */
    _rawContent: Option[String]
)
object InvalidMessageErrorAllOf {
    def toStringBody(var_result: Object, var_msg: Object, var_rawContent: Object) =
        s"""
        | {
        | "result":$var_result,"msg":$var_msg,"rawContent":$var_rawContent
        | }
        """.stripMargin
}
